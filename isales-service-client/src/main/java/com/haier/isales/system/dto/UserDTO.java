/**
 * @Company 青鸟软通   
 * @Title: UserDTO.java 
 * @Package com.haier.isales.system 
 * @author Guo Yuchao   
 * @date 2014-10-28 上午9:54:37 
 * @version V1.0   
 */
package com.haier.isales.system.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: UserDTO
 * @Description: 用户对应的
 * 
 */
public class UserDTO implements Serializable {

	private static final long serialVersionUID = -1415868819314L;

	/**
	 * @Fields operatorId : 用户的唯一标识
	 */
	private Long operatorId;
	/**
	 * @Fields orgCode : 组织编号
	 */
	private String orgCode;
	/**
	 * @Fields operatorName : 用户昵称
	 */
	private String operatorName;
	/**
	 * @Fields loginName : 登录名
	 */
	private String loginName;
	/**
	 * @Fields mobile : 移动电话
	 */
	private String mobile;
	/**
	 * @Fields password :
	 */
	private String password;
	/**
	 * @Fields status : 用户状态:101可用，102注销，在业务字典中管理
	 */
	private String status;
	/**
	 * @Fields createTime : 用户创建时间
	 */
	private java.util.Date createTime;
	/**
	 * @Fields userType : 区分后台管理用户 还是 前台用户（使用app的用户、海尔员工）
	 */
	private String userType;
	/**
	 * @Fields auditStatus : 用户审核状态，未审核的不允许登录
	 */
	private String auditStatus;
	/**
	 * @Fields userCode :
	 */
	private String userCode;
	/**
	 * @Fields createId : 添加人id
	 */
	private Long createId;
	/**
	 * @Fields createName : 添加人姓名
	 */
	private String createName;
	/**
	 * @Fields updateId : 修改人id
	 */
	private Long updateId;
	/**
	 * @Fields updateName : 修改人姓名
	 */
	private String updateName;
	/** 
	* @Fields updateTime : 修改时间
	*/ 
	private Date updateTime;
	
	// deviceMac  added by lizhenwei
	private String clientMac;
	
	/* =========================getter and setter =================== */

	/**
	 * @return the clientMac
	 */
	public String getClientMac() {
		return clientMac;
	}

	/**
	 * @param clientMac the clientMac to set
	 */
	public void setClientMac(String clientMac) {
		this.clientMac = clientMac;
	}

	/**
	 * @Description: 属性 operatorId 的get方法
	 * @return id
	 */
	public Long getOperatorId() {
		return this.operatorId;
	}

	/**
	 * @Description: 属性 operatorId 的set方法
	 * @param id
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * @Description: 属性 orgCode 的get方法
	 * @return id
	 */
	public String getOrgCode() {
		return this.orgCode;
	}

	/**
	 * @Description: 属性 orgCode 的set方法
	 * @param id
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	/**
	 * @Description: 属性 operatorName 的get方法
	 * @return id
	 */
	public String getOperatorName() {
		return this.operatorName;
	}

	/**
	 * @Description: 属性 operatorName 的set方法
	 * @param id
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	/**
	 * @Description: 属性 loginName 的get方法
	 * @return id
	 */
	public String getLoginName() {
		return this.loginName;
	}

	/**
	 * @Description: 属性 loginName 的set方法
	 * @param id
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @Description: 属性 mobile 的get方法
	 * @return id
	 */
	public String getMobile() {
		return this.mobile;
	}

	/**
	 * @Description: 属性 mobile 的set方法
	 * @param id
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @Description: 属性 password 的get方法
	 * @return id
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @Description: 属性 password 的set方法
	 * @param id
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @Description: 属性 status 的get方法
	 * @return id
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * @Description: 属性 status 的set方法
	 * @param id
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @Description: 属性 createTime 的get方法
	 * @return id
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}

	/**
	 * @Description: 属性 createTime 的set方法
	 * @param id
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @Description: 属性 userType 的get方法
	 * @return id
	 */
	public String getUserType() {
		return this.userType;
	}

	/**
	 * @Description: 属性 userType 的set方法
	 * @param id
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @Description: 属性 auditStatus 的get方法
	 * @return id
	 */
	public String getAuditStatus() {
		return this.auditStatus;
	}

	/**
	 * @Description: 属性 auditStatus 的set方法
	 * @param id
	 */
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	/**
	 * @Description: 属性 userCode 的get方法
	 * @return id
	 */
	public String getUserCode() {
		return this.userCode;
	}

	/**
	 * @Description: 属性 userCode 的set方法
	 * @param id
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	/**
	 * @Description: 属性 createId 的get方法
	 * @return id
	 */
	public Long getCreateId() {
		return this.createId;
	}

	/**
	 * @Description: 属性 createId 的set方法
	 * @param id
	 */
	public void setCreateId(Long createId) {
		this.createId = createId;
	}

	/**
	 * @Description: 属性 createName 的get方法
	 * @return id
	 */
	public String getCreateName() {
		return this.createName;
	}

	/**
	 * @Description: 属性 createName 的set方法
	 * @param id
	 */
	public void setCreateName(String createName) {
		this.createName = createName;
	}

	/**
	 * @Description: 属性 updateId 的get方法
	 * @return id
	 */
	public Long getUpdateId() {
		return this.updateId;
	}

	/**
	 * @Description: 属性 updateId 的set方法
	 * @param id
	 */
	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}

	/**
	 * @Description: 属性 updateName 的get方法
	 * @return id
	 */
	public String getUpdateName() {
		return this.updateName;
	}

	/**
	 * @Description: 属性 updateName 的set方法
	 * @param id
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	/**
	 * @Description: 属性 updateTime 的get方法 
	 * @return updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @Description: 属性 updateTime 的set方法 
	 * @param updateTime 
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午6:57:26 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "UserDTO [operatorId=" + operatorId + ", orgCode=" + orgCode
				+ ", operatorName=" + operatorName + ", loginName=" + loginName
				+ ", mobile=" + mobile + ", password=" + password + ", status="
				+ status + ", createTime=" + createTime + ", userType="
				+ userType + ", auditStatus=" + auditStatus + ", userCode="
				+ userCode + ", createId=" + createId + ", createName="
				+ createName + ", updateId=" + updateId + ", updateName="
				+ updateName + ", updateTime=" + updateTime + "]";
	}



}
