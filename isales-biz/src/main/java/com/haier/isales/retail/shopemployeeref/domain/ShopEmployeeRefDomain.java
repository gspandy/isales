/**
* @Company 青鸟软通   
* @Title: ShopEmployeeRefDomain.java 
* @Package com.haier.isales.retail.shopemployeeref.domain 
* @author John.Zhao   
* @date 2015年04月03日  15:37:43 
* @version V1.0   
*/ 
package com.haier.isales.retail.shopemployeeref.domain;

import java.io.Serializable;

/** 
 * @ClassName: ShopEmployeeRefDomain 
 * t_isales_shop_employee_ref 自动生成的对应的实体对象   
 *  
 */
public class ShopEmployeeRefDomain implements Serializable{
	private static final long serialVersionUID = -1428046663058L;

	/** 
	* @Fields id : 系统中的主键，无意义
	*/
	private Long id;
	/** 
	* @Fields month : 月份
	*/
	private String month;
	/** 
	* @Fields userCode : 员工工号
	*/
	private String userCode;
	/** 
	* @Fields shopCode : 门店编码
	*/
	private String shopCode;
	/** 
	* @Fields shopName : 门店名称
	*/
	private String shopName;
	/** 
	* @Fields synchronousTime : 数据同步时间
	*/
	private java.util.Date synchronousTime;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
		
	
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
	 * 属性 month 的get方法 
	 * @return id
	 */
	public String getMonth() {
		return this.month;
	}
	/**
	 * 属性 month 的set方法 
	 * @param id 
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * 属性 userCode 的get方法 
	 * @return id
	 */
	public String getUserCode() {
		return this.userCode;
	}
	/**
	 * 属性 userCode 的set方法 
	 * @param id 
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
	 * 属性 synchronousTime 的get方法 
	 * @return id
	 */
	public java.util.Date getSynchronousTime() {
		return this.synchronousTime;
	}
	/**
	 * 属性 synchronousTime 的set方法 
	 * @param id 
	 */
	public void setSynchronousTime(java.util.Date synchronousTime) {
		this.synchronousTime = synchronousTime;
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
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: ShopEmployeeRefDomain 自动生成的hashcode方法</p> 
	* @author John.Zhao   
	* @date 2015年04月03日  15:37:43
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
	* <p>Description:ShopEmployeeRefDomain 自动生成的equals方法 </p> 
	* @author John.Zhao   
	* @date 2015年04月03日  15:37:43
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
		ShopEmployeeRefDomain other =(ShopEmployeeRefDomain) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			} 
		}else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:ShopEmployeeRefDomain 自动生成的toString方法 </p> 
	* @author John.Zhao   
	* @date 2015年04月03日  15:37:43 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ShopEmployeeRefDomain [" +
					"id=" + id + "," + 
					"month=" + month + "," + 
					"userCode=" + userCode + "," + 
					"shopCode=" + shopCode + "," + 
					"shopName=" + shopName + "," + 
					"synchronousTime=" + synchronousTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
