/**
* @Company 青鸟软通   
* @Title: AttendabnormalDomain.java 
* @Package com.haier.isales.dailymgt.abnormal.domain 
* @author lizhenwei   
* @date 2015年10月30日  15:08:57 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.dto;

import java.io.Serializable;

/** 
 * @ClassName: AttendabnormalDomain 
 * @Description: t_isales_dailymgt_attendance_abnormal 自动生成的对应的实体对象   
 *  
 */
public class AttendabnormalDTO implements Serializable{
	private static final long serialVersionUID = -1446188937121L;

	/** 
	* @Fields userCode : 员工号
	*/
	private String userCode;
	/** 
	* @Fields userName : 员工名称
	*/
	private String userName;
	/** 
	* @Fields abnormalCount : 考勤最大异常数量
	*/
	private String abnormalCount;
	/** 
	* @Fields type : 类型 101为签到， 102为签退
	*/
	private String type;
	/** 
	* @Fields attendanceMonth : 考勤月份
	*/
	private String attendanceMonth;
	/** 
	* @Fields reason : 异常理由
	*/
	private String reason;
	/** 
	* @Fields strSignTime : 签到签退时间  格式为"yyyy-MM-dd hh:mm:ss"
	*/
	private String strSignTime;
	/** 
	* @Fields signTime : 签到签退时间  
	*/
	private java.util.Date signTime;
	/** 
	* @Fields createTime : 创建时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields updateTime : 更新时间
	*/
	private java.util.Date updateTime;
		
	
	/*=========================getter and setter ===================*/
	
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
	 * @Description: 属性 abnormalCount 的get方法 
	 * @return id
	 */
	public String getAbnormalCount() {
		return this.abnormalCount;
	}
	/**
	 * @Description: 属性 abnormalCount 的set方法 
	 * @param id 
	 */
	public void setAbnormalCount(String abnormalCount) {
		this.abnormalCount = abnormalCount;
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
	 * @Description: 属性 attendanceMonth 的get方法 
	 * @return id
	 */
	public String getAttendanceMonth() {
		return this.attendanceMonth;
	}
	/**
	 * @Description: 属性 attendanceMonth 的set方法 
	 * @param id 
	 */
	public void setAttendanceMonth(String attendanceMonth) {
		this.attendanceMonth = attendanceMonth;
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
	 * @return the strSignTime
	 */
	public String getStrSignTime() {
		return strSignTime;
	}
	/**
	 * @param strSignTime the strSignTime to set
	 */
	public void setStrSignTime(String strSignTime) {
		this.strSignTime = strSignTime;
	}
	/**
	 * @return the signTime
	 */
	public java.util.Date getSignTime() {
		return signTime;
	}
	/**
	 * @param signTime the signTime to set
	 */
	public void setSignTime(java.util.Date signTime) {
		this.signTime = signTime;
	}
	/**
	 * @return the updateTime
	 */
	public java.util.Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
