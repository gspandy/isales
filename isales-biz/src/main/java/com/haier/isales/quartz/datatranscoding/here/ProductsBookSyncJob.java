/**
* @Company 青鸟软通   
* @Title: ProductsBookSyncJob.java 
* @Package com.haier.isales.quartz.datatranscoding.here 
* @author John.zhao   
* @date 2015-1-26 下午2:42:54 
* @version V1.0   
*/ 
package com.haier.isales.quartz.datatranscoding.here;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.haier.isales.common.SpringApplicationContextHolder;
import com.haier.isales.products.heretemp.productsbook.service.ProductsBookService;

/** 
 * @ClassName: ProductsBookSyncJob 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsBookSyncJob implements Job {

	/**
	 * <p>Description: 说明书</p> 
	 * @author John.zhao   
	 * @date 2015-1-26 下午2:42:54 
	 * @param context
	 * @throws JobExecutionException 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		ProductsBookService productsBookService = SpringApplicationContextHolder.getBean("productsBookService");
		productsBookService.saveAllProductsBook();
	}

}
