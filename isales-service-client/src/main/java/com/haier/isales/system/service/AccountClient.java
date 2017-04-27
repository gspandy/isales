/**
* @Company 青鸟软通   
* @Title: AccountClient.java 
* @Package com.haier.isales.system.service
* @author Guo Yuchao   
* @date 2014-11-6 17:26:03
* @version V1.0   
*/ 
package com.haier.isales.system.service;

import io.terminus.pampas.client.Export;

/**
 * 供客户端调用的远程接口
 * @author GuoYuchao
 *
 */
public interface AccountClient {
	
	
	
	/** 
	* @Description: 根据用户名和密码做登录验证
	* @author Guo Yuchao   
	* @date 2014-11-6 17:28:26
	* @param String accountName , String password
	* @return  
	*/ 
	@Export(paramNames = {"accountName","password","version"})
	Object checkLoginByNamePwd(String accountName , String password,String version);

	/** 
	* @Description: 验证用户名和密码
	* @author Guo Yuchao   
	* @date 2015-1-15 下午1:34:49 
	* @param username
	* @param password
	* @return  
	*/ 
	@Export(paramNames = {"userCode","password"})
	Object validateUserPassword(String userCode, String password);

	/** 
	* @Description: 修改密码
	* @author Guo Yuchao   
	* @date 2015-1-15 下午1:52:13 
	* @param userCode
	* @param oldPwd
	* @param newPwd
	* @return  
	*/ 
	Object updatePassword(String userCode, String oldPwd, String newPwd);

	/** 
	* @Description: 重置密码
	* @author Guo Yuchao   
	* @date 2015-1-15 下午1:54:27 
	* @param userCode
	* @param idCardNo
	* @return  
	*/ 
	Object resertPassword(String userCode, String idCardNo);

	/** 
	* @Description: 验证用户名和身份证号码
	* @author Guo Yuchao   
	* @date 2015-1-15 下午4:22:05 
	* @param userCode
	* @param idCardNo
	* @return  
	*/ 
	Object checkUserCodeIdCard(String userCode, String idCardNo);
}
