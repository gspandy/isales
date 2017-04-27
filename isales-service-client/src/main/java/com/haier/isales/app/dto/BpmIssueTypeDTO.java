/**
* @Company 青鸟软通   
* @Title: BpmIssueTypeDomain.java 
* @Package com.haier.isales.app.bpmissuetype.domain 
* @author Guo  Yuchao   
* @date 2015年01月28日  21:41:48 
* @version V1.0   
*/ 
package com.haier.isales.app.dto;

import java.io.Serializable;

/** 
 * @ClassName: BpmIssueTypeDTO
 * @Description: 自动生成的对应的实体对象   
 *  
 */
public class BpmIssueTypeDTO implements Serializable{
	private static final long serialVersionUID = -1422451908329L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Long id;
	/** 
	* @Fields highClass : 问题大类
	*/
	private String highClass;
	/** 
	* @Fields smallClass : 问题小类
	*/
	private String smallClass;
	/** 
	* @Fields proLine : 产品组
	*/
	private String proLine;
	/** 
	* @Fields buCode : BU
	*/
	private String buCode;
	/** 
	* @Fields channel : 渠道
	*/
	private String channel;
	/** 
	* @Fields zid : ZID,意义不明
	*/
	private String zid;
	/** 
	* @Fields createTime : 创建时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
	/** 
	* @Fields issueTypeKey : 查询的种类 BpmIssueTypeEnum中定义
	*/ 
	private String issueTypeKey;
	/*=========================getter and setter ===================*/
	
	/**
	 * @Description: 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * @Description: 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @Description: 属性 highClass 的get方法 
	 * @return id
	 */
	public String getHighClass() {
		return this.highClass;
	}
	/**
	 * @Description: 属性 highClass 的set方法 
	 * @param id 
	 */
	public void setHighClass(String highClass) {
		this.highClass = highClass;
	}
	/**
	 * @Description: 属性 smallClass 的get方法 
	 * @return id
	 */
	public String getSmallClass() {
		return this.smallClass;
	}
	/**
	 * @Description: 属性 smallClass 的set方法 
	 * @param id 
	 */
	public void setSmallClass(String smallClass) {
		this.smallClass = smallClass;
	}
	/**
	 * @Description: 属性 proLine 的get方法 
	 * @return id
	 */
	public String getProLine() {
		return this.proLine;
	}
	/**
	 * @Description: 属性 proLine 的set方法 
	 * @param id 
	 */
	public void setProLine(String proLine) {
		this.proLine = proLine;
	}
	/**
	 * @Description: 属性 buCode 的get方法 
	 * @return id
	 */
	public String getBuCode() {
		return this.buCode;
	}
	/**
	 * @Description: 属性 buCode 的set方法 
	 * @param id 
	 */
	public void setBuCode(String buCode) {
		this.buCode = buCode;
	}
	/**
	 * @Description: 属性 channel 的get方法 
	 * @return id
	 */
	public String getChannel() {
		return this.channel;
	}
	/**
	 * @Description: 属性 channel 的set方法 
	 * @param id 
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}
	/**
	 * @Description: 属性 zid 的get方法 
	 * @return id
	 */
	public String getZid() {
		return this.zid;
	}
	/**
	 * @Description: 属性 zid 的set方法 
	 * @param id 
	 */
	public void setZid(String zid) {
		this.zid = zid;
	}
	/**
	 * @Description: 属性 createTime 的get方法 
	 * @return id
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * @Description: 属性 createTime 的set方法 
	 * @param id 
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @Description: 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * @Description: 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @Description: 属性 issueTypeKey 的get方法 
	 * @param id 
	 */
	public String getIssueTypeKey() {
		return issueTypeKey;
	}
	/**
	 * @Description: 属性 issueTypeKey 的set方法 
	 * @param id 
	 */
	public void setIssueTypeKey(String issueTypeKey) {
		this.issueTypeKey = issueTypeKey;
	}
	
	/**
	* <p>Description:BpmIssueTypeDTO自动生成的toString方法 </p> 
	* @author Guo Yuchao   
    * @date 2015年01月28日  21:41:48 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "BpmIssueTypeDTO [id=" + id + ", highClass=" + highClass
				+ ", smallClass=" + smallClass + ", proLine=" + proLine
				+ ", buCode=" + buCode + ", channel=" + channel + ", zid="
				+ zid + ", createTime=" + createTime + ", remark=" + remark
				+ ", issueTypeKey=" + issueTypeKey + "]";
	}

	
	
}
