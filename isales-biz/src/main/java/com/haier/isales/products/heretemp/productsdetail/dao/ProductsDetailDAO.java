/**
 * @Company 青鸟软通   
 * @Title: ProductsDetailDAO.java 
 * @Package  com.haier.isales.products.productsdetail.dao
 * @author John.Zhao   
 * @date 2015年01月22日  17:49:07
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsdetail.dao;

import java.util.List;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.products.heretemp.productsdetail.domain.ProductsDetailDomain;
/** 
 * @ClassName: ProductsDetailDAO
 * @Description: ProductsDetail的DAO接口定义类
 *  
 */
public interface ProductsDetailDAO extends CommonDAO<ProductsDetailDomain,Long>{
	/** 
	* @Description: 保存所有的产品详情
	* @author John.zhao   
	* @date 2015-1-22 下午6:03:24 
	* @param list  
	*/ 
	public void saveAllProductsDetail(List<ProductsDetailDomain> list);
	
	/** 
	* @Description: 删除所有的产品详情
	* @author John.zhao   
	* @date 2015-1-26 上午11:23:47   
	*/ 
	void deleteAllProductsDetail();
}
