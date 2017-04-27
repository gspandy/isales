/**
* @Company 青鸟软通   
* @Title: ReminderBpmClient.java 
* @Package com.haier.isales.reminder.service.impl 
* @author Cao Rui  
* @date 2015-6-11 下午9:24:12 
* @version V1.0   
*/ 
package com.haier.isales.reminder.service;

import com.haier.isales.reminder.dto.ReminderDzdtDTO;

/** 
 * @ClassName: ReminderBpmClient 
 * @Description: 
 *  
 */
public interface ReminderDzdtClient {

	/**
	 * 直销员的位置纠错在电子地图审核后，提醒审核通过或者不通过
	* @Title: addNewReminder 
	* @Description: 
	* @param dto  入参的实体
	* @throws
	 */
	public Object addNewReminder(ReminderDzdtDTO dto);
	
}
