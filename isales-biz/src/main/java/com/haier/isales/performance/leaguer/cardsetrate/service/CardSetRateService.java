/**
 * @Company 青鸟软通   
 * @Title: CardSetRateService.java 
 * @Package  com.haier.isales.performance.leaguer.cardsetrate.service
 * @author Guo Yuchao   
 * @date 2014年12月18日  10:38:02
 * @version V1.0   
 */
package com.haier.isales.performance.leaguer.cardsetrate.service;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.performance.leaguer.dto.RegistDTO;

/** 
 * @ClassName: CardSetRateService
 * @Description: CardSetRate的Service接口定义类
 *  
 */
public interface CardSetRateService {

	/** 
	* @Description: 查询套购率信息   根据     门店id、月份 （开始结束时间字符串yyyy-MM）、产品线   条件
	* @author Guo Yuchao   
	* @date 2014-12-22 下午4:47:46 
	* @param registDTO
	* @return
	* @throws BusinessException  
	*/ 
	RegistDTO findCardSetRateByParam(RegistDTO registDTO)
			throws BusinessException; 
}
