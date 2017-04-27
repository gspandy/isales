/**
 * @Company 青鸟软通   
 * @Title: SysUserCollectService.java 
 * @Package  com.haier.isales.app.service
 * @author lizhenwei   
 * @date 2016年04月22日  14:33:16
 * @version V1.0   
 */
package com.haier.isales.app.service;

import java.util.List;

import com.haier.isales.app.domain.SysUserCollectDomain;
import com.haier.isales.app.dto.SysUserCollectDTO;
import com.haier.isales.app.dto.SysUserDTO;

/** 
 * @ClassName: SysUserCollectService
 * @Description: SysUserCollect的Service接口定义类
 *  
 */
public interface SysUserCollectService {

	/**
	 * 
	* @Title: updateCollectStatus
	* @Description: 更新收藏状态
	* @return  
	* @throws
	 */
	public void updateCollectStatus(SysUserCollectDTO sysUserCollectDTO);
	
	/**
	 * 
	* @Title: findFavorContacts
	* @Description: 根据工号查询收藏联系人
	* @return  
	* @throws
	 */
	public List<SysUserDTO> findFavorContacts(SysUserDTO dto);
	
	/**
	 * 
	* @Title: createFavorContacts
	* @Description: 添加收藏联系人
	* @return  
	* @throws
	 */
	public void createFavorContacts(SysUserCollectDTO dto);
	// 根据工号、收藏工号查询收藏关系
	public List<SysUserCollectDTO> findCollList(SysUserCollectDTO dto);
	
}
