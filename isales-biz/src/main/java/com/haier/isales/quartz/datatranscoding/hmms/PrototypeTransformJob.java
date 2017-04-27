/**
 * @Company 青鸟软通   
 * @Title: PrototypeTransformJob.java 
 * @Package com.haier.isales.quartz.datatranscoding 
 * @author GuoYuchao  
 * @date 2014-12-16 11:12:50 
 * @version V1.0   
 */
package com.haier.isales.quartz.datatranscoding.hmms;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: PrototypeTransformJob
 * @Description: 样机信息同步转换
 * 
 */
public class PrototypeTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(PrototypeTransformJob.class);

	/**
	 * @Fields employeeTransform : 样机信息同步转换
	 */
	private SimpleTransform prototypeTransform;

	/**
	 * <p>
	 * Description: 执行样机信息同步转换
	 * </p>
	 * 
	 * @author GuoYuchao
	 * @date 2014-12-16上午10:22:11
	 * @param context
	 * @throws JobExecutionException
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行样机信息同步转换开始！");
		prototypeTransform = SpringApplicationContextHolder.getBean("prototypeTransform");
		try {
			prototypeTransform.execute();
			LOG.info("执行样机信息同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行样机信息同步转换失败！",new Throwable(e));
		}
	}

	/**
	 * @Description: 属性 prototypeTransform 的set方法 
	 * @param prototypeTransform 
	 */
	public void setPrototypeTransform(SimpleTransform prototypeTransform) {
		this.prototypeTransform = prototypeTransform;
	}



}
