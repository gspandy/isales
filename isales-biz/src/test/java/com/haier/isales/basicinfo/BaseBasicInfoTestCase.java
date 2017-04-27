/**
* @Company 青鸟软通   
* @Title: BaseRetailTestCase.java 
* @Package com.haier.isales.retail.reportsales 
* @author John Zhao   
* @date 2014-11-11 下午8:01:07 
* @version V1.0   
*/ 
package com.haier.isales.basicinfo;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.haier.isales.basicinfo.promodel.service.ProModelService;
import com.haier.isales.basicinfo.shop.service.ShopService;

/** 
 * @ClassName: BaseRetailTestCase 
 * @Description: 基础信息测试
 *  
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring/spring-common.xml",
		"classpath*:/spring/spring-datasource.xml",
		"classpath*:/spring/spring-transaction.xml",
		"classpath*:/spring/basicinfo/spring-*.xml" })
public class BaseBasicInfoTestCase extends AbstractTransactionalJUnit4SpringContextTests{
	@Resource
	protected ProModelService proModelService;
	@Resource
	protected ShopService shopService;
}
