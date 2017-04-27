/**
* @Company 青鸟软通   
* @Title: UserService.java 
* @Package com.haier.isales.system.user.service 
* @author Cao Rui 
* @date 2014-10-28 上午10:43:53 
* @version V1.0   
*/ 
package com.haier.isales.system.monitor.service;

import com.haier.isales.system.monitor.domain.SysMonitorLog;

/** 
 * @ClassName: SysMonitorLogService 
 * @Description: 监控日志业务
 *  
 */
public interface SysMonitorLogUtil {
	/**
	* <p>Description: 保存监控日志信息</p> 
	* @author Cao Rui 
	* @date 2014-10-28 上午10:47:27 
	* @param SysMonitorLog
	* @return 
	*/ 
	public void addMonitorLog(SysMonitorLog addBean) ;
}
