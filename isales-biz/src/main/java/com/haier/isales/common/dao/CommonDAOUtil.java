/**
* @Company 青鸟软通   
* @Title: CommonDAOUtil.java 
* @Package com.haier.isales.common.dao 
* @author Liu Wenjie   
* @date 2014-11-25 下午4:58:38 
* @version V1.0   
*/ 
package com.haier.isales.common.dao;

import org.apache.ibatis.annotations.Param;

/** 
 * @ClassName: CommonDAOUtil 
 * @Description: 公共的DAO工具方法
 *  
 */
public interface CommonDAOUtil {

	/** 
	* @Description: 根据表名和库名，查询是否存在
	* @author Liu Wenjie   
	* @date 2014-11-25 下午5:00:17 
	* @param schame
	* @param tableName
	* @return  
	*/ 
	boolean tableIsExist(@Param("schame")String schame,@Param("tableName")String tableName);
	
}
