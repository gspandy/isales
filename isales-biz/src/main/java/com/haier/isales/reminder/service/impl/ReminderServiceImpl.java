/**
 * @Company 青鸟软通   
 * @Title: ReminderService.java 
 * @Package  com.haier.isales.reminder.service.impl
 * @author Liu Wenjie   
 * @date 2014年11月14日  20:35:33
 * @version V1.0   
 */
package com.haier.isales.reminder.service.impl;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.bana.common.util.basic.DateUtil;
import org.bana.common.util.basic.StringUtils;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.reminder.DomainCloneUtil;
import com.haier.isales.reminder.dao.ReminderDAO;
import com.haier.isales.reminder.domain.ReminderDomain;
import com.haier.isales.reminder.module.ReminderResult;
import com.haier.isales.reminder.module.SchaduleReminder;
import com.haier.isales.reminder.service.ReminderService;
import com.haier.isales.system.user.domain.User;
import com.haier.isales.system.user.model.UserGroupModule;
import com.haier.isales.system.user.model.UserGroupModule.UserGroupType;
import com.haier.isales.system.user.service.UserService;
import com.haier.openplatform.mobile.push.dto.PushMessageDTO;
import com.haier.openplatform.mobile.push.service.PushServiceClient;

/** 
 * @ClassName: ReminderService
 * @Description: Reminder的Service接口定义类
 *  
 */
public class ReminderServiceImpl implements ReminderService{

	private static final Logger LOG = LoggerFactory.getLogger(ReminderServiceImpl.class);
	
	/** 
	* @Fields reminderDao : ReminderDao 工具依赖 
	*/
	private ReminderDAO reminderDao;
	
	/** 
	* @Fields pushServiceClient : 发送推送消息的Dubbo
	*/ 
	private PushServiceClient pushServiceClient;
	
	/** 
	* @Fields userService : 用户行为
	*/ 
	private UserService userService;
	
	private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	/*===============业务方法=============*/
	
	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-14 下午9:05:18 
	* @param schaduleReminder 
	* @see com.haier.isales.reminder.service.ReminderService#saveSchaduleReminder(com.haier.isales.reminder.module.SchaduleReminder) 
	*/ 
	@Override
	public void saveSchaduleReminder(SchaduleReminder schaduleReminder) {
		//对参数进行必要的校验,
		checkSchaduleReminder(schaduleReminder);
		//将reminder对象设置转换为数据库对象进行保存
		ReminderDomain reminderDomain = DomainCloneUtil.cloneSchaduleReminderToReminderDomain(schaduleReminder);
		//将记录保存到数据库中
		reminderDao.save(reminderDomain);
		LOG.info("执行保存成功......");
	}
	
	
	/** 
	* @Description: 对参数进行必要的校验,
	* @author Liu Wenjie   
	* @date 2014-11-15 下午3:28:10 
	* @param schaduleReminder  
	*/ 
	private void checkSchaduleReminder(SchaduleReminder schaduleReminder){
		CheckParamUtil.checkFieldIfNotBlank(schaduleReminder, "title","content");
		List<String> userList = schaduleReminder.getUserList();
		List<UserGroupModule> userGroupList = schaduleReminder.getUserGroupList();
		if((userList == null || userList.isEmpty()) && (userGroupList == null || userGroupList.isEmpty())){
			throw new BusinessException(BusinessExceptionCode.param_error,"保存一条定时推送时，指定的用户userList和用户组userGroupList都为Empty");
		}
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-15 下午5:29:52  
	* @see com.haier.isales.reminder.service.ReminderService#sendAllReminder() 
	*/ 
	@Override
	public void sendAllReminder() {
		//查询未发送的提醒
		List<String> sendStatus = new ArrayList<String>();
		sendStatus.add(ReminderDomain.SEND_STATUS_NEVER);
		PageCond pageCond = new PageCond();
		pageCond.setPageSize(Integer.MAX_VALUE);
		PageCondUtil.check(pageCond);
		//循环发送提醒
		List<ReminderDomain> domainList = reminderDao.findBySendStatus(sendStatus);
		//循环发送一条提醒
		if(domainList != null && !domainList.isEmpty()){
			for (ReminderDomain reminderDomain : domainList) {
				sendReminder(reminderDomain);
			}
		}
	}
	
	/** 
	* @Description: 发送一条推送消息
	* @author Liu Wenjie   
	* @date 2014-11-15 下午5:43:22 
	* @param reminderDomain  
	*/ 
	private void sendReminder(ReminderDomain reminderDomain) {
		PushMessageDTO pushDTO = new PushMessageDTO();
		//手机APP的名称
		pushDTO.setAppName(reminderDomain.getAppName());
		//消息内容 ADV,COM,EMG
		pushDTO.setTypeCode(reminderDomain.getTypeCode());
		//推送类型 apns:IOS推送，mqtt:MQTT推送
		pushDTO.setPushType(reminderDomain.getPushType());
		//推送存活截止的时间
		Date aliveTime = new Date(System.currentTimeMillis() + reminderDomain.getAliveTime());
		pushDTO.setAliveTime(DateUtil.toString(aliveTime,DEFAULT_DATE_FORMAT));
		//推送人
		pushDTO.setPusher(reminderDomain.getPusher());
		
		pushDTO.setNoticebarTitle(reminderDomain.getTitle());
		pushDTO.setContent(reminderDomain.getContent());
		
		Map<String,Object> extendsMap = new HashMap<String, Object>();
		extendsMap.put("id", reminderDomain.getId());
		extendsMap.put("url", reminderDomain.getLinkUrl());
		extendsMap.put("other", reminderDomain.getExtendedField());
		
		JSON json = JSONSerializer.toJSON(extendsMap);
		pushDTO.setExtendField(json.toString());
		
		//用户组信息
		String userGroup = reminderDomain.getUserGroup();
		String result = "";
		//按app发送,即全员
		if(!StringUtils.isBlank(userGroup) && userGroup.contains(UserGroupType.全员.toString())){
			//发送全员推送消息
			result = pushServiceClient.sendMessageByApp(pushDTO);
			return ;
		}else{
			//非全员的将继续构构建对应的用户组进行发送
			Set<String> userSet = new HashSet<String>();
			List<UserGroupModule> includeList = parseJsonArrayToUserGroupModuleList(userGroup);
			List<UserGroupModule> excludeList = parseJsonArrayToUserGroupModuleList(reminderDomain.getExcludedUserGroup());
			Set<User> groupUserList = userService.finduserByOrgOrLabelParam(includeList, excludeList);
			for (User user : groupUserList) {
				userSet.add(String.valueOf(user.getOperatorId()));
			}
			//数组json格式：['zhangsan','lisi'],设置推送用户
			JSONArray jsonArr = JSONArray.fromObject(reminderDomain.getUser());
			String[] userArr = (String[])JSONArray.toArray(jsonArr, String.class);;
			
			userSet.addAll(Arrays.asList(userArr));
			
			JSONArray jsonArray = JSONArray.fromObject(userSet);
			pushDTO.setUsers(jsonArray.toString());
			//目前不做转化
			//pushDTO.setUserGroup("");//可以定义群组
			result = pushServiceClient.sendMessageByAppUsers(pushDTO);
		}
		JSONObject jsonObject = JSONObject.fromObject(result);
		ReminderResult bean = (ReminderResult)JSONObject.toBean(jsonObject,ReminderResult.class);
		if(bean.isSuccess()){
			reminderDomain.setSendStatus(ReminderDomain.SEND_STATUS_SUCCESS);
		}else{
			reminderDomain.setSendStatus(ReminderDomain.SEND_STATUS_FAIL);
			reminderDomain.setReturnData(Arrays.toString(bean.getData()));
		}
		reminderDomain.setSendTime(new Date());
		reminderDao.update(reminderDomain);
	}
	
	/** 
	* @Description: 将一格json格式的用户组module转化为集合
	* @author Liu Wenjie   
	* @date 2014-11-15 下午6:26:05 
	* @param userGroup
	* @return  
	*/ 
	private List<UserGroupModule> parseJsonArrayToUserGroupModuleList(String userGroup){
		List<UserGroupModule> list = new ArrayList<UserGroupModule>();
		if(StringUtils.isBlank(userGroup)){
			return list;
		}
		//存在的用户组集合
		JSONArray jsonArr2 = JSONArray.fromObject(userGroup);
		Object[] userGroupArr = jsonArr2.toArray();
		for (Object object : userGroupArr) {
			UserGroupModule userGroupModule = new UserGroupModule();
			Map<String,String> map = (Map<String,String>)object;
			userGroupModule.setUserGroupType(UserGroupType.valueOf(map.get("userGroupType")));
			userGroupModule.setGroupCode(map.get("groupCode"));
			list.add(userGroupModule);
		}
		return list;
	}
	
	
	
	
	/*====================getter and setter =================*/
	

	/**
	 * @Description: 属性reminderDao 的set方法 
	 */
	public void setReminderDao(ReminderDAO reminderDao){
		this.reminderDao = reminderDao;
	}


	/**
	 * @Description: 属性 pushServiceClient 的set方法 
	 * @param pushServiceClient 
	 */
	public void setPushServiceClient(PushServiceClient pushServiceClient) {
		this.pushServiceClient = pushServiceClient;
	}


	/**
	 * @Description: 属性 userService 的set方法 
	 * @param userService 
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


}
