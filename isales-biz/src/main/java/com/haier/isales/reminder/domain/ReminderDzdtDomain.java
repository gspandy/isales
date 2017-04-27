/**
* @Company 青鸟软通   
* @Title: ReminderDzdtDomain.java 
* @Package com.haier.isales.reminder.domain 
* @author Cao Rui   
* @date 2015年06月15日  17:12:59 
* @version V1.0   
*/ 
package com.haier.isales.reminder.domain;

import java.io.Serializable;

/** 
 * @ClassName: ReminderDzdtDomain 
 * t_isales_reminder_dzdt 自动生成的对应的实体对象   
 *  
 */
public class ReminderDzdtDomain implements Serializable{
	private static final long serialVersionUID = -1434359579167L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Long id;
	/** 
	* @Fields operatorId : 用户id
	*/
	private String operatorId;
	/** 
	* @Fields userCode : 用户工号
	*/
	private String userCode;
	/** 
	* @Fields userName : 用户姓名
	*/
	private String userName;
	/** 
	* @Fields shopCode : 门店编码
	*/
	private String shopCode;
	/** 
	* @Fields shopName : 门店名称
	*/
	private String shopName;
	/** 
	* @Fields results : 审核结果。1审核通过，0审核不通过
	*/
	private String result;
	/** 
	* @Fields reason : 不通过原因
	*/
	private String reason;
	/** 
	* @Fields status : 状态，101：新建；102：已通知
	*/
	private String status;
	/** 
	* @Fields updateTime : 修改时间
	*/
	private java.util.Date updateTime;
	/** 
	* @Fields createTime : 创建时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
		
	
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
	 * 属性 operatorId 的get方法 
	 * @return id
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	/**
	 * 属性 operatorId 的set方法 
	 * @param id 
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * 属性 userCode 的get方法 
	 * @return id
	 */
	public String getUserCode() {
		return this.userCode;
	}
	/**
	 * 属性 userCode 的set方法 
	 * @param id 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * 属性 userName 的get方法 
	 * @return id
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * 属性 userName 的set方法 
	 * @param id 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 属性 shopCode 的get方法 
	 * @return id
	 */
	public String getShopCode() {
		return this.shopCode;
	}
	/**
	 * 属性 shopCode 的set方法 
	 * @param id 
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}
	/**
	 * 属性 shopName 的get方法 
	 * @return id
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * 属性 shopName 的set方法 
	 * @param id 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * 属性 results 的get方法 
	 * @return id
	 */
	public String getResult() {
		return this.result;
	}
	/**
	 * 属性 results 的set方法 
	 * @param id 
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * 属性 reason 的get方法 
	 * @return id
	 */
	public String getReason() {
		return this.reason;
	}
	/**
	 * 属性 reason 的set方法 
	 * @param id 
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * 属性 status 的get方法 
	 * @return id
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * 属性 status 的set方法 
	 * @param id 
	 */
	public void setStatus(String status) {
		this.status = status;
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
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: ReminderDzdtDomain 自动生成的hashcode方法</p> 
	* @author Cao Rui   
	* @date 2015年06月15日  17:12:59
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int resultCode = 1;
		resultCode = prime * resultCode+ ((id == null) ? 0 : id.hashCode());
		return resultCode;
	}
	/**
	* <p>Description:ReminderDzdtDomain 自动生成的equals方法 </p> 
	* @author Cao Rui   
	* @date 2015年06月15日  17:12:59
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
		ReminderDzdtDomain other =(ReminderDzdtDomain) obj;
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
	* <p>Description:ReminderDzdtDomain 自动生成的toString方法 </p> 
	* @author Cao Rui   
	* @date 2015年06月15日  17:12:59 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ReminderDzdtDomain [" +
					"id=" + id + "," + 
					"operatorId=" + operatorId + "," + 
					"userCode=" + userCode + "," + 
					"userName=" + userName + "," + 
					"shopCode=" + shopCode + "," + 
					"shopName=" + shopName + "," + 
					"result=" + result + "," + 
					"reason=" + reason + "," + 
					"status=" + status + "," + 
					"updateTime=" + updateTime + "," + 
					"createTime=" + createTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
