package com.haier.isales.prototype.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.prototype.domain.PrototypeDomain;
import com.haier.isales.prototype.dto.PrototypeListParamDTO;
import com.haier.isales.prototype.service.PrototypeService;
@ContextConfiguration(locations={
		
		"classpath*:/spring/prototype/spring-prototype.xml",
		"classpath*:/spring/basicinfo/spring-proModel.xml",
		"classpath*:/spring/products/spring-productsInfoApp.xml",
		"classpath*:/spring/products/spring-productsImgApp.xml"
})
public class PrototypeServiceImplTestCase extends BaseIsalesTestCase {
	
	@Resource
	private PrototypeService prototypeService;
	
	
	@Test
	@Ignore
	public void SearchPrototypePagerLikeListTest(){
		PrototypeListParamDTO prototypeListParamDTO=new PrototypeListParamDTO();
//		prototypeListParamDTO.setShopId("8800019401");
//		prototypeListParamDTO.setProductLineNo("106");
//		prototypeListParamDTO.setYearMonth("2010-08");
		PageCond pageCond=new PageCond(1, 10);
		PageResult<PrototypeDomain>  PrototypeDomainList=prototypeService.searchPrototypePagerLikeList(prototypeListParamDTO, pageCond);
		List<PrototypeDomain> list=PrototypeDomainList.getResultList();
		System.out.println(list.size());
	}
	
	@Test
	public void searchPrototypePagerLikeListByDataPeriodTest(){
		PrototypeListParamDTO prototypeListParamDTO=new PrototypeListParamDTO();
//		prototypeListParamDTO.setShopId("8800019401");
//		prototypeListParamDTO.setProductLineNo("106");
		String startDate="";
		String endDate="";
		PageCond pageCond=new PageCond(1, 10);
		PageResult<PrototypeDomain>  PrototypeDomainList=prototypeService.searchPrototypePagerLikeListByDataPeriod(prototypeListParamDTO, startDate, endDate, pageCond);
		List<PrototypeDomain> list=PrototypeDomainList.getResultList();
		System.out.println(list.size());
	}

}
