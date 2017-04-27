/**
 * @Company 青鸟软通   
 * @Title: UserBehaviourServiceClientImpl.java 
 * @Package com.haier.isales.behaviour.service.impl 
 * @author John Zhao   
 * @date 2014-11-10 下午6:26:07 
 * @version V1.0   
 */
package com.haier.isales.behaviour.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;

import com.haier.isales.behaviour.dto.UserBehaviourComDTO;
import com.haier.isales.behaviour.service.UserBehaviourComServiceClient;
import com.haier.isales.behaviour.userbehaviourcom.domain.UserBehaviourComDomain;
import com.haier.isales.behaviour.userbehaviourcom.service.UserBehaviourComService;
import com.haier.isales.common.DomainDtoUtil;
import com.haier.isales.common.DubboResult;

/**
 * @ClassName: UserBehaviourComServiceClientImpl
 * @Description: 用户行为记录
 * 
 */
public class UserBehaviourComServiceClientImpl implements
		UserBehaviourComServiceClient {
	
	private static Logger logger = Logger.getLogger(UserBehaviourComServiceClientImpl.class);
	
	private UserBehaviourComService userBehaviourComService;
	
	/**
	* <p>Description: 记录用户行为全纪录，表中增加应用退出时间 </p> 
	* @author lizhenwei   
	* @date 2015-11-25 下午6:04:53 
	* @param userBehaviourComDTO 
	 * @return 
	* @see com.haier.isales.behaviour.service.UserBehaviourComServiceClient#saveUserBehaviourComLog(com.haier.isales.behaviour.dto.UserBehaviourComDTO) 
	*/ 
	@Override
	public DubboResult saveUserBehaviourComLog(UserBehaviourComDTO userBehaviourComDTO) {
		
		logger.info("传入参数为:" + userBehaviourComDTO);
		
		UserBehaviourComDomain userBehaviourComDomain = DomainDtoUtil.cloneUserBehaviourComDTO2UserBehaviourComDomain(userBehaviourComDTO);
		
		// 处理userBehaviourComDTO与userBehaviourComDomain中类型不相符的属性
		if (userBehaviourComDTO.getStrUserId() != null) {
			userBehaviourComDomain.setUserId(Long.valueOf(userBehaviourComDTO.getStrUserId()));
		}
		
		if (userBehaviourComDTO.getStrCallTime() != null) {
			userBehaviourComDomain.setCallTime(Long.valueOf(userBehaviourComDTO.getStrCallTime()));
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			if (userBehaviourComDTO.getStrOperateDate() != null) {
				userBehaviourComDomain.setOperateDate(sdf.parse(userBehaviourComDTO.getStrOperateDate()));
			}
			
		} catch (ParseException e) {
			logger.error("时间转化失败！");
		}
		
		userBehaviourComService.saveUserBehaviourComLog(userBehaviourComDomain);
		return null;
	}
	
	/**
	* <p>Description:更新用户应用退出时间 </p> 
	* @author lizhenwei   
	* @date 2015-11-25 下午6:07:53 
	* @param userBehaviourComDTO 
	 * @return 
	* @see com.haier.isales.behaviour.service.UserBehaviourComServiceClient#saveUserBehaviourComLog(com.haier.isales.behaviour.dto.UserBehaviourComDTO) 
	*/ 
	@Override
	public Object updateUserBehaviourComLog(
			UserBehaviourComDTO userBehaviourComDTO) {
		
		logger.info("传入参数为:" + userBehaviourComDTO);
		
		UserBehaviourComDomain userBehaviourComDomain = DomainDtoUtil.cloneUserBehaviourComDTO2UserBehaviourComDomain(userBehaviourComDTO);
		
		// 处理userBehaviourComDTO与userBehaviourComDomain中类型不相符的属性
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			if (userBehaviourComDTO.getStrOperateDate() != null) {
				userBehaviourComDomain.setOperateDate(sdf.parse(userBehaviourComDTO.getStrOperateDate()));
			}
			
			if (userBehaviourComDTO.getStrQuitTime() != null) {
				userBehaviourComDomain.setQuitTime(sdf.parse(userBehaviourComDTO.getStrQuitTime()));
			}
			
		} catch (ParseException e) {
			logger.error("时间转化失败！");
		}
		
		userBehaviourComService.updateUserBehaviourComLog(userBehaviourComDomain);
		
		return null;
	}

	/**
	 * @Description: 属性 userBehaviourComService 的set方法 
	 * @param userBehaviourComService 
	 */
	public void setUserBehaviourComService(
			UserBehaviourComService userBehaviourComService) {
		this.userBehaviourComService = userBehaviourComService;
	}

}
