/**
 * @Company 青鸟软通   
 * @Title: UserTokenService.java 
 * @Package  com.haier.isales.app.service.impl
 * @author lizhenwei   
 * @date 2015年12月29日  14:20:47
 * @version V1.0   
 */
package com.haier.isales.app.service.impl;

import java.util.List;

import com.haier.isales.app.dao.UserTokenDAO;
import com.haier.isales.app.domain.UserTokenDomain;
import com.haier.isales.app.dto.UserTokenDTO;
import com.haier.isales.app.service.UserTokenService;
import com.haier.isales.common.ClonePojoUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: UserTokenService
 * @Description: UserToken的Service接口定义类
 *  
 */
public class UserTokenServiceImpl implements UserTokenService{

	private static final Logger LOG = LoggerFactory.getLogger(UserTokenServiceImpl.class);
	
	/** 
	* @Fields userTokenDao : UserTokenDao 工具依赖 
	*/
	private UserTokenDAO userTokenDao;
	
	/*===============业务方法=============*/

	/* 获取用户Token
	 * @see com.haier.isales.app.service.UserTokenService#findUserToken(com.haier.isales.app.dto.UserTokenDTO)
	 */
	@Override
	public UserTokenDTO findUserToken(String userCode) {
		LOG.info("进入获取用户Token方法， userCode = " + userCode);
		
		UserTokenDTO dto = new UserTokenDTO();
		
		UserTokenDTO queryDTO = new UserTokenDTO();
		
		queryDTO.setUserCode(userCode);
		
		List<UserTokenDomain> userTokenList = userTokenDao.findUserToken(queryDTO);
		
		if (userTokenList.size() > 0) {
			
			UserTokenDomain userToken = userTokenList.get(0);
			dto = ClonePojoUtil.copyClassFromTo(userToken, UserTokenDTO.class);
		}
		
		LOG.info("获取用户Token方法执行完成!");
		
		return dto;
	}

	/* 根据userCode更新用户Token信息
	 * @see com.haier.isales.app.service.UserTokenService#updateUserToken(com.haier.isales.app.dto.UserTokenDTO)
	 */
	@Override
	public void updateUserToken(UserTokenDTO userTokenDTO) {
		LOG.info("进入更新用户Token方法， userTokenDTO = " + userTokenDTO);
		
		UserTokenDomain userTokenDomain = new UserTokenDomain();
		userTokenDomain = ClonePojoUtil.copyClassFromTo(userTokenDTO, UserTokenDomain.class);
		
		userTokenDao.updateUserToken(userTokenDomain);
		
		LOG.info("更新用户Token方法执行完成!");
	}
	
	/* 根据userCode插入用户Token信息
	 * @see com.haier.isales.app.service.UserTokenService#saveUserToken(com.haier.isales.app.dto.UserTokenDTO)
	 */
	@Override
	public void saveUserToken(UserTokenDTO userTokenDTO) {
		LOG.info("进入记录用户Token方法， userTokenDTO = " + userTokenDTO);
		
		UserTokenDomain userTokenDomain = new UserTokenDomain();
		userTokenDomain = ClonePojoUtil.copyClassFromTo(userTokenDTO, UserTokenDomain.class);
		
		userTokenDao.save(userTokenDomain);
		
		LOG.info("记录用户Token方法执行完成!");
	}
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性userTokenDao 的set方法 
	 */
	public void setUserTokenDao(UserTokenDAO userTokenDao){
		this.userTokenDao = userTokenDao;
	}
	
}
