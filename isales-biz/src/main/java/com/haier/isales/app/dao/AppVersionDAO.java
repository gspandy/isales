/**
 * @Company 青鸟软通   
 * @Title: AppVersionDAO.java 
 * @Package  com.haier.isales.app.dao
 * @author Cao Rui   
 * @date 2014年12月08日  14:23:14
 * @version V1.0   
 */
package com.haier.isales.app.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.app.domain.AppVersionDomain;
/** 
 * @ClassName: AppVersionDAO
 * @Description: AppVersion的DAO接口定义类
 *  
 */
public interface AppVersionDAO extends CommonDAO<AppVersionDomain,Long>{
	/**
	 * 
	* @Title: findNewestVersion 
	* @Description: 获取最新一条的应用版本信息
	* @param queryEntity, 目前有用的参数为status
	* @return  
	* @throws
	 */
	AppVersionDomain findNewestVersion(@Param("entity") AppVersionDomain queryEntity);
}
