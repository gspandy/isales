/**
* @Company 青鸟软通   
* @Title: SampleDomain.java 
* @Package com.haier.isales.sample.domain 
* @author lizhenwei   
* @date 2015年11月11日  09:40:13 
* @version V1.0   
*/ 
package com.haier.isales.sample.sampleindustry.domain;

import java.io.Serializable;

/** 
 * @ClassName: SampleIndustryDomain.java 
 * @Description: t_isales_sample_pro_line 自动生成的对应的实体对象   
 *  
 */
public class SampleIndustryDomain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7733769408351163924L;
	
	/** 
	* @Fields id : 主键id，自动递增，无实际意义
	*/
	private Long id;
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
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((industryCode == null) ? 0 : industryCode.hashCode());
		result = prime * result
				+ ((industryName == null) ? 0 : industryName.hashCode());
		result = prime * result
				+ ((productId == null) ? 0 : productId.hashCode());
		result = prime * result
				+ ((productName == null) ? 0 : productName.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SampleIndustryDomain other = (SampleIndustryDomain) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (industryCode == null) {
			if (other.industryCode != null)
				return false;
		} else if (!industryCode.equals(other.industryCode))
			return false;
		if (industryName == null) {
			if (other.industryName != null)
				return false;
		} else if (!industryName.equals(other.industryName))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SampleIndustryDomain [id=" + id + ", industryCode="
				+ industryCode + ", industryName=" + industryName
				+ ", productId=" + productId + ", productName=" + productName
				+ "]";
	}
	
	
}
