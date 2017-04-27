/**
* @Company 青鸟软通   
* @Title: EmployeeClientImpl.java 
* @Package com.haier.isales.system.service.impl 
* @author Guo Yuchao   
* @date 2014-10-31 下午2:06:32 
* @version V1.0   
*/ 
package com.haier.isales.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.common.DomainDtoUtil;
import com.haier.isales.common.ReturnResult;
import com.haier.isales.system.dto.EmployeeDTO;
import com.haier.isales.system.dto.EmployeeSearchDTO;
import com.haier.isales.system.employee.domain.Employee;
import com.haier.isales.system.employee.model.EmployeeSearchModel;
import com.haier.isales.system.employee.service.EmployeeService;
import com.haier.isales.system.service.EmployeeClient;

/** 
 * @ClassName: EmployeeClientImpl 
 * @Description: 员工管理登录app授权
 *  
 */
public class EmployeeClientImpl implements EmployeeClient {
	private static Logger logger = Logger.getLogger(EmployeeClientImpl.class);
	public static final String EMP_SN_STR_SEPARATOR = ",";
	
	private EmployeeService employeeService;
	
	
	/**
	 * @Description: 属性 employeeService 的get方法 
	 * @return employeeService
	 */
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	/**
	 * @Description: 属性 employeeService 的set方法 
	 * @param employeeService 
	 */
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	/**
	* <p>Description:根据条件返回员工信息，包括是否授权 </p> 
	* @author Guo Yuchao   
	* @date 2014-10-31 下午2:17:50 
	* @param employeeSearchDTO
	* @param currentPage
	* @param pageSize
	* @return 
	* @see com.haier.isales.system.service.EmployeeClient#getEmployeeGrantByParam(com.haier.isales.system.dto.EmployeeSearchDTO, int, int) 
	*/ 
	@Override
	public PageResult<EmployeeDTO> getEmployeeGrantByParam(
			EmployeeSearchDTO employeeSearchDTO ,Integer currentPage,Integer pageSize) {
		logger.info("传入参数："+employeeSearchDTO);
		Long begin = System.currentTimeMillis();
		logger.info("getEmployeeGrantByParam 方法begin："+begin);
		Integer pageNo = currentPage;
		Integer numPerPage = pageSize;
		if(pageNo == null){
			pageNo = 1;
		}
		if(numPerPage == null){
			numPerPage = 10;
		}
		EmployeeSearchModel  employeeSearchModel = DomainDtoUtil.cloneEmpSearchDtoToEmpSearchModel(employeeSearchDTO);
		PageResult<Employee> pageResult = employeeService.getEmployeeGrantByParam(employeeSearchModel, new PageCond(pageNo,numPerPage));
		List<EmployeeDTO> empDtoList = new ArrayList<EmployeeDTO>();
		for (Employee emp : pageResult.getResultList()) {
			EmployeeDTO employDTO = DomainDtoUtil.cloneEmployeeToEmployeeDto(emp);
			empDtoList.add(employDTO);
		}
		Long end = System.currentTimeMillis();
		logger.info("getEmployeeGrantByParam 方法end:"+(end));
		logger.info("getEmployeeGrantByParam 方法持续时间"+(end-begin));
		return new PageResult<EmployeeDTO>(empDtoList, pageResult.getPageCond());
	}
	/**
	* <p>Description: 查询员工信息</p> 
	* @author Guo Yuchao   
	* @date 2014-10-31 下午5:04:15 
	* @return 
	* @see com.haier.isales.system.service.EmployeeClient#getEmployeeByParam() 
	*/ 
	@Override
	public List<EmployeeDTO> getEmployeeByParam(){
//			EmployeeSearchDTO employeeSearchDTO ,int currentPage,int pageSize) {
//		EmployeeSearchModel  employeeSearchModel = DomainDtoUtil.cloneEmpSearchDtoToEmpSearchModel(employeeSearchDTO);
		EmployeeSearchModel  employeeSearchModel = new EmployeeSearchModel();
		PageResult<Employee> pageResult = employeeService.getEmployeeGrantByParam(employeeSearchModel, new PageCond(1,5));
		List<EmployeeDTO> empDtoList = new ArrayList<EmployeeDTO>();
		for (Employee emp : pageResult.getResultList()) {
			EmployeeDTO employDTO = DomainDtoUtil.cloneEmployeeToEmployeeDto(emp);
			empDtoList.add(employDTO);
		}
		
		return empDtoList;
	}
	/**
	* <p>Description:  给指定工号的员工授权登录app</p> 
	* @author Guo Yuchao   
	* @date 2014-10-31 下午5:21:33 
	* @param employeeSn
	* @return 
	* @see com.haier.isales.system.service.EmployeeClient#saveEmployeeAndGrantToUser(java.lang.String) 
	*/ 
	@Override
	public ReturnResult saveEmployeeAndGrantToUser(String employeeSn) {
		logger.info("传入参数："+employeeSn);
		Long begin = System.currentTimeMillis();
		logger.info("saveEmployeeAndGrantToUser 方法begin："+begin);
		ReturnResult returnResult = employeeService.saveEmployeeAndGrantToUser(employeeSn);
//		ReturnResult returnResult = new ReturnResult();
//		StringBuffer message = new StringBuffer();
//		String result = ReturnResult.RETURN_RESULT_SUCCESS;
//		if(StringUtils.isEmpty(employeeSn)){
//			result = ReturnResult.RETURN_RESULT_FAILURE;
//			message.append("请选择一个员工！");
//		}else{
//			String[] empSns = employeeSn.split(EMP_SN_STR_SEPARATOR);
//			for (String empSnStr : empSns) {
//				if(StringUtils.isEmpty(empSnStr)){
//					continue;
//				}
//				returnResult = employeeService.saveEmployeeAndGrantToUser(empSnStr);
//				if (ReturnResult.RETURN_RESULT_FAILURE.equals(returnResult.getResult())) {
//					result= ReturnResult.RETURN_RESULT_FAILURE;
//					message.append(",").append(returnResult.getMessage());
//				}else{
//					
//				}
//			}
//			if(empSns.length > 1 && ReturnResult.RETURN_RESULT_FAILURE.equals(returnResult.getResult())){
//				message.append(",").append("其他员工授权成功！");
//			}else if(empSns.length > 1 && ReturnResult.RETURN_RESULT_SUCCESS.equals(returnResult.getResult())){
//				message.append("授权成功！");
//			}
//		}
//		return new ReturnResult(result,message.toString());
		Long end = System.currentTimeMillis();
		logger.info("saveEmployeeAndGrantToUser 方法end:"+(end));
		logger.info("saveEmployeeAndGrantToUser 方法持续时间"+(end-begin));
		return returnResult;
	}
	/**
	* <p>Description:将指定员工的登录app权限收回 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-3 下午9:12:02 
	* @param employeeSn
	* @return 
	* @see com.haier.isales.system.service.EmployeeClient#saveDisableGrantUser(java.lang.String) 
	*/ 
	@Override
	public ReturnResult saveDisableGrantUser(String employeeSn) {
		logger.info("传入参数："+employeeSn);
		Long begin = System.currentTimeMillis();
		logger.info("saveDisableGrantUser 方法begin："+begin);
		ReturnResult returnResult = employeeService.saveDisableGrantUser(employeeSn);
		Long end = System.currentTimeMillis();
		logger.info("saveDisableGrantUser 方法end:"+(end));
		logger.info("saveDisableGrantUser 方法持续时间"+(end-begin));
		return returnResult;
	}

}
