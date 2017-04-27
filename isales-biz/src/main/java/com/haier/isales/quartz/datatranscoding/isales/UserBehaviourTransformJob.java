/**
 * @Company 青鸟软通   
 * @Title: UserBehaviourTransformJob.java 
 * @Package com.haier.isales.quartz.datatranscoding 
 * @author R.Core   
 * @date 2014-11-20 上午10:22:11 
 * @version V1.0   
 */
package com.haier.isales.quartz.datatranscoding.isales;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/** 
* @ClassName: UserBehaviourTransformJob 
* @Description: 
*  
*/ 
public class UserBehaviourTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(UserBehaviourTransformJob.class);

	/** 
	* @Fields userBehaviourTransform :  
	*/ 
	private SimpleTransform userBehaviourTransform;

	/**
	 * <p>
	 * Description: 执行userbehaviour日志同步转换
	 * </p>
	 * 
	 * @author R.Core
	 * @date  2015-3-27 17:03:48
	 * @param context
	 * @throws JobExecutionException
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行userbehaviour日志同步转换开始！");
		userBehaviourTransform = SpringApplicationContextHolder.getBean("userBehaviourTransform");
		try {
			userBehaviourTransform.execute();
			LOG.info("执行userbehaviour日志同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行userbehaviour日志同步转换失败！",new Throwable(e));
		}
	}

	/**
	 * @Description: 属性 userBehaviourTransform 的set方法 
	 * @param userBehaviourTransform 
	 */
	public void setUserBehaviourTransform(SimpleTransform userBehaviourTransform) {
		this.userBehaviourTransform = userBehaviourTransform;
	}


}
