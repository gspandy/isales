/**
* @Company 青鸟软通   
* @Title: ProductsFAQSyncJob.java 
* @Package com.haier.isales.quartz.datatranscoding.here 
* @author John.zhao   
* @date 2015-1-26 下午2:48:28 
* @version V1.0   
*/ 
package com.haier.isales.quartz.datatranscoding.here;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.haier.isales.common.SpringApplicationContextHolder;
import com.haier.isales.products.heretemp.productsfaq.service.ProductsFAQService;

/** 
 * @ClassName: ProductsFAQSyncJob 
 * @Description: 常见问题FAQ
 *  
 */
public class ProductsFAQSyncJob implements Job {

	/**
	 * <p>Description: 常见问题</p> 
	 * @author John.zhao   
	 * @date 2015-1-26 下午2:48:28 
	 * @param context
	 * @throws JobExecutionException 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		ProductsFAQService productsFAQService = SpringApplicationContextHolder.getBean("productsFAQService");
		productsFAQService.saveProductsFAQ();
	}
}
