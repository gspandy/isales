/**
 * @Company 青鸟软通   
 * @Title: SearchSalesClient.java 
 * @Package com.haier.isales.retail.searchsales.service 
 * @author John Zhao   
 * @date 2014-11-17 上午11:24:25 
 * @version V1.0   
 */
package com.haier.isales.retail.searchsales.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.retail.searchsales.dto.SearchModelSalesDTO;
import com.haier.isales.retail.searchsales.dto.SearchRetailDTO;

/**
 * @ClassName: SearchSalesClient
 * @Description: 提报的销量数据查询
 * 
 */
public interface SearchSalesServiceClient {

	/**
	 * @Description: 按照型号提报的销量数据查询(查询自己系统的数据，条码和型号使用一个接口)
	 * @author John Zhao
	 * @date 2014-11-17 上午11:48:21
	 * @param searchModelSalesDTO
	 * @return
	 */
	@Export(paramNames = { "searchModelSalesDTO" })
	public Object searchModelSales(SearchModelSalesDTO searchModelSalesDTO);

	/** 
	* @Description: 查询自主经营体系统的联网销量
	* @author John.zhao   
	* @date 2015-3-9 上午10:49:50 
	* @param SearchRetailDTO
	* @return  
	*/ 
	public Object searchRetailModelInZZJYT(SearchRetailDTO searchRetailDTO);
	
	/** 
	* @Description: 查询自主经营体系统的条码销量
	* @author John.zhao   
	* @date 2015-3-9 上午10:49:54 
	* @param SearchRetailDTO
	* @return  
	*/
	public Object searchRetailBarCodeInZZJYT(SearchRetailDTO searchRetailDTO);
	/**
	* <p>Description: 查询差异会员明细</p> 
	* @author Cao Rui   
	* @date 2015-7-22  下午10:50:59 
	* @param SearchRetailDTO
	* @return 
	* @see com.haier.isales.retail.searchsales.service.SearchSalesServiceClient#searchRetailMembersDiff(com.haier.isales.retail.searchsales.dto.SearchRetailDTO) 
	*/ 
	public Object searchRetailMembersDiff(SearchRetailDTO searchRetailDTO);
}
