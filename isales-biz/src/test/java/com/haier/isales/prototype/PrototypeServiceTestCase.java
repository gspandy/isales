/**
* @Company 青鸟软通   
* @Title: PrototypeServiceTestCase.java 
* @Package com.haier.isales.performance 
* @author Guo Yuchao   
* @date 2014-12-18 下午2:07:31 
* @version V1.0   
*/ 
package com.haier.isales.prototype;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.prototype.domain.PrototypeAttachmentDomain;
import com.haier.isales.prototype.domain.PrototypeDomain;
import com.haier.isales.prototype.dto.PrototypeDTO;
import com.haier.isales.prototype.service.PrototypeService;

/** 
 * @ClassName: PrototypeServiceTestCase 
 * @Description: 样机管理相关
 *  
 */
@ContextConfiguration(locations={
		"classpath*:/spring/prototype/spring-prototype.xml",
		"classpath*:/spring/basicinfo/spring-proModel.xml",
		"classpath*:/spring_ws/hmms/spring-sampleWebService.xml"
})
@Ignore
public class PrototypeServiceTestCase extends BaseIsalesTestCase {
	
	@Resource
	private PrototypeService prototypeService;
	@Before
	public void init(){
		executeSqlScript("classpath:/com/haier/isales/prototype/ProtoTypeServiceImplTest.sql", true);
	}
	@Test
	public void testSavePrototypePurchase(){
		PrototypeDTO prototypeDTO = new PrototypeDTO();
//		prototypeDTO.setTradeOrgCode("12802"); 
//		prototypeDTO.setProductSortNo("AA");
//		prototypeDTO.setStationName("济南中心三联国美经营体");
//		prototypeDTO.setShopId("8700096323");
//		prototypeDTO.setBarcode("BA09Z10A000QEC8TUG3M"); 
//		prototypeDTO.setProductModelCode("BK00L0098"); 
//		prototypeDTO.setProductModelName("BCD-215TS"); 
//		prototypeDTO.setSalePrice(BigDecimal.valueOf(1234.12));
//		prototypeDTO.setUserCode("Z0188786");
//		prototypeDTO.setIsDownReason("样机上样测试");
//		prototypeDTO.setShareImages("1,2");
		String result = prototypeService.savePrototypePurchase(prototypeDTO);
		testFindByParams();
		MatcherAssert.assertThat(result, Matchers.notNullValue());
	}
	@Test
	public void testSavePrototypeAuditOut(){
		PrototypeDTO prototypeDTO = new PrototypeDTO();
		prototypeDTO.setId(1l);
//		prototypeDTO.setProductSortNo("AA");
//		prototypeDTO.setTradeOrgCode("12802"); 
//		prototypeDTO.setStationName("济南中心三联国美经营体");
//		prototypeDTO.setShopId("8790026323");
//		prototypeDTO.setBarcode("CB00G0B0G00CW7AF0274"); 
//		prototypeDTO.setProductModelCode("BK00L0098"); 
//		prototypeDTO.setProductModelName("BCD-215TS"); 
		prototypeDTO.setSalePrice(BigDecimal.valueOf(1234.12));
		prototypeDTO.setUserCode("Z0188786");
		String result = prototypeService.savePrototypeAuditOut(prototypeDTO);
		PrototypeDomain prototypeDomain = prototypeService.findById(1l);
		MatcherAssert.assertThat(result, Matchers.notNullValue());
		MatcherAssert.assertThat(prototypeDomain, Matchers.notNullValue());
	}
	@Test
	public void testFindByParams(){
		PrototypeAttachmentDomain prototypeAttachmentDomain = new PrototypeAttachmentDomain();
//		prototypeAttachmentDomain.setBarcode("BA09Z10A000QEC8TUG3M");
//		prototypeAttachmentDomain.setAttachmentId(1L);
		List<PrototypeAttachmentDomain> imageList = prototypeService.findPrototypeAttachmentByParams(prototypeAttachmentDomain);
		MatcherAssert.assertThat(imageList, Matchers.notNullValue());
		
	}
}
