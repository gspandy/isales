/**
* @Company 青鸟软通   
* @Title: PurchasedCustomerClientImpl.java 
* @Package com.haier.isales.customer.service.impl 
* @author Cao Rui   
* @date 2014-11-15 下午1:45:08 
* @version V1.0   
*/ 
package com.haier.isales.customer.service.impl;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.customer.dto.PurchasedCustomerDTO;
import com.haier.isales.customer.service.PurchasedCustomerClient;
import com.haier.isales.customer.service.PurchasedCustomerService;

/** 
 * @ClassName: PurchasedCustomerClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class PurchasedCustomerClientImpl implements PurchasedCustomerClient{
	private static Logger logger = LoggerFactory.getLogger(PurchasedCustomerClientImpl.class);
	private PurchasedCustomerService purchasedCustomerService;
	
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
	@Override
	public PageResult<PurchasedCustomerDTO> getPurchasedCustomerList(
			PurchasedCustomerDTO queryDTO ,Integer currentPage,Integer pageSize) {
		
		logger.info("调用已购买客户列表的方法begin");
		//如果分页条件为空，则赋默认值，不允许查询数据库的全部结果
		Integer pageNo = currentPage;
		Integer numPerPage = pageSize;
		if(pageNo == null){
			pageNo = 1;
		}
		if(numPerPage == null){
			numPerPage = 10;
		}
		
		PageResult<PurchasedCustomerDTO> pageResult = purchasedCustomerService.getPurchasedCustomerList(queryDTO, new PageCond(pageNo,numPerPage));
		
		return pageResult;
	}
	
	/**
	 * @throws Exception 
	* @Title: 查询一条指定的已购买信息
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDTO
	* @return  
	* @throws
	 */
	@Override
	public PurchasedCustomerDTO getPurchasedCustomerInfo(PurchasedCustomerDTO queryDTO){
		return purchasedCustomerService.getPurchasedCustomerInfo(queryDTO);
	}
	
	/**
	 * @throws Exception 
	* @Title: 修改一条指定的已购买信息，只能修改客户信息
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDTO
	* @return  
	* @throws
	 */
	@Override
	public Object updatePurchasedCustomerInfo(PurchasedCustomerDTO queryDTO){
		purchasedCustomerService.updatePurchasedCustomerInfo(queryDTO);
		return null;
	}

	/**
	 * @Description: 属性 purchasedCustomerService 的get方法 
	 * @return purchasedCustomerService
	 */
	public PurchasedCustomerService getPurchasedCustomerService() {
		return purchasedCustomerService;
	}

	/**
	 * @Description: 属性 purchasedCustomerService 的set方法 
	 * @param purchasedCustomerService 
	 */
	public void setPurchasedCustomerService(
			PurchasedCustomerService purchasedCustomerService) {
		this.purchasedCustomerService = purchasedCustomerService;
	}
	
	
	
}
