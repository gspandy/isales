/**
* @Company 青鸟软通   
* @Title: RetailServiceTestCase.java 
* @Package com.haier.isales.performance 
* @author Guo Yuchao   
* @date 2014-12-18 下午2:07:31 
* @version V1.0   
*/ 
package com.haier.isales.performance;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.performance.retail.dto.RetailChartDTO;
import com.haier.isales.performance.retail.dto.RetailDTO;
import com.haier.isales.performance.retail.service.RetailService;

/** 
 * @ClassName: RetailServiceTestCase 
 * @Description: 业绩销量 相关
 *  
 */
@ContextConfiguration(locations={
		
		"classpath*:/spring/performance/spring-retail.xml",
		"classpath*:/spring/retail/spring-salestarget.xml"
})
public class RetailServiceTestCase extends BaseIsalesTestCase {
	@Resource
	private RetailService retailService;
	@Test
	public void testFindPerBtbRetail(){
		RetailDTO retailDTO = new RetailDTO();
		retailDTO.setYearMonth("2014-12");
		retailDTO.setProLineId("102");
		retailDTO.setOperatorId(33913L);
//		retailDTO.setShopId("8700021752");
		retailDTO.setEmpCode("Z0188786");
		RetailDTO retailInfo = retailService.findPerBtbRetail(retailDTO);
		MatcherAssert.assertThat(retailInfo, Matchers.notNullValue());
	}
	@Test
	public void testFindPersonalRetailChart(){
		RetailDTO retailDTO = new RetailDTO();
		retailDTO.setYearMonth("2014/09/01 00:12:12");
		retailDTO.setProLineId("103");
		retailDTO.setOperatorId(13L);
//		retailDTO.setShopId("8700021752");
		retailDTO.setEmpCode("Z0012376");
		RetailChartDTO retailChart = retailService.findPersonalRetailChart(retailDTO);
		MatcherAssert.assertThat(retailChart, Matchers.notNullValue());
	}
}
