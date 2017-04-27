/**
* @Company 青鸟软通   
* @Title: AppInstall.java 
* @Package com.haier.isales.statistics.appinstall.domain 
* @author John.zhao   
* @date 2014-12-4 下午12:44:50 
* @version V1.0   
*/ 
package com.haier.isales.statistics.appinstall.domain;

import java.io.Serializable;

/** 
 * @ClassName: AppInstall 
 * 查询直销员累计安装app人数
 * @author John.zhao 
 */
public class AppInstall implements Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 8566832792496094721L;

	/** 
	* @Fields orgCode : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private String orgCode;
	
	/** 
	* @Fields orgName : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private String orgName;
	
	/** 
	* @Fields totalEmp : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private Integer totalEmp;
	
	/** 
	* @Fields loginEmp : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private Integer loginEmp;

	/**
	 * 属性 orgCode 的get方法 
	 * @return orgCode
	 */
	public String getOrgCode() {
		return orgCode;
	}

	/**
	 * 属性 orgCode 的set方法 
	 * @param orgCode 
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	/**
	 * 属性 orgName 的get方法 
	 * @return orgName
	 */
	public String getOrgName() {
		return orgName;
	}

	/**
	 * 属性 orgName 的set方法 
	 * @param orgName 
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	/**
	 * 属性 totalEmp 的get方法 
	 * @return totalEmp
	 */
	public Integer getTotalEmp() {
		return totalEmp;
	}

	/**
	 * 属性 totalEmp 的set方法 
	 * @param totalEmp 
	 */
	public void setTotalEmp(Integer totalEmp) {
		this.totalEmp = totalEmp;
	}

	/**
	 * 属性 loginEmp 的get方法 
	 * @return loginEmp
	 */
	public Integer getLoginEmp() {
		return loginEmp;
	}

	/**
	 * 属性 loginEmp 的set方法 
	 * @param loginEmp 
	 */
	public void setLoginEmp(Integer loginEmp) {
		this.loginEmp = loginEmp;
	}

}
