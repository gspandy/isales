/**
 * @Company 青鸟软通   
 * @Title: ReminderBpmService.java 
 * @Package  com.haier.isales.reminder.service
 * @author Cao Rui   
 * @date 2015年06月12日  10:25:46
 * @version V1.0   
 */
package com.haier.isales.reminder.service;

import com.haier.isales.reminder.dto.ReminderBpmDTO;

/** 
 * @ClassName: ReminderBpmService
 * @Description: ReminderBpm的Service接口定义类
 *  
 */
public interface ReminderBpmService {

	/**
	 * bpm向本系统推送提醒 
	* @Title: addNewReminder 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param saveDto  
	* @throws
	 */
	public void addNewReminder(ReminderBpmDTO saveDto);
}
