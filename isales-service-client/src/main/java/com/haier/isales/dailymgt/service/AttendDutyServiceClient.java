package com.haier.isales.dailymgt.service;

import com.haier.isales.dailymgt.dto.DailyAttendanceDTO;
import com.haier.isales.dailymgt.dto.DailyOffdutyDTO;

public interface AttendDutyServiceClient {
	
	/** 
	* @Description: 获取当前签到状态服务接口定义
	* @author Huang nana   
	* @date 2015-1-28 上午10:00:54 
	* @param queryParams
	* @return  
	*/ 
	public Object searchCurrentStatu(DailyAttendanceDTO queryParams);
	
	/** 
	* @Description: 签到服务接口定义
	* @author Huang nana   
	* @date 2015-1-28 上午10:01:09 
	* @param queryParams
	* @return  
	*/ 
	public Object signIn(DailyAttendanceDTO queryParams);
	
	/** 
	* @Description: 签退服务接口定义
	* @author Huang nana   
	* @date 2015-1-28 上午10:01:20 
	* @param queryParams
	* @return  
	*/ 
	public Object signOut(DailyAttendanceDTO queryParams);
	
	/** 
	* @Description: 按月获取休班服务接口定义
	* @author Huang nana   
	* @date 2015-1-28 上午10:01:30 
	* @param queryParams
	* @return  
	*/ 
	public Object searchInfoByMonth(DailyOffdutyDTO queryParams);
	
	/** 
	* @Description: 申请休班服务接口定义
	* @author Huang nana   
	* @date 2015-1-28 上午10:02:35 
	* @param queryParams
	* @return  
	*/ 
	public Object addOffDuty(DailyOffdutyDTO queryParams);
	
	/** 
	* @Description: 取消签到服务接口定义
	* @author Huang nana   
	* @date 2015-2-3 下午6:59:08 
	* @param queryParams
	* @return  
	*/ 
	public Object deleteOffDuty(DailyOffdutyDTO queryParams);
	
	/** 
	* @Description:查询签到信息
	* @author Guo Yuchao   
	* @date 2015-2-3 下午4:04:18 
	* @param holidayTime
	* @param operatorId
	* @return  
	*/ 
	public Object searchAttendInfo(String holidayTime,Long operatorId,String userOrgCode);

	/** 
	* @Description: 查询指定日期的签到信息
	* @author Guo Yuchao   
	* @date 2015-2-4 下午3:31:02 
	* @param attendDate
	* @param operatorId
	* @return  
	*/ 
	public Object searchDailyAttendInfo(String attendDate, Long operatorId, String userOrgCode);
	/** 
	* @Description: 查询指定月份的节假日、调休、周末信息 封装map
	* @author Guo Yuchao   
	* @date 2015-2-10 下午2:35:23 
	* @param holidayTime
	* @return  
	*/ 
	public Object findMonthHolidayMap(String holidayTime);
}
