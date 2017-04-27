/**
* @Company 青鸟软通   
* @Title: RoleDomain.java 
* @Package com.haier.isales.system.role.domain 
* @author Liu Wenjie   
* @date 2014年11月07日  11:16:51 
* @version V1.0   
*/ 
package com.haier.isales.system.role.domain;

import java.io.Serializable;

/** 
 * @ClassName: RoleDomain 
 * t_qn_role 自动生成的对应的实体对象   
 *  
 */
public class RoleDomain implements Serializable{
	private static final long serialVersionUID = -1415330211785L;

	private String roleCode;		//角色编码

	private String roleName;		//角色名称

	private String status;		//表示角色当前的使用情况（101：有效，102：删除）

	private Long operatorId;		//创建人id

	private java.util.Date createTime;		//创建时间
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 roleCode 的get方法 
	 * @return id
	 */
	public String getRoleCode() {
		return this.roleCode;
	}
	/**
	 * 属性 roleCode 的set方法 
	 * @param id 
	 */
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	/**
	 * 属性 roleName 的get方法 
	 * @return id
	 */
	public String getRoleName() {
		return this.roleName;
	}
	/**
	 * 属性 roleName 的set方法 
	 * @param id 
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: RoleDomain 自动生成的hashcode方法</p> 
	* @author Liu Wenjie   
	* @date 2014年11月07日  11:16:51
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((roleCode == null) ? 0 : roleCode.hashCode());
		return result;
	}
	/**
	* <p>Description:RoleDomain 自动生成的equals方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月07日  11:16:51
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
		RoleDomain other =(RoleDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (roleCode == null) {if (other.roleCode != null){ return false;} else if (!roleCode.equals(other.roleCode)){ return false;}}
		*/
		if (roleCode == null) {
			if (other.roleCode != null){ 
				return false;
			}
		}else if (!roleCode.equals(other.roleCode)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:RoleDomain 自动生成的toString方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月07日  11:16:51 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "RoleDomain [" +
					"roleCode=" + roleCode + "," + 
					"roleName=" + roleName + "," + 
					"status=" + status + "," + 
					"operatorId=" + operatorId + "," + 
					"createTime=" + createTime + "," + 
				"]";
	}
	
	
}
