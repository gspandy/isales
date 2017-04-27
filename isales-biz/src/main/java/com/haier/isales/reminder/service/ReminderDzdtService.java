/**
 * @Company 青鸟软通   
 * @Title: ReminderDzdtService.java 
 * @Package  com.haier.isales.reminder.service
 * @author Cao Rui   
 * @date 2015年06月15日  17:13:25
 * @version V1.0   
 */
package com.haier.isales.reminder.service;

import com.haier.isales.reminder.dto.ReminderDzdtDTO;

/** 
 * @ClassName: ReminderDzdtService
 * @Description: ReminderDzdt的Service接口定义类
 *  
 */
public interface ReminderDzdtService {

	/**
	 * 电子地图向本系统推送提醒 
	* @Title: addNewInfo 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param saveDto  
	* @throws
	 */
	public void addNewReminder(ReminderDzdtDTO saveDto);
}
