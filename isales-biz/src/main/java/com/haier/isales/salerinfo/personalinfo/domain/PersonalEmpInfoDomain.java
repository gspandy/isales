/**
* @Company 青鸟软通   
* @Title: PersonalEmpInfoDomain.java 
* @Package com.haier.isales.salerinfo.personalinfo.domain 
* @author Cao Rui   
* @date 2014-11-24 上午10:45:47 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalinfo.domain;

import java.io.Serializable;

/** 
 * @ClassName: PersonalEmpInfoDomain 
 * TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class PersonalEmpInfoDomain implements Serializable{
	private static final long serialVersionUID = -1572690510205L;
	
	private Long operatorId;	//用户id
	private String userCode;	//员工号
	private String userName;	//员工姓名
	private String userSex;		//性别
	private Long userIdentityCard;	//身份证号
	private String shopId;		//门店编码
	private String shopName;	//	门店名
	private String orgCode;		//中心编码
	private String orgName;		//中心名称
	private String chanCode;	//渠道编码
	private String chanName;	//渠道名称
	private String productId;	//产品线id
	private String productName;	//产品线名称
	private String mainProductId;	//主营产品线id
	private String mainProductName;	//主营产品线名称

	
	/*=========================getter and setter ===================*/
	
	
	/**
	 * 属性 operatorId 的get方法 
	 * @return operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}
	/**
	 * 属性 operatorId 的set方法 
	 * @param operatorId 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
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
	 * 属性 userSex 的get方法 
	 * @return userSex
	 */
	public String getUserSex() {
		return userSex;
	}
	/**
	 * 属性 userSex 的set方法 
	 * @param userSex 
	 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	/**
	 * 属性 userIdentityCard 的get方法 
	 * @return userIdentityCard
	 */
	public Long getUserIdentityCard() {
		return userIdentityCard;
	}
	/**
	 * 属性 userIdentityCard 的set方法 
	 * @param userIdentityCard 
	 */
	public void setUserIdentityCard(Long userIdentityCard) {
		this.userIdentityCard = userIdentityCard;
	}
	
	/**
	 * 属性 shopId 的get方法 
	 * @return shopId
	 */
	public String getShopId() {
		return shopId;
	}
	/**
	 * 属性 shopId 的set方法 
	 * @param shopId 
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
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
	
	public String getMainProductId() {
		return mainProductId;
	}
	public void setMainProductId(String mainProductId) {
		this.mainProductId = mainProductId;
	}
	public String getMainProductName() {
		return mainProductName;
	}
	public void setMainProductName(String mainProductName) {
		this.mainProductName = mainProductName;
	}

	
}