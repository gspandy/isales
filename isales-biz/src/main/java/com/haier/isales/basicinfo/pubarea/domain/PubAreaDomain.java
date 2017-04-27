/**
* @Company 青鸟软通   
* @Title: ProvinceDomain.java 
* @Package com.haier.isales.basicinfo.province.domain 
* @author lizhenwei
* @date 2015年12月08日  18:50:43 
* @version V1.0   
*/ 
package com.haier.isales.basicinfo.pubarea.domain;

import java.io.Serializable;

/** 
 * @ClassName: PubAreaDomain 
 * t_isales_province 自动生成的对应的实体对象   
 *  
 */
public class PubAreaDomain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4821245296909000809L;
	/** 
	* @Fields paCode : 行政区划编码
	*/
	private String paCode;
	/** 
	* @Fields paName : 行政区划名称
	*/
	private String paName;
	/** 
	* @Fields paPCode : 上级行政区划编码
	*/
	private String paPCode;
	/** 
	* @Fields paLevel : 行政区划等级
	*/
	private String paLevel;
	
	// shopCode  门店编码
	private String shopCode;
	
	/*=========================getter and setter ===================*/
	/**
	 * @return the paCode
	 */
	public String getPaCode() {
		return paCode;
	}
	/**
	 * @param paCode the paCode to set
	 */
	public void setPaCode(String paCode) {
		this.paCode = paCode;
	}
	/**
	 * @return the paName
	 */
	public String getPaName() {
		return paName;
	}
	/**
	 * @param paName the paName to set
	 */
	public void setPaName(String paName) {
		this.paName = paName;
	}
	/**
	 * @return the paPCode
	 */
	public String getPaPCode() {
		return paPCode;
	}
	/**
	 * @param paPCode the paPCode to set
	 */
	public void setPaPCode(String paPCode) {
		this.paPCode = paPCode;
	}
	/**
	 * @return the paLevel
	 */
	public String getPaLevel() {
		return paLevel;
	}
	/**
	 * @param paLevel the paLevel to set
	 */
	public void setPaLevel(String paLevel) {
		this.paLevel = paLevel;
	}
	/**
	 * @return the shopCode
	 */
	public String getShopCode() {
		return shopCode;
	}
	/**
	 * @param shopCode the shopCode to set
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}
	
}
