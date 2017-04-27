/**
* @Company 青鸟软通   
* @Title: SysUserDAO.java
* @Package com.haier.isales.app.dao
* @author lizhenwei
* @date 2016-3-24下午7:14:11
* @version V1.0   
*/ 
package com.haier.isales.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bana.common.util.page.PageCond;

import com.haier.isales.app.domain.SysUserDomain;
import com.haier.isales.app.dto.SysUserDTO;
import com.haier.isales.common.dao.CommonDAO;

/** 
 * @ClassName: SysUserDAO
 * @Description: SysUser的DAO接口定义类
 *  
 */
public interface SysUserDAO extends CommonDAO<SysUserDomain, Long> {
	/**
	 * 
	* @Title: findSysUser
	* @Description: 获取用户信息
	* @param 
	* @return  
	* @throws
	 */
	List<SysUserDomain> findSysUser(@Param("queryDTO") SysUserDTO queryDTO, @Param("pageCond") PageCond pageCond);
	
	/**
	 * 
	* @Title: getSysUserCount
	* @Description: 获取用户通讯录数
	* @param 
	* @return  
	* @throws
	 */
	Integer getSysUserCount(@Param("queryDTO") SysUserDTO queryDTO);
	
	/**
	 * 
	* @Title: findSysUserInfo
	* @Description: 获取用户信息
	* @param 
	* @return  
	* @throws
	 */
	SysUserDomain findSysUserInfo(@Param("entity") SysUserDomain entity);
	
	/**
	 * @Title: updatePhotoUrl
	* @Description: 根据号码更新头像url
	* @param 
	* @return  
	* @throws
	 */
	Integer updatePhotoUrl(@Param("entity") SysUserDomain entity);
	
	/**
	 * 
	* @Title: findFavoriteContacts
	* @Description: 获取收藏联系人列表
	* @param 
	* @return  
	* @throws
	 */
	List<SysUserDomain> findFavoriteContacts(@Param("queryDTO") SysUserDTO queryDTO);
}
