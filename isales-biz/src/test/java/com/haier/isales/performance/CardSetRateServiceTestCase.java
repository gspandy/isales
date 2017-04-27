/**
* @Company 青鸟软通   
* @Title: RegistVerServiceTestCase.java 
* @Package com.haier.isales.performance 
* @author Guo Yuchao   
* @date 2014-12-18 下午2:07:31 
* @version V1.0   
*/ 
package com.haier.isales.performance;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.performance.leaguer.cardsetrate.service.CardSetRateService;
import com.haier.isales.performance.leaguer.dto.RegistDTO;

/** 
 * @ClassName: RegistVerServiceTestCase 
 * @Description: 会员注册率相关
 *  
 */
@ContextConfiguration(locations={
		"classpath*:/spring/performance/leaguer/spring-cardSetRate.xml"
})
public class CardSetRateServiceTestCase extends BaseIsalesTestCase {
	@Resource
	private CardSetRateService cardSetRateService;
	@Test
	public void testFindCardSetRateByParam(){
		RegistDTO registDTO = new RegistDTO();
		registDTO.setMonth("2014/09/01 00:12:12");
//		registDTO.setProductLineId("106");
		registDTO.setShopId("8800109982");
		RegistDTO registInfo = cardSetRateService.findCardSetRateByParam(registDTO);
		MatcherAssert.assertThat(registInfo, Matchers.notNullValue());
	}
}
