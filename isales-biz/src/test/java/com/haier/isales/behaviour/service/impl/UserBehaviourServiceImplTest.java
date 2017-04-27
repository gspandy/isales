/**
* @Company 青鸟软通   
* @Title: LoginBehaviourServiceImplTest.java 
* @Package com.haier.isales.behaviour.service.impl 
* @author John Zhao   
* @date 2014-11-10 下午4:44:47 
* @version V1.0   
*/ 
package com.haier.isales.behaviour.service.impl;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.haier.isales.behaviour.userBehaviour.domain.UserBehaviourDomain;

/** 
 * @ClassName: LoginBehaviourServiceImplTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class UserBehaviourServiceImplTest extends BaseBehaviourTestCase{
	
	@Test
	@Rollback(false)
	public void testSaveUserBehaviourLog(){
		UserBehaviourDomain userBehaviourDomain = new UserBehaviourDomain();
		userBehaviourDomain.setLoginName("test");
		userBehaviourDomain.setUserIp("127.0.0.1");
		userBehaviourDomain.setClientInfo("1");
		this.userBehaviourService.saveUserBehaviourLog(userBehaviourDomain);
	}

}
