/**
 * @Company 青鸟软通   
 * @Title: DailyOffdutyDAO.java 
 * @Package  com.haier.isales.dailymgt.dao
 * @author Huang Nana   
 * @date 2015年01月27日  14:20:22
 * @version V1.0   
 */
package com.haier.isales.dailymgt.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.dailymgt.domain.DailyOffdutyDomain;
/** 
 * @ClassName: DailyOffdutyDAO
 * @Description: DailyOffduty的DAO接口定义类
 *  
 */
public interface DailyOffdutyDAO extends CommonDAO<DailyOffdutyDomain,Long>{
	/** 
	* @Description: 按天获取休假数量
	* @author Huang nana   
	* @date 2015-1-28 上午9:44:09 
	* @param operatorId
	* @param queryTime
	* @return  
	*/ 
	int checkIsOnDuty(@Param("operatorId") Long operatorId,@Param("queryTime") Date queryTime);
	
	/** 
	* @Description: 物理删除休班
	* @author Huang nana   
	* @date 2015-2-3 下午7:00:53 
	* @param operatorId
	* @param queryTime  
	*/ 
	void deleteOffDuty(@Param("operatorId") Long operatorId,@Param("queryTime") Date queryTime);
	
	/** 
	* @Description: 按月获取休假日期列表
	* @author Huang nana   
	* @date 2015-1-28 上午9:44:27 
	* @param operatorId
	* @param queryTime
	* @return  
	*/ 
	List<DailyOffdutyDomain> searchOffDutyByMonth(@Param("operatorId") Long operatorId,@Param("queryTime") Date queryTime);
}
