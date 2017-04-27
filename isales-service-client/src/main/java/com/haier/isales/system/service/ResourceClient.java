/**
* @Company 青鸟软通   
* @Title: ResourceClient.java 
* @Package com.haier.isales.system.service 
* @author Liu Wenjie   
* @date 2014-11-13 上午10:48:26 
* @version V1.0   
*/ 
package com.haier.isales.system.service;


/** 
 * @ClassName: ResourceClient 
 * @Description: 
 *  
 */
public interface ResourceClient {

	/** 
	* @Description: 根据用户主键获取用户资源信息
	* @author Liu Wenjie   
	* @date 2014-11-12 下午10:33:14   
	*/ 
	public Object findAuthorizeResourceByOperatorId(Long operatorId);
	
	
	/** 
	* @Description: 获取系统中不需要授权验证的资源信息
	* @author Liu Wenjie   
	* @date 2014-11-13 上午10:44:53 
	* @return  
	*/ 
	public Object findDefaultResource();
}
