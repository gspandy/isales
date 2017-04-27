/**
* @Company 青鸟软通   
* @Title: ReminderDzdtDTO.java 
* @Package com.haier.isales.reminder.dto 
* @author Cao Rui   
* @date 2015年06月15日  17:22:59 
* @version V1.0   
*/ 
package com.haier.isales.reminder.dto;

import java.io.Serializable;

/** 
 * @ClassName: ReminderDzdtDomain 
 * @Description: t_isales_reminder_dzdt 自动生成的对应的实体对象   
 *  
 */
public class ReminderDzdtDTO implements Serializable{
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
	* @Fields result : 审核结果。1审核通过，0审核不通过
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
	 * @Description: 属性 operatorId 的get方法 
	 * @return id
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	/**
	 * @Description: 属性 operatorId 的set方法 
	 * @param id 
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * @Description: 属性 userCode 的get方法 
	 * @return id
	 */
	public String getUserCode() {
		return this.userCode;
	}
	/**
	 * @Description: 属性 userCode 的set方法 
	 * @param id 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * @Description: 属性 userName 的get方法 
	 * @return id
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * @Description: 属性 userName 的set方法 
	 * @param id 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @Description: 属性 shopCode 的get方法 
	 * @return id
	 */
	public String getShopCode() {
		return this.shopCode;
	}
	/**
	 * @Description: 属性 shopCode 的set方法 
	 * @param id 
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}
	/**
	 * @Description: 属性 shopName 的get方法 
	 * @return id
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * @Description: 属性 shopName 的set方法 
	 * @param id 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * @Description: 属性 result 的get方法 
	 * @return id
	 */
	public String getResult() {
		return this.result;
	}
	/**
	 * @Description: 属性 result 的set方法 
	 * @param id 
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * @Description: 属性 reason 的get方法 
	 * @return id
	 */
	public String getReason() {
		return this.reason;
	}
	/**
	 * @Description: 属性 reason 的set方法 
	 * @param id 
	 */
	public void setReason(String reason) {
		this.reason = reason;
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

	/*==================== toString() ====================*/
	/**
	* <p>Description:ReminderDzdtDTO 自动生成的toString方法 </p> 
	* @author Guo Yuchao  
	* @date 2015年06月15日  17:22:59 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ReminderDzdtDTO [" +
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
