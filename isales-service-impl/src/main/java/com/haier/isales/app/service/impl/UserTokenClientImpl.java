/**
* @Company 青鸟软通   
* @Title: UserTokenClientImpl.java 
* @Package com.haier.isales.app.service.impl 
* @author lizhenwei
* @date 2015-12-29 下午5:05:45 
* @version V1.0   
*/ 
package com.haier.isales.app.service.impl;

import org.apache.log4j.Logger;

import com.haier.isales.app.dto.UserTokenDTO;
import com.haier.isales.app.service.UserTokenClient;
import com.haier.isales.app.service.UserTokenService;

/** 
 * @ClassName: UserTokenClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class UserTokenClientImpl implements UserTokenClient{
	
	private static Logger logger = Logger.getLogger(UserTokenClientImpl.class);
	private UserTokenService userTokenService;
	
	/* 根据工号获取用户Token信息
	 * @see com.haier.isales.app.service.UserTokenClient#findUserToken(java.lang.String)
	 */
	@Override
	public Object findUserToken(String userCode) {
		logger.info("获取用户Token方法");
		UserTokenDTO userTokenDTO = userTokenService.findUserToken(userCode);
		return userTokenDTO;
	}

	/* 根据工号更新用户Token信息
	 * @see com.haier.isales.app.service.UserTokenClient#updateUserToken(com.haier.isales.app.dto.UserTokenDTO)
	 */
	@Override
	public Object updateUserToken(UserTokenDTO userTokenDTO) {
		logger.info("更新用户Token信息");
		userTokenService.updateUserToken(userTokenDTO);
		return null;
	}
	
	/* 根据工号记录用户Token信息
	 * @see com.haier.isales.app.service.UserTokenClient#saveUserToken(com.haier.isales.app.dto.UserTokenDTO)
	 */
	@Override
	public Object saveUserToken(UserTokenDTO userTokenDTO) {
		logger.info("记录用户Token信息");
		userTokenService.saveUserToken(userTokenDTO);
		return null;
	}

	/**
	 * @param userTokenService the userTokenService to set
	 */
	public void setUserTokenService(UserTokenService userTokenService) {
		this.userTokenService = userTokenService;
	}

}
