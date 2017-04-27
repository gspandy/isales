/**
* @Company 青鸟软通   
* @Title: SysMonitorLogDomain.java 
* @Package com.haier.isales.system.monitor.domain 
* @author Liu Wenjie   
* @date 2014年11月19日  11:37:40 
* @version V1.0   
*/ 
package com.haier.isales.system.monitor.domain;

import java.io.Serializable;

/** 
 * @ClassName: SysMonitorLogDomain 
 * t_sys_monitor_log 自动生成的对应的实体对象   
 *  
 */
public class SysMonitorLogDomain implements Serializable{
	private static final long serialVersionUID = -1416368260140L;

	/** 
	* @Fields id : 
	*/
	private Long id;
	/** 
	* @Fields userId : 用户id
	*/
	private Long userId;
	/** 
	* @Fields loginName : 登录名
	*/
	private String loginName;
	/** 
	* @Fields userInfoJson : 用户实体json
	*/
	private String userInfoJson;
	/** 
	* @Fields userIp : 用户ip
	*/
	private String userIp;
	/** 
	* @Fields executeClass : 调用类
	*/
	private String executeClass;
	/** 
	* @Fields executeFunction : 调用的方法名
	*/
	private String executeFunction;
	/** 
	* @Fields executeParamsJson : 调用的参数转为json
	*/
	private String executeParamsJson;
	/** 
	* @Fields startTime : 开始时间
	*/
	private java.util.Date startTime;
	/** 
	* @Fields endTime : 结束时间
	*/
	private java.util.Date endTime;
	/** 
	* @Fields startMillisecond : 开始时间毫秒数
	*/
	private Long startMillisecond;
	/** 
	* @Fields endMillisecond : 结束时间毫秒数
	*/
	private Long endMillisecond;
	/** 
	* @Fields duration : 时长
	*/
	private Long duration;
	/** 
	* @Fields excuteResult : 返回结果
	*/
	private String excuteResult;
	/** 
	* @Fields excuteException : 异常信息
	*/
	private String excuteException;
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
	 * 属性 userId 的get方法 
	 * @return id
	 */
	public Long getUserId() {
		return this.userId;
	}
	/**
	 * 属性 userId 的set方法 
	 * @param id 
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 属性 loginName 的get方法 
	 * @return id
	 */
	public String getLoginName() {
		return this.loginName;
	}
	/**
	 * 属性 loginName 的set方法 
	 * @param id 
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	/**
	 * 属性 userInfoJson 的get方法 
	 * @return id
	 */
	public String getUserInfoJson() {
		return this.userInfoJson;
	}
	/**
	 * 属性 userInfoJson 的set方法 
	 * @param id 
	 */
	public void setUserInfoJson(String userInfoJson) {
		this.userInfoJson = userInfoJson;
	}
	/**
	 * 属性 userIp 的get方法 
	 * @return id
	 */
	public String getUserIp() {
		return this.userIp;
	}
	/**
	 * 属性 userIp 的set方法 
	 * @param id 
	 */
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	/**
	 * 属性 executeClass 的get方法 
	 * @return id
	 */
	public String getExecuteClass() {
		return this.executeClass;
	}
	/**
	 * 属性 executeClass 的set方法 
	 * @param id 
	 */
	public void setExecuteClass(String executeClass) {
		this.executeClass = executeClass;
	}
	/**
	 * 属性 executeFunction 的get方法 
	 * @return id
	 */
	public String getExecuteFunction() {
		return this.executeFunction;
	}
	/**
	 * 属性 executeFunction 的set方法 
	 * @param id 
	 */
	public void setExecuteFunction(String executeFunction) {
		this.executeFunction = executeFunction;
	}
	/**
	 * 属性 executeParamsJson 的get方法 
	 * @return id
	 */
	public String getExecuteParamsJson() {
		return this.executeParamsJson;
	}
	/**
	 * 属性 executeParamsJson 的set方法 
	 * @param id 
	 */
	public void setExecuteParamsJson(String executeParamsJson) {
		this.executeParamsJson = executeParamsJson;
	}
	/**
	 * 属性 startTime 的get方法 
	 * @return id
	 */
	public java.util.Date getStartTime() {
		return this.startTime;
	}
	/**
	 * 属性 startTime 的set方法 
	 * @param id 
	 */
	public void setStartTime(java.util.Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * 属性 endTime 的get方法 
	 * @return id
	 */
	public java.util.Date getEndTime() {
		return this.endTime;
	}
	/**
	 * 属性 endTime 的set方法 
	 * @param id 
	 */
	public void setEndTime(java.util.Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * 属性 startMillisecond 的get方法 
	 * @return id
	 */
	public Long getStartMillisecond() {
		return this.startMillisecond;
	}
	/**
	 * 属性 startMillisecond 的set方法 
	 * @param id 
	 */
	public void setStartMillisecond(Long startMillisecond) {
		this.startMillisecond = startMillisecond;
	}
	/**
	 * 属性 endMillisecond 的get方法 
	 * @return id
	 */
	public Long getEndMillisecond() {
		return this.endMillisecond;
	}
	/**
	 * 属性 endMillisecond 的set方法 
	 * @param id 
	 */
	public void setEndMillisecond(Long endMillisecond) {
		this.endMillisecond = endMillisecond;
	}
	/**
	 * 属性 duration 的get方法 
	 * @return id
	 */
	public Long getDuration() {
		return this.duration;
	}
	/**
	 * 属性 duration 的set方法 
	 * @param id 
	 */
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	/**
	 * 属性 excuteResult 的get方法 
	 * @return id
	 */
	public String getExcuteResult() {
		return this.excuteResult;
	}
	/**
	 * 属性 excuteResult 的set方法 
	 * @param id 
	 */
	public void setExcuteResult(String excuteResult) {
		this.excuteResult = excuteResult;
	}
	/**
	 * 属性 excuteException 的get方法 
	 * @return id
	 */
	public String getExcuteException() {
		return this.excuteException;
	}
	/**
	 * 属性 excuteException 的set方法 
	 * @param id 
	 */
	public void setExcuteException(String excuteException) {
		this.excuteException = excuteException;
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
	* <p>Description: SysMonitorLogDomain 自动生成的hashcode方法</p> 
	* @author Liu Wenjie   
	* @date 2014年11月19日  11:37:40
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
	* <p>Description:SysMonitorLogDomain 自动生成的equals方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月19日  11:37:40
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
		SysMonitorLogDomain other =(SysMonitorLogDomain) obj;

		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (id == null) {if (other.id != null){ return false;} else if (!id.equals(other.id)){ return false;}}
		*/
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
	* <p>Description:SysMonitorLogDomain 自动生成的toString方法 </p> 
	* @author Liu Wenjie   
	* @date 2014年11月19日  11:37:40 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "SysMonitorLogDomain [" +
					"id=" + id + "," + 
					"userId=" + userId + "," + 
					"loginName=" + loginName + "," + 
					"userInfoJson=" + userInfoJson + "," + 
					"userIp=" + userIp + "," + 
					"executeClass=" + executeClass + "," + 
					"executeFunction=" + executeFunction + "," + 
					"executeParamsJson=" + executeParamsJson + "," + 
					"startTime=" + startTime + "," + 
					"endTime=" + endTime + "," + 
					"startMillisecond=" + startMillisecond + "," + 
					"endMillisecond=" + endMillisecond + "," + 
					"duration=" + duration + "," + 
					"excuteResult=" + excuteResult + "," + 
					"excuteException=" + excuteException + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
