/**
* @Company 青鸟软通   
* @Title: BpmIssueTypeDomain.java 
* @Package com.haier.isales.app.bpmissuetype.domain 
* @author Guo Yuchao   
* @date 2015年01月28日  21:31:48 
* @version V1.0   
*/ 
package com.haier.isales.app.bpmissuetype.domain;

import java.io.Serializable;

/** 
 * @ClassName: BpmIssueTypeDomain 
 * t_isales_bpm_issue_type 自动生成的对应的实体对象   
 *  
 */
public class BpmIssueTypeDomain implements Serializable{
	private static final long serialVersionUID = -1422451908329L;

	private Long id;		//主键，无实际意义
	
	private String highClass;	//问题大类

	private String smallClass;	//问题小类

	private String proLine;	// 产品组

	private String buCode;	//BU

	private String channel;	//渠道

	private String zid;	//ZID,意义不明

	private java.util.Date createTime;	//创建时间

	private String remark;	//备注

	private String issueTypeKey;	//查询的种类 BpmIssueTypeEnum中定义
	
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
	 * 属性 highClass 的get方法 
	 * @return id
	 */
	public String getHighClass() {
		return this.highClass;
	}
	/**
	 * 属性 highClass 的set方法 
	 * @param id 
	 */
	public void setHighClass(String highClass) {
		this.highClass = highClass;
	}
	/**
	 * 属性 smallClass 的get方法 
	 * @return id
	 */
	public String getSmallClass() {
		return this.smallClass;
	}
	/**
	 * 属性 smallClass 的set方法 
	 * @param id 
	 */
	public void setSmallClass(String smallClass) {
		this.smallClass = smallClass;
	}
	/**
	 * 属性 proLine 的get方法 
	 * @return id
	 */
	public String getProLine() {
		return this.proLine;
	}
	/**
	 * 属性 proLine 的set方法 
	 * @param id 
	 */
	public void setProLine(String proLine) {
		this.proLine = proLine;
	}
	/**
	 * 属性 buCode 的get方法 
	 * @return id
	 */
	public String getBuCode() {
		return this.buCode;
	}
	/**
	 * 属性 buCode 的set方法 
	 * @param id 
	 */
	public void setBuCode(String buCode) {
		this.buCode = buCode;
	}
	/**
	 * 属性 channel 的get方法 
	 * @return id
	 */
	public String getChannel() {
		return this.channel;
	}
	/**
	 * 属性 channel 的set方法 
	 * @param id 
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}
	/**
	 * 属性 zid 的get方法 
	 * @return id
	 */
	public String getZid() {
		return this.zid;
	}
	/**
	 * 属性 zid 的set方法 
	 * @param id 
	 */
	public void setZid(String zid) {
		this.zid = zid;
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
	 * 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getIssueTypeKey() {
		return issueTypeKey;
	}
	public void setIssueTypeKey(String issueTypeKey) {
		this.issueTypeKey = issueTypeKey;
	}
/*====================hashCode and equals ====================*/
/**
	* <p>Description: BpmIssueTypeDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2015年01月28日  21:31:48
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
	* <p>Description:BpmIssueTypeDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2015年01月28日  21:31:48
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		BpmIssueTypeDomain other =(BpmIssueTypeDomain) obj;
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
	@Override
	public String toString() {
		return "BpmIssueTypeDomain [id=" + id + ", highClass=" + highClass
				+ ", smallClass=" + smallClass + ", proLine=" + proLine
				+ ", buCode=" + buCode + ", channel=" + channel + ", zid="
				+ zid + ", createTime=" + createTime + ", remark=" + remark
				+ ", issueTypeKey=" + issueTypeKey + "]";
	}
	
		
	
	
	
}
