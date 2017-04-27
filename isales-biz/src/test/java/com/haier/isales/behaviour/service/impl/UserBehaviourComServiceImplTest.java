/**
* @Company 青鸟软通   
* @Title: LoginBehaviourServiceImplTest.java 
* @Package com.haier.isales.behaviour.service.impl 
* @author John Zhao   
* @date 2014-11-10 下午4:44:47 
* @version V1.0   
*/ 
package com.haier.isales.behaviour.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.haier.isales.behaviour.userbehaviourcom.domain.UserBehaviourComDomain;
import com.haier.isales.behaviour.userbehaviourcom.service.UserBehaviourComService;

/** 
 * @ClassName: LoginBehaviourServiceImplTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class UserBehaviourComServiceImplTest extends BaseBehaviourTestCase{
    
    @Resource
    protected UserBehaviourComService userBehaviourComService;
	
	@Test
//	@Ignore
	@Rollback(false)
	public void testSaveUserBehaviourComLog(){
		UserBehaviourComDomain userBehaviourComDomain = new UserBehaviourComDomain();
		userBehaviourComDomain.setLoginName("test");
		userBehaviourComDomain.setUserId(Long.valueOf(99999));
		userBehaviourComDomain.setOperationId("我的首页");
		userBehaviourComDomain.setUserIp("127.0.0.1");
		userBehaviourComDomain.setUserDevice("102");
		userBehaviourComDomain.setClientInfo("1");
		userBehaviourComDomain.setOperateDate(new Date());
		this.userBehaviourComService.saveUserBehaviourComLog(userBehaviourComDomain);
	}
	
	@Test
	//@Ignore
	@Rollback(false)
	public void testUpdateUserBehaviourComLog(){
		UserBehaviourComDomain userBehaviourComDomain = new UserBehaviourComDomain();
		userBehaviourComDomain.setLoginName("test");
		userBehaviourComDomain.setStrOperateDate("2015-11-25 17:10:48");
		userBehaviourComDomain.setOperationId("我的首页");
		userBehaviourComDomain.setQuitTime(new Date());
		this.userBehaviourComService.updateUserBehaviourComLog(userBehaviourComDomain);
	}

}
