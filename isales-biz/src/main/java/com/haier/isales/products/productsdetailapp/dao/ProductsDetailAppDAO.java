/**
 * @Company 青鸟软通   
 * @Title: ProductsDetailAppDAO.java 
 * @Package  com.haier.isales.products.productsdetailapp.dao
 * @author John.Zhao   
 * @date 2015年01月27日  13:53:56
 * @version V1.0   
 */
package com.haier.isales.products.productsdetailapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.products.productsdetailapp.domain.ProductsDetailAppDomain;
/** 
 * @ClassName: ProductsDetailAppDAO
 * @Description: ProductsDetailApp的DAO接口定义类
 *  
 */
public interface ProductsDetailAppDAO extends CommonDAO<ProductsDetailAppDomain,Long>{
	
	/** 
	* @Description: 查询产品特性
	* @author John.zhao   
	* @date 2015-1-27 下午1:59:28 
	* @param metadataid
	* @return  
	*/ 
	List<ProductsDetailAppDomain> searchProductsDetail(@Param("metadataid")Long metadataid);
}
