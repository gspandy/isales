/**
* @Company 青鸟软通   
* @Title: EvalScoreDomain.java 
* @Package com.haier.isales.evaluate.domain 
* @author lizhenwei   
* @date 2016年04月27日  10:20:08 
* @version V1.0   
*/ 
package com.haier.isales.evaluate.dto;

import java.io.Serializable;

/** 
 * @ClassName: EvalScoreDomain 
 * @Description: t_user_evaluate_score 自动生成的对应的实体对象   
 *  
 */
public class EvalScoreDTO implements Serializable{

	private static final long serialVersionUID = 977010895930233440L;
	
	/** 
	* @Fields ueId : 主键ID，自动递增，无实际意义
	*/
	private Long ueId;
	/** 
	* @Fields uecSeq : 题目序号
	*/
	private Integer uecSeq;
	/** 
	* @Fields userCode : 直销员工号
	*/
	private String userCode;
	/** 
	* @Fields score : 对应题目的评价分数
	*/
	private Integer score;
	/** 
	* @Fields createTime : 评价时间
	*/
	private java.util.Date createTime;
	
	/**
	 * uecContent : 评价内容
	 */
	private String uecContent;
	
	/**
	 * beginTime : 查询开始时间
	 */
	private String beginTime;
	
	/**
	 * endTime : 查询结束时间
	 */
	private String endTime;
	/**
	 * avgScore : 平均分数
	 */
	private Double avgScore;	
	
	/*=========================getter and setter ===================*/
	
	/**
	 * @Description: 属性 ueId 的get方法 
	 * @return id
	 */
	public Long getUeId() {
		return this.ueId;
	}
	/**
	 * @Description: 属性 ueId 的set方法 
	 * @param id 
	 */
	public void setUeId(Long ueId) {
		this.ueId = ueId;
	}
	/**
	 * @Description: 属性 uecSeq 的get方法 
	 * @return id
	 */
	public Integer getUecSeq() {
		return this.uecSeq;
	}
	/**
	 * @Description: 属性 uecSeq 的set方法 
	 * @param id 
	 */
	public void setUecSeq(Integer uecSeq) {
		this.uecSeq = uecSeq;
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
	 * @Description: 属性 score 的get方法 
	 * @return id
	 */
	public Integer getScore() {
		return this.score;
	}
	/**
	 * @Description: 属性 score 的set方法 
	 * @param id 
	 */
	public void setScore(Integer score) {
		this.score = score;
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
	 * @return the uecContent
	 */
	public String getUecContent() {
		return uecContent;
	}
	/**
	 * @param uecContent the uecContent to set
	 */
	public void setUecContent(String uecContent) {
		this.uecContent = uecContent;
	}
	
	/**
	 * @return the beginTime
	 */
	public String getBeginTime() {
		return beginTime;
	}
	/**
	 * @param beginTime the beginTime to set
	 */
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	/**
	 * @return the avgScore
	 */
	public Double getAvgScore() {
		return avgScore;
	}
	/**
	 * @param avgScore the avgScore to set
	 */
	public void setAvgScore(Double avgScore) {
		this.avgScore = avgScore;
	}
	
	/*==================== toString() ====================*/
	/**
	* <p>Description:EvalScoreDomain 自动生成的toString方法 </p> 
	* @author lizhenwei   
	* @date 2016年04月27日  10:20:08 
	* @return 
	* @see java.lang.Object#toString() 
	*/
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EvalScoreDTO [ueId=" + ueId + ", uecSeq=" + uecSeq
				+ ", userCode=" + userCode + ", score=" + score
				+ ", createTime=" + createTime + ", uecContent=" + uecContent
				+ ", beginTime=" + beginTime + ", endTime=" + endTime
				+ ", avgScore=" + avgScore + "]";
	} 
	
}
