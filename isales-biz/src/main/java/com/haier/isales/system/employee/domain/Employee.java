/**
* @Company 青鸟软通   
* @Title: Eployee.java 
* @Package com.haier.isales.system.employee.domain 
* @author Guo Yuchao   
* @date 2014-10-31 上午9:20:03 
* @version V1.0   
*/ 
package com.haier.isales.system.employee.domain;

import java.io.Serializable;

/** 
 * @ClassName: Eployee 
 * 员工信息表 
 *  
 */
public class Employee implements Serializable {

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -1323398015717998825L;
	public static final String GRANT_STATUS_GRANTED="1";//已授权
	public static final String GRANT_STATUS_UNGRANT="0";//未授权
	private String employeeSn;   // CHAR(8) NOT NULL COMMENT '员工号',
	private String employeeName; //VARCHAR(80) DEFAULT NULL COMMENT '姓名',
	private String englishName;  // VARCHAR(80) DEFAULT NULL COMMENT '英文名',
	private String gender;       //CHAR(1) DEFAULT NULL COMMENT '性别 1男 2女',
	private String phone;        // VARCHAR(60) DEFAULT NULL COMMENT '电话',
	private String mobileNo;     // VARCHAR(60) DEFAULT NULL COMMENT '手机',
	private String email;        //VARCHAR(30) DEFAULT NULL COMMENT '个人邮箱',
	private String idCardNo;     // VARCHAR(30) DEFAULT NULL COMMENT '身份证号',
	private String updateTime;   // DATETIME DEFAULT NULL COMMENT '更新时间',
	private String createTime;   // DATETIME DEFAULT NULL COMMENT '创建时间',
	private String empStatusCode;
	private String empStatusName;
	private String countryName;
	private String companyName;
	private String buFuName;
	private String departmentName;
	private String empGroupName;
	private String empSubGroupName;
	private String notesMail;
	private String personelSubAreaName;
	
	private Long operatorId;//关联是否授权成登录用户使用
	private String grantStatus;//是否授权状态标志     已授权1          未授权0
	/** 
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-10-31 上午9:29:54  
	*/ 
	public Employee() {
	}
	/**
	 * 属性 employeeSn 的get方法 
	 * @return employeeSn
	 */
	public String getEmployeeSn() {
		return employeeSn;
	}
	/**
	 * 属性 employeeSn 的set方法 
	 * @param employeeSn 
	 */
	public void setEmployeeSn(String employeeSn) {
		this.employeeSn = employeeSn;
	}
	/**
	 * 属性 employeeName 的get方法 
	 * @return employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * 属性 employeeName 的set方法 
	 * @param employeeName 
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * 属性 englishName 的get方法 
	 * @return englishName
	 */
	public String getEnglishName() {
		return englishName;
	}
	/**
	 * 属性 englishName 的set方法 
	 * @param englishName 
	 */
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	/**
	 * 属性 gender 的get方法 
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 属性 gender 的set方法 
	 * @param gender 
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * 属性 phone 的get方法 
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 属性 phone 的set方法 
	 * @param phone 
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 属性 mobileNo 的get方法 
	 * @return mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	/**
	 * 属性 mobileNo 的set方法 
	 * @param mobileNo 
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	/**
	 * 属性 email 的get方法 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 属性 email 的set方法 
	 * @param email 
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 属性 idCardNo 的get方法 
	 * @return idCardNo
	 */
	public String getIdCardNo() {
		return idCardNo;
	}
	/**
	 * 属性 idCardNo 的set方法 
	 * @param idCardNo 
	 */
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	/**
	 * 属性 updateTime 的get方法 
	 * @return updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}
	/**
	 * 属性 updateTime 的set方法 
	 * @param updateTime 
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 属性 createTime 的get方法 
	 * @return createTime
	 */
	public String getCreateTime() {
		return createTime;
	}
	/**
	 * 属性 createTime 的set方法 
	 * @param createTime 
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	/**
	 * 属性 empStatusCode 的get方法 
	 * @return empStatusCode
	 */
	public String getEmpStatusCode() {
		return empStatusCode;
	}
	/**
	 * 属性 empStatusCode 的set方法 
	 * @param empStatusCode 
	 */
	public void setEmpStatusCode(String empStatusCode) {
		this.empStatusCode = empStatusCode;
	}
	/**
	 * 属性 empStatusName 的get方法 
	 * @return empStatusName
	 */
	public String getEmpStatusName() {
		return empStatusName;
	}
	/**
	 * 属性 empStatusName 的set方法 
	 * @param empStatusName 
	 */
	public void setEmpStatusName(String empStatusName) {
		this.empStatusName = empStatusName;
	}
	/**
	 * 属性 countryName 的get方法 
	 * @return countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/**
	 * 属性 countryName 的set方法 
	 * @param countryName 
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	/**
	 * 属性 companyName 的get方法 
	 * @return companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * 属性 companyName 的set方法 
	 * @param companyName 
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * 属性 buFuName 的get方法 
	 * @return buFuName
	 */
	public String getBuFuName() {
		return buFuName;
	}
	/**
	 * 属性 buFuName 的set方法 
	 * @param buFuName 
	 */
	public void setBuFuName(String buFuName) {
		this.buFuName = buFuName;
	}
	/**
	 * 属性 departmentName 的get方法 
	 * @return departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * 属性 departmentName 的set方法 
	 * @param departmentName 
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * 属性 empGroupName 的get方法 
	 * @return empGroupName
	 */
	public String getEmpGroupName() {
		return empGroupName;
	}
	/**
	 * 属性 empGroupName 的set方法 
	 * @param empGroupName 
	 */
	public void setEmpGroupName(String empGroupName) {
		this.empGroupName = empGroupName;
	}
	/**
	 * 属性 empSubGroupName 的get方法 
	 * @return empSubGroupName
	 */
	public String getEmpSubGroupName() {
		return empSubGroupName;
	}
	/**
	 * 属性 empSubGroupName 的set方法 
	 * @param empSubGroupName 
	 */
	public void setEmpSubGroupName(String empSubGroupName) {
		this.empSubGroupName = empSubGroupName;
	}
	/**
	 * 属性 notesMail 的get方法 
	 * @return notesMail
	 */
	public String getNotesMail() {
		return notesMail;
	}
	/**
	 * 属性 notesMail 的set方法 
	 * @param notesMail 
	 */
	public void setNotesMail(String notesMail) {
		this.notesMail = notesMail;
	}
	/**
	 * 属性 personelSubAreaName 的get方法 
	 * @return personelSubAreaName
	 */
	public String getPersonelSubAreaName() {
		return personelSubAreaName;
	}
	/**
	 * 属性 personelSubAreaName 的set方法 
	 * @param personelSubAreaName 
	 */
	public void setPersonelSubAreaName(String personelSubAreaName) {
		this.personelSubAreaName = personelSubAreaName;
	}
	/**
	 * 属性 operatorId 的get方法 
	 * @return operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}
	/**
	 * 属性 operatorId 的set方法 
	 * @param operatorId 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * 属性 grantStatus 的get方法 
	 * @return grantStatus
	 */
	public String getGrantStatus() {
		return grantStatus;
	}
	/**
	 * 属性 grantStatus 的set方法 
	 * @param grantStatus 
	 */
	public void setGrantStatus(String grantStatus) {
		this.grantStatus = grantStatus;
	}
}
