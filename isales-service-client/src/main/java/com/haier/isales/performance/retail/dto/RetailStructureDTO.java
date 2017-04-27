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

/** 
 * @ClassName: RetailStructureDTO 
 * @Description: 我的业绩-产业结构
 *  
 */
public class RetailStructureDTO implements Serializable{

	/**
	 * @Fields serialVersionUID : 
	 */
	private static final long serialVersionUID = 1L;
	
	private String months;
	
	/** 
	* @Fields shopId : 门店编码
	*/ 
	private String shopId;
	
	/** 
	* @Fields proLineId : 产品线编码 
	*/ 
	private String proLineId;
	
	/**
	 * @Fields qty;销量
	 */
	private String qty;
	/**
	 * @Fields qty;提成
	 */
	private String tc;
	/**
	 * @Fields structionType:结构类型
	 */
	private String structionType;
	public String getMonths() {
		return months;
	}
	public void setMonths(String months) {
		this.months = months;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getProLineId() {
		return proLineId;
	}
	public void setProLineId(String proLineId) {
		this.proLineId = proLineId;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	public String getStructionType() {
		return structionType;
	}
	public void setStructionType(String structionType) {
		this.structionType = structionType;
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
		return "RetailStructureDTO [months=" + months + ", shopId="
				+ shopId + ", proLineId=" + proLineId + ", qty="
				+ qty + ", tc=" + tc + ", structionType=" + structionType + "]";
	}
}
