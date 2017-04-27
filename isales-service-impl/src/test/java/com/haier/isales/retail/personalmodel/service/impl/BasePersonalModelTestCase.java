package com.haier.isales.retail.personalmodel.service.impl;

import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;

import com.haier.openplatform.showcase.security.service.impl.BaseTestCase;

/**
 * @author Cao RUi
 * 
 */
@ContextConfiguration(locations = {
		"classpath*:/spring_service/retail/spring-personalmodel-*-provider.xml",
		"classpath*:/spring/retail/spring-personalmodel.xml",
		"classpath*:/spring/salerinfo/spring-personalInfo.xml",
		"classpath*:/spring/basicinfo/spring-proModel.xml",
		"classpath*:/spring/system/spring-*.xml"
		})
@Ignore
//@Transactional
public class BasePersonalModelTestCase extends BaseTestCase {

}
