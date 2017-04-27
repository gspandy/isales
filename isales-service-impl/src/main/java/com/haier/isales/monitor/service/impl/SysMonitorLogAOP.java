/**
* @Company 青鸟软通   
* @Title: UserBehaviourServiceImpl.java 
* @Package com.haier.isales.behaviour.service.impl 
* @author Cao Rui   
* @date 2014-10-28 下午3:32:17 
* @version V1.0   
*/ 
package com.haier.isales.monitor.service.impl;

import net.sf.json.JSONArray;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

import com.haier.isales.monitor.dto.UserInfoDTO;
import com.haier.isales.system.monitor.domain.SysMonitorLog;
import com.haier.isales.system.monitor.service.SysMonitorLogUtil;
import com.haier.openplatform.util.SpringApplicationContextHolder;

/** 
 * @ClassName: SysMonitorLogAOP 
 * @Description: spring AOP  用于监控所有dubbo的调用，记录调用时间、类名、方法名、参数等信息，
 * 				后期可根据这些数据进行数据挖掘
 *  
 */
public class SysMonitorLogAOP{
	
	private static Logger logger = Logger.getLogger(SysMonitorLogAOP.class);
	private static SysMonitorLogUtil sysMonitorLogService = SpringApplicationContextHolder.getBean("sysMonitorLogUtil"); 
	
	public Object addMonitorLog(ProceedingJoinPoint  jp){

		Object proceed = null;
		try {
			proceed = jp.proceed();	
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			// throw e;
			logger.error(e.toString());
			return proceed;
		}
		try{
			
			Object[] args = jp.getArgs();
			SysMonitorLog logBean = new SysMonitorLog();
			// 获取执行方法的方法名及所在的类名
			String functionName = jp.getSignature().getName();// 方法名
			String className = jp.getTarget().getClass().getName();// 类名

			// 将请求参数转化到json ，以便存储到数据库 用于查询
			JSONArray jsonParam = JSONArray.fromObject(args);
			logger.info("##########调用接口：" + className + "." + functionName
					+ "；参数为：" + jsonParam.toString());

//			boolean hasUserInfo = false;
			for (Object o : args) {
				if (o instanceof UserInfoDTO) {
					// 如果参数中包含用户信息,将用户信息转为json，存入实体
//					hasUserInfo = true;
					UserInfoDTO userBean = (UserInfoDTO) o;
					JSONArray jsonArray = JSONArray.fromObject(o);
					logBean.setUserInfoJson(jsonArray.toString());
					logBean.setUserId(userBean.getUserId());
					logBean.setUserName(userBean.getUserName());
				}
			}
			// 将以上信息全部放入日志实体addBean
			logBean.setExecuteFunction(functionName);
			logBean.setExecuteClass(className);
			logBean.setExecuteParamsJson(jsonParam.toString());

			// 异步调用service 存储监控信息
			Thread thread;
			thread = new MonitorThread(logBean);
			thread.start();
			// SysMonitorLogUtil sysMonitorLogService =
			// SpringApplicationContextHolder.getBean("sysMonitorLogUtil");
			// try{
			// //调用后台，存储日志
			// sysMonitorLogService.addMonitorLog(logBean);
			// }catch(Exception e){
			// e.printStackTrace();
			// }
			//
			return proceed;
		}catch (Exception ex){
			logger.error(ex.toString());
			return proceed;
		}
		
		
		 
	 }
	
	//异步线程  存储监控日志
	private class MonitorThread extends Thread {
        private SysMonitorLog sysMonitorLog;

        public MonitorThread(SysMonitorLog sysMonitorLog) {
            this.sysMonitorLog = sysMonitorLog;
        }

        @Override
        public void run() {
            try{
                //调用后台，存储日志
            	sysMonitorLogService.addMonitorLog(sysMonitorLog);
            }catch(Exception e){
            	logger.info(e.getMessage());
            } 
        }
    }



	
	
}
