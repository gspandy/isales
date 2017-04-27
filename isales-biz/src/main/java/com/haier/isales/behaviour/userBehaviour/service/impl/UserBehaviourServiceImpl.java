/**
 * @Company 青鸟软通   
 * @Title: UserBehaviourService.java 
 * @Package  com.haier.isales.behaviour.userBehaviour.service.impl
 * @author John Zhao   
 * @date 2014年11月10日  18:12:14
 * @version V1.0   
 */
package com.haier.isales.behaviour.userBehaviour.service.impl;


import java.util.Date;

import com.haier.isales.behaviour.userBehaviour.dao.UserBehaviourDAO;
import com.haier.isales.behaviour.userBehaviour.domain.UserBehaviourDomain;
import com.haier.isales.behaviour.userBehaviour.service.UserBehaviourService;
import com.haier.isales.behaviour.userbehaviourcom.dao.UserBehaviourComByHandDAO;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: UserBehaviourService
 * @Description: UserBehaviour的Service接口定义类
 *  
 */
public class UserBehaviourServiceImpl implements UserBehaviourService{

	private static final Logger LOG = LoggerFactory.getLogger(UserBehaviourServiceImpl.class);
	
	/** 
	* @Fields userBehaviourDao : UserBehaviourDao 工具依赖 
	*/
	private UserBehaviourDAO userBehaviourDao;
	
	private UserBehaviourComByHandDAO userBehaviourComByHandDAO;
	
	
	/*===============业务方法=============*/
	
	/**
	* <p>Description: 保存用户行为记录</p> 
	* @author John Zhao   
	* @date 2014-11-10 下午6:14:48 
	* @param userBehaviourDomain 
	* @see com.haier.isales.behaviour.userBehaviour.service.UserBehaviourService#saveUserBehaviourLog(com.haier.isales.behaviour.userBehaviour.domain.UserBehaviourDomain) 
	*/ 
	@Override
	public void saveUserBehaviourLog(UserBehaviourDomain userBehaviourDomain) {
	    String isByHang=userBehaviourComByHandDAO.isRecordingByHandbeHaveDao();
        if(isByHang!=null && "0".equals(isByHang)){//0代表自动采集信息，1代表手动曲线信息采集
    		LOG.info("传入的参数为："+userBehaviourDomain);
    		if(userBehaviourDomain == null){
    			throw new BusinessException(BusinessExceptionCode.param_error, "输入的参数为空");
    		}
    		userBehaviourDomain.setOperateDate(new Date());
    		userBehaviourDao.save(userBehaviourDomain);
        }
	}
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性userBehaviourDao 的set方法 
	 */
	public void setUserBehaviourDao(UserBehaviourDAO userBehaviourDao){
		this.userBehaviourDao = userBehaviourDao;
	}

    public void setUserBehaviourComByHandDAO(
            UserBehaviourComByHandDAO userBehaviourComByHandDAO) {
        this.userBehaviourComByHandDAO = userBehaviourComByHandDAO;
    }
	
	
}
