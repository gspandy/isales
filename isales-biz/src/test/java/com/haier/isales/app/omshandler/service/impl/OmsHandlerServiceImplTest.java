/**
* @Company 青鸟软通   
* @Title: OmsHandlerServiceImplTest.java 
* @Package com.haier.isales.app.omshandler.service.impl 
* @author Guo Yuchao   
* @date 2015-2-5 下午9:47:32 
* @version V1.0   
*/ 
package com.haier.isales.app.omshandler.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.app.dto.BpmIssueSearchDTO;
import com.haier.isales.app.dto.OmsHandlerDTO;
import com.haier.isales.app.omshandler.service.OmsHandlerService;

/** 
 * @ClassName: OmsHandlerServiceImplTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
@ContextConfiguration(locations={
		"classpath*:/spring/app/spring-omsHandler.xml",
		"classpath*:/spring_ws/eai/spring-issueSolverService.xml"
})
//@Ignore
public class OmsHandlerServiceImplTest extends BaseIsalesTestCase{
	@Resource
	private OmsHandlerService omsHandlerService;
	@Test
	public void testSaveOmsHandlerTemp() {
		omsHandlerService.saveOmsHandlerTemp();
	}
	@Test
	public void testFindBpmIssueHandlerLocal() {
		BpmIssueSearchDTO bpmIssueSearchDTO = new BpmIssueSearchDTO();
		bpmIssueSearchDTO.setOrgCode("12A02");
		bpmIssueSearchDTO.setShopCode("8800136081");
		List<OmsHandlerDTO> issueHandlerList = omsHandlerService.findBpmIssueHandlerLocal(bpmIssueSearchDTO);
		MatcherAssert.assertThat(issueHandlerList, Matchers.notNullValue());
	}

}
