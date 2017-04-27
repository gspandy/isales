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
 * @ClassName: PersonalInfoForShowDTO 
 * @Description: TODO直销员个人信息表 
 *  
 */
public class PersonalEmpInfoDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -984137213107998825L;
	/*===============业务实体属性=======================*/
	private Long operatorId;	//用户id
	private String userCode;	//员工号
	private String userName;	//员工姓名
	private String userSex;		//性别
	private String userMobile;	//手机
	private Long userIdentityCard;	//身份证号
	private String wecharCode;	//微信号
	private String headPortraitId;	//头像id
	private Integer point;		//积分
	private Integer pointLevel;	//等级
	private String signature;	//个性签名
	private String shopId;		//门店编码
	private String shopName;	//	门店名
	private String orgCode;		//中心编码
	private String orgName;		//中心名称
	private String productId;	//产品线id
	private String productName;	//产品线名称
	
	/*===============查询参数=======================*/
	private String querySalerId;	//查询参数 直销员id
	private String querySalerCode;	//查询参数 直销员工号
	private String querySalerName;	//查询参数 直销员姓名 
	
	/*=========================getter and setter ===================*/
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
	 * @Description: 属性 userSex 的get方法 
	 * @return userSex
	 */
	public String getUserSex() {
		return userSex;
	}
	/**
	 * @Description: 属性 userSex 的set方法 
	 * @param userSex 
	 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	/**
	 * @Description: 属性 userMobile 的get方法 
	 * @return userMobile
	 */
	public String getUserMobile() {
		return userMobile;
	}
	/**
	 * @Description: 属性 userMobile 的set方法 
	 * @param userMobile 
	 */
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	/**
	 * @Description: 属性 userIdentityCard 的get方法 
	 * @return userIdentityCard
	 */
	public Long getUserIdentityCard() {
		return userIdentityCard;
	}
	/**
	 * @Description: 属性 userIdentityCard 的set方法 
	 * @param userIdentityCard 
	 */
	public void setUserIdentityCard(Long userIdentityCard) {
		this.userIdentityCard = userIdentityCard;
	}
	/**
	 * @Description: 属性 wecharCode 的get方法 
	 * @return wecharCode
	 */
	public String getWecharCode() {
		return wecharCode;
	}
	/**
	 * @Description: 属性 wecharCode 的set方法 
	 * @param wecharCode 
	 */
	public void setWecharCode(String wecharCode) {
		this.wecharCode = wecharCode;
	}
	/**
	 * @Description: 属性 headPortraitId 的get方法 
	 * @return headPortraitId
	 */
	public String getHeadPortraitId() {
		return headPortraitId;
	}
	/**
	 * @Description: 属性 headPortraitId 的set方法 
	 * @param headPortraitId 
	 */
	public void setHeadPortraitId(String headPortraitId) {
		this.headPortraitId = headPortraitId;
	}
	/**
	 * @Description: 属性 point 的get方法 
	 * @return point
	 */
	public Integer getPoint() {
		return point;
	}
	/**
	 * @Description: 属性 point 的set方法 
	 * @param point 
	 */
	public void setPoint(Integer point) {
		this.point = point;
	}
	/**
	 * @Description: 属性 pointLevel 的get方法 
	 * @return pointLevel
	 */
	public Integer getPointLevel() {
		return pointLevel;
	}
	/**
	 * @Description: 属性 pointLevel 的set方法 
	 * @param pointLevel 
	 */
	public void setPointLevel(Integer pointLevel) {
		this.pointLevel = pointLevel;
	}
	/**
	 * @Description: 属性 signature 的get方法 
	 * @return signature
	 */
	public String getSignature() {
		return signature;
	}
	/**
	 * @Description: 属性 signature 的set方法 
	 * @param signature 
	 */
	public void setSignature(String signature) {
		this.signature = signature;
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
	
	/*=================toString=================*/
	/**
	* <p>Description: PersonalEmpInfoDTO自动生成的toString方法</p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:11:01 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "PersonalEmpInfoDTO [operatorId=" + operatorId + ", userCode="
				+ userCode + ", userName=" + userName + ", userSex=" + userSex
				+ ", userMobile=" + userMobile + ", userIdentityCard="
				+ userIdentityCard + ", wecharCode=" + wecharCode
				+ ", headPortraitId=" + headPortraitId + ", point=" + point
				+ ", pointLevel=" + pointLevel + ", signature=" + signature
				+ ", shopId=" + shopId + ", shopName=" + shopName
				+ ", orgCode=" + orgCode + ", orgName=" + orgName
				+ ", productId=" + productId + ", productName=" + productName
				+ ", querySalerId=" + querySalerId + ", querySalerCode="
				+ querySalerCode + ", querySalerName=" + querySalerName + "]";
	}
}
