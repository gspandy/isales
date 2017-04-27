/**
* @Company 青鸟软通   
* @Title: CheckUserInTableDTO.java 
* @Package com.haier.isales.retail.updatesales.dto 
* @author John.zhao   
* @date 2015-3-17 下午2:09:55 
* @version V1.0   
*/ 
package com.haier.isales.retail.updatesales.dto;

import java.io.Serializable;

/** 
 * @ClassName: CheckUserInTableDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class CheckUserInTableDTO implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 5688420710683286116L;

	/** 
	* @Fields userCode : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private String userCode;
	
	/** 
	* @Fields userName : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private String userName;
	
	/** 
	* @Fields operatorId : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private Long operatorId;
	
	/** 
	* @Fields result : 判断结果
	*/ 
	private boolean result;
	
	/*=============getters & setters===============*/
	/**
	 * @Description: 属性 userCode 的get方法 
	 * @return userCode
	 */
	public String getUserCode() {
		return userCode;
	}
	/**
	 * @Description: 属性 userCode 的set方法 
	 * @param userCode 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * @Description: 属性 userName 的get方法 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @Description: 属性 userName 的set方法 
	 * @param userName 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @Description: 属性 operatorId 的get方法 
	 * @return operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}
	/**
	 * @Description: 属性 operatorId 的set方法 
	 * @param operatorId 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * @Description: 属性 result 的get方法 
	 * @return result
	 */
	public boolean isResult() {
		return result;
	}
	/**
	 * @Description: 属性 result 的set方法 
	 * @param result 
	 */
	public void setResult(boolean result) {
		this.result = result;
	}
}
