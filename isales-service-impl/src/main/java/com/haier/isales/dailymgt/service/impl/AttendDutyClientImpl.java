/**
* @Company 青鸟软通   
* @Title: AttendDutyClientImpl.java 
* @Package com.haier.isales.dailymgt.service.impl 
* @author Huang nana   
* @date 2015-1-27 下午3:31:39 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import com.haier.isales.dailymgt.dto.AttendInfoDTO;
import com.haier.isales.dailymgt.dto.AttendSummary;
import com.haier.isales.dailymgt.dto.DailyAttendanceDTO;
import com.haier.isales.dailymgt.dto.DailyOffdutyDTO;
import com.haier.isales.dailymgt.service.AttendDutyServiceClient;
import com.haier.isales.dailymgt.service.DailyMgtService;

/** 
 * @ClassName: AttendDutyClientImpl 
 * @Description: 日控考勤服务接口实现
 *  
 */
public class AttendDutyClientImpl implements AttendDutyServiceClient {

	private DailyMgtService dailyMgtService;
	/**
	* <p>Description: 获取当前登录状态服务接口实现</p> 
	* @author Huang nana   
	* @date 2015-1-28 上午10:03:41 
	* @param queryDto
	* @return 
	* @see com.haier.isales.dailymgt.service.AttendDutyServiceClient#searchCurrentStatu(com.haier.isales.dailymgt.dto.DailyAttendanceDTO) 
	*/ 
	@Override
	public DailyAttendanceDTO searchCurrentStatu(DailyAttendanceDTO queryDto) {
		String currentStatu = dailyMgtService.searchCurrentStatu(queryDto);
		queryDto.setCurrentStatu(currentStatu);
		if("1103".equals(currentStatu)){
			Long duration = dailyMgtService.searchDuration(queryDto);
			queryDto.setLastedTime(dailyMgtService.formateDuration(duration));
		}
		
		return queryDto;
	}

	/**
	* <p>Description: 签到服务接口实现</p> 
	* @author Huang nana   
	* @date 2015-1-28 上午10:04:40 
	* @param queryDto
	* @return 
	* @see com.haier.isales.dailymgt.service.AttendDutyServiceClient#signIn(com.haier.isales.dailymgt.dto.DailyAttendanceDTO) 
	*/ 
	@Override
	public DailyAttendanceDTO signIn(DailyAttendanceDTO queryDto) {
		queryDto.setSignMessage(dailyMgtService.addSignIn(queryDto));
		//将签到时间转换格式为 xxxx-xx-xx xx:xx:xx am
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa",Locale.ENGLISH);
		//变换时间格式
		//SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		queryDto.setDateString(sdf.format(queryDto.getSignTime()));
		return queryDto;
	}

	/**
	* <p>Description: 签退服务接口实现</p> 
	* @author Huang nana   
	* @date 2015-1-28 上午10:04:53 
	* @param queryDto
	* @return 
	* @see com.haier.isales.dailymgt.service.AttendDutyServiceClient#signOut(com.haier.isales.dailymgt.dto.DailyAttendanceDTO) 
	*/ 
	@Override
	public DailyAttendanceDTO signOut(DailyAttendanceDTO queryDto) {
		//签退
		queryDto.setSignMessage(dailyMgtService.addSignOut(queryDto));
		//将签退时间转换格式为 xxxx-xx-xx xx:xx:xx am
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa",Locale.ENGLISH);
		//变换时间格式
		//SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		queryDto.setDateString(sdf.format(queryDto.getSignTime()));
		//签退时显示当天签到持续时间
		queryDto.setLastedTime(dailyMgtService.searchLastedTime(queryDto));
		return queryDto;
	}

	/**
	* <p>Description: 按月获取休班列表服务接口实现</p> 
	* @author Huang nana   
	* @date 2015-1-28 上午10:05:02 
	* @param queryDto
	* @return 
	* @see com.haier.isales.dailymgt.service.AttendDutyServiceClient#searchInfoByMonth(com.haier.isales.dailymgt.dto.DailyOffdutyDTO) 
	*/ 
	@Override
	public List<DailyOffdutyDTO> searchInfoByMonth(DailyOffdutyDTO queryDto) {
		List<DailyOffdutyDTO> returnList = dailyMgtService.searchOffDutyByMonth(queryDto);
		return returnList;
	}

	/**
	* <p>Description: 申请休班服务接口实现</p> 
	* @author Huang nana   
	* @date 2015-1-28 上午10:05:20 
	* @param queryDto
	* @return 
	* @see com.haier.isales.dailymgt.service.AttendDutyServiceClient#addOffDuty(com.haier.isales.dailymgt.dto.DailyOffdutyDTO) 
	*/ 
	@Override
	public DailyOffdutyDTO addOffDuty(DailyOffdutyDTO queryDto) {
		queryDto.setDutyMessage(dailyMgtService.addOffDuty(queryDto));
		return queryDto;
	}
	
	/**
	* <p>Description: 取消签到服务接口实现 </p> 
	* @author Huang nana   
	* @date 2015-2-3 下午6:59:34 
	* @param queryDto
	* @return 
	* @see com.haier.isales.dailymgt.service.AttendDutyServiceClient#deleteOffDuty(com.haier.isales.dailymgt.dto.DailyOffdutyDTO) 
	*/ 
	@Override
	public DailyOffdutyDTO deleteOffDuty(DailyOffdutyDTO queryDto) {
		queryDto.setDutyMessage(dailyMgtService.deleteOffDuty(queryDto));
		return queryDto;
	}
	/**
	* <p>Description: 查询签到信息</p> 
	* @author Guo Yuchao   
	* @date 2015-2-3 下午4:04:51 
	* @param holidayTime
	* @param operatorId
	* @return 
	* @see com.haier.isales.dailymgt.service.AttendDutyServiceClient#searchAttendInfo(java.lang.String, java.lang.Long) 
	*/ 
	@Override
	public AttendSummary searchAttendInfo(String holidayTime, Long operatorId,String userOrgCode) {
		return dailyMgtService.searchAttendInfo(holidayTime, operatorId ,userOrgCode);
	}
	/**
	 * <p>Description: 查询指定日期的签到信息</p> 
	 * @author Guo Yuchao   
	 * @date 2015-2-3 下午4:04:51 
	 * @param holidayTime
	 * @param operatorId
	 * @return 
	 * @see com.haier.isales.dailymgt.service.AttendDutyServiceClient#searchAttendInfo(java.lang.String, java.lang.Long) 
	 */ 
	@Override
	public AttendInfoDTO searchDailyAttendInfo(String attendDate, Long operatorId, String userOrgCode) {
		return dailyMgtService.searchDailyAttendInfo(attendDate, operatorId, userOrgCode);
	}
	/**
	* <p>Description:查询指定月份的节假日、调休、周末信息 封装map </p> 
	* @author Guo Yuchao   
	* @date 2015-2-10 下午2:36:03 
	* @param holidayTime
	* @return 
	* @see com.haier.isales.dailymgt.service.AttendDutyServiceClient#findMonthHolidayMap(java.lang.String) 
	*/ 
	@Override
	public Object findMonthHolidayMap(String holidayTime) {
		
		return dailyMgtService.findMonthHolidayMap(holidayTime);
	}
	/**
	 * @Description: 属性 dailyMgtService 的get方法 
	 * @return dailyMgtService
	 */
	public DailyMgtService getDailyMgtService() {
		return dailyMgtService;
	}

	/**
	 * @Description: 属性 dailyMgtService 的set方法 
	 * @param dailyMgtService 
	 */
	public void setDailyMgtService(DailyMgtService dailyMgtService) {
		this.dailyMgtService = dailyMgtService;
	}




}
