/**
 * @Company 青鸟软通   
 * @Title: ProductsFAQDAO.java 
 * @Package  com.haier.isales.products.productsfaq.dao
 * @author John.Zhao   
 * @date 2015年01月22日  15:15:56
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsfaq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.products.heretemp.productsfaq.domain.ProductsFAQDomain;
/** 
 * @ClassName: ProductsFAQDAO
 * @Description: ProductsFAQ的DAO接口定义类
 *  
 */
public interface ProductsFAQDAO extends CommonDAO<ProductsFAQDomain,Long>{
	
	/** 
	* @Description: 保存常见问题
	* @author John.zhao   
	* @date 2015-1-26 上午11:24:29 
	* @param list  
	*/ 
	void saveAllProductsFAQ(@Param("list")List<ProductsFAQDomain> list);
	
	/** 
	* @Description: 删除所有的常见问题
	* @author John.zhao   
	* @date 2015-1-26 上午11:24:32   
	*/ 
	void deleteAllProductsFAQ();
}
