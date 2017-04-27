/**
* @Company 青鸟软通   
* @Title: UpdateResultDTO.java 
* @Package com.haier.isales.retail.updatesales.dto 
* @author John.zhao   
* @date 2015-3-13 上午10:00:45 
* @version V1.0   
*/ 
package com.haier.isales.retail.updatesales.dto;

import java.io.Serializable;

/** 
 * @ClassName: UpdateResultDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class UpdateResultDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 3426956255638338553L;

	private String mes;
	private String status;
	/**
	 * @Description: 属性 mes 的get方法 
	 * @return mes
	 */
	public String getMes() {
		return mes;
	}
	/**
	 * @Description: 属性 mes 的set方法 
	 * @param mes 
	 */
	public void setMes(String mes) {
		this.mes = mes;
	}
	/**
	 * @Description: 属性 status 的get方法 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @Description: 属性 status 的set方法 
	 * @param status 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
