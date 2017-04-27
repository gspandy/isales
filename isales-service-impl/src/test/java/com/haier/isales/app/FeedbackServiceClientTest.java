/**
* @Company 青鸟软通   
* @Title: FeedbackServiceTest.java 
* @Package com.haier.isales.app 
* @author John.zhao   
* @date 2014-12-12 下午2:50:23 
* @version V1.0   
*/ 
package com.haier.isales.app;

import javax.annotation.Resource;

import org.bana.common.util.basic.DateUtil;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.app.dto.CreateBoData4Json;
import com.haier.isales.app.dto.FeedbackDTO;
import com.haier.isales.app.service.FeedbackServiceClient;
import com.haier.isales.test.BaseIsalesClientTestCase;

/** 
 * @ClassName: FeedbackServiceTest 
 * @Description:  
 *  
 */
@ContextConfiguration(locations = {
		"classpath*:/spring/score/spring-*.xml",
		"classpath*:/spring/app/spring-feedback.xml",
		"classpath*:/spring/app/spring-bpmIssueType.xml",
		"classpath*:/spring_service/app/spring-feedback-update-provider.xml",
		"classpath*:/spring_ws/eai/spring-*.xml"
		})
@Ignore
public class FeedbackServiceClientTest extends BaseIsalesClientTestCase {
	@Resource
	protected FeedbackServiceClient feedbackUpdateClient;
	@Test
	public void testAddFeedback(){
		FeedbackDTO feedbackDTO=new FeedbackDTO();
		feedbackDTO.setOperatorId(1L);
		feedbackDTO.setUserCode("admin");
		feedbackDTO.setOperatorName("admin");
		feedbackDTO.setFeedbackContent("这个app做的怎么这么棒呢？");
		feedbackDTO.setContactInformation("我的联系方式是'就是不告诉你!'");
		feedbackUpdateClient.addFeedback(feedbackDTO);
	}
	@Test
	public void testCreateFeedBackByWs(){
		FeedbackDTO feedbackDTO=new FeedbackDTO();
		CreateBoData4Json createBoData4Json = new CreateBoData4Json();
		createBoData4Json.setGm("123");
		createBoData4Json.setTbr("小郭");//	提报人	文本	单行	20
		createBoData4Json.setTbsj(DateUtil.getNowString("yyyy-MM-dd HH:mm:ss"))	;//提报时间	日期	日期时间	0
		createBoData4Json.setWtdlmc("产品");//	需求大类名称	文本	单行	50
		createBoData4Json.setWtxlmc("能效标识");//	需求小类名称	文本	单行	50
		createBoData4Json.setWtbt("直销员APP项目，问题反馈")	;//需求标题	文本	单行	100
		createBoData4Json.setWtsm("直销员APP项目，问题说明")	;//需求内容	文本	多行	2000
		createBoData4Json.setCpz("12312");
		createBoData4Json.setBu("WGG大");
		createBoData4Json.setJc("1")	;//级次	数值	数值	2
		createBoData4Json.setTbrbh("A0003142");//提报人编号	文本	单行	10
		createBoData4Json.setXsqd("苏宁");//	渠道	文本	列表	20	
		createBoData4Json.setHtype("任务协同");//	平台类型	文本	单行	50	
		createBoData4Json.setCldz("问题提问");//	平台类型	文本	单行	50	
		createBoData4Json.setMd("sd");//	门店	文本	单行	200	
		feedbackDTO.setHandlerCode("A0003142");
		Object obj = feedbackUpdateClient.createFeedBackByWs(feedbackDTO,createBoData4Json);
		
		MatcherAssert.assertThat(obj, Matchers.notNullValue());
	}
}
