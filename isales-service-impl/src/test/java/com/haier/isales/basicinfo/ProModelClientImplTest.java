/**
* @Company 青鸟软通   
* @Title: ProModelClientImpl.java 
* @Package com.haier.isales.basicInfo.service.impl 
* @author Guo Yuchao   
* @date 2014-11-15 下午3:07:53 
* @version V1.0   
*/ 
package com.haier.isales.basicinfo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;

import javax.annotation.Resource;

import org.bana.common.util.page.PageResult;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.basicinfo.promodel.dto.ProModelDTO;
import com.haier.isales.basicinfo.promodel.service.ProModelClient;
import com.haier.isales.common.DubboResult;
import com.haier.isales.test.BaseIsalesClientTestCase;

/** 
 * @ClassName: ProModelClientImpl 
 * @Description: 产品型号相关测试 
 *  
 */
@ContextConfiguration(locations = {
		"classpath*:/spring/basicinfo/spring-*.xml",
		"classpath*:/spring_service/basicinfo/spring-*.xml"
		})
public class ProModelClientImplTest extends BaseIsalesClientTestCase {
	@Resource
	private ProModelClient proModelClient;
	@Before
	public void init(){
		executeSqlScript("classpath:/com/haier/isales/basicinfo/ProModelServiceImplTest.sql", true);
	}
	@Test
	public void testFindProModelInfoByBarCode() {
		DubboResult dubboResult = (DubboResult) proModelClient.findProModelInfoByBarCode("testProCode");
		ProModelDTO proModelDTO = dubboResult.getResultBean();
		assertThat(proModelDTO,notNullValue());
	}
	@Test
	public void testFindProModelLikePrdn() {
		DubboResult dubboResult = (DubboResult) proModelClient.findProModelLikePrdn("1115");
		List<ProModelDTO> dtoList = dubboResult.getResultBean();
		assertThat(dtoList,notNullValue());
	}
	@Test
	public void testFindModelPagerLikePrdn() {
		DubboResult dubboResult = (DubboResult) proModelClient.findModelPagerLikePrdn("111",1,10);
		PageResult<ProModelDTO> pageResult = dubboResult.getResultBean();
		assertThat(pageResult,notNullValue());
	}
}
