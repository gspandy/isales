/**
* @Company 青鸟软通   
* @Title: LoginBehaviourClientImplTest.java 
* @Package com.haier.isales.behaviour.service.impl 
* @author John Zhao   
* @date 2014-11-8 上午10:13:57 
* @version V1.0   
*/ 
package com.haier.isales.behaviour.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.NotTransactional;

import com.haier.isales.behaviour.dto.UserBehaviourDTO;
import com.haier.isales.behaviour.service.UserBehaviourServiceClient;
import com.haier.isales.common.DubboResult;
import com.haier.openplatform.showcase.security.service.impl.BaseTestCase;

/** 
 * @ClassName: LoginBehaviourClientImplTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class UserBehaviourClientImplTest extends BaseTestCase{
	@Resource
	private UserBehaviourServiceClient userBehaviourServiceClient;
	
	@Test
	@NotTransactional
	public void testSaveUserBehaviour(){
		UserBehaviourDTO userBehaviourDTO = new UserBehaviourDTO();
		userBehaviourDTO.setLoginName("test");
		userBehaviourDTO.setUserIp("127.0.0.1");
		userBehaviourDTO.setClientInfo("1");
		DubboResult dr = (DubboResult) userBehaviourServiceClient.saveUserBehaviourLog(userBehaviourDTO);
		System.out.println(dr.getResultBean());
	}
}
