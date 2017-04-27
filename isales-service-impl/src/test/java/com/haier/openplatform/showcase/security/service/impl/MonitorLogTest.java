package com.haier.openplatform.showcase.security.service.impl;

import javax.annotation.Resource;

import org.junit.Test;

import com.haier.isales.monitor.dto.SysMonitorLogDTO;
import com.haier.isales.monitor.service.SysMonitorLogServiceClient;


/**
 * @author kevin
 *
 */
public class MonitorLogTest extends BaseMonitorTestCase{
	@Resource
	protected SysMonitorLogServiceClient monitorLogServiceClient;
	
	@Test
	public void testGetLogByParams() {
		long id = 99999918L;
		SysMonitorLogDTO bean = new SysMonitorLogDTO();
		bean.setUserName("11111111");
		bean.setRemark("备注");
			SysMonitorLogDTO user = monitorLogServiceClient.getLogByParams(bean);
			logger.info(user.getUserName());
		
//		assertThat(user, notNullValue());
	}
}
