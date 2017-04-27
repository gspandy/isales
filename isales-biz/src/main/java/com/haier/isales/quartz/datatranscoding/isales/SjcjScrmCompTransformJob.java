package com.haier.isales.quartz.datatranscoding.isales;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: SjcjScrmCompTransformJob
 * @Description:门店、产业当月销量和会员数据同步--全部
 * 
 */
public class SjcjScrmCompTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(SjcjScrmCompTransformJob.class);

	/**
	 * @Fields sjcjScrmTransform : 
	 */
	private SimpleTransform sjcjScrmCompTransform;

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
		LOG.info("执行门店、产业当月销量和会员全部数据同步开始！");
		sjcjScrmCompTransform = SpringApplicationContextHolder.getBean("sjcjScrmCompTransform");
		try {
			sjcjScrmCompTransform.execute();
			LOG.info("执行门店、产业当月销量和会员全部数据同步结束！");
		} catch (Exception e) {
			LOG.warn("执行门店、产业当月销量和会员全部数据同步失败！",new Throwable(e));
		}
	}

	public void setSjcjScrmCompTransform(SimpleTransform sjcjScrmCompTransform) {
		this.sjcjScrmCompTransform = sjcjScrmCompTransform;
	}

}
