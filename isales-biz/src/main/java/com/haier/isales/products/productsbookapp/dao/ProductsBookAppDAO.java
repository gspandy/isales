/**
 * @Company 青鸟软通   
 * @Title: ProductsBookAppDAO.java 
 * @Package  com.haier.isales.products.productsbookapp.dao
 * @author John.Zhao   
 * @date 2015年01月27日  15:36:01
 * @version V1.0   
 */
package com.haier.isales.products.productsbookapp.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.products.productsbookapp.domain.ProductsBookAppDomain;
/** 
 * @ClassName: ProductsBookAppDAO
 * @Description: ProductsBookApp的DAO接口定义类
 *  
 */
public interface ProductsBookAppDAO extends CommonDAO<ProductsBookAppDomain,Long>{
	
	/** 
	* @Description: 说明书
	* @author John.zhao   
	* @date 2015-1-27 下午3:45:44 
	* @param metadataid
	* @return  
	*/ 
	ProductsBookAppDomain searchProductsBook(@Param("metadataid")Long metadataid);
}
