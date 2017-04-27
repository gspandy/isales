package com.haier.isales.reminder.service.impl;

import javax.annotation.Resource;

import org.bana.common.util.page.PageResult;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.common.DubboResult;
import com.haier.isales.customer.dto.PotentialCustomerDTO;
import com.haier.isales.customer.dto.PurchasedCustomerDTO;
import com.haier.isales.customer.service.PotentialCustomerClient;
import com.haier.isales.customer.service.PurchasedCustomerClient;
import com.haier.isales.reminder.dto.ReminderBpmDTO;
import com.haier.isales.reminder.service.ReminderBpmClient;
import com.haier.isales.test.BaseIsalesClientTestCase;



/**
 * bpm通知 相关测试类
 * @author Cao Rui
 *
 */
@ContextConfiguration(locations = {
		"classpath*:/spring_service/customer/spring-customer-provider.xml",
		"classpath*:/spring/salerinfo/spring-*.xml",
		"classpath*:/spring_ws/**/spring-reportSalesByModel.xml",
		"classpath*:/spring_ws/**/spring-reportSalesByBarCode.xml",
		"classpath*:/spring_ws/**/spring-BTBxlcxSelectImpl.xml",
		"classpath*:/spring/customer/spring-customer.xml",
		"classpath*:/spring/basicinfo/spring-shop.xml",
		"classpath*:/spring/score/spring-score.xml",
		"classpath*:/spring/system/spring-dictionary.xml",
		"classpath*:/spring/retail/spring-*.xml",
		"classpath*:/spring_service/reminder/spring-reminder-bpm-provider.xml",
		"classpath*:/spring/reminder/spring-*.xml"
		})
public class ReminderBpmTest extends BaseReminderBpmTestCase{
	
	@Resource
	protected ReminderBpmClient reminderBpmClient;
	
	@Test
	public void addNewReminder() throws Exception {
		// 
		
		ReminderBpmDTO dto = new ReminderBpmDTO();
		dto.setUserCode("Z0188790");
		DubboResult result =  (DubboResult) reminderBpmClient.addNewReminder(dto);
		
		logger.info("=========result:" + result);
		
	}
	
	
	

	/**
	 * @Description: 属性 reminderBpmClient 的get方法 
	 * @return reminderBpmClient
	 */
	public ReminderBpmClient getReminderBpmClient() {
		return reminderBpmClient;
	}

	/**
	 * @Description: 属性 reminderBpmClient 的set方法 
	 * @param reminderBpmClient 
	 */
	public void setReminderBpmClient(
			ReminderBpmClient reminderBpmClient) {
		this.reminderBpmClient = reminderBpmClient;
	}
	
	
}
