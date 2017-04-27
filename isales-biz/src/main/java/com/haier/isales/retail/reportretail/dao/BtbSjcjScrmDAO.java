/**
 * @Company 青鸟软通   
 * @Title: BtbSjcjScrmDAO.java 
 * @Package  com.haier.isales.reportretail.dao
 * @author Shao Jingkai   
 * @date 2015年06月23日  09:51:33
 * @version V1.0   
 */
package com.haier.isales.retail.reportretail.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.performance.retail.dto.RetailDTO;
import com.haier.isales.retail.reportretail.domain.BtbSjcjScrmDomain;
/** 
 * @ClassName: BtbSjcjScrmDAO
 * @Description: BtbSjcjScrm的DAO接口定义类
 *  
 */
public interface BtbSjcjScrmDAO extends CommonDAO<BtbSjcjScrmDomain,Long>{
	/** 
	* @Description: TODO 根据门店编码和产业编码查找
	* @author Shao Jingkai   
	* @date 2015-6-23 上午10:11:54 
	* @return  
	*/ 
	public BtbSjcjScrmDomain findByShopCode(
			@Param("shopCode") String shopCode, @Param("prolineCode") String prolineCode);
	
	/** 
	* @Description: 业绩 销量查询门店目标销量、实际销量、提成   参数时间格式 yyyy-MM  返回值时间格式 yy-M
	* @author lizhenwei   
	* @date 2016-04-29 17:46:34 
	* @param retailDTO
	* @return  
	*/ 
	List<RetailDTO> findShopBtbRetail(@Param("model")RetailDTO retailDTO);
	
	/** 
	* @Description: 业绩-销量 查询门店T-1日销量、当月累计销量，个人T-1日提成、当月累计提成 
	* @author lizhenwei   
	* @date 2016-04-29 17:46:34 
	* @param retailDTO
	* @return  
	*/ 
	RetailDTO findShopBtbRetailBonus(@Param("model")RetailDTO retailDTO);
}
