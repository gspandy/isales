/**
* @Company 青鸟软通   
* @Title: BaseRetailTestCase.java 
* @Package com.haier.isales.retail.reportsales 
* @author John Zhao   
* @date 2014-11-11 下午8:01:07 
* @version V1.0   
*/ 
package com.haier.isales.retail.reportsales;

import javax.annotation.Resource;
import org.springframework.test.context.ContextConfiguration;
import com.haier.isales.retail.reportsales.service.ReportsalesService;
import com.haier.openplatform.showcase.BaseTestCase;

/** 
 * @ClassName: BaseRetailTestCase 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring_ws/**/spring-reportSalesByModel.xml",
		"classpath*:/spring_ws/**/spring-reportSalesByBarCode.xml",
		"classpath*:/spring_ws/**/spring-BTBxlcxSelectImpl.xml",
		"classpath*:/spring/basicinfo/spring-*.xml",
		"classpath*:/spring/salerinfo/spring-*.xml", 
		"classpath*:/spring/score/spring-*.xml", 
		"classpath*:/spring/reminder/spring-*.xml",
		"classpath*:/spring/retail/spring-*.xml" })
public class BaseRetailTestCase extends BaseTestCase{
}
