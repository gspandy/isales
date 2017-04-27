/**
* @Company 青鸟软通   
* @Title: PersonalInfoDTO.java 
* @Package com.haier.isales.salerInfo.personalInfo 
* @author Cao Rui   
* @date 2014-11-11 下午3:47:22 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalinfo.dto;

import java.io.Serializable;

/** 
 * @ClassName: PersonalInfoDTO 
 * @Description: TODO直销员个人信息表 
 *  
 */
public class PersonalInfoDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -984137213107998825L;
	/*===============业务实体属性=======================*/
	private String hmcId;	//人员工号
	private String hname;	//人员姓名
	private String shopId;	//门店编码
	private String shopName;	//门店名称
	
	/*===============查询参数=======================*/
	private String querySalerId;	//查询参数 直销员id
	private String querySalerCode;	//查询参数 直销员工号
	private String querySalerName;	//查询参数 直销员姓名 
	
	/*==================getters & setters==================*/
	/**
	 * @Description: 属性 querySalerId 的get方法 
	 * @return querySalerId
	 */
	public String getQuerySalerId() {
		return querySalerId;
	}
	/**
	 * @Description: 属性 querySalerId 的set方法 
	 * @param querySalerId 
	 */
	public void setQuerySalerId(String querySalerId) {
		this.querySalerId = querySalerId;
	}
	/**
	 * @Description: 属性 querySalerCode 的get方法 
	 * @return querySalerCode
	 */
	public String getQuerySalerCode() {
		return querySalerCode;
	}
	/**
	 * @Description: 属性 querySalerCode 的set方法 
	 * @param querySalerCode 
	 */
	public void setQuerySalerCode(String querySalerCode) {
		this.querySalerCode = querySalerCode;
	}
	/**
	 * @Description: 属性 querySalerName 的get方法 
	 * @return querySalerName
	 */
	public String getQuerySalerName() {
		return querySalerName;
	}
	/**
	 * @Description: 属性 querySalerName 的set方法 
	 * @param querySalerName 
	 */
	public void setQuerySalerName(String querySalerName) {
		this.querySalerName = querySalerName;
	}
	/**
	 * @Description: 属性 hmcId 的get方法 
	 * @return hmcId
	 */
	public String getHmcId() {
		return hmcId;
	}
	/**
	 * @Description: 属性 hmcId 的set方法 
	 * @param hmcId 
	 */
	public void setHmcId(String hmcId) {
		this.hmcId = hmcId;
	}
	/**
	 * @Description: 属性 hname 的get方法 
	 * @return hname
	 */
	public String getHname() {
		return hname;
	}
	/**
	 * @Description: 属性 hname 的set方法 
	 * @param hname 
	 */
	public void setHname(String hname) {
		this.hname = hname;
	}
	/**
	 * @Description: 属性 shopId 的get方法 
	 * @return shopId
	 */
	public String getShopId() {
		return shopId;
	}
	/**
	 * @Description: 属性 shopId 的set方法 
	 * @param shopId 
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	/**
	 * @Description: 属性 shopName 的get方法 
	 * @return shopName
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * @Description: 属性 shopName 的set方法 
	 * @param shopName 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	/*=================toString=================*/
	/**
	* <p>Description: PersonalInfoDTO自动生成的toString方法</p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:11:17 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "PersonalInfoDTO [hmcId=" + hmcId + ", hname=" + hname
				+ ", shopId=" + shopId + ", shopName=" + shopName
				+ ", querySalerId=" + querySalerId + ", querySalerCode="
				+ querySalerCode + ", querySalerName=" + querySalerName + "]";
	}
}
