/**
 * @Company 青鸟软通   
 * @Title: UserBehaviourComService.java 
 * @Package  com.haier.isales.behaviour.userbehaviourcom.service.impl
 * @author lizhenwei   
 * @date 2015年11月25日  14:00:20
 * @version V1.0   
 */
package com.haier.isales.behaviour.userbehaviourcom.service.impl;


import java.util.Date;

import com.haier.isales.behaviour.userbehaviourcom.dao.UserBehaviourComByHandDAO;
import com.haier.isales.behaviour.userbehaviourcom.dao.UserBehaviourComDAO;
import com.haier.isales.behaviour.userbehaviourcom.domain.UserBehaviourComDomain;
import com.haier.isales.behaviour.userbehaviourcom.service.UserBehaviourComService;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: UserBehaviourComService
 * @Description: UserBehaviourCom的Service接口定义类
 *  
 */
public class UserBehaviourComServiceImpl implements UserBehaviourComService{

	private static final Logger LOG = LoggerFactory.getLogger(UserBehaviourComServiceImpl.class);
	
	/** 
	* @Fields userBehaviourComDao : UserBehaviourComDao 工具依赖 
	*/
	private UserBehaviourComDAO userBehaviourComDao;
	
	private UserBehaviourComByHandDAO userBehaviourComByHandDAO;
	
	
	/*===============业务方法=============*/
	
	/**
	* <p>Description: 保存用户行为记录</p> 
	* @author lizhenwei   
	* @date 2015-11-25 下午2:06:48 
	* @param userBehaviourComDomain 
	* @see com.haier.isales.behaviour.userbehaviourcom.service.UserBehaviourComService#saveUserBehaviourLog(com.haier.isales.behaviour.userBehaviour.domain.UserBehaviourDomain) 
	*/ 
	@Override
	public void saveUserBehaviourComLog(UserBehaviourComDomain userBehaviourDomain) {
//	    String isByHang=userBehaviourComByHandDAO.isRecordingByHandbeHaveDao();
//        if(isByHang!=null && "0".equals(isByHang)){//0代表自动采集信息，1代表手动曲线信息采集
    		LOG.info("传入的参数为："+userBehaviourDomain);
    		if(userBehaviourDomain == null){
    			throw new BusinessException(BusinessExceptionCode.param_error, "输入的参数为空");
    		}
    		
    		//userBehaviourDomain.setOperateDate(new Date());
    		userBehaviourComDao.save(userBehaviourDomain);
//        }
	}
	
	/**
	* <p>Description: 更新应用退出时间 </p> 
	* @author lizhenwei   
	* @date 2015-11-25 下午2:06:48 
	* @param userBehaviourComDomain 
	* @see com.haier.isales.behaviour.userbehaviourcom.service.UserBehaviourComService#saveUserBehaviourLog(com.haier.isales.behaviour.userBehaviour.domain.UserBehaviourDomain) 
	*/ 
	@Override
	public void updateUserBehaviourComLog(UserBehaviourComDomain userBehaviourComDomain) {
	    String isByHang=userBehaviourComByHandDAO.isRecordingByHandbeHaveDao();
	    if(isByHang!=null && "0".equals(isByHang)){//0代表自动采集信息，1代表手动曲线信息采集
        	LOG.info("传入的参数为："+ userBehaviourComDomain);
        	if(userBehaviourComDomain == null){
        		throw new BusinessException(BusinessExceptionCode.param_error, "输入的参数为空");
        	}
        	// 首先通过查询条件查询id
        	Long userId = userBehaviourComDao.findIdByConditions(userBehaviourComDomain);
        	if (null == userId) {
        		LOG.error("userId==null");
        		//throw new BusinessException(BusinessExceptionCode.param_error, "获取用户ID为空");
        	} else {
        		userBehaviourComDomain.setId(userId);
        		//userBehaviourComDomain.setOperateDate(new Date());
        		if (userBehaviourComDomain.getQuitTime() == null) {
                    userBehaviourComDomain.setQuitTime(new Date());
                }
        		userBehaviourComDao.updateUserComQuitTime(userBehaviourComDomain);
        	}
	    }
		
	}
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性userBehaviourComDao 的set方法 
	 */
	public void setUserBehaviourComDao(UserBehaviourComDAO userBehaviourComDao){
		this.userBehaviourComDao = userBehaviourComDao;
	}
	
	public void setUserBehaviourComByHandDAO(UserBehaviourComByHandDAO userBehaviourComByHandDAO) {
        this.userBehaviourComByHandDAO = userBehaviourComByHandDAO;
    }
	
	
}
