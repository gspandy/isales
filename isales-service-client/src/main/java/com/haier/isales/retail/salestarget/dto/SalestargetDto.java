/**
* @Company 青鸟软通   
* @Title: SalestargetDto.java 
* @Package com.haier.isales.retail.salestarget 
* @author Cao Rui   
* @date 2014-12-22 下午4:46:15 
* @version V1.0   
*/ 
package com.haier.isales.retail.salestarget.dto;

import java.io.Serializable;

/** 
 * @ClassName: SalestargetDto 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class SalestargetDto implements Serializable{
	
	private static final long serialVersionUID = -1419237084828L;

	private Long id;		//唯一标识

	private Long operatorId;		//操作人id

	private String userCode;		//员工号

	private String orgCode;		//所属中心编码

	private String orgName;		//所属中心名称

	private String shopId;		//所属门店

	private String shopName;		//所属门店名称

	private String productLine;		//产业编码

	private String productLineName;		//产业名称

	private Integer year;		//年份

	private Integer month;		//月份

	private java.math.BigDecimal targetAmount;		//目标零售额

	private java.math.BigDecimal targetNum;		//销售目标

	private String remark;		// 备注

	/*=========================getter and setter ===================*/
	/**
	 * @Description: 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @Description: 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @Description: 属性 productLine 的get方法 
	 * @return productLine
	 */
	public String getProductLine() {
		return productLine;
	}

	/**
	 * @Description: 属性 productLine 的set方法 
	 * @param productLine 
	 */
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	/**
	 * @Description: 属性 productLineName 的get方法 
	 * @return productLineName
	 */
	public String getProductLineName() {
		return productLineName;
	}

	/**
	 * @Description: 属性 productLineName 的set方法 
	 * @param productLineName 
	 */
	public void setProductLineName(String productLineName) {
		this.productLineName = productLineName;
	}

	/**
	 * @Description: 属性 year 的get方法 
	 * @return year
	 */
	public Integer getYear() {
		return year;
	}

	/**
	 * @Description: 属性 year 的set方法 
	 * @param year 
	 */
	public void setYear(Integer year) {
		this.year = year;
	}

	/**
	 * @Description: 属性 month 的get方法 
	 * @return month
	 */
	public Integer getMonth() {
		return month;
	}

	/**
	 * @Description: 属性 month 的set方法 
	 * @param month 
	 */
	public void setMonth(Integer month) {
		this.month = month;
	}

	/**
	 * @Description: 属性 targetAmount 的get方法 
	 * @return targetAmount
	 */
	public java.math.BigDecimal getTargetAmount() {
		return targetAmount;
	}

	/**
	 * @Description: 属性 targetAmount 的set方法 
	 * @param targetAmount 
	 */
	public void setTargetAmount(java.math.BigDecimal targetAmount) {
		this.targetAmount = targetAmount;
	}

	/**
	 * @Description: 属性 targetNum 的get方法 
	 * @return targetNum
	 */
	public java.math.BigDecimal getTargetNum() {
		return targetNum;
	}

	/**
	 * @Description: 属性 targetNum 的set方法 
	 * @param targetNum 
	 */
	public void setTargetNum(java.math.BigDecimal targetNum) {
		this.targetNum = targetNum;
	}

	/**
	 * @Description: 属性 remark 的get方法 
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @Description: 属性 remark 的set方法 
	 * @param remark 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/*================toString================*/
	/**
	* <p>Description: SalestargetDto自动生成的toString方法</p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:10:13 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "SalestargetDto [id=" + id + ", operatorId=" + operatorId
				+ ", userCode=" + userCode + ", orgCode=" + orgCode
				+ ", orgName=" + orgName + ", shopId=" + shopId + ", shopName="
				+ shopName + ", productLine=" + productLine
				+ ", productLineName=" + productLineName + ", year=" + year
				+ ", month=" + month + ", targetAmount=" + targetAmount
				+ ", targetNum=" + targetNum + ", remark=" + remark + "]";
	}
}
