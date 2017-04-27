package com.haier.isales.customer.service.impl;

import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.haier.openplatform.showcase.security.service.impl.BaseTestCase;

/**
 * @author Cao RUi
 * 
 */
@ContextConfiguration(locations = {
		"classpath*:/spring_service/isales/spring-customer-provider.xml",
		"classpath*:/spring_service/isales/spring-salerInfo-manage-provider.xml",
		"classpath*:/spring/customer/spring-*.xml",
		"classpath*:/spring/salerinfo/spring-*.xml",
		"classpath*:/spring/basicinfo/spring-shop.xml",
		"classpath*:/spring/score/spring-score.xml",
		"classpath*:/spring/retail/spring-*.xml",
		"classpath*:/spring_ws/zziyt/*/spring-*.xml"
		})
@Ignore
//@Transactional
public class BaseCustomerTestCase extends BaseTestCase {

}
