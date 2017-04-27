/**
* @Company 青鸟软通   
* @Title: AddrBookDomain.java 
* @Package com.haier.isales.salerinfo.personalinfo.domain 
* @author Huang nana   
* @date 2015-1-21 下午2:30:12 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalinfo.domain;

import java.io.Serializable;

/** 
 * @ClassName: AddrBookDomain 
 * TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class AddrBookDomain implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 8279538137790028023L;
	
	private String userCode;	//员工号
	private String userName;	//员工姓名
	private String shopName;	//门店名
	private String orgName;		//中心名称
	private String orgCode;		//中心编码
	private String phone;		//电话
	private String nameLetter;	//姓名首字母
	private String chanCode;	//渠道编码
	private String chanName;	//渠道名称
	private String productId;	//产业编码
	private String productName;	//产业名称
	
	/**
	 * 属性 chanCode 的get方法 
	 * @return chanCode
	 */
	public String getChanCode() {
		return chanCode;
	}
	/**
	 * 属性 chanCode 的set方法 
	 * @param chanCode 
	 */
	public void setChanCode(String chanCode) {
		this.chanCode = chanCode;
	}
	/**
	 * 属性 chanName 的get方法 
	 * @return chanName
	 */
	public String getChanName() {
		return chanName;
	}
	/**
	 * 属性 chanName 的set方法 
	 * @param chanName 
	 */
	public void setChanName(String chanName) {
		this.chanName = chanName;
	}
	/**
	 * 属性 productId 的get方法 
	 * @return productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * 属性 productId 的set方法 
	 * @param productId 
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * 属性 productName 的get方法 
	 * @return productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * 属性 productName 的set方法 
	 * @param productName 
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * 属性 userCode 的get方法 
	 * @return userCode
	 */
	public String getUserCode() {
		return userCode;
	}
	/**
	 * 属性 userCode 的set方法 
	 * @param userCode 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * 属性 userName 的get方法 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 属性 userName 的set方法 
	 * @param userName 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 属性 shopName 的get方法 
	 * @return shopName
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * 属性 shopName 的set方法 
	 * @param shopName 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
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
	 * 属性 phone 的get方法 
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 属性 phone 的set方法 
	 * @param phone 
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 属性 nameLetter 的get方法 
	 * @return nameLetter
	 */
	public String getNameLetter() {
		return nameLetter;
	}
	/**
	 * 属性 nameLetter 的set方法 
	 * @param nameLetter 
	 */
	public void setNameLetter(String nameLetter) {
		this.nameLetter = nameLetter;
	}
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


}
