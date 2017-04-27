package com.haier.openplatform.showcase.security.service.impl;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboStartUtil {

	/**
	 * 该单元测试用作本地启动dubbo服务，可debug dubbo服务
	 */
	@Test
	//@Ignore
	public void testStartDubbo(){
		ClassPathXmlApplicationContext providerContext = new ClassPathXmlApplicationContext(
				"classpath*:/hmc/hornetq/hmc-jms-hornetq.xml",
				"classpath*:/console/audit/console-audit.xml",
				"classpath*:/console/jms/console-jms-consumer.xml",
				"classpath*:/console/jms/console-jms-provider.xml",
				
				"classpath*:/spring/spring-common.xml",
				"classpath*:/spring/spring-external.xml",
				"classpath*:/spring/spring-datasource.xml",
				"classpath*:/spring/spring-transaction.xml",
				"classpath*:/spring/spring-quartz.xml",
				
//				"classpath*:/spring/system/monitor/spring-monitor.xml",
				"classpath*:/spring_ws/**/spring-*.xml",
				
				"classpath*:/spring/*/spring-*.xml",
				"classpath*:/spring/*/*/spring-*.xml",
				"classpath*:/spring_service/**/spring-*.xml");
		providerContext.start();
		while(true){}
	}
}
