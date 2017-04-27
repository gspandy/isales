/**
 * @Company 青鸟软通   
 * @Title: ProductsImgDAO.java 
 * @Package  com.haier.isales.products.productsimg.dao
 * @author John.Zhao   
 * @date 2015年01月23日  09:33:06
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsimg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.products.heretemp.productsimg.domain.ProductsImgDomain;
/** 
 * @ClassName: ProductsImgDAO
 * @Description: ProductsImg的DAO接口定义类
 *  
 */
public interface ProductsImgDAO extends CommonDAO<ProductsImgDomain,Long>{
	
	/** 
	* @Description: 保存套图数据
	* @author John.zhao   
	* @date 2015-1-23 上午9:38:59 
	* @param list  
	*/ 
	void saveAllProductsImages(@Param("list")List<ProductsImgDomain> list);
	
	/** 
	* @Description: 删除所有的套图
	* @author John.zhao   
	* @date 2015-1-26 上午11:25:23   
	*/ 
	void deleteAllProductsImages();
}
