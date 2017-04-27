/**
 * @Company 青鸟软通   
 * @Title: RoleService.java 
 * @Package  com.haier.isales.system.role.service.impl
 * @author Liu Wenjie   
 * @date 2014年11月07日  11:18:40
 * @version V1.0   
 */
package com.haier.isales.system.role.service.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.system.role.dao.RoleDAO;
import com.haier.isales.system.role.domain.RoleDomain;
import com.haier.isales.system.role.service.RoleService;

/** 
 * @ClassName: RoleService
 * @Description: Role的Service接口定义类
 *  
 */
public class RoleServiceImpl implements RoleService{

	private static final Logger LOG = LoggerFactory.getLogger(RoleServiceImpl.class);
	
	/** 
	* @Fields roleDao : RoleDao 工具依赖 
	*/
	private RoleDAO roleDao;
	
	
	/*===============业务方法=============*/
	
	/**
	 * <p>Description:  根据用户id返回角色列表</p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-12 下午10:49:50 
	 * @param operatorId
	 * @return 
	 * @see com.haier.isales.system.role.service.RoleService#findRoleListByUserId(java.lang.Long) 
	 */ 
	@Override
	public List<RoleDomain> findRoleListByUserId(Long operatorId) {
		LOG.info("operatorId:"+operatorId);
		if(operatorId == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"传入参数用户id为空");
		}
		List<RoleDomain> roleList = roleDao.findByUserId(operatorId);
		return roleList;
	}
	
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性roleDao 的set方法 
	 */
	public void setRoleDao(RoleDAO roleDao){
		this.roleDao = roleDao;
	}


	
}
