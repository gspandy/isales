/**
 * @Company 青鸟软通   
 * @Title: LoginService.java 
 * @Package  com.haier.isales.behaviour.login.service.impl
 * @author John Zhao   
 * @date 2014年11月07日  16:38:02
 * @version V1.0   
 */
package com.haier.isales.behaviour.login.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.bana.common.util.basic.MapRunable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.behaviour.login.dao.LoginDAO;
import com.haier.isales.behaviour.login.domain.LoginDomain;
import com.haier.isales.behaviour.login.service.LoginService;
import com.haier.isales.behaviour.userbehaviourcom.dao.UserBehaviourComByHandDAO;
import com.haier.isales.common.SpringApplicationContextHolder;
import com.haier.isales.common.StringUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;

/**
 * @ClassName: LoginService
 * @Description: Login的Service接口定义类
 * 
 */
public class LoginServiceImpl implements LoginService {

	// 创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。
	private ExecutorService pool = Executors.newCachedThreadPool();
	
	private static final Logger LOG = LoggerFactory.getLogger(LoginServiceImpl.class);
	/**
	 * @Fields loginDao : LoginDao 工具依赖
	 */
	private LoginDAO loginDao;
	
	private UserBehaviourComByHandDAO userBehaviourComByHandDAO;

	/* ===============业务方法============= */
	/**
	 * @Description: 保存登录/登出操作记录
	 * @author John Zhao
	 * @date 2014-11-7 下午4:41:35
	 * @param loginDomain
	 */
	@Override
	public void saveLoginBehaviourLog(LoginDomain loginDomain) {
	    String isByHang=userBehaviourComByHandDAO.isRecordingByHandbeHaveDao();
        if(isByHang!=null && "0".equals(isByHang)){//0代表自动采集信息，1代表手动曲线信息采集
    		LOG.info("传入的参数为：" + loginDomain);
    		if (loginDomain == null) {
    			throw new BusinessException(BusinessExceptionCode.param_error, "输入的参数为空");
    		}
    		String subBrowds = "";
    		String version = "未知的版本";
    		String browser = "未知的浏览器";
    		try {
    			if (loginDomain.getClientInfo() != null) {
    				boolean isIE = loginDomain.getClientInfo().contains("MSIE");
    				boolean isFirefox = loginDomain.getClientInfo().contains("Firefox");
    				boolean isChrome = loginDomain.getClientInfo().contains("Chrome");
    				boolean isSafari = loginDomain.getClientInfo().contains("Safari");
    				/**
    				 * 截取浏览器版本字符串，确认浏览器版本
    				 */
    				
    				if (isIE && (!StringUtil.isEmpty(loginDomain.getClientInfo()))) {
    					// browds.indexOf("MSIE", 10);
    					subBrowds = loginDomain.getClientInfo().substring(loginDomain.getClientInfo().indexOf("MSIE"),loginDomain.getClientInfo().indexOf("MSIE") + 10);
    					version = subBrowds.substring(4, 8);
    					browser = subBrowds.substring(2, 4);
    				} else if (isFirefox && (!StringUtil.isEmpty(loginDomain.getClientInfo()))) {
    					// browds.indexOf("Firefox", 12);
    					subBrowds = loginDomain.getClientInfo().substring(loginDomain.getClientInfo().indexOf("Firefox"));
    					version = subBrowds.substring(8);
    					browser = subBrowds.substring(0, 7);
    				} else if (isChrome	&& (!StringUtil.isEmpty(loginDomain.getClientInfo()))) {
    					// browds.indexOf("Chrome", 20);
    					subBrowds = loginDomain.getClientInfo().substring(loginDomain.getClientInfo().indexOf("Chrome"),loginDomain.getClientInfo().indexOf("Chrome") + 20);
    					version = subBrowds.substring(7);
    					browser = subBrowds.substring(0, 6);
    				} else if (isSafari	&& (!StringUtil.isEmpty(loginDomain.getClientInfo()))) {
    					// 判断是否是safari
    					subBrowds = loginDomain.getClientInfo().substring(loginDomain.getClientInfo().indexOf("Version"),loginDomain.getClientInfo().indexOf("Safari") + 6);
    					version = subBrowds.substring(8, 14);
    					browser = subBrowds.substring(14);
    				}
    			}
    		} catch (Exception e) {
    			LOG.info(e.getMessage());
    		}
    		loginDomain.setClientType(browser);
    		loginDomain.setClientVersion(version);
    		// ================另起线程，保存用户登录动作==start=========================//
    		Map<String, Object> map = new HashMap<String, Object>();
    		map.put("loginDomain", loginDomain);
    		pool.execute(new MapRunable(map) {
    			@Override
    			public void run() {
    				LoginDomain loginDomain = (LoginDomain) map.get("loginDomain");
    				loginDao = SpringApplicationContextHolder.getBean("loginDao");
    				loginDao.save(loginDomain);
    				LOG.info("更新用户在线结束!");
    			}
    		});
		// ================另起线程，保存用户登录动作==end=========================//
//		loginDao.save(loginDomain);
        }
	}

	/**
	 * <p>
	 * Description:
	 * 通过sessionId查询该用户的登录信息,再在点击退出的时候把与退出相关的信息(退出时间，在线时长，退出状态)更新到该条数据上
	 * </p>
	 * 
	 * @author John Zhao
	 * @date 2014-11-8 下午4:17:27
	 * @param loginDomain
	 * @see com.haier.isales.behaviour.login.service.LoginService#updateLoginOutBehaviourLog(com.haier.isales.behaviour.login.domain.LoginDomain)
	 */
	@Override
	public void updateLoginOutBehaviourLog(LoginDomain loginDomain) {
		if (loginDomain == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "输入的参数为空");
		}
		// 通过sessionId查询登录时候的数据
		LoginDomain loginLog = loginDao.findBySessionId(loginDomain.getSessionId());
		if (loginLog == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "根据条件查询的结果为空");
		}
		// 计算在线时长
		loginDomain.setOnlineTime(loginDomain.getLogoutTime().getTime() - loginLog.getLoginTime().getTime());
		Integer no = loginDao.updateLoginOut(loginDomain);
		if (no != 1) {
			throw new BusinessException(BusinessExceptionCode.database_none_data, "没有找到要更新的数据");
		}
	}

	/**
	 * <p>
	 * Description:通过Id查询
	 * </p>
	 * 
	 * @author John Zhao
	 * @date 2014-11-7 下午6:04:58
	 * @param id
	 * @return
	 * @see com.haier.isales.behaviour.login.service.LoginService#findById(long)
	 */
	@Override
	public LoginDomain findById(Long id) {
		return loginDao.findById(id);
	}

	/* ====================getter and setter ================= */

	/**
	 * @Description: 属性loginDao 的set方法
	 */
	public void setLoginDao(LoginDAO loginDao) {
		this.loginDao = loginDao;
	}

    public void setUserBehaviourComByHandDAO(
            UserBehaviourComByHandDAO userBehaviourComByHandDAO) {
        this.userBehaviourComByHandDAO = userBehaviourComByHandDAO;
    }

}
