package com.haier.isales.retail.personalmodel.service.impl;

import javax.annotation.Resource;

import org.junit.Test;

import com.haier.isales.common.DubboResult;
import com.haier.isales.retail.personalmodel.dto.PersonalModelAddDto;
import com.haier.isales.retail.personalmodel.dto.PersonalModelQueryDto;
import com.haier.isales.retail.personalmodel.service.PersonalModelSelectClient;
import com.haier.isales.retail.personalmodel.service.PersonalModelUpdateClient;



/**
 * 直销员常用型号相关测试类
 * @author Cao Rui
 *
 */
public class PersonalModelTest extends BasePersonalModelTestCase{
	
	@Resource
	protected PersonalModelUpdateClient personalmodelUpdateClient;
	@Resource
	protected PersonalModelSelectClient personalmodelSelectClient;
	
	@Test
	public void getPersonalmodelList() throws Exception {
		// 
		PersonalModelQueryDto queryDto = new PersonalModelQueryDto();
		queryDto.setOperatorId(33913L);
		DubboResult result =  (DubboResult)personalmodelSelectClient.getPersonalmodelList( queryDto, null, null);
		
		logger.info("result.getResultCode()===:" + result.getResultCode());
	}
	
	@Test
	public void savePersonalModel() throws Exception {
		// 
		PersonalModelAddDto addDto = new PersonalModelAddDto();
		addDto.setModelCode("600000001");
		addDto.setOperatorId(33913L);
		DubboResult result =  (DubboResult)personalmodelUpdateClient.savePersonalModel(addDto);
		
		logger.info("result.getResultCode()===:" + result.getResultCode());
	}
	
	@Test
	public void deletePersonalModel() throws Exception {
		// 
		PersonalModelQueryDto deleteDto = new PersonalModelQueryDto();
		deleteDto.setModelCode("600000001");
		deleteDto.setOperatorId(33913L);
		DubboResult result =  (DubboResult)personalmodelUpdateClient.deletePersonalModel(deleteDto);
		
		logger.info("result.getResultCode()===:" + result.getResultCode());
		logger.info("result.getErrorMessage()===:" + result.getErrorMessage());
	}

	
	
	/**
	 * @Description: 属性 personalmodelUpdateClient 的get方法 
	 * @return personalmodelUpdateClient
	 */
	public PersonalModelUpdateClient getPersonalmodelUpdateClient() {
		return personalmodelUpdateClient;
	}

	/**
	 * @Description: 属性 personalmodelUpdateClient 的set方法 
	 * @param personalmodelUpdateClient 
	 */
	public void setPersonalmodelUpdateClient(
			PersonalModelUpdateClient personalmodelUpdateClient) {
		this.personalmodelUpdateClient = personalmodelUpdateClient;
	}

	/**
	 * @Description: 属性 personalmodelSelectClient 的get方法 
	 * @return personalmodelSelectClient
	 */
	public PersonalModelSelectClient getPersonalmodelSelectClient() {
		return personalmodelSelectClient;
	}

	/**
	 * @Description: 属性 personalmodelSelectClient 的set方法 
	 * @param personalmodelSelectClient 
	 */
	public void setPersonalmodelSelectClient(
			PersonalModelSelectClient personalmodelSelectClient) {
		this.personalmodelSelectClient = personalmodelSelectClient;
	}

	
}
