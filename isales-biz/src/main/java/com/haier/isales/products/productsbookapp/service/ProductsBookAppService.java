/**
 * @Company 青鸟软通   
 * @Title: ProductsBookAppService.java 
 * @Package  com.haier.isales.products.productsbookapp.service
 * @author John.Zhao   
 * @date 2015年01月27日  15:36:15
 * @version V1.0   
 */
package com.haier.isales.products.productsbookapp.service;

import com.haier.isales.products.productsbookapp.domain.ProductsBookAppDomain;

/** 
 * @ClassName: ProductsBookAppService
 * @Description: ProductsBookApp的Service接口定义类
 *  
 */
public interface ProductsBookAppService {

	public ProductsBookAppDomain searchProductsBook(Long metadataid);
		
}
