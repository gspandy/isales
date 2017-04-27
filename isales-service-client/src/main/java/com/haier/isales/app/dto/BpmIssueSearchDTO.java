/**
* @Company 青鸟软通   
* @Title: BpmIssueSearchDTO.java 
* @Package com.haier.isales.app.dto 
* @author John zhao   
* @date 2015-2-7 下午1:34:25 
* @version V1.0   
*/ 
package com.haier.isales.app.dto;

import java.io.Serializable;

/** 
 * @ClassName: BpmIssueSearchDTO 
 * @Description: 一级处理人查询dto
 *  
 */
public class BpmIssueSearchDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -5092732394663449454L;

	/** 
	* @Fields userCode : 用户编号
	*/ 
	private String userCode;
	
	/** 
	* @Fields orgCode : 工贸编号
	*/ 
	private String orgCode;
	
	/** 
	* @Fields shopCode : 门店编号
	*/ 
	private String shopCode;
	
	//==============getters & setters===============
	/**
	 * @Description: 属性 userCode 的get方法 
	 * @return userCode
	 */
	public String getUserCode() {
		return userCode;
	}

	/**
	 * @Description: 属性 userCode 的set方法 
	 * @param userCode 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	/**
	 * @Description: 属性 orgCode 的get方法 
	 * @return orgCode
	 */
	public String getOrgCode() {
		return orgCode;
	}

	/**
	 * @Description: 属性 orgCode 的set方法 
	 * @param orgCode 
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	/**
	 * @Description: 属性 shopCode 的get方法 
	 * @return shopCode
	 */
	public String getShopCode() {
		return shopCode;
	}

	/**
	 * @Description: 属性 shopCode 的set方法 
	 * @param shopCode 
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}
	
	//===============toString==================
	/**
	* <p>Description:BpmIssueSearchDTO自动生成的toString方法 </p> 
	* @author John zhao   
	* @date 2015-2-7 下午1:58:54 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "BpmIssueSearchDTO [userCode=" + userCode + ", orgCode=" + orgCode + ", shopCode=" + shopCode + "]";
	}
	
	//=================hashCode & equals========================
	/**
	* <p>Description: BpmIssueSearchDTO自动生成的hashCode方法</p> 
	* @author John zhao   
	* @date 2015-2-7 下午1:58:39 
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orgCode == null) ? 0 : orgCode.hashCode());
		result = prime * result + ((shopCode == null) ? 0 : shopCode.hashCode());
		result = prime * result + ((userCode == null) ? 0 : userCode.hashCode());
		return result;
	}

	/**
	* <p>Description: BpmIssueSearchDTO自动生成的equals方法</p> 
	* @author John zhao   
	* @date 2015-2-7 下午1:58:39 
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
		BpmIssueSearchDTO other = (BpmIssueSearchDTO) obj;
		if (orgCode == null) {
			if (other.orgCode != null){
				return false;
			}
		} else if (!orgCode.equals(other.orgCode)){
			return false;
		}
		if (shopCode == null) {
			if (other.shopCode != null){
				return false;
			}
		} else if (!shopCode.equals(other.shopCode)){
			return false;
		}
		if (userCode == null) {
			if (other.userCode != null){
				return false;
			}
		} else if (!userCode.equals(other.userCode)){
			return false;
		}
		return true;
	}
}
