/**
* @Company 青鸟软通   
* @Title: QueryBTBRatailTransformJob.java 
* @Package com.haier.isales.quartz.datatranscoding.edw 
* @author John.zhao   
* @date 2015-1-4 下午4:15:38 
* @version V1.0   
*/ 
package com.haier.isales.quartz.datatranscoding.edw;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/** 
 * @ClassName: QueryBTBRatailTransformJob 
 * @Description: 收入实际(业绩-零售额) 
 *  
 */
public class QueryBTBRatailTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(QueryBTBRatailTransformJob.class);

//	private SimpleTransform queryBTBRatailTransform;
	/**
	 * <p>Description: </p> 
	 * @author John.zhao   
	 * @date 2015-1-4 下午4:15:38 
	 * @param context
	 * @throws JobExecutionException 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行同步EDW收入实际(业绩-零售额)转换开始！ ");
		SimpleTransform queryBTBRatailTransform = SpringApplicationContextHolder.getBean("queryBTBRatailTransform");
		try {
			queryBTBRatailTransform.execute();
			LOG.info("执行同步EDW收入实际(业绩-零售额)转换结束！");
		} catch (Exception e) {
			LOG.warn("执行同步EDW收入实际(业绩-零售额)转换失败！",new Throwable(e));
		}
	}
}
