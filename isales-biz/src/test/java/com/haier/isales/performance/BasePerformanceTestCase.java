/**
* @Company 青鸟软通   
* @Title: BaseQuotientTestCase.java 
* @Package com.haier.isales.performance.quotient 
* @author John.zhao   
* @date 2014-12-18 下午7:35:08 
* @version V1.0   
*/ 
package com.haier.isales.performance;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.performance.quotient.service.QuotientService;
import com.haier.isales.performance.retail.service.RetailService;
import com.haier.openplatform.showcase.BaseTestCase;

/** 
 * @ClassName: BaseQuotientTestCase 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
@ContextConfiguration(locations = { 
"classpath*:/spring/performance/spring-*.xml",
"classpath*:/spring/behaviour/spring-behaviourCommon.xml",
"classpath*:/spring/retail/spring-*.xml"
})
public class BasePerformanceTestCase extends BaseTestCase{
	@Resource
	protected QuotientService quotientService;
	@Resource
	protected RetailService retailService;

}
