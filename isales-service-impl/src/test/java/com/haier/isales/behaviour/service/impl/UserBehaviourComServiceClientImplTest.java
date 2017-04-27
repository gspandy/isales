/**
* @Company 青鸟软通   
* @Title: LoginBehaviourClientImplTest.java 
* @Package com.haier.isales.behaviour.service.impl 
* @author John Zhao   
* @date 2014-11-8 上午10:13:57 
* @version V1.0   
*/ 
package com.haier.isales.behaviour.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.haier.isales.behaviour.dto.UserBehaviourComDTO;
import com.haier.isales.behaviour.service.UserBehaviourComServiceClient;
import com.haier.isales.common.DubboResult;
import com.haier.openplatform.showcase.security.service.impl.BaseTestCase;

/** 
 * @ClassName: LoginBehaviourClientImplTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class UserBehaviourComServiceClientImplTest extends BaseTestCase{
    
    private static Logger logger = Logger.getLogger(UserBehaviourComServiceClientImplTest.class);
	@Resource
	private UserBehaviourComServiceClient userBehaviourComServiceClient;
	
	@Test
	@Rollback(false)
	public void testSaveUserBehaviour() throws ParseException{
	    UserBehaviourComDTO userBehaviourComDTO = new UserBehaviourComDTO();
//	       陈竹珺
	    userBehaviourComDTO.setLoginName("陈竹珺");
	    userBehaviourComDTO.setOperateDate(new Date());
	    userBehaviourComDTO.setOperationId("交互");
	    logger.info("--------------------------------------------------------------------------------------");
		DubboResult dr = (DubboResult) userBehaviourComServiceClient.saveUserBehaviourComLog(userBehaviourComDTO);
//		logger.info(dr.getResultBean().toString());
	}
}
