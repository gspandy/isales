/**
* @Company 青鸟软通   
* @Title: AppLoginDomain.java 
* @Package com.haier.isales.statistics.applogin.domain 
* @author John.zhao   
* @date 2014-12-4 下午4:34:24 
* @version V1.0   
*/ 
package com.haier.isales.statistics.applogin.domain;

import java.io.Serializable;

/** 
 * @ClassName: AppLoginDomain 
 * TODO(这里用一句话描述这个类的作用) 
 * @author John.zhao 
 */
public class AppLoginDomain implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1920396165581462306L;
	
	private String userId;
	
	private String operatorName;
	
	private Integer loginCount;
	
	private String startTime;
	
	private String endTime;

	/**
	 * 属性 userId 的get方法 
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 属性 userId 的set方法 
	 * @param userId 
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 属性 operatorName 的get方法 
	 * @return operatorName
	 */
	public String getOperatorName() {
		return operatorName;
	}

	/**
	 * 属性 operatorName 的set方法 
	 * @param operatorName 
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	/**
	 * 属性 loginCount 的get方法 
	 * @return loginCount
	 */
	public Integer getLoginCount() {
		return loginCount;
	}

	/**
	 * 属性 loginCount 的set方法 
	 * @param loginCount 
	 */
	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	/**
	 * 属性 startTime 的get方法 
	 * @return startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * 属性 startTime 的set方法 
	 * @param startTime 
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * 属性 endTime 的get方法 
	 * @return endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * 属性 endTime 的set方法 
	 * @param endTime 
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}
