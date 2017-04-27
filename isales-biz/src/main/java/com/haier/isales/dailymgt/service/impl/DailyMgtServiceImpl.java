/**
 * @Company 青鸟软通   
 * @Title: DailyMgtService.java 
 * @Package  com.haier.isales.dailymgt.service.impl
 * @author Huang Nana   
 * @date 2015年01月26日  16:44:24
 * @version V1.0   
 */
package com.haier.isales.dailymgt.service.impl;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.bana.common.util.basic.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.IsalesDateUtil;
import com.haier.isales.common.IsalesDateUtil.DateFormatStrEnum;
import com.haier.isales.common.IsalesDateUtil.IsalesDateFormatStrEnum;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;
import com.haier.isales.dailymgt.DailyOffdutyDomainDtoUtil;
import com.haier.isales.dailymgt.dao.DailyAttendanceDAO;
import com.haier.isales.dailymgt.dao.DailyOffdutyDAO;
import com.haier.isales.dailymgt.domain.AttendanceTypeDomain;
import com.haier.isales.dailymgt.domain.DailyAttendanceDomain;
import com.haier.isales.dailymgt.domain.DailyOffdutyDomain;
import com.haier.isales.dailymgt.domain.DailymgtConstant.AttendanceTypeEnum;
import com.haier.isales.dailymgt.dto.AttendInfoDTO;
import com.haier.isales.dailymgt.dto.AttendSummary;
import com.haier.isales.dailymgt.dto.DailyAttendanceDTO;
import com.haier.isales.dailymgt.dto.DailyOffdutyDTO;
import com.haier.isales.dailymgt.legalholiday.domain.HolidayConstant.HolidayTypeEnum;
import com.haier.isales.dailymgt.legalholiday.domain.LegalholidayDomain;
import com.haier.isales.dailymgt.legalholiday.service.LegalholidayService;
import com.haier.isales.dailymgt.service.DailyMgtService;

/** 
 * @ClassName: DailyMgtService
 * @Description: DailyMgt的Service接口定义类
 *  
 */
public class DailyMgtServiceImpl implements DailyMgtService{

	private static final Logger LOG = LoggerFactory.getLogger(DailyMgtServiceImpl.class);
	
	/** 
	* @Fields dailyMgtDao : DailyAttendanceDAO 工具依赖 
	*/
	private DailyAttendanceDAO dailyAttendanceDao;
	private DailyOffdutyDAO dailyOffdutyDao;
	private LegalholidayService legalholidayService;
	
	/*===============业务方法=============*/
	
	/**
	* <p>Description: 获取当前签到状态：休班 1001；1101 未签到；1102已签到； 1103已签退；1002未知状态</p> 
	* @author Huang nana   
	* @date 2015-1-26 下午7:04:03 
	* @param dalyAttendanceDto
	* @return 
	* @see com.haier.isales.dailymgt.service.DailyMgtService#searchCurrentStatu(com.haier.isales.dailymgt.dto.DailyAttendanceDTO) 
	*/
	@Override
	public String searchCurrentStatu(DailyAttendanceDTO dalyAttendanceDto){
		//休班 1001
		if(dailyOffdutyDao.checkIsOnDuty(dalyAttendanceDto.getOperatorId(),dalyAttendanceDto.getSignTime()) > 0){
			return "1001";
		}
		/* 曹瑞 2015-09-01 将t_isales_dailymgt_attendance表按中心拆分，按照用户所在中心操作不同的表
		 * 从参数中获取员工所在中心编码，该编码即为需要查询的表后缀名，
		 * 形式如 用户中心编码为12001时，相应操作的表为t_isales_dailymgt_attendance_12001
		 */
		String userOrgCode;
		if(null != dalyAttendanceDto.getUserOrgCode() && !"".equals(dalyAttendanceDto.getUserOrgCode())){
			userOrgCode = dalyAttendanceDto.getUserOrgCode();
		}else{
			userOrgCode = "10000";
		}
		//1101 可签到 1102可签退 1103已签退
		switch(dailyAttendanceDao.checkIsAttendanced(dalyAttendanceDto.getOperatorId(),dalyAttendanceDto.getSignTime(),userOrgCode)){
		case 0:
			return "1101";
		case 1:
			return "1102";
		case 2:
			return "1103";
		}
		//1002 未知状态
		return "1002";
	}
	
	/**
	* <p>Description: 签到接口实现 </p> 
	* @author Huang nana   
	* @date 2015-1-28 上午9:46:09 
	* @param dalyAttendanceDto
	* @return 
	* @see com.haier.isales.dailymgt.service.DailyMgtService#addSignIn(com.haier.isales.dailymgt.dto.DailyAttendanceDTO) 
	*/ 
	@Override
	public String addSignIn(DailyAttendanceDTO dalyAttendanceDto){
		//休假中无需签到
		if(dailyOffdutyDao.checkIsOnDuty(dalyAttendanceDto.getOperatorId(),dalyAttendanceDto.getSignTime()) > 0){
			throw new SystemException(BusinessExceptionCode.daily_info,"休班不需要签到");
		}
		/* 曹瑞 2015-09-01 将t_isales_dailymgt_attendance表按中心拆分，按照用户所在中心操作不同的表
		 * 从参数中获取员工所在中心编码，该编码即为需要查询的表后缀名，
		 * 形式如 用户中心编码为12001时，相应操作的表为t_isales_dailymgt_attendance_12001
		 */
		String userOrgCode;
		if(null != dalyAttendanceDto.getUserOrgCode() && !"".equals(dalyAttendanceDto.getUserOrgCode())){
			userOrgCode = dalyAttendanceDto.getUserOrgCode();
		}else{
			userOrgCode = "10000";
		}
		//已经签到不能再次签到
		if(dailyAttendanceDao.checkIsAttendanced(dalyAttendanceDto.getOperatorId(),dalyAttendanceDto.getSignTime(),userOrgCode)>0){
			throw new SystemException(BusinessExceptionCode.daily_info,"已签到或签退不能再次签到");
		}
		//赋值，类型101 签到；状态101 可用；时间、位置、经度、纬度 取自桥梁工程
		DailyAttendanceDomain domain = new DailyAttendanceDomain();
		domain.setOperatorId(dalyAttendanceDto.getOperatorId());
		domain.setUserCode(dalyAttendanceDto.getUserCode());
		domain.setUserName(dalyAttendanceDto.getUserName());
		domain.setShopCode(dalyAttendanceDto.getShopCode());
		domain.setShopName(dalyAttendanceDto.getShopName());
		domain.setType("101");
		domain.setSignAddress(dalyAttendanceDto.getSignAddress());
		domain.setSignLongitude(dalyAttendanceDto.getSignLongitude());
		domain.setSignLatitude(dalyAttendanceDto.getSignLatitude());
		domain.setStatus("101");
		domain.setCreateId(dalyAttendanceDto.getCreateId());
		domain.setCreateName(dalyAttendanceDto.getCreateName());
		domain.setUserOrgCode(userOrgCode);
		dailyAttendanceDao.saveWithTableNameSuffix(domain);
		//进行签到
		return "signInSuccess";
	}
	
	@Override
	public String addSignOut(DailyAttendanceDTO dalyAttendanceDto){
		//休假中无需签退
		if(dailyOffdutyDao.checkIsOnDuty(dalyAttendanceDto.getOperatorId(),dalyAttendanceDto.getSignTime()) > 0){
			throw new SystemException(BusinessExceptionCode.daily_info,"休班不需要签退");
		}
		/* 曹瑞 2015-09-01 将t_isales_dailymgt_attendance表按中心拆分，按照用户所在中心操作不同的表
		 * 从参数中获取员工所在中心编码，该编码即为需要查询的表后缀名，
		 * 形式如 用户中心编码为12001时，相应操作的表为t_isales_dailymgt_attendance_12001
		 */
		String userOrgCode;
		if(null != dalyAttendanceDto.getUserOrgCode() && !"".equals(dalyAttendanceDto.getUserOrgCode())){
			userOrgCode = dalyAttendanceDto.getUserOrgCode();
		}else{
			userOrgCode = "10000";
		}
		//当天签到表中0条数据：未签到 不能签退；当天签到表中2条数据：已签退，不能签退。条数已distinct type
		switch(dailyAttendanceDao.checkIsAttendanced(dalyAttendanceDto.getOperatorId(),dalyAttendanceDto.getSignTime(),userOrgCode)){
		case 0:
			throw new SystemException(BusinessExceptionCode.daily_info,"未签到不能签退");
		case 2:
			throw new SystemException(BusinessExceptionCode.daily_info,"已签退不能再次签退");
		}
		// 获取签到时间  modified by lizhenwei 2015-10-15 
		// 如果签退时间与签到时间间隔小于10分钟，则不能签退。（避免用户的误操作）
		DailyAttendanceDomain signtime = dailyAttendanceDao.findSignIn(dalyAttendanceDto.getOperatorId(), dalyAttendanceDto.getSignTime(),userOrgCode);
		Long lastedTime =  dalyAttendanceDto.getSignTime().getTime() - signtime.getSignTime().getTime();
		
		if (lastedTime/( 1000*60) < 10) {
			throw new SystemException(BusinessExceptionCode.daily_info,"签退时间过短");
		}  
		
		//未签到不能签退
		
		//签退 类型102 签退；状态101 可用；
		DailyAttendanceDomain domain = new DailyAttendanceDomain();
		domain.setDuration(calcDuration(dalyAttendanceDto)); //获取签到时长
		domain.setOperatorId(dalyAttendanceDto.getOperatorId());
		domain.setUserCode(dalyAttendanceDto.getUserCode());
		domain.setUserName(dalyAttendanceDto.getUserName());
		domain.setShopCode(dalyAttendanceDto.getShopCode());
		domain.setShopName(dalyAttendanceDto.getShopName());
		domain.setType("102");
		domain.setSignAddress(dalyAttendanceDto.getSignAddress());
		domain.setSignLongitude(dalyAttendanceDto.getSignLongitude());
		domain.setSignLatitude(dalyAttendanceDto.getSignLatitude());
		domain.setStatus("101");
		domain.setCreateId(dalyAttendanceDto.getCreateId());
		domain.setCreateName(dalyAttendanceDto.getCreateName());
		domain.setUserOrgCode(userOrgCode);
		dailyAttendanceDao.saveWithTableNameSuffix(domain);
		//进行签退
		return "signOutSuccess";
	}
	
	/**
	* <p>Description: 按月获取休班列表接口实现</p> 
	* @author Huang nana   
	* @date 2015-1-28 上午9:49:26 
	* @param dailyOffdutyDto
	* @return 
	* @see com.haier.isales.dailymgt.service.DailyMgtService#searchOffDutyByMonth(com.haier.isales.dailymgt.dto.DailyOffdutyDTO) 
	*/ 
	@Override
	public List<DailyOffdutyDTO> searchOffDutyByMonth(DailyOffdutyDTO dailyOffdutyDto){
		List<DailyOffdutyDTO> returnList = new ArrayList<DailyOffdutyDTO>();
		//将queryTime参数转换为日期数据
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		Date month;
		if (dailyOffdutyDto.getQueryTime() == null || "".equals(dailyOffdutyDto.getQueryTime())) {
			month = new Date();
		}else{
			try {
				month = sdf.parse(dailyOffdutyDto.getQueryTime());
			} catch (ParseException e) {
				LOG.info("ex", e);
				throw new SystemException(BusinessExceptionCode.daily_info,"时间参数异常");
			}
		}
		//获取休班列表
		List<DailyOffdutyDomain> domainList = dailyOffdutyDao.searchOffDutyByMonth(dailyOffdutyDto.getOperatorId(), month);
		//类型转换
		for(DailyOffdutyDomain  domain: domainList){
			returnList.add(DailyOffdutyDomainDtoUtil.cloneDailyOffdutyDoamin2DTO(domain));
		}
		return returnList;
	}
	
	/**
	* <p>Description: 申请休班接口实现</p> 
	* @author Huang nana   
	* @date 2015-1-28 上午9:50:39 
	* @param dailyOffdutyDto
	* @return 
	* @see com.haier.isales.dailymgt.service.DailyMgtService#addOffDuty(com.haier.isales.dailymgt.dto.DailyOffdutyDTO) 
	*/ 
	@Override
	public String addOffDuty(DailyOffdutyDTO dailyOffdutyDto){
		//将参数queryTime转化为时间数据
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date offdutyDate;
		if (dailyOffdutyDto.getQueryTime() == null) {
			// 输入的参数为空
			throw new BusinessException(BusinessExceptionCode.param_error, "日控考勤，必须指定休班日期");
		}
		try {
			offdutyDate = sdf.parse(dailyOffdutyDto.getQueryTime());
		} catch (ParseException e) {
			LOG.info("ex", e);
			throw new SystemException(BusinessExceptionCode.daily_info,"时间参数异常");
		}
		//今天及之前的日期不能申请休班
		// 修改成今天之前的日期不能申请休班  by lizhenwei 2015-09-16
		String strCurrDate = sdf.format(new Date());
		Date dCurrDate;
		try {
			dCurrDate = sdf.parse(strCurrDate);
		} catch (ParseException e) {
			LOG.error("ex", e);
			throw new SystemException(BusinessExceptionCode.daily_info,"时间参数异常");
		}
		
		if(offdutyDate.before(dCurrDate)){
			throw new SystemException(BusinessExceptionCode.daily_info,"不能提报今天之前的休班");
		}
		//已经休班的日期不能再次申请休班
		if(dailyOffdutyDao.checkIsOnDuty(dailyOffdutyDto.getOperatorId(),offdutyDate) > 0){
			throw new SystemException(BusinessExceptionCode.daily_info,"已休班不能再次提交休班");
		}
		//状态101 可用
		DailyOffdutyDomain domain = new DailyOffdutyDomain();
		domain.setOperatorId(dailyOffdutyDto.getOperatorId());
		domain.setUserCode(dailyOffdutyDto.getUserCode());
		domain.setUserName(dailyOffdutyDto.getUserName());
		domain.setShopCode(dailyOffdutyDto.getShopCode());
		domain.setShopName(dailyOffdutyDto.getShopName());
		domain.setOffdutyDate(offdutyDate);
		domain.setStatus("101");
		domain.setCreateTime(new Date());
		domain.setCreateId(dailyOffdutyDto.getCreateId());
		domain.setCreateName(dailyOffdutyDto.getCreateName());
		dailyOffdutyDao.save(domain);

		return "addOffDutySuccess";
	}
	
	@Override
	public String deleteOffDuty(DailyOffdutyDTO dailyOffdutyDto){
		//将参数queryTime转化为时间数据
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date offdutyDate;
		if (dailyOffdutyDto.getQueryTime() == null) {
			// 输入的参数为空
			throw new BusinessException(BusinessExceptionCode.param_error, "日控考勤，必须指定取消休班的日期");
		}
		try {
			offdutyDate = sdf.parse(dailyOffdutyDto.getQueryTime());
		} catch (ParseException e) {
			LOG.info("ex", e);
			throw new SystemException(BusinessExceptionCode.daily_info,"时间参数异常");
		}
		
		//今天及之前的日期不能取消休班
		/*if(!offdutyDate.after(new Date())){
			throw new SystemException(BusinessExceptionCode.daily_info,"只能取消今天之后的休班");
		}*/
		// 修改成今天之前的日期不能取消休班  by lizhenwei 2015-10-09
		String strCurrDate = sdf.format(new Date());
		Date dCurrDate;
		try {
			dCurrDate = sdf.parse(strCurrDate);
		} catch (ParseException e) {
			LOG.error("ex", e);
			throw new SystemException(BusinessExceptionCode.daily_info,"时间参数异常");
		}
		
		if(offdutyDate.before(dCurrDate)){
			throw new SystemException(BusinessExceptionCode.daily_info,"只能取消明天之后的休班");
		}
		//未休班的日期不能提交取消休班申请
		if(dailyOffdutyDao.checkIsOnDuty(dailyOffdutyDto.getOperatorId(),offdutyDate) <1){
			throw new SystemException(BusinessExceptionCode.daily_info,"未休班的日期不能提交取消休班申请");
		}
		dailyOffdutyDao.deleteOffDuty(dailyOffdutyDto.getOperatorId(), offdutyDate);
		return "deleteOffDutySuccess";
	}
	/**
	* <p>Description: 获取签到持续时间 x时x分 </p> 
	* @author Huang nana   
	* @date 2015-1-30 下午12:44:26 
	* @param dalyAttendanceDto
	* @return 
	* @see com.haier.isales.dailymgt.service.DailyMgtService#searchLastedTime(com.haier.isales.dailymgt.dto.DailyAttendanceDTO) 
	*/ 
	@Override
	public String searchLastedTime(DailyAttendanceDTO dalyAttendanceDto){
		/* 曹瑞 2015-09-01 将t_isales_dailymgt_attendance表按中心拆分，按照用户所在中心操作不同的表
		 * 从参数中获取员工所在中心编码，该编码即为需要查询的表后缀名，
		 * 形式如 用户中心编码为12001时，相应操作的表为t_isales_dailymgt_attendance_12001
		 */
		String userOrgCode;
		if(null != dalyAttendanceDto.getUserOrgCode() && !"".equals(dalyAttendanceDto.getUserOrgCode())){
			userOrgCode = dalyAttendanceDto.getUserOrgCode();
		}else{
			userOrgCode = "10000";
		}
		
		DailyAttendanceDomain signtime = dailyAttendanceDao.findSignIn(dalyAttendanceDto.getOperatorId(), dalyAttendanceDto.getSignTime(),userOrgCode);
		Long lastedTime =  dalyAttendanceDto.getSignTime().getTime() - signtime.getSignTime().getTime();
		//86400000 = 1000*24*60*60 ; 36000 = 1000*60*60 ; 60000 = 1000*60
		/*long hour = lastedTime/3600000;//计算差多少小时
		long mint = lastedTime%3600000/60000;//计算差多少分钟
		return hour+"时"+mint+"分";*/
		return formateDuration(lastedTime);
	}
	
	/**
	* <p>Description: 将持续时间（毫秒）格式化为xx时xx分格式</p> 
	* @author Huang nana   
	* @date 2015-2-4 下午6:31:41 
	* @param duration
	* @return 
	* @see com.haier.isales.dailymgt.service.DailyMgtService#formateDuration(java.lang.Long) 
	*/ 
	@Override
	public String formateDuration(Long duration){
		long hour = duration/3600000;//计算差多少小时
		long mint = duration%3600000/60000;//计算差多少分钟
		return hour+"时"+mint+"分";
	}
	
	/**
	* <p>Description: 签退时获取签到时长：毫秒； </p> 
	* @author Huang nana   
	* @date 2015-2-4 下午4:13:54 
	* @param dalyAttendanceDto
	* @return 
	* @see com.haier.isales.dailymgt.service.DailyMgtService#calcDuration(com.haier.isales.dailymgt.dto.DailyAttendanceDTO) 
	*/ 
	@Override
	public Long calcDuration(DailyAttendanceDTO dalyAttendanceDto){
		/* 曹瑞 2015-09-01 将t_isales_dailymgt_attendance表按中心拆分，按照用户所在中心操作不同的表
		 * 从参数中获取员工所在中心编码，该编码即为需要查询的表后缀名，
		 * 形式如 用户中心编码为12001时，相应操作的表为t_isales_dailymgt_attendance_12001
		 */
		String userOrgCode;
		if(null != dalyAttendanceDto.getUserOrgCode() && !"".equals(dalyAttendanceDto.getUserOrgCode())){
			userOrgCode = dalyAttendanceDto.getUserOrgCode();
		}else{
			userOrgCode = "10000";
		}
		DailyAttendanceDomain signtime = dailyAttendanceDao.findSignIn(dalyAttendanceDto.getOperatorId(), dalyAttendanceDto.getSignTime(),userOrgCode);
		Long duration = Long.valueOf(0);
		// modified by lizhenwei 2015-09-18  增加日期非空判断
		if (null != dalyAttendanceDto.getSignTime() 
				&& null != signtime.getSignTime()) {
			duration = dalyAttendanceDto.getSignTime().getTime() - signtime.getSignTime().getTime();
		}
				
		return duration;
	}
	
	/**
	* <p>Description: 已签退状态查询签到时长</p> 
	* @author Huang nana   
	* @date 2015-2-4 下午5:32:22 
	* @param dalyAttendanceDto
	* @return 
	* @see com.haier.isales.dailymgt.service.DailyMgtService#searchDuration(com.haier.isales.dailymgt.dto.DailyAttendanceDTO) 
	*/ 
	@Override
	public Long searchDuration(DailyAttendanceDTO dalyAttendanceDto){
		/* 曹瑞 2015-09-01 将t_isales_dailymgt_attendance表按中心拆分，按照用户所在中心操作不同的表
		 * 从参数中获取员工所在中心编码，该编码即为需要查询的表后缀名，
		 * 形式如 用户中心编码为12001时，相应操作的表为t_isales_dailymgt_attendance_12001
		 */
		String userOrgCode;
		if(null != dalyAttendanceDto.getUserOrgCode() && !"".equals(dalyAttendanceDto.getUserOrgCode())){
			userOrgCode = dalyAttendanceDto.getUserOrgCode();
		}else{
			userOrgCode = "10000";
		}
		DailyAttendanceDomain domain = dailyAttendanceDao.findDuration(dalyAttendanceDto.getOperatorId(), dalyAttendanceDto.getSignTime(),userOrgCode);
		Long duration = domain.getDuration();
		return duration;
		
	}
	
	/**
	* <p>Description:查询签到信息 </p> 
	* @author Guo Yuchao   
	* @date 2015-2-2 下午6:40:34 
	* @param holidayTime
	* @param operatorId
	* @return 
	* @see com.haier.isales.dailymgt.service.DailyMgtService#searchLastedTime(java.lang.String, java.lang.Long) 
	*/ 
	@Override
	public AttendSummary searchAttendInfo(String holidayTime,
			Long operatorId, String userOrgCode) {
		
		//修改代码违规“不允许给参数赋值：否则可能方法内部改变的值，不能传到方法外部”；使用orgCode来代替userOrgCode
		String orgCode = userOrgCode ;
		if(null == userOrgCode || "".equals(userOrgCode)){
			userOrgCode = "10000";
		}
		String holidayTime2 = holidayTime;
		if(StringUtils.isEmpty(holidayTime2)){
			throw new BusinessException(BusinessExceptionCode.param_error,"月份查询参数为空");
		}
		if(null == operatorId){
			throw new BusinessException(BusinessExceptionCode.param_error,"没有找到您的信息，请重新登录后重试");
		}
		Date yearMonth = IsalesDateUtil.formateToDate(holidayTime2.trim());
		holidayTime2 = IsalesDateUtil.toFormatString(yearMonth,DateFormatStrEnum.y_M.getFormatStr());
		
		return getAttendInfoList(holidayTime2, operatorId, yearMonth, orgCode);
	}

	/** 
	* @Description: 获取签到信息
	* @author Guo Yuchao   
	* @date 2015-2-3 下午3:40:56 
	* @param holidayTime
	* @param operatorId
	* @param yearMonth
	* @return  
	*/ 
	private AttendSummary getAttendInfoList(String holidayTime,
			Long operatorId, Date yearMonth, String userOrgCode) {
		//获取指定月份的所有日期
		List<String> dayList = IsalesDateUtil.getAllDaysOfMonth(holidayTime);
		//封装返回信息
		Map<String, Map<String, AttendInfoDTO>> attendDataMap = getAttendDataMap(holidayTime,operatorId, yearMonth, userOrgCode);
		List<AttendInfoDTO> attendInfoList = new ArrayList<AttendInfoDTO>();
		int signSuccessDays = 0;//指定月份签到成功天数
		int signFilaureDays = 0;//指定月份签到失败天数
		int offDutyDays = 0;//指定月份休假天数
		for (String day : dayList) {
			AttendInfoDTO attendInfoDTO = getAttendInfoDTO(attendDataMap, day);
			signSuccessDays += attendInfoDTO.getSignSuccessDays();
			signFilaureDays += attendInfoDTO.getSignFilaureDays();
			offDutyDays += attendInfoDTO.getOffDutyDays();
			attendInfoList.add(attendInfoDTO);
		}
		return new AttendSummary(attendInfoList,signSuccessDays,signFilaureDays,offDutyDays);
	}

	/** 
	* @Description: 封装显示个体信息 
	* @author Guo Yuchao   
	* @date 2015-2-3 下午4:02:16 
	* @param holidayTime
	* @param operatorId
	* @param yearMonth
	* @param day
	* @return  
	*/ 
	private AttendInfoDTO getAttendInfoDTO(Map<String, Map<String, AttendInfoDTO>> attendDataMap, String day) {
		AttendInfoDTO attendInfoDTO = new AttendInfoDTO();
		attendInfoDTO.setSignDate(day);
		int signSuccessDays = 0;//指定月份签到成功天数
		int signFilaureDays = 0;//指定月份签到失败天数
		int offDutyDays = 0;//指定月份休假天数
		//赋值有先后顺序，后面的会覆盖前面的设置  最先是签到信息，如果签到信息跟休班冲突，显示休班，休班跟{【非调休】的【周末】}或【节假日】冲突显示后者
		//判断签到信息【正常签到】、【未签退】
		Long dayMills = IsalesDateUtil.formateToDate(day, DateFormatStrEnum.y_M_d.getFormatStr()).getTime();
		Long compMills = IsalesDateUtil.getTomorrowMillis();
		
		AttendInfoDTO attendedInfo = attendDataMap.get(AttendanceTypeEnum.正常签到.getType()).get(day);
		if(attendedInfo != null && dayMills.compareTo(compMills)<0){
			attendInfoDTO = attendedInfo;
			if(AttendanceTypeEnum.正常签到.getType().equals(attendedInfo.getSignType())){
				signSuccessDays=1;
				signFilaureDays=0;
				offDutyDays = 0;
			}else{
				signFilaureDays=1;
				signSuccessDays=0;
				offDutyDays = 0;
			}
		}else if(dayMills.compareTo(compMills)>=0){
			attendInfoDTO.setSignType(AttendanceTypeEnum.等待签到.getType());
			attendInfoDTO.setSignResult(AttendanceTypeEnum.等待签到.getDescription());
			attendInfoDTO.setSignLevel(AttendanceTypeEnum.等待签到.getLevel());
			signFilaureDays=0;
			signSuccessDays=0;
			offDutyDays = 0;
		}
		//不需要签到信息 【休班】
		AttendInfoDTO offdutyInfo = attendDataMap.get(AttendanceTypeEnum.休班.getType()).get(day);
		if(offdutyInfo != null){
			attendInfoDTO = offdutyInfo;
			offDutyDays=1;
			signFilaureDays=0;
			signSuccessDays=0;
		}
		//不需要签到信息 【周末】
		AttendInfoDTO weekendInfo = attendDataMap.get(AttendanceTypeEnum.周末.getType()).get(day);
		AttendInfoDTO holidayInfo = attendDataMap.get(AttendanceTypeEnum.节假日.getType()).get(day);
		if(weekendInfo != null && (holidayInfo ==null||
			!AttendanceTypeEnum.调休上班.getType().equals(holidayInfo.getSignType()))){
			attendInfoDTO = weekendInfo;
			signFilaureDays=0;
			signSuccessDays=0;
			offDutyDays = 0;
		}
		if(holidayInfo !=null&&AttendanceTypeEnum.节假日.getType().equals(holidayInfo.getSignType())){
			attendInfoDTO = holidayInfo;
			signFilaureDays=0;
			signSuccessDays=0;
			offDutyDays = 0;
		}
		if(StringUtils.isEmpty(attendInfoDTO.getSignType())){
			attendInfoDTO.setSignType(AttendanceTypeEnum.未签到.getType());
			attendInfoDTO.setSignResult(AttendanceTypeEnum.未签到.getDescription());
			attendInfoDTO.setSignLevel(AttendanceTypeEnum.未签到.getLevel());
			signFilaureDays=1;
			signSuccessDays=0;
			offDutyDays = 0;
		}
		attendInfoDTO.setSignSuccessDays(signSuccessDays);
		attendInfoDTO.setSignFilaureDays(signFilaureDays);
		attendInfoDTO.setOffDutyDays(offDutyDays);
		signFilaureDays=1;
		signSuccessDays=0;
		offDutyDays = 0;
		return attendInfoDTO;
	}

	/** 
	* @Description: 封装数据信息
	* @author Guo Yuchao   
	* @date 2015-2-3 下午3:43:21 
	* @param holidayTime
	* @param operatorId
	* @param yearMonth
	* @return  
	*/ 
	private Map<String,Map<String, AttendInfoDTO>> getAttendDataMap(String holidayTime,
			Long operatorId, Date yearMonth, String userOrgCode) {
		Map<String,Map<String, AttendInfoDTO>> dataMap = new HashMap<String, Map<String,AttendInfoDTO>>();
		//封装需签到信息【正常签到】、【未签到】(使用时判断)、【未签退】、【等待签到】(使用时判断)。。。
		//（包括需要签到但是没有到的日期 比如明天需要打卡但是时间没到 设置状态 【等待签到】）
		//获取签到信息
		Map<String, AttendInfoDTO> attendMap = getAttendMap(holidayTime, operatorId, userOrgCode);
		//封装不需要签到信息 【休班】、【周末】(使用时判断)、【调休上班】、【节假日】
		//封装节假日信息 【调休上班】、【节假日】
		Map<String, AttendInfoDTO> holidayMap = getHolidayMap(holidayTime);
		//封装指定月份的周末日期
		Map<String, AttendInfoDTO> weekendMap = getWeekendMap(holidayTime);
		//获取休班信息
		Map<String, AttendInfoDTO> offdutyMap = getOffdutyMap(operatorId, yearMonth);
		dataMap.put(AttendanceTypeEnum.节假日.getType(), holidayMap);
		dataMap.put(AttendanceTypeEnum.正常签到.getType(), attendMap);
		dataMap.put(AttendanceTypeEnum.周末.getType(), weekendMap);
		dataMap.put(AttendanceTypeEnum.休班.getType(), offdutyMap);
		return dataMap;
	}

	/** 
	* @Description: 封装指定月份的周末日期
	* @author Guo Yuchao   
	* @date 2015-2-3 下午2:17:39 
	* @param holidayTime
	* @return  
	*/ 
	private Map<String, AttendInfoDTO> getWeekendMap(String holidayTime) {
		Map<String,AttendInfoDTO> attendMap = new HashMap<String, AttendInfoDTO>();
		List<String> weekendsList = IsalesDateUtil.getWeekendsOfMonth(holidayTime);
		for (String weekendStr : weekendsList) {
			AttendInfoDTO attendInfoDTO = new AttendInfoDTO();
			attendInfoDTO.setSignDate(weekendStr);
			attendInfoDTO.setSignType(AttendanceTypeEnum.周末.getType());
			attendInfoDTO.setSignResult(AttendanceTypeEnum.周末.getDescription());
			attendInfoDTO.setSignLevel(AttendanceTypeEnum.周末.getLevel());
			attendMap.put(attendInfoDTO.getSignDate(), attendInfoDTO);
		}
		return attendMap;
	}

	/** 
	* @Description:获取签到信息
	* @author Guo Yuchao   
	* @date 2015-2-3 上午10:18:22 
	* @param holidayTime
	* @param operatorId  
	*/ 
	private Map<String,AttendInfoDTO> getAttendMap(String holidayTime, Long operatorId, String userOrgCode) {
		Map<String,AttendInfoDTO> attendMap = new HashMap<String, AttendInfoDTO>();
		List<AttendanceTypeDomain> attendStatusList = dailyAttendanceDao.findAttendStatus(operatorId, holidayTime, userOrgCode);
		for (AttendanceTypeDomain attendanceTypeDomain : attendStatusList) {
			if(null == attendanceTypeDomain || null == attendanceTypeDomain.getSignDate()){
				continue;
			}
			AttendInfoDTO attendInfoDTO = new AttendInfoDTO();
			attendInfoDTO.setSignDate(attendanceTypeDomain.getSignDate());
			if(!StringUtils.isEmpty(attendanceTypeDomain.getSignStatus())&&
					AttendanceTypeEnum.正常签到.getType().equals(attendanceTypeDomain.getSignStatus())){
				attendInfoDTO.setSignType(AttendanceTypeEnum.正常签到.getType());
				attendInfoDTO.setSignResult(AttendanceTypeEnum.正常签到.getDescription());
				attendInfoDTO.setSignLevel(AttendanceTypeEnum.正常签到.getLevel());
			}else if(!StringUtils.isEmpty(attendanceTypeDomain.getSignStatus())&&
					AttendanceTypeEnum.未签退.getType().equals(attendanceTypeDomain.getSignStatus())){
				attendInfoDTO.setSignType(AttendanceTypeEnum.未签退.getType());
				attendInfoDTO.setSignResult(AttendanceTypeEnum.未签退.getDescription());
				attendInfoDTO.setSignLevel(AttendanceTypeEnum.未签退.getLevel());
			}else{
				continue;
			}
			attendMap.put(attendInfoDTO.getSignDate(), attendInfoDTO);
		}
		return attendMap;
	}

	/** 
	* @Description: 获取休班信息
	* @author Guo Yuchao   
	* @date 2015-2-3 上午10:11:16 
	* @param operatorId
	* @param yearMonth  
	*/ 
	private Map<String,AttendInfoDTO> getOffdutyMap(Long operatorId, Date yearMonth) {
		//获取休班信息
		Map<String,AttendInfoDTO> offdutyMap = new HashMap<String, AttendInfoDTO>();
		List<DailyOffdutyDomain> offdutyList = dailyOffdutyDao.searchOffDutyByMonth(operatorId, yearMonth);
		for (DailyOffdutyDomain dailyOffdutyDomain : offdutyList) {
			if(null == dailyOffdutyDomain || StringUtils.isEmpty(dailyOffdutyDomain.getDateString())){
				continue;
			}
			AttendInfoDTO attendInfoDTO = new AttendInfoDTO();
			attendInfoDTO.setSignDate(dailyOffdutyDomain.getDateString());
			attendInfoDTO.setSignType(AttendanceTypeEnum.休班.getType());
			attendInfoDTO.setSignResult(AttendanceTypeEnum.休班.getDescription());
			attendInfoDTO.setSignLevel(AttendanceTypeEnum.休班.getLevel());
			offdutyMap.put(attendInfoDTO.getSignDate(), attendInfoDTO);
		}
		return offdutyMap;
	}

	/** 
	* @Description: 获取指定月份的节假日和调休信息
	* @author Guo Yuchao   
	* @date 2015-2-3 上午10:02:53 
	* @param holidayTime  
	*/ 
	private Map<String,AttendInfoDTO> getHolidayMap(String holidayTime) {
		//获取节假日和调休信息
		Map<String,AttendInfoDTO> holidayMap = new HashMap<String, AttendInfoDTO>();
		List<LegalholidayDomain> holidayInfoList = legalholidayService.findHolidayInfoByTypeMonth(holidayTime, null);
		for (LegalholidayDomain legalholidayDomain : holidayInfoList) {
			if(null == legalholidayDomain || null == legalholidayDomain.getHolidayTime()){
				continue;
			}
			AttendInfoDTO attendInfoDTO = new AttendInfoDTO();
			attendInfoDTO.setSignDate(IsalesDateUtil.toFormatString(legalholidayDomain.getHolidayTime(), DateFormatStrEnum.y_M_d.getFormatStr()));
			if(!StringUtils.isEmpty(legalholidayDomain.getHolidayType())&&
					HolidayTypeEnum.节假日.getType().equals(legalholidayDomain.getHolidayType())){
				attendInfoDTO.setSignType(AttendanceTypeEnum.节假日.getType());
//				attendInfoDTO.setSignResult(AttendanceTypeEnum.节假日.getDescription());
				attendInfoDTO.setSignResult(legalholidayDomain.getHolidayDesc());
				attendInfoDTO.setSignLevel(AttendanceTypeEnum.节假日.getLevel());
			}else if(!StringUtils.isEmpty(legalholidayDomain.getHolidayType())&&
					HolidayTypeEnum.调休上班.getType().equals(legalholidayDomain.getHolidayType())){
				attendInfoDTO.setSignType(AttendanceTypeEnum.调休上班.getType());
				attendInfoDTO.setSignResult(AttendanceTypeEnum.调休上班.getDescription());
				attendInfoDTO.setSignLevel(AttendanceTypeEnum.调休上班.getLevel());
			}else{
				continue;
			}
			holidayMap.put(attendInfoDTO.getSignDate(), attendInfoDTO);
		}
		return holidayMap;
	}
	
	/**
	* <p>Description: 查询指定日期的签到信息</p> 
	* @author Guo Yuchao   
	* @date 2015-2-4 下午3:39:34 
	* @param attendDate
	* @param operatorId
	* @return 
	* @see com.haier.isales.dailymgt.service.DailyMgtService#searchDailyAttendInfo(java.lang.String, java.lang.Long) 
	*/ 
	@Override
	public AttendInfoDTO searchDailyAttendInfo(String attendDate,
			Long operatorId, String userOrgCode) {
		
		if(null == userOrgCode || "".equals(userOrgCode)){
			userOrgCode = "10000";
		}
		String attendDate2 = attendDate;
		if(StringUtils.isEmpty(attendDate2)){
			throw new BusinessException(BusinessExceptionCode.param_error,"月份查询参数为空");
		}
		if(null == operatorId){
			throw new BusinessException(BusinessExceptionCode.param_error,"没有找到您的信息，请重新登录后重试");
		}
		Date paramDate = IsalesDateUtil.formateToDate(attendDate2.trim());
		attendDate2 = IsalesDateUtil.toFormatString(paramDate,DateFormatStrEnum.y_M_d.getFormatStr());
		
		return getDailyAttendInfo(paramDate,attendDate2,operatorId, userOrgCode);
	}
	/** 
	* @Description: 签到信息指定日期
	* @author Guo Yuchao   
	* @date 2015-2-4 下午4:24:43 
	* @param attendDate
	* @param operatorId
	* @return  
	*/ 
	private AttendInfoDTO getDailyAttendInfo(Date quaryDate,String attendDate, Long operatorId, String userOrgCode) {
		//判断指定日期节假日和周末
		AttendInfoDTO holidayDailyDTO = getHolidayDailyAttendInfo(quaryDate,attendDate);
		if(holidayDailyDTO != null){
			return holidayDailyDTO;
		}
		//获取指定日期休班信息
		AttendInfoDTO dailyOffDutyInfo = getDailyOffDutyInfo(quaryDate, operatorId,attendDate);
		if(dailyOffDutyInfo != null){
			return dailyOffDutyInfo;
		}
		//获取指定日期的签到信息
		AttendInfoDTO attendInfoByDate = getAttendInfoByDate(quaryDate, attendDate, operatorId, userOrgCode);
		if(attendInfoByDate != null){
			return attendInfoByDate;
		}
		//排除所有签到状态 剩下的是该签到而未签到的情况 
		AttendInfoDTO attendInfoDTO = new AttendInfoDTO();
		attendInfoDTO.setSignDate(getSignDateFormatStr(quaryDate));
		attendInfoDTO.setSignType(AttendanceTypeEnum.未签到.getType());
		attendInfoDTO.setSignResult(AttendanceTypeEnum.未签到.getDescription());
		attendInfoDTO.setSignLevel(AttendanceTypeEnum.未签到.getLevel());
		return attendInfoDTO;
	}

	/** 
	* @Description: 获取指定日期的【**签到】信息
	* @author Guo Yuchao   
	* @date 2015-2-5 上午9:15:08 
	* @param quaryDate
	* @param attendDate
	* @param operatorId
	* @param attendInfoDTO  
	*/ 
	private AttendInfoDTO getAttendInfoByDate(Date quaryDate, String attendDate,
			Long operatorId, String userOrgCode) {
		AttendInfoDTO attendInfoDTO = new AttendInfoDTO();
		attendInfoDTO.setSignDate(getSignDateFormatStr(quaryDate));
		//获取签到信息
		AttendanceTypeDomain attendStatus = dailyAttendanceDao.findDailyAttendStatus(operatorId, attendDate, userOrgCode);
		Long dayMills = quaryDate.getTime();
		Long compMills = IsalesDateUtil.getTomorrowMillis();
		if(attendStatus != null && dayMills.compareTo(compMills)<0){
			if(AttendanceTypeEnum.正常签到.getType().equals(attendStatus.getSignStatus())){
				attendInfoDTO.setSignType(AttendanceTypeEnum.正常签到.getType());
				attendInfoDTO.setSignResult(AttendanceTypeEnum.正常签到.getDescription());
				attendInfoDTO.setSignLevel(AttendanceTypeEnum.正常签到.getLevel());
				attendInfoDTO.setSignInTime(getSignInOutDate(attendStatus.getSignInTime()));
				attendInfoDTO.setSignOutTime(getSignInOutDate(attendStatus.getSignOutTime()));
				Long mills = (attendStatus.getSignOutTime().getTime()-attendStatus.getSignInTime().getTime())/(1000*60);
				Long mins = mills%60;
				Long hours = mills/60;
				StringBuffer dateBuffer = new StringBuffer();
				dateBuffer.append(hours).append("小时").append(mins).append("分钟");
				attendInfoDTO.setWorkTime(dateBuffer.toString());
				return attendInfoDTO;
			}else if(AttendanceTypeEnum.未签退.getType().equals(attendStatus.getSignStatus())){
				attendInfoDTO.setSignType(AttendanceTypeEnum.未签退.getType());
				attendInfoDTO.setSignResult(AttendanceTypeEnum.未签退.getDescription());
				attendInfoDTO.setSignLevel(AttendanceTypeEnum.未签退.getLevel());
				attendInfoDTO.setSignInTime(getSignInOutDate(attendStatus.getSignInTime()));
				attendInfoDTO.setSignOutTime("未签退");
				attendInfoDTO.setWorkTime("0小时");
				return attendInfoDTO;
			}	
			return null;
		}else if(dayMills.compareTo(compMills)>=0){
			attendInfoDTO.setSignType(AttendanceTypeEnum.等待签到.getType());
			attendInfoDTO.setSignResult(AttendanceTypeEnum.等待签到.getDescription());
			attendInfoDTO.setSignLevel(AttendanceTypeEnum.等待签到.getLevel());
			return attendInfoDTO;
		}
		return null;
	}

	/** 
	* @Description:  获取指 定日期签到时间  格式：02:12 PM
	* @author Guo Yuchao   
	* @date 2015-2-5 下午5:21:39 
	* @return  
	*/ 
	private String getSignInOutDate(Date signDate) {
		return IsalesDateUtil.toFormatStringEn(signDate, IsalesDateFormatStrEnum.hh_mm_apm.getFormatStr());
	}

	/** 
	* @Description:获取指定日期休班信息
	* @author Guo Yuchao   
	* @date 2015-2-5 上午9:08:45 
	* @param quaryDate
	* @param operatorId
	* @param attendInfoDTO  
	*/ 
	private AttendInfoDTO getDailyOffDutyInfo(Date quaryDate, Long operatorId,String attendDate) {
		LOG.info(attendDate);
		AttendInfoDTO attendInfoDTO = new AttendInfoDTO();
		attendInfoDTO.setSignDate(getSignDateFormatStr(quaryDate));
		//获取休班信息 返回当天指定用户的休班信息条数
		int isOnDuty = dailyOffdutyDao.checkIsOnDuty(operatorId, quaryDate);
		if(isOnDuty > 0){
			attendInfoDTO.setSignType(AttendanceTypeEnum.休班.getType());
			attendInfoDTO.setSignResult(AttendanceTypeEnum.休班.getDescription());
			attendInfoDTO.setSignLevel(AttendanceTypeEnum.休班.getLevel());
			return attendInfoDTO;
		}
		return null;
	}

	/** 
	* @Description: 判断节假日和周末
	* @author Guo Yuchao   
	* @date 2015-2-5 上午9:04:29 
	* @param attendDate
	* @param attendInfoDTO
	* @return  
	*/ 
	private AttendInfoDTO getHolidayDailyAttendInfo(Date quaryDate,String attendDate) {
		AttendInfoDTO attendInfoDTO = new AttendInfoDTO();
		attendInfoDTO.setSignDate(getSignDateFormatStr(quaryDate));
		//节假日信息 【调休上班】、【节假日】
		LegalholidayDomain holidayInfo = legalholidayService.findHolidayInfoByDate(attendDate);
		if(holidayInfo != null && HolidayTypeEnum.节假日.getType().equals(holidayInfo.getHolidayType())){
			attendInfoDTO.setSignType(AttendanceTypeEnum.节假日.getType());
//			attendInfoDTO.setSignResult(AttendanceTypeEnum.节假日.getDescription());
			attendInfoDTO.setSignResult(holidayInfo.getHolidayDesc());
			attendInfoDTO.setSignLevel(AttendanceTypeEnum.节假日.getLevel());
			return attendInfoDTO;
		}
		//周末日期
		boolean isWeekend = IsalesDateUtil.isWeekend(attendDate);
		if(isWeekend && (holidayInfo == null ||
				!HolidayTypeEnum.调休上班.getType().equals(holidayInfo.getHolidayType()))){
			attendInfoDTO.setSignType(AttendanceTypeEnum.周末.getType());
			attendInfoDTO.setSignResult(AttendanceTypeEnum.周末.getDescription());
			attendInfoDTO.setSignLevel(AttendanceTypeEnum.周末.getLevel());
			return attendInfoDTO;
		}
		return null;
	}

	/** 
	* @Description: 获取签到时间  展示格式为  2014年1月12日(星期日)
	* @author Guo Yuchao   
	* @date 2015-2-5 上午9:35:47 
	* @param attendDate
	* @return  
	*/ 
	private String getSignDateFormatStr(Date quaryDate) {
		return IsalesDateUtil.toFormatString(quaryDate, DateFormatStrEnum.date_1bit_CH_E.getFormatStr());
	}
	/**
	* <p>Description:查询指定月份的节假日、调休、周末信息 封装map </p> 
	* @author Guo Yuchao   
	* @date 2015-2-10 下午2:24:35 
	* @param holidayTime
	* @return 
	* @see com.haier.isales.dailymgt.legalholiday.service.LegalholidayService#findMonthHolidayMap(java.lang.String) 
	*/ 
	@Override
	public List<String> findMonthHolidayMap(String holidayTime) {
		String holidayTime2 = holidayTime; 
		if(StringUtils.isEmpty(holidayTime2)){
			throw new BusinessException(BusinessExceptionCode.param_error,"月份查询参数为空");
		}
		Date yearMonth = IsalesDateUtil.formateToDate(holidayTime2.trim());
		holidayTime2 = IsalesDateUtil.toFormatString(yearMonth,DateFormatStrEnum.y_M.getFormatStr());
		List<String> holidayList = new ArrayList<String>();
		//封装节假日信息 【调休上班】、【节假日】
		Map<String, AttendInfoDTO> holidayMap = getHolidayMap(holidayTime2);
		//封装指定月份的周末日期
		Map<String, AttendInfoDTO> weekendMap = getWeekendMap(holidayTime2);
		Iterator<String> weekendKeys = weekendMap.keySet().iterator(); 
		while(weekendKeys.hasNext()) { 
			String key = (String) weekendKeys.next(); 
			if(holidayList.contains(key)){
				continue;
			}
			holidayList.add(key);
		}
		Iterator<String> holidayKeys = holidayMap.keySet().iterator(); 
		while(holidayKeys.hasNext()) { 
		   String key = (String) holidayKeys.next(); 
		   AttendInfoDTO attendInfoDTO = holidayMap.get(key); 
		   if(attendInfoDTO == null){
			   continue;
		   }
		   if(AttendanceTypeEnum.调休上班.getType().equals(attendInfoDTO.getSignType())
				  && holidayList.contains(key)){
			   holidayList.remove(key);
		   }else{
			   if(holidayList.contains(key)){
					continue;
				}
			   holidayList.add(key);
		   }
		}
		Collections.sort(holidayList);
		return holidayList;
	}
	
	/** 
	* @Description: 查询指定月份的节假日、调休、周末信息 封装map
	* @author Guo Yuchao   
	* @date 2015-2-10 下午2:33:25 
	* @param holidayTime
	* @return  
	*/ 
	public Map<String,Map<String, AttendInfoDTO>> getHolidaysMap(String holidayTime) {
		Map<String,Map<String, AttendInfoDTO>> dataMap = new HashMap<String, Map<String,AttendInfoDTO>>();
		//封装节假日信息 【调休上班】、【节假日】
		Map<String, AttendInfoDTO> holidayMap = getHolidayMap(holidayTime);
		//封装指定月份的周末日期
		Map<String, AttendInfoDTO> weekendMap = getWeekendMap(holidayTime);
		//获取休班信息
		dataMap.put(AttendanceTypeEnum.节假日.getType(), holidayMap);
		dataMap.put(AttendanceTypeEnum.周末.getType(), weekendMap);
		return dataMap;
	}

	/*====================getter and setter =================*/
	/**
	 * @Description: 属性 dailyAttendanceDao 的get方法 
	 * @return dailyAttendanceDao
	 */
	public DailyAttendanceDAO getDailyAttendanceDao() {
		return dailyAttendanceDao;
	}
	/**
	 * @Description: 属性 dailyAttendanceDao 的set方法 
	 * @param dailyAttendanceDao 
	 */
	public void setDailyAttendanceDao(DailyAttendanceDAO dailyAttendanceDao) {
		this.dailyAttendanceDao = dailyAttendanceDao;
	}
	/**
	 * @Description: 属性 dailyOffdutyDao 的get方法 
	 * @return dailyOffdutyDao
	 */
	public DailyOffdutyDAO getDailyOffdutyDao() {
		return dailyOffdutyDao;
	}
	/**
	 * @Description: 属性 dailyOffdutyDao 的set方法 
	 * @param dailyOffdutyDao 
	 */
	public void setDailyOffdutyDao(DailyOffdutyDAO dailyOffdutyDao) {
		this.dailyOffdutyDao = dailyOffdutyDao;
	}

	public void setLegalholidayService(LegalholidayService legalholidayService) {
		this.legalholidayService = legalholidayService;
	}




	
}
