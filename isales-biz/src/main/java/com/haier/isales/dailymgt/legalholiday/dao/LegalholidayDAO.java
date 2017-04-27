/**
 * @Company 青鸟软通   
 * @Title: LegalholidayDAO.java 
 * @Package  com.haier.isales.dailymgt.legalholiday.dao
 * @author Guo Yuchao   
 * @date 2015年02月02日  18:05:25
 * @version V1.0   
 */
package com.haier.isales.dailymgt.legalholiday.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.dailymgt.legalholiday.domain.LegalholidayDomain;

/**
 * @ClassName: LegalholidayDAO
 * @Description: Legalholiday的DAO接口定义类
 * 
 */
public interface LegalholidayDAO extends CommonDAO<LegalholidayDomain, Long> {
	/**
	 * @Description:
	 * @author Guo Yuchao
	 * @date 2015-2-2 下午6:22:53
	 * @param holidayTime
	 * @param holidayType
	 * @return
	 */
	List<LegalholidayDomain> findHolidayInfoByTypeMonth(
			@Param("holidayTime") String holidayTime,
			@Param("holidayType") String holidayType);

	/** 
	* @Description: 按日期获取节假日和调休信息
	* @author Guo Yuchao   
	* @date 2015-2-4 下午4:18:07 
	* @param holidayTime
	* @return  
	*/ 
	LegalholidayDomain findHolidayInfoByTypeDate(@Param("holidayTime")String holidayTime);
}
