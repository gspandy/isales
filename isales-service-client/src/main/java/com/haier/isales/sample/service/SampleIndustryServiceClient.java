/**
* @Company 青鸟软通   
* @Title: SampleServiceClient.java 
* @Package com.haier.isales.sample.service 
* @author lizhenwei
* @date 2015-11-11 下午02:30:51 
* @version V1.0   
*/ 
package com.haier.isales.sample.service;

import com.haier.isales.sample.dto.SampleIndustryDTO;


/** 
 * @ClassName: SampleIndustryServiceClient 
 * @Description: 样机相关产业查询
 *  
 */
public interface SampleIndustryServiceClient {
	
	/** 
	* @Description:根据I营销产业编码查询样机系统产业编码及产业名称
	* @author lizhenwei
	* @date 2015-12-23 上午6:47:38 
	* @param sampleIndustryDTO
	* @return  
	*/ 
	Object findIndustryByProduct(String productId);
}
