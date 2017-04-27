package com.haier.isales.salerinfo.personalinfo;

import javax.annotation.Resource;

import org.junit.Test;

import com.haier.isales.common.DubboResult;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalEmpInfoDTO;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalInfoDTO;
import com.haier.isales.salerinfo.personalinfo.service.PersonalInfoServiceClient;


/**
 * 直销员个人信息相关测试类
 * @author Cao Rui
 *
 */
public class SalerInfoTest extends BaseSalerInfoTestCase{
	@Resource
	protected PersonalInfoServiceClient personalInfoServiceClient;
	
	@Test
	public void testGetSalerInfo() {
		// 获取用户信息test
		PersonalInfoDTO bean = new PersonalInfoDTO();
		bean.setQuerySalerCode("admin");
		
		DubboResult result = (DubboResult) personalInfoServiceClient.getSalerInfo(bean);
		PersonalInfoDTO dto = (PersonalInfoDTO) result.getResultBean();
		
		logger.info("============================================" + dto.toString());
		
//		assertThat(user, notNullValue());
	}
	
	@Test
	public void testGetSalerShowInfo() {
		// 获取用户信息test	
		DubboResult result = (DubboResult) personalInfoServiceClient.getEmpInfoSummary(1L);
		PersonalEmpInfoDTO dto = (PersonalEmpInfoDTO) result.getResultBean();
		
		logger.info("============================================" + dto.toString());
		
//		assertThat(user, notNullValue());
	}
	
	@Test
	public void testIsAllowedToReportSales() {
		// 获取用户信息test	
		DubboResult result = (DubboResult) personalInfoServiceClient.isAllowedToReportSales(1L);
		Boolean isAllowed = result.getResultBean();
//		boolean dto = (Object) result.getResultBean();
//		
		logger.info("============================================" + isAllowed);
		
//		assertThat(user, notNullValue());
	}
	
}
