/**
 * @Company 青鸟软通   
 * @Title: DailyAttendanceDAO.java 
 * @Package  com.haier.isales.dailymgt.dao
 * @author Huang Nana   
 * @date 2015年01月26日  18:52:42
 * @version V1.0   
 */
package com.haier.isales.dailymgt.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.dailymgt.domain.AttendanceTypeDomain;
import com.haier.isales.dailymgt.domain.DailyAttendanceDomain;
/** 
 * @ClassName: DailyAttendanceDAO
 * @Description: DailyAttendance的DAO接口定义类
 *  
 */
/** 
* @ClassName: DailyAttendanceDAO 
* @Description: TODO(这里用一句话描述这个类的作用) 
*  
*/ 
public interface DailyAttendanceDAO extends CommonDAO<DailyAttendanceDomain,Long>{
	/** 
	* @Description: 按天查询签到+签退数
	* @author Huang nana   
	* @date 2015-1-28 上午9:42:24 
	* @param operatorId
	* @param queryTime
	* @return  
	*/ 
	int checkIsAttendanced(@Param("operatorId") Long operatorId,@Param("queryTime") Date queryTime,@Param("tableNameSuffix") String tableNameSuffix);
	
	/** 
	* @Description: 按类型、日期查询数量
	* @author Huang nana   
	* @date 2015-1-28 上午9:43:04 
	* @param operatorId
	* @param signType
	* @return  
	*/ 
	int checkIsAttendancedByType(@Param("operatorId") Long operatorId,@Param("queryTime") Date queryTime,@Param("signType") String signType);
	
	/** 
	* @Description: 按日期获取签到时间
	* @author Huang nana   
	* @date 2015-1-30 下午12:42:42 
	* @param operatorId
	* @param queryTime
	* @return  
	*/ 
	DailyAttendanceDomain findSignIn(@Param("operatorId") Long operatorId,@Param("queryTime") Date queryTime,@Param("tableNameSuffix") String tableNameSuffix);
	
	/** 
	* @Description: 查询签到数据中的持续时间（毫秒）
	* @author Huang nana   
	* @date 2015-2-4 下午6:35:03 
	* @param operatorId
	* @param queryTime
	* @return  
	*/ 
	DailyAttendanceDomain findDuration(@Param("operatorId") Long operatorId,@Param("queryTime") Date queryTime,@Param("tableNameSuffix") String tableNameSuffix);
	
	/** 
	* @Description: 根据用户ID + 时间获取签到 状态
	* @author Guo Yuchao   
	* @date 2015-2-2 下午5:36:51 
	* @param attendanceTypeDomain
	* @return  
	*/ 
	List<AttendanceTypeDomain> findAttendStatus(@Param("operatorId") Long operatorId,@Param("signDate") String signDate,@Param("tableNameSuffix") String tableNameSuffix);
	/** 
	* @Description:  根据用户ID + 日期  获取签到 状态
	* @author Guo Yuchao   
	* @date 2015-2-4 下午4:44:34 
	* @param operatorId
	* @param signDate
	* @return  
	*/ 
	AttendanceTypeDomain findDailyAttendStatus(@Param("operatorId") Long operatorId,@Param("signDate") String signDate,@Param("tableNameSuffix") String tableNameSuffix);

	/** 
	* @Description: 保存一条实体的方法  按照中心分表，使用不同的表后缀名保存到相应的表
	* @author Cao Rui   
	* @date 2015年9月2日  00:58:34 
	* @param entity
	* @return  
	*/ 
	public void saveWithTableNameSuffix(DailyAttendanceDomain entity);
	
}
