/**
* @Company 青鸟软通   
* @Title: AttachmentDomain.java 
* @Package com.haier.isales.attachment.domain 
* @author John Zhao   
* @date 2014年11月14日  11:31:49 
* @version V1.0   
*/ 
package com.haier.isales.attachment.domain;

import java.io.Serializable;

/** 
 * @ClassName: AttachmentDomain 
 * isales_attachment 自动生成的对应的实体对象   
 *  
 */
public class AttachmentDomain implements Serializable{
	private static final long serialVersionUID = -1415935909453L;

	private Long id;		//主键

	private String displayName;		//显示名称

	private String attachmentId;		//附件id，文件上传到mogodb后的编码，根据这个编号可以读取文件

	private String attachmentName;		//附件名称

	private Long attachmentSize;		//文件大小,以kb为单位

	private String attachmentUrl;		//附件链接

	private String updateId;		//修改人id，可能是字符，如工号，

	private String updateName;		//修改人

	private java.util.Date updateTime;		//修改时间

	private String createId;		//添加人id，可能是字符，如工号，

	private String createName;		//添加人

	private java.util.Date createTime;		//添加时间

	private Integer shareType;		//下载次数

	private String attachmentType;		//附件类型，使用数据字典区分，包括文本、视频、音频、图片等等类型
		
	/*=========================getter and setter ===================*/
	/**
	 * 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 属性 displayName 的get方法 
	 * @return id
	 */
	public String getDisplayName() {
		return this.displayName;
	}
	/**
	 * 属性 displayName 的set方法 
	 * @param id 
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	/**
	 * 属性 attachmentId 的get方法 
	 * @return id
	 */
	public String getAttachmentId() {
		return this.attachmentId;
	}
	/**
	 * 属性 attachmentId 的set方法 
	 * @param id 
	 */
	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}
	/**
	 * 属性 attachmentName 的get方法 
	 * @return id
	 */
	public String getAttachmentName() {
		return this.attachmentName;
	}
	/**
	 * 属性 attachmentName 的set方法 
	 * @param id 
	 */
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}
	/**
	 * 属性 attachmentSize 的get方法 
	 * @return id
	 */
	public Long getAttachmentSize() {
		return this.attachmentSize;
	}
	/**
	 * 属性 attachmentSize 的set方法 
	 * @param id 
	 */
	public void setAttachmentSize(Long attachmentSize) {
		this.attachmentSize = attachmentSize;
	}
	/**
	 * 属性 attachmentUrl 的get方法 
	 * @return id
	 */
	public String getAttachmentUrl() {
		return this.attachmentUrl;
	}
	/**
	 * 属性 attachmentUrl 的set方法 
	 * @param id 
	 */
	public void setAttachmentUrl(String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}
	/**
	 * 属性 updateId 的get方法 
	 * @return id
	 */
	public String getUpdateId() {
		return this.updateId;
	}
	/**
	 * 属性 updateId 的set方法 
	 * @param id 
	 */
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	/**
	 * 属性 updateName 的get方法 
	 * @return id
	 */
	public String getUpdateName() {
		return this.updateName;
	}
	/**
	 * 属性 updateName 的set方法 
	 * @param id 
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	/**
	 * 属性 updateTime 的get方法 
	 * @return id
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * 属性 updateTime 的set方法 
	 * @param id 
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 属性 createId 的get方法 
	 * @return id
	 */
	public String getCreateId() {
		return this.createId;
	}
	/**
	 * 属性 createId 的set方法 
	 * @param id 
	 */
	public void setCreateId(String createId) {
		this.createId = createId;
	}
	/**
	 * 属性 createName 的get方法 
	 * @return id
	 */
	public String getCreateName() {
		return this.createName;
	}
	/**
	 * 属性 createName 的set方法 
	 * @param id 
	 */
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	/**
	 * 属性 createTime 的get方法 
	 * @return id
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * 属性 createTime 的set方法 
	 * @param id 
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 属性 shareType 的get方法 
	 * @return id
	 */
	public Integer getShareType() {
		return this.shareType;
	}
	/**
	 * 属性 shareType 的set方法 
	 * @param id 
	 */
	public void setShareType(Integer shareType) {
		this.shareType = shareType;
	}
	/**
	 * 属性 attachmentType 的get方法 
	 * @return id
	 */
	public String getAttachmentType() {
		return this.attachmentType;
	}
	/**
	 * 属性 attachmentType 的set方法 
	 * @param id 
	 */
	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

	/*====================hashCode and equals ====================*/
	/**
	* <p>Description: AttachmentDomain 自动生成的hashcode方法</p> 
	* @author John Zhao   
	* @date 2014年11月14日  11:31:49
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((id == null) ? 0 : id.hashCode());
		return result;
	}
	/**
	* <p>Description:AttachmentDomain 自动生成的equals方法 </p> 
	* @author John Zhao   
	* @date 2014年11月14日  11:31:49
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		AttachmentDomain other =(AttachmentDomain) obj;

		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (id == null) {if (other.id != null){ return false;} else if (!id.equals(other.id)){ return false;}}
		*/
		if (id == null) {
			if (other.id != null){ 
				return false;
			}
		}else if (!id.equals(other.id)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:AttachmentDomain 自动生成的toString方法 </p> 
	* @author John Zhao   
	* @date 2014年11月14日  11:31:49 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "AttachmentDomain [" +
					"id=" + id + "," + 
					"displayName=" + displayName + "," + 
					"attachmentId=" + attachmentId + "," + 
					"attachmentName=" + attachmentName + "," + 
					"attachmentSize=" + attachmentSize + "," + 
					"attachmentUrl=" + attachmentUrl + "," + 
					"updateId=" + updateId + "," + 
					"updateName=" + updateName + "," + 
					"updateTime=" + updateTime + "," + 
					"createId=" + createId + "," + 
					"createName=" + createName + "," + 
					"createTime=" + createTime + "," + 
					"shareType=" + shareType + "," + 
					"attachmentType=" + attachmentType + "," + 
				"]";
	}
}
