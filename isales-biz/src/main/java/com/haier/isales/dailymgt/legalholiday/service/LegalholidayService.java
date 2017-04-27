/**
 * @Company 青鸟软通   
 * @Title: LegalholidayService.java 
 * @Package  com.haier.isales.dailymgt.legalholiday.service
 * @author Guo Yuchao   
 * @date 2015年02月02日  18:06:46
 * @version V1.0   
 */
package com.haier.isales.dailymgt.legalholiday.service;

import java.util.List;

import com.haier.isales.dailymgt.legalholiday.domain.LegalholidayDomain;

/** 
 * @ClassName: LegalholidayService
 * @Description: Legalholiday的Service接口定义类
 *  
 */
public interface LegalholidayService {
	/** 
	* @Description: 按月获取节假日和调休信息
	* @author Guo Yuchao   
	* @date 2015-2-2 下午6:30:31 
	* @param holidayTime
	* @param holidayType
	* @return  
	*/ 
	List<LegalholidayDomain> findHolidayInfoByTypeMonth(String holidayTime,String holidayType);
	
	/** 
	* @Description: 按日期获取节假日和调休信息
	* @author Guo Yuchao   
	* @date 2015-2-4 下午4:14:34 
	* @param holidayTime
	* @param holidayType
	* @return  
	*/ 
	LegalholidayDomain findHolidayInfoByDate(String holidayTime);
		
}
