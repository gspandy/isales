/**
* @Company 青鸟软通   
* @Title: CardSetRateSearchClient.java 
* @Package com.haier.isales.performance.leaguer.service 
* @author Guo Yuchao   
* @date 2014-12-18 下午3:57:28 
* @version V1.0   
*/ 
package com.haier.isales.performance.leaguer.service;

import com.haier.isales.performance.leaguer.dto.RegistDTO;

import io.terminus.pampas.client.Export;

/** 
 * @ClassName: CardSetRateSearchClient 
 * @Description: 业绩销量相关 
 *  
 */
public interface CardSetRateSearchClient {
	/** 
	* @Description: 查询套购率信息   根据     门店id、月份 （开始结束时间字符串yyyy-MM）、产品线   条件
	* @author Guo Yuchao   
	* @date 2014-12-18 下午4:00:19 
	* @param registDTO
	* @return  
	*/ 
	@Export(paramNames = {"registDTO"})
	Object findCardSetRateByParam(RegistDTO registDTO);

}
