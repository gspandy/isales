/**
* @Company 青鸟软通   
* @Title: ProductsServiceClient.java 
* @Package com.haier.isales.products 
* @author John.zhao   
* @date 2015-1-27 上午10:37:30 
* @version V1.0   
*/ 
package com.haier.isales.products.service;

import com.haier.isales.products.dto.ProductsInfoSearchDTO;

/** 
 * @ClassName: ProductsServiceClient 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public interface ProductsSelectServiceClient {
	
	/** 
	* @Description: 产业线列表
	* @author John.zhao   
	* @date 2015-1-30 上午10:05:23 
	* @return  
	*/ 
	public Object searchProductLineList(String userCode);
	
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2015-1-28 下午4:29:46 
	* @param productsInfoSearchDTO
	* @param currentPage
	* @param pageSize
	* @return  
	*/ 
	public Object getProductsPagerListLike(ProductsInfoSearchDTO productsInfoSearchDTO ,Integer currentPage,Integer pageSize);
	
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2015-1-28 下午4:28:10 
	* @param metaDataId
	* @return  
	*/ 
	public Object searchProductsImages(Long metaDataId);
	
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2015-1-28 下午4:28:08 
	* @param metaDataId
	* @return  
	*/ 
	public Object searchProductsDetail(Long metaDataId);

	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2015-1-28 下午4:28:06 
	* @param metaDataId
	* @return  
	*/ 
	public Object searchProductsParams(Long metaDataId);
	
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2015-1-28 下午4:28:04 
	* @param metaDataId
	* @return  
	*/ 
	public Object searchProductsBooks(Long metaDataId);

	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2015-1-28 上午10:16:51 
	* @param metaDataId
	* @return  
	*/ 
	public Object searchProductsFAQs(Long metaDataId);
	
}
