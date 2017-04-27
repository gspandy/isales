/**
* @Company 青鸟软通   
* @Title: PersonalmodelDomain.java 
* @Package com.haier.isales.retail.personalmodel.domain 
* @author Cao Rui   
* @date 2014年12月03日  11:06:59 
* @version V1.0   
*/ 
package com.haier.isales.retail.personalmodel.domain;

import java.io.Serializable;

/** 
 * @ClassName: PersonalmodelDomain 
 * t_isales_personal_model 自动生成的对应的实体对象   
 *  
 */
public class PersonalmodelDomain implements Serializable{
	private static final long serialVersionUID = -1417576019197L;

	public static final String STATUS_ENABLE = "101" ;
	public static final String STATUS_DISABLE = "102";
	
	/** 
	* @Fields id : 主键
	*/
	private Long id;
	/** 
	* @Fields modelCode : 产品型号编码
	*/
	private String modelCode;
	/** 
	* @Fields modelName : 产品型号名称
	*/
	private String modelName;
	/** 
	* @Fields operatorId : 用户id
	*/
	private Long operatorId;
	/** 
	* @Fields userCode : 对应员工号
	*/
	private String userCode;
	/** 
	* @Fields userName : 用户姓名
	*/
	private String userName;
	/** 
	* @Fields createTime : 添加时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields updateTime : 修改时间
	*/
	private java.util.Date updateTime;
	/** 
	* @Fields status : 状态，预留。101有效；102无效
	*/
	private String status;
	/** 
	* @Fields useCount : 使用次数，预留
	*/
	private Integer useCount;
	/** 
	* @Fields sort : 排序，预留
	*/
	private Integer sort;
	/** 
	* @Fields categoryEName : 产品组名称
	*/
	private String categoryEName;
		
	
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
	 * 属性 modelCode 的get方法 
	 * @return id
	 */
	public String getModelCode() {
		return this.modelCode;
	}
	/**
	 * 属性 modelCode 的set方法 
	 * @param id 
	 */
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	/**
	 * 属性 modelName 的get方法 
	 * @return id
	 */
	public String getModelName() {
		return this.modelName;
	}
	/**
	 * 属性 modelName 的set方法 
	 * @param id 
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	/**
	 * 属性 operatorId 的get方法 
	 * @return id
	 */
	public Long getOperatorId() {
		return this.operatorId;
	}
	/**
	 * 属性 operatorId 的set方法 
	 * @param id 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * 属性 userCode 的get方法 
	 * @return id
	 */
	public String getUserCode() {
		return this.userCode;
	}
	/**
	 * 属性 userCode 的set方法 
	 * @param id 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * 属性 userName 的get方法 
	 * @return id
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * 属性 userName 的set方法 
	 * @param id 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * 属性 status 的get方法 
	 * @return id
	 */
	public String getStatus() {
		return this.status;
	}
	/**
	 * 属性 status 的set方法 
	 * @param id 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 属性 useCount 的get方法 
	 * @return id
	 */
	public Integer getUseCount() {
		return this.useCount;
	}
	/**
	 * 属性 useCount 的set方法 
	 * @param id 
	 */
	public void setUseCount(Integer useCount) {
		this.useCount = useCount;
	}
	/**
	 * 属性 sort 的get方法 
	 * @return id
	 */
	public Integer getSort() {
		return this.sort;
	}
	/**
	 * 属性 sort 的set方法 
	 * @param id 
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}

	
	/**
	 * 属性 categoryEName 的get方法 
	 * @return categoryEName
	 */
	public String getCategoryEName() {
		return categoryEName;
	}
	/**
	 * 属性 categoryEName 的set方法 
	 * @param categoryEName 
	 */
	public void setCategoryEName(String categoryEName) {
		this.categoryEName = categoryEName;
	}
/*====================hashCode and equals ====================*/
/**
	* <p>Description: PersonalmodelDomain 自动生成的hashcode方法</p> 
	* @author Cao Rui   
	* @date 2014年12月03日  11:06:59
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
	* <p>Description:PersonalmodelDomain 自动生成的equals方法 </p> 
	* @author Cao Rui   
	* @date 2014年12月03日  11:06:59
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
		PersonalmodelDomain other =(PersonalmodelDomain) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:PersonalmodelDomain 自动生成的toString方法 </p> 
	* @author Cao Rui   
	* @date 2014年12月03日  11:06:59 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "PersonalmodelDomain [" +
					"id=" + id + "," + 
					"modelCode=" + modelCode + "," + 
					"modelName=" + modelName + "," + 
					"operatorId=" + operatorId + "," + 
					"userCode=" + userCode + "," + 
					"userName=" + userName + "," + 
					"createTime=" + createTime + "," + 
					"updateTime=" + updateTime + "," + 
					"status=" + status + "," + 
					"useCount=" + useCount + "," + 
					"sort=" + sort + "," + 
				"]";
	}
	
	
}
