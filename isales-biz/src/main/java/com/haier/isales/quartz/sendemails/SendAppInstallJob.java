/**
* @Company 青鸟软通   
* @Title: SendAppInstallJob.java 
* @Package com.haier.isales.quartz.sendemails 
* @author John.zhao   
* @date 2014-12-4 下午1:24:59 
* @version V1.0   
*/ 
package com.haier.isales.quartz.sendemails;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;
import com.haier.isales.statistics.appinstall.service.AppInstallService;

/** 
 * @ClassName: SendAppInstallJob 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author John.zhao 
 */
public class SendAppInstallJob implements Job {
	
	private static final Logger LOG = LoggerFactory.getLogger(SendAppInstallJob.class);
	
//	private AppInstallService appInstallService;
	/**
	 * <p>Description: </p>
	 * @author John.zhao   
	 * @date 2014-12-4 下午1:24:59 
	 * @param context
	 * @throws JobExecutionException 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("发送app安装并登录邮件定时任务开始！");
		AppInstallService appInstallService = SpringApplicationContextHolder.getBean("appInstallService");
		try {
			appInstallService.sendAppInstallEmail();
			LOG.info("发送app安装并登录邮件定时任务完成！");
		} catch (Exception e) {
			LOG.warn("执行定时发送app安装并登录邮件定时任务出错：",e);
		}
	}

}
