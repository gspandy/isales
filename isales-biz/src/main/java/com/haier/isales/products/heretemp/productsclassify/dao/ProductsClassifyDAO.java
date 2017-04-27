/**
 * @Company 青鸟软通   
 * @Title: ProductsClassifyDAO.java 
 * @Package  com.haier.isales.products.productsclassify.dao
 * @author John.Zhao   
 * @date 2015年01月20日  16:37:52
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsclassify.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.products.heretemp.productsclassify.domain.ProductsClassifyDomain;
/** 
 * @ClassName: ProductsClassifyDAO
 * @Description: ProductsClassify的DAO接口定义类
 *  
 */
public interface ProductsClassifyDAO extends CommonDAO<ProductsClassifyDomain,String>{
	
	/** 
	* @Description: 保存视图信息
	* @author John.zhao   
	* @date 2015-1-22 下午4:21:37 
	* @param list  
	*/ 
	public void saveAllProductInfo(@Param("list")List<ProductsClassifyDomain> list);

	/** 
	* @Description: 查询获取所有的视图数据
	* @author John.zhao
	* @date 2015-1-21 上午9:53:49   
	*/ 
	public List<ProductsClassifyDomain> getAllProductInfo();
	/** 
	* @Description: 在每次同步数据之前，删除所有的数据
	* @author John.zhao
	* @date 2015-1-22 下午4:20:53   
	*/
	void deleteAll();
}
