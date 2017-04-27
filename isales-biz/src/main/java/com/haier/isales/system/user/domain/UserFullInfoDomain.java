/**
* @Company 青鸟软通   
* @Title: UserFullInfoDomain.java 
* @Package com.haier.isales.system.user.domain 
* @author Cao Rui   
* @date 2014年11月20日  22:43:53 
* @version V1.0   
*/ 
package com.haier.isales.system.user.domain;

import java.io.Serializable;

/** 
 * @ClassName: UserFullInfoDomain 
 * t_sys_employee_summary 自动生成的对应的实体对象   
 *  
 */
public class UserFullInfoDomain implements Serializable{
	private static final long serialVersionUID = -1416494633415L;

	/** 
	* @Fields operatorId : 用户主键
	*/
	private Long operatorId;
	/** 
	* @Fields userCode : 用户对应的员工号
	*/
	private String userCode;
	/** 
	* @Fields userName : 人员姓名
	*/
	private String userName;
	/** 
	* @Fields userSex : 性别
	*/
	private String userSex;
	/** 
	* @Fields userIdentityCard : 身份证号
	*/
	private String userIdentityCard;
	/** 
	* @Fields shopId : 门店编码
	*/
	private String shopId;
	/** 
	* @Fields shopName : 门店名称
	*/
	private String shopName;
	/** 
	* @Fields orgCode : 中心编码
	*/
	private String orgCode;
	/** 
	* @Fields orgName : 中心名称
	*/
	private String orgName;
	/** 
	* @Fields productId : 产品线ID
	*/
	private String productId;
	/** 
	* @Fields productName : 产品线名称
	*/
	private String productName;
	/** 
	* @Fields mainProductId : 主营产品线id
	*/ 
	private String mainProductId;	
	/** 
	* @Fields mainProductName : 主营产品线名称
	*/ 
	private String mainProductName;	
		
	
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
	 * 属性 userSex 的get方法 
	 * @return id
	 */
	public String getUserSex() {
		return this.userSex;
	}
	/**
	 * 属性 userSex 的set方法 
	 * @param id 
	 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	/**
	 * 属性 userIdentityCard 的get方法 
	 * @return id
	 */
	public String getUserIdentityCard() {
		return this.userIdentityCard;
	}
	/**
	 * 属性 userIdentityCard 的set方法 
	 * @param id 
	 */
	public void setUserIdentityCard(String userIdentityCard) {
		this.userIdentityCard = userIdentityCard;
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
	 * 属性 productId 的get方法 
	 * @return id
	 */
	public String getProductId() {
		return this.productId;
	}
	/**
	 * 属性 productId 的set方法 
	 * @param id 
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * 属性 productName 的get方法 
	 * @return id
	 */
	public String getProductName() {
		return this.productName;
	}
	/**
	 * 属性 productName 的set方法 
	 * @param id 
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * 属性 mainProductId 的get方法 
	 * @return mainProductId
	 */
	public String getMainProductId() {
		return mainProductId;
	}
	/**
	 * 属性 mainProductId 的set方法 
	 * @param mainProductId 
	 */
	public void setMainProductId(String mainProductId) {
		this.mainProductId = mainProductId;
	}
	/**
	 * 属性 mainProductName 的get方法 
	 * @return mainProductName
	 */
	public String getMainProductName() {
		return mainProductName;
	}
	/**
	 * 属性 mainProductName 的set方法 
	 * @param mainProductName 
	 */
	public void setMainProductName(String mainProductName) {
		this.mainProductName = mainProductName;
	}
/*====================hashCode and equals ====================*/
/**
	* <p>Description: UserFullInfoDomain 自动生成的hashcode方法</p> 
	* @author Cao Rui   
	* @date 2014年11月20日  22:43:53
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
	* <p>Description:UserFullInfoDomain 自动生成的equals方法 </p> 
	* @author Cao Rui   
	* @date 2014年11月20日  22:43:53
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
		UserFullInfoDomain other =(UserFullInfoDomain) obj;
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
	* <p>Description:UserFullInfoDomain 自动生成的toString方法 </p> 
	* @author Cao Rui   
	* @date 2014年11月20日  22:43:53 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "UserFullInfoDomain [" +
					"operatorId=" + operatorId + "," + 
					"userCode=" + userCode + "," + 
					"userName=" + userName + "," + 
					"userSex=" + userSex + "," + 
					"userIdentityCard=" + userIdentityCard + "," + 
					"shopId=" + shopId + "," + 
					"shopName=" + shopName + "," + 
					"orgCode=" + orgCode + "," + 
					"orgName=" + orgName + "," + 
					"productId=" + productId + "," + 
					"productName=" + productName + "," + 
				"]";
	}
}
