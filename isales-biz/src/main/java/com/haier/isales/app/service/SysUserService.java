/**
 * @Company 青鸟软通   
 * @Title: SysUserService.java 
 * @Package  com.haier.isales.app.service
 * @author lizhenwei   
 * @date 2016年03月24日  19:26:10
 * @version V1.0   
 */
package com.haier.isales.app.service;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.app.domain.SysUserDomain;
import com.haier.isales.app.dto.SysUserDTO;

/** 
 * @ClassName: SysUserService
 * @Description: SysUser的Service接口定义类
 *  
 */
public interface SysUserService {

	/**
	 * 
	* @Title: findSysUser
	* @Description: 通过查询条件查询用户通讯录列表
	* @return  
	* @throws
	 */
	public PageResult<SysUserDomain> ObtainSysUser(SysUserDTO queryDTO, PageCond pageCond);
	
	/**
	 * 
	* @Title: findSysUserInfo
	* @Description: 通过查询条件查询用户通讯录
	* @return  
	* @throws
	 */
	public SysUserDTO ObtainSysUserInfo(String sysUserCode, String userCode);	
}
