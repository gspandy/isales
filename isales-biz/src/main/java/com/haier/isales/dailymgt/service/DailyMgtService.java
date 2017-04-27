/**
 * @Company 青鸟软通   
 * @Title: DailyMgtService.java 
 * @Package  com.haier.isales.dailymgt.service
 * @author Huang Nana   
 * @date 2015年01月26日  16:44:24
 * @version V1.0   
 */
package com.haier.isales.dailymgt.service;

import java.util.List;

import com.haier.isales.dailymgt.dto.AttendInfoDTO;
import com.haier.isales.dailymgt.dto.AttendSummary;
import com.haier.isales.dailymgt.dto.DailyAttendanceDTO;
import com.haier.isales.dailymgt.dto.DailyOffdutyDTO;

/** 
 * @ClassName: DailyMgtService
 * @Description: DailyMgt的Service接口定义类
 *  
 */
public interface DailyMgtService {

		/*员工月份*/
	
	/*签到、签退*/
	
	/*补签*/
	
	/*休假*/

	/*获取当前签到状态*/
	/** 
	* @Description: 获取当前签到状态接口定义
	* @author Huang nana   
	* @date 2015-1-28 上午9:44:56 
	* @param dalyAttendanceDto
	* @return  
	*/ 
	public String searchCurrentStatu(DailyAttendanceDTO dalyAttendanceDto);
	
	/** 
	* @Description: 签到接口定义
	* @author Huang nana   
	* @date 2015-1-28 上午9:45:14 
	* @param dalyAttendanceDto
	* @return  
	*/ 
	public String addSignIn(DailyAttendanceDTO dalyAttendanceDto);
	
	/** 
	* @Description: 签退接口定义
	* @author Huang nana   
	* @date 2015-1-28 上午9:45:23 
	* @param dalyAttendanceDto
	* @return  
	*/ 
	public String addSignOut(DailyAttendanceDTO dalyAttendanceDto);
	
	/** 
	* @Description: 按月获取休班列表接口定义
	* @author Huang nana   
	* @date 2015-1-28 上午9:45:30 
	* @param dailyOffdutyDto
	* @return  
	*/ 
	public List<DailyOffdutyDTO> searchOffDutyByMonth(DailyOffdutyDTO dailyOffdutyDto);
	
	/** 
	* @Description: 申请休班接口定义
	* @author Huang nana   
	* @date 2015-1-28 上午9:45:50 
	* @param dailyOffdutyDto
	* @return  
	*/ 
	public String addOffDuty(DailyOffdutyDTO dailyOffdutyDto);
	
	/** 
	* @Description: 取消休班接口定义
	* @author Huang nana   
	* @date 2015-2-3 下午6:53:04 
	* @param dailyOffdutyDto
	* @return  
	*/ 
	public String deleteOffDuty(DailyOffdutyDTO dailyOffdutyDto);
	
	/** 
	* @Description: 获取工作持续时间：签退时间-签到时间
	* @author Huang nana   
	* @date 2015-1-30 下午12:43:46 
	* @param dalyAttendanceDto
	* @return  
	*/ 
	public String searchLastedTime(DailyAttendanceDTO dalyAttendanceDto); 
	/** 
	* @Description: 查询签到信息 
	* @author Guo Yuchao   
	* @date 2015-2-2 下午6:40:08 
	* @param holidayTime
	* @param operatorId
	* @return  
	*/ 
	public AttendSummary searchAttendInfo(String holidayTime, Long operatorId, String userOrgCode);
	
	/** 
	* @Description: 计算签到时常：毫秒（签退时间-签到时间）
	* @author Huang nana   
	* @date 2015-2-4 下午3:51:53 
	* @param dalyAttendanceDto
	* @return  
	*/ 
	public Long calcDuration(DailyAttendanceDTO dalyAttendanceDto);
	
	/** 
	* @Description: 将持续时间格式化：xx时xx分
	* @author Huang nana   
	* @date 2015-2-4 下午5:10:21 
	* @param duration
	* @return  
	*/ 
	public String formateDuration(Long duration);
	
	/** 
	* @Description: 查询当天签到、签退时间，并计算时长
	* @author Huang nana   
	* @date 2015-2-4 下午5:26:11 
	* @param dalyAttendanceDto
	* @return  
	*/ 
	public Long searchDuration(DailyAttendanceDTO dalyAttendanceDto);

	/** 
	* @Description:  查询指定日期的签到信息
	* @author Guo Yuchao   
	* @date 2015-2-4 下午3:38:33 
	* @param attendDate
	* @param operatorId
	* @return  
	*/ 
	public AttendInfoDTO searchDailyAttendInfo(String attendDate,
			Long operatorId, String userOrgCode); 
	/** 
	* @Description: 查询指定月份的节假日、调休、周末信息 封装map
	* @author Guo Yuchao   
	* @date 2015-2-10 下午2:23:34 
	* @param holidayTime
	* @return  
	*/ 
	List<String> findMonthHolidayMap(String holidayTime);	
}
