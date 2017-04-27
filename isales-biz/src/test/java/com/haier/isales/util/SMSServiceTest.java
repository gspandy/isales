/**
* @Company 青鸟软通   
* @Title: SMSServiceTest.java 
* @Package com.haier.isales.util 
* @author Liu Wenjie   
* @date 2014-11-7 下午3:22:07 
* @version V1.0   
*/ 
package com.haier.isales.util;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.haier.openplatform.console.info.spi.SendSmsServiceClient;
import com.haier.openplatform.hmc.domain.SMS;
import com.haier.openplatform.hmc.domain.SMSMessage;
import com.haier.openplatform.hmc.sender.SendMsgService;

/** 
 * @ClassName: SMSServiceTest 
 * @Description: 测试短信发送的方法
 *  
 */
@ContextConfiguration(locations={
		"classpath*:/hmc/hornetq/hmc-jms-hornetq.xml",
		"classpath*:/console/audit/console-audit.xml",
		"classpath*:/console/jms/console-jms-consumer.xml",
		"classpath*:/console/jms/console-jms-provider.xml",
		"classpath*:/spring/sendmobile/spring-test-sendmessage.xml",
		"classpath*:/spring/spring-common.xml",
		"classpath*:/spring/spring-datasource.xml",
		"classpath*:/spring/spring-external.xml",
		"classpath*:/spring/spring-dubbo.xml",
		"classpath*:/spring/spring-transaction.xml",
		"classpath*:/spring/cache/spring-cache-test.xml",
		"classpath*:/spring/cache/spring-cache-security.xml"
		
})
@Ignore
public class SMSServiceTest extends AbstractJUnit4SpringContextTests{
	@Resource
	private SendMsgService smsSender;
	@Resource
	private SendSmsServiceClient sendSmsServiceClient;
//	@Resource
//	private TestDAO testDao;
	
	@Test
	public void testSendMobileMsgByDubbo(){
		
		SMSMessage smsMessage = new SMSMessage();
		
		smsMessage.setSenderName("海尔");//发送系统名称
		smsMessage.setSendTime("2014-12-24 18:40:00");//发送时间
		List<SMS> smsz = new ArrayList<SMS>();
		
		String mobileMessage = "测试短信，连续发送五条";
//		String[] mobileStr = new String[]{"13061202675","13105323006","18660225650","13165059276","13854203280"};
		String[] mobileStr = new String[]{"13165059276","18660225650","13854203280"};
		for (String mobile : mobileStr) {
			SMS smsOwner = new SMS();
			smsOwner.setMsgCode(String.valueOf(System.currentTimeMillis()));
			smsOwner.setDepartment("HOP"); //必须设置为HOP
			smsOwner.setMsgContent(mobileMessage); //短信内容
			smsOwner.setPhoneNum(mobile); //收件人手机号码
			smsz.add(smsOwner);
		}
		smsMessage.setSmsList(smsz);//需要发送的短信列表
		sendSmsServiceClient.sendSms(smsMessage);
	}
	
	@Test 
	public void testSendMsgSelf() { 

	SMSMessage smsMsg = new SMSMessage(); 
	smsMsg.setSenderName("海尔"); // 发信人 
	smsMsg.setSystem("i营销官方");
	//设置短信基本信息 
	List<SMS> smsz = new ArrayList<SMS>(); 

	String mobileMessage = "11111---i营销用户您好！海尔i营销移动APP使用海尔门户系统的用户名和密码进行登录。如果您忘记了密码，可以访问http://portal.haier.com,点击【忘记密码】重新设置一个密码即可。微信关注【i营销公众平台】,精彩活动即将展开。"; 
//		String[] mobileStr = new String[]{"13061202675","13105323006","18660225650","13165059276","13854203280"}; 
	String[] mobileStr = new String[]{"13854203280"}; 
	for (String mobile : mobileStr) { 
	SMS smsOwner = new SMS(); 
	smsOwner.setMsgCode(String.valueOf(System.currentTimeMillis())); 
	smsOwner.setDepartment("HOP"); //必须设置为HOP 
	smsOwner.setMsgContent(mobileMessage); //短信内容 
	smsOwner.setPhoneNum(mobile); //收件人手机号码 
	smsz.add(smsOwner); 
	}	
	smsMsg.setSmsList(smsz); 
	smsSender.sendMsg(smsMsg);	

	}
	
	
	@Test
	@Ignore
	public void testSengMobileMsg() throws InterruptedException{
		/*
		TestDomain queryDomain = new TestDomain();
		Integer currentPage = 1;
		Integer pageSize = 100;
		do{
			PageCond pageCond = new PageCond(currentPage,pageSize);
			pageCond = PageCondUtil.check(pageCond);
			pageCond.setFirstResult(PageCondUtil.calculateX(pageCond));//计算分页数据 第一条数据
			List<TestDomain> userList = testDao.findByParams(queryDomain, pageCond);
	//		System.out.println(findByParams.size());
			SMSMessage smsMsg = new SMSMessage();
			smsMsg.setSenderName("海尔"); // 发信人
			//设置短信基本信息
			List<SMS> smsz = new ArrayList<SMS>();
			
			String mobileMessage = "i营销用户您好！海尔i营销移动APP使用海尔门户系统的用户名和密码进行登录。如果您忘记了密码，可以访问http://portal.haier.com,点击【忘记密码】重新设置一个密码即可。微信关注【i营销公众平台】,精彩活动即将展开。";
	//		String[] mobileStr = new String[]{"13061202675","13105323006","18660225650","13165059276","13854203280"};
	//		for (String mobile : mobileStr) {
	//			SMS smsOwner = new SMS();
	//			smsOwner.setMsgCode(String.valueOf(System.currentTimeMillis()));
	//			smsOwner.setDepartment("HOP"); //必须设置为HOP
	//			smsOwner.setMsgContent(mobileMessage); //短信内容
	//			smsOwner.setPhoneNum(mobile); //收件人手机号码
	//			smsz.add(smsOwner);
	//		}
			
			for(TestDomain domain : userList){
				SMS smsOwner = new SMS();
				smsOwner.setMsgCode(String.valueOf(System.currentTimeMillis()));
				smsOwner.setDepartment("HOP"); //必须设置为HOP
				smsOwner.setMsgContent(mobileMessage); //短信内容
				smsOwner.setPhoneNum(domain.getMobile()); //收件人手机号码
				smsz.add(smsOwner);
			}
			smsMsg.setSmsList(smsz);
			smsSender.sendMsg(smsMsg);
			Thread.sleep(10000L);
			System.out.println(new Date() + "循环第"+currentPage+"次，共发送"+smsz.size()+"条");
			currentPage++;
		}while(currentPage<188);
		
		*/
	}

}
