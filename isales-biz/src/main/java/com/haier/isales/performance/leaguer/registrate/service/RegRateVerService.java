/**
 * @Company 青鸟软通   
 * @Title: RegRateVerService.java 
 * @Package  com.haier.isales.performance.leaguer.registrate.service
 * @author Guo Yuchao   
 * @date 2014年12月18日  10:15:17
 * @version V1.0   
 */
package com.haier.isales.performance.leaguer.registrate.service;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.performance.leaguer.dto.RegistChartDTO;
import com.haier.isales.performance.leaguer.dto.RegistDTO;

/** 
 * @ClassName: RegRateVerService
 * @Description: RegRateVer的Service接口定义类
 *  
 */
public interface RegRateVerService {
	/** 
	* @Description:根据     门店id、月份 、产品线   条件查询注册率
	* @author Guo Yuchao   
	* @date 2014-12-18 下午1:38:35 
	* @param registDTO
	* @return
	* @throws BusinessException  
	*/ 
	RegistDTO findRegistInfoByParam(RegistDTO registDTO) throws BusinessException;

	/** 
	* @Description: 返回从现在往前12月的注册率信息
	* @author Guo Yuchao   
	* @date 2014-12-19 下午1:49:04 
	* @param registDTO
	* @return  
	*/ 
	RegistChartDTO findRegistChartByParam(RegistDTO registDTO);
		
}
