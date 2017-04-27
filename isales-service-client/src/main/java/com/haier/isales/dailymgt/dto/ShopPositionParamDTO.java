/**
* @Company 青鸟软通   
* @Title: ShopPositionParamDTO.java 
* @Package com.haier.isales.dailymgt.dto 
* @author John zhao   
* @date 2015-3-2 下午2:39:14 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.dto;

import java.io.Serializable;

/** 
 * @ClassName: ShopPositionParamDTO 
 * @Description: 
 *  
 */
public class ShopPositionParamDTO implements Serializable{

	/** 
	* @Fields serialVersionUID : 版本号
	*/ 
	private static final long serialVersionUID = -2939536425053195674L;

	/** 
	* @Fields shopLongitude : 门店所在位置经度
	*/ 
	private Double shopLongitude;
	/** 
	* @Fields shopLatitude : 门店所在位置纬度
	*/ 
	private Double shopLatitude;
	/** 
	* @Fields shopCode : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private String shopCode;
	/** 
	* @Fields shopName : 门店名称
	*/ 
	private String shopName;
	/** 
	* @Fields userCode : 用户账号
	*/ 
	private String userCode;
	/** 
	* @Fields userName : 用户名
	*/ 
	private String userName;
	/** 
	* @Fields operatorId : 用户唯一标识
	*/ 
	private Long operatorId;
	
	//==================getters & setters=====================
	/**
	 * @Description: 属性 shopLongitude 的get方法 
	 * @return shopLongitude
	 */
	public Double getShopLongitude() {
		return shopLongitude;
	}

	/**
	 * @Description: 属性 shopLongitude 的set方法 
	 * @param shopLongitude 
	 */
	public void setShopLongitude(Double shopLongitude) {
		this.shopLongitude = shopLongitude;
	}

	/**
	 * @Description: 属性 shopLatitude 的get方法 
	 * @return shopLatitude
	 */
	public Double getShopLatitude() {
		return shopLatitude;
	}

	/**
	 * @Description: 属性 shopLatitude 的set方法 
	 * @param shopLatitude 
	 */
	public void setShopLatitude(Double shopLatitude) {
		this.shopLatitude = shopLatitude;
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
	 * @Description: 属性 userName 的get方法 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @Description: 属性 userName 的set方法 
	 * @param userName 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
}
