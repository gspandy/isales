/**
* @Company 青鸟软通   
* @Title: LoginDomain.java 
* @Package com.haier.isales.behaviour.login.domain 
* @author John Zhao   
* @date 2014年11月08日  16:44:24 
* @version V1.0   
*/ 
package com.haier.isales.behaviour.login.domain;

import java.io.Serializable;

/** 
 * @ClassName: LoginDomain 
 * t_sys_login_behaviour 自动生成的对应的实体对象   
 *  
 */
public class LoginDomain implements Serializable{
	private static final long serialVersionUID = -1415436264295L;

	private Long id;		//主键

	private Long userId;	//登录用户ID

	private String loginName;	//登录名

	private String sessionId;	//本次登录唯一标示

	private java.util.Date loginTime;	//登录时间

	private String userIp;	//用户ip地址

	private String userDevice;	//访问设备 101：手机 102：PC 103：PAD

	private String clientMac;	//客户端mac

	private String clientType;	//客户端类型,安卓、IOS、各种浏览器

	private String clientVersion;	//安卓版本号、IOS版本号、浏览器版本号

	private String clientOsType;	//操作系统,不是用字典，通过程序获取到客户端操作系统后，直接存储相应的名称（如 android、ios、windows）即可

	private String clientOsVersion;	//客户端操作系统的版本号，如windows的7、8、9，android的4.1、4.2等

	private Long onlineTime;	//本次登录时长

	private java.util.Date logoutTime;	//登出时间

	private String logoutType;	//登出类型,数据字典 101：用户主动退出，102：用户超时退出，103：登录失败

	private String clientInfo;	//客户端详细信息，存储以上字段以外的信息，比如分辨率等

	private String remark;	//备注
		
	/*=========================getter and setter ===================*/
	/**
	 * 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 属性 userId 的get方法 
	 * @return id
	 */
	public Long getUserId() {
		return this.userId;
	}
	/**
	 * 属性 userId 的set方法 
	 * @param id 
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 属性 loginName 的get方法 
	 * @return id
	 */
	public String getLoginName() {
		return this.loginName;
	}
	/**
	 * 属性 loginName 的set方法 
	 * @param id 
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * 属性 sessionId 的get方法 
	 * @return id
	 */
	public String getSessionId() {
		return this.sessionId;
	}
	/**
	 * 属性 sessionId 的set方法 
	 * @param id 
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	/**
	 * 属性 loginTime 的get方法 
	 * @return id
	 */
	public java.util.Date getLoginTime() {
		return this.loginTime;
	}
	/**
	 * 属性 loginTime 的set方法 
	 * @param id 
	 */
	public void setLoginTime(java.util.Date loginTime) {
		this.loginTime = loginTime;
	}
	/**
	 * 属性 userIp 的get方法 
	 * @return id
	 */
	public String getUserIp() {
		return this.userIp;
	}
	/**
	 * 属性 userIp 的set方法 
	 * @param id 
	 */
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	/**
	 * 属性 userDevice 的get方法 
	 * @return id
	 */
	public String getUserDevice() {
		return this.userDevice;
	}
	/**
	 * 属性 userDevice 的set方法 
	 * @param id 
	 */
	public void setUserDevice(String userDevice) {
		this.userDevice = userDevice;
	}
	/**
	 * 属性 clientMac 的get方法 
	 * @return id
	 */
	public String getClientMac() {
		return this.clientMac;
	}
	/**
	 * 属性 clientMac 的set方法 
	 * @param id 
	 */
	public void setClientMac(String clientMac) {
		this.clientMac = clientMac;
	}
	/**
	 * 属性 clientType 的get方法 
	 * @return id
	 */
	public String getClientType() {
		return this.clientType;
	}
	/**
	 * 属性 clientType 的set方法 
	 * @param id 
	 */
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	/**
	 * 属性 clientVersion 的get方法 
	 * @return id
	 */
	public String getClientVersion() {
		return this.clientVersion;
	}
	/**
	 * 属性 clientVersion 的set方法 
	 * @param id 
	 */
	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}
	/**
	 * 属性 clientOsType 的get方法 
	 * @return id
	 */
	public String getClientOsType() {
		return this.clientOsType;
	}
	/**
	 * 属性 clientOsType 的set方法 
	 * @param id 
	 */
	public void setClientOsType(String clientOsType) {
		this.clientOsType = clientOsType;
	}
	/**
	 * 属性 clientOsVersion 的get方法 
	 * @return id
	 */
	public String getClientOsVersion() {
		return this.clientOsVersion;
	}
	/**
	 * 属性 clientOsVersion 的set方法 
	 * @param id 
	 */
	public void setClientOsVersion(String clientOsVersion) {
		this.clientOsVersion = clientOsVersion;
	}
	/**
	 * 属性 onlineTime 的get方法 
	 * @return id
	 */
	public Long getOnlineTime() {
		return this.onlineTime;
	}
	/**
	 * 属性 onlineTime 的set方法 
	 * @param id 
	 */
	public void setOnlineTime(Long onlineTime) {
		this.onlineTime = onlineTime;
	}
	/**
	 * 属性 logoutTime 的get方法 
	 * @return id
	 */
	public java.util.Date getLogoutTime() {
		return this.logoutTime;
	}
	/**
	 * 属性 logoutTime 的set方法 
	 * @param id 
	 */
	public void setLogoutTime(java.util.Date logoutTime) {
		this.logoutTime = logoutTime;
	}
	/**
	 * 属性 logoutType 的get方法 
	 * @return id
	 */
	public String getLogoutType() {
		return this.logoutType;
	}
	/**
	 * 属性 logoutType 的set方法 
	 * @param id 
	 */
	public void setLogoutType(String logoutType) {
		this.logoutType = logoutType;
	}
	/**
	 * 属性 clientInfo 的get方法 
	 * @return id
	 */
	public String getClientInfo() {
		return this.clientInfo;
	}
	/**
	 * 属性 clientInfo 的set方法 
	 * @param id 
	 */
	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
	}
	/**
	 * 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: LoginDomain 自动生成的hashcode方法</p> 
	* @author John Zhao   
	* @date 2014年11月08日  16:44:24
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((id == null) ? 0 : id.hashCode());
		return result;
	}
	/**
	* <p>Description:LoginDomain 自动生成的equals方法 </p> 
	* @author John Zhao   
	* @date 2014年11月08日  16:44:24
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		LoginDomain other =(LoginDomain) obj;

		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (id == null) {if (other.id != null){ return false;} else if (!id.equals(other.id)){ return false;}}
		*/
		if (id == null) {
			if (other.id != null){ 
				return false;
			}
		}else if (!id.equals(other.id)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:LoginDomain 自动生成的toString方法 </p> 
	* @author John Zhao   
	* @date 2014年11月08日  16:44:24 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "LoginDomain [" +
					"id=" + id + "," + 
					"userId=" + userId + "," + 
					"loginName=" + loginName + "," + 
					"sessionId=" + sessionId + "," + 
					"loginTime=" + loginTime + "," + 
					"userIp=" + userIp + "," + 
					"userDevice=" + userDevice + "," + 
					"clientMac=" + clientMac + "," + 
					"clientType=" + clientType + "," + 
					"clientVersion=" + clientVersion + "," + 
					"clientOsType=" + clientOsType + "," + 
					"clientOsVersion=" + clientOsVersion + "," + 
					"onlineTime=" + onlineTime + "," + 
					"logoutTime=" + logoutTime + "," + 
					"logoutType=" + logoutType + "," + 
					"clientInfo=" + clientInfo + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
