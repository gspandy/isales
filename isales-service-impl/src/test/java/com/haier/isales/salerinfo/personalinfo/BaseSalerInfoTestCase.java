package com.haier.isales.salerinfo.personalinfo;

import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.haier.openplatform.showcase.security.service.impl.BaseTestCase;

/**
 * @author Cao RUi
 * 
 */
@ContextConfiguration(locations = {
		"classpath*:/spring_service/isales/spring-salerInfo-manage-provider.xml",
		"classpath*:/spring/salerinfo/spring-*.xml",
		"classpath*:/spring/customer/spring-*.xml",
		"classpath*:/spring/score/spring-*.xml",
		"classpath*:/spring/basicinfo/spring-*.xml"
		})
@Ignore
@Transactional
public class BaseSalerInfoTestCase extends BaseTestCase {

}
