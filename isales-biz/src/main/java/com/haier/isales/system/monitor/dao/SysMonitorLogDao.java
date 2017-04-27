/**
* @Company 青鸟软通   
* @Title: SysMonitorLogDao.java 
* @Package com.haier.isales.system.monitor.dao 
* @author Cao Rui
* @date 2014-10-28 上午10:11:23 
* @version V1.0   
*/ 
package com.haier.isales.system.monitor.dao;

import com.haier.isales.system.monitor.domain.SysMonitorLog;
import com.haier.openplatform.dao.CommonDAO;

/** 
 * @ClassName: SysMonitorLogDao 
 * @Description: 监控日志dao 
 *  
 */
public interface SysMonitorLogDao extends CommonDAO<SysMonitorLog, Long> {
	
	
	/** 
	* @Description: 保存日志
	* @author Cao Rui 
	* @date 2014-10-28 上午10:38:17 
	* @param addBean  
	*/ 
	void addMonitorLog(SysMonitorLog addBean);
	
	/**
	 * 
	* @Description: 获得查询的数据行数
	* @author Cao Rui 
	* @date 2014-10-28 上午10:38:17 
	* @return
	 */
	public Long getToalNumbers();
	
}
