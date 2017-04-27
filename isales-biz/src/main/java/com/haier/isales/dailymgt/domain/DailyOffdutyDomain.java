/**
* @Company 青鸟软通   
* @Title: DailyOffdutyDomain.java 
* @Package com.haier.isales.dailymgt.domain 
* @author Huang Nana   
* @date 2015年01月27日  14:20:22 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.domain;

import java.io.Serializable;

/** 
 * @ClassName: DailyOffdutyDomain 
 * t_isales_dailymgt_offduty 自动生成的对应的实体对象   
 *  
 */
public class DailyOffdutyDomain implements Serializable{
	private static final long serialVersionUID = -1422339622747L;

	private Long id;		// 主键，无实际意义

	private Long operatorId;		//用户id

	private String userCode;		//员工号

	private String userName;		// 员工姓名

	private String shopCode;		// 门店编码

	private String shopName;		//门店名称

	private java.util.Date offdutyDate;		// 休班日期

	private String status;		//状态，101有效，102无效

	private java.util.Date createTime;		//创建时间

	private Long createId;		//创建人

	private String createName;		// 创建人姓名

	private java.util.Date updateTime;		//修改时间

	private Long updateId;		//修改人
	
	private String updateName;		//修改人姓名

	private String remark;		//备注
	
	private String dateString; //日期字符串
	
	private String canDelete;//是否可以取消休班
	
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
	 * 属性 shopCode 的get方法 
	 * @return id
	 */
	public String getShopCode() {
		return this.shopCode;
	}
	/**
	 * 属性 shopCode 的set方法 
	 * @param id 
	 */
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
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
	 * 属性 offdutyDate 的get方法 
	 * @return id
	 */
	public java.util.Date getOffdutyDate() {
		return this.offdutyDate;
	}
	/**
	 * 属性 offdutyDate 的set方法 
	 * @param id 
	 */
	public void setOffdutyDate(java.util.Date offdutyDate) {
		this.offdutyDate = offdutyDate;
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
	/**
	 * 属性 dateString 的get方法 
	 * @return dateString
	 */
	public String getDateString() {
		return dateString;
	}
	/**
	 * 属性 dateString 的set方法 
	 * @param dateString 
	 */
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
	/**
	 * 属性 canDelete 的get方法 
	 * @return canDelete
	 */
	public String getCanDelete() {
		return canDelete;
	}
	/**
	 * 属性 canDelete 的set方法 
	 * @param canDelete 
	 */
	public void setCanDelete(String canDelete) {
		this.canDelete = canDelete;
	}
	
	/*====================hashCode and equals ====================*/
	/**
	* <p>Description: DailyOffdutyDomain 自动生成的hashcode方法</p> 
	* @author Huang Nana   
	* @date 2015年01月27日  14:20:22
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
	* <p>Description:DailyOffdutyDomain 自动生成的equals方法 </p> 
	* @author Huang Nana   
	* @date 2015年01月27日  14:20:22
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
		DailyOffdutyDomain other =(DailyOffdutyDomain) obj;

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
	* <p>Description:DailyOffdutyDomain 自动生成的toString方法 </p> 
	* @author Huang Nana   
	* @date 2015年01月27日  14:20:22 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "DailyOffdutyDomain [" +
					"id=" + id + "," + 
					"operatorId=" + operatorId + "," + 
					"userCode=" + userCode + "," + 
					"userName=" + userName + "," + 
					"shopCode=" + shopCode + "," + 
					"shopName=" + shopName + "," + 
					"offdutyDate=" + offdutyDate + "," + 
					"status=" + status + "," + 
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
