/**
* @Company 青鸟软通   
* @Title: UserTokenDomain.java 
* @Package com.haier.isales.app.domain 
* @author lizhenwei   
* @date 2015年12月29日  14:09:22 
* @version V1.0   
*/ 
package com.haier.isales.app.dto;

import java.io.Serializable;

/** 
 * @ClassName: UserTokenDTO 
 * @Description:自动生成的对应的实体对象   
 *  
 */
public class UserTokenDTO implements Serializable{

	private static final long serialVersionUID = 5731884332811146884L;
	
	/** 
	* @Fields id : id
	*/
	private Long id;
	/** 
	* @Fields userCode : 用户工号
	*/
	private String userCode;
	/** 
	* @Fields userId : 用户Id
	*/
	private String userId;
	/** 
	* @Fields userToken : 用户Token
	*/
	private String userToken;
	
	/*=========================getter and setter ===================*/
	
	/**
	 * @Description: 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * @Description: 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the userCode
	 */
	public String getUserCode() {
		return userCode;
	}
	/**
	 * @param userCode the userCode to set
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the userToken
	 */
	public String getUserToken() {
		return userToken;
	}
	/**
	 * @param userToken the userToken to set
	 */
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	
}
