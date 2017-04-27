/**
* @Company 青鸟软通   
* @Title: QuotientDTO.java 
* @Package com.haier.isales.performance.quotient.dto 
* @author John.zhao   
* @date 2014-12-18 下午12:57:16 
* @version V1.0   
*/ 
package com.haier.isales.performance.quotient.dto;

import java.io.Serializable;

/** 
 * @ClassName: QuotientDTO 
 * @Description:份额
 *  
 */
public class QuotientDTO implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 594065584507065867L;
	
	/** 
	* @Fields year : 年
	*/
	private Integer year;
	/** 
	* @Fields month : 月
	*/
	private Integer month;
	/** 
	* @Fields tradeCode : 中心编码
	*/
	private String tradeCode;
	/** 
	* @Fields custNo : 门店编码
	*/
	private String custNo;
	/** 
	* @Fields productLineNo : 产品线编号
	*/
	private String productLineNo;
	/** 
	* @Fields target : 月度份额目标
	*/
	private java.math.BigDecimal target;
	/** 
	* @Fields actual : 月度份额实际
	*/
	private java.math.BigDecimal actual;
	/** 
	* @Fields crrspdPeriod : 月度份额同期
	*/
	private java.math.BigDecimal crrspdPeriod;
	/** 
	* @Fields baseLine : 底线份额
	*/
	private java.math.BigDecimal baseLine;
	/** 
	* @Fields remark : 备注,本系统中添加的字段，预留以存储一些信息。在同步数据时对方数据库中没有对应的字段
	*/
	private String remark;
	/** 
	* @Fields isAscend : 标志，代表上升还是下降还是平稳趋势 
	*/ 
	private String isAscend;
	
	/*=========================getter and setter ===================*/
	/**
	 * @Description: 属性 year 的get方法 
	 * @return id
	 */
	public Integer getYear() {
		return this.year;
	}
	/**
	 * @Description: 属性 year 的set方法 
	 * @param id 
	 */
	public void setYear(Integer year) {
		this.year = year;
	}
	/**
	 * @Description: 属性 month 的get方法 
	 * @return id
	 */
	public Integer getMonth() {
		return this.month;
	}
	/**
	 * @Description: 属性 month 的set方法 
	 * @param id 
	 */
	public void setMonth(Integer month) {
		this.month = month;
	}
	/**
	 * @Description: 属性 tradeCode 的get方法 
	 * @return id
	 */
	public String getTradeCode() {
		return this.tradeCode;
	}
	/**
	 * @Description: 属性 tradeCode 的set方法 
	 * @param id 
	 */
	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}
	/**
	 * @Description: 属性 custNo 的get方法 
	 * @return id
	 */
	public String getCustNo() {
		return this.custNo;
	}
	/**
	 * @Description: 属性 custNo 的set方法 
	 * @param id 
	 */
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	/**
	 * @Description: 属性 productLineNo 的get方法 
	 * @return id
	 */
	public String getProductLineNo() {
		return this.productLineNo;
	}
	/**
	 * @Description: 属性 productLineNo 的set方法 
	 * @param id 
	 */
	public void setProductLineNo(String productLineNo) {
		this.productLineNo = productLineNo;
	}
	/**
	 * @Description: 属性 target 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getTarget() {
		return this.target;
	}
	/**
	 * @Description: 属性 target 的set方法 
	 * @param id 
	 */
	public void setTarget(java.math.BigDecimal target) {
		this.target = target;
	}
	/**
	 * @Description: 属性 actual 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getActual() {
		return this.actual;
	}
	/**
	 * @Description: 属性 actual 的set方法 
	 * @param id 
	 */
	public void setActual(java.math.BigDecimal actual) {
		this.actual = actual;
	}
	/**
	 * @Description: 属性 crrspdPeriod 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getCrrspdPeriod() {
		return this.crrspdPeriod;
	}
	/**
	 * @Description: 属性 crrspdPeriod 的set方法 
	 * @param id 
	 */
	public void setCrrspdPeriod(java.math.BigDecimal crrspdPeriod) {
		this.crrspdPeriod = crrspdPeriod;
	}
	/**
	 * @Description: 属性 baseLine 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getBaseLine() {
		return this.baseLine;
	}
	/**
	 * @Description: 属性 baseLine 的set方法 
	 * @param id 
	 */
	public void setBaseLine(java.math.BigDecimal baseLine) {
		this.baseLine = baseLine;
	}
	/**
	 * @Description: 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * @Description: 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @Description: 属性 isAscend 的get方法 
	 * @return isAscend
	 */
	public String getIsAscend() {
		return isAscend;
	}
	/**
	 * @Description: 属性 isAscend 的set方法 
	 * @param isAscend 
	 */
	public void setIsAscend(String isAscend) {
		this.isAscend = isAscend;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:07:49 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "QuotientDTO [year=" + year + ", month=" + month
				+ ", tradeCode=" + tradeCode + ", custNo=" + custNo
				+ ", productLineNo=" + productLineNo + ", target=" + target
				+ ", actual=" + actual + ", crrspdPeriod=" + crrspdPeriod
				+ ", baseLine=" + baseLine + ", remark=" + remark
				+ ", isAscend=" + isAscend + "]";
	}

}
