/**
 * @Company 青鸟软通   
 * @Title: ProductsImgService.java 
 * @Package  com.haier.isales.products.productsimg.service
 * @author John.Zhao   
 * @date 2015年01月27日  10:29:41
 * @version V1.0   
 */
package com.haier.isales.products.productsimg.service;

import java.util.List;

import com.haier.isales.products.productsimg.domain.ProductsImgDomain;

/** 
 * @ClassName: ProductsImgService
 * @Description: ProductsImg的Service接口定义类
 *  
 */
public interface ProductsImgAppService {
	
	/** 
	* @Description: 查询套图
	* @author John.zhao   
	* @date 2015-1-27 上午10:33:41 
	* @param metadataid
	* @return  
	*/ 
	public List<ProductsImgDomain> searchProductsImages(Long metadataid);
	
}
