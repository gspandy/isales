/**
 * @Company： 青鸟软通   
 * @Title: InternalStaffServiceImplTest.java 
 * @Description：描述 
 * @Author： ZS   
 * @Date： 2014-03-01 13:08:50 
 * @Version： V1.0  
 * @Modify：          
 */
package com.haier.isales.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.haier.isales.reminder.module.ReminderResult;
import com.haier.openplatform.mobile.push.dto.PushMessageDTO;
import com.haier.openplatform.mobile.push.service.PushServiceClient;

/** 
 * @ClassName: PushServiceClientTest 
 * @Description: 测试推送消息接口 
 */
@ContextConfiguration(locations={
		"classpath*:/spring/spring-dubbo.xml",
		"classpath*:/spring/spring-external.xml"
})
public class PushServiceClientTest extends AbstractJUnit4SpringContextTests{
	//用于APP推送待办提醒的服务
	@Resource
	private PushServiceClient pushServiceClient;

	@Test
	public void push() {
		final int PUSH_ALIVE_SEC = 1000*60*60*24;
		//手机APP的名称
		final String APP_NAME = "ISALES";	//移动海尔推送的appname
//		final String APP_NAME = "ISALES";	//i营销推送的appname
		//推送类型
		final String PUSH_TYPE = "MQTT";// MQTT 安卓；APNS ios
		//信息内容
		final String TYPE_CODE = "COM";
		PushMessageDTO push = new PushMessageDTO();
		//手机APP的名称
		push.setAppName(APP_NAME);//ISALES
		//推送存活截止的时间
		String atime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()+PUSH_ALIVE_SEC));
		push.setAliveTime(atime);
		//推送类型 apns:IOS推送，mqtt:MQTT推送
		push.setPushType(PUSH_TYPE);//MQTT
		//消息内容 ADV,COM,EMG
		push.setTypeCode(TYPE_CODE);//COM 一般消息 EMG：  ADV：广告，数量限制  EMG：数量限制
		
		//数组json格式：['zhangsan','lisi']
		push.setUsers("['testUser']");//移动海尔推送 使用用户工号/登录名
//		push.setUsers("['155']");//i营销推送 使用用户id(用户表的operator_id字段)
		
		//推送人
		push.setPusher("Z0009294");//
		push.setUserGroup("");//可以定义群组
		//扩展字段
//		push.setExtendField("{\"url\":\"http://qy.weixin.qq.com/cgi-bin/show?agentuin=1038001911&msgid=4458184260930502663&offset=0\"}");
		// 调用APP推送接口
//		for (int i = 0; i < 5; i++) {
//			push.setNoticebarTitle("测试通知" + i);
//			push.setContent("推送信息" + i);
//			String rst = pushServiceClient.sendMessageByApp(push);
//			//String rst = pushServiceClient.sendMessageByAppUsers(push);
//			System.out.println(rst);
//		}
//		push.setNoticebarTitle("测试通知");
//		push.setContent("推送信息");
		push.setNoticebarTitle("测试通知");
		push.setContent("净收入报表有更新，请查看");
		//扩展字段
//		push.setExtendField("{\"url\":\"http://qy.weixin.qq.com/cgi-bin/show?agentuin=1038001911&msgid=4458184260930502663&offset=0\"}");
//		push.setExtendField("净收入报表测试");
//		push.setExtendField("{\"pushApnsNow\"':\"1\",\"alert\":\"123\"}");
		push.setExtendField("{\"pushApnsNow\"':\"1\",\"alert\":\"123\"}");

		
		String rst = pushServiceClient.sendMessageByAppUsers(push);
		System.out.println(rst);
		
	}		
	
	@Test
	public void testResult(){
		String result = "{\"data\":['admin','adb'],\"success\":true}";
		JSONObject jsonObject = JSONObject.fromObject(result);
		ReminderResult bean = (ReminderResult)JSONObject.toBean(jsonObject,ReminderResult.class);
		System.out.println(bean.getData());
		System.out.println(bean.isSuccess());
	}
}
