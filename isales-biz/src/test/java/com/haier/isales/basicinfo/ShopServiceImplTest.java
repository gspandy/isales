package com.haier.isales.basicinfo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import com.haier.isales.basicinfo.shop.domain.ShopDomain;
@Transactional
public class ShopServiceImplTest extends BaseBasicInfoTestCase{
	@Before
	public void init(){
		executeSqlScript("classpath:/com/haier/isales/basicinfo/ShopServiceImplTest.sql", true);
	}
	@Test
	public void testFindById() {
		ShopDomain shopDomain = shopService.findById("test_shop_guo_001");
		assertThat(shopDomain,notNullValue());
	}
	

}
