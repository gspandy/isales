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
 * @Description: 已购买顾客信息dto对象
 *  
 */
public class PurchasedCustomerDTO implements Serializable{
	private static final long serialVersionUID = -14157458621483L;

	private Long id; 	  //id 
	private Long userId;  	//直销员id
	private String userCode;	  //直销员员工号
	private String shopCode;	  //所在门店编码
	private String shopName;	  //所在门店
	private String customerName;  	//姓名
	private String customerAdd;	  //住址
	private String customerMobile;	  //客户手机
	private String customerPhone;  	// 客户固话
	private String productCode;	  //购买产品型号编码
	private String productName;	  //购买产品名称
	private String barCode;  //购买产品条码
	private String productCount;  //产品数量
	private String newPrice;  //产品销售价
	private String buyTime;  //购买日期
	private String isProto;  //是否样机  Y：是样机 ；N：不是样机
	private String reportType;  //提报方式，按条码还是按销量
	private String remark;	  //
		
	
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
	 * @Description: 属性 customerName 的get方法 
	 * @return customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @Description: 属性 customerName 的set方法 
	 * @param customerName 
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @Description: 属性 customerAdd 的get方法 
	 * @return customerAdd
	 */
	public String getCustomerAdd() {
		return customerAdd;
	}
	/**
	 * @Description: 属性 customerAdd 的set方法 
	 * @param customerAdd 
	 */
	public void setCustomerAdd(String customerAdd) {
		this.customerAdd = customerAdd;
	}
	/**
	 * @Description: 属性 customerMobile 的get方法 
	 * @return customerMobile
	 */
	public String getCustomerMobile() {
		return customerMobile;
	}
	/**
	 * @Description: 属性 customerMobile 的set方法 
	 * @param customerMobile 
	 */
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}
	/**
	 * @Description: 属性 customerPhone 的get方法 
	 * @return customerPhone
	 */
	public String getCustomerPhone() {
		return customerPhone;
	}
	/**
	 * @Description: 属性 customerPhone 的set方法 
	 * @param customerPhone 
	 */
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	/**
	 * @Description: 属性 productCode 的get方法 
	 * @return productCode
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * @Description: 属性 productCode 的set方法 
	 * @param productCode 
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
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
	 * @Description: 属性 productCount 的get方法 
	 * @return productCount
	 */
	public String getProductCount() {
		return productCount;
	}
	/**
	 * @Description: 属性 productCount 的set方法 
	 * @param productCount 
	 */
	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}
	/**
	 * @Description: 属性 newPrice 的get方法 
	 * @return newPrice
	 */
	public String getNewPrice() {
		return newPrice;
	}
	/**
	 * @Description: 属性 newPrice 的set方法 
	 * @param newPrice 
	 */
	public void setNewPrice(String newPrice) {
		this.newPrice = newPrice;
	}
	/**
	 * @Description: 属性 buy_time 的get方法 
	 * @return buy_time
	 */
	public String getBuyTime() {
		return buyTime;
	}
	/**
	 * @Description: 属性 buy_time 的set方法 
	 * @param buy_time 
	 */
	public void setBuyTime(String buyTime) {
		this.buyTime = buyTime;
	}
	/**
	 * @Description: 属性 isProto 的get方法 
	 * @return isProto
	 */
	public String getIsProto() {
		return isProto;
	}
	/**
	 * @Description: 属性 isProto 的set方法 
	 * @param isProto 
	 */
	public void setIsProto(String isProto) {
		this.isProto = isProto;
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
	/**
	 * @Description: 属性 barCode 的get方法 
	 * @return barCode
	 */
	public String getBarCode() {
		return barCode;
	}
	/**
	 * @Description: 属性 barCode 的set方法 
	 * @param barCode 
	 */
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	/**
	 * @Description: 属性 reportType 的get方法 
	 * @return reportType
	 */
	public String getReportType() {
		return reportType;
	}
	/**
	 * @Description: 属性 reportType 的set方法 
	 * @param reportType 
	 */
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	/*==================== toString() ====================*/
	/**
	 * <p>Description: PurchasedCustomerDTO自动生成的toString方法</p> 
	 * @author Guo  Yuchao   
	 * @date 2015-1-7 下午7:14:10 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */ 
	@Override
	public String toString() {
		return "PurchasedCustomerDTO [id=" + id + ", userId=" + userId
				+ ", userCode=" + userCode + ", shopCode=" + shopCode
				+ ", shopName=" + shopName + ", customerName=" + customerName
				+ ", customerAdd=" + customerAdd + ", customerMobile="
				+ customerMobile + ", customerPhone=" + customerPhone
				+ ", productCode=" + productCode + ", productName="
				+ productName + ", barCode=" + barCode + ", productCount="
				+ productCount + ", newPrice=" + newPrice + ", buyTime="
				+ buyTime + ", isProto=" + isProto + ", reportType="
				+ reportType + ", remark=" + remark + "]";
	}
}
