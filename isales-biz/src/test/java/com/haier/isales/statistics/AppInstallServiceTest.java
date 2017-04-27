/**
* @Company 青鸟软通   
* @Title: AppInstallServiceTest.java 
* @Package com.haier.isales.statistics 
* @author John.zhao   
* @date 2014-12-4 下午1:14:05 
* @version V1.0   
*/ 
package com.haier.isales.statistics;

import java.util.List;

import org.apache.commons.mail.EmailException;
import org.junit.Test;
import org.springframework.util.Assert;

import com.haier.isales.statistics.appinstall.domain.AppInstall;

/** 
 * @ClassName: AppInstallServiceTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author John.zhao 
 */
public class AppInstallServiceTest extends BaseStatisticsTestCase {

	@Test
	public void testSearchAllInstall(){
		List<AppInstall> list = appInstallService.searchAllAppInstall();
		Assert.notNull(list);
	}
	@Test
	public void testsendAppInstallEmail() throws EmailException{
		appInstallService.sendAppInstallEmail();
	}
}
