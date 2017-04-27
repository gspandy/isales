/**
* @Company 青鸟软通   
* @Title: QueryRatailTransformJob.java 
* @Package com.haier.isales.quartz.datatranscoding.edw 
* @author John.zhao   
* @date 2014-12-15 下午4:52:15 
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
 * @ClassName: QueryRatailTransformJob 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class QueryRatailTransformJob implements Job {
	
	private static final Logger LOG = LoggerFactory.getLogger(QueryRatailTransformJob.class);

	/**
	 * @Fields employeeTransform : EDW收入接口
	 */
//	private SimpleTransform queryRatailTransform;
	/**
	 * <p>Description: </p> 
	 * @author John.zhao   
	 * @date 2014-12-15 下午4:52:15 
	 * @param context
	 * @throws JobExecutionException 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行直销员收入接口同步转换开始！");
		SimpleTransform queryRatailTransform = SpringApplicationContextHolder.getBean("queryRatailTransform");
		try {
			queryRatailTransform.execute();
			LOG.info("执行直销员收入接口同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行直销员收入接口同步转换失败！",new Throwable(e));
		}

	}

}
