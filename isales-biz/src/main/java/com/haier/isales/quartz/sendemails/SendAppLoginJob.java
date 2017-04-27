/**
* @Company 青鸟软通   
* @Title: SendAppLoginJob.java 
* @Package com.haier.isales.quartz.sendemails 
* @author John.zhao   
* @date 2014-12-8 上午10:16:05 
* @version V1.0   
*/ 
package com.haier.isales.quartz.sendemails;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.haier.isales.common.SpringApplicationContextHolder;
import com.haier.isales.statistics.applogin.service.AppLoginService;

/** 
 * @ClassName: SendAppLoginJob 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author John.zhao 
 */
public class SendAppLoginJob implements Job {
	
	private static final Logger LOG = LoggerFactory.getLogger(SendAppLoginJob.class);
	
//	private AppLoginService appLoginService;
	/**
	 * <p>Description: </p> 
	 * @author John.zhao   
	 * @date 2014-12-8 上午10:16:05 
	 * @param context
	 * @throws JobExecutionException 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("发送app每日登录查询邮件定时任务开始！");
		AppLoginService appLoginService = SpringApplicationContextHolder.getBean("appLoginService");
		try {
			appLoginService.sendAppLoginEmail();
			LOG.info("发送app每日登录查询邮件定时任务完成！");
		} catch (Exception e) {
			LOG.warn("发送app每日登录查询邮件定时任务出错:", e);
		}

	}

}
