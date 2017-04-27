/**
 * @Company 青鸟软通   
 * @Title: BtbOrganizationGMJob.java 
 * @Package com.haier.isales.quartz.datatranscoding 
 * @author John Zhao   
 * @date 2014-11-20 上午10:18:36 
 * @version V1.0   
 */
package com.haier.isales.quartz.datatranscoding;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: BtbOrganizationGMJob
 * @Description: 获取自主经营体系统的门店信息Job
 * 
 */
public class OrganizationTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(OrganizationTransformJob.class);

	/**
	 * @Fields organizationTransform : 获取自主经营体系统的门店信息
	 */
	private SimpleTransform organizationTransform;

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John Zhao
	 * @date 2014-11-20 上午10:18:36
	 * @param context
	 * @throws JobExecutionException
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("定时执行获取自主经营体系统的门店信息任务开始！");
		organizationTransform = SpringApplicationContextHolder.getBean("organizationTransform");
		try {
			organizationTransform.execute();
			LOG.info("定时执行获取自主经营体系统的门店信息任务结束！");
		} catch (Exception e) {
			LOG.warn("定时执行获取自主经营体系统的门店信息任务出错！", new Throwable(e));
		}
	}

	/**
	 * @Description: 属性 organizationTransform 的set方法
	 * @param organizationTransform
	 */
	public void setOrganizationTransform(SimpleTransform organizationTransform) {
		this.organizationTransform = organizationTransform;
	}

}
