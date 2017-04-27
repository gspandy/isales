/**
* @Company 青鸟软通   
* @Title: SampleDomain.java 
* @Package com.haier.isales.sample.domain 
* @author lizhenwei   
* @date 2015年11月11日  09:40:13 
* @version V1.0   
*/ 
package com.haier.isales.sample.dto;

import java.io.Serializable;

/** 
 * @ClassName: SampleIndustryDomain.java 
 * @Description: t_isales_sample_pro_line 自动生成的对应的实体对象   
 *  
 */
public class SampleIndustryDTO implements Serializable{

	private static final long serialVersionUID = 7695917738504707656L;
	/**
	 * 
	 */
	/** 
	* @Fields industryCode : 样机系统产业编码
	*/
	private String industryCode;
	/** 
	* @Fields industryName : 样机系统的产业名称
	*/
	private String industryName;
	/** 
	* @Fields productId : I营销系统产业编码
	*/
	private String productId;
	/** 
	* @Fields productName : I营销系统产业名称
	*/
	private String productName;
	
	/*=========================getter and setter ===================*/
	/**
	 * @return the industryCode
	 */
	public String getIndustryCode() {
		return industryCode;
	}
	/**
	 * @param industryCode the industryCode to set
	 */
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}
	/**
	 * @return the industryName
	 */
	public String getIndustryName() {
		return industryName;
	}
	/**
	 * @param industryName the industryName to set
	 */
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SampleIndustryDTO [industryCode="
				+ industryCode + ", industryName=" + industryName
				+ ", productId=" + productId + ", productName=" + productName
				+ "]";
	}
	
	
}
