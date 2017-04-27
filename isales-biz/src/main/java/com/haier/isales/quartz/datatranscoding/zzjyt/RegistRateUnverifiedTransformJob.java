/**
 * @Company 青鸟软通   
 * @Title: RegistRateUnverifiedTransformJob.java 
 * @Package com.haier.isales.quartz.datatranscoding 
 * @author GuoYuchao  
 * @date 2014年12月15日14:38:22
 * @version V1.0   
 */
package com.haier.isales.quartz.datatranscoding.zzjyt;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: RegistRateUnverifiedTransformJob
 * @Description: 会员注册率(未验证)
 * 
 */
public class RegistRateUnverifiedTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(RegistRateUnverifiedTransformJob.class);

	/**
	 * @Fields cardSetRateTransform : 会员注册率(未验证)信息同步转换
	 */
	private SimpleTransform registRateUnverifiedTransform;

	/**
	 * <p>
	 * Description: 
	 * </p>
	 * 
	 * @author GuoYuchao
	 * @date 2014-12-15 14:39:27
	 * @param context
	 * @throws JobExecutionException
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行会员注册率(未验证)信息同步转换开始！");
		registRateUnverifiedTransform = SpringApplicationContextHolder.getBean("registRateUnverifiedTransform");
		try {
			registRateUnverifiedTransform.execute();
			LOG.info("执行会员注册率(未验证)信息同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行会员注册率(未验证)信息同步转换失败！",new Throwable(e));
		}
	}

	/**
	 * @Description: 属性 registRateUnverifiedTransform 的set方法 
	 * @param registRateUnverifiedTransform 
	 */
	public void setRegistRateUnverifiedTransform(
			SimpleTransform registRateUnverifiedTransform) {
		this.registRateUnverifiedTransform = registRateUnverifiedTransform;
	}



}
