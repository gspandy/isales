/**
* @Company 青鸟软通   
* @Title: PersonalProLine.java 
* @Package com.haier.isales.salerinfo.personalinfo.dto 
* @author Cao Rui   
* @date 2014-12-18 下午7:53:13 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalinfo.dto;

import java.io.Serializable;

/** 
 * @ClassName: PersonalProLine 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class PersonalProLine implements Serializable{
	
	private static final long serialVersionUID = -984137213107998825L;
	
	private String productLineId;
	private String productLineName;
	
	/*=========================getter and setter ===================*/
	/**
	 * @Description: 属性 productLineId 的get方法 
	 * @return productLineId
	 */
	public String getProductLineId() {
		return productLineId;
	}
	/**
	 * @Description: 属性 productLineId 的set方法 
	 * @param productLineId 
	 */
	public void setProductLineId(String productLineId) {
		this.productLineId = productLineId;
	}
	/**
	 * @Description: 属性 productLineName 的get方法 
	 * @return productLineName
	 */
	public String getProductLineName() {
		return productLineName;
	}
	/**
	 * @Description: 属性 productLineName 的set方法 
	 * @param productLineName 
	 */
	public void setProductLineName(String productLineName) {
		this.productLineName = productLineName;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:11:25 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "PersonalProLine [productLineId=" + productLineId
				+ ", productLineName=" + productLineName + "]";
	}

}
