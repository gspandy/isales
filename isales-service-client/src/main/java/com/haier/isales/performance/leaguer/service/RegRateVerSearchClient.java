/**
* @Company 青鸟软通   
* @Title: RegRateVerSearchClient.java 
* @Package com.haier.isales.performance.leaguer.service 
* @author Guo Yuchao   
* @date 2014-12-18 下午3:57:28 
* @version V1.0   
*/ 
package com.haier.isales.performance.leaguer.service;

import com.haier.isales.performance.leaguer.dto.RegistDTO;

import io.terminus.pampas.client.Export;

/** 
 * @ClassName: RegRateVerSearchClient 
 * @Description:  会员注册率相关 
 *  
 */
public interface RegRateVerSearchClient {
	/** 
	* @Description: 根据     门店id、月份 、产品线   条件查询注册率
	* @author Guo Yuchao   
	* @date 2014-12-18 下午4:00:19 
	* @param registDTO
	* @return  
	*/ 
	@Export(paramNames = {"registDTO"})
	Object findRegistInfoByParam(RegistDTO registDTO);

	/** 
	* @Description:  返回从现在往前12月的注册率信息
	* @author Guo Yuchao   
	* @date 2014-12-19 下午1:44:30 
	* @param registDTO
	* @return  
	*/ 
	@Export(paramNames = {"registDTO"})
	Object findRegistChartByParam(RegistDTO registDTO);
}
