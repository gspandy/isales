/**
 * @Company 青鸟软通   
 * @Title: ReminderDAO.java 
 * @Package  com.haier.isales.reminder.dao
 * @author Liu Wenjie   
 * @date 2014年11月15日  17:19:35
 * @version V1.0   
 */
package com.haier.isales.reminder.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.reminder.domain.ReminderDomain;
/** 
 * @ClassName: ReminderDAO
 * @Description: Reminder的DAO接口定义类
 *  
 */
public interface ReminderDAO extends CommonDAO<ReminderDomain,Long>{
	
	/** 
	* @Description: 按照状态查询发送记录
	* @author Liu Wenjie   
	* @date 2014-11-15 下午7:25:46 
	* @return  
	*/ 
	public List<ReminderDomain> findBySendStatus(@Param("sendStatus")List<String> sendStatus);
}
