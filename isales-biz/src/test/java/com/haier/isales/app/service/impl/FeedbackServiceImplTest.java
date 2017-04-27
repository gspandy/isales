/**
* @Company 青鸟软通   
* @Title: FeedbackServiceImplTest.java 
* @Package com.haier.isales.app.service.impl 
* @author R.Core  
* @date 2015-3-3 下午1:29:35 
* @version V1.0   
*/ 
package com.haier.isales.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.bana.common.util.basic.DateUtil;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.app.dto.CreateBoData4Json;
import com.haier.isales.app.dto.FeedbackDTO;
import com.haier.isales.app.dto.IssueAppendDTO;
import com.haier.isales.app.dto.IssueDetailDTO;
import com.haier.isales.app.dto.IssueQueryDTO;
import com.haier.isales.app.service.FeedbackService;

/** 
 * @ClassName: FeedbackServiceImplTest 
 * @Description: 
 *  
 */
@ContextConfiguration(locations={
		"classpath*:/spring/app/spring-feedback.xml",
		"classpath*:/spring_ws/eai/spring-boService.xml",
		"classpath*:/spring_ws/eai/spring-issueSolverService.xml",
		"classpath*:/spring_ws/eai/spring-workflow.xml",
		"classpath*:/spring_ws/eai/spring-workflowtask.xml"
})
@Ignore
public class FeedbackServiceImplTest  extends BaseIsalesTestCase{
	@Resource
	private FeedbackService feedbackService;
	@Test
	public void testCreateFeedBackByWs(){
		FeedbackDTO feedbackDTO=new FeedbackDTO();
		CreateBoData4Json createBoData4Json = new CreateBoData4Json();
		createBoData4Json.setGm("12E01");
		createBoData4Json.setTbr("小郭");//	提报人	文本	单行	20
		createBoData4Json.setTbsj(DateUtil.getNowString("yyyy-MM-dd HH:mm:ss"))	;//提报时间	日期	日期时间	0
		createBoData4Json.setWtdlmc("产品");//	需求大类名称	文本	单行	50
		createBoData4Json.setWtxlmc("能效标识");//	需求小类名称	文本	单行	50
		createBoData4Json.setWtbt("直销员APP项目，问题反馈")	;//需求标题	文本	单行	100
		createBoData4Json.setWtsm("直销员APP项目，问题说明")	;//需求内容	文本	多行	2000
		createBoData4Json.setCpz("冰箱");
		createBoData4Json.setBu("WGG大");
		createBoData4Json.setJc("1")	;//级次	数值	数值	2
		createBoData4Json.setTbrbh("A0003142");//提报人编号	文本	单行	10
		createBoData4Json.setXsqd("苏宁");//	渠道	文本	列表	20	
		createBoData4Json.setHtype("任务协同");//	平台类型	文本	单行	50	
		createBoData4Json.setCldz("问题提问");//	平台类型	文本	单行	50	
		createBoData4Json.setMd("8700008990");//	门店	文本	单行	200	
		feedbackDTO.setHandlerCode("A0003142");
		Object obj = feedbackService.createFeedBackByWs(feedbackDTO,createBoData4Json);
		
		MatcherAssert.assertThat(obj, Matchers.notNullValue());
	}
	@Test
	public void testFindIssueList() {
		List<IssueQueryDTO> issueList = feedbackService.findIssueListByTbr("A0003142");
		MatcherAssert.assertThat(issueList, Matchers.notNullValue());
	}
	@Test
	public void testFindIssueDetail() {
		List<IssueDetailDTO> issueDetailList = feedbackService.findIssueDetail(3786495);
		MatcherAssert.assertThat(issueDetailList, Matchers.notNullValue());
	}
	@Test
	public void testUpdate2CloseBpmProgress() {
		IssueQueryDTO issueQueryDTO = new IssueQueryDTO();
		issueQueryDTO.setBindId("3786495");
		issueQueryDTO.setTaskId("3978219");
		issueQueryDTO.setTbrbh("A0003142");
		String closeResult = feedbackService.update2CloseBpmProgress(issueQueryDTO);
		MatcherAssert.assertThat(closeResult, Matchers.notNullValue());
	}
	@Test
	public void testAddIssueAsking() {
		IssueQueryDTO issueQueryDTO = new IssueQueryDTO();
		issueQueryDTO.setBindId("3787702");
		issueQueryDTO.setTbrbh("A0003142");
		IssueAppendDTO issueAppendDTO = new IssueAppendDTO();
		issueAppendDTO.setClr("xiaoguo");
		issueAppendDTO.setClrbh("A0003142");
		issueAppendDTO.setJdnr("test zhuiwen2");
		String appendResult = feedbackService.addIssueAsking(issueQueryDTO,issueAppendDTO);
		MatcherAssert.assertThat(appendResult, Matchers.notNullValue());
	}

}
