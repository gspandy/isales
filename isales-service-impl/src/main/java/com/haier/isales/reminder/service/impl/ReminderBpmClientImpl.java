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

import com.haier.isales.reminder.dto.ReminderBpmDTO;
import com.haier.isales.reminder.service.ReminderBpmClient;
import com.haier.isales.reminder.service.ReminderBpmService;

/** 
 * @ClassName: ReminderBpmClientImpl 
 * @Description: 分享Dubbo接口的实现类
 *  
 */
public class ReminderBpmClientImpl implements ReminderBpmClient {

	private static Logger logger = LoggerFactory.getLogger(ReminderBpmClientImpl.class);
	
	private ReminderBpmService reminderBpmService;
	
	
	/**
	 * 直销员的问题在bpm有新的回复时，提醒
	* @Title: addNewReminder 
	* @Description: 
	* @param dto  入参的实体
	* @throws
	 */
	@Override
	public Object addNewReminder(ReminderBpmDTO dto){
		logger.info("进入用户取消点赞的dubbo方法");
		reminderBpmService.addNewReminder(dto);
		return null;
	}

	
	
	/*=====================getter and setter =====================*/
	/**
	 * @Description: 属性 reminderBpmService 的set方法 
	 * @param reminderBpmService 
	 */
	public void setReminderBpmService(ReminderBpmService reminderBpmService) {
		this.reminderBpmService = reminderBpmService;
	}

	
	
	
}
