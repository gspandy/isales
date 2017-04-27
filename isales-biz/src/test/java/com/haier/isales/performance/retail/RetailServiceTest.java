/**
 * @Company 青鸟软通   
 * @Title: RetailServiceTest.java 
 * @Package com.haier.isales.performance.retail 
 * @author John.zhao   
 * @date 2014-12-23 上午9:35:32 
 * @version V1.0   
 */
package com.haier.isales.performance.retail;

import java.util.List;

import org.junit.Test;

import com.haier.isales.performance.BasePerformanceTestCase;
import com.haier.isales.performance.retail.dto.RetailDTO;
import com.haier.isales.performance.retail.dto.RetailStructureDTO;

/**
 * @ClassName: RetailServiceTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class RetailServiceTest extends BasePerformanceTestCase {
	@Test
	public void testGetOrgRetail() {
		RetailDTO dto = new RetailDTO();
//		dto.setShopId("8800007647");
//		dto.setYearMonth("201305");
		retailService.getOrgRetail(dto);
	}

	@Test
	public void testgetPersonRetail() {
		RetailDTO dto = new RetailDTO();
//		dto.setEmpCode("Z0169361");
//		dto.setShopId("8800007647");
//		dto.setProLineId("104");
//		dto.setOperatorId(1L);
//		dto.setYearMonth("201412");
		retailService.getPersonRetail(dto);
	}
	@Test
	public void testGetPersonActualRetailCharts(){
		RetailDTO dto = new RetailDTO();
//		dto.setEmpCode("Z0165229");
//		dto.setShopId("8800007647");
//		dto.setProLineId("106");
		dto.setOperatorId(1L);
		retailService.getPersonActualRetailCharts(dto);
	}
	//同步产业结构
	@Test
	public void testfindPerBtbRetailStructure() {
		RetailStructureDTO dto = new RetailStructureDTO();
//		dto.setMonths("2016-05");
//		dto.setShopId("8700001700");
//		dto.setProLineId("106");//冰箱
		List<RetailStructureDTO> retailStructureDTO = retailService.findShopBtbRetailStructure(dto);
		System.out.println("我的业绩-门店销量：" + retailStructureDTO.toString());
	}
	
	
	@Test
    public void testfindPerBtbRetail() {
        RetailDTO dto = new RetailDTO();
        dto.setYearMonth("2016-05");
        dto.setShopId("8800109980");
        dto.setProLineId("106");
        RetailDTO retailDTO = retailService.findShopBtbRetail(dto);
        System.out.println("我的业绩-门店销量：" + retailDTO.toString());
    }
}
