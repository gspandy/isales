/**
* @Company 青鸟软通   
* @Title: QuotientClient.java 
* @Package com.haier.isales.performance.quotient.service 
* @author John.zhao   
* @date 2014-12-18 下午12:58:38 
* @version V1.0   
*/ 
package com.haier.isales.performance.quotient.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.performance.quotient.dto.QuotientDTO;

/** 
 * @ClassName: QuotientClient 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public interface QuotientSelectClient {
	
	
	/** 
	* @Description: 份额达成dubbo接口
	* @author John.zhao   
	* @date 2014-12-19 上午9:33:32 
	* @param quotientDTO
	* @return  
	*/ 
	@Export(paramNames={"quotientDTO"})
	public Object searchQuotientAccomplish(QuotientDTO quotientDTO);
	
	/** 
	* @Description: 份额走势图
	* @author John.zhao   
	* @date 2014-12-19 下午12:34:01 
	* @param quotientDTO
	* @return  
	*/ 
	@Export(paramNames={"quotientDTO"})
	public Object getQuotientCharts(QuotientDTO quotientDTO);

}
