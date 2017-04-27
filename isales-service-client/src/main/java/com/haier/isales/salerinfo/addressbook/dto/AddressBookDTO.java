/**
* @Company 青鸟软通   
* @Title: AddressBookDTO.java 
* @Package com.haier.isales.salerinfo.addressbook.dto 
* @author Huang nana   
* @date 2015-1-21 下午5:32:34 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.addressbook.dto;

import java.io.Serializable;

/** 
 * @ClassName: AddressBookDTO 
 * @Description: 通讯录信息
 *  
 */
public class AddressBookDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 3112727174664804734L;
	
	/*===============业务实体属性=======================*/
	private Long operatorId;	//登录用户ID
	private String userCode;	//员工号
	private String userName;	//员工姓名
	private String orgCode;		//中心编码
	private String shopName;	//门店名
	private String orgName;		//中心名称
	private String phone;		//电话
	private String nameLetter;	//姓名首字母
	private String chanCode;	//渠道编码
	private String chanName;	//渠道名称
	private String productId;	//产业编码
	private String productName;	//产业名称

	/*===============查询参数=======================*/
	private String querySearchKey;	//查询参数 模糊查询关键字 匹配员工号、姓名
	private String queryOrgCode;	//查询参数 中心编码
	private String queryUserCode;	//查询参数 员工号
	private String queryChanCode;	//查询参数 渠道编码
	private String queryProductId;	//查询参数 产业编码
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
	 * @Description: 属性 userName 的get方法 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @Description: 属性 userName 的set方法 
	 * @param userName 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	/**
	 * @Description: 属性 orgName 的get方法 
	 * @return orgName
	 */
	public String getOrgName() {
		return orgName;
	}
	/**
	 * @Description: 属性 orgName 的set方法 
	 * @param orgName 
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	/**
	 * @Description: 属性 querySearchKey 的get方法 
	 * @return querySearchKey
	 */
	public String getQuerySearchKey() {
		return querySearchKey;
	}
	/**
	 * @Description: 属性 querySearchKey 的set方法 
	 * @param querySearchKey 
	 */
	public void setQuerySearchKey(String querySearchKey) {
		this.querySearchKey = querySearchKey;
	}
	/**
	 * @Description: 属性 queryOrgCode 的get方法 
	 * @return queryOrgCode
	 */
	public String getQueryOrgCode() {
		return queryOrgCode;
	}
	/**
	 * @Description: 属性 queryOrgCode 的set方法 
	 * @param queryOrgCode 
	 */
	public void setQueryOrgCode(String queryOrgCode) {
		this.queryOrgCode = queryOrgCode;
	}
	/**
	 * @Description: 属性 queryUserCode 的get方法 
	 * @return queryUserCode
	 */
	public String getQueryUserCode() {
		return queryUserCode;
	}
	/**
	 * @Description: 属性 queryUserCode 的set方法 
	 * @param queryUserCode 
	 */
	public void setQueryUserCode(String queryUserCode) {
		this.queryUserCode = queryUserCode;
	}
	/**
	 * @Description: 属性 phone 的get方法 
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @Description: 属性 phone 的set方法 
	 * @param phone 
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @Description: 属性 nameLetter 的get方法 
	 * @return nameLetter
	 */
	public String getNameLetter() {
		return nameLetter;
	}
	/**
	 * @Description: 属性 nameLetter 的set方法 
	 * @param nameLetter 
	 */
	public void setNameLetter(String nameLetter) {
		this.nameLetter = nameLetter;
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
	 * @Description: 属性 operatorId 的get方法 
	 * @return operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}
	/**
	 * @Description: 属性 operatorId 的set方法 
	 * @param operatorId 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * @Description: 属性 chanCode 的get方法 
	 * @return chanCode
	 */
	public String getChanCode() {
		return chanCode;
	}
	/**
	 * @Description: 属性 chanCode 的set方法 
	 * @param chanCode 
	 */
	public void setChanCode(String chanCode) {
		this.chanCode = chanCode;
	}
	/**
	 * @Description: 属性 chanName 的get方法 
	 * @return chanName
	 */
	public String getChanName() {
		return chanName;
	}
	/**
	 * @Description: 属性 chanName 的set方法 
	 * @param chanName 
	 */
	public void setChanName(String chanName) {
		this.chanName = chanName;
	}
	/**
	 * @Description: 属性 productId 的get方法 
	 * @return productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @Description: 属性 productId 的set方法 
	 * @param productId 
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * @Description: 属性 productName 的get方法 
	 * @return productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @Description: 属性 productName 的set方法 
	 * @param productName 
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @Description: 属性 queryChanCode 的get方法 
	 * @return queryChanCode
	 */
	public String getQueryChanCode() {
		return queryChanCode;
	}
	/**
	 * @Description: 属性 queryChanCode 的set方法 
	 * @param queryChanCode 
	 */
	public void setQueryChanCode(String queryChanCode) {
		this.queryChanCode = queryChanCode;
	}
	/**
	 * @Description: 属性 queryProductId 的get方法 
	 * @return queryProductId
	 */
	public String getQueryProductId() {
		return queryProductId;
	}
	/**
	 * @Description: 属性 queryProductId 的set方法 
	 * @param queryProductId 
	 */
	public void setQueryProductId(String queryProductId) {
		this.queryProductId = queryProductId;
	}
}
