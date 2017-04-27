/**
* @Company 青鸟软通   
* @Title: TryoutUsersDomain.java 
* @Package com.haier.isales.retail.tryoutusers.domain 
* @author John.zhao   
* @date 2015年03月17日  11:34:18 
* @version V1.0   
*/ 
package com.haier.isales.retail.updateretail.domain;

import java.io.Serializable;

/** 
 * @ClassName: TryoutUsersDomain 
 * t_isales_sales_tryout_users 自动生成的对应的实体对象   
 *  
 */
public class TryoutUsersDomain implements Serializable{
	private static final long serialVersionUID = -1426563258875L;

	/** 
	* @Fields operatorId : 操作人id
	*/
	private Long operatorId;
	/** 
	* @Fields userCode : 员工号
	*/
	private String userCode;
	/** 
	* @Fields userName : 员工姓名
	*/
	private String userName;
	/** 
	* @Fields orgName : 所属中心名称
	*/
	private String orgName;
	/** 
	* @Fields shopName : 所属门店名称
	*/
	private String shopName;
	/** 
	* @Fields updateTime : 修改时间
	*/
	private java.util.Date updateTime;
	/** 
	* @Fields createTime : 添加时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
		
	
	/*=========================getter and setter ===================*/
	
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
	 * 属性 orgName 的get方法 
	 * @return id
	 */
	public String getOrgName() {
		return this.orgName;
	}
	/**
	 * 属性 orgName 的set方法 
	 * @param id 
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	/**
	 * 属性 shopName 的get方法 
	 * @return id
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * 属性 shopName 的set方法 
	 * @param id 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
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
	* <p>Description: TryoutUsersDomain 自动生成的hashcode方法</p> 
	* @author John.zhao   
	* @date 2015年03月17日  11:34:18
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((operatorId == null) ? 0 : operatorId.hashCode());
		return result;
	}
	/**
	* <p>Description:TryoutUsersDomain 自动生成的equals方法 </p> 
	* @author John.zhao   
	* @date 2015年03月17日  11:34:18
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
		TryoutUsersDomain other =(TryoutUsersDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (operatorId == null) {if (other.operatorId != null){ return false;} else if (!operatorId.equals(other.operatorId)){ return false;}}
		*/
		if (operatorId == null) {
			if (other.operatorId != null){ 
				return false;
			}
		}else if (!operatorId.equals(other.operatorId)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:TryoutUsersDomain 自动生成的toString方法 </p> 
	* @author John.zhao   
	* @date 2015年03月17日  11:34:18 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "TryoutUsersDomain [" +
					"operatorId=" + operatorId + "," + 
					"userCode=" + userCode + "," + 
					"userName=" + userName + "," + 
					"orgName=" + orgName + "," + 
					"shopName=" + shopName + "," + 
					"updateTime=" + updateTime + "," + 
					"createTime=" + createTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
