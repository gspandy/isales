/**
 * @Company 青鸟软通   
 * @Title: ResourceDAO.java 
 * @Package  com.haier.isales.system.resource.dao
 * @author Liu Wenjie   
 * @date 2014年11月12日  22:16:36
 * @version V1.0   
 */
package com.haier.isales.system.resource.dao;

import java.util.List;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.system.resource.domain.ResourceDomain;
/** 
 * @ClassName: ResourceDAO
 * @Description: Resource的DAO接口定义类
 *  
 */
public interface ResourceDAO extends CommonDAO<ResourceDomain,String>{

	/** 
	* @Description: 根据用户id获取用户被授权的资源
	* @author Liu Wenjie   
	* @date 2014-11-12 下午10:48:03 
	* @param operatorId
	* @return  
	*/ 
	List<ResourceDomain> findAuthorizeResourceByOperatorId(Long operatorId);
	
	
	/** 
	* @Description: 获取系统中默认所有可以访问的资源集合
	* @author Liu Wenjie   
	* @date 2014-11-12 下午10:50:22 
	* @return  
	*/ 
	List<ResourceDomain> findDefaultResource();
	
}
