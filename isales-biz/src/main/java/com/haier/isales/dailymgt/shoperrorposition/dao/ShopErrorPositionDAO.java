/**
 * @Company 青鸟软通   
 * @Title: ShopErrorPositionDAO.java 
 * @Package  com.haier.isales.dailymgt.shoperrorposition.dao
 * @author John.zhao   
 * @date 2015年03月05日  10:34:57
 * @version V1.0   
 */
package com.haier.isales.dailymgt.shoperrorposition.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.dailymgt.shoperrorposition.domain.ShopErrorPositionDomain;
/** 
 * @ClassName: ShopErrorPositionDAO
 * @Description: ShopErrorPosition的DAO接口定义类
 *  
 */
public interface ShopErrorPositionDAO extends CommonDAO<ShopErrorPositionDomain,Long>{
	public int findInLastHour(@Param("userCode")String userCode);
}
