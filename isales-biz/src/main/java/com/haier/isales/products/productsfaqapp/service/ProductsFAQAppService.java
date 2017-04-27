/**
 * @Company 青鸟软通   
 * @Title: ProductsFAQAppService.java 
 * @Package  com.haier.isales.products.productsfaqapp.service
 * @author John.Zhao   
 * @date 2015年01月28日  10:04:21
 * @version V1.0   
 */
package com.haier.isales.products.productsfaqapp.service;

import java.util.List;

import com.haier.isales.products.productsfaqapp.domain.ProductsFAQAppDomain;

/** 
 * @ClassName: ProductsFAQAppService
 * @Description: ProductsFAQApp的Service接口定义类
 *  
 */
public interface ProductsFAQAppService {

	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2015-1-28 上午10:12:15 
	* @param metadataid
	* @return  
	*/ 
	List<ProductsFAQAppDomain> searchProductsFAQs(Long metadataid);
		
}
