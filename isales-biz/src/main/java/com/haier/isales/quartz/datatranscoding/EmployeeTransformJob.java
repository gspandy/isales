/**
 * @Company 青鸟软通   
 * @Title: BtbRsHmcJob.java 
 * @Package com.haier.isales.quartz.datatranscoding 
 * @author John Zhao   
 * @date 2014-11-20 上午10:22:11 
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
 * @ClassName: EmployeeTransformJob
 * @Description: 直销员员工信息同步转换
 * 
 */
public class EmployeeTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeTransformJob.class);

	/**
	 * @Fields employeeTransform : 员工信息同步转换
	 */
	private SimpleTransform employeeTransform;

	/**
	 * <p>
	 * Description: 执行直销员员工信息同步转换
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
		LOG.info("执行直销员员工信息同步转换开始！");
		employeeTransform = SpringApplicationContextHolder.getBean("employeeTransform");
		try {
			employeeTransform.execute();
			LOG.info("执行直销员员工信息同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行直销员员工信息同步转换失败！",new Throwable(e));
		}
	}

	/**
	 * @Description: 属性 employeeTransform 的set方法
	 * @param employeeTransform
	 */
	public void setEmployeeTransform(SimpleTransform employeeTransform) {
		this.employeeTransform = employeeTransform;
	}

}
