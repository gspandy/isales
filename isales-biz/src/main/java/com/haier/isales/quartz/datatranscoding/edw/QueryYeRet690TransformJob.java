/**
 * @Company 青鸟软通   
 * @Title: QueryYeRet690TransformJob.java 
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
 * @ClassName: QueryYeRet690TransformJob
 * @Description:月度690RCM报的零售计划(到客户到门店)
 * 
 */
public class QueryYeRet690TransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(QueryYeRet690TransformJob.class);

	/**
	 * @Fields employeeTransform : 月度690RCM报的零售计划(到客户到门店)
	 */
	private SimpleTransform queryYeRet690Transform;

	/**
	 * <p>
	 * Description: 月度690RCM报的零售计划(到客户到门店)
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
		LOG.info("执行月度690RCM报的零售计划(到客户到门店) 信息同步转换开始！");
		queryYeRet690Transform = SpringApplicationContextHolder.getBean("queryYeRet690Transform");
		try {
			queryYeRet690Transform.execute();
			LOG.info("执行月度690RCM报的零售计划(到客户到门店)信息同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行月度690RCM报的零售计划(到客户到门店) 信息同步转换失败！",new Throwable(e));
		}
	}

	/**
	 * @Description: 属性 queryYeRet690Transform 的set方法 
	 * @param queryYeRet690Transform 
	 */
	public void setQueryYeRet690Transform(SimpleTransform queryYeRet690Transform) {
		this.queryYeRet690Transform = queryYeRet690Transform;
	}



	

}
