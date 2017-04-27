/**
* @Company 青鸟软通   
* @Title: LegalholidayDomain.java 
* @Package com.haier.isales.dailymgt.legalholiday.domain 
* @author Guo Yuchao   
* @date 2015年02月02日  18:05:25 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.legalholiday.domain;

import java.io.Serializable;

/** 
 * @ClassName: LegalholidayDomain 
 * t_isales_dailymgt_legalholiday 自动生成的对应的实体对象   
 *  
 */
public class LegalholidayDomain implements Serializable{
	private static final long serialVersionUID = -1422871525537L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Long id;
	/** 
	* @Fields holidayTime : 法定假日时间
	*/
	private java.util.Date holidayTime;
	/** 
	* @Fields holidayType : 类型,101放假，102调休上班
	*/
	private String holidayType;
	/** 
	* @Fields holidayDesc : 描述
	*/
	private String holidayDesc;
	/** 
	* @Fields holidayDuration : 放假天数，单位为天
	*/
	private Integer holidayDuration;
	/** 
	* @Fields numberOfDays : 放假第几天
	*/
	private Integer numberOfDays;
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
	 * 属性 holidayTime 的get方法 
	 * @return id
	 */
	public java.util.Date getHolidayTime() {
		return this.holidayTime;
	}
	/**
	 * 属性 holidayTime 的set方法 
	 * @param id 
	 */
	public void setHolidayTime(java.util.Date holidayTime) {
		this.holidayTime = holidayTime;
	}
	/**
	 * 属性 holidayType 的get方法 
	 * @return id
	 */
	public String getHolidayType() {
		return this.holidayType;
	}
	/**
	 * 属性 holidayType 的set方法 
	 * @param id 
	 */
	public void setHolidayType(String holidayType) {
		this.holidayType = holidayType;
	}
	/**
	 * 属性 holidayDesc 的get方法 
	 * @return id
	 */
	public String getHolidayDesc() {
		return this.holidayDesc;
	}
	/**
	 * 属性 holidayDesc 的set方法 
	 * @param id 
	 */
	public void setHolidayDesc(String holidayDesc) {
		this.holidayDesc = holidayDesc;
	}
	/**
	 * 属性 holidayDuration 的get方法 
	 * @return id
	 */
	public Integer getHolidayDuration() {
		return this.holidayDuration;
	}
	/**
	 * 属性 holidayDuration 的set方法 
	 * @param id 
	 */
	public void setHolidayDuration(Integer holidayDuration) {
		this.holidayDuration = holidayDuration;
	}
	/**
	 * 属性 numberOfDays 的get方法 
	 * @return id
	 */
	public Integer getNumberOfDays() {
		return this.numberOfDays;
	}
	/**
	 * 属性 numberOfDays 的set方法 
	 * @param id 
	 */
	public void setNumberOfDays(Integer numberOfDays) {
		this.numberOfDays = numberOfDays;
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
	 * 属性 createId 的get方法 
	 * @return id
	 */
	public Long getCreateId() {
		return this.createId;
	}
	/**
	 * 属性 createId 的set方法 
	 * @param id 
	 */
	public void setCreateId(Long createId) {
		this.createId = createId;
	}
	/**
	 * 属性 createName 的get方法 
	 * @return id
	 */
	public String getCreateName() {
		return this.createName;
	}
	/**
	 * 属性 createName 的set方法 
	 * @param id 
	 */
	public void setCreateName(String createName) {
		this.createName = createName;
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
	 * 属性 updateId 的get方法 
	 * @return id
	 */
	public Long getUpdateId() {
		return this.updateId;
	}
	/**
	 * 属性 updateId 的set方法 
	 * @param id 
	 */
	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}
	/**
	 * 属性 updateName 的get方法 
	 * @return id
	 */
	public String getUpdateName() {
		return this.updateName;
	}
	/**
	 * 属性 updateName 的set方法 
	 * @param id 
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
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
	* <p>Description: LegalholidayDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2015年02月02日  18:05:25
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
	* <p>Description:LegalholidayDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2015年02月02日  18:05:25
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		LegalholidayDomain other =(LegalholidayDomain) obj;

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
	* <p>Description:LegalholidayDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2015年02月02日  18:05:25 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "LegalholidayDomain [" +
					"id=" + id + "," + 
					"holidayTime=" + holidayTime + "," + 
					"holidayType=" + holidayType + "," + 
					"holidayDesc=" + holidayDesc + "," + 
					"holidayDuration=" + holidayDuration + "," + 
					"numberOfDays=" + numberOfDays + "," + 
					"createTime=" + createTime + "," + 
					"createId=" + createId + "," + 
					"createName=" + createName + "," + 
					"updateTime=" + updateTime + "," + 
					"updateId=" + updateId + "," + 
					"updateName=" + updateName + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
