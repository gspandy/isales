/**
* @Company 青鸟软通   
* @Title: ReminderBpmClient.java 
* @Package com.haier.isales.reminder.service.impl 
* @author Cao Rui  
* @date 2015-6-11 下午9:24:12 
* @version V1.0   
*/ 
package com.haier.isales.reminder.service;

import com.haier.isales.reminder.dto.ReminderBpmDTO;

/** 
 * @ClassName: ReminderBpmClient 
 * @Description: 
 *  
 */
public interface ReminderBpmClient {

	/**
	 * 直销员的问题在bpm有新的回复时，提醒
	* @Title: addNewReminder 
	* @Description: 
	* @param dto  入参的实体
	* @throws
	 */
	public Object addNewReminder(ReminderBpmDTO dto);
	
}
