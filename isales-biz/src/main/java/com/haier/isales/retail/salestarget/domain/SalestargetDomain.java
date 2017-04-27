/**
* @Company 青鸟软通   
* @Title: SalestargetDomain.java 
* @Package com.haier.isales.retail.salestarget.domain 
* @author Cao Rui   
* @date 2014年12月22日  18:08:48 
* @version V1.0   
*/ 
package com.haier.isales.retail.salestarget.domain;

import java.io.Serializable;

/** 
 * @ClassName: SalestargetDomain 
 * t_isales_sales_target 自动生成的对应的实体对象   
 *  
 */
public class SalestargetDomain implements Serializable{
	private static final long serialVersionUID = -1419242928394L;

	/** 
	* @Fields id : id
	*/
	private Long id;
	/** 
	* @Fields operatorId : 操作人id
	*/
	private Long operatorId;
	/** 
	* @Fields userCode : 员工号
	*/
	private String userCode;
	/** 
	* @Fields orgCode : 所属中心编码
	*/
	private String orgCode;
	/** 
	* @Fields orgName : 所属中心名称
	*/
	private String orgName;
	/** 
	* @Fields shopId : 所属门店
	*/
	private String shopId;
	/** 
	* @Fields shopName : 所属门店名称
	*/
	private String shopName;
	/** 
	* @Fields productLine : 产业编码
	*/
	private String productLine;
	/** 
	* @Fields productLineName : 产业名称
	*/
	private String productLineName;
	/** 
	* @Fields year : 年份
	*/
	private Integer year;
	/** 
	* @Fields month : 月份
	*/
	private Integer month;
	/** 
	* @Fields targetAmount : 目标零售额
	*/
	private java.math.BigDecimal targetAmount;
	/** 
	* @Fields targetNum : 目标销量
	*/
	private java.math.BigDecimal targetNum;
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
	 * 属性 orgCode 的get方法 
	 * @return id
	 */
	public String getOrgCode() {
		return this.orgCode;
	}
	/**
	 * 属性 orgCode 的set方法 
	 * @param id 
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
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
	 * 属性 shopId 的get方法 
	 * @return id
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * 属性 shopId 的set方法 
	 * @param id 
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
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
	 * 属性 productLine 的get方法 
	 * @return id
	 */
	public String getProductLine() {
		return this.productLine;
	}
	/**
	 * 属性 productLine 的set方法 
	 * @param id 
	 */
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	/**
	 * 属性 productLineName 的get方法 
	 * @return id
	 */
	public String getProductLineName() {
		return this.productLineName;
	}
	/**
	 * 属性 productLineName 的set方法 
	 * @param id 
	 */
	public void setProductLineName(String productLineName) {
		this.productLineName = productLineName;
	}
	/**
	 * 属性 year 的get方法 
	 * @return id
	 */
	public Integer getYear() {
		return this.year;
	}
	/**
	 * 属性 year 的set方法 
	 * @param id 
	 */
	public void setYear(Integer year) {
		this.year = year;
	}
	/**
	 * 属性 month 的get方法 
	 * @return id
	 */
	public Integer getMonth() {
		return this.month;
	}
	/**
	 * 属性 month 的set方法 
	 * @param id 
	 */
	public void setMonth(Integer month) {
		this.month = month;
	}
	/**
	 * 属性 targetAmount 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getTargetAmount() {
		return this.targetAmount;
	}
	/**
	 * 属性 targetAmount 的set方法 
	 * @param id 
	 */
	public void setTargetAmount(java.math.BigDecimal targetAmount) {
		this.targetAmount = targetAmount;
	}
	/**
	 * 属性 targetNum 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getTargetNum() {
		return this.targetNum;
	}
	/**
	 * 属性 targetNum 的set方法 
	 * @param id 
	 */
	public void setTargetNum(java.math.BigDecimal targetNum) {
		this.targetNum = targetNum;
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
	* <p>Description: SalestargetDomain 自动生成的hashcode方法</p> 
	* @author Cao Rui   
	* @date 2014年12月22日  18:08:48
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
	* <p>Description:SalestargetDomain 自动生成的equals方法 </p> 
	* @author Cao Rui   
	* @date 2014年12月22日  18:08:48
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
		SalestargetDomain other =(SalestargetDomain) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}	
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:SalestargetDomain 自动生成的toString方法 </p> 
	* @author Cao Rui   
	* @date 2014年12月22日  18:08:48 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "SalestargetDomain [" +
					"id=" + id + "," + 
					"operatorId=" + operatorId + "," + 
					"userCode=" + userCode + "," + 
					"orgCode=" + orgCode + "," + 
					"orgName=" + orgName + "," + 
					"shopId=" + shopId + "," + 
					"shopName=" + shopName + "," + 
					"productLine=" + productLine + "," + 
					"productLineName=" + productLineName + "," + 
					"year=" + year + "," + 
					"month=" + month + "," + 
					"targetAmount=" + targetAmount + "," + 
					"targetNum=" + targetNum + "," + 
					"updateTime=" + updateTime + "," + 
					"createTime=" + createTime + "," + 
					"remark=" + remark + "," + 
				"]";
	}
	
	
}
