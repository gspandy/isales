/**
* @Company 青鸟软通   
* @Title: RetailDTO.java 
* @Package com.haier.isales.performance.retail 
* @author John.zhao   
* @date 2014-12-22 下午7:31:54 
* @version V1.0   
*/ 
package com.haier.isales.performance.retail.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/** 
 * @ClassName: RetailDTO 
 * @Description: 我的业绩-零售额
 *  
 */
public class RetailDTO implements Serializable{

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = 8158026579897506180L;

	/** 
	* @Fields yearMonth : 日期
	*/ 
	private String yearMonth;
	private String yearMonthBegin;//查询图表开始时间 GuoYuchao 2014-12-23 09:22:30
	
	/** 
	* @Fields operatorId : operatorId
	*/ 
	private Long operatorId;
	/** 
	* @Fields empCode : 直销员员工号 
	*/ 
	private String empCode;
	
	/** 
	* @Fields shopId : 门店编码 
	*/ 
	private String shopId;
	
	/** 
	* @Fields proLineId : 产品线编码 
	*/ 
	private String proLineId;
	
	/** 
	* @Fields target : 目标
	*/ 
	private BigDecimal target;
	
	/** 
	* @Fields actual : 实际
	*/ 
	private BigDecimal actual;
	
	// bonus : 提成
	private BigDecimal bonus;
	
	// memCnts ： 门店人数
	private BigDecimal memCnts;
	
	/** 
	* @Fields completionRate : 完成率
	*/ 
	private BigDecimal completionRate;
	
	private BigDecimal totalRetail; // 当月累计销量
	
	private BigDecimal befRetail; // T-1 日销量
	
	private BigDecimal totalBonus; // 当月累计提成
	
	private BigDecimal befBonus; // T-1 日提成
	
	// 添加日销量目标
	private BigDecimal befTargetRetail;
	// 日销量完成率
	private BigDecimal befCompletRate;
	// 日挣酬 实际
	private BigDecimal befReward;
	// 月零售额目标
	private BigDecimal targetMoney;
	// 月零售额实际
	private BigDecimal actualMoney;
	// 月销额完成率
	private BigDecimal moneyCompleteRate;
	// 日零售额目标
	private BigDecimal befTargetMoney;
	// 日零售额实际
	private BigDecimal befActualMoney;
	// 日销额完成率
	private BigDecimal befMoneyCompleteRate;
	// 产品编码
	private String prodCode;
	// 产品型号名称
	private String prodName;
	// 台数
	private String qty;
	// 销额
	private BigDecimal retailMoney;
	
	
	/*=================getter and setter==================*/
	/**
	 * @Description: 属性 yearMonth 的get方法 
	 * @return yearMonth
	 */
	public String getYearMonth() {
		return yearMonth;
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
	 * @Description: 属性 empCode 的get方法 
	 * @return empCode
	 */
	public String getEmpCode() {
		return empCode;
	}

	/**
	 * @Description: 属性 shopId 的get方法 
	 * @return shopId
	 */
	public String getShopId() {
		return shopId;
	}

	/**
	 * @Description: 属性 proLineId 的get方法 
	 * @return proLineId
	 */
	public String getProLineId() {
		return proLineId;
	}

	/**
	 * @Description: 属性 target 的get方法 
	 * @return target
	 */
	public BigDecimal getTarget() {
		return target;
	}

	/**
	 * @Description: 属性 actual 的get方法 
	 * @return actual
	 */
	public BigDecimal getActual() {
		return actual;
	}

	/**
	 * @return the bonus
	 */
	public BigDecimal getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}

	/**
	 * @return the memCnts
	 */
	public BigDecimal getMemCnts() {
		return memCnts;
	}

	/**
	 * @param memCnts the memCnts to set
	 */
	public void setMemCnts(BigDecimal memCnts) {
		this.memCnts = memCnts;
	}

	/**
	 * @Description: 属性 completionRate 的get方法 
	 * @return completionRate
	 */
	public BigDecimal getCompletionRate() {
		return completionRate;
	}

	/**
	 * @Description: 属性 yearMonthBegin 的get方法 
	 * @return yearMonthBegin
	 */
	public String getYearMonthBegin() {
		return yearMonthBegin;
	}

	/**
	 * @Description: 属性 yearMonthBegin 的set方法 
	 * @param yearMonthBegin 
	 */
	public void setYearMonthBegin(String yearMonthBegin) {
		this.yearMonthBegin = yearMonthBegin;
	}

	/**
	 * @Description: 属性 yearMonth 的set方法 
	 * @param yearMonth 
	 */
	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}

	/**
	 * @Description: 属性 empCode 的set方法 
	 * @param empCode 
	 */
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	/**
	 * @Description: 属性 shopId 的set方法 
	 * @param shopId 
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	/**
	 * @Description: 属性 proLineId 的set方法 
	 * @param proLineId 
	 */
	public void setProLineId(String proLineId) {
		this.proLineId = proLineId;
	}

	/**
	 * @Description: 属性 target 的set方法 
	 * @param target 
	 */
	public void setTarget(BigDecimal target) {
		this.target = target;
	}

	/**
	 * @Description: 属性 actual 的set方法 
	 * @param actual 
	 */
	public void setActual(BigDecimal actual) {
		this.actual = actual;
	}

	/**
	 * @Description: 属性 completionRate 的set方法 
	 * @param completionRate 
	 */
	public void setCompletionRate(BigDecimal completionRate) {
		this.completionRate = completionRate;
	}

	/**
	 * @return the totalRetail
	 */
	public BigDecimal getTotalRetail() {
		return totalRetail;
	}

	/**
	 * @param totalRetail the totalRetail to set
	 */
	public void setTotalRetail(BigDecimal totalRetail) {
		this.totalRetail = totalRetail;
	}

	/**
	 * @return the befRetail
	 */
	public BigDecimal getBefRetail() {
		return befRetail;
	}

	/**
	 * @param befRetail the befRetail to set
	 */
	public void setBefRetail(BigDecimal befRetail) {
		this.befRetail = befRetail;
	}

	/**
	 * @return the totalBonus
	 */
	public BigDecimal getTotalBonus() {
		return totalBonus;
	}

	/**
	 * @param totalBonus the totalBonus to set
	 */
	public void setTotalBonus(BigDecimal totalBonus) {
		this.totalBonus = totalBonus;
	}

	/**
	 * @return the befBonus
	 */
	public BigDecimal getBefBonus() {
		return befBonus;
	}

	/**
	 * @param befBonus the befBonus to set
	 */
	public void setBefBonus(BigDecimal befBonus) {
		this.befBonus = befBonus;
	}

	/**
	 * @return the befTargetRetail
	 */
	public BigDecimal getBefTargetRetail() {
		return befTargetRetail;
	}

	/**
	 * @param befTargetRetail the befTargetRetail to set
	 */
	public void setBefTargetRetail(BigDecimal befTargetRetail) {
		this.befTargetRetail = befTargetRetail;
	}

	/**
	 * @return the befCompletRate
	 */
	public BigDecimal getBefCompletRate() {
		return befCompletRate;
	}

	/**
	 * @param befCompletRate the befCompletRate to set
	 */
	public void setBefCompletRate(BigDecimal befCompletRate) {
		this.befCompletRate = befCompletRate;
	}

	/**
	 * @return the befReward
	 */
	public BigDecimal getBefReward() {
		return befReward;
	}

	/**
	 * @param befReward the befReward to set
	 */
	public void setBefReward(BigDecimal befReward) {
		this.befReward = befReward;
	}

	/**
	 * @return the targetMoney
	 */
	public BigDecimal getTargetMoney() {
		return targetMoney;
	}

	/**
	 * @param targetMoney the targetMoney to set
	 */
	public void setTargetMoney(BigDecimal targetMoney) {
		this.targetMoney = targetMoney;
	}

	/**
	 * @return the actualMoney
	 */
	public BigDecimal getActualMoney() {
		return actualMoney;
	}

	/**
	 * @param actualMoney the actualMoney to set
	 */
	public void setActualMoney(BigDecimal actualMoney) {
		this.actualMoney = actualMoney;
	}

	/**
	 * @return the befTargetMoney
	 */
	public BigDecimal getBefTargetMoney() {
		return befTargetMoney;
	}

	/**
	 * @param befTargetMoney the befTargetMoney to set
	 */
	public void setBefTargetMoney(BigDecimal befTargetMoney) {
		this.befTargetMoney = befTargetMoney;
	}

	/**
	 * @return the befActualMoney
	 */
	public BigDecimal getBefActualMoney() {
		return befActualMoney;
	}

	/**
	 * @param befActualMoney the befActualMoney to set
	 */
	public void setBefActualMoney(BigDecimal befActualMoney) {
		this.befActualMoney = befActualMoney;
	}
	
	/**
	 * @return the moneyCompleteRate
	 */
	public BigDecimal getMoneyCompleteRate() {
		return moneyCompleteRate;
	}

	/**
	 * @param moneyCompleteRate the moneyCompleteRate to set
	 */
	public void setMoneyCompleteRate(BigDecimal moneyCompleteRate) {
		this.moneyCompleteRate = moneyCompleteRate;
	}

	/**
	 * @return the befMoneyCompleteRate
	 */
	public BigDecimal getBefMoneyCompleteRate() {
		return befMoneyCompleteRate;
	}

	/**
	 * @param befMoneyCompleteRate the befMoneyCompleteRate to set
	 */
	public void setBefMoneyCompleteRate(BigDecimal befMoneyCompleteRate) {
		this.befMoneyCompleteRate = befMoneyCompleteRate;
	}

	/**
	 * @return the prodCode
	 */
	public String getProdCode() {
		return prodCode;
	}

	/**
	 * @param prodCode the prodCode to set
	 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	/**
	 * @return the prodName
	 */
	public String getProdName() {
		return prodName;
	}

	/**
	 * @param prodName the prodName to set
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	/**
	 * @return the qty
	 */
	public String getQty() {
		return qty;
	}

	/**
	 * @param qty the qty to set
	 */
	public void setQty(String qty) {
		this.qty = qty;
	}

	/**
	 * @return the retailMoney
	 */
	public BigDecimal getRetailMoney() {
		return retailMoney;
	}

	/**
	 * @param retailMoney the retailMoney to set
	 */
	public void setRetailMoney(BigDecimal retailMoney) {
		this.retailMoney = retailMoney;
	}

	/*=====================toString=======================*/
	/**
	* <p>Description: RetailDTO自动生成的toString方法</p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:08:19 
	* @return 
	* @see java.lang.Object#toString() 
	*/
	@Override
	public String toString() {
		return "RetailDTO [yearMonth=" + yearMonth + ", yearMonthBegin="
				+ yearMonthBegin + ", operatorId=" + operatorId + ", empCode="
				+ empCode + ", shopId=" + shopId + ", proLineId=" + proLineId
				+ ", target=" + target + ", actual=" + actual + ", bonus="
				+ bonus + ", memCnts=" + memCnts + ", completionRate="
				+ completionRate + ", totalRetail=" + totalRetail
				+ ", befRetail=" + befRetail + ", totalBonus=" + totalBonus
				+ ", befBonus=" + befBonus + ", befTargetRetail="
				+ befTargetRetail + ", befCompletRate=" + befCompletRate
				+ ", befReward=" + befReward + ", targetMoney=" + targetMoney
				+ ", actualMoney=" + actualMoney + ", moneyCompleteRate="
				+ moneyCompleteRate + ", befTargetMoney=" + befTargetMoney
				+ ", befActualMoney=" + befActualMoney
				+ ", befMoneyCompleteRate=" + befMoneyCompleteRate
				+ ", prodCode=" + prodCode + ", prodName=" + prodName
				+ ", qty=" + qty + ", retailMoney=" + retailMoney + "]";
	}
}
