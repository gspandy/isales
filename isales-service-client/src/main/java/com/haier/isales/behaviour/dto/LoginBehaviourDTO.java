/**
 * @Company 青鸟软通   
 * @Title: LoginBehaviourDTO.java 
 * @Package com.haier.isales.behaviour.dto 
 * @author John Zhao   
 * @date 2014-11-7 下午7:21:59 
 * @version V1.0   
 */
package com.haier.isales.behaviour.dto;

import java.io.Serializable;

/**
 * @ClassName: LoginBehaviourDTO
 * @Description: 登录/退出行为dto
 * 
 */
public class LoginBehaviourDTO implements Serializable {

	/**
	 * @Fields serialVersionUID : 
	 */
	private static final long serialVersionUID = -3096990102283739692L;
	/** 
	* @Fields USERDEVICE_* : 访问设备 101：手机 102：PC 103：PAD
	*/ 
	public static final String USERDEVICE_APP = "101";
	public static final String USERDEVICE_PC = "102";
	public static final String USERDEVICE_PAD = "103";
	/** 
	* @Fields LOGOUTTYPE_* : 101：用户主动退出，102：用户超时退出，103：登录失败
	*/ 
	public static final String LOGOUTTYPE_ACTIVE = "101";
	public static final String LOGOUTTYPE_TIMEOUT = "102";
	public static final String LOGOUTTYPE_FALSE = "103";
	/**
	 * @Fields id :
	 */
	private Long id;
	/**
	 * @Fields userId : 登录用户ID
	 */
	private Long userId;
	/**
	 * @Fields loginName : 登录名
	 */
	private String loginName;
	/**
	 * @Fields sessionId : 本次登录唯一标示
	 */
	private String sessionId;
	/**
	 * @Fields loginTime : 登录时间
	 */
	private java.util.Date loginTime;
	/**
	 * @Fields userIp : 用户ip地址
	 */
	private String userIp;
	/**
	 * @Fields userDevice : 访问设备 101：手机 102：PC 103：PAD
	 */
	private String userDevice;
	/**
	 * @Fields clientMac : 客户端mac
	 */
	private String clientMac;
	/**
	 * @Fields clientType : 客户端类型,安卓、IOS、各种浏览器
	 */
	private String clientType;
	/**
	 * @Fields clientVersion : 安卓版本号、IOS版本号、浏览器版本号
	 */
	private String clientVersion;
	/**
	 * @Fields clientOsType : 操作系统,不是用字典，通过程序获取到客户端操作系统后，直接存储相应的名称（如
	 *         android、ios、windows）即可
	 */
	private String clientOsType;
	/**
	 * @Fields clientOsVersion : 客户端操作系统的版本号，如windows的7、8、9，android的4.1、4.2等
	 */
	private String clientOsVersion;
	/**
	 * @Fields onlineTime : 本次登录时长
	 */
	private Long onlineTime;
	/**
	 * @Fields logoutTime : 登出时间
	 */
	private java.util.Date logoutTime;
	/**
	 * @Fields logoutType : 登出类型,数据字典 101：用户主动退出，102：用户超时退出，103：登录失败
	 */
	private String logoutType;
	/**
	 * @Fields clientInfo : 客户端详细信息，存储以上字段以外的信息，比如分辨率等
	 */
	private String clientInfo;
	/**
	 * @Fields remark : 备注
	 */
	private String remark;
	
	/*==================getters & setters================*/
	/**
	 * @Description: 属性 id 的get方法
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @Description: 属性 id 的set方法
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @Description: 属性 loginName 的get方法
	 * @return loginName
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @Description: 属性 loginName 的set方法
	 * @param loginName
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @Description: 属性 sessionId 的get方法
	 * @return sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * @Description: 属性 sessionId 的set方法
	 * @param sessionId
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * @Description: 属性 loginTime 的get方法
	 * @return loginTime
	 */
	public java.util.Date getLoginTime() {
		return loginTime;
	}

	/**
	 * @Description: 属性 loginTime 的set方法
	 * @param loginTime
	 */
	public void setLoginTime(java.util.Date loginTime) {
		this.loginTime = loginTime;
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
	 * @Description: 属性 userDevice 的get方法
	 * @return userDevice
	 */
	public String getUserDevice() {
		return userDevice;
	}

	/**
	 * @Description: 属性 userDevice 的set方法
	 * @param userDevice
	 */
	public void setUserDevice(String userDevice) {
		this.userDevice = userDevice;
	}

	/**
	 * @Description: 属性 clientMac 的get方法
	 * @return clientMac
	 */
	public String getClientMac() {
		return clientMac;
	}

	/**
	 * @Description: 属性 clientMac 的set方法
	 * @param clientMac
	 */
	public void setClientMac(String clientMac) {
		this.clientMac = clientMac;
	}

	/**
	 * @Description: 属性 clientType 的get方法
	 * @return clientType
	 */
	public String getClientType() {
		return clientType;
	}

	/**
	 * @Description: 属性 clientType 的set方法
	 * @param clientType
	 */
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	/**
	 * @Description: 属性 clientVersion 的get方法
	 * @return clientVersion
	 */
	public String getClientVersion() {
		return clientVersion;
	}

	/**
	 * @Description: 属性 clientVersion 的set方法
	 * @param clientVersion
	 */
	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	/**
	 * @Description: 属性 clientOsType 的get方法
	 * @return clientOsType
	 */
	public String getClientOsType() {
		return clientOsType;
	}

	/**
	 * @Description: 属性 clientOsType 的set方法
	 * @param clientOsType
	 */
	public void setClientOsType(String clientOsType) {
		this.clientOsType = clientOsType;
	}

	/**
	 * @Description: 属性 clientOsVersion 的get方法
	 * @return clientOsVersion
	 */
	public String getClientOsVersion() {
		return clientOsVersion;
	}

	/**
	 * @Description: 属性 clientOsVersion 的set方法
	 * @param clientOsVersion
	 */
	public void setClientOsVersion(String clientOsVersion) {
		this.clientOsVersion = clientOsVersion;
	}

	/**
	 * @Description: 属性 onlineTime 的get方法
	 * @return onlineTime
	 */
	public Long getOnlineTime() {
		return onlineTime;
	}

	/**
	 * @Description: 属性 onlineTime 的set方法
	 * @param onlineTime
	 */
	public void setOnlineTime(Long onlineTime) {
		this.onlineTime = onlineTime;
	}

	/**
	 * @Description: 属性 logoutTime 的get方法
	 * @return logoutTime
	 */
	public java.util.Date getLogoutTime() {
		return logoutTime;
	}

	/**
	 * @Description: 属性 logoutTime 的set方法
	 * @param logoutTime
	 */
	public void setLogoutTime(java.util.Date logoutTime) {
		this.logoutTime = logoutTime;
	}

	/**
	 * @Description: 属性 logoutType 的get方法
	 * @return logoutType
	 */
	public String getLogoutType() {
		return logoutType;
	}

	/**
	 * @Description: 属性 logoutType 的set方法
	 * @param logoutType
	 */
	public void setLogoutType(String logoutType) {
		this.logoutType = logoutType;
	}

	/**
	 * @Description: 属性 clientInfo 的get方法
	 * @return clientInfo
	 */
	public String getClientInfo() {
		return clientInfo;
	}

	/**
	 * @Description: 属性 clientInfo 的set方法
	 * @param clientInfo
	 */
	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
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
	
	/*=================toString==================*/
	/**
	* <p>Description: LoginBehaviourDTO自动生成的toString方法</p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:12:21 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "LoginBehaviourDTO [id=" + id + ", userId=" + userId
				+ ", loginName=" + loginName + ", sessionId=" + sessionId
				+ ", loginTime=" + loginTime + ", userIp=" + userIp
				+ ", userDevice=" + userDevice + ", clientMac=" + clientMac
				+ ", clientType=" + clientType + ", clientVersion="
				+ clientVersion + ", clientOsType=" + clientOsType
				+ ", clientOsVersion=" + clientOsVersion + ", onlineTime="
				+ onlineTime + ", logoutTime=" + logoutTime + ", logoutType="
				+ logoutType + ", clientInfo=" + clientInfo + ", remark="
				+ remark + "]";
	}
}
