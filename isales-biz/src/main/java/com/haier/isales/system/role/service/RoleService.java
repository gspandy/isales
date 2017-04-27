/**
 * @Company 青鸟软通   
 * @Title: RoleService.java 
 * @Package  com.haier.isales.system.role.service
 * @author Liu Wenjie   
 * @date 2014年11月07日  11:18:40
 * @version V1.0   
 */
package com.haier.isales.system.role.service;

import java.util.List;

import com.haier.isales.system.role.domain.RoleDomain;

/** 
 * @ClassName: RoleService
 * @Description: Role的Service接口定义类
 *  
 */
public interface RoleService {
	/** 
	* @Description: 根据用户id返回角色列表
	* @author Guo Yuchao   
	* @date 2014-11-12 下午10:49:21 
	* @param operatorId
	* @return  
	*/ 
	List<RoleDomain> findRoleListByUserId(Long operatorId);
		
}
