/**
 * @Company 青鸟软通   
 * @Title: ShopEmployeeRefService.java 
 * @Package  com.haier.isales.retail.shopemployeeref.service
 * @author John.Zhao   
 * @date 2015年04月03日  15:41:38
 * @version V1.0   
 */
package com.haier.isales.retail.shopemployeeref.service;

import com.haier.isales.retail.shopemployeeref.domain.ShopEmployeeRefDomain;

/** 
 * @ClassName: ShopEmployeeRefService
 * @Description: ShopEmployeeRef的Service接口定义类
 *  
 */
public interface ShopEmployeeRefService {

	public ShopEmployeeRefDomain findByCodeAndDate(ShopEmployeeRefDomain domain);	
}
