/**
 * @Company 青鸟软通   
 * @Title: AppInstallServiceImpl.java 
 * @Package com.haier.isales.statistics.appinstall.service.impl 
 * @author John.zhao   
 * @date 2014-12-4 下午12:46:50 
 * @version V1.0   
 */
package com.haier.isales.statistics.appinstall.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.statistics.appinstall.dao.AppInstallDao;
import com.haier.isales.statistics.appinstall.domain.AppInstall;
import com.haier.isales.statistics.appinstall.service.AppInstallService;
import com.haier.isales.statistics.emailreceive.domain.RecipientDomain;
import com.haier.isales.statistics.emailreceive.service.RecipientService;
import com.haier.openplatform.hmc.domain.Email;
import com.haier.openplatform.hmc.domain.Recipient;
import com.haier.openplatform.hmc.sender.email.DefaultEmailBuilder;
import com.haier.openplatform.hmc.sender.email.SendEmailService;

/**
 * @ClassName: AppInstallServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author John.zhao
 */
public class AppInstallServiceImpl implements AppInstallService {

	private static final Logger LOG = LoggerFactory.getLogger(AppInstallServiceImpl.class);

	private AppInstallDao appInstallDao;

/*	private HttpMailSender httpMailSender;
	private String mailVelocityPath = "/email/isales/appinstallmailTemplate.vm";*/
	private RecipientService recipientService;
	private SendEmailService emailSender;
	private DefaultEmailBuilder emailBuilder;

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2014-12-4 下午1:06:15
	 * @return
	 * @see com.haier.isales.statistics.appinstall.service.AppInstallService#searchAllAppInstall()
	 */
	@Override
	public List<AppInstall> searchAllAppInstall() {
		return appInstallDao.searchAllAppInstall();
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2014-12-4 下午1:29:33
	 * @see com.haier.isales.statistics.appinstall.service.AppInstallService#sendAppInstallEmail()
	 */
	/*@Override
	public void sendAppInstallEmail() throws EmailException {
		httpMailSender = new HttpMailSender();
		httpMailSender.setPropertyConfigPath("email/email.properties");
		List<AppInstall> list = searchAllAppInstall();
		// 获取接收者邮箱
		List<RecipientDomain> receipList = recipientService.getAllRecipient();
		List<String> lis = new ArrayList<String>();

		for (RecipientDomain recipientDomain : receipList) {
			lis.add(recipientDomain.getReceiverEmail());
		}
		String[] Toemail = lis.toArray(new String[lis.size()]);
		//
		HttpMailContent mailContent = new HttpMailContent();
		mailContent.setSubject("app安装并登录情况统计");
		VelocityContext context = new VelocityContext();
		context.put("list", list);
		mailContent.setTemplate(mailVelocityPath, context);
		httpMailSender.addTo(Toemail);
		httpMailSender.send(mailContent);
	}*/
	@Override
	public void sendAppInstallEmail() {
		LOG.info("发送app每日登录邮件service");
		String templateId = "/appinstallandlogin/appinstall";
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
		parameters.put("list", searchAllAppInstall());
		Email newEmail = emailBuilder.buildEmail(templateId, email, parameters);
		emailSender.sendEmail(newEmail);
	}

	// ===========================================================//
	/**
	 * @Description: 属性 appInstallDao 的set方法
	 * @param appInstallDao
	 */
	public void setAppInstallDao(AppInstallDao appInstallDao) {
		this.appInstallDao = appInstallDao;
	}

	/**
	 * @Description: 属性 httpMailSender 的set方法
	 * @param httpMailSender
	 */
//	public void setHttpMailSender(HttpMailSender httpMailSender) {
//		this.httpMailSender = httpMailSender;
//	}

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
