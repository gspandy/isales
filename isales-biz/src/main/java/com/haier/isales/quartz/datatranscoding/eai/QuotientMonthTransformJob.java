/**
 * @Company 青鸟软通   
 * @Title: QuotientMonthActualTransformJob.java 
 * @Package com.haier.isales.quartz.datatranscoding 
 * @author Guo yuchao   
 * @date 2014-12-15 14:53:55
 * @version V1.0   
 */
package com.haier.isales.quartz.datatranscoding.eai;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: QuotientMonthActualTransformJob
 * @Description: EAI零售份额信息同步Job
 * 
 */
public class QuotientMonthTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(QuotientMonthTransformJob.class);
	
	private SimpleTransform quotientTransform;
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
		quotientTransform = SpringApplicationContextHolder.getBean("quotientTransform");
		try {
			LOG.info("定时执行 EAI零售份额信息同步任务开始！");
			quotientTransform.execute();
			LOG.info("定时执行 EAI零售份额信息同步任务结束！");
		} catch (Exception e) {
			LOG.warn("定时执行EAI零售份额信息同步任务出错！",new Throwable(e));
		}
	}
	/**
	 * @Description: 属性 quotientTransform 的set方法 
	 * @param quotientTransform 
	 */
	public void setQuotientTransform(SimpleTransform quotientTransform) {
		this.quotientTransform = quotientTransform;
	}

 



	

}
