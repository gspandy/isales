package com.haier.isales.system.service.impl;

import org.apache.log4j.Logger;

import com.haier.isales.monitor.dto.SysMonitorLogDTO;
import com.haier.isales.monitor.service.SysMonitorLogServiceClient;

public class SysMonitorLogServiceImpl implements SysMonitorLogServiceClient{
	private static Logger logger = Logger.getLogger(SysMonitorLogServiceImpl.class);
	
	@Override
	public SysMonitorLogDTO getLog() {
		SysMonitorLogDTO userDTO = new SysMonitorLogDTO();
		userDTO.setUserId(123456L);
		userDTO.setUserName("test1111111111");
		return userDTO;
	}
	
	@Override
	public SysMonitorLogDTO getLogByParams(String name) {
		SysMonitorLogDTO userDTO = new SysMonitorLogDTO();
		userDTO.setUserId(123456L);
		userDTO.setUserName("test1111111111");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
		}

		return userDTO;
	}
	
	@Override
	public SysMonitorLogDTO getLogByParams(SysMonitorLogDTO bean) {
		SysMonitorLogDTO userDTO = new SysMonitorLogDTO();
		userDTO.setUserId(123456L);
		userDTO.setUserName("test1111111111");
		logger.info("##########################  getLogByParams");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
		}
		return userDTO;
	}

}
