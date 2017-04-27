/**
* @Company 青鸟软通   
* @Title: BaseIsalesTestCase.java 
* @Package com.haier.isales 
* @author Liu Wenjie   
* @date 2014-11-15 下午3:47:27 
* @version V1.0   
*/ 
package com.haier.isales;

import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.transaction.annotation.Transactional;

/** 
 * @ClassName: BaseIsalesTestCase 
 * @Description: isales的基础业务类 
 *  
 */
@ContextConfiguration(locations={
		"classpath*:/spring/spring-common.xml",
		"classpath*:/spring/spring-datasource.xml",
		"classpath*:/spring/spring-transaction.xml"
})
@Ignore
@Transactional
public class BaseIsalesTestCase extends AbstractTransactionalJUnit4SpringContextTests {
	
}
