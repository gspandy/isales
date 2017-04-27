package com.haier.isales.monitor.dto;

import java.io.Serializable;
import java.util.Date;

public class SysMonitorLogDTO implements Serializable {
	private static final long serialVersionUID = -6696200705881135054L;
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
	 * @Description: 属性 logId 的get方法 
	 * @return logId
	 */
	public Long getLogId() {
		return logId;
	}

	/**
	 * @Description: 属性 logId 的set方法 
	 * @param logId 
	 */
	public void setLogId(Long logId) {
		this.logId = logId;
	}

	/**
	 * @Description: 属性 userId 的get方法 
	 * @return userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @Description: 属性 userId 的set方法 
	 * @param userId 
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
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
	 * @Description: 属性 userInfoJson 的get方法 
	 * @return userInfoJson
	 */
	public String getUserInfoJson() {
		return userInfoJson;
	}

	/**
	 * @Description: 属性 userInfoJson 的set方法 
	 * @param userInfoJson 
	 */
	public void setUserInfoJson(String userInfoJson) {
		this.userInfoJson = userInfoJson;
	}

	/**
	 * @Description: 属性 userIp 的get方法 
	 * @return userIp
	 */
	public String getUserIp() {
		return userIp;
	}

	/**
	 * @Description: 属性 userIp 的set方法 
	 * @param userIp 
	 */
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	/**
	 * @Description: 属性 operateDate 的get方法 
	 * @return operateDate
	 */
	public Date getOperateDate() {
		return operateDate;
	}

	/**
	 * @Description: 属性 operateDate 的set方法 
	 * @param operateDate 
	 */
	public void setOperateDate(Date operateDate) {
		this.operateDate = operateDate;
	}

	/**
	 * @Description: 属性 operateType 的get方法 
	 * @return operateType
	 */
	public String getOperateType() {
		return operateType;
	}

	/**
	 * @Description: 属性 operateType 的set方法 
	 * @param operateType 
	 */
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	/**
	 * @Description: 属性 operationId 的get方法 
	 * @return operationId
	 */
	public String getOperationId() {
		return operationId;
	}

	/**
	 * @Description: 属性 operationId 的set方法 
	 * @param operationId 
	 */
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	/**
	 * @Description: 属性 operationName 的get方法 
	 * @return operationName
	 */
	public String getOperationName() {
		return operationName;
	}

	/**
	 * @Description: 属性 operationName 的set方法 
	 * @param operationName 
	 */
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	/**
	 * @Description: 属性 executeClass 的get方法 
	 * @return executeClass
	 */
	public String getExecuteClass() {
		return executeClass;
	}

	/**
	 * @Description: 属性 executeClass 的set方法 
	 * @param executeClass 
	 */
	public void setExecuteClass(String executeClass) {
		this.executeClass = executeClass;
	}

	/**
	 * @Description: 属性 executeFunction 的get方法 
	 * @return executeFunction
	 */
	public String getExecuteFunction() {
		return executeFunction;
	}

	/**
	 * @Description: 属性 executeFunction 的set方法 
	 * @param executeFunction 
	 */
	public void setExecuteFunction(String executeFunction) {
		this.executeFunction = executeFunction;
	}

	/**
	 * @Description: 属性 executeParamsJson 的get方法 
	 * @return executeParamsJson
	 */
	public String getExecuteParamsJson() {
		return executeParamsJson;
	}

	/**
	 * @Description: 属性 executeParamsJson 的set方法 
	 * @param executeParamsJson 
	 */
	public void setExecuteParamsJson(String executeParamsJson) {
		this.executeParamsJson = executeParamsJson;
	}

	/**
	 * @Description: 属性 remark 的get方法 
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @Description: 属性 remark 的set方法 
	 * @param remark 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:06:20 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "SysMonitorLogDTO [logId=" + logId + ", userId=" + userId
				+ ", userName=" + userName + ", userInfoJson=" + userInfoJson
				+ ", userIp=" + userIp + ", operateDate=" + operateDate
				+ ", operateType=" + operateType + ", operationId="
				+ operationId + ", operationName=" + operationName
				+ ", executeClass=" + executeClass + ", executeFunction="
				+ executeFunction + ", executeParamsJson=" + executeParamsJson
				+ ", remark=" + remark + "]";
	}

}
