/**
 * @Company 青鸟软通   
 * @Title: ReportSalesServiceTest.java 
 * @Package com.haier.isales.retail.reportsales 
 * @author John Zhao   
 * @date 2014-11-11 下午8:00:06 
 * @version V1.0   
 */
package com.haier.isales.retail.salestarget;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import com.haier.isales.retail.salestarget.domain.SalestargetDomain;
import com.haier.isales.retail.salestarget.dto.SalestargetDto;
import com.haier.isales.retail.salestarget.dto.SalestargetQueryDto;

/**
 * @ClassName: ReportSalesServiceTest
 * @Description:
 * 
 */
@Transactional
public class SalestargetServiceTest extends BaseSalestargetTestCase {

	@Test
//	@NotTransactional
	public void testGetSalestarget() {

		SalestargetQueryDto queryDto = new SalestargetQueryDto();
		queryDto.setOperatorId(1L);
		queryDto.setProductLine("104");
		queryDto.setYear(2014);
		queryDto.setMonth(12);

		SalestargetDto result = salestargetService.getSalestarget(queryDto);
		MatcherAssert.assertThat(result, Matchers.notNullValue());
		
//		System.out.println(result);
	}

	@Test
//	@NotTransactional
	public void testGetSalestargetList() {

		SalestargetQueryDto queryDto = new SalestargetQueryDto();
//		queryDto.setOperatorId(1L);
//		queryDto.setProductLine("104");
//		List<SalestargetDomain> salestargetList = salestargetService.getSalestargetList(queryDto);
//		MatcherAssert.assertThat(salestargetList, Matchers.notNullValue());
//		System.out.println("==================================================================================================");
//		for(SalestargetDomain domain:salestargetList){
//			System.out.println(domain.getYear()+"年"+domain.getMonth()+"月:计划金额"+domain.getTargetAmount()+"数量"+domain.getTargetNum());
//		}
		
	}
}
