/**
* @Company 青鸟软通   
* @Title: ResourceClientImpl.java 
* @Package com.haier.isales.system.service.impl 
* @author Liu Wenjie   
* @date 2014-11-13 上午10:48:11 
* @version V1.0   
*/ 
package com.haier.isales.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.haier.isales.system.DomainDtoUtil;
import com.haier.isales.system.dto.ResourceDTO;
import com.haier.isales.system.resource.domain.ResourceDomain;
import com.haier.isales.system.resource.service.ResourceService;
import com.haier.isales.system.service.ResourceClient;

/** 
 * @ClassName: ResourceClientImpl 
 * @Description: 资源文件的DTO实现类
 *  
 */
public class ResourceClientImpl implements ResourceClient{

	private ResourceService resourceService;
	
	/**
	* <p>Description: 根据用户查询用户授权的资源对象</p> 
	* @author Liu Wenjie   
	* @date 2014-11-13 上午10:52:10 
	* @param operatorId
	* @return 
	* @see com.haier.isales.system.service.ResourceClient#findAuthorizeResourceByOperatorId(java.lang.Long) 
	*/ 
	@Override
	public List<ResourceDTO> findAuthorizeResourceByOperatorId(Long operatorId) {
		List<ResourceDomain> resourceList = resourceService.findAuthorizeResourceByOperatorId(operatorId);
		if(resourceList == null || resourceList.isEmpty()){
			return new ArrayList<ResourceDTO>();
		}
		
		List<ResourceDTO> resourceDTOList = new ArrayList<ResourceDTO>();
		for (ResourceDomain resourceDomain : resourceList) {
			resourceDTOList.add(DomainDtoUtil.cloneResourceDomain2ResourceDTO(resourceDomain));
		}
		
		return resourceDTOList;
	}

	/**
	* <p>Description: 查询用户默认的资源信息 </p> 
	* @author Liu Wenjie   
	* @date 2014-11-13 上午10:52:10 
	* @return 
	* @see com.haier.isales.system.service.ResourceClient#findDefaultResource() 
	*/ 
	@Override
	public List<ResourceDTO> findDefaultResource() {
		List<ResourceDomain> resourceList = resourceService.findDefaultResource();
		if(resourceList == null || resourceList.isEmpty()){
			return new ArrayList<ResourceDTO>();
		}
		
		List<ResourceDTO> resourceDTOList = new ArrayList<ResourceDTO>();
		for (ResourceDomain resourceDomain : resourceList) {
			resourceDTOList.add(DomainDtoUtil.cloneResourceDomain2ResourceDTO(resourceDomain));
		}
		
		return resourceDTOList;
	}
	
	
	/*============== getter and setter ==================*/

	/**
	 * @Description: 属性 resourceService 的set方法 
	 * @param resourceService 
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

}
