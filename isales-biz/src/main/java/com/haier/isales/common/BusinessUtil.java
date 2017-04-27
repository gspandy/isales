/**
* @Company 青鸟软通   
* @Title: BusinessUtil.java 
* @Package com.haier.isales.common 
* @author Liu Wenjie   
* @date 2014-11-20 下午11:11:03 
* @version V1.0   
*/ 
package com.haier.isales.common;

import java.util.List;

import org.bana.common.util.basic.StringUtils;

import com.haier.isales.system.labelgroup.domain.LabelGroupDomain;

/** 
 * @ClassName: BusinessUtil 
 * @Description: 系统业务中使用的通用方法
 *  
 */
public class BusinessUtil {

	/** 
	* @Description: 根据群组集合，返回符合要求的群组字符串
	* @author Liu Wenjie   
	* @date 2014-11-20 下午11:12:05 
	* @param labelGroups
	* @return  
	*/ 
	public static String getLabelGroupString(List<String> labelGroups){
		if(labelGroups == null || labelGroups.isEmpty()){
			return "##";
		}
		StringBuffer sb = new StringBuffer();
		for (String str : labelGroups) {
			if(StringUtils.isNotBlank(str)){
				sb.append("#").append(str).append("#|");
			}
		}
		String string = sb.toString();
		if(StringUtils.isNotBlank(string) && string.endsWith("|")){
			string = string.substring(0,string.length() - 1);
		}
		return string;
	}
	
	/** 
	* @Description: 根据群组集合，返回符合要求的群组字符串
	* @author Cao Rui
	* @date 2014-11-21 上午11:12:05 
	* @param labelGroups
	* @return  
	*/ 
	public static String getLabelGroupByDomainList(List<LabelGroupDomain> labelGroups){
		if(labelGroups == null || labelGroups.isEmpty()){
			return "##";
		}
		StringBuffer sb = new StringBuffer();
		for (LabelGroupDomain domain : labelGroups) {
			if(null != domain && null != domain.getGroupId()){
				sb.append("#").append(domain.getGroupId()).append("#|");
			}
		}
		String string = sb.toString();
		if(StringUtils.isNotBlank(string) && string.endsWith("|")){
			string = string.substring(0,string.length() - 1);
		}
		return string;
	}
}
