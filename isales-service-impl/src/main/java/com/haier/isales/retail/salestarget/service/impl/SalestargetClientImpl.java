/**
* @Company 青鸟软通   
* @Title: SalestargetClientImpl.java 
* @Package com.haier.isales.retail.salestarget.service.impl 
* @author Cao Rui   
* @date 2014-12-23 下午2:16:45 
* @version V1.0   
*/ 
package com.haier.isales.retail.salestarget.service.impl;

import org.apache.log4j.Logger;

import com.haier.isales.retail.salestarget.dto.SalestargetUpdateDto;
import com.haier.isales.retail.salestarget.service.SalestargetClient;
import com.haier.isales.retail.salestarget.service.SalestargetService;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalFullInfoDTO;

/** 
 * @ClassName: SalestargetClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class SalestargetClientImpl implements SalestargetClient{
	
	private static Logger logger = Logger.getLogger(SalestargetClientImpl.class);
	private SalestargetService salestargetService;
	
	/**
	 * 
	* @Title: updateSalestarget 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param updateDto
	* @param personalInfo  
	* @throws
	 */
	@Override
	public Object updateSalestarget(SalestargetUpdateDto updateDto,PersonalFullInfoDTO personalInfo){
		
		logger.info("直销员维护个人销售目标的dubbo方法");
		
		salestargetService.updateSalestarget(updateDto, personalInfo);
		return null;
	}

	/*==================getter/setter=================================*/
	
	/**
	 * @Description: 属性 salestargetService 的set方法 
	 * @param salestargetService 
	 */
	public void setSalestargetService(SalestargetService salestargetService) {
		this.salestargetService = salestargetService;
	}

}
