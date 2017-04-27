package com.haier.isales.system.dto;

import java.io.Serializable;

public class UserBriefInfoDTO implements Serializable{

	private static final long serialVersionUID = -2103819799102930574L;
	
	/**
	 * @Fields operatorId : 用户的唯一标识
	 */
	private Long operatorId;
	/**
	 * @Fields operatorName : 用户昵称
	 */
	private String operatorName;
	/**
	 * @Fields userCode :
	 */
	private String userCode;
	
	//====================getters&setters==============
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
	 * @Description: 属性 operatorName 的get方法 
	 * @return operatorName
	 */
	public String getOperatorName() {
		return operatorName;
	}
	/**
	 * @Description: 属性 operatorName 的set方法 
	 * @param operatorName 
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
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
}
