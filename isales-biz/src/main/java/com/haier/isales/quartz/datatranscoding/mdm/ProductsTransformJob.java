/**
 * @Company 青鸟软通   
 * @Title: ProductsTransformJob.java 
 * @Package com.haier.isales.quartz.datatranscoding.mdm 
 * @author GuoYuchao  
 * @date 2015-1-21 16:58:10
 * @version V1.0   
 */
package com.haier.isales.quartz.datatranscoding.mdm;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: ProductsTransformJob
 * @Description: MDM销售样表同步转换
 * 
 */
public class ProductsTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(ProductsTransformJob.class);

	/**
	 * @Fields productsTransform : MDM销售样表同步转换
	 */
	private SimpleTransform productsTransform;

	/**
	 * <p>
	 * Description:MDM销售样表同步转换
	 * </p>
	 * 
	 * @author GuoYuchao
	 * @date 2015-1-21 16:59:58
	 * @param context
	 * @throws JobExecutionException
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行MDM销售样表同步转换开始！");
		productsTransform = SpringApplicationContextHolder.getBean("productsTransform");
		try {
			productsTransform.execute();
			LOG.info("执行MDM销售样表同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行MDM销售样表同步转换失败！",new Throwable(e));
		}
	}

	public void setProductsTransform(SimpleTransform productsTransform) {
		this.productsTransform = productsTransform;
	}





}
