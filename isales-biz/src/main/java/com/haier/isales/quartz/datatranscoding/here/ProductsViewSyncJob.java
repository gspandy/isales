/**
* @Company 青鸟软通   
* @Title: ProductsViewSyncJob.java 
* @Package com.haier.isales.quartz.datatranscoding.here 
* @author John.zhao   
* @date 2015-1-26 下午2:17:20 
* @version V1.0   
*/ 
package com.haier.isales.quartz.datatranscoding.here;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;
import com.haier.isales.products.heretemp.productsclassify.service.ProductsClassifyService;

/** 
 * @ClassName: ProductsViewSyncJob 
 * @Description: 同步here官网视图数据
 *  
 */
public class ProductsViewSyncJob implements Job{
	
	private static Logger logger = LoggerFactory.getLogger(ProductsViewSyncJob.class);

	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-1-26 下午2:17:37 
	* @param context
	* @throws JobExecutionException 
	* @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	*/ 
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		ProductsClassifyService productsClassifyService = SpringApplicationContextHolder.getBean("productsClassifyService");
		logger.info("同步here官网视图数据开始");
		productsClassifyService.saveAllProductInfo();
		logger.info("同步here官网视图数据结束");
	}
}
