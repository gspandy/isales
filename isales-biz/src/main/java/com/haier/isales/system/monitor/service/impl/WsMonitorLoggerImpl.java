/**
* @Company 青鸟软通   
* @Title: WsMonitorLoggerImpl.java 
* @Package com.haier.isales.system.monitor.service.impl 
* @author Liu Wenjie   
* @date 2014-11-11 下午7:21:46 
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
import com.haier.isales.system.monitor.dao.WsMonitorLogDAO;
import com.haier.isales.system.monitor.domain.WsMonitorLogDomain;

/** 
 * @ClassName: WsMonitorLoggerImpl 
 * @Description: dubbo 信息的监控日志记录功能
 *  
 */
public class WsMonitorLoggerImpl extends BanaAspectMonitor{

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-11 下午5:44:01 
	* @param monitorLog 
	* @see org.bana.common.util.monitor.BanaAspectMonitor#doSaveMonitorLog(org.bana.common.util.monitor.BanaAspectMonitorLog) 
	*/ 
	@Override
	protected void doSaveMonitorLog(BanaAspectMonitorLog monitorLog) {
		WsMonitorLogDAO wsMonitorLogDao = SpringApplicationContextHolder.getBean("wsMonitorLogDAO");
		wsMonitorLogDao.save(banaAspectMonitorLogToWsMonitorLogDomain(monitorLog));
	}
	
	/**
	* @Description: 将BanaAspectMonitorLog 转化为 SysMonitorLogDomain
	* @author Liu Wenjie   
	* @date 2014-11-11 下午3:26:53 
	* @param log
	* @return
	 */
	private WsMonitorLogDomain banaAspectMonitorLogToWsMonitorLogDomain(BanaAspectMonitorLog log){
		WsMonitorLogDomain entity = new WsMonitorLogDomain();
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
