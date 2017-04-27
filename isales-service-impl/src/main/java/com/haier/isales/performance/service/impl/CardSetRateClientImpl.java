/**
* @Company 青鸟软通   
* @Title: CardSetRateClientImpl.java 
* @Package com.haier.isales.performance.service.impl 
* @author Guo Yuchao   
* @date 2014-12-18 下午4:03:08 
* @version V1.0   
*/ 
package com.haier.isales.performance.service.impl;

import com.haier.isales.performance.leaguer.cardsetrate.service.CardSetRateService;
import com.haier.isales.performance.leaguer.dto.RegistDTO;
import com.haier.isales.performance.leaguer.service.CardSetRateSearchClient;

/** 
 * @ClassName: CardSetRateClientImpl 
 * @Description:业绩销量相关 
 *  
 */
public class CardSetRateClientImpl implements CardSetRateSearchClient {
	private CardSetRateService cardSetRateService;
	/**
	 * <p>Description: 查询套购率信息   根据     门店id、月份 （开始结束时间字符串yyyy-MM）、产品线   条件</p> 
	 * @author Guo Yuchao   
	 * @date 2014-12-18 下午4:03:09 
	 * @param registDTO
	 * @return 
	 * @see com.haier.isales.performance.leaguer.service.RegRateVerSearchClient#findRegistInfoByParam(com.haier.isales.performance.leaguer.dto.RegistDTO) 
	 */
	@Override
	public RegistDTO findCardSetRateByParam(RegistDTO registDTO) {
		return cardSetRateService.findCardSetRateByParam(registDTO);
	}
	


	/**
	 * @Description: 属性 cardSetRateService 的get方法 
	 * @return cardSetRateService
	 */
	public CardSetRateService getCardSetRateService() {
		return cardSetRateService;
	}

	/**
	 * @Description: 属性 cardSetRateService 的set方法 
	 * @param cardSetRateService 
	 */
	public void setCardSetRateService(CardSetRateService cardSetRateService) {
		this.cardSetRateService = cardSetRateService;
	}
	
	
	
	
	
	



}
