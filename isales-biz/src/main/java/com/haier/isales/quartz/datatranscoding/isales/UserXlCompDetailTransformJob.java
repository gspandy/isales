package com.haier.isales.quartz.datatranscoding.isales;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: UserXlCompDetailTransformJob
 * @Description:门店、产业当月销量、销额、提成信息-所有渠道
 * 
 */
public class UserXlCompDetailTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(UserXlCompDetailTransformJob.class);

	/**
	 * @Fields userXlCompDetailTransform : 
	 */
	private SimpleTransform userXlCompDetailTransform;

	/**
	* <p>Description: </p> 
	* @author lizhenwei
	* @date 2016-5-07 上午09:56:29 
	* @param context
	* @throws JobExecutionException 
	* @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	*/ 
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行门店、产业当月销量、销额、提成信息-所有渠道同步开始！");
		userXlCompDetailTransform = SpringApplicationContextHolder.getBean("userXlCompDetailTransform");
		try {
			userXlCompDetailTransform.execute();
			LOG.info("执行门店、产业当月销量、销额、提成信息-所有渠道同步结束！");
		} catch (Exception e) {
			LOG.warn("执行门店、产业当月销量、销额、提成信息-所有渠道同步失败！",new Throwable(e));
		}
	}

	/**
	 * @param userXlCompDetailTransform the userXlCompDetailTransform to set
	 */
	public void setUserXlCompDetailTransform(
			SimpleTransform userXlCompDetailTransform) {
		this.userXlCompDetailTransform = userXlCompDetailTransform;
	}

}
