/**
 * @Company 青鸟软通   
 * @Title: PrototypeSelectClientImplTest.java 
 * @Package com.haier.isales.prototype.service.impl 
 * @author John.zhao   
 * @date 2014-12-25 下午8:06:17 
 * @version V1.0   
 */
package com.haier.isales.prototype.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.common.DubboResult;
import com.haier.isales.prototype.domain.PrototypeDomain;
import com.haier.isales.prototype.dto.PrototypeListParamDTO;
import com.haier.isales.prototype.service.PrototypeSelectClient;
import com.haier.isales.test.BaseIsalesClientTestCase;

/**
 * @ClassName: PrototypeSelectClientImplTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring/products/spring-productsImgApp.xml",
		"classpath*:/spring/products/spring-productsInfoApp.xml",
		"classpath*:/spring/basicinfo/spring-proModel.xml",
		"classpath*:/spring/prototype/spring-prototype.xml",
		"classpath*:/spring_service/prototype/spring-prototype-select-provider.xml",
		"classpath*:/spring_ws/hmms/spring-sampleWebService.xml"
})
//@Ignore
public class PrototypeSelectClientImplTest extends BaseIsalesClientTestCase {
	@Resource
	private PrototypeSelectClient prototypeSelectClient;

	@Test
	@Ignore
	public void testGetPrototypePagerListLike() {
		PrototypeListParamDTO prototypeListDTO = new PrototypeListParamDTO();
//		prototypeListDTO.setYearMonth("2014-01");
//		prototypeListDTO.setProductModelName("BCD 241TMBA");
//		prototypeListDTO.setProductLineNo("102");
//		prototypeListDTO.setShopId("8800019222");
		DubboResult page = (DubboResult) prototypeSelectClient.getPrototypePagerListLike(prototypeListDTO, 0, 10);
		System.out.println(page);
	}
	
	@Test
    public void testgetPrototypePagerListByDataPeriod(){
        
        PrototypeListParamDTO prototypeListParamDTO=new PrototypeListParamDTO();
//        prototypeListParamDTO.setShopId("8800019401");
//        prototypeListParamDTO.setProductLineNo("106");
//        prototypeListParamDTO.setProductModelName("BCD-356WACV");
//        prototypeListParamDTO.setProductModelCode("B70TK0080");
//        prototypeListParamDTO.setProductLineNo("106");
//      prototypeListParamDTO.setProductModelName("BCD-268WBCS");
//        prototypeListParamDTO.setYjstate("在柜");
        String startDate="";
        String endDate="";
        DubboResult dd=(DubboResult) prototypeSelectClient.getPrototypePagerListByDataPeriod(prototypeListParamDTO, startDate, endDate, 0, 10);
        
        System.out.println(dd.getResultBean());
    }
}
