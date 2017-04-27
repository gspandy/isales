/**
* @Company 青鸟软通   
* @Title: BaseStatisticsTestCase.java 
* @Package com.haier.isales.statistics 
* @author John.zhao   
* @date 2014-12-4 下午1:11:38 
* @version V1.0   
*/ 
package com.haier.isales.statistics;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.statistics.appinstall.service.AppInstallService;
import com.haier.isales.statistics.applogin.service.AppLoginService;
import com.haier.isales.statistics.emailreceive.service.RecipientService;
import com.haier.openplatform.showcase.BaseTestCase;

/** 
 * @ClassName: BaseStatisticsTestCase 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author John.zhao 
 */
@ContextConfiguration(locations = { 
"classpath*:/spring/statistics/spring-*.xml" })
public class BaseStatisticsTestCase extends BaseTestCase{
	@Resource
	protected AppInstallService appInstallService;
	@Resource
	protected RecipientService recipientService;
	@Resource
	protected AppLoginService appLoginService;
}
