package com.haier.isales.system.service.impl;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.common.DubboResult;
import com.haier.isales.system.service.AccountClient;
import com.haier.isales.test.BaseIsalesClientTestCase;


/**
 * @author Guo Yuchao
 *
 */
@ContextConfiguration(locations = {
		"classpath*:/hmc/hornetq/hmc-jms-hornetq.xml",
		"classpath*:/console/audit/console-audit.xml",
		"classpath*:/console/jms/console-jms-consumer.xml",
		"classpath*:/console/jms/console-jms-provider.xml",
		"classpath*:/spring/score/spring-*.xml",
		"classpath*:/spring/salerinfo/spring-*.xml",
		"classpath*:/spring/system/spring-*.xml",
		"classpath*:/spring_ws/portal/spring-systemInfo.xml",
		"classpath*:/spring_service/system/spring-account-provider.xml"
		})
public class AccountClientImplTest extends BaseIsalesClientTestCase{
	@Resource
	private AccountClient accountClient;
	
	@Test
	public void testCheckLoginByNamePwd() {
		DubboResult returnResult = (DubboResult)accountClient.checkLoginByNamePwd("A0003142", "aA111111","2.5");
		Long operatorId = returnResult.getResultBean();
		MatcherAssert.assertThat(operatorId,Matchers.nullValue());
	}
}
