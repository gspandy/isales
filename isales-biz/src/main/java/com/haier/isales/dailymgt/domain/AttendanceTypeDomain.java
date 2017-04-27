/**
* @Company 青鸟软通   
* @Title: AttendanceTypeDomain.java 
* @Package com.haier.isales.dailymgt.domain 
* @author GuoYuchao  
* @date 2015-2-2 17:17:52
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: AttendanceTypeDomain 
 * t_isales_dailymgt_attendance 自动生成的对应的实体对象   
 *  
 */
public class AttendanceTypeDomain implements Serializable{
	private static final long serialVersionUID = -1422269562622L;

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
	* @Fields signStatus : 签到标志   在AttendanceTypeEnum中维护
	*/ 
	private String signStatus; 
	/** 
	* @Fields signDate : 签到时间
	*/ 
	private String signDate;
	private Date signInTime;//签到时间
	private Date signOutTime;//签退时间
	private Long workTime;//工作时长
	public AttendanceTypeDomain() {
		super();
	}
	public Long getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSignStatus() {
		return signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignDate() {
		return signDate;
	}
	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}
	public Date getSignInTime() {
		return signInTime;
	}
	public void setSignInTime(Date signInTime) {
		this.signInTime = signInTime;
	}
	public Date getSignOutTime() {
		return signOutTime;
	}
	public void setSignOutTime(Date signOutTime) {
		this.signOutTime = signOutTime;
	}
	public Long getWorkTime() {
		return workTime;
	}
	public void setWorkTime(Long workTime) {
		this.workTime = workTime;
	}
	@Override
	public String toString() {
		return "AttendanceTypeDomain [operatorId=" + operatorId + ", userCode="
				+ userCode + ", userName=" + userName + ", signStatus="
				+ signStatus + ", signDate=" + signDate + ", workTime="
				+ workTime + "]";
	}
}
