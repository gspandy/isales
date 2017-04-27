/**
 * @Company 青鸟软通   
 * @Title: FeedbackServiceClient.java 
 * @Package com.haier.isales.app.service 
 * @author John.zhao   
 * @date 2014-12-12 下午2:20:09 
 * @version V1.0   
 */
package com.haier.isales.app.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.app.dto.BpmIssueSearchDTO;
import com.haier.isales.app.dto.BpmIssueTypeDTO;

/**
 * @ClassName: FeedbackServiceClient
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public interface FeedbackSearchClient {
	
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
	@Export(paramNames = {"bpmIssueTypeDTO"})
	public Object findBpmIssueType(BpmIssueTypeDTO bpmIssueTypeDTO);

	/** 
	* @Description: 查询一级处理人
	* @author Guo Yuchao   
	* @date 2015-2-5 下午10:49:10 
	* @param orgCode
	* @return  
	*/ 
	public Object findBpmIssueHandlerLocal(BpmIssueSearchDTO bpmIssueSearchDTO);
	/** 
	* @Description: Bpm系统问题列表查询
	* @author R.Core  
	* @date 2015-3-3 上午11:12:30 
	* @param userCode
	* @return  
	*/ 
	public Object findIssueListByTbr(String userCode);
	/** 
	* @Description: 查询问题详情 
	* @author R.Core  
	* @date 2015-3-3 下午12:54:15 
	* @param processInstanceId
	* @return  
	*/ 
	public Object findIssueDetail(int processInstanceId);

}
