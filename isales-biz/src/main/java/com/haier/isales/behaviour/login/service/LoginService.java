/**
 * @Company 青鸟软通   
 * @Title: LoginService.java 
 * @Package  com.haier.isales.behaviour.login.service
 * @author John Zhao   
 * @date 2014年11月07日  16:38:02
 * @version V1.0   
 */
package com.haier.isales.behaviour.login.service;

import com.haier.isales.behaviour.login.domain.LoginDomain;

/** 
 * @ClassName: LoginService
 * @Description: Login的Service接口定义类
 *  
 */
public interface LoginService {

	/** 
	* @Description: 保存登录/登出操作记录
	* @author John Zhao   
	* @date 2014-11-7 下午4:41:35 
	* @param loginDomain  
	*/ 
	void saveLoginBehaviourLog(LoginDomain loginDomain);
	LoginDomain findById(Long id);
	void updateLoginOutBehaviourLog(LoginDomain loginDomain);
}
