/**
* @Company 青鸟软通   
* @Title: ReminderSendJob.java 
* @Package com.haier.isales.quartz.reminder 
* @author Liu Wenjie   
* @date 2014-11-17 下午1:06:25 
* @version V1.0   
*/ 
package com.haier.isales.quartz.reminder;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;
import com.haier.isales.reminder.service.ReminderService;

/** 
 * @ClassName: ReminderSendJob 
 * @Description: 定时推销消息的方法
 *  
 */
public class ReminderSendJob implements Job {
	
	private static final Logger LOG = LoggerFactory.getLogger(ReminderSendJob.class);
	
	/** 
	* @Fields reminderServcie : 推送方法的业务逻辑
	*/ 
	private ReminderService reminderService;

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-17 下午1:06:35 
	* @param context
	* @throws JobExecutionException 
	* @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	*/ 
	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		LOG.info("推送业务的定时.........");
		reminderService = SpringApplicationContextHolder.getBean("reminderService");
		reminderService.sendAllReminder();
	}
	
	/*=========================getter and setter ================*/

	/**
	 * @Description: 属性 reminderService 的set方法 
	 * @param reminderService 
	 */
	public void setReminderService(ReminderService reminderService) {
		this.reminderService = reminderService;
	}

	

}
