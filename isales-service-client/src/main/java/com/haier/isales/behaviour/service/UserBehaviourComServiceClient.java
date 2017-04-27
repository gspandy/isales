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

import com.haier.isales.behaviour.dto.UserBehaviourComDTO;

/**
 * @ClassName: UserBehaviourServiceClient
 * @Description: 提供的用户行为全记录接口
 * 
 */
public interface UserBehaviourComServiceClient {

	/**
	 * @Description: 保存用户的行为全记录
	 * @author lizhenwei
	 * @date 2015-11-25 下午5:52:37
	 * @param userBehaviourComDTO
	 * @return
	 */
	@Export(paramNames = {"userBehaviourComDTO"})
	public Object saveUserBehaviourComLog(
			UserBehaviourComDTO userBehaviourComDTO);
	
	/**
	 * @Description: 更新应用退出时间
	 * @author lizhenwei
	 * @date 2015-11-25 下午6:07:37
	 * @param userBehaviourComDTO
	 * @return
	 */
	@Export(paramNames = {"userBehaviourComDTO"})
	public Object updateUserBehaviourComLog(
			UserBehaviourComDTO userBehaviourComDTO);

}
