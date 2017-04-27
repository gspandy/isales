/**
* @Company 青鸟软通   
* @Title: EmployeeService.java 
* @Package com.haier.isales.system.employee.service 
* @author Guo Yuchao   
* @date 2014-10-31 上午10:20:01 
* @version V1.0   
*/ 
package com.haier.isales.system.employee.service;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.common.ReturnResult;
import com.haier.isales.system.employee.domain.Employee;
import com.haier.isales.system.employee.model.EmployeeSearchModel;

/** 
 * @ClassName: EmployeeService 
 * @Description: 员工业务处理 
 *  
 */
public interface EmployeeService {
	/** 
	* @Description: 根据参数返回员工信息
	* @author Guo Yuchao   
	* @date 2014-10-28 上午10:36:41 
	* @param employeeSearchModel
	* @return  
	*/ 
	PageResult<Employee> getEmployeeByParam(EmployeeSearchModel employeeSearchModel,
			PageCond pageCond);
	/** 
	 * @Description: 根据参数返回员工信息 包括是否授权
	 * @author Guo Yuchao   
	 * @date 2014-10-28 上午10:36:41 
	 * @param employeeSearchModel
	 * @return  
	 */ 
	PageResult<Employee> getEmployeeGrantByParam(EmployeeSearchModel employeeSearchModel,
			PageCond pageCond);
	

	
	/** 
	* @Description: 保存员工信息
	* @author Guo Yuchao   
	* @date 2014-10-28 上午10:38:17 
	* @param employee 
	*/ 
	void saveEmployee(Employee employee);
	
	/** 
	* @Description: 跟新用户
	* @author Guo Yuchao   
	* @date 2014-10-28 上午10:38:26 
	* @param Employee  
	*/ 
	void updateEmployee(Employee employee);
	
	/** 
	* @Description: 给指定工号的员工授权登录app
	* @author Guo Yuchao   
	* @date 2014-10-31 下午3:16:47 
	* @param employeeSn
	* @return  
	*/ 
	ReturnResult saveEmployeeAndGrantToUser(String employeeSn);
	
	/** 
	* @Description:将指定员工的登录app权限收回s
	* @author Guo Yuchao   
	* @date 2014-11-3 下午7:09:00 
	* @param employeeSn
	* @return  
	*/ 
	ReturnResult saveDisableGrantUser(String employeeSns);
	
}
