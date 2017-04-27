/**
* @Company 青鸟软通   
* @Title: SysUserDomain.java
* @Package com.haier.isales.app.domain
* @author lizhenwei
* @date 2016-3-24下午7:06:56
* @version V1.0   
*/ 
package com.haier.isales.app.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: SysUserDomain
 * @Description: 
 *  
 */
public class SysUserDomain implements Serializable {

	private static final long serialVersionUID = 3276323937632596014L;
	
	private Long operatorId;  // 主键
	private String userCode;  // 工号
	private String userName;  // 用户名
	private String userMail;  // 用户邮箱
	private String userDeptCode; // 部门编码
	private String phone;  // 固话
	private String mobile;  // 手机
	private String status;  // 用户状态
	private String nameLetter; // 姓名首字母
	private Date createTime;  // 创建时间
	private String userOU; // 用户详细部门
	private String userDept; // 用户部门
	
	private String photoUrl; // 用户头像URL
	// refStatus 是否属于收藏联系人
	private String refStatus;
	
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
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result
				+ ((nameLetter == null) ? 0 : nameLetter.hashCode());
		result = prime * result
				+ ((operatorId == null) ? 0 : operatorId.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result
				+ ((photoUrl == null) ? 0 : photoUrl.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((userCode == null) ? 0 : userCode.hashCode());
		result = prime * result
				+ ((userDept == null) ? 0 : userDept.hashCode());
		result = prime * result
				+ ((userDeptCode == null) ? 0 : userDeptCode.hashCode());
		result = prime * result
				+ ((userMail == null) ? 0 : userMail.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userOU == null) ? 0 : userOU.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SysUserDomain other = (SysUserDomain) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (nameLetter == null) {
			if (other.nameLetter != null)
				return false;
		} else if (!nameLetter.equals(other.nameLetter))
			return false;
		if (operatorId == null) {
			if (other.operatorId != null)
				return false;
		} else if (!operatorId.equals(other.operatorId))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (photoUrl == null) {
			if (other.photoUrl != null)
				return false;
		} else if (!photoUrl.equals(other.photoUrl))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (userCode == null) {
			if (other.userCode != null)
				return false;
		} else if (!userCode.equals(other.userCode))
			return false;
		if (userDept == null) {
			if (other.userDept != null)
				return false;
		} else if (!userDept.equals(other.userDept))
			return false;
		if (userDeptCode == null) {
			if (other.userDeptCode != null)
				return false;
		} else if (!userDeptCode.equals(other.userDeptCode))
			return false;
		if (userMail == null) {
			if (other.userMail != null)
				return false;
		} else if (!userMail.equals(other.userMail))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userOU == null) {
			if (other.userOU != null)
				return false;
		} else if (!userOU.equals(other.userOU))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SysUserDomain [operatorId=" + operatorId + ", userCode="
				+ userCode + ", userName=" + userName + ", userMail="
				+ userMail + ", userDeptCode=" + userDeptCode + ", phone="
				+ phone + ", mobile=" + mobile + ", status=" + status
				+ ", nameLetter=" + nameLetter + ", createTime=" + createTime
				+ ", userOU=" + userOU + ", userDept=" + userDept
				+ ", photoUrl=" + photoUrl + ", refStatus=" + refStatus + "]";
	}

}
