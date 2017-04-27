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
public class SalestargetQueryDto implements Serializable{
	
	private static final long serialVersionUID = -1419237084828L;
	
	/** 
	* @Fields operatorId : 操作人id
	*/
	private Long operatorId;
	/** 
	* @Fields userCode : 员工号
	*/
	private String userCode;
	/** 
	* @Fields orgCode : 所属中心编码
	*/
	private String orgCode;
	/** 
	* @Fields orgName : 所属中心名称
	*/
	private String orgName;
	/** 
	* @Fields shopId : 所属门店
	*/
	private String shopId;
	/** 
	* @Fields shopName : 所属门店名称
	*/
	private String shopName;
	/** 
	* @Fields productLine : 产业编码
	*/
	private String productLine;
	/** 
	* @Fields productLineName : 产业名称
	*/
	private String productLineName;
	/** 
	* @Fields year : 年份
	*/
	private Integer year;
	/** 
	* @Fields month : 月份
	*/
	private Integer month;
	
	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-12-23 下午2:55:19  
	*/ 
	public SalestargetQueryDto() {
		super();
	}
	public SalestargetQueryDto(Long operatorId,String productLine,Integer year,Integer month) {
		super();
		this.operatorId = operatorId;
		this.productLine = productLine;
		this.year = year;
		this.month = month;
	}
	
	// 添加门店ID
	public SalestargetQueryDto(String shopId,String productLine,Integer year,Integer month) {
		super();
		this.shopId = shopId;
		this.productLine = productLine;
		this.year = year;
		this.month = month;
	}
	
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
	
	/*=======================toString=====================*/
	/**
	* <p>Description: SalestargetQueryDto自动生成的toString方法</p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:10:22 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "SalestargetQueryDto [operatorId=" + operatorId + ", userCode="
				+ userCode + ", orgCode=" + orgCode + ", orgName=" + orgName
				+ ", shopId=" + shopId + ", shopName=" + shopName
				+ ", productLine=" + productLine + ", productLineName="
				+ productLineName + ", year=" + year + ", month=" + month + "]";
	}
	
}
