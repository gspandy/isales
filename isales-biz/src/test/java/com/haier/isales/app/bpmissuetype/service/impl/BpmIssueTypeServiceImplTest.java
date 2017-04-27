/**
* @Company 青鸟软通   
* @Title: BpmIssueTypeServiceImplTest.java 
* @Package com.haier.isales.app.bpmissuetype.service.impl 
* @author Guo Yuchao   
* @date 2015-1-28 下午11:15:42 
* @version V1.0   
*/ 
package com.haier.isales.app.bpmissuetype.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.app.bpmissuetype.domain.BpmIssueTypeDomain;
import com.haier.isales.app.bpmissuetype.service.BpmIssueTypeService;

/** 
 * @ClassName: BpmIssueTypeServiceImplTest 
 * @Description: 
 *  
 */
@ContextConfiguration(locations={
		"classpath*:/spring/app/spring-bpmIssueType.xml"
})
public class BpmIssueTypeServiceImplTest extends BaseIsalesTestCase{
	
	@Resource
	private BpmIssueTypeService bpmIssueTypeService;
	@Test
	public void testBpmIssueTypeService() {
		BpmIssueTypeDomain bpmIssueTypeDomain = new BpmIssueTypeDomain();
		bpmIssueTypeDomain.setIssueTypeKey("105");
		bpmIssueTypeDomain.setHighClass("订单、货源及库存");
		bpmIssueTypeDomain.setSmallClass("货源保障");
		bpmIssueTypeDomain.setProLine("消毒柜");
		bpmIssueTypeDomain.setBuCode("WGG小");
		List<String> bpmIssueTypeList = bpmIssueTypeService.findBpmIssueType(bpmIssueTypeDomain);
		MatcherAssert.assertThat(bpmIssueTypeList, Matchers.notNullValue());
	}

}
