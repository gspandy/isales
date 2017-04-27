/**
* @Company 青鸟软通   
* @Title: AttendSummary.java 
* @Package com.haier.isales.dailymgt.dto 
* @author Guo  Yuchao   
* @date 2015-2-5 下午4:57:38 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.dto;

import java.io.Serializable;
import java.util.List;

/** 
 * @ClassName: AttendSummary 
 * @Description:  
 *  
 */
public class AttendSummary implements Serializable {

	private static final long serialVersionUID = 1177741581814964074L;
	
	private List<AttendInfoDTO> attendInfoList;
	private Integer signSuccessDays;  //指定月份签到成功天数
	private Integer signFilaureDays;  //指定月份签到失败天数
	private Integer offDutyDays;  //指定月份休假天数
	public AttendSummary() {
		super();
	}
	
	public AttendSummary(List<AttendInfoDTO> attendInfoList,
			Integer signSuccessDays, Integer signFilaureDays,
			Integer offDutyDays) {
		super();
		this.attendInfoList = attendInfoList;
		this.signSuccessDays = signSuccessDays;
		this.signFilaureDays = signFilaureDays;
		this.offDutyDays = offDutyDays;
	}
	
	//=============getters & setters===================
	/**
	 * @Description: 属性 attendInfoList 的get方法 
	 * @return attendInfoList
	 */
	public List<AttendInfoDTO> getAttendInfoList() {
		return attendInfoList;
	}

	/**
	 * @Description: 属性 attendInfoList 的set方法 
	 * @param attendInfoList 
	 */
	public void setAttendInfoList(List<AttendInfoDTO> attendInfoList) {
		this.attendInfoList = attendInfoList;
	}

	/**
	 * @Description: 属性 signSuccessDays 的get方法 
	 * @return signSuccessDays
	 */
	public Integer getSignSuccessDays() {
		return signSuccessDays;
	}

	/**
	 * @Description: 属性 signSuccessDays 的set方法 
	 * @param signSuccessDays 
	 */
	public void setSignSuccessDays(Integer signSuccessDays) {
		this.signSuccessDays = signSuccessDays;
	}

	/**
	 * @Description: 属性 signFilaureDays 的get方法 
	 * @return signFilaureDays
	 */
	public Integer getSignFilaureDays() {
		return signFilaureDays;
	}

	/**
	 * @Description: 属性 signFilaureDays 的set方法 
	 * @param signFilaureDays 
	 */
	public void setSignFilaureDays(Integer signFilaureDays) {
		this.signFilaureDays = signFilaureDays;
	}

	/**
	 * @Description: 属性 offDutyDays 的get方法 
	 * @return offDutyDays
	 */
	public Integer getOffDutyDays() {
		return offDutyDays;
	}

	/**
	 * @Description: 属性 offDutyDays 的set方法 
	 * @param offDutyDays 
	 */
	public void setOffDutyDays(Integer offDutyDays) {
		this.offDutyDays = offDutyDays;
	}
	
	//=====================toString=====================
	/**
	* <p>Description: </p> 
	* @author Guo  Yuchao   
	* @date 2015-2-5 下午4:57:38 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "AttendSummary [attendInfoList=" + attendInfoList
				+ ", signSuccessDays=" + signSuccessDays + ", signFilaureDays="
				+ signFilaureDays + ", offDutyDays=" + offDutyDays + "]";
	}
}
