/**
 * @Company 青鸟软通   
 * @Title: ProductsDetailAppService.java 
 * @Package  com.haier.isales.products.productsdetailapp.service
 * @author John.Zhao   
 * @date 2015年01月27日  13:54:27
 * @version V1.0   
 */
package com.haier.isales.products.productsdetailapp.service;

import java.util.List;

import com.haier.isales.products.productsdetailapp.domain.ProductsDetailAppDomain;

/** 
 * @ClassName: ProductsDetailAppService
 * @Description: ProductsDetailApp的Service接口定义类
 *  
 */
public interface ProductsDetailAppService {
	
	public List<ProductsDetailAppDomain> searchProductsDetail(Long metadataid);

		
}
