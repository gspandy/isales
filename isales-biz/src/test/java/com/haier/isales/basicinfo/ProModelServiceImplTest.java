package com.haier.isales.basicinfo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;
import org.junit.Before;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import com.haier.isales.basicinfo.promodel.domain.ProModelDomain;

@Transactional
public class ProModelServiceImplTest extends BaseBasicInfoTestCase{
	@Before
	public void init(){
		executeSqlScript("classpath:/com/haier/isales/basicinfo/ProModelServiceImplTest.sql", true);
	}
	@Test
	public void testFindProModelInfoByBarCode() {
		ProModelDomain proModelDomain = proModelService.findProModelInfoByBarCode("testproCode");
		assertThat(proModelDomain,notNullValue());
	}
	@Test
	public void testFindProModelLikePrdn() {
		List<ProModelDomain> proModelList = proModelService.findProModelLikePrdn("bcd 198 a");
		assertThat(proModelList,notNullValue());
	}
	@Test
	public void testFindModelPagerLikePrdn() {
		PageResult<ProModelDomain> proModelList = proModelService.findModelPagerLikePrdn("1115",new PageCond(1,10));
		assertThat(proModelList,notNullValue());
	}
	@Test
	public void testFindById(){
		ProModelDomain pd = proModelService.findById("testProCo");
		assertThat(pd,notNullValue());
	}


}
