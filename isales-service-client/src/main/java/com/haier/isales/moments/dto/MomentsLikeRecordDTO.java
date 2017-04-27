/**
* @Company 青鸟软通   
* @Title: MomentsLikeRecordDTO.java 
* @Package com.haier.isales.moments.dto 
* @author Cao Rui   
* @date 2014-11-20 下午12:58:30 
* @version V1.0   
*/ 
package com.haier.isales.moments.dto;

import java.io.Serializable;

/** 
 * @ClassName: MomentsLikeRecordDTO 
 * @Description: 
 *  
 */
public class MomentsLikeRecordDTO implements Serializable{
	private static final long serialVersionUID = -1416364784242L;

	/** 
	* @Fields id : 
	*/
	private Long id;
	/** 
	* @Fields momentsId : 内容
	*/
	private Long momentsId;
	/** 
	* @Fields operatorId : 操作用户id
	*/
	private Long operatorId;
	/** 
	* @Fields type : 类型,101: 点赞，102点踩
	*/
	private String type;
	/** 
	* @Fields status : 状态,101:有效，102:无效
	*/
	private String status;
	/** 
	* @Fields createTime : 添加时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields updateTime : 修改时间
	*/
	private java.util.Date updateTime;
	/** 
	* @Fields statusBefore : 更改前状态
	*/ 
	private String statusBefore;
	/** 
	* @Fields statusAfter : 更改后状态
	*/ 
	private String statusAfter;
		
	
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
	 * @Description: 属性 momentsId 的get方法 
	 * @return id
	 */
	public Long getMomentsId() {
		return this.momentsId;
	}
	/**
	 * @Description: 属性 momentsId 的set方法 
	 * @param id 
	 */
	public void setMomentsId(Long momentsId) {
		this.momentsId = momentsId;
	}
	/**
	 * @Description: 属性 operatorId 的get方法 
	 * @return id
	 */
	public Long getOperatorId() {
		return this.operatorId;
	}
	/**
	 * @Description: 属性 operatorId 的set方法 
	 * @param id 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * @Description: 属性 type 的get方法 
	 * @return id
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * @Description: 属性 type 的set方法 
	 * @param id 
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @Description: 属性 status 的get方法 
	 * @return id
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * @Description: 属性 status 的set方法 
	 * @param id 
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * @Description: 属性 updateTime 的get方法 
	 * @return id
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * @Description: 属性 updateTime 的set方法 
	 * @param id 
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @Description: 属性 statusBefore 的get方法 
	 * @return statusBefore
	 */
	public String getStatusBefore() {
		return statusBefore;
	}
	/**
	 * @Description: 属性 statusBefore 的set方法 
	 * @param statusBefore 
	 */
	public void setStatusBefore(String statusBefore) {
		this.statusBefore = statusBefore;
	}
	/**
	 * @Description: 属性 statusAfter 的get方法 
	 * @return statusAfter
	 */
	public String getStatusAfter() {
		return statusAfter;
	}
	/**
	 * @Description: 属性 statusAfter 的set方法 
	 * @param statusAfter 
	 */
	public void setStatusAfter(String statusAfter) {
		this.statusAfter = statusAfter;
	}
	
	/*===============toString=================*/
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:05:49 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "MomentsLikeRecordDTO [id=" + id + ", momentsId=" + momentsId
				+ ", operatorId=" + operatorId + ", type=" + type + ", status="
				+ status + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", statusBefore=" + statusBefore
				+ ", statusAfter=" + statusAfter + "]";
	}
}
