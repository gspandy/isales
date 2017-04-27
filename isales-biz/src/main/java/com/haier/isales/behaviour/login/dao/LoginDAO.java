/**
 * @Company 青鸟软通   
 * @Title: LoginDAO.java 
 * @Package  com.haier.isales.behaviour.login.dao
 * @author John Zhao   
 * @date 2014年11月07日  16:29:51
 * @version V1.0   
 */
package com.haier.isales.behaviour.login.dao;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.behaviour.login.domain.LoginDomain;
/** 
 * @ClassName: LoginDAO
 * @Description: Login的DAO接口定义类
 *  
 */
public interface LoginDAO extends CommonDAO<LoginDomain,Long>{

	/** 
	* @Description: 通过sessionID查询这个用户登录时的信息，目的主要是要查询登录的时间来计算在线时长
	* @author John Zhao   
	* @date 2014-11-8 下午4:21:36 
	* @param sessionId  
	*/ 
	LoginDomain findBySessionId(String sessionId);

	/** 
	* @Description: 通过sessionId更新在线时长、退出时间、退出的type
	* @author John Zhao   
	* @date 2014-11-8 下午6:19:38 
	* @param loginDomain  
	*/ 
	Integer updateLoginOut(LoginDomain loginDomain);
	
	
}
