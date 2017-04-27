/**
* @Company 青鸟软通   
* @Title: AreaDTO.java 
* @Package com.haier.isales.basicinfo.pubarea.dto
* @author lizhenwei
* @date 2015年12月08日  22:50:43 
* @version V1.0   
*/ 
package com.haier.isales.basicinfo.pubarea.dto;

import java.io.Serializable;

/** 
 * @ClassName: AreaDTO 
 *  
 */
public class AreaDTO implements Serializable{

	private static final long serialVersionUID = -6817692251598305456L;
	
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
	
}
