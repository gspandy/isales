/**
* @Company 青鸟软通   
* @Title: ReminderBpmClientImpl.java 
* @Package com.haier.isales.reminder.service.impl 
* @author Cao Rui  
* @date 2015-6-11 下午9:24:12 
* @version V1.0   
*/ 
package com.haier.isales.reminder.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.reminder.dto.ReminderDzdtDTO;
import com.haier.isales.reminder.service.ReminderDzdtClient;
import com.haier.isales.reminder.service.ReminderDzdtService;

/** 
 * @ClassName: ReminderBpmClientImpl 
 * @Description: 分享Dubbo接口的实现类
 *  
 */
public class ReminderDzdtClientImpl implements ReminderDzdtClient {

	private static Logger logger = LoggerFactory.getLogger(ReminderDzdtClientImpl.class);
	
	private ReminderDzdtService reminderDzdtService;
	
	
	/**
	 * 直销员的位置纠错在电子地图审核后，提醒审核通过或者不通过
	* @Title: addNewReminder 
	* @Description: 
	* @param dto  入参的实体
	* @throws
	 */
	public Object addNewReminder(ReminderDzdtDTO dto){
		logger.info("进入直销员的位置纠错在电子地图审核提醒的dubbo方法");
		reminderDzdtService.addNewReminder(dto);
		return null;
	}

	
	
	/*=====================getter and setter =====================*/
	/**
	 * @Description: 属性 reminderDzdtService 的set方法 
	 * @param reminderBpmService 
	 */
	public void setReminderDzdtService(ReminderDzdtService reminderDzdtService) {
		this.reminderDzdtService = reminderDzdtService;
	}

	
	
	
}
