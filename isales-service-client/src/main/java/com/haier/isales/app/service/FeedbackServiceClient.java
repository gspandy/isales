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

import com.haier.isales.app.dto.CreateBoData4Json;
import com.haier.isales.app.dto.FeedbackDTO;
import com.haier.isales.app.dto.IssueAppendDTO;
import com.haier.isales.app.dto.IssueQueryDTO;

/**
 * @ClassName: FeedbackServiceClient
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public interface FeedbackServiceClient {
	/** 
	* @Description: 用户意见反馈提交
	* @author John.zhao   
	* @date 2014-12-12 下午2:23:13 
	* @param feedbackDTO
	* @return  
	*/ 
	@Export(paramNames = { "feedbackDTO" })
	public Object addFeedback(FeedbackDTO feedbackDTO);
	
	/** 
	* @Description: 调用ws向BPM系统提报问题
	* @author Guo Yuchao   
	* @date 2015-1-26 下午5:03:37 
	* @param feedbackDTO
	* @return  
	*/ 
	@Export(paramNames = {"feedbackDTO","createBoData4Json"})
	public Object createFeedBackByWs(FeedbackDTO feedbackDTO,CreateBoData4Json createBoData4Json);
	/** 
	* @Description: 问题追问
	* @author R.Core  
	* @date 2015-3-3 下午1:50:21 
	* @param issueQueryDTO
	* @return  
	*/ 
	public Object addIssueAsking(IssueQueryDTO issueQueryDTO,IssueAppendDTO issueAppendDTO);
	/** 
	* @Description: 关闭问题
	* @author R.Core  
	* @date 2015-3-3 下午2:39:20 
	* @param issueQueryDTO
	* @return  
	*/ 
	public Object update2CloseBpmProgress(IssueQueryDTO issueQueryDTO);
}
