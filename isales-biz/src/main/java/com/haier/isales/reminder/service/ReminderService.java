/**
 * @Company 青鸟软通   
 * @Title: ReminderService.java 
 * @Package  com.haier.isales.reminder.service
 * @author Liu Wenjie   
 * @date 2014年11月14日  20:35:33
 * @version V1.0   
 */
package com.haier.isales.reminder.service;

import com.haier.isales.reminder.module.SchaduleReminder;

/** 
 * @ClassName: ReminderService
 * @Description: Reminder的Service接口定义类
 *  
 */
public interface ReminderService {


	/** 
	* @Description: 保存一条定时推送的消息，消息中的部分字段的默认值是取决于数据库中的默认值
	* @author Liu Wenjie   
	* @date 2014-11-14 下午8:50:26 
	* @param schaduleReminder  
	*/ 
	public void saveSchaduleReminder(SchaduleReminder schaduleReminder);
	
	/**
	* @Description: 发送所有未发送的reminder的方法
	* @author Liu Wenjie   
	* @date 2014-11-15 下午5:24:39
	 */
	public void sendAllReminder();
}
