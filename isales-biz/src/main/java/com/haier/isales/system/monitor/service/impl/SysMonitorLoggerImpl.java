/**
* @Company 青鸟软通   
* @Title: SysMonitorLoggerImpl.java 
* @Package com.haier.isales.system.monitor.service.impl 
* @author Liu Wenjie   
* @date 2014-11-11 下午3:22:28 
* @version V1.0   
*/ 
package com.haier.isales.system.monitor.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.Date;

import net.sf.json.JSONArray;

import org.aspectj.lang.Signature;
import org.bana.common.util.monitor.BanaAspectMonitor;
import org.bana.common.util.monitor.BanaAspectMonitorLog;

import com.haier.isales.common.SpringApplicationContextHolder;
import com.haier.isales.system.monitor.dao.SystemMonitorLogDAO;
import com.haier.isales.system.monitor.domain.SysMonitorLogDomain;

/** 
 * @ClassName: SysMonitorLoggerImpl 
 * @Description: 系统监控的日志记录方法 
 *  
 */
public class SysMonitorLoggerImpl extends BanaAspectMonitor {
	

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-11 下午5:44:01 
	* @param monitorLog 
	* @see org.bana.common.util.monitor.BanaAspectMonitor#doSaveMonitorLog(org.bana.common.util.monitor.BanaAspectMonitorLog) 
	*/ 
	@Override
	protected void doSaveMonitorLog(BanaAspectMonitorLog monitorLog) {
		SystemMonitorLogDAO systemMonitorLogDao = SpringApplicationContextHolder.getBean("systemMonitorLogDao");
		systemMonitorLogDao.save(banaAspectMonitorLogToSysMonitorLogDomain(monitorLog));
	}
	
	/**
	* @Description: 将BanaAspectMonitorLog 转化为 SysMonitorLogDomain
	* @author Liu Wenjie   
	* @date 2014-11-11 下午3:26:53 
	* @param log
	* @return
	 */
	private SysMonitorLogDomain banaAspectMonitorLogToSysMonitorLogDomain(BanaAspectMonitorLog log){
		SysMonitorLogDomain entity = new SysMonitorLogDomain();
		Signature signature = log.getSignature();
		//方法名和类名
		if(signature != null){
			entity.setExecuteClass(signature.getDeclaringTypeName());
			entity.setExecuteFunction(signature.getName());
		}
		//解析参数
		Object[] args = log.getArgs();
		if(args != null && args.length != 0){
			JSONArray jsonArr = JSONArray.fromObject(args);
			entity.setExecuteParamsJson(jsonArr.toString());
		}
		
		//操作时间
		Date beginDate = log.getBeginDate();
		Date endDate = log.getEndDate();
		if(beginDate != null && endDate != null){
			entity.setDuration(endDate.getTime() - beginDate.getTime());
		}
		entity.setStartTime(beginDate);
		entity.setEndTime(endDate);
		if(beginDate != null){
			entity.setStartMillisecond(beginDate.getTime());
		}
		if(endDate != null){
			entity.setEndMillisecond(endDate.getTime());
		}
		
		//返回值或异常信息
		Throwable e = log.getThrowable();
		if(e != null){
			ByteArrayOutputStream buf = new ByteArrayOutputStream();
			e.printStackTrace(new PrintWriter(buf, true));
			entity.setExcuteException(buf.toString());
		}
		
		//返回值结果
		Object result = log.getResult();
		if(result != null){
			if(result instanceof String){
				entity.setExcuteResult((String)result);
			}else{
				JSONArray jsonObject = JSONArray.fromObject(result);
				entity.setExcuteResult(jsonObject.toString());
			}
		}
		return entity;
	}

	
}
