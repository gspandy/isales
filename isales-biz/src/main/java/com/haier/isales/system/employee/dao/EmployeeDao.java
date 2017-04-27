/**
* @Company 青鸟软通   
* @Title: UserDao.java 
* @Package com.haier.isales.system.user.dao 
* @author Guo Yuchao   
* @date 2014-10-28 上午10:11:23 
* @version V1.0   
*/ 
package com.haier.isales.system.employee.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bana.common.util.page.PageCond;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.system.employee.domain.Employee;
import com.haier.isales.system.employee.model.EmployeeSearchModel;

/** 
 * @ClassName: UserDao 
 * @Description: 用户dao 
 *  
 */
public interface EmployeeDao extends CommonDAO<Employee, String> {
	
	/** 
	* @Description: 根据参数返回员工信息
	* @author Guo Yuchao   
	* @date 2014-10-28 上午10:36:41 
	* @param employeeSearchModel
	* @return  
	*/ 
	List<Employee> getEmployeeByParam(@Param("model") EmployeeSearchModel employeeSearchModel,
			@Param("pageCond") PageCond pageCond);
	
	/** 
	* @Description: 根据参数返回员工信息总条数
	* @author Guo Yuchao   
	* @date 2014-10-29 下午7:59:57 
	* @param employeeSearchModel
	* @return  
	*/ 
	Long getCountEmployeeByParam(@Param("model") EmployeeSearchModel employeeSearchModel);
	/** 
	 * @Description: 根据参数返回员工信息
	 * @author Guo Yuchao   
	 * @date 2014-10-28 上午10:36:41 
	 * @param employeeSearchModel
	 * @return  
	 */ 
	List<Employee> getEmployeeGrantByParam(@Param("model") EmployeeSearchModel employeeSearchModel,
			@Param("pageCond") PageCond pageCond);
	
	/** 
	 * @Description: 根据参数返回员工信息总条数
	 * @author Guo Yuchao   
	 * @date 2014-10-29 下午7:59:57 
	 * @param employeeSearchModel
	 * @return  
	 */ 
	Long getCountEmployeeGrantByParam(@Param("model") EmployeeSearchModel employeeSearchModel);
	
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
	
	
}
