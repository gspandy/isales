/**
* @Company 青鸟软通   
* @Title: RoleDomain.java 
* @Package com.haier.isales.system.role.domain 
* @author Liu Wenjie   
* @date 2014年11月07日  11:16:51 
* @version V1.0   
*/ 
package com.haier.isales.system.dto;

import java.io.Serializable;

/** 
 * @ClassName: RoleDTO 
 * @Description: RoleDomain 对应的DTO  
 *  
 */
public class RoleDTO implements Serializable{
	private static final long serialVersionUID = -1415330211785L;

	/** 
	* @Fields roleCode : 
	*/
	private String roleCode;
	/** 
	* @Fields roleName : 
	*/
	private String roleName;
	/** 
	* @Fields status : 表示角色当前的使用情况（101：有效，102：删除）
	*/
	private String status;
	/** 
	* @Fields operatorId : 创建人id
	*/
	private Long operatorId;
	/** 
	* @Fields createTime : 
	*/
	private java.util.Date createTime;
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * @Description: 属性 roleCode 的get方法 
	 * @return id
	 */
	public String getRoleCode() {
		return this.roleCode;
	}
	/**
	 * @Description: 属性 roleCode 的set方法 
	 * @param id 
	 */
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	/**
	 * @Description: 属性 roleName 的get方法 
	 * @return id
	 */
	public String getRoleName() {
		return this.roleName;
	}
	/**
	 * @Description: 属性 roleName 的set方法 
	 * @param id 
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午6:57:04 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "RoleDTO [roleCode=" + roleCode + ", roleName=" + roleName
				+ ", status=" + status + ", operatorId=" + operatorId
				+ ", createTime=" + createTime + "]";
	}
		
	
		

	
}
