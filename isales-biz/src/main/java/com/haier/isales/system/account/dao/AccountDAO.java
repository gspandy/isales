/**
 * @Company 青鸟软通   
 * @Title: AccountDAO.java 
 * @Package  com.haier.isales.system.account.dao
 * @author Guo Yuchao   
 * @date 2014年11月06日  15:39:08
 * @version V1.0   
 */
package com.haier.isales.system.account.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.system.account.domain.AccountDomain;
/** 
 * @ClassName: AccountDAO
 * @Description: Account的DAO接口定义类
 *  
 */
public interface AccountDAO extends CommonDAO<AccountDomain,Long>{
	
	/** 
	* @Description:根据登录名查询登录信息的方法
	* @author Guo Yuchao   
	* @date 2014-11-6 下午4:18:49 
	* @param accountName
	* @return  
	*/ 
	AccountDomain findByAccountName(@Param("accountName")String accountName);
	/** 
	* @Description: 根据operatorId查询任何一个登录信息
	* @author Guo Yuchao   
	* @date 2014-11-25 上午11:07:49 
	* @param operatorId
	* @return  
	*/ 
	AccountDomain findOneByOperatorId(@Param("operatorId")Long operatorId);
	/** 
	* @Description: 根据operatorId查询登录信息
	* @author Guo Yuchao   
	* @date 2014-11-25 上午11:23:50 
	* @param operatorId
	* @return  
	*/ 
	List<AccountDomain> findByOperatorId(@Param("operatorId")Long operatorId);
	/** 
	* @Description: 
	* @author Guo Yuchao   
	* @date 2014-11-25 上午11:32:33 
	* @param operatorId
	* @param newPwd
	* @return  
	*/ 
	int updateAccountPwdByOperatorId(@Param("operatorId") Long operatorId,
			@Param("newPwd") String newPwd);
	
}
