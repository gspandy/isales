/**
 * @Company 青鸟软通   
 * @Title: DomainEntityUtil.java 
 * @Package com.jbinfo.common.util 
 * @author Liu Wenjie   
 * @date 2013-11-7 下午5:31:04 
 * @version V1.0   
 */
package com.haier.isales.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.haier.isales.app.bpmissuetype.domain.BpmIssueTypeDomain;
import com.haier.isales.app.domain.AppVersionDomain;
import com.haier.isales.app.domain.FeedbackDomain;
import com.haier.isales.app.dto.AppVersionDTO;
import com.haier.isales.app.dto.AppVersionQueryDTO;
import com.haier.isales.app.dto.BpmIssueTypeDTO;
import com.haier.isales.app.dto.FeedbackDTO;
import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.common.StringUtil;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;


/**
 * @ClassName: AppDomainDtoUtil
 * @Description: app模块中 实体和对象相互转化的工具类
 * 
 */
public class AppDomainDtoUtil {

	public static AppVersionDTO cloneAppVersionDomain2DTO(AppVersionDomain domain) {
		//将手机版本的domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		AppVersionDTO dto = ClonePojoUtil.copyClassFromTo(domain,
				AppVersionDTO.class);
		//额外处理domain和dto中不同的时间，domain中为Date类型，dto中为string类型，格式为YYYY-MM-DD
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
		Date appUpgradeTime = domain.getAppUpgradeTime();
		if(null != appUpgradeTime){
			String appUpgradeTimeShow = sdf.format(appUpgradeTime);
			dto.setAppUpgradeTime(appUpgradeTimeShow);
		}

		return dto;
	}
	public static AppVersionDomain cloneAppVersionDTO2Domain(AppVersionDTO dto) {
		//将潜客的手机版本信息转化为domain信息
		if (dto == null) {
			return null;
		}
		AppVersionDomain domain = ClonePojoUtil.copyClassFromTo(dto,
				AppVersionDomain.class);
		//额外处理domain和dto中不同的时间，domain中为Date类型，dto中为string类型，格式为YYYY-MM-DD
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//

		try {
			String appUpgradeTimeShow = dto.getAppUpgradeTime();
			if (!StringUtil.isEmpty(appUpgradeTimeShow)) {
				Date appUpgradeTime = sdf.parse(appUpgradeTimeShow);
				domain.setAppUpgradeTime(appUpgradeTime);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw new SystemException(BusinessExceptionCode.parse_format_error,
					"时间格式错误");
		}
		return domain;
	}
	
	public static AppVersionDomain cloneAppVersionQueryDTO2Domain(AppVersionQueryDTO dto) {
		//将潜客的手机版本信息的查询dto转化为domain信息
		if (dto == null) {
			return null;
		}
		AppVersionDomain domain = ClonePojoUtil.copyClassFromTo(dto,
				AppVersionDomain.class);
		return domain;
	}
	
	/** 
	* @Description: 用户意见反馈 转化
	* @author John.zhao   
	* @date 2014-12-12 下午2:33:46 
	* @param dto
	* @return  
	*/ 
	public static FeedbackDomain cloneFeedbackDTO2FeedbackDomain(FeedbackDTO dto){
		if (dto == null) {
			return null;
		}
		FeedbackDomain domain = ClonePojoUtil.copyClassFromTo(dto, FeedbackDomain.class);
		return domain;
	}
	/** 
	* @Description:bpm问题类型   javabean 转换
	* @author Guo Yuchao   
	* @date 2015-1-28 下午10:29:09 
	* @param dto
	* @return  
	*/ 
	public static BpmIssueTypeDomain cloneBpmIssueTypeDTO2Domain(BpmIssueTypeDTO dto){
		if (dto == null) {
			return null;
		}
		BpmIssueTypeDomain domain = ClonePojoUtil.copyClassFromTo(dto, BpmIssueTypeDomain.class);
		return domain;
	}
	
	
	
}