/**
 * @Company 青鸟软通   
 * @Title: BtbSjcjScrmAllDAO.java 
 * @Package  com.haier.isales.reportretail.dao
 * @author Shao Jingkai   
 * @date 2015年06月23日  09:52:03
 * @version V1.0   
 */
package com.haier.isales.retail.reportretail.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.retail.reportretail.domain.BtbSjcjScrmAllDomain;
/** 
 * @ClassName: BtbSjcjScrmAllDAO
 * @Description: BtbSjcjScrmAll的DAO接口定义类
 *  
 */
public interface BtbSjcjScrmAllDAO extends CommonDAO<BtbSjcjScrmAllDomain,Long>{
	/** 
	* @Description: TODO 根据门店编码和产业编码查找
	* @author Shao Jingkai   
	* @date 2015-6-23 上午10:13:39 
	* @return  
	*/ 
	public BtbSjcjScrmAllDomain findByShopCode(
			@Param("shopCode") String shopCode, @Param("prolineCode") String prolineCode);
}
