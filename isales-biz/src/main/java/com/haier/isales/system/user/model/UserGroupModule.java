/**
* @Company 青鸟软通   
* @Title: UserGroupModule.java 
* @Package com.haier.isales.reminder.module 
* @author Liu Wenjie   
* @date 2014-11-15 上午11:03:34 
* @version V1.0   
*/ 
package com.haier.isales.system.user.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/** 
 * @ClassName: UserGroupModule 
 * @Description: 用户组对象，用户组的编号和对应的类型
 *  
 */
public class UserGroupModule implements Serializable{

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = 1333652059428718973L;

	/** 
	 * <p>Description: </p> 
	 * @author Liu Wenjie   
	 * @date 2014-11-15 下午4:10:36  
	 */
	public UserGroupModule() {
		// TODO Auto-generated constructor stub
	}
	
	/** 
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-15 下午4:10:50 
	* @param groupCode
	* @param userGroupType 
	*/ 
	public UserGroupModule(String groupCode, UserGroupType userGroupType) {
		super();
		this.groupCode = groupCode;
		this.userGroupType = userGroupType;
	}



	/** 
	* @Fields groupCode : 用户组的主键
	*/ 
	public String groupCode;
	
	/** 
	* @Fields userGroupType : 用户组类型
	*/ 
	public UserGroupType userGroupType;
	
	
	/** 
	* @ClassName: UserGroupType 
	* @Description: 用户组的类型
	*/ 
	public enum UserGroupType {
		实体组织,虚拟组织,标签组,标签,全员
	}
	
	/*==================业务方法===============*/

	/** 
	* @Description: 根据类型，返回对应类型的userGroupCode集合
	* @author Liu Wenjie   
	* @date 2014-11-15 下午1:07:46 
	* @param userGroupList
	* @param groupType
	* @return  
	*/ 
	public static List<String> getUserGroupByType(List<UserGroupModule> userGroupList, UserGroupType groupType){
		if(userGroupList == null || userGroupList.isEmpty() || groupType == null){
			return new ArrayList<String>();
		}
		
		List<String> targetList = new ArrayList<String>();
		for (UserGroupModule userGroupModule : userGroupList) {
			if(groupType.equals(userGroupModule.getUserGroupType())){
				targetList.add(userGroupModule.getGroupCode());
			}
		}
		return targetList;
	}
	
	
	
	/*=================getter and setter =================*/

	/**
	 * @Description: 属性 groupCode 的get方法 
	 * @return groupCode
	 */
	public String getGroupCode() {
		return groupCode;
	}


	/**
	 * @Description: 属性 groupCode 的set方法 
	 * @param groupCode 
	 */
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}


	/**
	 * @Description: 属性 userGroupType 的get方法 
	 * @return userGroupType
	 */
	public UserGroupType getUserGroupType() {
		return userGroupType;
	}


	/**
	 * @Description: 属性 userGroupType 的set方法 
	 * @param userGroupType 
	 */
	public void setUserGroupType(UserGroupType userGroupType) {
		this.userGroupType = userGroupType;
	}

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-15 下午4:13:43 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "UserGroupModule [groupCode=" + groupCode + ", userGroupType="
				+ userGroupType + "]";
	}
	
	
	
}
