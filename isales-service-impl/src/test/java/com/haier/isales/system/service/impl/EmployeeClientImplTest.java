package com.haier.isales.system.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import javax.annotation.Resource;

import org.bana.common.util.page.PageResult;
import org.junit.Ignore;
import org.junit.Test;

import com.haier.isales.common.DubboResult;
import com.haier.isales.common.ReturnResult;
import com.haier.isales.system.dto.EmployeeDTO;
import com.haier.isales.system.dto.EmployeeSearchDTO;
import com.haier.isales.system.service.EmployeeClient;
import com.haier.openplatform.showcase.security.service.impl.BaseTestCase;


/**
 * @author Richard Core
 *
 */
@Ignore
public class EmployeeClientImplTest extends BaseTestCase{
	@Resource
	private EmployeeClient employeeClient;
	
	@Test
	public void testGetEmployeeGrantByParam() {
		EmployeeSearchDTO employeeSearchDTO = new EmployeeSearchDTO();		
		DubboResult dubboResult = (DubboResult)employeeClient.getEmployeeGrantByParam(employeeSearchDTO,0,5);
		PageResult<EmployeeDTO> pageResult = dubboResult.getResultBean();
		assertThat(pageResult, notNullValue());
		assertThat(pageResult.getResultList(), notNullValue());
	}
	
	
	@Test
	public void testSaveEmployeeAndGrantToUser(){
		DubboResult dubboResult = (DubboResult)employeeClient.saveEmployeeAndGrantToUser("00000007,00000008");
		ReturnResult returnResult = dubboResult.getResultBean();
//		assertThat(returnResult.getResult(),equalTo("success"));
		assertThat(returnResult.getMessage(), notNullValue());
	}
	@Test
	public void testSaveDisableGrantUser(){
		DubboResult dubboResult = (DubboResult)employeeClient.saveDisableGrantUser("00000009,00000548");
		ReturnResult returnResult = dubboResult.getResultBean();
		assertThat(returnResult.getResult(),equalTo("success"));
		assertThat(returnResult.getMessage(), notNullValue());
		
	}
}
