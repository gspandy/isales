/**
* @Company 青鸟软通   
* @Title: ReminderServiceTest.java 
* @Package com.haier.isales.reminder.service 
* @author Liu Wenjie   
* @date 2014-11-15 下午3:45:27 
* @version V1.0   
*/ 
package com.haier.isales.reminder.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import com.haier.isales.reminder.module.SchaduleReminder;
import com.haier.isales.reminder.module.SchaduleReminder.ReminderPushType;
import com.haier.isales.system.user.model.UserGroupModule;
import com.haier.isales.system.user.model.UserGroupModule.UserGroupType;

/** 
 * @ClassName: ReminderServiceTest 
 * @Description: 测试Reminder的方法
 *  
 */
@Transactional
@Ignore
public class ReminderServiceTest extends BaseReminderTest{
	@Resource
	private ReminderService reminderService;
	
	private SchaduleReminder reminder;
	@Before
	public void init(){
		//executeSqlScript("classpath:/com/haier/isales/reminder/reminderInit.sql", true);
		reminder = new SchaduleReminder();
		reminder.setTitle("testTitle");
		reminder.setContent("testContent");
		reminder.setSourceId("sourceId");
		List<String> userList = new ArrayList<String>();
		userList.add("1");
		userList.add("2");
		reminder.setUserList(userList);
		List<UserGroupModule> userGroupList = new ArrayList<UserGroupModule>();
		userGroupList.add(new UserGroupModule("group1", UserGroupType.实体组织));
		userGroupList.add(new UserGroupModule("group2", UserGroupType.实体组织));
		reminder.setUserGroupList(userGroupList);
		List<UserGroupModule> excludeGroupList = new ArrayList<UserGroupModule>();
		excludeGroupList.add(new UserGroupModule("group3", UserGroupType.虚拟组织));
		excludeGroupList.add(new UserGroupModule("group4", UserGroupType.虚拟组织));
		reminder.setUserGroupList(userGroupList);
		reminder.setPushType(ReminderPushType.APNS);
	}

	/**
	 * Test method for {@link com.haier.isales.reminder.service.ReminderService#saveSchaduleReminder(com.haier.isales.reminder.module.SchaduleReminder)}.
	 */
	@Test
//	@NotTransactional
	public void testSaveSchaduleReminder() {
		reminderService.saveSchaduleReminder(reminder);
	}

	@Test
//	@NotTransactional
	public void testSendAllReminder(){
		reminderService.sendAllReminder();
	}
}
