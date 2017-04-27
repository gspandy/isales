/**
* @Company 青鸟软通   
* @Title: ProductsClassifyParamsSyncJob.java 
* @Package com.haier.isales.quartz.datatranscoding.here 
* @author John.zhao   
* @date 2015-1-26 下午2:29:06 
* @version V1.0   
*/ 
package com.haier.isales.quartz.datatranscoding.here;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.haier.isales.common.SpringApplicationContextHolder;
import com.haier.isales.products.heretemp.productsclassifyparams.service.ProductsClassifyParamsService;

/** 
 * @ClassName: ProductsClassifyParamsSyncJob 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsClassifyParamsSyncJob implements Job {

	/**
	 * <p>Description: 获取规格参数字段-注释的数据</p> 
	 * @author John.zhao   
	 * @date 2015-1-26 下午2:29:06 
	 * @param context
	 * @throws JobExecutionException 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		ProductsClassifyParamsService productsClassifyParamsService = SpringApplicationContextHolder.getBean("productsClassifyParamsService");
		productsClassifyParamsService.saveProductsClassifyParams();
	}

}
