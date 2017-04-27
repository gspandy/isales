/**
 * @Company 青鸟软通   
 * @Title: UserBehaviourServiceClientImpl.java 
 * @Package com.haier.isales.behaviour.service.impl 
 * @author John Zhao   
 * @date 2014-11-10 下午6:26:07 
 * @version V1.0   
 */
package com.haier.isales.behaviour.service.impl;

import org.apache.log4j.Logger;

import com.haier.isales.behaviour.dto.UserBehaviourDTO;
import com.haier.isales.behaviour.service.UserBehaviourServiceClient;
import com.haier.isales.behaviour.userBehaviour.domain.UserBehaviourDomain;
import com.haier.isales.behaviour.userBehaviour.service.UserBehaviourService;
import com.haier.isales.common.DomainDtoUtil;
import com.haier.isales.common.DubboResult;

/**
 * @ClassName: UserBehaviourServiceClientImpl
 * @Description: 用户行为记录
 * 
 */
public class UserBehaviourServiceClientImpl implements
		UserBehaviourServiceClient {
	private static Logger logger = Logger.getLogger(UserBehaviourServiceClientImpl.class);
	private UserBehaviourService userBehaviourService;
	
	/**
	* <p>Description: </p> 
	* @author John Zhao   
	* @date 2014-11-10 下午6:26:53 
	* @param userBehaviourDTO 
	 * @return 
	* @see com.haier.isales.behaviour.service.UserBehaviourServiceClient#saveUserBehaviourLog(com.haier.isales.behaviour.dto.UserBehaviourDTO) 
	*/ 
	@Override
	public DubboResult saveUserBehaviourLog(UserBehaviourDTO userBehaviourDTO) {
		logger.info("传入参数为:"+userBehaviourDTO);
		UserBehaviourDomain userBehaviourDomain = DomainDtoUtil.cloneUserBehaviourDTO2UserBehaviourDomain(userBehaviourDTO);
		userBehaviourService.saveUserBehaviourLog(userBehaviourDomain);
		return null;
	}

	/**
	 * @Description: 属性 userBehaviourService 的set方法 
	 * @param userBehaviourService 
	 */
	public void setUserBehaviourService(UserBehaviourService userBehaviourService) {
		this.userBehaviourService = userBehaviourService;
	}

}
