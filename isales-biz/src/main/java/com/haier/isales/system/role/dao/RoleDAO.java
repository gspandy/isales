/**
 * @Company 青鸟软通   
 * @Title: RoleDAO.java 
 * @Package  com.haier.isales.system.role.dao
 * @author Liu Wenjie   
 * @date 2014年11月03日  17:16:39
 * @version V1.0   
 */
package com.haier.isales.system.role.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.system.role.domain.RoleDomain;
/** 
 * @ClassName: RoleDAO
 * @Description: Role的DAO接口定义类
 *  
 */
public interface RoleDAO extends CommonDAO<RoleDomain,String>{
	/** 
	* @Description:根据用户id返回角色列表
	* @author Guo Yuchao   
	* @date 2014-11-12 下午10:58:10 
	* @param operatorId
	* @return  
	*/ 
	List<RoleDomain> findByUserId(@Param("operatorId")Long operatorId);
}
