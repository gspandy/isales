package com.haier.isales.quartz.datatranscoding.zzjyt;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: EmployeeShopRefTransformJob
 * @Description:直销员门店对应关系
 * 
 */
public class EmployeeShopRefTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeShopRefTransformJob.class);

	/**
	 * @Fields cardSetRateTransform : 直销员门店对应关系同步转换
	 */
	private SimpleTransform employeeShopRefTransform;

	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-3-27 上午10:09:29 
	* @param context
	* @throws JobExecutionException 
	* @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	*/ 
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行直销员门店对应关系同步转换开始！");
		employeeShopRefTransform = SpringApplicationContextHolder.getBean("employeeShopRefTransform");
		try {
			employeeShopRefTransform.execute();
			LOG.info("执行直销员门店对应关系同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行直销员门店对应关系同步转换失败！",new Throwable(e));
		}
	}

	/**
	 * @Description: 属性 employeeShopRefTransform 的set方法 
	 * @param employeeShopRefTransform 
	 */
	public void setEmployeeShopRefTransform(SimpleTransform employeeShopRefTransform) {
		this.employeeShopRefTransform = employeeShopRefTransform;
	}
}
