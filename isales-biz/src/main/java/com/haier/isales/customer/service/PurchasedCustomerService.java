/**
* @Company 青鸟软通   
* @Title: PurchasedCustomerService.java 
* @Package com.haier.isales.customer 
* @author Cao Rui   
* @date 2014-11-15 下午12:01:58 
* @version V1.0   
*/ 
package com.haier.isales.customer.service;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.customer.dto.PurchasedCustomerDTO;

/** 
 * @ClassName: PurchasedCustomerService 
 * @Description: 已购买顾客管理 Service 
 *  
 */
public interface PurchasedCustomerService {


	/**
	 * @throws Exception 
	* @Title: 查询已购买顾客列表
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDTO
	* @param pageCond
	* @return  
	* @throws
	 */
	public PageResult<PurchasedCustomerDTO> getPurchasedCustomerList(PurchasedCustomerDTO queryDTO,PageCond pageCond);
	
	/**
	 * @throws Exception 
	* @Title: 查询一条指定的已购买信息
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDTO
	* @return  
	* @throws
	 */
	public PurchasedCustomerDTO getPurchasedCustomerInfo(PurchasedCustomerDTO queryDTO) ;
	
	/**
	 * @throws Exception 
	* @Title: 修改一条指定的已购买信息，只能修改客户信息
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDTO
	* @return  
	* @throws
	 */
	public void updatePurchasedCustomerInfo(PurchasedCustomerDTO queryDTO);
}
