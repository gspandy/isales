/**
 * @Company 青鸟软通   
 * @Title: ProLineTransformJob.java 
 * @Package com.haier.isales.quartz.datatranscoding 
 * @author John Zhao   
 * @date 2014-11-20 上午10:25:13 
 * @version V1.0   
 */
package com.haier.isales.quartz.datatranscoding;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: ProLineTransformJob
 * @Description: 营销产品线信息同步Job
 * 
 */
public class ProLineTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(ProLineTransformJob.class);
	
	private SimpleTransform prolineTransform;

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John Zhao
	 * @date 2014-11-20 上午10:25:13
	 * @param context
	 * @throws JobExecutionException
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		prolineTransform = SpringApplicationContextHolder.getBean("prolineTransform");
		try {
			LOG.info("定时执行营销产品线信息同步转码任务开始！");
			prolineTransform.execute();
			LOG.info("定时执行营销产品线信息同步转码任务结束！");
		} catch (Exception e) {
			LOG.warn("定时执行营销产品线信息同步转码任务出错！",new Throwable(e));
		}
	}

	/**
	 * @Description: 属性 prolineTransform 的set方法
	 * @param prolineTransform
	 */
	public void setProlineTransform(SimpleTransform prolineTransform) {
		this.prolineTransform = prolineTransform;
	}

}
