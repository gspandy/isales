/**
 * @Company 青鸟软通   
 * @Title: SalestargetService.java 
 * @Package  com.haier.isales.retail.salestarget.service
 * @author Cao Rui   
 * @date 2014年12月22日  16:32:01
 * @version V1.0   
 */
package com.haier.isales.retail.salestarget.service;

import java.util.List;

import com.haier.isales.retail.salestarget.domain.SalestargetDomain;
import com.haier.isales.retail.salestarget.dto.SalestargetDto;
import com.haier.isales.retail.salestarget.dto.SalestargetQueryDto;
import com.haier.isales.retail.salestarget.dto.SalestargetUpdateDto;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalFullInfoDTO;

/** 
 * @ClassName: SalestargetService
 * @Description: Salestarget的Service接口定义类
 *  
 */
public interface SalestargetService {

	/**
	 * 
	* @Title: 查询销量
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDto
	* @return  
	* @throws
	 */
	public SalestargetDto getSalestarget(SalestargetQueryDto queryDto);
		
	/**
	 * 
	* @Title: getSalestargetList 
	* @Description: 获取个人销量目标列表 用于展示折线图
	* @param queryDto
	* @return  
	* @throws
	 */
	public List<SalestargetDomain> getSalestargetList(SalestargetQueryDto queryDto);
	
	/**
	 * 
	* @Title: updateSalestarget 
	* @Description: 添加销量目标
	* @param updateDto
	* @param personalInfo  
	* @throws
	 */
	public void updateSalestarget(SalestargetUpdateDto updateDto,PersonalFullInfoDTO personalInfo);
}
