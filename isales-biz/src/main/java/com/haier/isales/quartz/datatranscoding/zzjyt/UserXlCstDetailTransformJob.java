package com.haier.isales.quartz.datatranscoding.zzjyt;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: SjcjCustTransformJob
 * @Description:门店、产业当月销量和会员数据同步--客户的联网量
 * 
 */
public class UserXlCstDetailTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(UserXlCstDetailTransformJob.class);

	/**
	 * @Fields sjcjScrmTransform : 
	 */
	private SimpleTransform userXlCstDetailTransform;

	/**
	* <p>Description: </p> 
	* @author lizhenwei   
	* @date 2016-05-12 16:43:29 
	* @param context
	* @throws JobExecutionException 
	* @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	*/ 
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行门店、产业当月联网录入销量详情数据同步开始！");
		userXlCstDetailTransform = SpringApplicationContextHolder.getBean("userXlCstDetailTransform");
		try {
			userXlCstDetailTransform.execute();
			LOG.info("执行门店、产业当月联网录入销量详情数据同步结束！");
		} catch (Exception e) {
			LOG.warn("执行门店、产业当月联网录入销量详情数据同步失败！",new Throwable(e));
		}
	}

	/**
	 * @param userXlCstDetailTransform the userXlCstDetailTransform to set
	 */
	public void setUserXlCstDetailTransform(SimpleTransform userXlCstDetailTransform) {
		this.userXlCstDetailTransform = userXlCstDetailTransform;
	}
	
}
