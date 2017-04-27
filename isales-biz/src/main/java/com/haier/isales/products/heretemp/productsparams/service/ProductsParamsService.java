/**
 * @Company 青鸟软通   
 * @Title: ProductsParamsService.java 
 * @Package  com.haier.isales.products.productsparams.service
 * @author John.Zhao   
 * @date 2015年01月20日  17:06:13
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsparams.service;

/** 
 * @ClassName: ProductsParamsService
 * @Description: ProductsParams的Service接口定义类
 *  
 */
public interface ProductsParamsService {
	
	/** 
	* @Description: 保存规格参数的数据
	* @author John.zhao   
	* @date 2015-1-22 下午2:41:17   
	*/ 
	public void saveProductsParams();
	
	public void getSingleData(String viewName,String fieldGroups);
	
}
