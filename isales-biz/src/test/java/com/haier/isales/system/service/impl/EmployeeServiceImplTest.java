package com.haier.isales.system.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.notNullValue;

import javax.annotation.Resource;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.common.ReturnResult;
import com.haier.isales.system.employee.domain.Employee;
import com.haier.isales.system.employee.model.EmployeeSearchModel;
import com.haier.isales.system.employee.service.EmployeeService;
@ContextConfiguration(locations = {
		"classpath*:/spring/system/spring-*.xml"
		})
@Ignore
public class EmployeeServiceImplTest extends BaseIsalesTestCase{
	@Resource
	protected EmployeeService employeeService;
	@Test
	public void testGetEmployeeByParam() {
		EmployeeSearchModel employeeSearchModel = new EmployeeSearchModel();
//		employeeSearchModel.setEmployeeSn("00000007");
		PageCond pageCond = new PageCond(1,5);
		pageCond.setFirstResult(PageCondUtil.calculateX(pageCond));
		PageResult<Employee> employeeList = employeeService.getEmployeeByParam(employeeSearchModel, pageCond);
		assertThat(employeeList,notNullValue());
		assertThat(employeeList.getResultList().size(),greaterThanOrEqualTo(1));
	}
	@Test
	public void testGetEmployeeGrantByParam() {
		EmployeeSearchModel employeeSearchModel = new EmployeeSearchModel();
//		employeeSearchModel.setEmployeeSn("00000007");
		employeeSearchModel.setGrantStatus("");
		employeeSearchModel.setEmployeeName("于");
		PageCond pageCond = new PageCond(1,85);
		pageCond.setFirstResult(PageCondUtil.calculateX(pageCond));
		PageResult<Employee> employeeList = employeeService.getEmployeeGrantByParam(employeeSearchModel, pageCond);
		assertThat(employeeList,notNullValue());
		assertThat(employeeList.getResultList().size(),greaterThanOrEqualTo(1));
	}
	@Test
	public void testSaveEmployeeAndGrantToUser(){
		ReturnResult returnResult =  employeeService.saveEmployeeAndGrantToUser("00000009,00000040,00000045");
//		assertThat(returnResult.getResult(),equalTo("success"));
		assertThat(returnResult.getMessage(),notNullValue());
	}
	/** 
	* @Description: 取消授权
	* @author Guo Yuchao   
	* @date 2014-11-3 下午8:47:43   
	*/ 
	@Test
	public void testSaveDisableGrantUser(){
		ReturnResult returnResult =  employeeService.saveDisableGrantUser("00000548");
		assertThat(returnResult.getResult(),equalTo("success"));
		assertThat(returnResult.getMessage(),notNullValue());
	}

}
