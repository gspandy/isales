package com.haier.isales.reminder.service.impl;

import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.haier.openplatform.showcase.security.service.impl.BaseTestCase;

/**
 * @author Cao RUi
 * 
 */
@ContextConfiguration(locations = {
		"classpath*:/spring_service/isales/spring-reminder-bpm-provider.xml",
		"classpath*:/spring/reminder/spring-*.xml"
		})
@Ignore
//@Transactional
public class BaseReminderBpmTestCase extends BaseTestCase {

}
