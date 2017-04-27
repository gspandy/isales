/**
 * @Company 青鸟软通   
 * @Title: ProductsInfoAppDAO.java 
 * @Package  com.haier.isales.products.productsinfoapp.dao
 * @author John.Zhao   
 * @date 2015年01月28日  15:14:15
 * @version V1.0   
 */
package com.haier.isales.products.productsinfoapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bana.common.util.page.PageCond;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.products.dto.ProductsInfoSearchDTO;
import com.haier.isales.products.productsinfoapp.domain.ProductLineDomain;
import com.haier.isales.products.productsinfoapp.domain.ProductsInfoAppDomain;
/** 
 * @ClassName: ProductsInfoAppDAO
 * @Description: ProductsInfoApp的DAO接口定义类
 *  
 */
public interface ProductsInfoAppDAO extends CommonDAO<ProductsInfoAppDomain,Long>{

	
	/** 
	* @Description: 产业线列表下拉框
	* @author John.zhao   
	* @date 2015-1-30 上午9:49:01 
	* @return  
	*/ 
	List<ProductLineDomain> searchProductLineList(@Param("userCode")String userCode);
	
	/** 
	* @Description: 产品百科列表
	* @author John.zhao   
	* @date 2015-1-30 上午9:48:59 
	* @param productsInfoSearchDTO
	* @param proList
	* @param pageCond
	* @return  
	*/ 
	List<ProductsInfoAppDomain> searchProductsInfoList(@Param("searchDTO")ProductsInfoSearchDTO productsInfoSearchDTO,@Param("productsNoNameList")List<String> proList,@Param("pageCond")PageCond pageCond);


	/** 
	* @Description: 根据型号编码获取产品百科的信息
	* @author Liu Wenjie   
	* @date 2015-3-11 下午4:38:59 
	* @param muduleCode
	* @return  
	*/ 
	ProductsInfoAppDomain searchProductsInfoByModuleCode(@Param("moduleCode") String muduleCode);
}
