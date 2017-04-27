/**
* @Company 青鸟软通   
* @Title: JobMonitorLoggerImpl.java 
* @Package com.haier.isales.system.monitor.service.impl 
* @author Liu Wenjie   
* @date 2014-11-11 下午7:21:46 
* @version V1.0   
*/ 
package com.haier.isales.system.monitor.service.impl;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.bana.common.util.exception.ThrowableUtil;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.JobListener;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerListener;
import org.quartz.Trigger;
import org.quartz.Trigger.CompletedExecutionInstruction;
import org.quartz.TriggerKey;
import org.quartz.TriggerListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import com.haier.isales.system.monitor.dao.JobMonitorLogDAO;
import com.haier.isales.system.monitor.domain.JobMonitorLogDomain;


/** 
 * @ClassName: JobMonitorLoggerImpl 
 * @Description: dubbo 信息的监控日志记录功能
 *  
 */
public class JobMonitorLoggerImpl implements JobListener,TriggerListener,SchedulerListener,InitializingBean{

	private static final Logger LOG = LoggerFactory.getLogger(JobMonitorLoggerImpl.class);
	
	private Scheduler scheduler;
	
	private JobMonitorLogDAO jobMonitorDao;
	
	private ExecutorService executorService = Executors.newCachedThreadPool();
	
	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @throws Exception 
	* @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet() 
	*/ 
	@Override
	public void afterPropertiesSet() throws Exception {
		LOG.info("==============afterPropertiesSet===============");
		if(this.scheduler == null){
			return;
		}
//		this.schedulerName = scheduler.getSchedulerName();
//		this.schedulerInstanceId = scheduler.getSchedulerInstanceId();
//		this.schedulerVersion = this.scheduler.getMetaData().getVersion();
		//娣诲姞鐩戝惉鍣�
		this.scheduler.getListenerManager().addJobListener(this);
		this.scheduler.getListenerManager().addSchedulerListener(this);
		this.scheduler.getListenerManager().addTriggerListener(this);
		
//		this.host = InetAddress.getLocalHost().getHostAddress();
//		this.appName = defuaultIfNull(HOPConstant.getAppName());
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param trigger 
	* @see org.quartz.SchedulerListener#jobScheduled(org.quartz.Trigger) 
	*/ 
	@Override
	public void jobScheduled(Trigger trigger) {
		LOG.info("==============jobScheduled===============");
		
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param triggerKey 
	* @see org.quartz.SchedulerListener#jobUnscheduled(org.quartz.TriggerKey) 
	*/ 
	@Override
	public void jobUnscheduled(TriggerKey triggerKey) {
		LOG.info("==============jobUnscheduled===============");
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param trigger 
	* @see org.quartz.SchedulerListener#triggerFinalized(org.quartz.Trigger) 
	*/ 
	@Override
	public void triggerFinalized(Trigger trigger) {
		LOG.info("==============triggerFinalized===============");
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param triggerKey 
	* @see org.quartz.SchedulerListener#triggerPaused(org.quartz.TriggerKey) 
	*/ 
	@Override
	public void triggerPaused(TriggerKey triggerKey) {
		LOG.info("==============triggerPaused===============");
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param triggerGroup 
	* @see org.quartz.SchedulerListener#triggersPaused(java.lang.String) 
	*/ 
	@Override
	public void triggersPaused(String triggerGroup) {
		LOG.info("==============triggerPaused===============" + triggerGroup);
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param triggerKey 
	* @see org.quartz.SchedulerListener#triggerResumed(org.quartz.TriggerKey) 
	*/ 
	@Override
	public void triggerResumed(TriggerKey triggerKey) {
		LOG.info("==============triggerResumed===============" + triggerKey);
		
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param triggerGroup 
	* @see org.quartz.SchedulerListener#triggersResumed(java.lang.String) 
	*/ 
	@Override
	public void triggersResumed(String triggerGroup) {
		LOG.info("==============triggerResumed===============" + triggerGroup);
		
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param jobDetail 
	* @see org.quartz.SchedulerListener#jobAdded(org.quartz.JobDetail) 
	*/ 
	@Override
	public void jobAdded(JobDetail jobDetail) {
		LOG.info("==============jobAdded===============" + jobDetail);
		
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param jobKey 
	* @see org.quartz.SchedulerListener#jobDeleted(org.quartz.JobKey) 
	*/ 
	@Override
	public void jobDeleted(JobKey jobKey) {
		LOG.info("==============jobDeleted===============" + jobKey);
		
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param jobKey 
	* @see org.quartz.SchedulerListener#jobPaused(org.quartz.JobKey) 
	*/ 
	@Override
	public void jobPaused(JobKey jobKey) {
		LOG.info("==============jobPaused===============" + jobKey);
		
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param jobGroup 
	* @see org.quartz.SchedulerListener#jobsPaused(java.lang.String) 
	*/ 
	@Override
	public void jobsPaused(String jobGroup) {
		LOG.info("==============jobPaused===============" + jobGroup);
		
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param jobKey 
	* @see org.quartz.SchedulerListener#jobResumed(org.quartz.JobKey) 
	*/ 
	@Override
	public void jobResumed(JobKey jobKey) {
		LOG.info("==============jobResumed===============" + jobKey);
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param jobGroup 
	* @see org.quartz.SchedulerListener#jobsResumed(java.lang.String) 
	*/ 
	@Override
	public void jobsResumed(String jobGroup) {
		// TODO Auto-generated method stub
		
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param msg
	* @param cause 
	* @see org.quartz.SchedulerListener#schedulerError(java.lang.String, org.quartz.SchedulerException) 
	*/ 
	@Override
	public void schedulerError(String msg, SchedulerException cause) {
		// TODO Auto-generated method stub
		LOG.info("==============schedulerError===============" + msg);
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48  
	* @see org.quartz.SchedulerListener#schedulerInStandbyMode() 
	*/ 
	@Override
	public void schedulerInStandbyMode() {
		LOG.info("==============schedulerInStandbyMode===============" );
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48  
	* @see org.quartz.SchedulerListener#schedulerStarted() 
	*/ 
	@Override
	public void schedulerStarted() {
		//整个日程触发时执行的方法，该方法在一次启动中只执行一次
		LOG.info("==============schedulerStarted===============" );
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48  
	* @see org.quartz.SchedulerListener#schedulerShutdown() 
	*/ 
	@Override
	public void schedulerShutdown() {
		// TODO Auto-generated method stub
		LOG.info("==============schedulerShutdown===============" );
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48  
	* @see org.quartz.SchedulerListener#schedulerShuttingdown() 
	*/ 
	@Override
	public void schedulerShuttingdown() {
		LOG.info("==============schedulerShuttingdown===============" );
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48  
	* @see org.quartz.SchedulerListener#schedulingDataCleared() 
	*/ 
	@Override
	public void schedulingDataCleared() {
		// TODO Auto-generated method stub
		LOG.info("==============schedulingDataCleared===============" );
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param trigger
	* @param context 
	* @see org.quartz.TriggerListener#triggerFired(org.quartz.Trigger, org.quartz.JobExecutionContext) 
	*/ 
	@Override
	public void triggerFired(Trigger trigger, JobExecutionContext context) {
		// TODO Auto-generated method stub
		LOG.info("==============triggerFired===============" );
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param trigger
	* @param context
	* @return 
	* @see org.quartz.TriggerListener#vetoJobExecution(org.quartz.Trigger, org.quartz.JobExecutionContext) 
	*/ 
	@Override
	public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
		// 是否否决本次JOB的执行
		LOG.info("==============vetoJobExecution===============" );
		return false;
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param trigger 
	* @see org.quartz.TriggerListener#triggerMisfired(org.quartz.Trigger) 
	*/ 
	@Override
	public void triggerMisfired(Trigger trigger) {
		// TODO Auto-generated method stub
		LOG.info("==============triggerMisfired===============" );
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param trigger
	* @param context
	* @param triggerInstructionCode 
	* @see org.quartz.TriggerListener#triggerComplete(org.quartz.Trigger, org.quartz.JobExecutionContext, org.quartz.Trigger.CompletedExecutionInstruction) 
	*/ 
	@Override
	public void triggerComplete(Trigger trigger, JobExecutionContext context,
			CompletedExecutionInstruction triggerInstructionCode) {
		// TODO Auto-generated method stub
		LOG.info("==============triggerComplete===============" );
		sendLogMessage(buildJobLogDomain(trigger, context, triggerInstructionCode));
	}
	
	/** 
	* @Description: 保存log日志
	* @author Liu Wenjie   
	* @date 2014-11-19 下午10:21:40   
	*/ 
	private void sendLogMessage(final JobMonitorLogDomain entity){
		executorService.execute(new Runnable() {
			@Override
			public void run() {
				jobMonitorDao.save(entity);
			}
		});
		
	}
	
	/** 
	* @Description: 创建保存的实体对象
	* @author Liu Wenjie   
	* @date 2014-11-19 下午10:21:08 
	* @param trigger
	* @param context
	* @param triggerInstructionCode
	* @return  
	*/ 
	private JobMonitorLogDomain buildJobLogDomain(Trigger trigger, JobExecutionContext context,
			CompletedExecutionInstruction triggerInstructionCode){
		JobMonitorLogDomain entity = new JobMonitorLogDomain();
		if(trigger == null){
			return entity;
		}
		//方法名和类名
		try {
			JobKey jobKey = trigger.getJobKey();
			JobDetail jobDetail = scheduler.getJobDetail(jobKey);
			entity.setExecuteClass(jobDetail.getJobClass().toString());
		} catch (SchedulerException e1) {
			LOG.error("get JOB className error");
			entity.setExcuteException(ThrowableUtil.getStackTrace(e1));
		}
		//解析参数
		//操作时间
		Date startTime = context.getFireTime();
		Date endTime = new Date();
		entity.setStartTime(startTime);
		entity.setEndTime(endTime);
		entity.setDuration(context.getJobRunTime());
		if(startTime != null){
			entity.setStartMillisecond(startTime.getTime());
		}
		if(endTime != null){
			entity.setEndMillisecond(endTime.getTime());
		}
		
		//返回值或异常信息
		
		//返回值结果
		entity.setExcuteResult(String.valueOf(triggerInstructionCode));
		return entity;
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @return 
	* @see org.quartz.JobListener#getName() 
	*/ 
	@Override
	public String getName() {
		LOG.info("==============getName===============" );
		return "JobListener-ISALES";
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param context 
	* @see org.quartz.JobListener#jobToBeExecuted(org.quartz.JobExecutionContext) 
	*/ 
	@Override
	public void jobToBeExecuted(JobExecutionContext context) {
		// TODO Auto-generated method stub
		LOG.info("==============jobToBeExecuted===============" );
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param context 
	* @see org.quartz.JobListener#jobExecutionVetoed(org.quartz.JobExecutionContext) 
	*/ 
	@Override
	public void jobExecutionVetoed(JobExecutionContext context) {
		// TODO Auto-generated method stub
		LOG.info("==============jobExecutionVetoed===============" );
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-19 下午7:18:48 
	* @param context
	* @param jobException 
	* @see org.quartz.JobListener#jobWasExecuted(org.quartz.JobExecutionContext, org.quartz.JobExecutionException) 
	*/ 
	@Override
	public void jobWasExecuted(JobExecutionContext context,
			JobExecutionException jobException) {
		LOG.info("==============jobWasExecuted===============" );
		
	}
	
	
	/*=======================getter and setter =====================*/
	/**
	 * @Description: 属性 scheduler 的set方法 
	 * @param scheduler 
	 */
	public void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}

	/**
	 * @Description: 属性 jobMonitorDao 的set方法 
	 * @param jobMonitorDao 
	 */
	public void setJobMonitorDao(JobMonitorLogDAO jobMonitorDao) {
		this.jobMonitorDao = jobMonitorDao;
	}

}
