/**
* @Company 青鸟软通   
* @Title: LevelupDetailDomain.java 
* @Package com.haier.isales.score.domain 
* @author Cao Rui   
* @date 2014年11月28日  13:12:03 
* @version V1.0   
*/ 
package com.haier.isales.score.domain;

import java.io.Serializable;

/** 
 * @ClassName: LevelupDetailDomain 
 * t_isales_score_levelup_detail 自动生成的对应的实体对象   
 *  
 */
public class LevelupDetailDomain implements Serializable{
	private static final long serialVersionUID = -1417151523758L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Long id;
	/** 
	* @Fields operatorId : 用户主键id
	*/
	private Long operatorId;
	/** 
	* @Fields levelBefore : 升级前等级
	*/
	private Integer levelBefore;
	/** 
	* @Fields levelAfter : 升级后等级
	*/
	private Integer levelAfter;
	/** 
	* @Fields operateTime : 操作时间
	*/
	private java.util.Date operateTime;
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
	 * 属性 levelBefore 的get方法 
	 * @return id
	 */
	public Integer getLevelBefore() {
		return this.levelBefore;
	}
	/**
	 * 属性 levelBefore 的set方法 
	 * @param id 
	 */
	public void setLevelBefore(Integer levelBefore) {
		this.levelBefore = levelBefore;
	}
	/**
	 * 属性 levelAfter 的get方法 
	 * @return id
	 */
	public Integer getLevelAfter() {
		return this.levelAfter;
	}
	/**
	 * 属性 levelAfter 的set方法 
	 * @param id 
	 */
	public void setLevelAfter(Integer levelAfter) {
		this.levelAfter = levelAfter;
	}
	/**
	 * 属性 operateTime 的get方法 
	 * @return id
	 */
	public java.util.Date getOperateTime() {
		return this.operateTime;
	}
	/**
	 * 属性 operateTime 的set方法 
	 * @param id 
	 */
	public void setOperateTime(java.util.Date operateTime) {
		this.operateTime = operateTime;
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
	* <p>Description: LevelupDetailDomain 自动生成的hashcode方法</p> 
	* @author Cao Rui   
	* @date 2014年11月28日  13:12:03
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
	* <p>Description:LevelupDetailDomain 自动生成的equals方法 </p> 
	* @author Cao Rui   
	* @date 2014年11月28日  13:12:03
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
		LevelupDetailDomain other =(LevelupDetailDomain) obj;
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
	* <p>Description:LevelupDetailDomain 自动生成的toString方法 </p> 
	* @author Cao Rui   
	* @date 2014年11月28日  13:12:03 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "LevelupDetailDomain [" +
					"id=" + id + "," + 
					"operatorId=" + operatorId + "," + 
					"levelBefore=" + levelBefore + "," + 
					"levelAfter=" + levelAfter + "," + 
					"operateTime=" + operateTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
