/**
* @Company 青鸟软通   
* @Title: ProductsDetailSyncJob.java 
* @Package com.haier.isales.quartz.datatranscoding.here 
* @author John.zhao   
* @date 2015-1-26 下午2:40:52 
* @version V1.0   
*/ 
package com.haier.isales.quartz.datatranscoding.here;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.haier.isales.common.SpringApplicationContextHolder;
import com.haier.isales.products.heretemp.productsdetail.service.ProductsDetailService;

/** 
 * @ClassName: ProductsDetailSyncJob 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsDetailSyncJob implements Job {

	/**
	 * <p>Description: 获取产品详情及套图</p> 
	 * @author John.zhao   
	 * @date 2015-1-26 下午2:40:52 
	 * @param context
	 * @throws JobExecutionException 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		ProductsDetailService productsDetailService = SpringApplicationContextHolder.getBean("productsDetailService");
		productsDetailService.saveAllProductsDetailAndImage();
	}

}
