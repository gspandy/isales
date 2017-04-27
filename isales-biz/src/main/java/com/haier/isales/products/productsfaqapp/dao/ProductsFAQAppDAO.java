/**
 * @Company 青鸟软通   
 * @Title: ProductsFAQAppDAO.java 
 * @Package  com.haier.isales.products.productsfaqapp.dao
 * @author John.Zhao   
 * @date 2015年01月28日  10:03:35
 * @version V1.0   
 */
package com.haier.isales.products.productsfaqapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.products.productsfaqapp.domain.ProductsFAQAppDomain;
/** 
 * @ClassName: ProductsFAQAppDAO
 * @Description: ProductsFAQApp的DAO接口定义类
 *  
 */
public interface ProductsFAQAppDAO extends CommonDAO<ProductsFAQAppDomain,Long>{
	
	/** 
	* @Description: 常见问题
	* @author John.zhao   
	* @date 2015-1-28 上午10:05:57 
	* @param metadataid
	* @return  
	*/ 
	List<ProductsFAQAppDomain> searchProductsFAQs(@Param("metadataid")Long metadataid);

}
