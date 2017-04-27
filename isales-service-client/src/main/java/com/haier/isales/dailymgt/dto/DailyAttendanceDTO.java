/**
* @Company 青鸟软通   
* @Title: DailyAttendanceDTO.java 
* @Package com.haier.isales.dailymgt.dto 
* @author Huang  nana   
* @date 2015-1-26 下午6:33:22 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.dto;

import java.io.Serializable;

/** 
 * @ClassName: DailyAttendanceDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class DailyAttendanceDTO implements Serializable {

	/** 
	* @Fields serialVersionUID : 版本号
	*/ 
	private static final long serialVersionUID = -6894780095953733926L;
	
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
	* @Fields type : 操作类型,101签到，102签退
	*/
	private String type;
	/** 
	* @Fields signTime : 签到签退时间
	*/
	private java.util.Date signTime;
	/** 
	* @Fields signAddress : 签到签退地点名称
	*/
	private String signAddress;
	/** 
	* @Fields signLongitude : 签到签退地点经度
	*/
	private String signLongitude;
	/** 
	* @Fields signLatitude : 签到签退地点纬度
	*/
	private String signLatitude;
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
	
		
	/** 
	* @Fields userOrgCode : 用户所在中心编码
	* 曹瑞 2015-09-01 增加字段userOrgCode
	* 由于功能特殊性，签到签退功能在上下班时集中使用，并发多导致数据库压力过大，原有的单表存储数据无法满足需求、造成系统卡、慢、接口超时
	* 将原来的t_isales_dailymgt_attendance按中心分为43个表，按照用户所在中心写入相应的表，故需要userOrgCode字段传值
	*/
	private String userOrgCode;
	
	
	/*业务数据*/
	/** 
	* @Fields currentStatu : 签到、签退状态 
	*/ 
	private String currentStatu; 
	/** 
	* @Fields signMessage : 成功返回
	*/ 
	private String signMessage; 
	/** 
	* @Fields dateString : 签到、签退时间 字符串
	*/ 
	private String dateString; 
	/** 
	* @Fields lastedTime : 签退时显示当天工作持续时间
	*/ 
	private String lastedTime; 
	/** 
	* @Fields duration : 签到时常
	*/ 
	private Long duration; 
		
	
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
	 * @Description: 属性 signTime 的get方法 
	 * @return id
	 */
	public java.util.Date getSignTime() {
		return this.signTime;
	}
	/**
	 * @Description: 属性 signTime 的set方法 
	 * @param id 
	 */
	public void setSignTime(java.util.Date signTime) {
		this.signTime = signTime;
	}
	/**
	 * @Description: 属性 signAddress 的get方法 
	 * @return id
	 */
	public String getSignAddress() {
		return this.signAddress;
	}
	/**
	 * @Description: 属性 signAddress 的set方法 
	 * @param id 
	 */
	public void setSignAddress(String signAddress) {
		this.signAddress = signAddress;
	}
	/**
	 * @Description: 属性 signLongitude 的get方法 
	 * @return id
	 */
	public String getSignLongitude() {
		return this.signLongitude;
	}
	/**
	 * @Description: 属性 signLongitude 的set方法 
	 * @param id 
	 */
	public void setSignLongitude(String signLongitude) {
		this.signLongitude = signLongitude;
	}
	/**
	 * @Description: 属性 signLatitude 的get方法 
	 * @return id
	 */
	public String getSignLatitude() {
		return this.signLatitude;
	}
	/**
	 * @Description: 属性 signLatitude 的set方法 
	 * @param id 
	 */
	public void setSignLatitude(String signLatitude) {
		this.signLatitude = signLatitude;
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
	 * @Description: 属性 currentStatu 的get方法 
	 * @return currentStatu
	 */
	public String getCurrentStatu() {
		return currentStatu;
	}
	/**
	 * @Description: 属性 currentStatu 的set方法 
	 * @param currentStatu 
	 */
	public void setCurrentStatu(String currentStatu) {
		this.currentStatu = currentStatu;
	}
	/**
	 * @Description: 属性 signMessage 的get方法 
	 * @return signMessage
	 */
	public String getSignMessage() {
		return signMessage;
	}
	/**
	 * @Description: 属性 signMessage 的set方法 
	 * @param signMessage 
	 */
	public void setSignMessage(String signMessage) {
		this.signMessage = signMessage;
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
	 * @Description: 属性 lastedTime 的get方法 
	 * @return lastedTime
	 */
	public String getLastedTime() {
		return lastedTime;
	}
	/**
	 * @Description: 属性 lastedTime 的set方法 
	 * @param lastedTime 
	 */
	public void setLastedTime(String lastedTime) {
		this.lastedTime = lastedTime;
	}
	/**
	 * @Description: 属性 duration 的get方法 
	 * @return duration
	 */
	public Long getDuration() {
		return duration;
	}
	/**
	 * @Description: 属性 duration 的set方法 
	 * @param duration 
	 */
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public String getUserOrgCode() {
		return userOrgCode;
	}
	public void setUserOrgCode(String userOrgCode) {
		this.userOrgCode = userOrgCode;
	}
	
}
