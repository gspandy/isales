/**
* @Company 青鸟软通   
* @Title: RetailClientImplTest.java 
* @Package com.haier.isales.salerinfo 
* @author Guo Yuchao   
* @date 2014-11-21 下午10:06:22 
* @version V1.0   
*/ 
package com.haier.isales.performance;


import java.util.List;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.common.DubboResult;
import com.haier.isales.performance.retail.dto.RetailChartDTO;
import com.haier.isales.performance.retail.dto.RetailDTO;
import com.haier.isales.performance.retail.dto.RetailStructureDTO;
import com.haier.isales.performance.retail.service.RetailSearchClient;
import com.haier.isales.test.BaseIsalesClientTestCase;

/** 
 * @ClassName: RetailClientImplTest 
 * @Description: 
 *  
 */
@ContextConfiguration(locations = {
		"classpath*:/spring/performance/spring-*.xml",
		"classpath*:/spring/retail/spring-*.xml",
		"classpath*:/spring_service/performance/spring-retail-search-provider.xml"
		})
public class RetailClientImplTest  extends BaseIsalesClientTestCase{
	@Resource
	private RetailSearchClient retailSearchClient;
	@Test
	public void testFindPerBtbRetail(){
		RetailDTO retailDTO = new RetailDTO();
		retailDTO.setYearMonth("2014/12/01 00:12:12");
		retailDTO.setProLineId("102");
		retailDTO.setOperatorId(33913L);
//		retailDTO.setShopId("8700021752");
		retailDTO.setEmpCode("Z0188786");
		DubboResult dubboResult = (DubboResult) retailSearchClient.findPerBtbRetail(retailDTO);
		RetailDTO retailInfo = dubboResult.getResultBean();
		MatcherAssert.assertThat(retailInfo, Matchers.notNullValue());
	}
	public void testFindPersonalRetailChart(){
		RetailDTO retailDTO = new RetailDTO();
		retailDTO.setYearMonth("2014/09/01 00:12:12");
		retailDTO.setProLineId("103");
		retailDTO.setOperatorId(13L);
//		retailDTO.setShopId("8700021752");
		retailDTO.setEmpCode("Z0012376");
		DubboResult dubboResult = (DubboResult) retailSearchClient.findPersonalRetailChart(retailDTO);
		RetailChartDTO retailChartInfo = dubboResult.getResultBean();
		MatcherAssert.assertThat(retailChartInfo, Matchers.notNullValue());
	}
	
	@Test
	public void testFindPerBtbRetailStructure(){
		RetailStructureDTO dto=new RetailStructureDTO();
		dto.setMonths("2016-05");
		dto.setProLineId("106");
		dto.setShopId("8700000811");
		DubboResult dubboResult =(DubboResult)retailSearchClient.findPerBtbRetailStructure(dto);
		System.out.println(dubboResult);
	}

}
