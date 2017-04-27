/**
* @Company 青鸟软通   
* @Title: CustomerDomain.java 
* @Package com.haier.isales.customer.domain 
* @author Cao Rui   
* @date 2014年11月12日  12:01:59 
* @version V1.0   
*/ 
package com.haier.isales.customer.domain;

import java.io.Serializable;

/** 潜在客户信息实体
 * @ClassName: PotentialCustomerDomain 
 * isales_potential_customer 自动生成的对应的实体对象   
 *  
 */
public class PotentialCustomerDomain implements Serializable{
	private static final long serialVersionUID = -1415764919777L;

	private Long id;		//主键

	private Long userId;		//直销员id

	private String userCode;		//直销员员工号

	private String shopCode;		//所在门店编码

	private String shopName;		//所在门店

	private java.util.Date updateTime;		// 更新日期

	private java.util.Date createTime;		//添加日期

	private String customerName;		//姓名

	private String customerAdd;		//住址

	private String customerMobile;		//客户手机

	private String customerPhone;		//客户固话

	private String customerIdno;		//客户身份证号

	private String customerBirthday;		//客户生日

	private String customerFeatures;		//客户特征

	private String customerStatus;		//客户状态

	private java.util.Date expectedBuyDate;		//预计购机日期
	
	private java.util.Date remindTime;		//提醒时间

	private String productCode;		// 购买产品型号编码

	private String productName;		//购买产品型号

	private String productSeriesCode;		//购买产品系列的编码

	private String productSeriesName;		//购买产品系列名称

	private String buyUseId;		//购买用途id

	private String buyUse;		//购买用途名称

	private String remark;		// 备注
		
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
	 * 属性 userId 的get方法 
	 * @return userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 属性 userId 的set方法 
	 * @param userId 
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
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
	 * 属性 shopCode 的get方法 
	 * @return id
	 */
	public String getShopCode() {
		return this.shopCode;
	}
	/**
	 * 属性 shopCode 的set方法 
	 * @param id 
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}
	/**
	 * 属性 shopName 的get方法 
	 * @return id
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * 属性 shopName 的set方法 
	 * @param id 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * 属性 updateTime 的get方法 
	 * @return id
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * 属性 updateTime 的set方法 
	 * @param id 
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 属性 createTime 的get方法 
	 * @return id
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * 属性 createTime 的set方法 
	 * @param id 
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 属性 customerName 的get方法 
	 * @return id
	 */
	public String getCustomerName() {
		return this.customerName;
	}
	/**
	 * 属性 customerName 的set方法 
	 * @param id 
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * 属性 customerAdd 的get方法 
	 * @return id
	 */
	public String getCustomerAdd() {
		return this.customerAdd;
	}
	/**
	 * 属性 customerAdd 的set方法 
	 * @param id 
	 */
	public void setCustomerAdd(String customerAdd) {
		this.customerAdd = customerAdd;
	}
	/**
	 * 属性 customerMobile 的get方法 
	 * @return id
	 */
	public String getCustomerMobile() {
		return this.customerMobile;
	}
	/**
	 * 属性 customerMobile 的set方法 
	 * @param id 
	 */
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}
	/**
	 * 属性 customerPhone 的get方法 
	 * @return id
	 */
	public String getCustomerPhone() {
		return this.customerPhone;
	}
	/**
	 * 属性 customerPhone 的set方法 
	 * @param id 
	 */
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	/**
	 * 属性 expectedBuyDate 的get方法 
	 * @return id
	 */
	public java.util.Date getExpectedBuyDate() {
		return this.expectedBuyDate;
	}
	/**
	 * 属性 expectedBuyDate 的set方法 
	 * @param id 
	 */
	public void setExpectedBuyDate(java.util.Date expectedBuyDate) {
		this.expectedBuyDate = expectedBuyDate;
	}
	/**
	 * 属性 productCode 的get方法 
	 * @return id
	 */
	public String getProductCode() {
		return this.productCode;
	}
	/**
	 * 属性 productCode 的set方法 
	 * @param id 
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * 属性 productName 的get方法 
	 * @return id
	 */
	public String getProductName() {
		return this.productName;
	}
	/**
	 * 属性 productName 的set方法 
	 * @param id 
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 属性 productSeriesCode 的get方法 
	 * @return productSeriesCode
	 */
	public String getProductSeriesCode() {
		return productSeriesCode;
	}
	/**
	 * 属性 productSeriesCode 的set方法 
	 * @param productSeriesCode 
	 */
	public void setProductSeriesCode(String productSeriesCode) {
		this.productSeriesCode = productSeriesCode;
	}
	/**
	 * 属性 productSeriesName 的get方法 
	 * @return productSeriesName
	 */
	public String getProductSeriesName() {
		return productSeriesName;
	}
	/**
	 * 属性 productSeriesName 的set方法 
	 * @param productSeriesName 
	 */
	public void setProductSeriesName(String productSeriesName) {
		this.productSeriesName = productSeriesName;
	}
	/**
	 * 属性 buyUseId 的get方法 
	 * @return id
	 */
	public String getBuyUseId() {
		return this.buyUseId;
	}
	/**
	 * 属性 buyUseId 的set方法 
	 * @param id 
	 */
	public void setBuyUseId(String buyUseId) {
		this.buyUseId = buyUseId;
	}
	/**
	 * 属性 buyUse 的get方法 
	 * @return id
	 */
	public String getBuyUse() {
		return this.buyUse;
	}
	/**
	 * 属性 buyUse 的set方法 
	 * @param id 
	 */
	public void setBuyUse(String buyUse) {
		this.buyUse = buyUse;
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
	 * 属性 customerIdno 的get方法 
	 * @return customerIDno
	 */
	public String getCustomerIdno() {
		return customerIdno;
	}
	/**
	 * 属性 customerIdno 的set方法 
	 * @param customerIDno 
	 */
	public void setCustomerIdno(String customerIdno) {
		this.customerIdno = customerIdno;
	}
	/**
	 * 属性 customerBirthday 的get方法 
	 * @return customerBirthday
	 */
	public String getCustomerBirthday() {
		return customerBirthday;
	}
	/**
	 * 属性 customerBirthday 的set方法 
	 * @param customerBirthday 
	 */
	public void setCustomerBirthday(String customerBirthday) {
		this.customerBirthday = customerBirthday;
	}
	/**
	 * 属性 customerFeatures 的get方法 
	 * @return customerFeatures
	 */
	public String getCustomerFeatures() {
		return customerFeatures;
	}
	/**
	 * 属性 customerFeatures 的set方法 
	 * @param customerFeatures 
	 */
	public void setCustomerFeatures(String customerFeatures) {
		this.customerFeatures = customerFeatures;
	}
	/**
	 * 属性 customerStatus 的get方法 
	 * @return customerStatus
	 */
	public String getCustomerStatus() {
		return customerStatus;
	}
	/**
	 * 属性 customerStatus 的set方法 
	 * @param customerStatus 
	 */
	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
/**
	 * 属性 remindTime 的get方法 
	 * @return remindTime
	 */
	public java.util.Date getRemindTime() {
		return remindTime;
	}
	/**
	 * 属性 remindTime 的set方法 
	 * @param remindTime 
	 */
	public void setRemindTime(java.util.Date remindTime) {
		this.remindTime = remindTime;
	}
/*====================hashCode and equals ====================*/
/**
	* <p>Description: CustomerDomain 自动生成的hashcode方法</p> 
	* @author Cao Rui   
	* @date 2014年11月12日  12:01:59
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
	* <p>Description:CustomerDomain 自动生成的equals方法 </p> 
	* @author Cao Rui   
	* @date 2014年11月12日  12:01:59
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
		PotentialCustomerDomain other =(PotentialCustomerDomain) obj;

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
	* <p>Description:CustomerDomain 自动生成的toString方法 </p> 
	* @author Cao Rui   
	* @date 2014年11月12日  12:01:59 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "CustomerDomain [" +
					"id=" + id + "," + 
					"userId=" + userId + "," + 
					"userCode=" + userCode + "," + 
					"shopCode=" + shopCode + "," + 
					"shopName=" + shopName + "," + 
					"updateTime=" + updateTime + "," + 
					"createTime=" + createTime + "," + 
					"customerName=" + customerName + "," + 
					"customerAdd=" + customerAdd + "," + 
					"customerMobile=" + customerMobile + "," + 
					"customerPhone=" + customerPhone + "," + 
					"expectedBuyDate=" + expectedBuyDate + "," + 
					"productCode=" + productCode + "," + 
					"productName=" + productName + "," + 
					"buyUseId=" + buyUseId + "," + 
					"buyUse=" + buyUse + "," + 
					"remark=" + remark + "," + 
				"]";
	}
}
