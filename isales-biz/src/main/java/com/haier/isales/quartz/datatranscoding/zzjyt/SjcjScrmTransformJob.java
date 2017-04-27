package com.haier.isales.quartz.datatranscoding.zzjyt;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: SjcjScrmTransformJob
 * @Description:门店、产业当月销量和会员数据同步--已验证
 * 
 */
public class SjcjScrmTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(SjcjScrmTransformJob.class);

	/**
	 * @Fields sjcjScrmTransform : 
	 */
	private SimpleTransform sjcjScrmTransform;

	/**
	* <p>Description: </p> 
	* @author cao rui   
	* @date 2015-6-25 上午10:09:29 
	* @param context
	* @throws JobExecutionException 
	* @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	*/ 
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行门店、产业当月销量和会员数据同步开始！");
		sjcjScrmTransform = SpringApplicationContextHolder.getBean("sjcjScrmTransform");
		try {
			sjcjScrmTransform.execute();
			LOG.info("执行门店、产业当月销量和会员数据同步结束！");
		} catch (Exception e) {
			LOG.warn("执行门店、产业当月销量和会员数据同步失败！",new Throwable(e));
		}
	}

	/**
	 * @Description: 属性 sjcjScrmTransform 的set方法 
	 * @param sjcjScrmTransform 
	 */
	public void setSjcjScrmTransform(SimpleTransform sjcjScrmTransform) {
		this.sjcjScrmTransform = sjcjScrmTransform;
	}
}
