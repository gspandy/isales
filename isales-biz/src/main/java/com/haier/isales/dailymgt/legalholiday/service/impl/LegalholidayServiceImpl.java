/**
 * @Company 青鸟软通   
 * @Title: LegalholidayService.java 
 * @Package  com.haier.isales.dailymgt.legalholiday.service.impl
 * @author Guo Yuchao   
 * @date 2015年02月02日  18:06:46
 * @version V1.0   
 */
package com.haier.isales.dailymgt.legalholiday.service.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.dailymgt.legalholiday.dao.LegalholidayDAO;
import com.haier.isales.dailymgt.legalholiday.domain.LegalholidayDomain;
import com.haier.isales.dailymgt.legalholiday.service.LegalholidayService;

/** 
 * @ClassName: LegalholidayService
 * @Description: Legalholiday的Service接口定义类
 *  
 */
public class LegalholidayServiceImpl implements LegalholidayService{

	private static final Logger LOG = LoggerFactory.getLogger(LegalholidayServiceImpl.class);
	
	/** 
	* @Fields legalholidayDao : LegalholidayDao 工具依赖 
	*/
	private LegalholidayDAO legalholidayDao;
	
	
	/*===============业务方法=============*/
	/**
	* <p>Description: 获取节假日和调休信息</p> 
	* @author Guo Yuchao   
	* @date 2015-2-2 下午6:31:10 
	* @param holidayTime
	* @param holidayType
	* @return 
	* @see com.haier.isales.dailymgt.legalholiday.service.LegalholidayService#findHolidayInfoByTypeMonth(java.lang.String, java.lang.String) 
	*/ 
	@Override
	public List<LegalholidayDomain> findHolidayInfoByTypeMonth(
			String holidayTime, String holidayType) {
		LOG.info("info");
		return legalholidayDao.findHolidayInfoByTypeMonth(holidayTime, holidayType);
	}
	
	/**
	 * <p>Description: 按日期获取节假日和调休信息</p> 
	 * @author Guo Yuchao   
	 * @date 2015-2-4 下午4:17:03 
	 * @param holidayTime
	 * @return 
	 * @see com.haier.isales.dailymgt.legalholiday.service.LegalholidayService#findHolidayInfoByDate(java.lang.String) 
	 */ 
	@Override
	public LegalholidayDomain findHolidayInfoByDate(String holidayTime) {
		return legalholidayDao.findHolidayInfoByTypeDate(holidayTime);
	}
	
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性legalholidayDao 的set方法 
	 */
	public void setLegalholidayDao(LegalholidayDAO legalholidayDao){
		this.legalholidayDao = legalholidayDao;
	}




	
}
