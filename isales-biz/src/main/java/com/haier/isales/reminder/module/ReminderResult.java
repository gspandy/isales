/**
* @Company 青鸟软通   
* @Title: ReminderResult.java 
* @Package com.haier.isales.reminder.module 
* @author Liu Wenjie   
* @date 2014-11-15 下午6:38:04 
* @version V1.0   
*/ 
package com.haier.isales.reminder.module;

/** 
 * @ClassName: ReminderResult 
 * @Description: 发送推送消息的结果集
 *  
 */
public class ReminderResult {
	/** 
	* @Fields data : 失败的集合
	*/ 
	private String[] data;
	/** 
	* @Fields success : 成功标示
	*/ 
	private boolean success;
	/**
	 * @Description: 属性 data 的get方法 
	 * @return data
	 */
	public String[] getData() {
		return data;
	}
	/**
	 * @Description: 属性 data 的set方法 
	 * @param data 
	 */
	public void setData(String[] data) {
		this.data = data;
	}
	/**
	 * @Description: 属性 success 的get方法 
	 * @return success
	 */
	public boolean isSuccess() {
		return success;
	}
	/**
	 * @Description: 属性 success 的set方法 
	 * @param success 
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
}
