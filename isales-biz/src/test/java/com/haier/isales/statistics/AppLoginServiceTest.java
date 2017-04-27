/**
* @Company 青鸟软通   
* @Title: AppLoginServiceTest.java 
* @Package com.haier.isales.statistics 
* @author John.zhao   
* @date 2014-12-4 下午5:29:09 
* @version V1.0   
*/ 
package com.haier.isales.statistics;

import java.util.List;

import org.apache.commons.mail.EmailException;
import org.junit.Assert;
import org.junit.Test;

import com.haier.isales.statistics.applogin.domain.AppLoginDomain;

/** 
 * @ClassName: AppLoginServiceTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author John.zhao 
 */
public class AppLoginServiceTest extends BaseStatisticsTestCase {

	@Test
	public void testGetAppLoginByTime(){
		AppLoginDomain appLoginDomain = new AppLoginDomain();
		appLoginDomain.setStartTime("2014-11-20 00:00:00");
		appLoginDomain.setEndTime("2014-12-20 00:00:00");
		List<AppLoginDomain> list = appLoginService.getAppLoginByTime(appLoginDomain);
		Assert.assertNotNull(list);
	}
	
	@Test
	public void testSendAppLoginEmail() throws EmailException{
		appLoginService.sendAppLoginEmail();
	}
}
