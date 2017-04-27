/**
 * @Company 青鸟软通   
 * @Title: BpmIssueTypeService.java 
 * @Package  com.haier.isales.app.bpmissuetype.service
 * @author Guo Yuchao   
 * @date 2015年01月28日  21:30:01
 * @version V1.0   
 */
package com.haier.isales.app.bpmissuetype.service;

import java.util.List;

import com.haier.isales.app.bpmissuetype.domain.BpmIssueTypeDomain;

/** 
 * @ClassName: BpmIssueTypeService
 * @Description: BpmIssueType的Service接口定义类
 *  
 */
public interface BpmIssueTypeService {

	/** 
	* @Description: 根据参数查询BPM问题类型列表  参数  
	*  highClass:问题大类        
	*  smallClass : 问题小类
	*  proLine : 产品组
	*  buCode : BU
	* @author Guo Yuchao   
	* @date 2015-1-28 下午10:05:58 
	* @param bpmIssueTypeDomain
	* @return  
	*/ 
	List<String> findBpmIssueType(BpmIssueTypeDomain bpmIssueTypeDomain);
}
