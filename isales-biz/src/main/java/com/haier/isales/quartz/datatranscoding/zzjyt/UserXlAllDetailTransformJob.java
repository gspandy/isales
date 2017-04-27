package com.haier.isales.quartz.datatranscoding.zzjyt;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: UserXlAllDetailTransformJob
 * @Description:门店、产业当月直销员录入销量详情同步--直销员录入
 * 
 */
public class UserXlAllDetailTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(UserXlAllDetailTransformJob.class);

	/**
	 * @Fields userXlAllDetailTransform : 
	 */
	private SimpleTransform userXlAllDetailTransform;

	/**
	* <p>Description: </p> 
	* @author lizhenwei   
	* @date 2016-05-18 上午18:44:29 
	* @param context
	* @throws JobExecutionException 
	* @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	*/ 
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("门店、产业当月直销员录入销量详情同步开始！");
		userXlAllDetailTransform = SpringApplicationContextHolder.getBean("userXlAllDetailTransform");
		try {
			userXlAllDetailTransform.execute();
			LOG.info("门店、产业当月直销员录入销量详情同步结束！");
		} catch (Exception e) {
			LOG.warn("门店、产业当月直销员录入销量详情同步失败！",new Throwable(e));
		}
	}

	/**
	 * @param userXlAllDetailTransform the userXlAllDetailTransform to set
	 */
	public void setUserXlAllDetailTransform(SimpleTransform userXlAllDetailTransform) {
		this.userXlAllDetailTransform = userXlAllDetailTransform;
	}

}
