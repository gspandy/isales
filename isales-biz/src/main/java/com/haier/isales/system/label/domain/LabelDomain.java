/**
* @Company 青鸟软通   
* @Title: LabelDomain.java 
* @Package com.haier.isales.system.label.domain 
* @author Guo Yuchao   
* @date 2014年11月11日  15:35:06 
* @version V1.0   
*/ 
package com.haier.isales.system.label.domain;

import java.io.Serializable;

/** 
 * @ClassName: LabelDomain 
 * t_qn_label 自动生成的对应的实体对象   
 *  
 */
public class LabelDomain implements Serializable{
	private static final long serialVersionUID = -1415691306242L;

	private Long labelId;	//标签id

	private String labelCode;	//标签编号

	private String labelName;	//标签名称

	private String parentOrg;	//父级组织的编号
	
	private String labelLevel;	//组织所处的层级

	private String labelSeq;	//组织的序列，是orgcode的顺序组合，用_分割

	private String labelStatus;	// 标签状态,101：有效，102：无效。 默认为101，

	private Long updateId;	//修改人id

	private String updateName;	// 修改人姓名

	private java.util.Date updateTime;	//修改时间

	private Long createId;	//添加人id

	private String createName;	//添加人姓名

	private java.util.Date createTime;	//添加时间
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 labelId 的get方法 
	 * @return id
	 */
	public Long getLabelId() {
		return this.labelId;
	}
	/**
	 * 属性 labelId 的set方法 
	 * @param id 
	 */
	public void setLabelId(Long labelId) {
		this.labelId = labelId;
	}
	/**
	 * 属性 labelName 的get方法 
	 * @return id
	 */
	public String getLabelName() {
		return this.labelName;
	}
	/**
	 * 属性 labelName 的set方法 
	 * @param id 
	 */
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}
	/**
	 * 属性 parentOrg 的get方法 
	 * @return id
	 */
	public String getParentOrg() {
		return this.parentOrg;
	}
	/**
	 * 属性 parentOrg 的set方法 
	 * @param id 
	 */
	public void setParentOrg(String parentOrg) {
		this.parentOrg = parentOrg;
	}
	/**
	 * 属性 labelLevel 的get方法 
	 * @return id
	 */
	public String getLabelLevel() {
		return this.labelLevel;
	}
	/**
	 * 属性 labelLevel 的set方法 
	 * @param id 
	 */
	public void setLabelLevel(String labelLevel) {
		this.labelLevel = labelLevel;
	}
	/**
	 * 属性 labelSeq 的get方法 
	 * @return id
	 */
	public String getLabelSeq() {
		return this.labelSeq;
	}
	/**
	 * 属性 labelSeq 的set方法 
	 * @param id 
	 */
	public void setLabelSeq(String labelSeq) {
		this.labelSeq = labelSeq;
	}
	/**
	 * 属性 labelStatus 的get方法 
	 * @return id
	 */
	public String getLabelStatus() {
		return this.labelStatus;
	}
	/**
	 * 属性 labelStatus 的set方法 
	 * @param id 
	 */
	public void setLabelStatus(String labelStatus) {
		this.labelStatus = labelStatus;
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
	 * 属性 labelCode 的get方法 
	 * @return labelCode
	 */
	public String getLabelCode() {
		return labelCode;
	}
	/**
	 * 属性 labelCode 的set方法 
	 * @param labelCode 
	 */
	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}
/*====================hashCode and equals ====================*/
/**
	* <p>Description: LabelDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2014年11月11日  15:35:06
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((labelId == null) ? 0 : labelId.hashCode());
		return result;
	}
	/**
	* <p>Description:LabelDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月11日  15:35:06
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
		LabelDomain other =(LabelDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (labelId == null) {if (other.labelId != null){ return false;} else if (!labelId.equals(other.labelId)){ return false;}}
		*/
		if (labelId == null) {
			if (other.labelId != null){ 
				return false;
			}
		}else if (!labelId.equals(other.labelId)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:LabelDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月11日  15:35:06 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "LabelDomain [" +
					"labelId=" + labelId + "," + 
					"labelName=" + labelName + "," + 
					"parentOrg=" + parentOrg + "," + 
					"labelLevel=" + labelLevel + "," + 
					"labelSeq=" + labelSeq + "," + 
					"labelStatus=" + labelStatus + "," + 
					"updateId=" + updateId + "," + 
					"updateName=" + updateName + "," + 
					"updateTime=" + updateTime + "," + 
					"createId=" + createId + "," + 
					"createName=" + createName + "," + 
					"createTime=" + createTime + "," + 
				"]";
	}
	
	
}
