/**
* @Company 青鸟软通   
* @Title: LoginBehaviourServiceImplTest.java 
* @Package com.haier.isales.behaviour.service.impl 
* @author John Zhao   
* @date 2014-11-7 下午4:44:47 
* @version V1.0   
*/ 
package com.haier.isales.behaviour.service.impl;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.haier.isales.behaviour.login.domain.LoginDomain;

/** 
 * @ClassName: LoginBehaviourServiceImplTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class LoginBehaviourServiceImplTest extends BaseBehaviourTestCase{
	
	private Long domainId;
//	
//	@Before
//	public void test(){
//		LoginDomain loginDomain = new LoginDomain();
//		loginDomain.setLoginName("test");
//		loginDomain.setUserIp("127.0.0.1");
//		loginDomain.setClientInfo("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; SV1)	");
//		loginDomain.setClientMac("11");
//		loginDomain.setClientType("aa");
//		loginDomain.setClientVersion("1");
//		loginDomain.setLoginTime(new Date());
//		loginDomain.setLogoutTime(new Date());
//		loginDomain.setSessionId("-1");
//		loginService.saveLoginBehaviourLog(loginDomain);
//		domainId = loginDomain.getId();
//		Assert.assertNotNull(loginDomain.getId());
//	}
	
	@Test
	@Rollback(false)
	public void testSaveLoginBehaviourLog(){
		LoginDomain loginDomain = new LoginDomain();
		loginDomain.setLoginName("test");
		loginDomain.setUserIp("127.0.0.1");
		loginDomain.setClientInfo("Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; SV1)	");
		loginDomain.setClientMac("11");
		loginDomain.setClientType("aa");
		loginDomain.setClientVersion("1");
		loginDomain.setLoginTime(new Date());
		loginDomain.setLogoutTime(new Date());
		loginDomain.setSessionId("11112222");
		loginService.saveLoginBehaviourLog(loginDomain);
		domainId = loginDomain.getId();
//		Assert.assertNotNull(loginDomain.getId());
//		LoginDomain loginDomain2 = loginService.findById(2L);
//		Assert.assertNotNull(loginDomain2);
	}
	@Test
	public void testUpdateLoginOutBehaviourLog(){
		LoginDomain loginDomain = new LoginDomain();
		loginDomain.setSessionId("-1");
		loginDomain.setLogoutTime(new Date());
		loginDomain.setLogoutType("101");
		loginService.updateLoginOutBehaviourLog(loginDomain);
	}

}
