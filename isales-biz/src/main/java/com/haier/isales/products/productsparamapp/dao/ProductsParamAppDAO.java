/**
 * @Company 青鸟软通   
 * @Title: ProductsParamAppDAO.java 
 * @Package  com.haier.isales.products.productsparamapp.dao
 * @author John.Zhao   
 * @date 2015年01月27日  15:33:47
 * @version V1.0   
 */
package com.haier.isales.products.productsparamapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.products.productsparamapp.domain.ProductsParamAppDomain;
/** 
 * @ClassName: ProductsParamAppDAO
 * @Description: ProductsParamApp的DAO接口定义类
 *  
 */
public interface ProductsParamAppDAO extends CommonDAO<ProductsParamAppDomain,Long>{
	
	List<ProductsParamAppDomain> searchProductsParams(@Param("metadataid")Long metadataid);
	
}
