/**
* @Company 青鸟软通   
* @Title: QuotientDomain.java 
* @Package com.haier.isales.performance.quotient.domain 
* @author John.zhao   
* @date 2014年12月18日  18:40:10 
* @version V1.0   
*/ 
package com.haier.isales.performance.quotient.domain;

import java.io.Serializable;

/** 
 * @ClassName: QuotientDomain 
 * t_isales_quotient_month 自动生成的对应的实体对象   
 *  
 */
public class QuotientDomain implements Serializable{
	private static final long serialVersionUID = -1418899210453L;

	private Long id;//使用对方数据库中的主键

	private Integer year;//年

	private Integer month;// 月

	private String tradeCode;//中心编码

	private String custNo;//门店编码

	private String productLineNo;//产品线编号

	private java.math.BigDecimal target;//月度份额目标

	private java.math.BigDecimal actual;//月度份额实际

	private java.math.BigDecimal crrspdPeriod;//月度份额同期

	private java.math.BigDecimal baseLine;// 底线份额

	private String remark;//备注,本系统中添加的字段，预留以存储一些信息。在同步数据时对方数据库中没有对应的字段

	private String isAscend;//标志，代表上升还是下降还是平稳趋势 
	
	/*=========================getter and setter ===================*/
	/**
	 * 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 属性 year 的get方法 
	 * @return id
	 */
	public Integer getYear() {
		return this.year;
	}
	/**
	 * 属性 year 的set方法 
	 * @param id 
	 */
	public void setYear(Integer year) {
		this.year = year;
	}
	/**
	 * 属性 month 的get方法 
	 * @return id
	 */
	public Integer getMonth() {
		return this.month;
	}
	/**
	 * 属性 month 的set方法 
	 * @param id 
	 */
	public void setMonth(Integer month) {
		this.month = month;
	}
	/**
	 * 属性 tradeCode 的get方法 
	 * @return id
	 */
	public String getTradeCode() {
		return this.tradeCode;
	}
	/**
	 * 属性 tradeCode 的set方法 
	 * @param id 
	 */
	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}
	/**
	 * 属性 custNo 的get方法 
	 * @return id
	 */
	public String getCustNo() {
		return this.custNo;
	}
	/**
	 * 属性 custNo 的set方法 
	 * @param id 
	 */
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	/**
	 * 属性 productLineNo 的get方法 
	 * @return id
	 */
	public String getProductLineNo() {
		return this.productLineNo;
	}
	/**
	 * 属性 productLineNo 的set方法 
	 * @param id 
	 */
	public void setProductLineNo(String productLineNo) {
		this.productLineNo = productLineNo;
	}
	/**
	 * 属性 target 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getTarget() {
		return this.target;
	}
	/**
	 * 属性 target 的set方法 
	 * @param id 
	 */
	public void setTarget(java.math.BigDecimal target) {
		this.target = target;
	}
	/**
	 * 属性 actual 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getActual() {
		return this.actual;
	}
	/**
	 * 属性 actual 的set方法 
	 * @param id 
	 */
	public void setActual(java.math.BigDecimal actual) {
		this.actual = actual;
	}
	/**
	 * 属性 crrspdPeriod 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getCrrspdPeriod() {
		return this.crrspdPeriod;
	}
	/**
	 * 属性 crrspdPeriod 的set方法 
	 * @param id 
	 */
	public void setCrrspdPeriod(java.math.BigDecimal crrspdPeriod) {
		this.crrspdPeriod = crrspdPeriod;
	}
	/**
	 * 属性 baseLine 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getBaseLine() {
		return this.baseLine;
	}
	/**
	 * 属性 baseLine 的set方法 
	 * @param id 
	 */
	public void setBaseLine(java.math.BigDecimal baseLine) {
		this.baseLine = baseLine;
	}
	/**
	 * 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 属性 isAscend 的get方法 
	 * @return isAscend
	 */
	public String getIsAscend() {
		return isAscend;
	}
	/**
	 * 属性 isAscend 的set方法 
	 * @param isAscend 
	 */
	public void setIsAscend(String isAscend) {
		this.isAscend = isAscend;
	}
	
	/*====================hashCode and equals ====================*/
	/**
	* <p>Description: QuotientDomain 自动生成的hashcode方法</p> 
	* @author John.zhao   
	* @date 2014年12月18日  18:40:10
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((id == null) ? 0 : id.hashCode());
		return result;
	}
	/**
	* <p>Description:QuotientDomain 自动生成的equals方法 </p> 
	* @author John.zhao   
	* @date 2014年12月18日  18:40:10
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
		QuotientDomain other =(QuotientDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (id == null) {if (other.id != null){ return false;} else if (!id.equals(other.id)){ return false;}}
		*/
		if (id == null) {
			if (other.id != null){ 
				return false;
			}
		}else if (!id.equals(other.id)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:QuotientDomain 自动生成的toString方法 </p> 
	* @author John.zhao   
	* @date 2014年12月18日  18:40:10 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "QuotientDomain [" +
					"id=" + id + "," + 
					"year=" + year + "," + 
					"month=" + month + "," + 
					"tradeCode=" + tradeCode + "," + 
					"custNo=" + custNo + "," + 
					"productLineNo=" + productLineNo + "," + 
					"target=" + target + "," + 
					"actual=" + actual + "," + 
					"crrspdPeriod=" + crrspdPeriod + "," + 
					"baseLine=" + baseLine + "," + 
					"remark=" + remark + "," + 
				"]";
	}
}
