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
import java.util.Date;
import java.util.List;

/** 
 * @ClassName: SurveyQuestionDomain
 * @Description: 
 *  
 */
public class SurveyQuestionDTO implements Serializable {

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
	private String usernos; // 直销员工号串,多个工号之间以英文逗号(,)隔开
	private String strCreateTime; // 调查问卷创建时间   时间格式为'yyyy-MM-dd hh:mm:ss'
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
	public void setResearchid(String researchid) {
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
	/**
	 * @return the usernos
	 */
	public String getUsernos() {
		return usernos;
	}
	/**
	 * @param usernos the usernos to set
	 */
	public void setUsernos(String usernos) {
		this.usernos = usernos;
	}
	/**
	 * @return the strCreateTime
	 */
	public String getStrCreateTime() {
		return strCreateTime;
	}
	/**
	 * @param strCreateTime the strCreateTime to set
	 */
	public void setStrCreateTime(String strCreateTime) {
		this.strCreateTime = strCreateTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SurveyQuestionDTO [id=" + id + ", researchid=" + researchid
				+ ", title=" + title + ", content=" + content + ", url=" + url
				+ ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", userCodeList=" + userCodeList + ", userCode=" + userCode
				+ ", usernos=" + usernos + ", strCreateTime=" + strCreateTime
				+ "]";
	}

}
