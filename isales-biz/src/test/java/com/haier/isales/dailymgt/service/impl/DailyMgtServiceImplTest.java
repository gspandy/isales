/**
* @Company 青鸟软通   
* @Title: DailyMgtServiceImplTest.java 
* @Package com.haier.isales.dailymgt.service.impl 
* @author Guo Yuchao   
* @date 2015-2-3 下午4:09:02 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.service.impl;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.dailymgt.dto.AttendInfoDTO;
import com.haier.isales.dailymgt.dto.AttendSummary;
import com.haier.isales.dailymgt.service.DailyMgtService;

/** 
 * @ClassName: DailyMgtServiceImplTest 
 * @Description:  
 *  
 */
@ContextConfiguration(locations={
		"classpath*:/spring/dailymgt/spring-legalholiday.xml",
		"classpath*:/spring/dailymgt/spring-dailyMgt.xml"
})
public class DailyMgtServiceImplTest extends BaseIsalesTestCase{
	@Resource
	private DailyMgtService dailyMgtService;
	@Before
	public void init(){
		executeSqlScript("classpath:/com/haier/isales/dailyMgt/DailyMgtServiceImplTest.sql", true);
	}
//	@Test
//	public void testSearchAttendInfo() {
//		AttendSummary searchAttendInfo = dailyMgtService.searchAttendInfo("2015-01", 279l);
//		MatcherAssert.assertThat(searchAttendInfo, Matchers.notNullValue());
//	}
//	@Test
//	public void testSearchDailyAttendInfo() {
//		AttendInfoDTO searchAttendInfo = dailyMgtService.searchDailyAttendInfo("2015-01-03", -9000l);
//		MatcherAssert.assertThat(searchAttendInfo, Matchers.notNullValue());
//	}

}
