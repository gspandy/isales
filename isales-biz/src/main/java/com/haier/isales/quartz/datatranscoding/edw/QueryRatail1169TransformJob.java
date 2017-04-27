/**
 * @Company 青鸟软通   
 * @Title: QueryRatail1169TransformJob.java 
 * @Package com.haier.isales.quartz.datatranscoding 
 * @author GuoYuchao  
 * @date 2014-12-15 16:55:32
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
 * @ClassName: QueryRatail1169TransformJob
 * @Description: 月度CPM提报到一级经营体(金额)零售计划  信息同步转换
 * 
 */
public class QueryRatail1169TransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(QueryRatail1169TransformJob.class);

	/**
	 * @Fields employeeTransform : 月度CPM提报到一级经营体(金额)零售计划  
	 */
	private SimpleTransform queryRatail1169Transform;

	/**
	 * <p>
	 * Description: 月度CPM提报到一级经营体(金额)零售计划  
	 * </p>
	 * 
	 * @author John Zhao
	 * @date 2014-11-20 上午10:22:11
	 * @param context
	 * @throws JobExecutionException
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行月度CPM提报到一级经营体(金额)零售计划  信息同步转换开始！");
		queryRatail1169Transform = SpringApplicationContextHolder.getBean("queryRatail1169Transform");
		try {
			queryRatail1169Transform.execute();
			LOG.info("执行月度CPM提报到一级经营体(金额)零售计划  信息同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行月度CPM提报到一级经营体(金额)零售计划  信息同步转换失败！",new Throwable(e));
		}
	}

	/**
	 * @Description: 属性 queryRatail1169Transform 的set方法 
	 * @param queryRatail1169Transform 
	 */
	public void setQueryRatail1169Transform(SimpleTransform queryRatail1169Transform) {
		this.queryRatail1169Transform = queryRatail1169Transform;
	}

	

}
