/**
* @Company 青鸟软通   
* @Title: User.java 
* @Package com.haier.isales.system 
* @author Cao Rui   
* @date 2014-10-28 上午9:54:37 
* @version V1.0   
*/ 
package com.haier.isales.system.monitor.domain;

import java.util.Date;

import com.haier.openplatform.domain.BaseDomain;

/** 
 * @ClassName: User 
 * 用户信息表对应的实体类 
 *  
 */
public class SysMonitorLog extends BaseDomain<Long> {

	/** 
	* @Fields serialVersionUID :版本号
	*/ 
	private static final long serialVersionUID = -1L;
	
	private Long logId; // 
	private Long userId; // 用户id
	private String userName; // 用户名
	private String userInfoJson;  //  用户实体json
	private String userIp; // 用户ip
	private Date operateDate; // 操作时间
	private String operateType; // 操作类型
	private String operationId; // 操作对象
	private String operationName; // 操作对象名称
	private String executeClass; // 调用类
	private String executeFunction; // 调用方法
	private String executeParamsJson; // 调用参数json
	private String remark; // 备注

	/** 
	* <p>Description: </p> 
	* @author Cao Rui   
	* @date 2014-10-28 上午10:00:05  
	*/ 
	public SysMonitorLog() {
	}

	/**
	 * 属性 logId 的get方法 
	 * @return logId
	 */
	public Long getLogId() {
		return logId;
	}

	/**
	 * 属性 logId 的set方法 
	 * @param logId 
	 */
	public void setLogId(Long logId) {
		this.logId = logId;
	}

	/**
	 * 属性 userId 的get方法 
	 * @return userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * 属性 userId 的set方法 
	 * @param userId 
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * 属性 userName 的get方法 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 属性 userName 的set方法 
	 * @param userName 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 属性 userInfoJson 的get方法 
	 * @return userInfoJson
	 */
	public String getUserInfoJson() {
		return userInfoJson;
	}

	/**
	 * 属性 userInfoJson 的set方法 
	 * @param userInfoJson 
	 */
	public void setUserInfoJson(String userInfoJson) {
		this.userInfoJson = userInfoJson;
	}

	/**
	 * 属性 userIp 的get方法 
	 * @return userIp
	 */
	public String getUserIp() {
		return userIp;
	}

	/**
	 * 属性 userIp 的set方法 
	 * @param userIp 
	 */
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	/**
	 * 属性 operateDate 的get方法 
	 * @return operateDate
	 */
	public Date getOperateDate() {
		return operateDate;
	}

	/**
	 * 属性 operateDate 的set方法 
	 * @param operateDate 
	 */
	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	/**
	 * 属性 operateType 的get方法 
	 * @return operateType
	 */
	public String getOperateType() {
		return operateType;
	}

	/**
	 * 属性 operateType 的set方法 
	 * @param operateType 
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	/**
	 * 属性 operationId 的get方法 
	 * @return operationId
	 */
	public String getOperationId() {
		return operationId;
	}

	/**
	 * 属性 operationId 的set方法 
	 * @param operationId 
	 */
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	/**
	 * 属性 operationName 的get方法 
	 * @return operationName
	 */
	public String getOperationName() {
		return operationName;
	}

	/**
	 * 属性 operationName 的set方法 
	 * @param operationName 
	 */
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	/**
	 * 属性 executeClass 的get方法 
	 * @return executeClass
	 */
	public String getExecuteClass() {
		return executeClass;
	}

	/**
	 * 属性 executeClass 的set方法 
	 * @param executeClass 
	 */
	public void setExecuteClass(String executeClass) {
		this.executeClass = executeClass;
	}

	/**
	 * 属性 executeFunction 的get方法 
	 * @return executeFunction
	 */
	public String getExecuteFunction() {
		return executeFunction;
	}

	/**
	 * 属性 executeFunction 的set方法 
	 * @param executeFunction 
	 */
	public void setExecuteFunction(String executeFunction) {
		this.executeFunction = executeFunction;
	}

	/**
	 * 属性 executeParamsJson 的get方法 
	 * @return executeParamsJson
	 */
	public String getExecuteParamsJson() {
		return executeParamsJson;
	}

	/**
	 * 属性 executeParamsJson 的set方法 
	 * @param executeParamsJson 
	 */
	public void setExecuteParamsJson(String executeParamsJson) {
		this.executeParamsJson = executeParamsJson;
	}

	/**
	 * 属性 remark 的get方法 
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 属性 remark 的set方法 
	 * @param remark 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
