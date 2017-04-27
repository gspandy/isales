/**
* @Company 青鸟软通   
* @Title: SysUserDomain.java
* @Package com.haier.isales.app.domain
* @author lizhenwei
* @date 2016-3-24下午7:06:56
* @version V1.0   
*/ 
package com.haier.isales.app.dto;

import java.io.Serializable;
import java.util.List;

/** 
 * @ClassName: SysUserDTO
 * @Description: 
 *  
 */
public class SysUserDTO implements Serializable {

	private static final long serialVersionUID = 4348050395865111558L;
	
	private Long operatorId;  // 主键
	private String userCode;  // 工号
	private String userName;  // 用户名
	private String userMail;  // 用户邮箱
	private String userDeptCode; // 部门编码
	private String phone;  // 固话
	private String mobile;  // 手机
	private String status;  // 用户状态
	private String nameLetter; // 姓名首字母
	
	private String querySearchKey; // 模糊查询工号，姓名
	private String userDept; //  用户部门
	private String userPost; // 用户职位
	private String userOU; // 用户详细部门
	
	private String photoUrl; // 用户头像url
	
	private List<SysUserDTO> collUserList; // 收藏联系人
	private String refStatus; // 关联状态
	/** 
	* @Fields collectUserCode : 收藏员工工号
	*/
	private String collectUserCode;
	/**
	 * @return the operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}
	/**
	 * @param operatorId the operatorId to set
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * @return the userCode
	 */
	public String getUserCode() {
		return userCode;
	}
	/**
	 * @param userCode the userCode to set
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userMail
	 */
	public String getUserMail() {
		return userMail;
	}
	/**
	 * @param userMail the userMail to set
	 */
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	/**
	 * @return the userDeptCode
	 */
	public String getUserDeptCode() {
		return userDeptCode;
	}
	/**
	 * @param userDeptCode the userDeptCode to set
	 */
	public void setUserDeptCode(String userDeptCode) {
		this.userDeptCode = userDeptCode;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the nameLetter
	 */
	public String getNameLetter() {
		return nameLetter;
	}
	/**
	 * @param nameLetter the nameLetter to set
	 */
	public void setNameLetter(String nameLetter) {
		this.nameLetter = nameLetter;
	}
	/**
	 * @return the querySearchKey
	 */
	public String getQuerySearchKey() {
		return querySearchKey;
	}
	/**
	 * @param querySearchKey the querySearchKey to set
	 */
	public void setQuerySearchKey(String querySearchKey) {
		this.querySearchKey = querySearchKey;
	}
	/**
	 * @return the userDept
	 */
	public String getUserDept() {
		return userDept;
	}
	/**
	 * @param userDept the userDept to set
	 */
	public void setUserDept(String userDept) {
		this.userDept = userDept;
	}
	/**
	 * @return the userPost
	 */
	public String getUserPost() {
		return userPost;
	}
	/**
	 * @param userPost the userPost to set
	 */
	public void setUserPost(String userPost) {
		this.userPost = userPost;
	}
	/**
	 * @return the userOU
	 */
	public String getUserOU() {
		return userOU;
	}
	/**
	 * @param userOU the userOU to set
	 */
	public void setUserOU(String userOU) {
		this.userOU = userOU;
	}
	/**
	 * @return the photoUrl
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}
	/**
	 * @param photoUrl the photoUrl to set
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	/**
	 * @return the collUserList
	 */
	public List<SysUserDTO> getCollUserList() {
		return collUserList;
	}
	/**
	 * @param collUserList the collUserList to set
	 */
	public void setCollUserList(List<SysUserDTO> collUserList) {
		this.collUserList = collUserList;
	}
	
	/**
	 * @return the refStatus
	 */
	public String getRefStatus() {
		return refStatus;
	}
	/**
	 * @param refStatus the refStatus to set
	 */
	public void setRefStatus(String refStatus) {
		this.refStatus = refStatus;
	}
	
	/**
	 * @return the collectUserCode
	 */
	public String getCollectUserCode() {
		return collectUserCode;
	}
	/**
	 * @param collectUserCode the collectUserCode to set
	 */
	public void setCollectUserCode(String collectUserCode) {
		this.collectUserCode = collectUserCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SysUserDTO [operatorId=" + operatorId + ", userCode="
				+ userCode + ", userName=" + userName + ", userMail="
				+ userMail + ", userDeptCode=" + userDeptCode + ", phone="
				+ phone + ", mobile=" + mobile + ", status=" + status
				+ ", nameLetter=" + nameLetter + ", querySearchKey="
				+ querySearchKey + ", userDept=" + userDept + ", userPost="
				+ userPost + ", userOU=" + userOU + ", photoUrl=" + photoUrl
				+ "]";
	}

}
