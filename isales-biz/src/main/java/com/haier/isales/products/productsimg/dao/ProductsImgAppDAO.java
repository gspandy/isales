/**
 * @Company 青鸟软通   
 * @Title: ProductsImgDAO.java 
 * @Package  com.haier.isales.products.productsimg.dao
 * @author John.Zhao   
 * @date 2015年01月27日  10:24:18
 * @version V1.0   
 */
package com.haier.isales.products.productsimg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.products.productsimg.domain.ProductsImgDomain;
/** 
 * @ClassName: ProductsImgDAO
 * @Description: ProductsImg的DAO接口定义类
 *  
 */
public interface ProductsImgAppDAO extends CommonDAO<ProductsImgDomain,Long>{
	
	/** 
	* @Description: 根据产品型号的主键查询套图列表
	* @author John.zhao   
	* @date 2015-1-27 上午10:27:57 
	* @param metadataid
	* @return  
	*/ 
	List<ProductsImgDomain> searchProductsImages(@Param("metadataid")Long metadataid);
}
