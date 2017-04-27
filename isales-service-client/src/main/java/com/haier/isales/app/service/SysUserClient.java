/**
 * @Company 青鸟软通   
 * @Title: UserTokenClient.java 
 * @Package com.haier.isales.app.service 
 * @author lizhenwei
 * @date 2015-12-29 下午4:59:32 
 * @version V1.0   
 */
package com.haier.isales.app.service;

import java.util.Map;

import io.terminus.pampas.client.Export;

import com.haier.isales.app.dto.SysUserDTO;

/**
 * @ClassName: SysUserClient
 * @Description: 获取通讯录信息接口
 * 
 */
public interface SysUserClient {

	/**
	 * 
	* @Title: findSysUser
	* @Description: 通过条件查询用户通讯录信息
	* @return  
	* @throws
	 */
	@Export(paramNames = {"sysUserDTO","currentPage","pageSize"})
	public Object findSysUser(SysUserDTO sysUserDTO, Integer currentPage, Integer pageSize);
	
	/**
	 * 
	* @Title: findAddrbookInfo
	* @Description: 通过工号查询用户通讯录信息
	* @return  
	* @throws
	 */
	@Export(paramNames = {"sysUserCode", "userCode"})
	public Object findAddrbookInfo(String sysUserCode, String userCode);
	
	/**
	 * 
	* @Title: findSysUser
	* @Description: 查询收藏联系人及通过条件查询用户通讯录信息
	* @return  
	* @throws
	 */
	@Export(paramNames = {"sysUserDTO","user","currentPage","pageSize"})
	public Object findCollectAndUserList(SysUserDTO sysUserDTO, SysUserDTO user, Integer currentPage, Integer pageSize);
	

}
