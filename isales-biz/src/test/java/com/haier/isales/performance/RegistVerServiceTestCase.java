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
import com.haier.isales.performance.leaguer.dto.RegistChartDTO;
import com.haier.isales.performance.leaguer.dto.RegistDTO;
import com.haier.isales.performance.leaguer.registrate.service.RegRateVerService;

/** 
 * @ClassName: RegistVerServiceTestCase 
 * @Description: 会员注册率相关
 *  
 */
@ContextConfiguration(locations={
		"classpath*:/spring/performance/leaguer/spring-*.xml"
})
public class RegistVerServiceTestCase extends BaseIsalesTestCase {
	@Resource
	private RegRateVerService regRateVerService;
	@Test
	public void testFindRegistInfoByParam(){
		RegistDTO registDTO = new RegistDTO();
		registDTO.setMonth("2014/05/01 00:12:12");
		registDTO.setProductLineId("101");
		registDTO.setShopId("8800162489");
		RegistDTO registInfo = regRateVerService.findRegistInfoByParam(registDTO);
		MatcherAssert.assertThat(registInfo, Matchers.notNullValue());
	}
	/** 
	* @Description: 
	* @author Guo Yuchao   
	* @date 2014-12-19 下午4:17:11   
	*/ 
	@Test
	public void testFindRegistChartByParam(){
		RegistDTO registDTO = new RegistDTO();
		registDTO.setMonth("2014-05-01 00:12:12");
		registDTO.setProductLineId("101,102,103,104,105,106");
		registDTO.setShopId("8800162489");
		RegistChartDTO registChart = regRateVerService.findRegistChartByParam(registDTO);
		MatcherAssert.assertThat(registChart, Matchers.notNullValue());
	}
}
