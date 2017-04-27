/**
 * @Company 青鸟软通   
 * @Title: RetailDAO.java 
 * @Package  com.haier.isales.performance.retail.dao
 * @author John.zhao   
 * @date 2014年12月22日  14:41:06
 * @version V1.0   
 */
package com.haier.isales.performance.retail.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.performance.retail.domain.RetailDomain;
import com.haier.isales.performance.retail.dto.RetailStructureDTO;
/** 
 * @ClassName: RetailDAO
 * @Description: Retail的DAO接口定义类
 * 
 */
public interface RetaiStructurelDAO extends CommonDAO<RetailDomain, String> {
	/** 
	* @Description: 业绩 产品结构
	* @author wp
	* @date 2016-06-24 
	* @param RetailStructureDTO
	* @return  
	*/ 
	List<RetailStructureDTO> findShopBtbRetailStructure(@Param("model")RetailStructureDTO retailStructureDTO);
}
