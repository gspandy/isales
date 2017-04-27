/**
 * @Company 青鸟软通   
 * @Title: ProductsClassifyParamsService.java 
 * @Package  com.haier.isales.products.productsclassifyparams.service
 * @author John.Zhao   
 * @date 2015年01月22日  09:42:22
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsclassifyparams.service;

/**
 * @ClassName: ProductsClassifyParamsService
 * @Description: ProductsClassifyParams的Service接口定义类
 * 
 */
public interface ProductsClassifyParamsService {

	public void saveProductsClassifyParams();

	public void getSingleData(String viewName, String fieldGroups);

}
