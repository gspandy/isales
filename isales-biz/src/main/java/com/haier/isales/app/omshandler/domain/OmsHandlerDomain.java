/**
* @Company 青鸟软通   
* @Title: OmsHandlerDomain.java 
* @Package com.haier.isales.app.omshandler.domain 
* @author Guo Yuchao   
* @date 2015年02月05日  19:26:42 
* @version V1.0   
*/ 
package com.haier.isales.app.omshandler.domain;

import java.io.Serializable;

/** 
 * @ClassName: OmsHandlerDomain 
 * t_isales_bpm_handler_oms_temp 自动生成的对应的实体对象   
 *  
 */
public class OmsHandlerDomain implements Serializable{
	private static final long serialVersionUID = -1423135602847L;

	private Long id;		//主键，无实际意义

	private String rowId;	// 对方系统的ID字段，存储备用

	private String rn;	//RN字段，存储备用

	private String orgNo;	//ORGNO字段，存储备用

	private String bindId;	//BINDID字段，存储备用

	private String createDate;	//CREATEDATE字段，存储备用

	private String createUser;	//CREATEUSER字段，存储备用

	private String updateDate;	//UPDATEDATE字段，存储备用

	private String updateUser;	//UPDATEUSER字段，存储备用

	private String workFlowId;	//WORKFLOWID字段，存储备用

	private String workFlowStepId;	//WOEKFLOWSTEPID字段，存储备用
	
	private String isEnd;	//ISEND字段，存储备用

	private String tradeCode;	//中心编码

	private String tradeName;	//中心名称

	private String buCode;	//BUCODE字段，存储备用

	private String buName;	//BUNAME字段，存储备用

	private String lineCode;	// LINECODE字段，存储备用

	private String lineName;	//LINENAME字段，存储备用

	private String userCode;	//处理人工号

	private String userName;	//处理人姓名

	private java.util.Date synchronousTime;	//本条数据同步的时间

	private String remark;	// 备注	
	
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
	 * 属性 rowId 的get方法 
	 * @return id
	 */
	public String getRowId() {
		return this.rowId;
	}
	/**
	 * 属性 rowId 的set方法 
	 * @param id 
	 */
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}
	/**
	 * 属性 rn 的get方法 
	 * @return id
	 */
	public String getRn() {
		return this.rn;
	}
	/**
	 * 属性 rn 的set方法 
	 * @param id 
	 */
	public void setRn(String rn) {
		this.rn = rn;
	}
	/**
	 * 属性 orgNo 的get方法 
	 * @return id
	 */
	public String getOrgNo() {
		return this.orgNo;
	}
	/**
	 * 属性 orgNo 的set方法 
	 * @param id 
	 */
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	/**
	 * 属性 bindId 的get方法 
	 * @return id
	 */
	public String getBindId() {
		return this.bindId;
	}
	/**
	 * 属性 bindId 的set方法 
	 * @param id 
	 */
	public void setBindId(String bindId) {
		this.bindId = bindId;
	}
	/**
	 * 属性 createDate 的get方法 
	 * @return id
	 */
	public String getCreateDate() {
		return this.createDate;
	}
	/**
	 * 属性 createDate 的set方法 
	 * @param id 
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	/**
	 * 属性 createUser 的get方法 
	 * @return id
	 */
	public String getCreateUser() {
		return this.createUser;
	}
	/**
	 * 属性 createUser 的set方法 
	 * @param id 
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	/**
	 * 属性 updateDate 的get方法 
	 * @return id
	 */
	public String getUpdateDate() {
		return this.updateDate;
	}
	/**
	 * 属性 updateDate 的set方法 
	 * @param id 
	 */
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * 属性 updateUser 的get方法 
	 * @return id
	 */
	public String getUpdateUser() {
		return this.updateUser;
	}
	/**
	 * 属性 updateUser 的set方法 
	 * @param id 
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	/**
	 * 属性 workFlowId 的get方法 
	 * @return id
	 */
	public String getWorkFlowId() {
		return this.workFlowId;
	}
	/**
	 * 属性 workFlowId 的set方法 
	 * @param id 
	 */
	public void setWorkFlowId(String workFlowId) {
		this.workFlowId = workFlowId;
	}
	/**
	 * 属性 workFlowStepId 的get方法 
	 * @return id
	 */
	public String getWorkFlowStepId() {
		return this.workFlowStepId;
	}
	/**
	 * 属性 workFlowStepId 的set方法 
	 * @param id 
	 */
	public void setWorkFlowStepId(String workFlowStepId) {
		this.workFlowStepId = workFlowStepId;
	}
	/**
	 * 属性 isEnd 的get方法 
	 * @return id
	 */
	public String getIsEnd() {
		return this.isEnd;
	}
	/**
	 * 属性 isEnd 的set方法 
	 * @param id 
	 */
	public void setIsEnd(String isEnd) {
		this.isEnd = isEnd;
	}
	/**
	 * 属性 tradeCode 的get方法 
	 * @return id
	 */
	public String getTradeCode() {
		return this.tradeCode;
	}
	/**
	 * 属性 tradeCode 的set方法 
	 * @param id 
	 */
	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}
	/**
	 * 属性 tradeName 的get方法 
	 * @return id
	 */
	public String getTradeName() {
		return this.tradeName;
	}
	/**
	 * 属性 tradeName 的set方法 
	 * @param id 
	 */
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	/**
	 * 属性 buCode 的get方法 
	 * @return id
	 */
	public String getBuCode() {
		return this.buCode;
	}
	/**
	 * 属性 buCode 的set方法 
	 * @param id 
	 */
	public void setBuCode(String buCode) {
		this.buCode = buCode;
	}
	/**
	 * 属性 buName 的get方法 
	 * @return id
	 */
	public String getBuName() {
		return this.buName;
	}
	/**
	 * 属性 buName 的set方法 
	 * @param id 
	 */
	public void setBuName(String buName) {
		this.buName = buName;
	}
	/**
	 * 属性 lineCode 的get方法 
	 * @return id
	 */
	public String getLineCode() {
		return this.lineCode;
	}
	/**
	 * 属性 lineCode 的set方法 
	 * @param id 
	 */
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}
	/**
	 * 属性 lineName 的get方法 
	 * @return id
	 */
	public String getLineName() {
		return this.lineName;
	}
	/**
	 * 属性 lineName 的set方法 
	 * @param id 
	 */
	public void setLineName(String lineName) {
		this.lineName = lineName;
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
	 * 属性 synchronousTime 的get方法 
	 * @return id
	 */
	public java.util.Date getSynchronousTime() {
		return this.synchronousTime;
	}
	/**
	 * 属性 synchronousTime 的set方法 
	 * @param id 
	 */
	public void setSynchronousTime(java.util.Date synchronousTime) {
		this.synchronousTime = synchronousTime;
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
	* <p>Description: OmsHandlerDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2015年02月05日  19:26:42
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
	* <p>Description:OmsHandlerDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2015年02月05日  19:26:42
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
		OmsHandlerDomain other =(OmsHandlerDomain) obj;

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
	* <p>Description:OmsHandlerDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2015年02月05日  19:26:42 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "OmsHandlerDomain [" +
					"id=" + id + "," + 
					"rowId=" + rowId + "," + 
					"rn=" + rn + "," + 
					"orgNo=" + orgNo + "," + 
					"bindId=" + bindId + "," + 
					"createDate=" + createDate + "," + 
					"createUser=" + createUser + "," + 
					"updateDate=" + updateDate + "," + 
					"updateUser=" + updateUser + "," + 
					"workFlowId=" + workFlowId + "," + 
					"workFlowStepId=" + workFlowStepId + "," + 
					"isEnd=" + isEnd + "," + 
					"tradeCode=" + tradeCode + "," + 
					"tradeName=" + tradeName + "," + 
					"buCode=" + buCode + "," + 
					"buName=" + buName + "," + 
					"lineCode=" + lineCode + "," + 
					"lineName=" + lineName + "," + 
					"userCode=" + userCode + "," + 
					"userName=" + userName + "," + 
					"synchronousTime=" + synchronousTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
