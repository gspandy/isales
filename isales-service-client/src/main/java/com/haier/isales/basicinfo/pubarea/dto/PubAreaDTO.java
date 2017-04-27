/**
* @Company 青鸟软通   
* @Title: ProvinceDomain.java 
* @Package com.haier.isales.basicinfo.province.domain 
* @author lizhenwei
* @date 2015年12月08日  18:50:43 
* @version V1.0   
*/ 
package com.haier.isales.basicinfo.pubarea.dto;

import java.io.Serializable;

/** 
 * @ClassName: PubAreaDomain 
 * isales_temp.t_isales_pub_area_temp 自动生成的对应的实体对象   
 *  
 */
public class PubAreaDTO implements Serializable{

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
	
	// province  省
	private String provinceCode;
	private String provinceName;
	// city   城市
	private String cityCode;
	private String cityName;
	// area   地区
	private String areaCode;
	private String areaName;
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
	 * @return the provinceCode
	 */
	public String getProvinceCode() {
		return provinceCode;
	}
	/**
	 * @param provinceCode the provinceCode to set
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	/**
	 * @return the provinceName
	 */
	public String getProvinceName() {
		return provinceName;
	}
	/**
	 * @param provinceName the provinceName to set
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	/**
	 * @return the cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return the areaCode
	 */
	public String getAreaCode() {
		return areaCode;
	}
	/**
	 * @param areaCode the areaCode to set
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return areaName;
	}
	/**
	 * @param areaName the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
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
