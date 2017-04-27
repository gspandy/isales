/**
* @Company 青鸟软通   
* @Title: ProductsParamsSyncJob.java 
* @Package com.haier.isales.quartz.datatranscoding.here 
* @author John.zhao   
* @date 2015-1-26 下午2:38:20 
* @version V1.0   
*/ 
package com.haier.isales.quartz.datatranscoding.here;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.haier.isales.common.SpringApplicationContextHolder;
import com.haier.isales.products.heretemp.productsparams.service.ProductsParamsService;

/** 
 * @ClassName: ProductsParamsSyncJob 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsParamsSyncJob implements Job {

	/**
	 * <p>Description: 获取规格参数 字段-value 数据</p> 
	 * @author John.zhao   
	 * @date 2015-1-26 下午2:38:20 
	 * @param context
	 * @throws JobExecutionException 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		ProductsParamsService productsParamsService = SpringApplicationContextHolder.getBean("productsParamsService");
		productsParamsService.saveProductsParams();
	
	}

}
