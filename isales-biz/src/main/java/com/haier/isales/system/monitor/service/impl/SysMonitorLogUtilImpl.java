/**
 * @Company 青鸟软通   
 * @Title: UserserviceImpl.java 
 * @Package com.haier.isales.system.user.service.impl 
 * @author Cao Rui  
 * @date 2014-10-28 上午10:44:42 
 * @version V1.0   
 */
package com.haier.isales.system.monitor.service.impl;

import org.apache.log4j.Logger;

import com.haier.isales.system.monitor.dao.SysMonitorLogDao;
import com.haier.isales.system.monitor.domain.SysMonitorLog;
import com.haier.isales.system.monitor.service.SysMonitorLogUtil;
import com.haier.openplatform.util.SpringApplicationContextHolder;

/**
 * @ClassName: SysMonitorLogServiceImpl
 * @Description: 监控日志业务实现
 * 
 */
public class SysMonitorLogUtilImpl implements SysMonitorLogUtil {

	private static SysMonitorLogDao logDao = SpringApplicationContextHolder.getBean("sysMonitorLogDao");
	private static Logger logger = Logger.getLogger(SysMonitorLogUtilImpl.class);
	/**
	 * <p>
	 * Description: 保存监控日志信息
	 * </p>
	 * 
	 * @author Cao Rui
	 * @date 2014-10-28 上午10:47:27
	 * @param SysMonitorLog
	 * @return
	 */
	@Override
	public void addMonitorLog(SysMonitorLog addBean) {
		try {
			//获取dao 并保存监控日志
			logDao.addMonitorLog(addBean);
//			Long toalNumbers = 0L;
//			toalNumbers = logDao.getToalNumbers();
		} catch (Exception e) {
			logger.info(e.toString());
		}

	}

}
