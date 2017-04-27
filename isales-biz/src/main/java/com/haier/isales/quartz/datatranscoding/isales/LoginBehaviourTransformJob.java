/**
 * @Company 青鸟软通   
 * @Title: LoginBehaviourTransformJob.java 
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
* @ClassName: LoginBehaviourTransformJob 
* @Description: 
*  
*/ 
public class LoginBehaviourTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(LoginBehaviourTransformJob.class);

	/** 
	* @Fields userBehaviourTransform :  
	*/ 
	private SimpleTransform loginBehaviourTransform;

	/**
	 * <p>
	 * Description: 执行loginBehaviour日志同步转换
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
		LOG.info("执行loginBehaviour日志同步转换开始！");
		loginBehaviourTransform = SpringApplicationContextHolder.getBean("loginBehaviourTransform");
		try {
			loginBehaviourTransform.execute();
			LOG.info("执行loginBehaviour日志同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行loginBehaviour日志同步转换失败！",new Throwable(e));
		}
	}

	/**
	 * @Description: 属性 loginBehaviourTransform 的set方法 
	 * @param loginBehaviourTransform 
	 */
	public void setLoginBehaviourTransform(SimpleTransform loginBehaviourTransform) {
		this.loginBehaviourTransform = loginBehaviourTransform;
	}


}
