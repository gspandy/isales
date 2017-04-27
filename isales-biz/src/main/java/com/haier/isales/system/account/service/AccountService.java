/**
 * @Company 青鸟软通   
 * @Title: AccountService.java 
 * @Package  com.haier.isales.system.account.service
 * @author Guo Yuchao   
 * @date 2014年11月06日  15:40:35
 * @version V1.0   
 */
package com.haier.isales.system.account.service;

import java.util.List;

import com.haier.isales.common.ScoreResult;
import com.haier.isales.system.account.domain.AccountDomain;


/** 
 * @ClassName: AccountService
 * @Description: Account的Service接口定义类
 *  
 */
public interface AccountService {
	/** 
	* @Description: 根据用户名和密码登录验证
	* @author Guo Yuchao   
	* @date 2014-11-6 下午4:26:25 
	* @param accountName
	* @param password
	* @return  
	*/ 
	ScoreResult checkLoginByNamePwd(String accountName ,String password,String version);
		
	
	/** 
	* @Description: 根据主键查询账号信息
	* @author Guo Yuchao   
	* @date 2014-11-25 下午1:20:50 
	* @param id
	* @return  
	*/ 
	AccountDomain findByid(Long id);

	/** 
	* @Description: 验证用户名和密码 
	* @author Guo Yuchao   
	* @date 2015-1-15 下午1:37:50 
	* @param username
	* @param password
	* @return  
	*/ 
	String checkUserPassword(String username, String password);

	/** 
	* @Description:修改密码
	* @author Guo Yuchao   
	* @date 2015-1-15 下午1:56:51 
	* @param userCode
	* @param oldPwd
	* @param newPwd
	* @return  
	*/ 
	Object updatePassword(String userCode, String oldPwd, String newPwd);

	/** 
	* @Description: 重置密码
	* @author Guo Yuchao   
	* @date 2015-1-15 下午1:57:06 
	* @param userCode
	* @param idCardNo
	* @return  
	*/ 
	Object saveResetPassword(String userCode, String idCardNo);

	/** 
	* @Description:验证用户名和身份证号码
	* @author Guo Yuchao   
	* @date 2015-1-15 下午4:23:53 
	* @param userCode
	* @param idCardNo
	* @return  
	*/ 
	String checkUserCodeIdCard(String userCode, String idCardNo);
	/** 
	* @Description: 发短信
	* @author Guo Yuchao   
	* @date 2015-1-19 下午1:50:52 
	* @param mobileList
	* @param mobileMessage
	* @return  
	*/ 
	boolean createMessage(List<String> mobileList, String mobileMessage);
}
