/**
* @Company 青鸟软通   
* @Title: RegRateVerClientImpl.java 
* @Package com.haier.isales.performance.service.impl 
* @author Guo Yuchao   
* @date 2014-12-18 下午4:03:08 
* @version V1.0   
*/ 
package com.haier.isales.performance.service.impl;

import com.haier.isales.performance.leaguer.dto.RegistChartDTO;
import com.haier.isales.performance.leaguer.dto.RegistDTO;
import com.haier.isales.performance.leaguer.registrate.service.RegRateVerService;
import com.haier.isales.performance.leaguer.service.RegRateVerSearchClient;

/** 
 * @ClassName: RegRateVerClientImpl 
 * @Description:会员注册率相关 
 *  
 */
public class RegRateVerClientImpl implements RegRateVerSearchClient {
	private RegRateVerService regRateVerService;
	/**
	 * <p>Description: 根据     门店id、月份 、产品线   条件查询注册率</p> 
	 * @author Guo Yuchao   
	 * @date 2014-12-18 下午4:03:09 
	 * @param registDTO
	 * @return 
	 * @see com.haier.isales.performance.leaguer.service.RegRateVerSearchClient#findRegistInfoByParam(com.haier.isales.performance.leaguer.dto.RegistDTO) 
	 */
	@Override
	public RegistDTO findRegistInfoByParam(RegistDTO registDTO) {
		return getRegRateVerService().findRegistInfoByParam(registDTO);
	}
	
	/**
	* <p>Description:返回从现在往前12月的注册率信息 </p> 
	* @author Guo Yuchao   
	* @date 2014-12-19 下午1:47:36 
	* @param registDTO
	* @return 
	* @see com.haier.isales.performance.leaguer.service.RegRateVerSearchClient#findRegistChartByParam(com.haier.isales.performance.leaguer.dto.RegistDTO) 
	*/ 
	@Override
	public RegistChartDTO findRegistChartByParam(RegistDTO registDTO) {
		return regRateVerService.findRegistChartByParam(registDTO);
	}
	
	
	
	
	
	
	/**
	 * @Description: 属性 regRateVerService 的get方法 
	 * @return regRateVerService
	 */
	public RegRateVerService getRegRateVerService() {
		return regRateVerService;
	}
	/**
	 * @Description: 属性 regRateVerService 的set方法 
	 * @param regRateVerService 
	 */
	public void setRegRateVerService(RegRateVerService regRateVerService) {
		this.regRateVerService = regRateVerService;
	}


}
