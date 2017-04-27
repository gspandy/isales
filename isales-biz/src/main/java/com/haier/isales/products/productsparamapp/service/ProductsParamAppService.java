/**
 * @Company 青鸟软通   
 * @Title: ProductsParamAppService.java 
 * @Package  com.haier.isales.products.productsparamapp.service
 * @author John.Zhao   
 * @date 2015年01月27日  15:34:10
 * @version V1.0   
 */
package com.haier.isales.products.productsparamapp.service;

import java.util.List;

import com.haier.isales.products.productsparamapp.domain.ProductsParamAppDomain;

/** 
 * @ClassName: ProductsParamAppService
 * @Description: ProductsParamApp的Service接口定义类
 *  
 */
public interface ProductsParamAppService {

	public List<ProductsParamAppDomain> searchProductsParams(Long metadataid);
}
