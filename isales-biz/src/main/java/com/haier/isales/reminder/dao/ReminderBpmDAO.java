/**
 * @Company 青鸟软通   
 * @Title: ReminderBpmDAO.java 
 * @Package  com.haier.isales.reminder.dao
 * @author Cao Rui   
 * @date 2015年06月12日  10:24:50
 * @version V1.0   
 */
package com.haier.isales.reminder.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.reminder.domain.ReminderBpmDomain;
/** 
 * @ClassName: ReminderBpmDAO
 * @Description: ReminderBpm的DAO接口定义类
 *  
 */
public interface ReminderBpmDAO extends CommonDAO<ReminderBpmDomain,Long>{
	/** 
	* @Description: TODO 根据用户编码查询可显示的ReminderBpm数目
	* @author Shao Jingkai   
	* @date 2015-6-18 上午11:53:40 
	* @param userCode
	* @return  
	*/ 
	public Integer getCountByUserCode(@Param("userCode") String userCode);
}
