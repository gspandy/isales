package com.haier.isales.retail.salestarget;

import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;

import com.haier.openplatform.showcase.security.service.impl.BaseTestCase;

/**
 * @author Cao RUi
 * 
 */
@ContextConfiguration(locations = {
		"classpath*:/spring_service/retail/spring-salestarget-provider.xml",
		"classpath*:/spring/retail/spring-salestarget.xml",
		"classpath*:/spring/system/spring-*.xml"
		})
@Ignore
//@Transactional
public class BaseSalestargetClientTestCase extends BaseTestCase {

}
