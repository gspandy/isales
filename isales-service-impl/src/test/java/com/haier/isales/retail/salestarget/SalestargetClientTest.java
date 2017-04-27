package com.haier.isales.retail.salestarget;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.junit.Test;

import com.haier.isales.common.DubboResult;
import com.haier.isales.retail.salestarget.dto.SalestargetUpdateDto;
import com.haier.isales.retail.salestarget.service.SalestargetClient;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalFullInfoDTO;



/**
 * 直销员个人销量目标  相关测试类
 * @author Cao Rui
 *
 */
public class SalestargetClientTest extends BaseSalestargetClientTestCase{
	
	@Resource
	protected SalestargetClient salestargetClient;
	
	@Test
	public void testUpdateSalestarget() throws Exception {
		// 
		SalestargetUpdateDto updateDto = new SalestargetUpdateDto();
		PersonalFullInfoDTO personalInfo = new PersonalFullInfoDTO();
		updateDto.setOperatorId(1L);
		updateDto.setProductLine("103");
		updateDto.setYear(2015);
		updateDto.setMonth(11);
		updateDto.setTargetAmount(new BigDecimal("12000"));
		updateDto.setTargetNum(new BigDecimal("120"));
		
		personalInfo.setUserCode("Z12345678");
		personalInfo.setOrgCode("中心编码");
		personalInfo.setOrgName("青岛中心");
		personalInfo.setShopId("门店编码");
		personalInfo.setShopName("门店名");
		
		
		DubboResult result =  (DubboResult)salestargetClient.updateSalestarget( updateDto, personalInfo);
		
		logger.info("result.getResultCode()===:" + result.getResultCode());
	}

	/**
	 * @Description: 属性 salestargetClient 的get方法 
	 * @return salestargetClient
	 */
	public SalestargetClient getSalestargetClient() {
		return salestargetClient;
	}

	/**
	 * @Description: 属性 salestargetClient 的set方法 
	 * @param salestargetClient 
	 */
	public void setSalestargetClient(SalestargetClient salestargetClient) {
		this.salestargetClient = salestargetClient;
	}
	
	
	
	

	
}
