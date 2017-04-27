/**
* @Company 青鸟软通   
* @Title: EmployeeClientImpl.java 
* @Package com.haier.isales.system.service.impl 
* @author Guo Yuchao   
* @date 2014-10-31 下午2:06:32 
* @version V1.0   
*/ 
package com.haier.isales.system.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.system.dto.EmployeeSearchDTO;

/**
 * 供客户端调用的远程接口
 * @author GuoYuchao
 *
 */
public interface EmployeeClient {
	
	
	/** 
	* @Description: 根据条件返回员工信息，包括是否授权 
	* @author Guo Yuchao   
	* @date 2014-10-31 下午2:04:54 
	* @param employeeSearchDTO
	* @return  
	*/ 
	@Export(paramNames = {"employeeSearchDTO","pageNo","pageSize"})
	public Object getEmployeeGrantByParam(EmployeeSearchDTO employeeSearchDTO,Integer pageNo,Integer pageSize);
	
	/**
	* @Description: test 
	* @author Guo Yuchao   
	* @date 2014-10-31 下午4:48:41 
	* @return  
	*/ 
	@Export(paramNames = {})
	Object getEmployeeByParam();
	
	/** 
	* @Description: 给指定工号的员工授权登录app
	* @author Guo Yuchao   
	* @date 2014-10-31 下午5:20:53 
	* @param employeeSn
	* @return  
	*/ 
	@Export(paramNames = {"employeeSn"})
	Object saveEmployeeAndGrantToUser(String employeeSn);
	
	/** 
	* @Description: 将指定员工的登录app权限收回
	* @author Guo Yuchao   
	* @date 2014-11-3 下午9:11:44 
	* @param employeeSn
	* @return  
	*/ 
	@Export(paramNames = {"employeeSn"})
	Object saveDisableGrantUser(String employeeSn);
}
