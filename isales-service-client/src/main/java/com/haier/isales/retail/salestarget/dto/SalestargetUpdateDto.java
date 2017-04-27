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
 * @ClassName: SalestargetUpdateDto 
 * @Description: 个人销量目标的增加或者修改dto 
 *  
 */
public class SalestargetUpdateDto implements Serializable{
	
	private static final long serialVersionUID = -1419237084828L;
	
	/** 
	* @Fields operatorId : 操作人id
	*/
	private Long operatorId;
	/** 
	* @Fields productLine : 产业线
	*/
	private String productLine;
	/** 
	* @Fields year : 年份
	*/
	private Integer year;
	/** 
	* @Fields month : 月份
	*/
	private Integer month;
	/** 
	* @Fields targetAmount : 目标零售额
	*/
	private java.math.BigDecimal targetAmount;
	/** 
	* @Fields targetNum : 销售目标
	*/
	private java.math.BigDecimal targetNum;
	
	
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
	
	/*==================toString====================*/
	/**
	* <p>Description: SalestargetUpdateDto自动生成的toString方法</p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:10:30 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "SalestargetUpdateDto [operatorId=" + operatorId
				+ ", productLine=" + productLine + ", year=" + year
				+ ", month=" + month + ", targetAmount=" + targetAmount
				+ ", targetNum=" + targetNum + "]";
	}
}
