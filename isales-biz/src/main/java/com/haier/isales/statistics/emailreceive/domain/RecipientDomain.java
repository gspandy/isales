/**
* @Company 青鸟软通   
* @Title: RecipientDomain.java 
* @Package com.haier.isales.statistics.emailreceive.domain 
* @author John.zhao   
* @date 2014年12月04日  15:59:29 
* @version V1.0   
*/ 
package com.haier.isales.statistics.emailreceive.domain;

import java.io.Serializable;

/** 
 * @ClassName: RecipientDomain 
 * t_isales_data_statistics_email 自动生成的对应的实体对象   
 *  
 */
public class RecipientDomain implements Serializable{
	private static final long serialVersionUID = -1417679969054L;

	/** 
	* @Fields id : id
	*/
	private Long id;
	/** 
	* @Fields receiverEmail : 收件人邮箱
	*/
	private String receiverEmail;
	/** 
	* @Fields receiverName : 收件人姓名
	*/
	private String receiverName;
	/** 
	* @Fields createTime : 添加时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields updateTime : 修改时间
	*/
	private java.util.Date updateTime;
		
	
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
	 * 属性 receiverEmail 的get方法 
	 * @return id
	 */
	public String getReceiverEmail() {
		return this.receiverEmail;
	}
	/**
	 * 属性 receiverEmail 的set方法 
	 * @param id 
	 */
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}
	/**
	 * 属性 receiverName 的get方法 
	 * @return id
	 */
	public String getReceiverName() {
		return this.receiverName;
	}
	/**
	 * 属性 receiverName 的set方法 
	 * @param id 
	 */
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
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
	* <p>Description: RecipientDomain 自动生成的hashcode方法</p> 
	* @author John.zhao   
	* @date 2014年12月04日  15:59:29
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
	* <p>Description:RecipientDomain 自动生成的equals方法 </p> 
	* @author John.zhao   
	* @date 2014年12月04日  15:59:29
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
		RecipientDomain other =(RecipientDomain) obj;

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
	* <p>Description:RecipientDomain 自动生成的toString方法 </p> 
	* @author John.zhao   
	* @date 2014年12月04日  15:59:29 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "RecipientDomain [" +
					"id=" + id + "," + 
					"receiverEmail=" + receiverEmail + "," + 
					"receiverName=" + receiverName + "," + 
					"createTime=" + createTime + "," + 
					"updateTime=" + updateTime + "," + 
				"]";
	}
	
	
}
