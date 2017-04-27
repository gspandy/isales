/**
 * @Company 青鸟软通   
 * @Title: CardSetRateTransformJob.java 
 * @Package com.haier.isales.quartz.datatranscoding 
 * @author GuoYuchao  
 * @date 2014年12月15日14:38:22
 * @version V1.0   
 */
package com.haier.isales.quartz.datatranscoding.zzjyt;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: CardSetRateTransformJob
 * @Description: 权益卡套餐率
 * 
 */
public class CardSetRateTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(CardSetRateTransformJob.class);

	/**
	 * @Fields cardSetRateTransform : 权益卡套餐率信息同步转换
	 */
	private SimpleTransform cardSetRateTransform;

	/**
	 * <p>
	 * Description: 执行权益卡套餐率信息同步转换
	 * </p>
	 * 
	 * @author GuoYuchao
	 * @date 2014-12-15 14:39:27
	 * @param context
	 * @throws JobExecutionException
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行权益卡套餐率信息同步转换开始！");
		cardSetRateTransform = SpringApplicationContextHolder.getBean("cardSetRateTransform");
		try {
			cardSetRateTransform.execute();
			LOG.info("执行权益卡套餐率信息同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行权益卡套餐率信息同步转换失败！",new Throwable(e));
		}
	}

	/**
	 * @Description: 属性 cardSetRateTransform 的set方法 
	 * @param cardSetRateTransform 
	 */
	public void setCardSetRateTransform(SimpleTransform cardSetRateTransform) {
		this.cardSetRateTransform = cardSetRateTransform;
	}

}
