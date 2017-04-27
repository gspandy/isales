/**
* @Company 青鸟软通   
* @Title: MomentsAddDTO.java 
* @Package com.haier.isales.moments.dto 
* @author Liu Wenjie   
* @date 2014-11-20 下午10:50:31 
* @version V1.0   
*/ 
package com.haier.isales.moments.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.haier.isales.system.dto.UserDTO;

/** 
 * @ClassName: MomentsAddDTO 
 * @Description: 分享增加时对应DTO对象 
 *  
 */
public class MomentsAddDTO implements Serializable {
	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = 3236498996349649174L;
	
	private String[] targetIds;//分享的目标Ids
	private String contents; //分享的内容
	private String location; //用户当前位置
	private String typeCode; //类型编号
	private UserDTO currentUser; //当前用户
	private List<String> targetLabelGroups;//目标分享的标签群
	private List<String> userLabelGroups;//用户本身的所有标签群
	private List<String> imgUrl;//从产品百科选择的图片是一个地址
	private List<String> attechementId;//自己上传的图片得到的是一个房间集合
	
	/*================getters & setters================*/
	/**
	 * @Description: 属性 targetIds 的get方法 
	 * @return targetIds
	 */
	public String[] getTargetIds() {
		return targetIds;
	}
	/**
	 * @Description: 属性 targetIds 的set方法 
	 * @param targetIds 
	 */
	public void setTargetIds(String[] targetIds) {
		this.targetIds = targetIds;
	}
	/**
	 * @Description: 属性 contents 的get方法 
	 * @return contents
	 */
	public String getContents() {
		return contents;
	}
	/**
	 * @Description: 属性 contents 的set方法 
	 * @param contents 
	 */
	public void setContents(String contents) {
		this.contents = contents;
	}
	/**
	 * @Description: 属性 typeCode 的get方法 
	 * @return typeCode
	 */
	public String getTypeCode() {
		return typeCode;
	}
	/**
	 * @Description: 属性 typeCode 的set方法 
	 * @param typeCode 
	 */
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	/**
	 * @Description: 属性 currentUser 的get方法 
	 * @return currentUser
	 */
	public UserDTO getCurrentUser() {
		return currentUser;
	}
	/**
	 * @Description: 属性 currentUser 的set方法 
	 * @param currentUser 
	 */
	public void setCurrentUser(UserDTO currentUser) {
		this.currentUser = currentUser;
	}
	/**
	 * @Description: 属性 targetLabelGroups 的get方法 
	 * @return targetLabelGroups
	 */
	public List<String> getTargetLabelGroups() {
		return targetLabelGroups;
	}
	/**
	 * @Description: 属性 targetLabelGroups 的set方法 
	 * @param targetLabelGroups 
	 */
	public void setTargetLabelGroups(List<String> targetLabelGroups) {
		this.targetLabelGroups = targetLabelGroups;
	}
	/**
	 * @Description: 属性 userLabelGroups 的get方法 
	 * @return userLabelGroups
	 */
	public List<String> getUserLabelGroups() {
		return userLabelGroups;
	}
	/**
	 * @Description: 属性 userLabelGroups 的set方法 
	 * @param userLabelGroups 
	 */
	public void setUserLabelGroups(List<String> userLabelGroups) {
		this.userLabelGroups = userLabelGroups;
	}
	/**
	 * @Description: 属性 location 的get方法 
	 * @return location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @Description: 属性 location 的set方法 
	 * @param location 
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/**
	 * @Description: 属性 imgUrl 的get方法 
	 * @return imgUrl
	 */
	public List<String> getImgUrl() {
		return imgUrl;
	}
	/**
	 * @Description: 属性 imgUrl 的set方法 
	 * @param imgUrl 
	 */
	public void setImgUrl(List<String> imgUrl) {
		this.imgUrl = imgUrl;
	}
	/**
	 * @Description: 属性 attechementId 的get方法 
	 * @return attechementId
	 */
	public List<String> getAttechementId() {
		return attechementId;
	}
	/**
	 * @Description: 属性 attechementId 的set方法 
	 * @param attechementId 
	 */
	public void setAttechementId(List<String> attechementId) {
		this.attechementId = attechementId;
	}
	
	/*================toString==================*/
	/**
	* <p>Description:MomentsAddDTO自动生成的toString方法 </p> 
	* @author Liu Wenjie   
	* @date 2015-1-7 下午7:15:19 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "MomentsAddDTO [targetIds=" + Arrays.toString(targetIds)
				+ ", contents=" + contents + ", location=" + location
				+ ", typeCode=" + typeCode + ", currentUser=" + currentUser
				+ ", targetLabelGroups=" + targetLabelGroups
				+ ", userLabelGroups=" + userLabelGroups + "]";
	}
}
