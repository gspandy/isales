/**
 * @Company 青鸟软通   
 * @Title: UserBehaviourServiceClient.java 
 * @Package com.haier.isales.behaviour.service 
 * @author John Zhao   
 * @date 2014-11-10 下午6:23:25 
 * @version V1.0   
 */
package com.haier.isales.behaviour.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.behaviour.dto.UserBehaviourDTO;

/**
 * @ClassName: UserBehaviourServiceClient
 * @Description: 提供的用户行为记录接口
 * 
 */
public interface UserBehaviourServiceClient {

	/**
	 * @Description: 保存用户的行为记录
	 * @author John Zhao
	 * @date 2014-11-10 下午9:35:37
	 * @param userBehaviourDTO
	 * @return
	 */
	@Export(paramNames = {"userBehaviourDTO"})
	public Object saveUserBehaviourLog(
			UserBehaviourDTO userBehaviourDTO);

}
