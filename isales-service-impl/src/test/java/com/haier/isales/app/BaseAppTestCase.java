package com.haier.isales.app;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.app.service.FeedbackServiceClient;
import com.haier.openplatform.showcase.security.service.impl.BaseTestCase;

/**
 * @author Cao RUi
 * 
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring_service/app/spring-*-provider.xml",
		"classpath*:/spring/app/spring-*.xml" })
@Ignore
// @Transactional
public class BaseAppTestCase extends BaseTestCase {
	@Resource
	protected FeedbackServiceClient feedbackUpdateClient;
}
