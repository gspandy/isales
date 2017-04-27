/**
* @Company 青鸟软通   
* @Title: AttachmentDTO.java 
* @Package com.haier.isales.attachment.dto 
* @author John  Zhao   
* @date 2014-11-14 下午1:28:00 
* @version V1.0   
*/ 
package com.haier.isales.attachment.dto;

import java.io.Serializable;

/** 
 * @ClassName: AttachmentDTO 
 * @Description: 
 *  
 */
public class AttachmentDTO implements Serializable{
	
	/** 
	* @Fields serialVersionUID : 版本号
	*/ 
	private static final long serialVersionUID = 5079425831465403814L;
	/** 
	* @Fields id : id
	*/
	private Long id;
	/** 
	* @Fields displayName : 显示名称
	*/
	private String displayName;
	/** 
	* @Fields attachmentId : 附件id，文件上传到mogodb后的编码，根据这个编号可以读取文件
	*/
	private String attachmentId;
	/** 
	* @Fields attachmentName : 附件名称
	*/
	private String attachmentName;
	/** 
	* @Fields attachmentSize : 文件大小,以kb为单位
	*/
	private Long attachmentSize;
	/** 
	* @Fields attachmentUrl : 附件链接
	*/
	private String attachmentUrl;
	/** 
	* @Fields updateId : 修改人id，可能是字符，如工号，
	*/
	private String updateId;
	/** 
	* @Fields updateName : 修改人
	*/
	private String updateName;
	/** 
	* @Fields createId : 添加人id，可能是字符，如工号，
	*/
	private String createId;
	/** 
	* @Fields createName : 添加人
	*/
	private String createName;

	/** 
	* @Fields shareType : 下载次数
	*/
	private Integer shareType;
	/** 
	* @Fields attachmentType : 附件类型，使用数据字典区分，包括文本、视频、音频、图片等等类型
	*/
	private String attachmentType;
	
	//===================getters & setters======================
	/**
	 * @Description: 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @Description: 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @Description: 属性 displayName 的get方法 
	 * @return displayName
	 */
	public String getDisplayName() {
		return displayName;
	}
	/**
	 * @Description: 属性 displayName 的set方法 
	 * @param displayName 
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	/**
	 * @Description: 属性 attachmentId 的get方法 
	 * @return attachmentId
	 */
	public String getAttachmentId() {
		return attachmentId;
	}
	/**
	 * @Description: 属性 attachmentId 的set方法 
	 * @param attachmentId 
	 */
	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}
	/**
	 * @Description: 属性 attachmentName 的get方法 
	 * @return attachmentName
	 */
	public String getAttachmentName() {
		return attachmentName;
	}
	/**
	 * @Description: 属性 attachmentName 的set方法 
	 * @param attachmentName 
	 */
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}
	/**
	 * @Description: 属性 attachmentSize 的get方法 
	 * @return attachmentSize
	 */
	public Long getAttachmentSize() {
		return attachmentSize;
	}
	/**
	 * @Description: 属性 attachmentSize 的set方法 
	 * @param attachmentSize 
	 */
	public void setAttachmentSize(Long attachmentSize) {
		this.attachmentSize = attachmentSize;
	}
	/**
	 * @Description: 属性 attachmentUrl 的get方法 
	 * @return attachmentUrl
	 */
	public String getAttachmentUrl() {
		return attachmentUrl;
	}
	/**
	 * @Description: 属性 attachmentUrl 的set方法 
	 * @param attachmentUrl 
	 */
	public void setAttachmentUrl(String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}
	/**
	 * @Description: 属性 updateId 的get方法 
	 * @return updateId
	 */
	public String getUpdateId() {
		return updateId;
	}
	/**
	 * @Description: 属性 updateId 的set方法 
	 * @param updateId 
	 */
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	/**
	 * @Description: 属性 updateName 的get方法 
	 * @return updateName
	 */
	public String getUpdateName() {
		return updateName;
	}
	/**
	 * @Description: 属性 updateName 的set方法 
	 * @param updateName 
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	/**
	 * @Description: 属性 createId 的get方法 
	 * @return createId
	 */
	public String getCreateId() {
		return createId;
	}
	/**
	 * @Description: 属性 createId 的set方法 
	 * @param createId 
	 */
	public void setCreateId(String createId) {
		this.createId = createId;
	}
	/**
	 * @Description: 属性 createName 的get方法 
	 * @return createName
	 */
	public String getCreateName() {
		return createName;
	}
	/**
	 * @Description: 属性 createName 的set方法 
	 * @param createName 
	 */
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	/**
	 * @Description: 属性 shareType 的get方法 
	 * @return shareType
	 */
	public Integer getShareType() {
		return shareType;
	}
	/**
	 * @Description: 属性 shareType 的set方法 
	 * @param shareType 
	 */
	public void setShareType(Integer shareType) {
		this.shareType = shareType;
	}
	/**
	 * @Description: 属性 attachmentType 的get方法 
	 * @return attachmentType
	 */
	public String getAttachmentType() {
		return attachmentType;
	}
	/**
	 * @Description: 属性 attachmentType 的set方法 
	 * @param attachmentType 
	 */
	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}
	//==================toString=====================
	/**
	* <p>Description: AttachmentDTO自动生成的toString方法</p> 
	* @author Guo  Yuchao   
	* @date 2015-1-7 下午7:11:58 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "AttachmentDTO [id=" + id + ", displayName=" + displayName
				+ ", attachmentId=" + attachmentId + ", attachmentName="
				+ attachmentName + ", attachmentSize=" + attachmentSize
				+ ", attachmentUrl=" + attachmentUrl + ", updateId=" + updateId
				+ ", updateName=" + updateName + ", createId=" + createId
				+ ", createName=" + createName + ", shareType=" + shareType
				+ ", attachmentType=" + attachmentType + "]";
	}

}
