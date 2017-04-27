/**
 * @Company 青鸟软通   
 * @Title: ShopEmployeeRefDAO.java 
 * @Package  com.haier.isales.retail.shopemployeeref.dao
 * @author John.Zhao   
 * @date 2015年04月03日  15:37:43
 * @version V1.0   
 */
package com.haier.isales.retail.shopemployeeref.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.retail.shopemployeeref.domain.ShopEmployeeRefDomain;
/** 
 * @ClassName: ShopEmployeeRefDAO
 * @Description: ShopEmployeeRef的DAO接口定义类
 *  
 */
public interface ShopEmployeeRefDAO extends CommonDAO<ShopEmployeeRefDomain,Long>{
	
	ShopEmployeeRefDomain findByCodeAndDate(@Param("entity")ShopEmployeeRefDomain entity);

}
