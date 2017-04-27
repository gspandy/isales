package com.haier.openplatform.showcase.security.service.impl;

import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.haier.openplatform.test.dbunit.BaseHopTestCase;

/**
 * @author WangXuzheng
 * 
 */
@ContextConfiguration(locations = {
		"classpath*:/spring/spring-datasource.xml",
		"classpath*:/spring/spring-common.xml",
		"classpath*:/spring/system/spring-system.xml",
		"classpath*:/spring/spring-transaction.xml",
		"classpath*:/spring_service/spring-dubbo.xml",
		"classpath*:/spring_service/spring-monitorAOP.xml",
		"classpath*:/spring_service/security/spring-user-provider.xml"})
@Ignore
@Transactional
public class BaseMonitorTestCase extends BaseHopTestCase {

}
