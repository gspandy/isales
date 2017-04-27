/**
* @Company 青鸟软通   
* @Title: UserDetailClientImplTest.java 
* @Package com.haier.isales.salerinfo 
* @author Guo Yuchao   
* @date 2014-11-21 下午10:06:22 
* @version V1.0   
*/ 
package com.haier.isales.performance;


import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.common.DubboResult;
import com.haier.isales.performance.leaguer.dto.RegistDTO;
import com.haier.isales.performance.leaguer.service.CardSetRateSearchClient;
import com.haier.isales.test.BaseIsalesClientTestCase;

/** 
 * @ClassName: UserDetailClientImplTest 
 * @Description: 
 *  
 */
@ContextConfiguration(locations = {
		"classpath*:/spring/performance/leaguer/spring-cardSetRate.xml",
		"classpath*:/spring_service/performance/spring-cardSetRate-search-provider.xml"
		})
public class CardSetRateClientImplTest  extends BaseIsalesClientTestCase{
	@Resource
	private CardSetRateSearchClient cardSetRateSearchClient;
	@Test
	public void testFindRegistInfoByParam(){
		RegistDTO registDTO = new RegistDTO();
		registDTO.setMonth("2014/09/01 00:12:12");
//		registDTO.setProductLineId("101,102,103,104,105,106,107,108,109");
		registDTO.setShopId("8800109982");
		DubboResult dubboResult = (DubboResult) cardSetRateSearchClient.findCardSetRateByParam(registDTO);
		RegistDTO registInfo = dubboResult.getResultBean();
		MatcherAssert.assertThat(registInfo, Matchers.notNullValue());
	}

}
