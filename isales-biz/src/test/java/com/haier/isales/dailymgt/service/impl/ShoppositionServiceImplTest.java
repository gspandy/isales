/**
 * @Company 青鸟软通   
 * @Title: ShoppositionServiceImplTest.java 
 * @Package com.haier.isales.dailymgt.service.impl 
 * @author John.zhao   
 * @date 2015-3-5 上午9:36:27 
 * @version V1.0   
 */
package com.haier.isales.dailymgt.service.impl;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.dailymgt.dto.ShopPositionDTO;
import com.haier.isales.dailymgt.dto.ShopPositionParamDTO;
import com.haier.isales.dailymgt.shopposition.service.PositionService;

/**
 * @ClassName: ShoppositionServiceImplTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
@ContextConfiguration(locations = {
		"classpath*:/spring/dailymgt/spring-shopposition.xml",
		"classpath*:/spring/dailymgt/spring-shopErrorPosition.xml",
		"classpath*:/spring/system/spring-dictionary.xml"})
public class ShoppositionServiceImplTest extends BaseIsalesTestCase {
	@Resource
	private PositionService positionService;
	@Ignore
	@Test
	public void test(){
		ShopPositionParamDTO shopPositionParamDTO = new ShopPositionParamDTO();
		shopPositionParamDTO.setShopCode("8100021599");
		shopPositionParamDTO.setShopLatitude(30.7037620);
		shopPositionParamDTO.setShopLongitude(104.0654400);
		shopPositionParamDTO.setShopName("国美五块石");
		ShopPositionDTO shopPositionDTO = positionService.searchIfInShop(shopPositionParamDTO);
		MatcherAssert.assertThat(shopPositionDTO, Matchers.notNullValue());
	}
}
