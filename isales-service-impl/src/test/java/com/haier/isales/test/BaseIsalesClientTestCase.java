package com.haier.isales.test;

import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Cao RUi
 * 
 */
@ContextConfiguration(locations = {
		"classpath*:/spring/spring-datasource.xml",
		"classpath*:/spring/spring-common.xml",
		"classpath*:/spring/spring-transaction.xml",
		"classpath*:/spring_service/spring-monitorAOP.xml",
		"classpath*:/spring_service/spring-dubbo.xml"
		})
@Ignore
@Transactional
public class BaseIsalesClientTestCase extends AbstractTransactionalJUnit4SpringContextTests {

}
