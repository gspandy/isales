/**
* @Company 青鸟软通   
* @Title: MdmHandlerServiceImplTest.java 
* @Package com.haier.isales.app.mdmhandler.service.impl 
* @author Guo Yuchao   
* @date 2015-2-6 下午12:42:03 
* @version V1.0   
*/ 
package com.haier.isales.app.mdmhandler.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.annotation.NotTransactional;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.app.mdmhandler.domain.MdmHandlerDomain;
import com.haier.isales.app.mdmhandler.service.MdmHandlerService;

/** 
 * @ClassName: MdmHandlerServiceImplTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
@ContextConfiguration(locations={
		"classpath*:/spring/app/spring-mdmHandler.xml",
		"classpath*:/spring_ws/eai/spring-issueSolverService.xml"
})
//@Ignore
public class MdmHandlerServiceImplTest  extends BaseIsalesTestCase{
	@Resource
	private MdmHandlerService mdmHandlerService;
	@Test
	public void testFindMdmHandlerInBpm() {
		String tradeCode = "106";
		String shopId = "8800136081";
		List<MdmHandlerDomain> list = mdmHandlerService.findMdmHandlerInBpm(tradeCode, shopId);
		MatcherAssert.assertThat(list, Matchers.notNullValue());
	}
	@Test
	@NotTransactional
	public void testSaveMdmHandlerTemp() {
		mdmHandlerService.saveMdmHandlerTemp();
	}

}
