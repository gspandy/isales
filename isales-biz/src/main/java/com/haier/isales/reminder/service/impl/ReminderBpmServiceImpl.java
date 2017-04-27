/**
 * @Company 青鸟软通   
 * @Title: ReminderBpmService.java 
 * @Package  com.haier.isales.reminder.service.impl
 * @author Cao Rui   
 * @date 2015年06月12日  10:25:46
 * @version V1.0   
 */
package com.haier.isales.reminder.service.impl;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.reminder.DomainCloneUtil;
import com.haier.isales.reminder.dao.ReminderBpmDAO;
import com.haier.isales.reminder.domain.ReminderBpmDomain;
import com.haier.isales.reminder.dto.ReminderBpmDTO;
import com.haier.isales.reminder.service.ReminderBpmService;

/** 
 * @ClassName: ReminderBpmService
 * @Description: ReminderBpm的Service接口定义类
 *  
 */
public class ReminderBpmServiceImpl implements ReminderBpmService{

	private static final Logger LOG = LoggerFactory.getLogger(ReminderBpmServiceImpl.class);
	
	public static final String NEW_STATUS = "101";
	
	/** 
	* @Fields reminderBpmDao : ReminderBpmDao 工具依赖 
	*/
	private ReminderBpmDAO reminderBpmDao;
	
	
	/*===============业务方法=============*/
	
	/**
	 * bpm向本系统推送提醒 
	* @Title: addNewInfo 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param saveDto  
	* @throws
	 */
	@Override
	public void addNewReminder(ReminderBpmDTO saveDto){
		LOG.info("bpm向本系统推送提醒   service方法");
		// 校验必需输入的字段,员工号、客户姓名、客户手机、意向产品、意向日期
		CheckParamUtil.checkFieldIfNotBlank(saveDto, "userCode","bpmProcessId");
		
		ReminderBpmDomain saveBean = new ReminderBpmDomain();
		// 将传入的dto对象转为domain
		saveBean = DomainCloneUtil.cloneReminderBpmDto2Domain(saveDto);
		//必要信息赋值
		saveBean.setCreateTime(new Date());
		saveBean.setStatus(NEW_STATUS);
		
		reminderBpmDao.save(saveBean);
		LOG.info("bpm向本系统推送提醒   service方法执行完成");

	}
	
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性reminderBpmDao 的set方法 
	 */
	public void setReminderBpmDao(ReminderBpmDAO reminderBpmDao){
		this.reminderBpmDao = reminderBpmDao;
	}
	
}
