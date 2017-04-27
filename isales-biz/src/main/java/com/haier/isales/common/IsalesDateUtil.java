/**
* @Company 青鸟软通   
* @Title: IsalesDateUtil.java 
* @Package com.haier.isales.common 
* @author Guo Yuchao   
* @date 2014-12-18 下午3:39:12 
* @version V1.0   
*/ 
package com.haier.isales.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.bana.common.util.basic.DateUtil;
import org.bana.common.util.basic.StringUtils;
import org.bana.common.util.exception.BanaUtilException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;

/** 
 * @ClassName: IsalesDateUtil 
 * @Description:处理日期相关
 *  
 */
public class IsalesDateUtil extends DateUtil {
	private static final Logger LOG = LoggerFactory.getLogger(IsalesDateUtil.class);
	
	/** 
	* @Fields supportDateFormat : 目前支持的日期格式问题
	*/ 
	private static String[] supportDateFormat = new String[]{
		"yyyy-MM-dd HH:mm:ss","yyyy-MM-dd HH:mm","yyyy-MM-dd","yyyy-MM",
		"yyyy年MM月dd日  HH时mm分ss秒","yyyy年MM月dd日  HH时mm分","yyyy年MM月dd日","yyyy年MM月",
		"MM/dd/yyyy","yyyyMM"
	};
	 /** 
	    * @Description: 格式化对应的时间
	    * @author Liu Wenjie   
	    * @date 2014-11-24 下午5:24:27 
	    * @param dateStr
	    * @param dateFormat
	    * @return  
	    */ 
	    public static Date formateToDate(String dateStr,String dateFormat){
	    	if(dateStr == null){
	    		return null;
	    	}
	    	String dateFormatValue = "";
			if(StringUtils.isBlank(dateFormat)){
				dateFormatValue = "yyyy年MM月dd日  HH:mm:ss";
		    }else{
		     	dateFormatValue = dateFormat;
		    }
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormatValue);
	        try {
				return sdf.parse(dateStr);
			} catch (ParseException e) {
				return formateToDate(dateStr);
			}
	    }
	    
	    /** 
	    * @Description: 当前支持的所有时间格式逐步实验来解析对应的时间格式
	    * @author Liu Wenjie   
	    * @date 2014-11-25 下午11:34:18 
	    * @param dateStr
	    * @return  
	    */ 
	    public static Date formateToDate(String dateStr){
	    	for (String format : supportDateFormat) {
				DateFormat df = new SimpleDateFormat(format);
				try {
					return df.parse(dateStr);
				} catch (ParseException ex) {
					continue;
				}
			}
			throw new BanaUtilException("解析日期 " + dateStr + " 失败,不支持的时间格式");
	    }
	    
	    /** 
	    * @Description: 按照指定的日期格式,转化日期字符串
	    * @author Liu Wenjie   
	    * @date 2014-11-15 下午5:51:15 
	    * @param date
	    * @param dateFormat
	    * @return  
	    */ 
	    public static String toFormatString(Date date,String dateFormat){
	    	Date date2 = date;
	    	String dateFormatValue = "yyyy年MM月dd日  HH:mm:ss";
	        if(!StringUtils.isBlank(dateFormat)){
	        	dateFormatValue = dateFormat;
	        }
	        SimpleDateFormat sdf = new SimpleDateFormat(dateFormatValue);
	        if(date2 == null){
	        	date2 = new Date();
	        }
	        return sdf.format(date2);
	    }
	    /** 
	    * @Description: 英文环境时间 
	    * @author Guo Yuchao   
	    * @date 2015-2-5 下午5:18:14 
	    * @param date
	    * @param dateFormat
	    * @return  
	    */ 
	    public static String toFormatStringEn(Date date,String dateFormat){
	    	Date date2 = date;
	    	String dateFormatValue = "yyyy年MM月dd日  HH:mm:ss";
	    	if(!StringUtils.isBlank(dateFormat)){
	    		dateFormatValue = dateFormat;
	    	}
	    	SimpleDateFormat sdf = new SimpleDateFormat(dateFormatValue,Locale.ENGLISH);
	    	if(date2 == null){
	    		date2 = new Date();
	    	}
	    	return sdf.format(date2);
	    }

	
	/** 
	* @Description: 获取业绩查询字符串  时间周期  传入时间字符串  截取  年月  如2014-12
	* 验证"-"或"/"分隔时间字符串  
	* 支持 2014-12-18 11:45:21  --》 2014-12
	*    2014-12-18    --》 2014-12
	*    2014-12 --》 2014-12
	*    
	* 支持 2014/12/18 11:45:21  --》 2014-12
	*    2014/12/18    --》 2014-12
	*    2014/12 --》 2014-12 
	*    
	* @author Guo Yuchao   
	* @date 2014-12-18 上午11:46:10 
	* @param dateStr
	* @return  
	 * @throws ParseException 
	 */
	public static String getPeriodDateString(String dateStr){
		String dateStr2 = dateStr.trim();
		boolean valResult = RegexUtil.validateStringUseRegex(dateStr2,"([\\d]{4}[/-][\\d]{1,2})(([/-][\\d]{1,2})?|([/-][\\d]{1,2}\\s[\\d]{1,2}:[\\d]{1,2}:[\\d]{1,2})?)");
		if(valResult){
			StringBuffer dateResult = new StringBuffer();
			if(RegexUtil.findIfStringContainsReg(dateStr2, "/")){
				String[] dateStrAry = dateStr2.split("/"); 
				dateResult.append(dateStrAry[0]).append("-");
				if(RegexUtil.validateStringUseRegex(dateStrAry[1],"^[\\d]$")){
					dateResult.append("0").append(dateStrAry[1]);
				}else if(RegexUtil.validateStringUseRegex(dateStrAry[1],"^[\\d]{2}$")){
					dateResult.append(dateStrAry[1]);
				}else{
					throw new BusinessException(BusinessExceptionCode.param_error,"暂不支持该时间格式"+dateStr2);
				}
			}
			if(RegexUtil.findIfStringContainsReg(dateStr2, "-")){
				String[] dateStrAry = dateStr2.split("-"); 
				dateResult.append(dateStrAry[0]).append("-");
				if(RegexUtil.validateStringUseRegex(dateStrAry[1],"^[\\d]$")){
					dateResult.append("0").append(dateStrAry[1]);
				}else if(RegexUtil.validateStringUseRegex(dateStrAry[1],"^[\\d]{2}$")){
					dateResult.append(dateStrAry[1]);
				}else{
					throw new BusinessException(BusinessExceptionCode.param_error,"暂不支持该时间格式"+dateStr2);
				}
			}
			return dateResult.toString();
		}else{
			throw new BusinessException(BusinessExceptionCode.param_error,"暂不支持该时间格式"+dateStr2);
		}
	} 
	/** 
	* @Description: 会员相关截取2014-01 --》 14-1
	* @author Guo Yuchao   
	* @date 2014-12-19 下午4:42:11 
	* @param dateStr
	* @return  
	*/ 
	public static String getRegistChartString(String dateStr){
		String dateStr2 = dateStr.trim().substring(2);
			StringBuffer dateResult = new StringBuffer();			
			if(RegexUtil.findIfStringContainsReg(dateStr2, "-")){
				String[] dateStrAry = dateStr2.split("-"); 
				dateResult.append(dateStrAry[0]).append("-");
				int month = CheckParamUtil.parseStrToInt(dateStrAry[1]);
					dateResult.append(month);
			}
			return dateResult.toString();
	} 
	/** 
	* @Description:查找指定日期基准上的年月  返回格式为 yyyy-MM 例如查询（2014-01 -1 -2）--》2012-11 
	* @author Guo Yuchao   
	* @date 2014-12-18 下午3:39:51 
	* @param dateStr 指定年月
	* @param yearStep 年份修改
	* @param monthStep 月份修改
	* @return  
	*/ 
	public static String getBeforeMonthFromDateStr(String dateStr,int yearStep,int monthStep){
		String dateStr2 = dateStr.trim();
		boolean valResult = RegexUtil.validateStringUseRegex(dateStr2,"([\\d]{4}[/-][\\d]{1,2})(([/-][\\d]{1,2})?|([/-][\\d]{1,2}\\s[\\d]{1,2}:[\\d]{1,2}:[\\d]{1,2})?)");
		if(valResult){
			StringBuffer dateResult = new StringBuffer();
			Calendar cal = Calendar.getInstance();
			if(RegexUtil.findIfStringContainsReg(dateStr2, "/")){
				String[] dateStrAry = dateStr2.split("/"); 
				cal.set(Integer.valueOf(dateStrAry[0]), Integer.valueOf(dateStrAry[1])-1, 1);
			}
			if(RegexUtil.findIfStringContainsReg(dateStr2, "-")){
				String[] dateStrAry = dateStr2.split("-"); 
				cal.set(Integer.valueOf(dateStrAry[0]), Integer.valueOf(dateStrAry[1])-1, 1);
			}
			cal.add(Calendar.MONTH, monthStep);
			cal.add(Calendar.YEAR, yearStep);
			int month = cal.get(Calendar.MONTH)+1;
			if(month<10){
				dateResult.append(cal.get(Calendar.YEAR)).append("-0").append(month);
			}else{
				dateResult.append(cal.get(Calendar.YEAR)).append("-").append(month);
			}
			return dateResult.toString();
		}else{
			throw new BusinessException(BusinessExceptionCode.param_error,"暂不支持该时间格式"+dateStr2);
		}
	}
	/** 
	* @Description: 业绩报表展示以前12个月的数据  构造月份格式 yy-M  
	* @author Guo Yuchao   
	* @date 2014-12-23 下午4:28:19 
	* @param dateStr
	* @return  
	*/ 
	public static List<String> getLast12YearMonthList(String dateStr,int changeStep){
		if(StringUtils.isEmpty(dateStr)){
			throw new BusinessException(BusinessExceptionCode.param_error,"时间参数不能为空");
		}
//		Date date = formateToDate(dateStr);
//		dateStr = toFormatString(date,"yyyy-MM");
		Calendar cal = Calendar.getInstance();
//		String[] dateStrAry = dateStr.split("-"); 
//		cal.set(Integer.valueOf(dateStrAry[0]), Integer.valueOf(dateStrAry[1])-1, 1);
		cal.add(Calendar.MONTH, -11);
		cal.add(Calendar.YEAR, changeStep);
		List<String> yearMonthList = new ArrayList<String>();
		for(int i=0;i<12;i++){
			StringBuffer dateResult = new StringBuffer();
			int year = cal.get(Calendar.YEAR);
			int binaryYear = year%100;
			int month = cal.get(Calendar.MONTH)+1;
			dateResult.append(binaryYear).append("-").append(month);
			cal.add(Calendar.MONTH, 1);
			yearMonthList.add(dateResult.toString());
		}
		return yearMonthList;
	}
	/** 
	* @ClassName: DateFormatStrEnum 
	* @Description:通用时间格式
	*  
	*/ 
	public enum DateFormatStrEnum{
		  y_M_d_H_m_s("yyyy-MM-dd HH:mm:ss")
		, y_M_d("yyyy-MM-dd")
		, y_M("yyyy-MM")
		, time_chinese("yyyy年MM月dd日  HH时mm分ss秒")
		, date_chinese("yyyy年MM月dd日")
		, date_CH_E("yyyy年MM月dd日(E)")
		, date_1bit_CH_E("yyyy年M月d日(E)")
		, year_month_chinese("yyyy年MM月")
		, y_M_d_divisor("yyyy/MM/dd")
		, y4MdHms2("yyyyMMddHHmmss")
		, yyyyMMdd("yyyyMMdd")
		, yM_divisor("yyyy/MM");
		  
		private String formatStr;
		private DateFormatStrEnum(String formatStr){
			this.setFormatStr(formatStr);
		}
		public static List<String> getAllDateFormatStr(){
			List<String> valueList  = new ArrayList<String>();
			DateFormatStrEnum[] values = DateFormatStrEnum.values();
			for (DateFormatStrEnum value : values) {
				valueList.add(value.getFormatStr());
			}
			return valueList;
		}
		public String getFormatStr() {
			return formatStr;
		}
		public void setFormatStr(String formatStr) {
			this.formatStr = formatStr;
		}
		
	}
	/** 
	* @ClassName: IsalesDateFormatStrEnum 
	* @Description: 本系统业务时间格式 
	*  
	*/ 
	public enum IsalesDateFormatStrEnum{
		  h_m_apm("h:m a")
		, hh_mm_apm("hh:mm a");
		
		private String formatStr;
		private IsalesDateFormatStrEnum(String formatStr){
			this.setFormatStr(formatStr);
		}
		public static List<String> getAllDateFormatStr(){
			List<String> valueList  = new ArrayList<String>();
			DateFormatStrEnum[] values = DateFormatStrEnum.values();
			for (DateFormatStrEnum value : values) {
				valueList.add(value.getFormatStr());
			}
			return valueList;
		}
		public String getFormatStr() {
			return formatStr;
		}
		public void setFormatStr(String formatStr) {
			this.formatStr = formatStr;
		}
		
	}
	/** 
	* @Description: 获取指定月份的所有日期  返回值yyyy-MM-dd
	* @author Guo Yuchao   
	* @date 2015-2-2 下午3:33:03 
	* @param month
	* @return  
	*/ 
	public static List<String> getAllDaysOfMonth(String month){
		if(StringUtils.isEmpty(month)){
			throw new BusinessException(BusinessExceptionCode.param_error,"传入年月为空");
		}
		Date monthDate = formateToDate(month);
		Calendar cal = Calendar.getInstance();
		cal.setTime(monthDate);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.DAY_OF_MONTH, -1);
		int days =cal.get(Calendar.DAY_OF_MONTH);
		List<String> dayList = new ArrayList<String>();
		String yearMonth = toFormatString(monthDate, "yyyy-MM");
		for (int i = 1; i < days+1; i++) {
			StringBuffer dateTimeBuffer = new StringBuffer();
			if(i<10){
				dateTimeBuffer.append(yearMonth).append("-0").append(i);
			}else{
				dateTimeBuffer.append(yearMonth).append("-").append(i);
			}
			dayList.add(dateTimeBuffer.toString());
		}
		return dayList;
	}
	/** 
	* @Description: 获取指定月份的所有周末日期
	* @author Guo Yuchao   
	* @date 2015-2-3 上午10:44:26 
	* @param month
	* @return  
	*/ 
	public static List<String> getWeekendsOfMonth(String month){
		if(StringUtils.isEmpty(month)){
			throw new BusinessException(BusinessExceptionCode.param_error,"传入年月为空");
		}
		Date monthDate = formateToDate(month);
		Calendar cal = Calendar.getInstance();
		cal.setTime(monthDate);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.DAY_OF_MONTH, -1);
		int days =cal.get(Calendar.DAY_OF_MONTH);
		List<String> dayList = new ArrayList<String>();
		String yearMonth = toFormatString(monthDate, "yyyy-MM");
		cal.setTime(monthDate);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.add(Calendar.DAY_OF_MONTH, -1);
		for (int i = 1; i < days+1; i++) {
			cal.add(Calendar.DAY_OF_MONTH, 1);
			if(isWeekend(cal)){
				StringBuffer dateTimeBuffer = new StringBuffer();
				if(i<10){
					dateTimeBuffer.append(yearMonth).append("-0").append(i);
				}else{
					dateTimeBuffer.append(yearMonth).append("-").append(i);
				}
				dayList.add(dateTimeBuffer.toString());
			}
		}
		return dayList;
	}

	/** 
	* @Description: 判断是否为周末
	* @author Guo Yuchao   
	* @date 2015-2-3 上午10:44:53 
	* @param cal
	* @return  
	*/ 
	private static boolean isWeekend(Calendar cal) {
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;  
		if(week ==6 || week==0){//0代表周日，6代表周六  
		    return true;  
		}  
		return false;
	}
	/** 
	* @Description: 判断是否为周末
	* @author Guo Yuchao   
	* @date 2015-2-4 下午4:33:01 
	* @param dateStr
	* @return  
	*/ 
	public static boolean isWeekend(String dateStr) {
		Date monthDate = formateToDate(dateStr);
		Calendar cal = Calendar.getInstance();
		cal.setTime(monthDate);
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;  
		if(week ==6 || week==0){//0代表周日，6代表周六  
			return true;  
		}  
		return false;
	}
	/** 
	* @Description:判断是否为周末
	* @author Guo Yuchao   
	* @date 2015-2-4 下午4:33:08 
	* @param date
	* @return  
	*/ 
	public static boolean isWeekend(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;  
		if(week ==6 || week==0){//0代表周日，6代表周六  
			return true;  
		}  
		return false;
	}
	/** 
	* @Description: 获取明天00:00:00时间毫秒数
	* @author Guo Yuchao   
	* @date 2015-2-3 上午9:22:14 
	* @return  
	*/ 
	public static long getTomorrowMillis(){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		StringBuffer tomorrowStr = new StringBuffer(); 
		if(month<10){
			tomorrowStr.append(year).append("-0").append(month);
		}else{
			tomorrowStr.append(year).append("-").append(month);
		}
		if(day<10){
			tomorrowStr.append("-0").append(day);
		}else{
			tomorrowStr.append("-").append(day);
		}
		Date tomorrowDate = formateToDate(tomorrowStr.toString(), DateFormatStrEnum.y_M_d.getFormatStr());
		return tomorrowDate.getTime();
	}
	public static void main(String[] args){
		
		
		LOG.info("判断时间格式"+getPeriodDateString("2014-11-12 12:12:12"));
//		LOG.info("判断 指定时间上月格式"+getBeforeMonthFromDateStr("2014-1-12 12:12:12",-11));
		LOG.info("判断 指定时间上月格式"+getRegistChartString("2014-1"));
		LOG.info("查询前12月月份"+getLast12YearMonthList("201401",-1));
		LOG.info("查询月份"+getWeekendsOfMonth("2015-02"));
		LOG.info("获取明天00:00:00时间毫秒数"+getTomorrowMillis());
		LOG.info(toFormatStringEn(formateToDate("2014-1-12 14:12:12"),IsalesDateFormatStrEnum.hh_mm_apm.getFormatStr()));
		
	}

}
