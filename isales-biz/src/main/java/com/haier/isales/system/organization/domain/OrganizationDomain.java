/**
* @Company 青鸟软通   
* @Title: OrganizationDomain.java 
* @Package com.haier.isales.system.organization.domain 
* @author Guo Yuchao   
* @date 2014年11月10日  13:53:25 
* @version V1.0   
*/ 
package com.haier.isales.system.organization.domain;

import java.io.Serializable;
import java.util.List;

import com.haier.isales.system.user.domain.User;

/** 
 * @ClassName: OrganizationDomain 
 * t_qn_organization 自动生成的对应的实体对象   
 *  
 */
public class OrganizationDomain implements Serializable{
	private static final long serialVersionUID = -1415598805276L;

	/** 
	* @Fields orgCode : 组织编号
	*/
	private String orgCode;
	/** 
	* @Fields orgName : 组织名称
	*/
	private String orgName;
	/** 
	* @Fields parentOrg : 父级组织的编号
	*/
	private String parentOrg;
	/** 
	* @Fields orgLevel : 组织所处的层级
	*/
	private String orgLevel;
	/** 
	* @Fields orgSeq : 组织的序列，是orgcode的顺序组合，用_分割
	*/
	private String orgSeq;
		
	private List<User> userList;//该组织及下属组织拥有的用户
	
	/*=========================getter and setter ===================*/
	
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
	 * 属性 orgName 的get方法 
	 * @return id
	 */
	public String getOrgName() {
		return this.orgName;
	}
	/**
	 * 属性 orgName 的set方法 
	 * @param id 
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	/**
	 * 属性 parentOrg 的get方法 
	 * @return id
	 */
	public String getParentOrg() {
		return this.parentOrg;
	}
	/**
	 * 属性 parentOrg 的set方法 
	 * @param id 
	 */
	public void setParentOrg(String parentOrg) {
		this.parentOrg = parentOrg;
	}
	/**
	 * 属性 orgLevel 的get方法 
	 * @return id
	 */
	public String getOrgLevel() {
		return this.orgLevel;
	}
	/**
	 * 属性 orgLevel 的set方法 
	 * @param id 
	 */
	public void setOrgLevel(String orgLevel) {
		this.orgLevel = orgLevel;
	}
	/**
	 * 属性 orgSeq 的get方法 
	 * @return id
	 */
	public String getOrgSeq() {
		return this.orgSeq;
	}
	/**
	 * 属性 orgSeq 的set方法 
	 * @param id 
	 */
	public void setOrgSeq(String orgSeq) {
		this.orgSeq = orgSeq;
	}
		
	
		
	
	/**
	 * 属性 userList 的get方法 
	 * @return userList
	 */
	public List<User> getUserList() {
		return userList;
	}
	/**
	 * 属性 userList 的set方法 
	 * @param userList 
	 */
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
/*====================hashCode and equals ====================*/
/**
	* <p>Description: OrganizationDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2014年11月10日  13:53:25
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((orgCode == null) ? 0 : orgCode.hashCode());
		return result;
	}
	/**
	* <p>Description:OrganizationDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月10日  13:53:25
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
		OrganizationDomain other =(OrganizationDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (orgCode == null) {if (other.orgCode != null){ return false;} else if (!orgCode.equals(other.orgCode)){ return false;}}
		*/
		if (orgCode == null) {
			if (other.orgCode != null){ 
				return false;
			}
		}else if (!orgCode.equals(other.orgCode)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:OrganizationDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月10日  13:53:25 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "OrganizationDomain [" +
					"orgCode=" + orgCode + "," + 
					"orgName=" + orgName + "," + 
					"parentOrg=" + parentOrg + "," + 
					"orgLevel=" + orgLevel + "," + 
					"orgSeq=" + orgSeq + "," + 
				"]";
	}
	
	
}
