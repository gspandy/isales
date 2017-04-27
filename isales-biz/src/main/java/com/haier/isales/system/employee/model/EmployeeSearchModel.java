/**
* @Company 青鸟软通   
* @Title: Eployee.java 
* @Package com.haier.isales.system.employee.domain 
* @author Guo Yuchao   
* @date 2014-10-31 上午9:20:03 
* @version V1.0   
*/ 
package com.haier.isales.system.employee.model;

import com.haier.isales.common.CommonSearchModel;
import com.haier.isales.system.employee.domain.Employee;

/** 
 * @ClassName: Eployee 
 * @Description: 员工信息表 
 *  
 */
public class EmployeeSearchModel extends CommonSearchModel<Employee> {

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -1323398015717998825L;
	
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
	public EmployeeSearchModel() {
	}
	/**
	 * @Description: 属性 employeeSn 的get方法 
	 * @return employeeSn
	 */
	public String getEmployeeSn() {
		return employeeSn;
	}
	/**
	 * @Description: 属性 employeeSn 的set方法 
	 * @param employeeSn 
	 */
	public void setEmployeeSn(String employeeSn) {
		this.employeeSn = employeeSn;
	}
	/**
	 * @Description: 属性 employeeName 的get方法 
	 * @return employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @Description: 属性 employeeName 的set方法 
	 * @param employeeName 
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @Description: 属性 englishName 的get方法 
	 * @return englishName
	 */
	public String getEnglishName() {
		return englishName;
	}
	/**
	 * @Description: 属性 englishName 的set方法 
	 * @param englishName 
	 */
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	/**
	 * @Description: 属性 gender 的get方法 
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @Description: 属性 gender 的set方法 
	 * @param gender 
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @Description: 属性 phone 的get方法 
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @Description: 属性 phone 的set方法 
	 * @param phone 
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @Description: 属性 mobileNo 的get方法 
	 * @return mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	/**
	 * @Description: 属性 mobileNo 的set方法 
	 * @param mobileNo 
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	/**
	 * @Description: 属性 email 的get方法 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @Description: 属性 email 的set方法 
	 * @param email 
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @Description: 属性 idCardNo 的get方法 
	 * @return idCardNo
	 */
	public String getIdCardNo() {
		return idCardNo;
	}
	/**
	 * @Description: 属性 idCardNo 的set方法 
	 * @param idCardNo 
	 */
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	/**
	 * @Description: 属性 updateTime 的get方法 
	 * @return updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}
	/**
	 * @Description: 属性 updateTime 的set方法 
	 * @param updateTime 
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @Description: 属性 createTime 的get方法 
	 * @return createTime
	 */
	public String getCreateTime() {
		return createTime;
	}
	/**
	 * @Description: 属性 createTime 的set方法 
	 * @param createTime 
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	/**
	 * @Description: 属性 empStatusCode 的get方法 
	 * @return empStatusCode
	 */
	public String getEmpStatusCode() {
		return empStatusCode;
	}
	/**
	 * @Description: 属性 empStatusCode 的set方法 
	 * @param empStatusCode 
	 */
	public void setEmpStatusCode(String empStatusCode) {
		this.empStatusCode = empStatusCode;
	}
	/**
	 * @Description: 属性 empStatusName 的get方法 
	 * @return empStatusName
	 */
	public String getEmpStatusName() {
		return empStatusName;
	}
	/**
	 * @Description: 属性 empStatusName 的set方法 
	 * @param empStatusName 
	 */
	public void setEmpStatusName(String empStatusName) {
		this.empStatusName = empStatusName;
	}
	/**
	 * @Description: 属性 countryName 的get方法 
	 * @return countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/**
	 * @Description: 属性 countryName 的set方法 
	 * @param countryName 
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	/**
	 * @Description: 属性 companyName 的get方法 
	 * @return companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @Description: 属性 companyName 的set方法 
	 * @param companyName 
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @Description: 属性 buFuName 的get方法 
	 * @return buFuName
	 */
	public String getBuFuName() {
		return buFuName;
	}
	/**
	 * @Description: 属性 buFuName 的set方法 
	 * @param buFuName 
	 */
	public void setBuFuName(String buFuName) {
		this.buFuName = buFuName;
	}
	/**
	 * @Description: 属性 departmentName 的get方法 
	 * @return departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @Description: 属性 departmentName 的set方法 
	 * @param departmentName 
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @Description: 属性 empGroupName 的get方法 
	 * @return empGroupName
	 */
	public String getEmpGroupName() {
		return empGroupName;
	}
	/**
	 * @Description: 属性 empGroupName 的set方法 
	 * @param empGroupName 
	 */
	public void setEmpGroupName(String empGroupName) {
		this.empGroupName = empGroupName;
	}
	/**
	 * @Description: 属性 empSubGroupName 的get方法 
	 * @return empSubGroupName
	 */
	public String getEmpSubGroupName() {
		return empSubGroupName;
	}
	/**
	 * @Description: 属性 empSubGroupName 的set方法 
	 * @param empSubGroupName 
	 */
	public void setEmpSubGroupName(String empSubGroupName) {
		this.empSubGroupName = empSubGroupName;
	}
	/**
	 * @Description: 属性 notesMail 的get方法 
	 * @return notesMail
	 */
	public String getNotesMail() {
		return notesMail;
	}
	/**
	 * @Description: 属性 notesMail 的set方法 
	 * @param notesMail 
	 */
	public void setNotesMail(String notesMail) {
		this.notesMail = notesMail;
	}
	/**
	 * @Description: 属性 personelSubAreaName 的get方法 
	 * @return personelSubAreaName
	 */
	public String getPersonelSubAreaName() {
		return personelSubAreaName;
	}
	/**
	 * @Description: 属性 personelSubAreaName 的set方法 
	 * @param personelSubAreaName 
	 */
	public void setPersonelSubAreaName(String personelSubAreaName) {
		this.personelSubAreaName = personelSubAreaName;
	}
	/**
	 * @Description: 属性 operatorId 的get方法 
	 * @return operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}
	/**
	 * @Description: 属性 operatorId 的set方法 
	 * @param operatorId 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * @Description: 属性 grantStatus 的get方法 
	 * @return grantStatus
	 */
	public String getGrantStatus() {
		return grantStatus;
	}
	/**
	 * @Description: 属性 grantStatus 的set方法 
	 * @param grantStatus 
	 */
	public void setGrantStatus(String grantStatus) {
		this.grantStatus = grantStatus;
	}
	
}
