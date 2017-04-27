package com.haier.isales.salerinfo;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 * security模块测试基类
 * @author WangXuzheng
 * 
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring/spring-common.xml",
		"classpath*:/spring/spring-datasource.xml",
		"classpath*:/spring/spring-transaction.xml"})
public class BaseSalerInfoTestCase  extends AbstractTransactionalJUnit4SpringContextTests {


	
	
}
