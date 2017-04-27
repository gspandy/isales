/**
* @Company 青鸟软通   
* @Title: DomainCloneUtil.java 
* @Package com.haier.isales.reminder 
* @author Liu Wenjie   
* @date 2014-11-15 下午3:10:31 
* @version V1.0   
*/ 
package com.haier.isales.reminder;

import java.util.List;

import net.sf.json.JSONArray;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.reminder.domain.ReminderBpmDomain;
import com.haier.isales.reminder.domain.ReminderDomain;
import com.haier.isales.reminder.domain.ReminderDzdtDomain;
import com.haier.isales.reminder.dto.ReminderBpmDTO;
import com.haier.isales.reminder.dto.ReminderDzdtDTO;
import com.haier.isales.reminder.module.SchaduleReminder;
import com.haier.isales.system.user.model.UserGroupModule;

/** 
 * @ClassName: DomainCloneUtil 
 * @Description: reminder 中实体类相互转化的方法
 *  
 */
public class DomainCloneUtil {

	/**
	* @Description: 把module 对象 SchaduleReminder 转化为 schaduleReminder
	* @author Liu Wenjie   
	* @date 2014-11-15 下午3:12:02 
	* @param schaduleReminder
	* @return
	 */
	public static ReminderDomain cloneSchaduleReminderToReminderDomain(SchaduleReminder schaduleReminder){
		if(schaduleReminder == null){
			return null;
		}
		ReminderDomain reminderDomain = ClonePojoUtil.copyClassFromTo(schaduleReminder, ReminderDomain.class);
		//设置包含的user
		List<String> userList = schaduleReminder.getUserList();
		if(userList != null){
			//String user = userList.toString();
			//reminderDomain.setUser(StringUtils.trimAllWhitespace(user.substring(1,user.length() -1)));
			reminderDomain.setUser(JSONArray.fromObject(userList).toString());
		}
		//设置包含的用户组
		List<UserGroupModule> userGroupList = schaduleReminder.getUserGroupList();
		if(userGroupList != null){
			//String userGroup = userGroupList.toString();
			//reminderDomain.setUserGroup(StringUtils.trimAllWhitespace(userGroup.substring(1,userGroup.length() -1)));
			reminderDomain.setUserGroup(JSONArray.fromObject(userGroupList).toString());
		}
		//设置排除的用户组
		List<UserGroupModule> userExcludeGroupList = schaduleReminder.getExcludedUserGroupList();
		if(userExcludeGroupList != null){
			//String userExcludeGroup = userExcludeGroupList.toString();
			//reminderDomain.setExcludedUserGroup(StringUtils.trimAllWhitespace(userExcludeGroup.substring(1,userExcludeGroup.length() -1)));
			reminderDomain.setExcludedUserGroup(JSONArray.fromObject(userExcludeGroupList).toString());
		}
		
		return reminderDomain;
	}
	
	/**
	 * @Description: clone ReminderBpmDTO to ReminderBpmDomain
	 * @author Cao Rui
	 * @date 2015-6-12  下午3:19:14
	 * @param dto
	 * @return
	 */
	public static ReminderBpmDomain cloneReminderBpmDto2Domain(ReminderBpmDTO dto) {
		if (dto == null) {
			return null;
		}
		ReminderBpmDomain domain = ClonePojoUtil.copyClassFromTo(dto, ReminderBpmDomain.class);
		return domain;
	}
	
	/**
	 * @Description: clone ReminderBpmDomain to ReminderBpmDTO
	 * @author Cao Rui
	 * @date 2015-6-12  下午3:19:14
	 * @param domain
	 * @return
	 */
	public static ReminderBpmDTO cloneReminderBpmDomain2DTO(ReminderBpmDomain domain) {
		//将bpm消息的domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		ReminderBpmDTO dto = ClonePojoUtil.copyClassFromTo(domain,
				ReminderBpmDTO.class);
		return dto;
	}
	
	
	
	/**
	 * @Description: clone ReminderDzdtDTO to ReminderDzdtDomain
	 * @author Cao Rui
	 * @date 2015-6-12  下午3:19:14
	 * @param dto
	 * @return
	 */
	public static ReminderDzdtDomain cloneReminderDzdtDto2Domain(ReminderDzdtDTO dto) {
		if (dto == null) {
			return null;
		}
		ReminderDzdtDomain domain = ClonePojoUtil.copyClassFromTo(dto, ReminderDzdtDomain.class);
		return domain;
	}
	
	/**
	 * @Description: clone ReminderDzdtDomain to ReminderDzdtDTO
	 * @author Cao Rui
	 * @date 2015-6-12  下午3:19:14
	 * @param domain
	 * @return
	 */
	public static ReminderDzdtDTO cloneReminderDzdtDomain2DTO(ReminderDzdtDomain domain) {
		//将bpm消息的domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		ReminderDzdtDTO dto = ClonePojoUtil.copyClassFromTo(domain,
				ReminderDzdtDTO.class);
		return dto;
	}
	
}
