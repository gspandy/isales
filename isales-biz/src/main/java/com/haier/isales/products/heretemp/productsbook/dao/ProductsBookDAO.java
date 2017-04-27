/**
 * @Company 青鸟软通   
 * @Title: ProductsBookDAO.java 
 * @Package  com.haier.isales.products.productsbook.dao
 * @author John.Zhao   
 * @date 2015年01月22日  16:45:15
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsbook.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.products.heretemp.productsbook.domain.ProductsBookDomain;

/**
 * @ClassName: ProductsBookDAO
 * @Description: ProductsBook的DAO接口定义类
 * 
 */
public interface ProductsBookDAO extends CommonDAO<ProductsBookDomain, Long> {

	/** 
	* @Description: 保存说明书
	* @author John.zhao   
	* @date 2015-1-22 下午4:59:27 
	* @param list  
	*/ 
	public void saveAllProductsBook(@Param("list") List<ProductsBookDomain> list);
	
	/** 
	* @Description: 删除所有的说明书
	* @author John.zhao   
	* @date 2015-1-26 上午11:21:27   
	*/ 
	void deleteAllProductsBook();
}
