/**
 * @Company 青鸟软通   
 * @Title: AppLoginServiceImpl.java 
 * @Package com.haier.isales.statistics.applogin.service.impl 
 * @author John.zhao   
 * @date 2014-12-4 下午4:36:13 
 * @version V1.0   
 */
package com.haier.isales.statistics.applogin.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.haier.isales.statistics.applogin.dao.AppLoginDao;
import com.haier.isales.statistics.applogin.domain.AppLoginDomain;
import com.haier.isales.statistics.applogin.service.AppLoginService;
import com.haier.isales.statistics.emailreceive.domain.RecipientDomain;
import com.haier.isales.statistics.emailreceive.service.RecipientService;
import com.haier.openplatform.hmc.domain.Email;
import com.haier.openplatform.hmc.domain.Recipient;
import com.haier.openplatform.hmc.sender.email.DefaultEmailBuilder;
import com.haier.openplatform.hmc.sender.email.SendEmailService;

/**
 * @ClassName: AppLoginServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author John.zhao
 */
public class AppLoginServiceImpl implements AppLoginService {

	private AppLoginDao appLoginDao;
	
//	private HttpMailSender httpMailSender;
	private RecipientService recipientService;
//	private String mailVelocityPath = "/email/isales/appLoginEmailTemplate.vm";
	private SendEmailService emailSender;
	private DefaultEmailBuilder emailBuilder;
	// ===============================================================
	@Override
	public List<AppLoginDomain> getAppLoginByTime(AppLoginDomain appLoginDomain) {
		return appLoginDao.getAppLoginByTime(appLoginDomain);
	}
	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2014-12-5 下午7:46:49  
	* @see com.haier.isales.statistics.applogin.service.AppLoginService#sendAppLoginEmail() 
	*/ 
	/*@Override
	public void sendAppLoginEmail() throws EmailException {
		httpMailSender = new HttpMailSender();
		httpMailSender.setPropertyConfigPath("email/email.properties");
		AppLoginDomain appLoginDomain = new AppLoginDomain();
		int y,m,d;   
		Calendar cal=Calendar.getInstance();    
		y=cal.get(Calendar.YEAR);    
		m=cal.get(Calendar.MONTH)+1;    
		d=cal.get(Calendar.DATE);
		String startTime = y+"-"+m+"-"+(d-1) +" 00:00:00";
		String endTime = y+"-"+m+"-"+d+" 00:00:00";
		appLoginDomain.setStartTime(startTime);
		appLoginDomain.setEndTime(endTime);
		List<AppLoginDomain> list = getAppLoginByTime(appLoginDomain);
		//获取接收者邮箱
		List<RecipientDomain> receipList = recipientService.getAllRecipient();
		List<String> lis = new ArrayList<String>();
		
		for(RecipientDomain recipientDomain : receipList){
			lis.add(recipientDomain.getReceiverEmail());
		}
		String[] Toemail = lis.toArray(new String[lis.size()]);
		//
		HttpMailContent mailContent = new HttpMailContent();
		mailContent.setSubject("app登录情况统计");
		VelocityContext context = new VelocityContext();
		context.put("list", list);
		context.put("startTime", startTime);
		context.put("endTime", endTime);
		mailContent.setTemplate(mailVelocityPath, context);
		httpMailSender.addTo(Toemail);
		httpMailSender.send(mailContent);
	}*/
	@Override
	public void sendAppLoginEmail() {
		String templateId = "/appinstallandlogin/applogin";
		Email email = new Email();
		email.setSender(new Recipient("Admin@isales.haier.com", "Admin"));
		List<Recipient> toRecipient = new ArrayList<Recipient>();
		List<RecipientDomain> allRecipient = recipientService.getAllRecipient();
		for (RecipientDomain recipientDomain : allRecipient) {
			Recipient recipient = new Recipient();
			recipient.setEmailAddress(recipientDomain.getReceiverEmail());
			recipient.setUserName(recipientDomain.getReceiverName());
			toRecipient.add(recipient);
		}
		email.setToRecipient(toRecipient);
		Map<String, Object> parameters = new HashMap<String, Object>();
		AppLoginDomain appLoginDomain = new AppLoginDomain();
		int y,m,d;   
		Calendar cal=Calendar.getInstance();    
		y=cal.get(Calendar.YEAR);    
		m=cal.get(Calendar.MONTH)+1;    
		d=cal.get(Calendar.DATE);
		String startTime = y+"-"+m+"-"+(d-1) +" 00:00:00";
		String endTime = y+"-"+m+"-"+d+" 00:00:00";
		appLoginDomain.setStartTime(startTime);
		appLoginDomain.setEndTime(endTime);
		parameters.put("list",getAppLoginByTime(appLoginDomain));
		parameters.put("startTime", startTime);
		parameters.put("endTime", endTime);
		Email newEmail = emailBuilder.buildEmail(templateId, email, parameters);
		emailSender.sendEmail(newEmail);
	}
	// =============================================================//
	/**
	 * @Description: 属性 appLoginDao 的set方法
	 * @param appLoginDao
	 */
	public void setAppLoginDao(AppLoginDao appLoginDao) {
		this.appLoginDao = appLoginDao;
	}
	/**
	 * @Description: 属性 recipientService 的set方法 
	 * @param recipientService 
	 */
	public void setRecipientService(RecipientService recipientService) {
		this.recipientService = recipientService;
	}

	/**
	 * @Description: 属性 emailSender 的set方法 
	 * @param emailSender 
	 */
	public void setEmailSender(SendEmailService emailSender) {
		this.emailSender = emailSender;
	}

	/**
	 * @Description: 属性 emailBuilder 的set方法 
	 * @param emailBuilder 
	 */
	public void setEmailBuilder(DefaultEmailBuilder emailBuilder) {
		this.emailBuilder = emailBuilder;
	}


}
