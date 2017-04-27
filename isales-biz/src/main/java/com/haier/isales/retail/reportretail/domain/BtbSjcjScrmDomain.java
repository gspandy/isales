/**
* @Company 青鸟软通   
* @Title: BtbSjcjScrmDomain.java 
* @Package com.haier.isales.reportretail.domain 
* @author Shao Jingkai   
* @date 2015年06月23日  09:51:33 
* @version V1.0   
*/ 
package com.haier.isales.retail.reportretail.domain;

import java.io.Serializable;

/** 
 * @ClassName: BtbSjcjScrmDomain 
 * @Description: t_isales_btb_sjcj_scrm 自动生成的对应的实体对象   
 *  
 */
public class BtbSjcjScrmDomain implements Serializable{
	private static final long serialVersionUID = -1435024293520L;

	/** 
	* @Fields id : id,无意义
	*/
	private Long id;
	/** 
	* @Fields months : 月份
	*/
	private String months;
	/** 
	* @Fields orgCode : 中心编码
	*/
	private String orgCode;
	/** 
	* @Fields orgName : 中心名称
	*/
	private String orgName;
	/** 
	* @Fields chanCode : 渠道编码
	*/
	private String chanCode;
	/** 
	* @Fields chanName : 渠道名称
	*/
	private String chanName;
	/** 
	* @Fields shopCode : 门店编码
	*/
	private String shopCode;
	/** 
	* @Fields shopName : 门店名称
	*/
	private String shopName;
	/** 
	* @Fields prolineCode : 产品线编码
	*/
	private String prolineCode;
	/** 
	* @Fields prolineName : 产品线名称
	*/
	private String prolineName;
	/** 
	* @Fields retailPlan : 零售计划
	*/
	private String retailPlan;
	/** 
	* @Fields retailActual : 零售实际
	*/
	private String retailActual;
	/** 
	* @Fields memberNew : 当月累计新会员数
	*/
	private String memberNew;
	/** 
	* @Fields memberTotal : 新老会员总数
	*/
	private String memberTotal;
	/** 
	* @Fields memberDiff : 差异会员数
	*/ 
	private String memberDiff;
	/** 
	* @Fields synchronousTime : 数据同步时间
	*/
	private java.util.Date synchronousTime;
	/** 
	* @Fields remark : 备注,本系统中添加的字段，预留以存储一些信息。在同步数据时对方数据库中没有对应的字段
	*/
	private String remark;
	
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
	 * @Description: 属性 months 的get方法 
	 * @return months
	 */
	public String getMonths() {
		return months;
	}
	/**
	 * @Description: 属性 months 的set方法 
	 * @param months 
	 */
	public void setMonths(String months) {
		this.months = months;
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
	 * @Description: 属性 shopCode 的get方法 
	 * @return shopCode
	 */
	public String getShopCode() {
		return shopCode;
	}
	/**
	 * @Description: 属性 shopCode 的set方法 
	 * @param shopCode 
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
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
	 * @Description: 属性 prolineCode 的get方法 
	 * @return prolineCode
	 */
	public String getProlineCode() {
		return prolineCode;
	}
	/**
	 * @Description: 属性 prolineCode 的set方法 
	 * @param prolineCode 
	 */
	public void setProlineCode(String prolineCode) {
		this.prolineCode = prolineCode;
	}
	/**
	 * @Description: 属性 prolineName 的get方法 
	 * @return prolineName
	 */
	public String getProlineName() {
		return prolineName;
	}
	/**
	 * @Description: 属性 prolineName 的set方法 
	 * @param prolineName 
	 */
	public void setProlineName(String prolineName) {
		this.prolineName = prolineName;
	}
	/**
	 * @Description: 属性 retailPlan 的get方法 
	 * @return retailPlan
	 */
	public String getRetailPlan() {
		return retailPlan;
	}
	/**
	 * @Description: 属性 retailPlan 的set方法 
	 * @param retailPlan 
	 */
	public void setRetailPlan(String retailPlan) {
		this.retailPlan = retailPlan;
	}
	/**
	 * @Description: 属性 retailActual 的get方法 
	 * @return retailActual
	 */
	public String getRetailActual() {
		return retailActual;
	}
	/**
	 * @Description: 属性 retailActual 的set方法 
	 * @param retailActual 
	 */
	public void setRetailActual(String retailActual) {
		this.retailActual = retailActual;
	}
	/**
	 * @Description: 属性 memberNew 的get方法 
	 * @return memberNew
	 */
	public String getMemberNew() {
		return memberNew;
	}
	/**
	 * @Description: 属性 memberNew 的set方法 
	 * @param memberNew 
	 */
	public void setMemberNew(String memberNew) {
		this.memberNew = memberNew;
	}
	/**
	 * @Description: 属性 memberTotal 的get方法 
	 * @return memberTotal
	 */
	public String getMemberTotal() {
		return memberTotal;
	}
	/**
	 * @Description: 属性 memberTotal 的set方法 
	 * @param memberTotal 
	 */
	public void setMemberTotal(String memberTotal) {
		this.memberTotal = memberTotal;
	}
	/**
	 * @Description: 属性 memberDiff 的get方法 
	 * @return memberDiff
	 */
	public String getMemberDiff() {
		return memberDiff;
	}
	/**
	 * @Description: 属性 memberDiff 的set方法 
	 * @param memberDiff 
	 */
	public void setMemberDiff(String memberDiff) {
		this.memberDiff = memberDiff;
	}
	/**
	 * @Description: 属性 synchronousTime 的get方法 
	 * @return synchronousTime
	 */
	public java.util.Date getSynchronousTime() {
		return synchronousTime;
	}
	/**
	 * @Description: 属性 synchronousTime 的set方法 
	 * @param synchronousTime 
	 */
	public void setSynchronousTime(java.util.Date synchronousTime) {
		this.synchronousTime = synchronousTime;
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
	
	/*========================toString===========================*/
	/**
	* <p>Description: </p> 
	* @author Shao Jingkai   
	* @date 2015-7-20 下午4:18:28 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "BtbSjcjScrmDomain [id=" + id + ", months=" + months
				+ ", orgCode=" + orgCode + ", orgName=" + orgName
				+ ", chanCode=" + chanCode + ", chanName=" + chanName
				+ ", shopCode=" + shopCode + ", shopName=" + shopName
				+ ", prolineCode=" + prolineCode + ", prolineName="
				+ prolineName + ", retailPlan=" + retailPlan
				+ ", retailActual=" + retailActual + ", memberNew=" + memberNew
				+ ", memberTotal=" + memberTotal + ", memberDiff=" + memberDiff
				+ ", synchronousTime=" + synchronousTime + ", remark=" + remark
				+ "]";
	}
}
