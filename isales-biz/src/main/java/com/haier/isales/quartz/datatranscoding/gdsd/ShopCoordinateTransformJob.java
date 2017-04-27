/**
 * @Company 青鸟软通   
 * @Title: ShopCoordinateTransformJob.java 
 * @Package com.haier.isales.quartz.datatranscoding 
 * @author GuoYuchao   
 * @date 2015-1-30 14:12:26 
 * @version V1.0   
 */
package com.haier.isales.quartz.datatranscoding.gdsd;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: ShopCoordinateTransformJob
 * @Description: 门店经纬度同步转换
 * 
 */
public class ShopCoordinateTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(ShopCoordinateTransformJob.class);

	/**
	 * @Fields ShopCoordinateTransformJob : 门店经纬度同步转换
	 */
	private SimpleTransform shopCoordinateTransform;

	
	/**
	* <p>Description:GDSD 电子地图系统 门店经纬度基础数据 </p> 
	* @author Guo Yuchao   
	* @date 2015-1-30 下午2:10:26 
	* @param context
	* @throws JobExecutionException 
	* @see org.quartz.Job#execute(org.quartz.JobExecutionContext) 
	*/ 
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行门店经纬度同步转换开始！");
		shopCoordinateTransform = SpringApplicationContextHolder.getBean("shopCoordinateTransform");
		try {
			shopCoordinateTransform.execute();
			LOG.info("执行门店经纬度同步转换同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行门店经纬度同步转换失败！",new Throwable(e));
		}
	}


	public void setShopCoordinateTransform(SimpleTransform shopCoordinateTransform) {
		this.shopCoordinateTransform = shopCoordinateTransform;
	}

}
