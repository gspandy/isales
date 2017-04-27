/**
* @Company 青鸟软通   
* @Title: UserBehaviourServiceClient.java 
* @Package com.haier.isales.behaviour.service 
* @author Cao Rui   
* @date 2014-10-28 下午3:16:06 
* @version V1.0   
*/ 
package com.haier.isales.monitor.service;

import com.haier.isales.monitor.dto.SysMonitorLogDTO;

import io.terminus.pampas.client.Export;


/** 
 * @ClassName: UserBehaviourServiceClient 
 * @Description: 用户行为监控  ServiceClient 
 *  
 */
public interface SysMonitorLogServiceClient {

	/**
	 * test
	 * @param userId
	 * @return
	 */
//	@Export(paramNames = {"testId"})
	public SysMonitorLogDTO getLog();
	
	/**
	 * test
	 * @param name
	 * @param info
	 * @return
	 */
	@Export(paramNames = {"name"})
	public SysMonitorLogDTO getLogByParams(String name);
	
	/**
	 * test
	 * @param name
	 * @param info
	 * @return
	 */
	@Export(paramNames = {"bean"})
	public SysMonitorLogDTO getLogByParams(SysMonitorLogDTO bean);
}
