/**
* @Company 青鸟软通   
* @Title: AbnormalLogDomain.java 
* @Package com.haier.isales.dailymgt.abnormal.domain 
* @author lizhenwei   
* @date 2015年11月06日  09:45:12 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.abnormal.domain;

import java.io.Serializable;

/** 
 * @ClassName: AbnormalLogDomain 
 * @Description: t_isales_dailymgt_abnormal_log 自动生成的对应的实体对象   
 *  
 */
public class AbnormalLogDomain implements Serializable{
	private static final long serialVersionUID = -1446774312001L;

	/** 
	* @Fields id : 主键ID，自动递增，无实际意义
	*/
	private Long id;
	/** 
	* @Fields userCode : 工号
	*/
	private String userCode;
	/** 
	* @Fields attendanceMonth : 考勤月份
	*/
	private String attendanceMonth;
	/** 
	* @Fields type : 考勤类型 101为签到， 102为签退
	*/
	private String type;
	/** 
	* @Fields reason : 异常原因
	*/
	private String reason;
	/** 
	* @Fields signTime : 签到签退时间
	*/
	private java.util.Date signTime;
	/** 
	* @Fields createTime : 创建时间
	*/
	private java.util.Date createTime;
		
	
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
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: AbnormalLogDomain 自动生成的hashcode方法</p> 
	* @author lizhenwei   
	* @date 2015年11月06日  09:45:12
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
	* <p>Description:AbnormalLogDomain 自动生成的equals方法 </p> 
	* @author lizhenwei   
	* @date 2015年11月06日  09:45:12
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbnormalLogDomain other =(AbnormalLogDomain) obj;
		if (id == null) {if (other.id != null){ return false;} else if (!id.equals(other.id)){ return false;}}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:AbnormalLogDomain 自动生成的toString方法 </p> 
	* @author lizhenwei   
	* @date 2015年11月06日  09:45:12 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "AbnormalLogDomain [" +
					"id=" + id + "," + 
					"userCode=" + userCode + "," + 
					"attendanceMonth=" + attendanceMonth + "," + 
					"type=" + type + "," + 
					"reason=" + reason + "," + 
					"signTime=" + signTime + "," + 
					"createTime=" + createTime + "," + 
				"]";
	}
	
	
}
