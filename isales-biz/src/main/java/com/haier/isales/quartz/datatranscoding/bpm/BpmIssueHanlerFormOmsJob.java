/**
 * @Company 青鸟软通   
 * @Title: BpmIssueHanlerFormOmsJob.java 
 * @Package com.haier.isales.quartz.datatranscoding.bpm
 * @author Guo yuchao   
 * @date 2014-2-5 23:53:55
 * @version V1.0   
 */
package com.haier.isales.quartz.datatranscoding.bpm;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.app.mdmhandler.service.MdmHandlerService;
import com.haier.isales.app.omshandler.service.OmsHandlerService;
import com.haier.isales.common.SpringApplicationContextHolder;


public class BpmIssueHanlerFormOmsJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(BpmIssueHanlerFormOmsJob.class);
	
	private OmsHandlerService omsHandlerService;
	private MdmHandlerService mdmHandlerService;
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-12-12 下午2:57:20 
	* @param context
	* @throws JobExecutionException 
	* @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	*/ 
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		omsHandlerService = SpringApplicationContextHolder.getBean("omsHandlerService");
		try {
			LOG.info("定时执行 同步OMS系统问题第一级处理人任务开始！");
			omsHandlerService.saveOmsHandlerTemp();
			
			LOG.info("定时执行 同步OMS系统问题第一级处理人任务结束！");
		} catch (Exception e) {
			LOG.warn("定时执行 同步OMS系统问题第一级处理人任务出错！",new Throwable(e));
		}
		mdmHandlerService = SpringApplicationContextHolder.getBean("mdmHandlerService");
		try {
			LOG.info("定时执行 同步MDM系统问题第一级处理人任务开始！");
			mdmHandlerService.saveMdmHandlerTemp();
			
			LOG.info("定时执行 同步MDM系统问题第一级处理人任务结束！");
		} catch (Exception e) {
			LOG.warn("定时执行 同步MDM系统问题第一级处理人任务出错！",new Throwable(e));
		}
	}
	public void setOmsHandlerService(OmsHandlerService omsHandlerService) {
		this.omsHandlerService = omsHandlerService;
	}
	public void setMdmHandlerService(MdmHandlerService mdmHandlerService) {
		this.mdmHandlerService = mdmHandlerService;
	}
	

}
