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
 * @ClassName: SurveyQuestionDomain
 * @Description: 
 *  
 */
public class SurveyUserRefDomain implements Serializable {

	private static final long serialVersionUID = 8012379559415201624L;
	
	private Long id;  // 主键
	private String researchid;  // 调查问卷ID
	private String userCode;  // 直销员工号
	private String status;  // 状态
	private Date createTime;  // 创建时间
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the researchId
	 */
	public String getResearchId() {
		return researchid;
	}
	/**
	 * @param researchId the researchId to set
	 */
	public void setResearchId(String researchid) {
		this.researchid = researchid;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((researchid == null) ? 0 : researchid.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((userCode == null) ? 0 : userCode.hashCode());
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
		SurveyUserRefDomain other = (SurveyUserRefDomain) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (researchid == null) {
			if (other.researchid != null)
				return false;
		} else if (!researchid.equals(other.researchid))
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
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SurveyUserRefDomain [id=" + id + ", researchid=" + researchid
				+ ", userCode=" + userCode + ", status=" + status
				+ ", createTime=" + createTime + "]";
	}

}
