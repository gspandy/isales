/**
* @Company 青鸟软通   
* @Title: AccountDomain.java 
* @Package com.haier.isales.system.account.domain 
* @author Guo Yuchao   
* @date 2014年12月04日  12:46:26 
* @version V1.0   
*/ 
package com.haier.isales.system.account.domain;

import java.io.Serializable;

/** 
 * @ClassName: AccountDomain 
 * t_qn_user_account 自动生成的对应的实体对象   
 *  
 */
public class AccountDomain implements Serializable{
	private static final long serialVersionUID = -1417668386182L;

	/** 
	* @Fields id : 
	*/
	private Long id;
	/** 
	* @Fields operatorId : 用户的唯一标识
	*/
	private Long operatorId;
	/** 
	* @Fields accountId : 
	*/
	private Long accountId;
	/** 
	* @Fields accountName : 账户名,即登录名，数据统一要求转为大写后存入数据库
	*/
	private String accountName;
	/** 
	* @Fields password : 账户密码，目前用户多账号统一使用一个密码，密码存在用户表。该表中密码不存值
	*/
	private String password;
	/** 
	* @Fields accountType : 账户类型，使用字典user_account_type，101  员工号、102手机号、103微信号
	*/
	private String accountType;
	/** 
	* @Fields accountStatus : 账户状态，使用字典user_account_status：101可用，102禁用
	*/
	private String accountStatus;
	/** 
	* @Fields createId : 添加人id
	*/
	private Long createId;
	/** 
	* @Fields createName : 添加人姓名
	*/
	private String createName;
	/** 
	* @Fields createTime : 添加时间
	*/
	private java.util.Date createTime;
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
	private java.util.Date updateTime;
	/** 
	* @Fields auditStatus : user表中的auditStatus  白名单审核通过
	*/ 
	private String auditStatus;
	/** 
	* @Fields userStatus :用户状态:101可用，102注销，在业务字典中管理
	*/ 
	private String userStatus;
	
	/** 
	* @Fields defaultPassword : user表中的密码 
	*/ 
	private String defaultPassword;	
	
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
	 * 属性 accountId 的get方法 
	 * @return id
	 */
	public Long getAccountId() {
		return this.accountId;
	}
	/**
	 * 属性 accountId 的set方法 
	 * @param id 
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	/**
	 * 属性 accountName 的get方法 
	 * @return id
	 */
	public String getAccountName() {
		return this.accountName;
	}
	/**
	 * 属性 accountName 的set方法 
	 * @param id 
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
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
	 * 属性 accountType 的get方法 
	 * @return id
	 */
	public String getAccountType() {
		return this.accountType;
	}
	/**
	 * 属性 accountType 的set方法 
	 * @param id 
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * 属性 accountStatus 的get方法 
	 * @return id
	 */
	public String getAccountStatus() {
		return this.accountStatus;
	}
	/**
	 * 属性 accountStatus 的set方法 
	 * @param id 
	 */
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
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
	 * @return id
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * 属性 updateTime 的set方法 
	 * @param id 
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
		
	
		
	
	/**
	 * 属性 auditStatus 的get方法 
	 * @return auditStatus
	 */
	public String getAuditStatus() {
		return auditStatus;
	}
	/**
	 * 属性 auditStatus 的set方法 
	 * @param auditStatus 
	 */
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	/**
	 * 属性 defaultPassword 的get方法 
	 * @return defaultPassword
	 */
	public String getDefaultPassword() {
		return defaultPassword;
	}
	/**
	 * 属性 defaultPassword 的set方法 
	 * @param defaultPassword 
	 */
	public void setDefaultPassword(String defaultPassword) {
		this.defaultPassword = defaultPassword;
	}
/**
	 * 属性 userStatus 的get方法 
	 * @return userStatus
	 */
	public String getUserStatus() {
		return userStatus;
	}
	/**
	 * 属性 userStatus 的set方法 
	 * @param userStatus 
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
/*====================hashCode and equals ====================*/
/**
	* <p>Description: AccountDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2014年12月04日  12:46:26
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
	* <p>Description:AccountDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年12月04日  12:46:26
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
		AccountDomain other =(AccountDomain) obj;

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
	* <p>Description:AccountDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年12月04日  12:46:26 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "AccountDomain [" +
					"id=" + id + "," + 
					"operatorId=" + operatorId + "," + 
					"accountId=" + accountId + "," + 
					"accountName=" + accountName + "," + 
					"password=" + password + "," + 
					"accountType=" + accountType + "," + 
					"accountStatus=" + accountStatus + "," + 
					"createId=" + createId + "," + 
					"createName=" + createName + "," + 
					"createTime=" + createTime + "," + 
					"updateId=" + updateId + "," + 
					"updateName=" + updateName + "," + 
					"updateTime=" + updateTime + "," + 
				"]";
	}
	
	
}
