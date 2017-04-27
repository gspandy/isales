/**
* @Company 青鸟软通   
* @Title: MdmHandlerDomain.java 
* @Package com.haier.isales.app.mdmhandler.domain 
* @author Guo Yuchao   
* @date 2015年02月06日  12:40:24 
* @version V1.0   
*/ 
package com.haier.isales.app.mdmhandler.domain;

import java.io.Serializable;

/** 
 * @ClassName: MdmHandlerDomain 
 * t_isales_bpm_handler_mdm_temp 自动生成的对应的实体对象   
 *  
 */
public class MdmHandlerDomain implements Serializable{
	private static final long serialVersionUID = -1423197624440L;

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
	* @Fields custRowId : CUST_ROW_ID字段
	*/
	private String custRowId;
	/** 
	* @Fields customerCode : 门店编码
	*/
	private String customerCode;
	/** 
	* @Fields customerName1 : 门店名称
	*/
	private String customerName1;
	/** 
	* @Fields customerCategory : CUSTOMER_CATEGORY字段
	*/
	private String customerCategory;
	/** 
	* @Fields industryClass : INDUSTRY_CLASS字段
	*/
	private String industryClass;
	/** 
	* @Fields customerNumberSh : CUSTOMER_NUMBER_SH字段
	*/
	private String customerNumberSh;
	/** 
	* @Fields subCustomerName1 : SUB_CUSTOMER_NAME1字段
	*/
	private String subCustomerName1;
	/** 
	* @Fields firstAreaCode : FIRST_AREA_CODE字段
	*/
	private String firstAreaCode;
	/** 
	* @Fields firstAreaName : FIRST_AREA_NAME字段
	*/
	private String firstAreaName;
	/** 
	* @Fields branchCompanyCode : BRANCH_COMPANY_CODE字段
	*/
	private String branchCompanyCode;
	/** 
	* @Fields branchCompanyName : BRANCH_COMPANY_NAME字段
	*/
	private String branchCompanyName;
	/** 
	* @Fields branchCode : BRANCH_CODE字段
	*/
	private String branchCode;
	/** 
	* @Fields smbManager : 处理人工号
	*/
	private String smbManager;
	/** 
	* @Fields smbManagerName : 处理人姓名
	*/
	private String smbManagerName;
	/** 
	* @Fields lastUpd : LAST_UPD字段
	*/
	private String lastUpd;
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
	 * 属性 custRowId 的get方法 
	 * @return id
	 */
	public String getCustRowId() {
		return this.custRowId;
	}
	/**
	 * 属性 custRowId 的set方法 
	 * @param id 
	 */
	public void setCustRowId(String custRowId) {
		this.custRowId = custRowId;
	}
	/**
	 * 属性 customerCode 的get方法 
	 * @return id
	 */
	public String getCustomerCode() {
		return this.customerCode;
	}
	/**
	 * 属性 customerCode 的set方法 
	 * @param id 
	 */
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	/**
	 * 属性 customerName1 的get方法 
	 * @return id
	 */
	public String getCustomerName1() {
		return this.customerName1;
	}
	/**
	 * 属性 customerName1 的set方法 
	 * @param id 
	 */
	public void setCustomerName1(String customerName1) {
		this.customerName1 = customerName1;
	}
	/**
	 * 属性 customerCategory 的get方法 
	 * @return id
	 */
	public String getCustomerCategory() {
		return this.customerCategory;
	}
	/**
	 * 属性 customerCategory 的set方法 
	 * @param id 
	 */
	public void setCustomerCategory(String customerCategory) {
		this.customerCategory = customerCategory;
	}
	/**
	 * 属性 industryClass 的get方法 
	 * @return id
	 */
	public String getIndustryClass() {
		return this.industryClass;
	}
	/**
	 * 属性 industryClass 的set方法 
	 * @param id 
	 */
	public void setIndustryClass(String industryClass) {
		this.industryClass = industryClass;
	}
	/**
	 * 属性 customerNumberSh 的get方法 
	 * @return id
	 */
	public String getCustomerNumberSh() {
		return this.customerNumberSh;
	}
	/**
	 * 属性 customerNumberSh 的set方法 
	 * @param id 
	 */
	public void setCustomerNumberSh(String customerNumberSh) {
		this.customerNumberSh = customerNumberSh;
	}
	/**
	 * 属性 subCustomerName1 的get方法 
	 * @return id
	 */
	public String getSubCustomerName1() {
		return this.subCustomerName1;
	}
	/**
	 * 属性 subCustomerName1 的set方法 
	 * @param id 
	 */
	public void setSubCustomerName1(String subCustomerName1) {
		this.subCustomerName1 = subCustomerName1;
	}
	/**
	 * 属性 firstAreaCode 的get方法 
	 * @return id
	 */
	public String getFirstAreaCode() {
		return this.firstAreaCode;
	}
	/**
	 * 属性 firstAreaCode 的set方法 
	 * @param id 
	 */
	public void setFirstAreaCode(String firstAreaCode) {
		this.firstAreaCode = firstAreaCode;
	}
	/**
	 * 属性 firstAreaName 的get方法 
	 * @return id
	 */
	public String getFirstAreaName() {
		return this.firstAreaName;
	}
	/**
	 * 属性 firstAreaName 的set方法 
	 * @param id 
	 */
	public void setFirstAreaName(String firstAreaName) {
		this.firstAreaName = firstAreaName;
	}
	/**
	 * 属性 branchCompanyCode 的get方法 
	 * @return id
	 */
	public String getBranchCompanyCode() {
		return this.branchCompanyCode;
	}
	/**
	 * 属性 branchCompanyCode 的set方法 
	 * @param id 
	 */
	public void setBranchCompanyCode(String branchCompanyCode) {
		this.branchCompanyCode = branchCompanyCode;
	}
	/**
	 * 属性 branchCompanyName 的get方法 
	 * @return id
	 */
	public String getBranchCompanyName() {
		return this.branchCompanyName;
	}
	/**
	 * 属性 branchCompanyName 的set方法 
	 * @param id 
	 */
	public void setBranchCompanyName(String branchCompanyName) {
		this.branchCompanyName = branchCompanyName;
	}
	/**
	 * 属性 branchCode 的get方法 
	 * @return id
	 */
	public String getBranchCode() {
		return this.branchCode;
	}
	/**
	 * 属性 branchCode 的set方法 
	 * @param id 
	 */
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	/**
	 * 属性 smbManager 的get方法 
	 * @return id
	 */
	public String getSmbManager() {
		return this.smbManager;
	}
	/**
	 * 属性 smbManager 的set方法 
	 * @param id 
	 */
	public void setSmbManager(String smbManager) {
		this.smbManager = smbManager;
	}
	/**
	 * 属性 smbManagerName 的get方法 
	 * @return id
	 */
	public String getSmbManagerName() {
		return this.smbManagerName;
	}
	/**
	 * 属性 smbManagerName 的set方法 
	 * @param id 
	 */
	public void setSmbManagerName(String smbManagerName) {
		this.smbManagerName = smbManagerName;
	}
	/**
	 * 属性 lastUpd 的get方法 
	 * @return id
	 */
	public String getLastUpd() {
		return this.lastUpd;
	}
	/**
	 * 属性 lastUpd 的set方法 
	 * @param id 
	 */
	public void setLastUpd(String lastUpd) {
		this.lastUpd = lastUpd;
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
	* <p>Description: MdmHandlerDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2015年02月06日  12:40:24
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
	* <p>Description:MdmHandlerDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2015年02月06日  12:40:24
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
		MdmHandlerDomain other =(MdmHandlerDomain) obj;

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
	* <p>Description:MdmHandlerDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2015年02月06日  12:40:24 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "MdmHandlerDomain [" +
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
					"custRowId=" + custRowId + "," + 
					"customerCode=" + customerCode + "," + 
					"customerName1=" + customerName1 + "," + 
					"customerCategory=" + customerCategory + "," + 
					"industryClass=" + industryClass + "," + 
					"customerNumberSh=" + customerNumberSh + "," + 
					"subCustomerName1=" + subCustomerName1 + "," + 
					"firstAreaCode=" + firstAreaCode + "," + 
					"firstAreaName=" + firstAreaName + "," + 
					"branchCompanyCode=" + branchCompanyCode + "," + 
					"branchCompanyName=" + branchCompanyName + "," + 
					"branchCode=" + branchCode + "," + 
					"smbManager=" + smbManager + "," + 
					"smbManagerName=" + smbManagerName + "," + 
					"lastUpd=" + lastUpd + "," + 
					"synchronousTime=" + synchronousTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
