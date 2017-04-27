/**
* @Company 青鸟软通   
* @Title: PersonalSalaryClient.java 
* @Package com.haier.isales.salerinfo.personalsalary.service 
* @author John.zhao   
* @date 2015-2-26 上午10:44:12 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo.personalsalary.service;

import com.haier.isales.salerinfo.personalsalary.dto.PersonalSalarySearchDTO;

/** 
 * @ClassName: PersonalSalaryClient 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public interface PersonalSalaryClient {
	
	public Object searchPersonalSalary(PersonalSalarySearchDTO personalSalarySearchDTO);

}
