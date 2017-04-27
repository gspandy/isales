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
import java.util.List;

/** 
 * @ClassName: SurveyQuestionDomain
 * @Description: 
 *  
 */
public class SurveyQuestionDomain implements Serializable {

	private static final long serialVersionUID = -1752706858696465577L;
	
	private Long id;  // 主键
	private String researchid;  // 调查问卷ID
	private String title;  // 调查问卷标题
	private String content;  // 调查问卷内容
	private String url; // 调查问卷url
	private Date createTime;  // 创建时间
	private Date updateTime; // 修改时间
	private List<String> userCodeList;
	private String userCode;
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
	public String getResearchid() {
		return researchid;
	}
	/**
	 * @param researchId the researchId to set
	 */
	public void setResearchId(String researchid) {
		this.researchid = researchid;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
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
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @return the userCodeList
	 */
	public List<String> getUserCodeList() {
		return userCodeList;
	}
	/**
	 * @param userCodeList the userCodeList to set
	 */
	public void setUserCodeList(List<String> userCodeList) {
		this.userCodeList = userCodeList;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((researchid == null) ? 0 : researchid.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result
				+ ((updateTime == null) ? 0 : updateTime.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result
				+ ((userCode == null) ? 0 : userCode.hashCode());
		result = prime * result
				+ ((userCodeList == null) ? 0 : userCodeList.hashCode());
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
		SurveyQuestionDomain other = (SurveyQuestionDomain) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
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
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (updateTime == null) {
			if (other.updateTime != null)
				return false;
		} else if (!updateTime.equals(other.updateTime))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (userCode == null) {
			if (other.userCode != null)
				return false;
		} else if (!userCode.equals(other.userCode))
			return false;
		if (userCodeList == null) {
			if (other.userCodeList != null)
				return false;
		} else if (!userCodeList.equals(other.userCodeList))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SurveyQuestionDomain [id=" + id + ", researchid=" + researchid
				+ ", title=" + title + ", content=" + content + ", url=" + url
				+ ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", userCodeList=" + userCodeList + ", userCode=" + userCode
				+ "]";
	}

}
