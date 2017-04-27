/**
 * @Company 青鸟软通   
 * @Title: ShopDAO.java 
 * @Package  com.haier.isales.basicinfo.shop.dao
 * @author Guo Yuchao   
 * @date 2014年11月21日  16:50:43
 * @version V1.0   
 */
package com.haier.isales.basicinfo.shop.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.basicinfo.pubarea.domain.PubAreaDomain;
import com.haier.isales.basicinfo.pubarea.dto.PubAreaDTO;
import com.haier.isales.basicinfo.shop.domain.ShopDomain;
/** 
 * @ClassName: ShopDAO
 * @Description: Shop的DAO接口定义类
 *  
 */
public interface ShopDAO extends CommonDAO<ShopDomain,String>{
	/** 
	* @Description:根据门店编码查询门店所属行政区划
	* @author lizhenwei
	* @date 2015-12-10 上午09:26:49 
	* @param domain
	* @return  domain
	*/ 
	String findPaCodeByShopCode(String shopCode);
}
