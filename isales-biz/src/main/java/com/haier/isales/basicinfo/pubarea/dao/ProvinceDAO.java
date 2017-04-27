/**
 * @Company 青鸟软通   
 * @Title: ShopDAO.java 
 * @Package  com.haier.isales.basicinfo.shop.dao
 * @author Guo Yuchao   
 * @date 2014年11月21日  16:50:43
 * @version V1.0   
 */
package com.haier.isales.basicinfo.pubarea.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.basicinfo.pubarea.domain.ProvinceDomain;
import com.haier.isales.common.dao.CommonDAO;
/** 
 * @ClassName: ProvinceDAO
 * @Description: Province的DAO接口定义类
 *  
 */
public interface ProvinceDAO extends CommonDAO<ProvinceDomain,String>{
	
	/** 
	* @Description:查询省信息
	* @author lizhenwei
	* @date 2015-11-05 上午10:26:49 
	* @param userCode
	* @return  domain
	*/ 
	List<ProvinceDomain> findProvinceInfo(ProvinceDomain entity);
	
}
