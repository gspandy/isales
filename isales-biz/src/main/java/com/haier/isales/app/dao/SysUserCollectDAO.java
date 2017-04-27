/**
 * @Company 青鸟软通   
 * @Title: SysUserCollectDAO.java 
 * @Package  com.haier.isales.app.dao
 * @author lizhenwei   
 * @date 2016年04月22日  14:32:17
 * @version V1.0   
 */
package com.haier.isales.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.app.domain.SysUserCollectDomain;
import com.haier.isales.app.domain.SysUserDomain;
/** 
 * @ClassName: SysUserCollectDAO
 * @Description: SysUserCollect的DAO接口定义类
 *  
 */
public interface SysUserCollectDAO extends CommonDAO<SysUserCollectDomain,Long>{
	/**
	 * @Title: updateCollect
	* @Description: 更新收藏状态(添加，取消)
	* @param 
	* @return  
	* @throws
	 */
	Integer updateCollect(@Param("entity") SysUserCollectDomain entity);
	
	List<SysUserCollectDomain> findUserCollectByParams(@Param("entity") SysUserCollectDomain entity);
}
