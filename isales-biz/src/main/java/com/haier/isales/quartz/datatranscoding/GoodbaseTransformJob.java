/**
 * @Company 青鸟软通   
 * @Title: DataTranscodingJob.java 
 * @Package com.haier.isales.quartz 
 * @author John Zhao   
 * @date 2014-11-20 下午2:38:10 
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
 * @ClassName: BtbGoodbaseJob
 * @Description: 定时执行产品型号信息同步转码任务
 * 
 */
public class GoodbaseTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(GoodbaseTransformJob.class);

	/**
	 * @Fields goodBaseTransform : 产品型号信息
	 */
	private SimpleTransform goodBaseTransform;

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John Zhao
	 * @date 2014-11-20 上午10:14:59
	 * @param context
	 * @throws JobExecutionException
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		goodBaseTransform = SpringApplicationContextHolder.getBean("goodBaseTransform");
		try {
			LOG.info("定时执行产品型号信息同步转码任务开始！");
			goodBaseTransform.execute();
			LOG.info("定时执行产品型号信息同步转码任务结束！");
		} catch (Exception e) {
			LOG.warn("定时执行产品型号信息同步转码任务！", e);
		}
	}

	/**
	 * @Description: 属性 goodBaseTransform 的set方法
	 * @param goodBaseTransform
	 */
	public void setGoodBaseTransform(SimpleTransform goodBaseTransform) {
		this.goodBaseTransform = goodBaseTransform;
	}

}
