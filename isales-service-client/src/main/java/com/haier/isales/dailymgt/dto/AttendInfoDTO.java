/**
* @Company 青鸟软通   
* @Title: AttendInfoDTO.java 
* @Package com.haier.isales.dailymgt.dto 
* @author Guo  Yuchao   
* @date 2015-2-2 下午6:47:44 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.dto;

import java.io.Serializable;

/** 
 * @ClassName: AttendInfoDTO 
 * @Description: 查询签到信息 
 *  
 */
public class AttendInfoDTO implements Serializable {

	private static final long serialVersionUID = 8465255875166465171L;
	
	private String signDate;  //签到时间
	private String signType;  //签到结果
	private String signResult;  //签到结果描述
	private int signLevel;  //签到级别
	private String signInTime;  //签到时间
	private String signOutTime;  //签退时间
	private String workTime;  //工作时长
	private int signSuccessDays;  //指定月份签到成功天数
	private int signFilaureDays;  //指定月份签到失败天数
	private int offDutyDays;  //指定月份休假天数
	public AttendInfoDTO() {
		super();
	}
	
	//================getters & setters=====================
	/**
	 * @Description: 属性 signDate 的get方法 
	 * @return signDate
	 */
	public String getSignDate() {
		return signDate;
	}

	/**
	 * @Description: 属性 signDate 的set方法 
	 * @param signDate 
	 */
	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}

	/**
	 * @Description: 属性 signType 的get方法 
	 * @return signType
	 */
	public String getSignType() {
		return signType;
	}

	/**
	 * @Description: 属性 signType 的set方法 
	 * @param signType 
	 */
	public void setSignType(String signType) {
		this.signType = signType;
	}

	/**
	 * @Description: 属性 signResult 的get方法 
	 * @return signResult
	 */
	public String getSignResult() {
		return signResult;
	}

	/**
	 * @Description: 属性 signResult 的set方法 
	 * @param signResult 
	 */
	public void setSignResult(String signResult) {
		this.signResult = signResult;
	}

	/**
	 * @Description: 属性 signLevel 的get方法 
	 * @return signLevel
	 */
	public int getSignLevel() {
		return signLevel;
	}

	/**
	 * @Description: 属性 signLevel 的set方法 
	 * @param signLevel 
	 */
	public void setSignLevel(int signLevel) {
		this.signLevel = signLevel;
	}

	/**
	 * @Description: 属性 signInTime 的get方法 
	 * @return signInTime
	 */
	public String getSignInTime() {
		return signInTime;
	}

	/**
	 * @Description: 属性 signInTime 的set方法 
	 * @param signInTime 
	 */
	public void setSignInTime(String signInTime) {
		this.signInTime = signInTime;
	}

	/**
	 * @Description: 属性 signOutTime 的get方法 
	 * @return signOutTime
	 */
	public String getSignOutTime() {
		return signOutTime;
	}

	/**
	 * @Description: 属性 signOutTime 的set方法 
	 * @param signOutTime 
	 */
	public void setSignOutTime(String signOutTime) {
		this.signOutTime = signOutTime;
	}

	/**
	 * @Description: 属性 workTime 的get方法 
	 * @return workTime
	 */
	public String getWorkTime() {
		return workTime;
	}

	/**
	 * @Description: 属性 workTime 的set方法 
	 * @param workTime 
	 */
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	/**
	 * @Description: 属性 signSuccessDays 的get方法 
	 * @return signSuccessDays
	 */
	public int getSignSuccessDays() {
		return signSuccessDays;
	}

	/**
	 * @Description: 属性 signSuccessDays 的set方法 
	 * @param signSuccessDays 
	 */
	public void setSignSuccessDays(int signSuccessDays) {
		this.signSuccessDays = signSuccessDays;
	}

	/**
	 * @Description: 属性 signFilaureDays 的get方法 
	 * @return signFilaureDays
	 */
	public int getSignFilaureDays() {
		return signFilaureDays;
	}

	/**
	 * @Description: 属性 signFilaureDays 的set方法 
	 * @param signFilaureDays 
	 */
	public void setSignFilaureDays(int signFilaureDays) {
		this.signFilaureDays = signFilaureDays;
	}

	/**
	 * @Description: 属性 offDutyDays 的get方法 
	 * @return offDutyDays
	 */
	public int getOffDutyDays() {
		return offDutyDays;
	}

	/**
	 * @Description: 属性 offDutyDays 的set方法 
	 * @param offDutyDays 
	 */
	public void setOffDutyDays(int offDutyDays) {
		this.offDutyDays = offDutyDays;
	}
	//===============toString======================
	/**
	* <p>Description: AttendInfoDTO自动生成的toString方法</p> 
	* @author Guo  Yuchao   
	* @date 2015-2-2 下午6:47:44 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "AttendInfoDTO [signDate=" + signDate + ", signType=" + signType
				+ ", signResult=" + signResult + ", signLevel=" + signLevel
				+ ", signInTime=" + signInTime + ", signOutTime=" + signOutTime
				+ ", workTime=" + workTime + ", signSuccessDays="
				+ signSuccessDays + ", signFilaureDays=" + signFilaureDays
				+ ", offDutyDays=" + offDutyDays + "]";
	}
}
