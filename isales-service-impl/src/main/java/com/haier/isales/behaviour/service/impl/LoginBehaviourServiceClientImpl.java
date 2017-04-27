/**
 * @Company 青鸟软通   
 * @Title: LoginBehaviourServiceClientImpl.java 
 * @Package com.haier.isales.behaviour.service.impl 
 * @author John Zhao   
 * @date 2014-11-8 上午9:55:02 
 * @version V1.0   
 */
package com.haier.isales.behaviour.service.impl;

import org.apache.log4j.Logger;

import com.haier.isales.behaviour.dto.LoginBehaviourDTO;
import com.haier.isales.behaviour.login.domain.LoginDomain;
import com.haier.isales.behaviour.login.service.LoginService;
import com.haier.isales.behaviour.service.LoginBehaviourServiceClient;
import com.haier.isales.common.DomainDtoUtil;
import com.haier.isales.common.DubboResult;

/**
 * @ClassName: LoginBehaviourServiceClientImpl
 * @Description: 用户登录/登出行为
 * 
 */
public class LoginBehaviourServiceClientImpl implements LoginBehaviourServiceClient {
	private static Logger logger = Logger.getLogger(LoginBehaviourServiceClientImpl.class);
	private LoginService loginService;

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John Zhao
	 * @date 2014-11-8 上午9:55:02
	 * @param loginBehaviourDTO
	 * @return
	 */
	@Override
	public DubboResult saveLoginBehaviour(LoginBehaviourDTO loginBehaviourDTO) {
		logger.info("传人参数为：" + loginBehaviourDTO);
		LoginDomain loginDomain = DomainDtoUtil.cloneLoginBehaviourDTO2LoginDomain(loginBehaviourDTO);
		loginService.saveLoginBehaviourLog(loginDomain);
		return null;
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John Zhao
	 * @date 2014-11-10 上午9:40:54
	 * @param loginBehaviourDTO
	 * @see com.haier.isales.behaviour.service.LoginBehaviourServiceClient#updateLoginOutBehaviour(com.haier.isales.behaviour.dto.LoginBehaviourDTO)
	 */
	@Override
	public DubboResult updateLoginOutBehaviour(LoginBehaviourDTO loginBehaviourDTO) {
		logger.info("传入参数为：" + loginBehaviourDTO);
		LoginDomain loginDomain = DomainDtoUtil.cloneLoginBehaviourDTO2LoginDomain(loginBehaviourDTO);
		loginService.updateLoginOutBehaviourLog(loginDomain);
		return null;
	}

	/**
	 * @Description: 属性 loginService 的set方法
	 * @param loginService
	 */
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
}
