/**
 * @Company 青鸟软通   
 * @Title: ResourceService.java 
 * @Package  com.haier.isales.system.resource.service.impl
 * @author Liu Wenjie   
 * @date 2014年11月12日  22:19:58
 * @version V1.0   
 */
package com.haier.isales.system.resource.service.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.system.resource.dao.ResourceDAO;
import com.haier.isales.system.resource.domain.ResourceDomain;
import com.haier.isales.system.resource.service.ResourceService;

/** 
 * @ClassName: ResourceService
 * @Description: Resource的Service接口定义类
 *  
 */
public class ResourceServiceImpl implements ResourceService{

	private static final Logger LOG = LoggerFactory.getLogger(ResourceServiceImpl.class);
	
	/** 
	* @Fields resourceDao : ResourceDao 工具依赖 
	*/
	private ResourceDAO resourceDao;
	
	
	/*===============业务方法=============*/
	/** 
	* @Description: 根据用户主键获取用户资源信息
	* @author Liu Wenjie   
	* @date 2014-11-12 下午10:33:14   
	*/ 
	public List<ResourceDomain> findAuthorizeResourceByOperatorId(Long operatorId){
		LOG.info("=========findAuthorizeResourceByOperatorId===" + operatorId);
		if(operatorId == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"根据用户id获取用户对应的资源列表时,用户id为null");
		}
		return resourceDao.findAuthorizeResourceByOperatorId(operatorId);
	}
	
	
	/** 
	* @Description: 获取系统中不需要授权验证的资源信息
	* @author Liu Wenjie   
	* @date 2014-11-12 下午10:52:28 
	* @return  
	*/ 
	public List<ResourceDomain> findDefaultResource(){
		LOG.info("=========findDefaultResource===");
		return resourceDao.findDefaultResource();
	}
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性resourceDao 的set方法 
	 */
	public void setResourceDao(ResourceDAO resourceDao){
		this.resourceDao = resourceDao;
	}
	
}
