/**
* @Company 青鸟软通   
* @Title: BaseReminderService.java 
* @Package com.haier.isales.reminder.service 
* @author Liu Wenjie   
* @date 2014-11-15 下午3:46:13 
* @version V1.0   
*/ 
package com.haier.isales.reminder.service;

import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;

/** 
 * @ClassName: BaseReminderTest 
 * @Description: 基础测试类
 *  
 */
@ContextConfiguration(locations={
		"classpath*:/spring/reminder/spring-*.xml",
		"classpath*:/spring/system/spring-*.xml",
		"classpath*:/spring/spring-dubbo.xml",
		"classpath*:/spring/spring-external.xml"
})
public class BaseReminderTest extends BaseIsalesTestCase{

}
