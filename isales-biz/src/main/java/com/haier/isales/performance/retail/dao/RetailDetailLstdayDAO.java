/**
 * @Company 青鸟软通   
 * @Title: RetailDetailLstdayDAO.java 
 * @Package  com.haier.isales.performance.retail.dao
 * @author lizhenwei   
 * @date 2016年05月24日  15:53:56
 * @version V1.0   
 */
package com.haier.isales.performance.retail.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.performance.retail.domain.RetailDetailLstdayDomain;
import com.haier.isales.performance.retail.dto.RetailDTO;
/** 
 * @ClassName: RetailDetailLstdayDAO
 * @Description: RetailDetailLstday的DAO接口定义类
 *  
 */
public interface RetailDetailLstdayDAO extends CommonDAO<RetailDetailLstdayDomain,Long>{
	
	/** 
	* @Description: 业绩 销量查询日销量、日累计提成、日销额 详情
	* @author lizhenwei   
	* @date 2016-04-29 17:46:34 
	* @param retailDTO
	* @return  
	*/ 
	List<RetailDTO> findShopBtbRetailDetailLstday(@Param("model")RetailDTO retailDTO);
	
	/** 
	* @Description: 业绩 销量查询日销量、日累计提成、日销额
	* @author lizhenwei   
	* @date 2016-05-31 11:02:34 
	* @param retailDTO
	* @return  
	*/ 
	RetailDTO findShopBtbRetailLstdayMoney(@Param("model")RetailDTO retailDTO);
}
