/**
* @Company 青鸟软通   
* @Title: PositionDAO.java 
* @Package com.haier.isales.dailymgt.shopposition.dao 
* @author John.zhao   
* @date 2015-3-2 下午2:09:02 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.shopposition.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.dailymgt.shopposition.domain.ShopPositionDomain;

/** 
 * @ClassName: PositionDAO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public interface PositionDAO {
	
	public ShopPositionDomain findByShopCode(@Param("shopCode")String shopCode);

}
