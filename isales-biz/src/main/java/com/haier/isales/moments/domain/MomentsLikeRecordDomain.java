/**
* @Company 青鸟软通   
* @Title: MomentsLikeRecordDomain.java 
* @Package com.haier.isales.moments.domain 
* @author Cao Rui   
* @date 2014年11月19日  10:39:44 
* @version V1.0   
*/ 
package com.haier.isales.moments.domain;

import java.io.Serializable;

/** 
 * @ClassName: MomentsLikeRecordDomain 
 * t_isales_moments_like_record 自动生成的对应的实体对象   
 *  
 */
public class MomentsLikeRecordDomain implements Serializable{
	private static final long serialVersionUID = -1416364784242L;

	private Long id;		//主键

	private Long momentsId;		//内容

	private Long operatorId;		// 操作用户id

	private String type;		//类型,101: 点赞，102点踩

	private String status;		//状态,101:有效，102:无效

	private java.util.Date createTime;		//添加时间

	private java.util.Date updateTime;			//修改时间
	
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
	 * 属性 momentsId 的get方法 
	 * @return id
	 */
	public Long getMomentsId() {
		return this.momentsId;
	}
	/**
	 * 属性 momentsId 的set方法 
	 * @param id 
	 */
	public void setMomentsId(Long momentsId) {
		this.momentsId = momentsId;
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
	 * 属性 type 的get方法 
	 * @return id
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * 属性 type 的set方法 
	 * @param id 
	 */
	public void setType(String type) {
		this.type = type;
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

	/*====================hashCode and equals ====================*/
    /**
	* <p>Description: MomentsLikeRecordDomain 自动生成的hashcode方法</p> 
	* @author Cao Rui   
	* @date 2014年11月19日  10:39:44
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
	* <p>Description:MomentsLikeRecordDomain 自动生成的equals方法 </p> 
	* @author Cao Rui   
	* @date 2014年11月19日  10:39:44
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
		MomentsLikeRecordDomain other =(MomentsLikeRecordDomain) obj;

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
	* <p>Description:MomentsLikeRecordDomain 自动生成的toString方法 </p> 
	* @author Cao Rui   
	* @date 2014年11月19日  10:39:44 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "MomentsLikeRecordDomain [" +
					"id=" + id + "," + 
					"momentsId=" + momentsId + "," + 
					"operatorId=" + operatorId + "," + 
					"type=" + type + "," + 
					"status=" + status + "," + 
					"createTime=" + createTime + "," + 
					"updateTime=" + updateTime + "," + 
				"]";
	}
}
