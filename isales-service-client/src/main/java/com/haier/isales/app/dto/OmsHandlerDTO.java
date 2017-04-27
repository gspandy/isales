/**
* @Company 青鸟软通   
* @Title: OmsHandlerDomain.java 
* @Package com.haier.isales.app.omshandler.domain 
* @author Guo  Yuchao   
* @date 2015年02月05日  19:36:42 
* @version V1.0   
*/ 
package com.haier.isales.app.dto;

import java.io.Serializable;

/** 
 * @ClassName: OmsHandlerDTO
 * @Description: t_isales_bpm_handler_oms_temp 自动生成的对应的实体对象   
 *  
 */
public class OmsHandlerDTO implements Serializable{
	private static final long serialVersionUID = -1423135602847L;

	/** 
	* @Fields id : 主键，无实际意义
	*/
	private Long id;
	/** 
	* @Fields rowId : 对方系统的ID字段，存储备用
	*/
	private String rowId;
	/** 
	* @Fields rn : RN字段，存储备用
	*/
	private String rn;
	/** 
	* @Fields orgNo : ORGNO字段，存储备用
	*/
	private String orgNo;
	/** 
	* @Fields bindId : BINDID字段，存储备用
	*/
	private String bindId;
	/** 
	* @Fields createDate : CREATEDATE字段，存储备用
	*/
	private String createDate;
	/** 
	* @Fields createUser : CREATEUSER字段，存储备用
	*/
	private String createUser;
	/** 
	* @Fields updateDate : UPDATEDATE字段，存储备用
	*/
	private String updateDate;
	/** 
	* @Fields updateUser : UPDATEUSER字段，存储备用
	*/
	private String updateUser;
	/** 
	* @Fields workFlowId : WORKFLOWID字段，存储备用
	*/
	private String workFlowId;
	/** 
	* @Fields workFlowStepId : WOEKFLOWSTEPID字段，存储备用
	*/
	private String workFlowStepId;
	/** 
	* @Fields isEnd : ISEND字段，存储备用
	*/
	private String isEnd;
	/** 
	* @Fields tradeCode : 中心编码
	*/
	private String tradeCode;
	/** 
	* @Fields tradeName : 中心名称
	*/
	private String tradeName;
	/** 
	* @Fields buCode : BUCODE字段，存储备用
	*/
	private String buCode;
	/** 
	* @Fields buName : BUNAME字段，存储备用
	*/
	private String buName;
	/** 
	* @Fields lineCode : LINECODE字段，存储备用
	*/
	private String lineCode;
	/** 
	* @Fields lineName : LINENAME字段，存储备用
	*/
	private String lineName;
	/** 
	* @Fields userCode : 处理人工号
	*/
	private String userCode;
	/** 
	* @Fields userName : 处理人姓名
	*/
	private String userName;
	/** 
	* @Fields synchronousTime : 本条数据同步的时间
	*/
	private java.util.Date synchronousTime;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * @Description: 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * @Description: 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @Description: 属性 rowId 的get方法 
	 * @return id
	 */
	public String getRowId() {
		return this.rowId;
	}
	/**
	 * @Description: 属性 rowId 的set方法 
	 * @param id 
	 */
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}
	/**
	 * @Description: 属性 rn 的get方法 
	 * @return id
	 */
	public String getRn() {
		return this.rn;
	}
	/**
	 * @Description: 属性 rn 的set方法 
	 * @param id 
	 */
	public void setRn(String rn) {
		this.rn = rn;
	}
	/**
	 * @Description: 属性 orgNo 的get方法 
	 * @return id
	 */
	public String getOrgNo() {
		return this.orgNo;
	}
	/**
	 * @Description: 属性 orgNo 的set方法 
	 * @param id 
	 */
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	/**
	 * @Description: 属性 bindId 的get方法 
	 * @return id
	 */
	public String getBindId() {
		return this.bindId;
	}
	/**
	 * @Description: 属性 bindId 的set方法 
	 * @param id 
	 */
	public void setBindId(String bindId) {
		this.bindId = bindId;
	}
	/**
	 * @Description: 属性 createDate 的get方法 
	 * @return id
	 */
	public String getCreateDate() {
		return this.createDate;
	}
	/**
	 * @Description: 属性 createDate 的set方法 
	 * @param id 
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	/**
	 * @Description: 属性 createUser 的get方法 
	 * @return id
	 */
	public String getCreateUser() {
		return this.createUser;
	}
	/**
	 * @Description: 属性 createUser 的set方法 
	 * @param id 
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	/**
	 * @Description: 属性 updateDate 的get方法 
	 * @return id
	 */
	public String getUpdateDate() {
		return this.updateDate;
	}
	/**
	 * @Description: 属性 updateDate 的set方法 
	 * @param id 
	 */
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * @Description: 属性 updateUser 的get方法 
	 * @return id
	 */
	public String getUpdateUser() {
		return this.updateUser;
	}
	/**
	 * @Description: 属性 updateUser 的set方法 
	 * @param id 
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	/**
	 * @Description: 属性 workFlowId 的get方法 
	 * @return id
	 */
	public String getWorkFlowId() {
		return this.workFlowId;
	}
	/**
	 * @Description: 属性 workFlowId 的set方法 
	 * @param id 
	 */
	public void setWorkFlowId(String workFlowId) {
		this.workFlowId = workFlowId;
	}
	/**
	 * @Description: 属性 workFlowStepId 的get方法 
	 * @return id
	 */
	public String getWorkFlowStepId() {
		return this.workFlowStepId;
	}
	/**
	 * @Description: 属性 workFlowStepId 的set方法 
	 * @param id 
	 */
	public void setWorkFlowStepId(String workFlowStepId) {
		this.workFlowStepId = workFlowStepId;
	}
	/**
	 * @Description: 属性 isEnd 的get方法 
	 * @return id
	 */
	public String getIsEnd() {
		return this.isEnd;
	}
	/**
	 * @Description: 属性 isEnd 的set方法 
	 * @param id 
	 */
	public void setIsEnd(String isEnd) {
		this.isEnd = isEnd;
	}
	/**
	 * @Description: 属性 tradeCode 的get方法 
	 * @return id
	 */
	public String getTradeCode() {
		return this.tradeCode;
	}
	/**
	 * @Description: 属性 tradeCode 的set方法 
	 * @param id 
	 */
	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}
	/**
	 * @Description: 属性 tradeName 的get方法 
	 * @return id
	 */
	public String getTradeName() {
		return this.tradeName;
	}
	/**
	 * @Description: 属性 tradeName 的set方法 
	 * @param id 
	 */
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	/**
	 * @Description: 属性 buCode 的get方法 
	 * @return id
	 */
	public String getBuCode() {
		return this.buCode;
	}
	/**
	 * @Description: 属性 buCode 的set方法 
	 * @param id 
	 */
	public void setBuCode(String buCode) {
		this.buCode = buCode;
	}
	/**
	 * @Description: 属性 buName 的get方法 
	 * @return id
	 */
	public String getBuName() {
		return this.buName;
	}
	/**
	 * @Description: 属性 buName 的set方法 
	 * @param id 
	 */
	public void setBuName(String buName) {
		this.buName = buName;
	}
	/**
	 * @Description: 属性 lineCode 的get方法 
	 * @return id
	 */
	public String getLineCode() {
		return this.lineCode;
	}
	/**
	 * @Description: 属性 lineCode 的set方法 
	 * @param id 
	 */
	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}
	/**
	 * @Description: 属性 lineName 的get方法 
	 * @return id
	 */
	public String getLineName() {
		return this.lineName;
	}
	/**
	 * @Description: 属性 lineName 的set方法 
	 * @param id 
	 */
	public void setLineName(String lineName) {
		this.lineName = lineName;
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
	 * @Description: 属性 userName 的get方法 
	 * @return id
	 */
	public String getUserName() {
		return this.userName;
	}
	/**
	 * @Description: 属性 userName 的set方法 
	 * @param id 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @Description: 属性 synchronousTime 的get方法 
	 * @return id
	 */
	public java.util.Date getSynchronousTime() {
		return this.synchronousTime;
	}
	/**
	 * @Description: 属性 synchronousTime 的set方法 
	 * @param id 
	 */
	public void setSynchronousTime(java.util.Date synchronousTime) {
		this.synchronousTime = synchronousTime;
	}
	/**
	 * @Description: 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * @Description: 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
		
	
		
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:OmsHandlerDTO 自动生成的toString方法 </p> 
	* @author Guo  Yuchao   
	* @date 2015年02月05日  19:36:42 
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
