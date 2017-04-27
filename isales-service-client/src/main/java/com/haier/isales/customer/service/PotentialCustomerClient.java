/**
* @Company 青鸟软通   
* @Title: PotentialCustomerClient.java 
* @Package com.haier.isales.salerInfo.personalInfo.service 
* @author Cao Rui   
* @date 2014-11-12 下午2:52:58 
* @version V1.0   
*/ 
package com.haier.isales.customer.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.customer.dto.PotentialCustomerDTO;

/** 
 * @ClassName: PotentialCustomerClient 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public interface PotentialCustomerClient {

	/**
	 * 根据查询条件潜客信息列表
	 * @param queryParam
	 * @return
	 */
	@Export(paramNames = {"queryEntity","currentPage","pageSize"})
	public Object getPotentialCustomerList(
			PotentialCustomerDTO queryEntity ,Integer currentPage,Integer pageSize) ;
		
	/**
	 * @throws Exception 
	* @Title: 查询一个潜客的详情
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryEntity
	* @return  
	* @throws
	 */
	public Object getPotentialCustomerInfo(PotentialCustomerDTO queryEntity);
	
	/**
	 * 添加潜客信息
	* @Title: savePotentialCustomer 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param saveDto  
	* @throws
	 */
	@Export(paramNames = {"saveDto"})
	public Object savePotentialCustomer(PotentialCustomerDTO saveDto);
	
	/**
	 * 修改潜客信息
	* @Title: updatePotentialCustomer 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param saveDto  
	* @throws
	 */
	public Object updatePotentialCustomer(PotentialCustomerDTO saveDto);
	
	/**
	 * 删除潜客信息
	* @Title: deletePotentialCustomer 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param deleteDto  
	* @throws
	 */
	public Object deletePotentialCustomer(PotentialCustomerDTO deleteDto);
	
}
