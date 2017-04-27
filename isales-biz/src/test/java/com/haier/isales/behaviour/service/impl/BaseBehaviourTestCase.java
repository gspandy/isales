/**
* @Company 青鸟软通   
* @Title: BaseBehaviourTestCase.java 
* @Package com.haier.isales.behaviour.service.impl 
* @author John Zhao   
* @date 2014-11-7 下午4:47:20 
* @version V1.0   
*/ 
package com.haier.isales.behaviour.service.impl;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.behaviour.login.service.LoginService;
import com.haier.isales.behaviour.userBehaviour.service.UserBehaviourService;
import com.haier.openplatform.showcase.BaseTestCase;

/** 
 * @ClassName: BaseBehaviourTestCase 
 * @Description: behaviour测试case 
 *  
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring/behaviour/spring-*.xml" })
public class BaseBehaviourTestCase extends BaseTestCase{	
	@Resource
	protected LoginService loginService;
	@Resource
	protected UserBehaviourService userBehaviourService;

}
