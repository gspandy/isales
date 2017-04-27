/**
* @Company 青鸟软通   
* @Title: PurchasedCustomerClient.java 
* @Package com.haier.isales.customer.service 
* @author Cao Rui   
* @date 2014-11-15 下午1:50:25 
* @version V1.0   
*/ 
package com.haier.isales.customer.service;

import com.haier.isales.customer.dto.PurchasedCustomerDTO;

/** 
 * @ClassName: PurchasedCustomerClient 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public interface PurchasedCustomerClient {

	/**
	 * 查询已购买顾客列表
	* @Title: getPurchasedCustomerList 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDTO
	* @param currentPage
	* @param pageSize
	* @return  
	* @throws
	 */
	public Object getPurchasedCustomerList(
			PurchasedCustomerDTO queryDTO ,Integer currentPage,Integer pageSize);
	
	/**
	 * @throws Exception 
	* @Title: 查询一条指定的已购买信息
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDTO
	* @return  
	* @throws
	 */
	public Object getPurchasedCustomerInfo(PurchasedCustomerDTO queryDTO);
	
	/**
	 * @throws Exception 
	* @Title: 修改一条指定的已购买信息，只能修改客户信息
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDTO
	* @return  
	* @throws
	 */
	public Object updatePurchasedCustomerInfo(PurchasedCustomerDTO queryDTO);
}
