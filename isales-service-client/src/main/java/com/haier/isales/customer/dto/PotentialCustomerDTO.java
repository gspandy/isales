/**
* @Company 青鸟软通   
* @Title: PotentialCustomerDTO.java 
* @Package com.haier.isales.customer.dto
* @author Cao  Rui   
* @date 2014年11月12日  12:11:59 
* @version V1.0   
*/ 
package com.haier.isales.customer.dto;

import java.io.Serializable;

/** 
 * @ClassName: PotentialCustomerDTO 
 * @Description: 潜在客户信息dto对象
 *  
 */
public class PotentialCustomerDTO implements Serializable{
	private static final long serialVersionUID = -1415764919778L;

	/** 
	* @Fields id : 
	*/
	private Long id;
	/** 
	* @Fields userId : 直销员id
	*/
	private Long userId;
	/** 
	* @Fields userCode : 直销员员工号
	*/
	private String userCode;
	/** 
	* @Fields shopCode : 所在门店编码
	*/
	private String shopCode;
	/** 
	* @Fields shopName : 所在门店
	*/
	private String shopName;
	/** 
	* @Fields updateTime : 更新日期
	*/
	private java.util.Date updateTime;
	/** 
	* @Fields createTime : 添加日期
	*/
	private java.util.Date createTime;
	/** 
	* @Fields customerName : 姓名
	*/
	private String customerName;
	/** 
	* @Fields customerAdd : 住址
	*/
	private String customerAdd;
	/** 
	* @Fields customerMobile : 客户手机
	*/
	private String customerMobile;
	/** 
	* @Fields customerPhone : 客户固话
	*/
	private String customerPhone;
	/** 
	* @Fields customerIdno : 客户身份证号
	*/
	private String customerIdno;
	/** 
	* @Fields customerbirthday : 客户生日
	*/
	private String customerBirthday;
	/** 
	* @Fields customerFeatures : 客户特征
	*/
	private String customerFeatures;
	/** 
	* @Fields customerStatus : 客户状态
	*/
	private String customerStatus;
	/** 
	* @Fields expectedBuyDate : 预计购机日期,格式为2014-01-01
	*/
	private String expectedBuyDateShow;
	/** 
	* @Fields expectedBuyDate :提醒时间,格式为2014-01-01
	*/
	private String remindTimeShow;
	
	/** 
	* @Fields productCode : 购买产品型号编码
	*/
	private String productCode;
	/** 
	* @Fields productName : 购买产品型号
	*/
	private String productName;
	/** 
	* @Fields productCode : 购买产品系列的编码
	*/
	private String productSeriesCode;
	/** 
	* @Fields productName : 购买产品系列名称
	*/
	private String productSeriesName;
	/** 
	* @Fields buyUseId : 购买用途id
	*/
	private String buyUseId;
	/** 
	* @Fields buyUse : 购买用途名称
	*/
	private String buyUse;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * @Description: 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * @Description: 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @Description: 属性 userId 的get方法 
	 * @return userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @Description: 属性 userId 的set方法 
	 * @param userId 
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
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
	 * @Description: 属性 shopCode 的get方法 
	 * @return id
	 */
	public String getShopCode() {
		return this.shopCode;
	}
	/**
	 * @Description: 属性 shopCode 的set方法 
	 * @param id 
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}
	/**
	 * @Description: 属性 shopName 的get方法 
	 * @return id
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * @Description: 属性 shopName 的set方法 
	 * @param id 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * @Description: 属性 updateTime 的get方法 
	 * @return id
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * @Description: 属性 updateTime 的set方法 
	 * @param id 
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @Description: 属性 createTime 的get方法 
	 * @return id
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * @Description: 属性 createTime 的set方法 
	 * @param id 
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @Description: 属性 customerName 的get方法 
	 * @return id
	 */
	public String getCustomerName() {
		return this.customerName;
	}
	/**
	 * @Description: 属性 customerName 的set方法 
	 * @param id 
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @Description: 属性 customerAdd 的get方法 
	 * @return id
	 */
	public String getCustomerAdd() {
		return this.customerAdd;
	}
	/**
	 * @Description: 属性 customerAdd 的set方法 
	 * @param id 
	 */
	public void setCustomerAdd(String customerAdd) {
		this.customerAdd = customerAdd;
	}
	/**
	 * @Description: 属性 customerMobile 的get方法 
	 * @return id
	 */
	public String getCustomerMobile() {
		return this.customerMobile;
	}
	/**
	 * @Description: 属性 customerMobile 的set方法 
	 * @param id 
	 */
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}
	/**
	 * @Description: 属性 customerPhone 的get方法 
	 * @return id
	 */
	public String getCustomerPhone() {
		return this.customerPhone;
	}
	/**
	 * @Description: 属性 customerPhone 的set方法 
	 * @param id 
	 */
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	/**
	 * @Description: 属性 expectedBuyDateShow 的get方法 
	 * @return expectedBuyDateShow
	 */
	public String getExpectedBuyDateShow() {
		return expectedBuyDateShow;
	}
	/**
	 * @Description: 属性 expectedBuyDateShow 的set方法 
	 * @param expectedBuyDateShow 
	 */
	public void setExpectedBuyDateShow(String expectedBuyDateShow) {
		this.expectedBuyDateShow = expectedBuyDateShow;
	}
	/**
	 * @Description: 属性 remindTimeShow 的get方法 
	 * @return remindTimeShow
	 */
	public String getRemindTimeShow() {
		return remindTimeShow;
	}
	/**
	 * @Description: 属性 remindTimeShow 的set方法 
	 * @param remindTimeShow 
	 */
	public void setRemindTimeShow(String remindTimeShow) {
		this.remindTimeShow = remindTimeShow;
	}
	/**
	 * @Description: 属性 productCode 的get方法 
	 * @return id
	 */
	public String getProductCode() {
		return this.productCode;
	}
	/**
	 * @Description: 属性 productCode 的set方法 
	 * @param id 
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * @Description: 属性 productName 的get方法 
	 * @return id
	 */
	public String getProductName() {
		return this.productName;
	}
	/**
	 * @Description: 属性 productName 的set方法 
	 * @param id 
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * @Description: 属性 productSeriesCode 的get方法 
	 * @return productSeriesCode
	 */
	public String getProductSeriesCode() {
		return productSeriesCode;
	}
	/**
	 * @Description: 属性 productSeriesCode 的set方法 
	 * @param productSeriesCode 
	 */
	public void setProductSeriesCode(String productSeriesCode) {
		this.productSeriesCode = productSeriesCode;
	}
	/**
	 * @Description: 属性 productSeriesName 的get方法 
	 * @return productSeriesName
	 */
	public String getProductSeriesName() {
		return productSeriesName;
	}
	/**
	 * @Description: 属性 productSeriesName 的set方法 
	 * @param productSeriesName 
	 */
	public void setProductSeriesName(String productSeriesName) {
		this.productSeriesName = productSeriesName;
	}
	/**
	 * @Description: 属性 buyUseId 的get方法 
	 * @return id
	 */
	public String getBuyUseId() {
		return this.buyUseId;
	}
	/**
	 * @Description: 属性 buyUseId 的set方法 
	 * @param id 
	 */
	public void setBuyUseId(String buyUseId) {
		this.buyUseId = buyUseId;
	}
	/**
	 * @Description: 属性 buyUse 的get方法 
	 * @return id
	 */
	public String getBuyUse() {
		return this.buyUse;
	}
	/**
	 * @Description: 属性 buyUse 的set方法 
	 * @param id 
	 */
	public void setBuyUse(String buyUse) {
		this.buyUse = buyUse;
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
	 * @Description: 属性 customerIdno 的get方法 
	 * @return customerIDno
	 */
	public String getCustomerIdno() {
		return customerIdno;
	}
	/**
	 * @Description: 属性 customerIdno 的set方法 
	 * @param customerIDno 
	 */
	public void setCustomerIdno(String customerIdno) {
		this.customerIdno = customerIdno;
	}
	/**
	 * @Description: 属性 customerbirthday 的get方法 
	 * @return customerbirthday
	 */
	public String getCustomerBirthday() {
		return customerBirthday;
	}
	/**
	 * @Description: 属性 customerbirthday 的set方法 
	 * @param customerbirthday 
	 */
	public void setCustomerBirthday(String customerbirthday) {
		this.customerBirthday = customerbirthday;
	}
	/**
	 * @Description: 属性 customerFeatures 的get方法 
	 * @return customerFeatures
	 */
	public String getCustomerFeatures() {
		return customerFeatures;
	}
	/**
	 * @Description: 属性 customerFeatures 的set方法 
	 * @param customerFeatures 
	 */
	public void setCustomerFeatures(String customerFeatures) {
		this.customerFeatures = customerFeatures;
	}
	/**
	 * @Description: 属性 customerStatus 的get方法 
	 * @return customerStatus
	 */
	public String getCustomerStatus() {
		return customerStatus;
	}
	/**
	 * @Description: 属性 customerStatus 的set方法 
	 * @param customerStatus 
	 */
	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
	
    /*====================hashCode and equals ====================*/
    /**
	* <p>Description: PotentialCustomerDTO 自动生成的hashcode方法</p> 
	* @author Cao  Rui   
	* @date 2014年11月12日  12:11:59
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
	* <p>Description:PotentialCustomerDTO 自动生成的equals方法 </p> 
	* @author Cao  Rui   
	* @date 2014年11月12日  12:11:59
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
		PotentialCustomerDTO other =(PotentialCustomerDTO) obj;

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
	* <p>Description: PotentialCustomerDTO自动生成的toString方法</p> 
	* @author Guo  Yuchao   
	* @date 2015-1-7 下午7:13:53 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "PotentialCustomerDTO [id=" + id + ", userId=" + userId
				+ ", userCode=" + userCode + ", shopCode=" + shopCode
				+ ", shopName=" + shopName + ", updateTime=" + updateTime
				+ ", createTime=" + createTime + ", customerName="
				+ customerName + ", customerAdd=" + customerAdd
				+ ", customerMobile=" + customerMobile + ", customerPhone="
				+ customerPhone + ", customerIdno=" + customerIdno
				+ ", customerBirthday=" + customerBirthday
				+ ", customerFeatures=" + customerFeatures
				+ ", customerStatus=" + customerStatus
				+ ", expectedBuyDateShow=" + expectedBuyDateShow
				+ ", remindTimeShow=" + remindTimeShow + ", productCode="
				+ productCode + ", productName=" + productName
				+ ", productSeriesCode=" + productSeriesCode
				+ ", productSeriesName=" + productSeriesName + ", buyUseId="
				+ buyUseId + ", buyUse=" + buyUse + ", remark=" + remark + "]";
	}
}
