/**
 * @Company 青鸟软通   
 * @Title: ResourceService.java 
 * @Package  com.haier.isales.system.resource.service
 * @author Liu Wenjie   
 * @date 2014年11月12日  22:19:58
 * @version V1.0   
 */
package com.haier.isales.system.resource.service;

import java.util.List;

import com.haier.isales.system.resource.domain.ResourceDomain;

/** 
 * @ClassName: ResourceService
 * @Description: Resource的Service接口定义类
 *  
 */
public interface ResourceService {

	/** 
	* @Description: 根据用户主键获取用户资源信息
	* @author Liu Wenjie   
	* @date 2014-11-12 下午10:33:14   
	*/ 
	public List<ResourceDomain> findAuthorizeResourceByOperatorId(Long operatorId);
	
	
	/** 
	* @Description: 获取系统中不需要授权验证的资源信息
	* @author Liu Wenjie   
	* @date 2014-11-13 上午10:44:53 
	* @return  
	*/ 
	public List<ResourceDomain> findDefaultResource();
}
