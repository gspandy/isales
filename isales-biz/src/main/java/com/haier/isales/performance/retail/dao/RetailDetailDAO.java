/**
 * @Company 青鸟软通   
 * @Title: RetailDetailDAO.java 
 * @Package  com.haier.isales.performance.retail.dao
 * @author lizhenwei   
 * @date 2016年05月24日  15:53:16
 * @version V1.0   
 */
package com.haier.isales.performance.retail.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.performance.retail.domain.RetailDetailDomain;
import com.haier.isales.performance.retail.dto.RetailDTO;
/** 
 * @ClassName: RetailDetailDAO
 * @Description: RetailDetail的DAO接口定义类
 *  
 */
public interface RetailDetailDAO extends CommonDAO<RetailDetailDomain,Long>{
	/** 
	* @Description: 业绩 销量查询月销量、月累计提成、月销额 详情
	* @author lizhenwei   
	* @date 2016-04-29 17:46:34 
	* @param retailDTO
	* @return  
	*/ 
	List<RetailDTO> findShopBtbRetailDetail(@Param("model")RetailDTO retailDTO);
	
	/** 
	* @Description: 业绩 销量查询月销量、月累计提成、月销额
	* @author lizhenwei   
	* @date 2016-04-31 17:46:34 
	* @param retailDTO
	* @return  
	*/ 
	RetailDTO findShopBtbRetailMoney(@Param("model")RetailDTO retailDTO);
}
