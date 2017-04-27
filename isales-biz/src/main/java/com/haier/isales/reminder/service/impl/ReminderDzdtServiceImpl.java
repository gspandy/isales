/**
 * @Company 青鸟软通   
 * @Title: ReminderDzdtService.java 
 * @Package  com.haier.isales.reminder.service.impl
 * @author Cao Rui   
 * @date 2015年06月15日  17:13:25
 * @version V1.0   
 */
package com.haier.isales.reminder.service.impl;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.reminder.DomainCloneUtil;
import com.haier.isales.reminder.dao.ReminderDzdtDAO;
import com.haier.isales.reminder.domain.ReminderDzdtDomain;
import com.haier.isales.reminder.dto.ReminderDzdtDTO;
import com.haier.isales.reminder.service.ReminderDzdtService;
import com.haier.isales.salerinfo.personalinfo.dao.PersonalInfoDAO;
import com.haier.isales.salerinfo.personalinfo.domain.PersonalEmpInfoDomain;
import com.haier.openplatform.mobile.push.dto.PushMessageDTO;
import com.haier.openplatform.mobile.push.service.PushServiceClient;

/** 
 * @ClassName: ReminderDzdtService
 * @Description: ReminderDzdt的Service接口定义类
 *  
 */
public class ReminderDzdtServiceImpl implements ReminderDzdtService{

	private static final Logger LOG = LoggerFactory.getLogger(ReminderDzdtServiceImpl.class);
	
	// 创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。
//	private ExecutorService pool = Executors.newCachedThreadPool();
		
	public static final String NEW_STATUS = "101";
	
	/** 
	* @Fields reminderDzdtDao : ReminderDzdtDao 工具依赖 
	*/
	private ReminderDzdtDAO reminderDzdtDao;
	private PersonalInfoDAO personalInfoDao;
	private PushServiceClient pushServiceClient;
	
	
	/*===============业务方法=============*/
	
	/**
	 * 电子地图向本系统推送提醒 
	* @Title: addNewInfo 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param saveDto  
	* @throws
	 */
	@Override
	public void addNewReminder(ReminderDzdtDTO saveDto){
		LOG.info("电子地图向本系统推送提醒   service方法");
		// 校验必需输入的字段,员工号、客户姓名、客户手机、意向产品、意向日期
		CheckParamUtil.checkFieldIfNotBlank(saveDto, "userCode","shopCode","result");
		
		ReminderDzdtDomain saveBean ;
		// 将传入的dto对象转为domain
		saveBean = DomainCloneUtil.cloneReminderDzdtDto2Domain(saveDto);
		//必要信息赋值
		saveBean.setCreateTime(new Date());
		saveBean.setStatus(NEW_STATUS);
		
		reminderDzdtDao.save(saveBean);
		LOG.info("电子地图向本系统推送提醒   service方法执行完成");
		
		//将信息推送给用户
		final int pushAliveSec = 1000*60*60*24;
		//手机APP的名称
		final String appName = "ISALES";
		//推送类型
		final String pushType = "APNS";
		//信息内容
		final String typeCode = "COM";
		PushMessageDTO push = new PushMessageDTO();
		//手机APP的名称
		push.setAppName(appName);//ISALES
		//推送存活截止的时间
		String atime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()+pushAliveSec));
		push.setAliveTime(atime);
		//推送类型 apns:IOS推送，mqtt:MQTT推送
		push.setPushType(pushType);//MQTT
		//消息内容 ADV,COM,EMG
		push.setTypeCode(typeCode);//COM 一般消息 EMG：  ADV：广告，数量限制  EMG：数量限制
		//数组json格式：['zhangsan','lisi'],根据usercode查找用户id
		PersonalEmpInfoDomain personalEmpInfoDomain = personalInfoDao.getEmpInfoSummaryByCode(saveDto.getUserCode());
		if(null != personalEmpInfoDomain && null != personalEmpInfoDomain.getOperatorId()){
			push.setUsers("['"+ personalEmpInfoDomain.getOperatorId() + "']");
		}
		
		//推送人
		push.setPusher("iyxPusher");//
		push.setUserGroup("");//可以定义群组
		//扩展字段
//		push.setExtendField("{\"url\":\"http://qy.weixin.qq.com/cgi-bin/show?agentuin=1038001911&msgid=4458184260930502663&offset=0\"}");
		// 调用APP推送接口
		if("1".equals(saveDto.getResult())){
			push.setNoticebarTitle("您提交的门店位置纠错审核通过");
			push.setContent("您提交的门店位置纠错审核通过");
		}else{
			push.setNoticebarTitle("您提交的门店位置纠错审核失败");
			push.setContent("失败原因：" + saveDto.getReason());
		}
		String rst = pushServiceClient.sendMessageByAppUsers(push);
		LOG.info("电子地图门店位置纠错审核结果推送给用户：" + rst +";审核信息：" + saveDto.toString());

	}
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性reminderDzdtDao 的set方法 
	 */
	public void setReminderDzdtDao(ReminderDzdtDAO reminderDzdtDao){
		this.reminderDzdtDao = reminderDzdtDao;
	}
	/**
	 * @Description: 属性personalInfoDAO 的set方法 
	 */
	public void setPersonalInfoDao(PersonalInfoDAO personalInfoDao) {
		this.personalInfoDao = personalInfoDao;
	}
	/**
	 * @Description: 属性pushServiceClient 的set方法 
	 */
	public void setPushServiceClient(PushServiceClient pushServiceClient) {
		this.pushServiceClient = pushServiceClient;
	}
	
	
}
