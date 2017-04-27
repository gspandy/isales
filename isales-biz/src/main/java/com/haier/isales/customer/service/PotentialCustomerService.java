/**
 * @Company 青鸟软通   
 * @Title: CustomerService.java 
 * @Package  com.haier.isales.customer.service
 * @author Cao Rui   
 * @date 2014年11月12日  12:04:03
 * @version V1.0   
 */
package com.haier.isales.customer.service;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.common.ScoreResult;
import com.haier.isales.customer.domain.PotentialCustomerDomain;
import com.haier.isales.customer.dto.PotentialCustomerDTO;

/** 
 * @ClassName: CustomerService
 * @Description: Customer的Service接口定义类
 *  
 */
public interface PotentialCustomerService {

	/**
	* @Title: 查询潜客列表
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryEntity
	* @param pageCond
	* @return  
	* @throws
	 */
	public PageResult<PotentialCustomerDomain> getPotentialCustomerList(PotentialCustomerDTO queryEntity,PageCond pageCond);
		
	/**
	 * @throws Exception 
	* @Title: 查询一个潜客的详情
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryEntity
	* @return  
	* @throws
	 */
	public PotentialCustomerDomain getPotentialCustomerInfo(PotentialCustomerDTO queryEntity);
	
	/**
	 * 直销员添加潜客信息
	* @Title: savePotentialCustomer 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param saveDto  
	* @throws
	 */
	public ScoreResult savePotentialCustomer(PotentialCustomerDTO saveDto);
	
	/**
	 * 直销员修改潜客信息
	* @Title: updatePotentialCustomer 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param saveDto  
	* @throws
	 */
	public void updatePotentialCustomer(PotentialCustomerDTO saveDto);
	
	/**
	 * 直销员修改潜客信息
	* @Title: updatePotentialCustomer 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param saveDto  
	* @throws
	 */
	public void deletePotentialCustomer(PotentialCustomerDTO deleteDto);
}
