/**
* @Company 青鸟软通   
* @Title: ShopPositionDomain.java 
* @Package com.haier.isales.dailymgt.shopposition.domain 
* @author John.zhao   
* @date 2015-3-2 下午2:10:33 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.shopposition.domain;

/** 
 * @ClassName: ShopPositionDomain 
 * TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ShopPositionDomain {
	
	/** 
	* @Fields shopCode : 门店编码 
	*/ 
	private String shopCode;
	/** 
	* @Fields shopName : 门店名称
	*/ 
	private String shopName;
	/** 
	* @Fields customerCode : 管理客户编码
	*/ 
	private String customerCode;
	/** 
	* @Fields customerName : 管理客户名称
	*/ 
	private String customerName;
	/** 
	* @Fields shopLongitude : 门店所在位置经度
	*/ 
	private Long shopLongitude;
	/** 
	* @Fields shopLatitude : 门店所在位置纬度
	*/ 
	private Long shopLatitude;
	/** 
	* @Fields shopAddress : 门店地址 
	*/ 
	private String shopAddress;
	
	//==================getters & setters================
	/**
	 * 属性 shopCode 的get方法 
	 * @return shopCode
	 */
	public String getShopCode() {
		return shopCode;
	}
	/**
	 * 属性 shopCode 的set方法 
	 * @param shopCode 
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}
	/**
	 * 属性 shopName 的get方法 
	 * @return shopName
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * 属性 shopName 的set方法 
	 * @param shopName 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * 属性 customerCode 的get方法 
	 * @return customerCode
	 */
	public String getCustomerCode() {
		return customerCode;
	}
	/**
	 * 属性 customerCode 的set方法 
	 * @param customerCode 
	 */
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	/**
	 * 属性 customerName 的get方法 
	 * @return customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * 属性 customerName 的set方法 
	 * @param customerName 
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * 属性 shopLongitude 的get方法 
	 * @return shopLongitude
	 */
	public Long getShopLongitude() {
		return shopLongitude;
	}
	/**
	 * 属性 shopLongitude 的set方法 
	 * @param shopLongitude 
	 */
	public void setShopLongitude(Long shopLongitude) {
		this.shopLongitude = shopLongitude;
	}
	/**
	 * 属性 shopLatitude 的get方法 
	 * @return shopLatitude
	 */
	public Long getShopLatitude() {
		return shopLatitude;
	}
	/**
	 * 属性 shopLatitude 的set方法 
	 * @param shopLatitude 
	 */
	public void setShopLatitude(Long shopLatitude) {
		this.shopLatitude = shopLatitude;
	}
	/**
	 * 属性 shopAddress 的get方法 
	 * @return shopAddress
	 */
	public String getShopAddress() {
		return shopAddress;
	}
	/**
	 * 属性 shopAddress 的set方法 
	 * @param shopAddress 
	 */
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

}
