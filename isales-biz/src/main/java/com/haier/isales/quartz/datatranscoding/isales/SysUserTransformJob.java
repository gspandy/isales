/**
 * @Company 青鸟软通   
 * @Title: SysUserTransformJob.java 
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
public class SysUserTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(SysUserTransformJob.class);

	/** 
	* @Fields sysUserTransform 
	*/ 
	private SimpleTransform sysUserTransform;

	/**
	 * <p>
	 * Description: 执行sysUser人力表同步转换
	 * </p>
	 * 
	 * @author 
	 * @date  2016-03-24 17:03:48
	 * @param context
	 * @throws JobExecutionException
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行sysUser人力表同步转换开始！");
		sysUserTransform = SpringApplicationContextHolder.getBean("sysUserTransform");
		try {
			sysUserTransform.execute();
			LOG.info("执行sysUser人力表同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行sysUser人力表同步转换失败！",new Throwable(e));
		}
	}

	/**
	 * @param sysUserTransform the sysUserTransform to set
	 */
	public void setSysUserTransform(SimpleTransform sysUserTransform) {
		this.sysUserTransform = sysUserTransform;
	}

}
