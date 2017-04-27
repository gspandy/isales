/**
* @Company 青鸟软通   
* @Title: BanaDubboMonitorResult.java 
* @Package com.haier.isales.moments.service.impl 
* @author Liu Wenjie   
* @date 2014-12-10 上午11:34:03 
* @version V1.0   
*/ 
package com.haier.isales.monitor.service;

import java.io.Serializable;

/** 
 * @ClassName: BanaDubboMonitorResult 
 * @Description: 监控结果的记录 
 *  
 */
public class BanaDubboMonitorResult implements Serializable{

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = 1160930983333609881L;
	
	
	/** 
	* @Fields result : 结果对象，success 或者fail
	*/ 
	private String result;
	
	/** 
	* @Fields message : 基本上就是ok内容，
	*/ 
	private String message;
	
	

	/**
	 * @Description: 属性 result 的get方法 
	 * @return result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @Description: 属性 result 的set方法 
	 * @param result 
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * @Description: 属性 message 的get方法 
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @Description: 属性 message 的set方法 
	 * @param message 
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
