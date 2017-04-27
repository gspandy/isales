/**
* @Company 青鸟软通   
* @Title: DailyOffdutyDTO.java 
* @Package com.haier.isales.dailymgt.dto 
* @author Huang  nana   
* @date 2015-1-27 上午11:30:38 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.dto;

import java.io.Serializable;

/** 
 * @ClassName: DailyOffdutyDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class DailyOffdutyDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 6467041728714277906L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Long id;
	/** 
	* @Fields operatorId : 用户id
	*/
	private Long operatorId;
	/** 
	* @Fields userCode : 员工号
	*/
	private String userCode;
	/** 
	* @Fields userName : 员工姓名
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
	* @Fields offdutyDate : 休班日期
	*/
	private java.util.Date offdutyDate;
	/** 
	* @Fields status : 状态，101有效，102无效
	*/
	private String status;
	/** 
	* @Fields createTime : 创建时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields createId : 创建人
	*/
	private Long createId;
	/** 
	* @Fields createName : 创建人姓名
	*/
	private String createName;
	/** 
	* @Fields updateTime : 修改时间
	*/
	private java.util.Date updateTime;
	/** 
	* @Fields updateId : 修改人
	*/
	private Long updateId;
	/** 
	* @Fields updateName : 修改人姓名
	*/
	private String updateName;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
	
	/*业务参数*/
	/** 
	* @Fields queryTime : 查询时间
	*/ 
	private String queryTime;
	
	/** 
	* @Fields dutyMessage : 返回信息
	*/ 
	private String dutyMessage;
	
	/** 
	* @Fields dateString : 字符串类型的日期 
	*/ 
	private String dateString;
	
	/** 
	* @Fields canDelete : 是否可以取消休班
	*/ 
	private String canDelete;
	
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
	 * @Description: 属性 offdutyDate 的get方法 
	 * @return id
	 */
	public java.util.Date getOffdutyDate() {
		return this.offdutyDate;
	}
	/**
	 * @Description: 属性 offdutyDate 的set方法 
	 * @param id 
	 */
	public void setOffdutyDate(java.util.Date offdutyDate) {
		this.offdutyDate = offdutyDate;
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
	 * @Description: 属性 createId 的get方法 
	 * @return id
	 */
	public Long getCreateId() {
		return this.createId;
	}
	/**
	 * @Description: 属性 createId 的set方法 
	 * @param id 
	 */
	public void setCreateId(Long createId) {
		this.createId = createId;
	}
	/**
	 * @Description: 属性 createName 的get方法 
	 * @return id
	 */
	public String getCreateName() {
		return this.createName;
	}
	/**
	 * @Description: 属性 createName 的set方法 
	 * @param id 
	 */
	public void setCreateName(String createName) {
		this.createName = createName;
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
	 * @Description: 属性 updateId 的get方法 
	 * @return id
	 */
	public Long getUpdateId() {
		return this.updateId;
	}
	/**
	 * @Description: 属性 updateId 的set方法 
	 * @param id 
	 */
	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}
	/**
	 * @Description: 属性 updateName 的get方法 
	 * @return id
	 */
	public String getUpdateName() {
		return this.updateName;
	}
	/**
	 * @Description: 属性 updateName 的set方法 
	 * @param id 
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
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
	 * @Description: 属性 queryTime 的get方法 
	 * @return queryTime
	 */
	public String getQueryTime() {
		return queryTime;
	}
	/**
	 * @Description: 属性 queryTime 的set方法 
	 * @param queryTime 
	 */
	public void setQueryTime(String queryTime) {
		this.queryTime = queryTime;
	}
	/**
	 * @Description: 属性 dutyMessage 的get方法 
	 * @return dutyMessage
	 */
	public String getDutyMessage() {
		return dutyMessage;
	}
	/**
	 * @Description: 属性 dutyMessage 的set方法 
	 * @param dutyMessage 
	 */
	public void setDutyMessage(String dutyMessage) {
		this.dutyMessage = dutyMessage;
	}
	/**
	 * @Description: 属性 dateString 的get方法 
	 * @return dateString
	 */
	public String getDateString() {
		return dateString;
	}
	/**
	 * @Description: 属性 dateString 的set方法 
	 * @param dateString 
	 */
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
	/**
	 * @Description: 属性 canDelete 的get方法 
	 * @return canDelete
	 */
	public String getCanDelete() {
		return canDelete;
	}
	/**
	 * @Description: 属性 canDelete 的set方法 
	 * @param canDelete 
	 */
	public void setCanDelete(String canDelete) {
		this.canDelete = canDelete;
	}
}
