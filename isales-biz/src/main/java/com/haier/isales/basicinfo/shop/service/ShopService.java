/**
 * @Company 青鸟软通   
 * @Title: ShopService.java 
 * @Package  com.haier.isales.basicinfo.shop.service
 * @author Guo Yuchao   
 * @date 2014年11月21日  16:52:08
 * @version V1.0   
 */
package com.haier.isales.basicinfo.shop.service;

import com.haier.isales.basicinfo.shop.domain.ShopDomain;

/** 
 * @ClassName: ShopService
 * @Description: Shop的Service接口定义类
 *  
 */
public interface ShopService {

		/** 
		* @Description: 根据主键查询门店信息
		* @author Guo Yuchao   
		* @date 2014-11-21 下午4:58:48 
		* @param shopCode
		* @return  
		*/ 
		ShopDomain findById(String shopCode);
}
