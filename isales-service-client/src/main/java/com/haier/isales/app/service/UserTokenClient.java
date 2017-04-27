/**
 * @Company 青鸟软通   
 * @Title: UserTokenClient.java 
 * @Package com.haier.isales.app.service 
 * @author lizhenwei
 * @date 2015-12-29 下午4:59:32 
 * @version V1.0   
 */
package com.haier.isales.app.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.app.dto.UserTokenDTO;

/**
 * @ClassName: UserTokenClient
 * @Description: 未读消息接口
 * 
 */
public interface UserTokenClient {

	/**
	 * 
	* @Title: findUserToken 
	* @Description: 获取用户Token信息
	* @return  
	* @throws
	 */
	@Export(paramNames = {"userCode"})
	public Object findUserToken(String userCode);

	/**
	 * 
	* @Title: updateUserToken 
	* @Description: 根据工号更新用户Token信息
	* @param 
	* @return  
	* @throws
	 */
	@Export(paramNames = { "userTokenDTO" })
	public Object updateUserToken(UserTokenDTO userTokenDTO);
	
	/**
	 * 
	* @Title: saveUserToken 
	* @Description: 根据工号记录用户Token信息
	* @param 
	* @return  
	* @throws
	 */
	@Export(paramNames = { "userTokenDTO" })
	public Object saveUserToken(UserTokenDTO userTokenDTO);
}
