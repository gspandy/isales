package com.haier.isales.app;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.app.dto.AppVersionQueryDTO;
import com.haier.isales.app.service.AppVersionClient;
import com.haier.isales.common.DubboResult;
import com.haier.isales.test.BaseIsalesClientTestCase;



/**
 * 朋友圈相关测试类
 * @author Cao Rui
 *
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring/score/spring-*.xml",
		"classpath*:/spring_ws/eai/spring-*.xml",
		"classpath*:/spring_service/app/spring-*-provider.xml",
		"classpath*:/spring/app/spring-*.xml" })
public class AppTest extends BaseIsalesClientTestCase{
	
	@Resource
	protected AppVersionClient appVersionSelectClient;
	
	@Test
	public void findNewestVersion() throws Exception {
		// 
		AppVersionQueryDTO queryDto = new AppVersionQueryDTO();
		queryDto.setAppVersion("2.0.0");
		DubboResult result =  (DubboResult)appVersionSelectClient.findNewestVersion(queryDto);
		
		logger.info("result.getResultCode()===:" + result.getResultCode());
	}
	@Test
	public void getAppVersionList() throws Exception {
		// 
//		AppVersionQueryDTO queryDto = new AppVersionQueryDTO();
//		queryDto.setAppVersion("2.0.0");
		
		DubboResult result =  (DubboResult)appVersionSelectClient.getAppVersionList(1,10);
		
		logger.info("result.getResultCode()===:" + result.getResultCode());
	}
	@Test
	public void findVersionInfo() throws Exception {
		// 
		AppVersionQueryDTO queryDto = new AppVersionQueryDTO();
		queryDto.setAppVersion("2.0.0");
		DubboResult result =  (DubboResult)appVersionSelectClient.findVersionInfo(queryDto);
		
		logger.info("result.getResultCode()===:" + result.getResultCode());
	}

	
	/**
	 * @Description: 属性 appVersionSelectClient 的set方法 
	 * @param appVersionSelectClient 
	 */
	public void setAppVersionSelectClient(AppVersionClient appVersionSelectClient) {
		this.appVersionSelectClient = appVersionSelectClient;
	}
	
	
	
	
}
