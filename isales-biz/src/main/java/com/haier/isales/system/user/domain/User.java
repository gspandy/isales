/**
* @Company 青鸟软通   
* @Title: User.java 
* @Package com.haier.isales.system.user.domain 
* @author Liu Wenjie   
* @date 2014年11月13日  16:53:39 
* @version V1.0   
*/ 
package com.haier.isales.system.user.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: User 
 * t_qn_user 自动生成的对应的实体对象   
 *  
 */
public class User implements Serializable{
	private static final long serialVersionUID = -1415868819313L;
	
	public static final String PASSWORD = "a3c7c03f705ca496904ad56c48c4ae62";//默认密码 Haier,123

	private Long operatorId;	//用户的唯一标识
	private String orgCode;	//	组织编号
	private String operatorName;	//	用户昵称
	private String loginName;	//	登录名
	private String mobile;	//	移动电话
	private String password;	//	密码
	private String status;	//	用户状态:101可用，102注销，在业务字典中管理
	private Date createTime;	//	用户创建时间
	private String userType;	//	区分后台管理用户 还是 前台用户（使用app的用户、海尔员工）
	private String auditStatus;	//	用户审核状态，未审核的不允许登录
	private String userCode;	//	用户编号
	private Long createId;	//	添加人id
	private String createName;	//	添加人姓名
	private Long updateId;	//	修改人id
	private String updateName;	//	修改人姓名
	private Date updateTime;	//	修改时间
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 operatorId 的get方法 
	 * @return id
	 */
	public Long getOperatorId() {
		return this.operatorId;
	}
	/**
	 * 属性 operatorId 的set方法 
	 * @param id 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * 属性 orgCode 的get方法 
	 * @return id
	 */
	public String getOrgCode() {
		return this.orgCode;
	}
	/**
	 * 属性 orgCode 的set方法 
	 * @param id 
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	/**
	 * 属性 operatorName 的get方法 
	 * @return id
	 */
	public String getOperatorName() {
		return this.operatorName;
	}
	/**
	 * 属性 operatorName 的set方法 
	 * @param id 
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
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
	 * 属性 mobile 的get方法 
	 * @return id
	 */
	public String getMobile() {
		return this.mobile;
	}
	/**
	 * 属性 mobile 的set方法 
	 * @param id 
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 属性 password 的get方法 
	 * @return id
	 */
	public String getPassword() {
		return this.password;
	}
	/**
	 * 属性 password 的set方法 
	 * @param id 
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 属性 status 的get方法 
	 * @return id
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * 属性 status 的set方法 
	 * @param id 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 属性 createTime 的get方法 
	 * @return id
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * 属性 createTime 的set方法 
	 * @param id 
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 属性 userType 的get方法 
	 * @return id
	 */
	public String getUserType() {
		return this.userType;
	}
	/**
	 * 属性 userType 的set方法 
	 * @param id 
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}
	/**
	 * 属性 auditStatus 的get方法 
	 * @return id
	 */
	public String getAuditStatus() {
		return this.auditStatus;
	}
	/**
	 * 属性 auditStatus 的set方法 
	 * @param id 
	 */
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	/**
	 * 属性 userCode 的get方法 
	 * @return id
	 */
	public String getUserCode() {
		return this.userCode;
	}
	/**
	 * 属性 userCode 的set方法 
	 * @param id 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * 属性 createId 的get方法 
	 * @return id
	 */
	public Long getCreateId() {
		return this.createId;
	}
	/**
	 * 属性 createId 的set方法 
	 * @param id 
	 */
	public void setCreateId(Long createId) {
		this.createId = createId;
	}
	/**
	 * 属性 createName 的get方法 
	 * @return id
	 */
	public String getCreateName() {
		return this.createName;
	}
	/**
	 * 属性 createName 的set方法 
	 * @param id 
	 */
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	/**
	 * 属性 updateId 的get方法 
	 * @return id
	 */
	public Long getUpdateId() {
		return this.updateId;
	}
	/**
	 * 属性 updateId 的set方法 
	 * @param id 
	 */
	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}
	/**
	 * 属性 updateName 的get方法 
	 * @return id
	 */
	public String getUpdateName() {
		return this.updateName;
	}
	/**
	 * 属性 updateName 的set方法 
	 * @param id 
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
		
	
		
	
	/**
	 * 属性 updateTime 的get方法 
	 * @return updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 属性 updateTime 的set方法 
	 * @param updateTime 
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
/*====================hashCode and equals ====================*/
/**
	* <p>Description: User 自动生成的hashcode方法</p> 
	* @author Liu Wenjie   
	* @date 2014年11月13日  16:53:39
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((operatorId == null) ? 0 : operatorId.hashCode());
		return result;
	}
	/**
	* <p>Description:User 自动生成的equals方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月13日  16:53:39
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
		User other =(User) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (operatorId == null) {if (other.operatorId != null){ return false;} else if (!operatorId.equals(other.operatorId)){ return false;}}
		*/
		if (operatorId == null) {
			if (other.operatorId != null){ 
				return false;
			}
		}else if (!operatorId.equals(other.operatorId)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:User 自动生成的toString方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月13日  16:53:39 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "User [" +
					"operatorId=" + operatorId + "," + 
					"orgCode=" + orgCode + "," + 
					"operatorName=" + operatorName + "," + 
					"loginName=" + loginName + "," + 
					"mobile=" + mobile + "," + 
					"password=" + password + "," + 
					"status=" + status + "," + 
					"createTime=" + createTime + "," + 
					"userType=" + userType + "," + 
					"auditStatus=" + auditStatus + "," + 
					"userCode=" + userCode + "," + 
					"createId=" + createId + "," + 
					"createName=" + createName + "," + 
					"updateId=" + updateId + "," + 
					"updateName=" + updateName + "," + 
				"]";
	}
	
	
}
