/**
* @Company 青鸟软通   
* @Title: LoginBehaviourClientImplTest.java 
* @Package com.haier.isales.behaviour.service.impl 
* @author John Zhao   
* @date 2014-11-8 上午10:13:57 
* @version V1.0   
*/ 
package com.haier.isales.behaviour.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;

import com.haier.isales.behaviour.dto.LoginBehaviourDTO;
import com.haier.isales.behaviour.service.LoginBehaviourServiceClient;
import com.haier.isales.common.DubboResult;
import com.haier.openplatform.showcase.security.service.impl.BaseTestCase;

/** 
 * @ClassName: LoginBehaviourClientImplTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * 
 */
public class LoginBehaviourClientImplTest extends BaseTestCase{
	@Resource
	private LoginBehaviourServiceClient loginBehaviourServiceClient;
	@Test
	public void testSaveLoginBehaviour(){
		LoginBehaviourDTO loginDomain = new LoginBehaviourDTO();
		loginDomain.setSessionId("1");
		loginDomain.setLoginName("test");
		loginDomain.setUserIp("127.0.0.1");
		loginDomain.setClientInfo("1");
		loginDomain.setClientMac("11");
		loginDomain.setClientType("aa");
		loginDomain.setClientVersion("1");
		loginDomain.setLoginTime(new Date());
		loginDomain.setLogoutTime(new Date());
		loginBehaviourServiceClient.saveLoginBehaviour(loginDomain);
	}
	@Test
	public void testUpdateLoginOutBehaviour(){
		LoginBehaviourDTO loginDomain = new LoginBehaviourDTO();
		loginDomain.setSessionId("3139de64-9aec-438f-b287-adf2f2d18321");
		loginDomain.setLogoutTime(new Date());
		loginDomain.setLogoutType(LoginBehaviourDTO.LOGOUTTYPE_ACTIVE);
		DubboResult dr = (DubboResult) loginBehaviourServiceClient.updateLoginOutBehaviour(loginDomain);
		System.out.println(dr.getErrorMessage());
	}
}
