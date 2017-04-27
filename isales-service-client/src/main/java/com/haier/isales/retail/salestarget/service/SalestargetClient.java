/**
 * @Company 青鸟软通   
 * @Title: SearchSalesClient.java 
 * @Package com.haier.isales.retail.searchsales.service 
 * @author John Zhao   
 * @date 2014-11-17 上午11:24:25 
 * @version V1.0   
 */
package com.haier.isales.retail.salestarget.service;

import com.haier.isales.retail.salestarget.dto.SalestargetUpdateDto;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalFullInfoDTO;

/**
 * @ClassName: SearchSalesClient
 * @Description: 提报的销量数据查询
 * 
 */
public interface SalestargetClient {

	/**
	 * 
	* @Title: updateSalestarget 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param updateDto
	* @param personalInfo  
	* @throws
	 */
	public Object updateSalestarget(SalestargetUpdateDto updateDto,PersonalFullInfoDTO personalInfo);

}
