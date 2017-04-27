/**
 * @Company 青鸟软通   
 * @Title: ProductsParamsDAO.java 
 * @Package  com.haier.isales.products.productsparams.dao
 * @author John.Zhao   
 * @date 2015年01月20日  16:41:50
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsparams.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.products.heretemp.productsparams.domain.ProductsParamsDomain;
/** 
 * @ClassName: ProductsParamsDAO
 * @Description: ProductsParams的DAO接口定义类
 *  
 */
public interface ProductsParamsDAO extends CommonDAO<ProductsParamsDomain,Long>{
	
	/** 
	* @Description: 保存参数-value
	* @author John.zhao   
	* @date 2015-1-26 上午11:25:45 
	* @param list  
	*/ 
	public void saveAllProductParamsValue(@Param("list")List<ProductsParamsDomain> list);
	
	/** 
	* @Description: 删除所有的参数--value
	* @author John.zhao   
	* @date 2015-1-26 上午11:26:13   
	*/ 
	void deleteAllProductParamsValue();
}
