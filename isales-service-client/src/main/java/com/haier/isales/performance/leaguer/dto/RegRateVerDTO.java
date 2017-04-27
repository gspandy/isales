/**
* @Company 青鸟软通   
* @Title: RegRateVerDTO.java 
* @Package com.haier.isales.performance.leaguer.registrate.domain 
* @author Guo Yuchao   
* @date 2014年12月18日  10:12:17 
* @version V1.0   
*/ 
package com.haier.isales.performance.leaguer.dto;

import java.io.Serializable;

/** 
 * @ClassName: RegRateVerDTO 
 * @Description: t_zzjyt_regist_rate_verified 自动生成的对应的实体对象   
 *  
 */
public class RegRateVerDTO implements Serializable{
	private static final long serialVersionUID = -1418868737282L;

	/** 
	* @Fields id : 本系统中表的主键，无意义。同步数据时对方数据库中没有对应的字段
	*/
	private Long id;
	/** 
	* @Fields month : 月份
	*/
	private String month;
	/** 
	* @Fields orgId : 中心
	*/
	private String orgId;
	/** 
	* @Fields orgName : 工贸名称
	*/
	private String orgName;
	/** 
	* @Fields shopId : 门店
	*/
	private String shopId;
	/** 
	* @Fields shopName : 门店名称
	*/
	private String shopName;
	/** 
	* @Fields productLineId : 产品线
	*/
	private String productLineId;
	/** 
	* @Fields productLineName : 旧产品线名称
	*/
	private String productLineName;
	/** 
	* @Fields counts : 销量（已验证）
	*/
	private String counts;
	/** 
	* @Fields registQty : 注册量
	*/
	private String registQty;
	/** 
	* @Fields registRate : 注册率
	*/
	private String registRate;
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
	 * @Description: 属性 month 的get方法 
	 * @return id
	 */
	public String getMonth() {
		return this.month;
	}
	/**
	 * @Description: 属性 month 的set方法 
	 * @param id 
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * @Description: 属性 orgId 的get方法 
	 * @return id
	 */
	public String getOrgId() {
		return this.orgId;
	}
	/**
	 * @Description: 属性 orgId 的set方法 
	 * @param id 
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	/**
	 * @Description: 属性 orgName 的get方法 
	 * @return id
	 */
	public String getOrgName() {
		return this.orgName;
	}
	/**
	 * @Description: 属性 orgName 的set方法 
	 * @param id 
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	/**
	 * @Description: 属性 shopId 的get方法 
	 * @return id
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * @Description: 属性 shopId 的set方法 
	 * @param id 
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
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
	 * @Description: 属性 productLineId 的get方法 
	 * @return id
	 */
	public String getProductLineId() {
		return this.productLineId;
	}
	/**
	 * @Description: 属性 productLineId 的set方法 
	 * @param id 
	 */
	public void setProductLineId(String productLineId) {
		this.productLineId = productLineId;
	}
	/**
	 * @Description: 属性 productLineName 的get方法 
	 * @return id
	 */
	public String getProductLineName() {
		return this.productLineName;
	}
	/**
	 * @Description: 属性 productLineName 的set方法 
	 * @param id 
	 */
	public void setProductLineName(String productLineName) {
		this.productLineName = productLineName;
	}
	/**
	 * @Description: 属性 counts 的get方法 
	 * @return id
	 */
	public String getCounts() {
		return this.counts;
	}
	/**
	 * @Description: 属性 counts 的set方法 
	 * @param id 
	 */
	public void setCounts(String counts) {
		this.counts = counts;
	}
	/**
	 * @Description: 属性 registQty 的get方法 
	 * @return id
	 */
	public String getRegistQty() {
		return this.registQty;
	}
	/**
	 * @Description: 属性 registQty 的set方法 
	 * @param id 
	 */
	public void setRegistQty(String registQty) {
		this.registQty = registQty;
	}
	/**
	 * @Description: 属性 registRate 的get方法 
	 * @return id
	 */
	public String getRegistRate() {
		return this.registRate;
	}
	/**
	 * @Description: 属性 registRate 的set方法 
	 * @param id 
	 */
	public void setRegistRate(String registRate) {
		this.registRate = registRate;
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
	/*==================== toString() ====================*/
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:07:05 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "RegRateVerDTO [id=" + id + ", month=" + month + ", orgId="
				+ orgId + ", orgName=" + orgName + ", shopId=" + shopId
				+ ", shopName=" + shopName + ", productLineId=" + productLineId
				+ ", productLineName=" + productLineName + ", counts=" + counts
				+ ", registQty=" + registQty + ", registRate=" + registRate
				+ ", remark=" + remark + "]";
	}
		
	
		

		

	
	
}
