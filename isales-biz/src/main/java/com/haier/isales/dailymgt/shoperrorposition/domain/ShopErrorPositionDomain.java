/**
* @Company 青鸟软通   
* @Title: ShopErrorPositionDomain.java 
* @Package com.haier.isales.dailymgt.shoperrorposition.domain 
* @author John.zhao   
* @date 2015年03月05日  10:38:57 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.shoperrorposition.domain;

import java.io.Serializable;

/** 
 * @ClassName: ShopErrorPositionDomain 
 * t_isales_shop_error_position 自动生成的对应的实体对象   
 *  
 */
public class ShopErrorPositionDomain implements Serializable{
	private static final long serialVersionUID = -1425523137934L;

	/** 
	* @Fields id : 自增长主键，无意义
	*/
	private Long id;
	/** 
	* @Fields shopCode : 门店编码
	*/
	private String shopCode;
	/** 
	* @Fields shopName : 门店名称
	*/
	private String shopName;
	/** 
	* @Fields currentLongitude : 门店所在位置经度
	*/
	private String currentLongitude;
	/** 
	* @Fields currentLatitude : 门店所在位置纬度
	*/
	private String currentLatitude;
	/** 
	* @Fields shopLongitude : 门店所在位置经度
	*/
	private String shopLongitude;
	/** 
	* @Fields shopLatitude : 门店所在位置纬度
	*/
	private String shopLatitude;
	/** 
	* @Fields errorDistance : 误差距离
	*/
	private String errorDistance;
	/** 
	* @Fields shopAddress : 门店地址
	*/
	private String shopAddress;
	/** 
	* @Fields executeResult : 接口返回信息
	*/
	private String executeResult;
	/** 
	* @Fields createTime : 创建时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields operatorId : 创建人id
	*/
	private Long operatorId;
	/** 
	* @Fields userCode : 创建人code
	*/
	private String userCode;
	/** 
	* @Fields userName : 创建人姓名
	*/
	private String userName;
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
	 * 属性 currentLongitude 的get方法 
	 * @return id
	 */
	public String getCurrentLongitude() {
		return this.currentLongitude;
	}
	/**
	 * 属性 currentLongitude 的set方法 
	 * @param id 
	 */
	public void setCurrentLongitude(String currentLongitude) {
		this.currentLongitude = currentLongitude;
	}
	/**
	 * 属性 currentLatitude 的get方法 
	 * @return id
	 */
	public String getCurrentLatitude() {
		return this.currentLatitude;
	}
	/**
	 * 属性 currentLatitude 的set方法 
	 * @param id 
	 */
	public void setCurrentLatitude(String currentLatitude) {
		this.currentLatitude = currentLatitude;
	}
	/**
	 * 属性 shopLongitude 的get方法 
	 * @return id
	 */
	public String getShopLongitude() {
		return this.shopLongitude;
	}
	/**
	 * 属性 shopLongitude 的set方法 
	 * @param id 
	 */
	public void setShopLongitude(String shopLongitude) {
		this.shopLongitude = shopLongitude;
	}
	/**
	 * 属性 shopLatitude 的get方法 
	 * @return id
	 */
	public String getShopLatitude() {
		return this.shopLatitude;
	}
	/**
	 * 属性 shopLatitude 的set方法 
	 * @param id 
	 */
	public void setShopLatitude(String shopLatitude) {
		this.shopLatitude = shopLatitude;
	}
	/**
	 * 属性 errorDistance 的get方法 
	 * @return id
	 */
	public String getErrorDistance() {
		return this.errorDistance;
	}
	/**
	 * 属性 errorDistance 的set方法 
	 * @param id 
	 */
	public void setErrorDistance(String errorDistance) {
		this.errorDistance = errorDistance;
	}
	/**
	 * 属性 shopAddress 的get方法 
	 * @return id
	 */
	public String getShopAddress() {
		return this.shopAddress;
	}
	/**
	 * 属性 shopAddress 的set方法 
	 * @param id 
	 */
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	/**
	 * 属性 executeResult 的get方法 
	 * @return id
	 */
	public String getExecuteResult() {
		return this.executeResult;
	}
	/**
	 * 属性 executeResult 的set方法 
	 * @param id 
	 */
	public void setExecuteResult(String executeResult) {
		this.executeResult = executeResult;
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
	 * 属性 operatorId 的get方法 
	 * @return id
	 */
	public Long getOperatorId() {
		return this.operatorId;
	}
	/**
	 * 属性 operatorId 的set方法 
	 * @param id 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
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
	 * 属性 userName 的get方法 
	 * @return id
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * 属性 userName 的set方法 
	 * @param id 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	* <p>Description: ShopErrorPositionDomain 自动生成的hashcode方法</p> 
	* @author John.zhao   
	* @date 2015年03月05日  10:38:57
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
	* <p>Description:ShopErrorPositionDomain 自动生成的equals方法 </p> 
	* @author John.zhao   
	* @date 2015年03月05日  10:38:57
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		ShopErrorPositionDomain other =(ShopErrorPositionDomain) obj;

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
	* <p>Description:ShopErrorPositionDomain 自动生成的toString方法 </p> 
	* @author John.zhao   
	* @date 2015年03月05日  10:38:57 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ShopErrorPositionDomain [" +
					"id=" + id + "," + 
					"shopCode=" + shopCode + "," + 
					"shopName=" + shopName + "," + 
					"currentLongitude=" + currentLongitude + "," + 
					"currentLatitude=" + currentLatitude + "," + 
					"shopLongitude=" + shopLongitude + "," + 
					"shopLatitude=" + shopLatitude + "," + 
					"errorDistance=" + errorDistance + "," + 
					"shopAddress=" + shopAddress + "," + 
					"executeResult=" + executeResult + "," + 
					"createTime=" + createTime + "," + 
					"operatorId=" + operatorId + "," + 
					"userCode=" + userCode + "," + 
					"userName=" + userName + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
