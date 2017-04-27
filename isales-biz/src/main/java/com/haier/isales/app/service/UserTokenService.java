/**
 * @Company 青鸟软通   
 * @Title: UserTokenService.java 
 * @Package  com.haier.isales.app.service
 * @author lizhenwei  
 * @date 2015年12月29日  14:05:50
 * @version V1.0   
 */
package com.haier.isales.app.service;

import com.haier.isales.app.dto.UserTokenDTO;

/** 
 * @ClassName: UserTokenService
 * @Description: UserToken的Service接口定义类
 *  
 */
public interface UserTokenService {

	/**
	 * 
	* @Title: findUserToken
	* @Description: 获取用户Token
	* @return  
	* @throws
	 */
	public UserTokenDTO findUserToken(String userCode);
	
	/**
	 * 根据userCode修改用户Token信息
	* @Title: updateUserToken
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param userTokenDTO
	* @throws
	 */
	public void updateUserToken(UserTokenDTO userTokenDTO);
	
	/**
	 * 根据userCode记录用户Token信息
	* @Title: saveUserToken
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param userTokenDTO
	* @throws
	 */
	public void saveUserToken(UserTokenDTO userTokenDTO);
	
}
