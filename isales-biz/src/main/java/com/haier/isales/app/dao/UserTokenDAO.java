/**
 * @Company 青鸟软通   
 * @Title: UserTokenDAO.java 
 * @Package  com.haier.isales.app.dao
 * @author lizhenwei
 * @date 2015年12月29日  14:03:14
 * @version V1.0   
 */
package com.haier.isales.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.app.domain.UserTokenDomain;
import com.haier.isales.app.dto.UserTokenDTO;
import com.haier.isales.common.dao.CommonDAO;
/** 
 * @ClassName: UserTokenDAO
 * @Description: UserToken的DAO接口定义类
 *  
 */
public interface UserTokenDAO extends CommonDAO<UserTokenDomain,Long>{
	/**
	 * 
	* @Title: findUserToken
	* @Description: 获取用户Token
	* @param 
	* @return  
	* @throws
	 */
	List<UserTokenDomain> findUserToken(@Param("entity") UserTokenDTO queryDTO);
	
	/**
	 *  更新用户Token信息
	* @Title: updateStatus 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param userTokenDomain
	* @return  
	* @throws
	 */
	Integer updateUserToken(UserTokenDomain userTokenDomain);
}
