package com.haier.isales.moments.service.impl;

import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.test.BaseIsalesClientTestCase;

/**
 * @author Cao RUi
 * 
 */
@ContextConfiguration(locations = {
		"classpath*:/spring_service/moments/spring-*-provider.xml",
		"classpath*:/spring/moments/spring-*.xml",
		"classpath*:/spring/system/spring-labelGroup.xml",
		"classpath*:/spring/salerinfo/spring-personalShare.xml"
		})
@Ignore
//@Transactional
public class BaseMomentsTestCase extends BaseIsalesClientTestCase {

}
