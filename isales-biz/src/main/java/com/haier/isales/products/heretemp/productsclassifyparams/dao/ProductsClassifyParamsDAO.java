/**
 * @Company 青鸟软通   
 * @Title: ProductsClassifyParamsDAO.java 
 * @Package  com.haier.isales.products.productsclassifyparams.dao
 * @author John.Zhao   
 * @date 2015年01月22日  09:41:17
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsclassifyparams.dao;

import java.util.List;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.products.heretemp.productsclassifyparams.domain.ProductsClassifyParamsDomain;
/** 
 * @ClassName: ProductsClassifyParamsDAO
 * @Description: ProductsClassifyParams的DAO接口定义类
 *  
 */
public interface ProductsClassifyParamsDAO extends CommonDAO<ProductsClassifyParamsDomain,Long>{

	/** 
	* @Description: 保存规格参数的字段
	* @author John.zhao   
	* @date 2015-1-22 上午9:45:45 
	* @param list  
	*/ 
	void saveAllProductsClassifyParams(List<ProductsClassifyParamsDomain> list);

	/** 
	* @Description: 删除所有数据，在每次同步的时候先执行删除操作
	* @author John.zhao   
	* @date 2015-1-22 上午10:12:35   
	*/ 
	void deleteAll();
	
	/** 
	* @Description: 通过视图名查询规格参数的所有字段
	* @author John.zhao   
	* @date 2015-1-22 下午4:10:22 
	* @param viewname 视图名
	* @return  
	*/ 
	List<ProductsClassifyParamsDomain> findParemsCodeByViewName(String viewname);
	
	
}
