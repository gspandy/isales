package com.haier.isales.salerinfo.personalsalary.dto;

import java.io.Serializable;

/** 
* @ClassName: PersonalSalaryDTO 
* @Description: TODO(这里用一句话描述这个类的作用) 
*  
*/ 
public class PersonalSalarySearchDTO implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 2712853352782489872L;

	private String ygid;
	
	private String months;

	/**
	 * @Description: 属性 ygid 的get方法 
	 * @return ygid
	 */
	public String getYgid() {
		return ygid;
	}

	/**
	 * @Description: 属性 ygid 的set方法 
	 * @param ygid 
	 */
	public void setYgid(String ygid) {
		this.ygid = ygid;
	}

	/**
	 * @Description: 属性 months 的get方法 
	 * @return months
	 */
	public String getMonths() {
		return months;
	}

	/**
	 * @Description: 属性 months 的set方法 
	 * @param months 
	 */
	public void setMonths(String months) {
		this.months = months;
	}
	
}
