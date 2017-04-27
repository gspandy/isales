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
		"classpath*:/spring/spring-transaction.xml",
//		"classpath*:/spring/system/spring-account.xml",
//		"classpath*:/spring/system/spring-system.xml",
		"classpath*:/spring/system/spring-*.xml",
		"classpath*:/spring/behaviour/spring-*.xml",
		"classpath*:/spring/retail/spring-*.xml",
		"classpath*:/spring/salerInfo/spring-*.xml",
		"classpath*:/spring/basicinfo/spring-*.xml",
		"classpath*:/spring_service/spring-monitorAOP.xml",
		"classpath*:/spring_service/spring-dubbo.xml",
//		"classpath*:/spring_service/system/spring-*-provider.xml",
//		"classpath*:/spring_service/retail/spring-*-provider.xml",
//		"classpath*:/spring_ws/**/spring-*.xml",
		"classpath*:/spring_service/behaviour/spring-*-provider.xml"
		})
//@Ignore
@Transactional
public class BaseTestCase extends BaseHopTestCase {

}
