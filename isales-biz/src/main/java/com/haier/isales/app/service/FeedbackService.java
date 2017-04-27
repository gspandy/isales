/**
 * @Company 青鸟软通   
 * @Title: FeedbackService.java 
 * @Package  com.haier.isales.app.service
 * @author John Zhao   
 * @date 2014年12月12日  14:16:52
 * @version V1.0   
 */
package com.haier.isales.app.service;

import java.util.List;

import com.haier.isales.app.domain.FeedbackDomain;
import com.haier.isales.app.dto.CreateBoData4Json;
import com.haier.isales.app.dto.FeedbackDTO;
import com.haier.isales.app.dto.IssueAppendDTO;
import com.haier.isales.app.dto.IssueDetailDTO;
import com.haier.isales.app.dto.IssueQueryDTO;

/** 
 * @ClassName: FeedbackService
 * @Description: Feedback的Service接口定义类
 *  
 */
public interface FeedbackService {

	public void addFeedBack(FeedbackDomain feedbackDomain);
	/** 
	* @Description: 调用ws向BPM系统提报问题
	* @author Guo Yuchao   
	* @date 2015-1-26 下午4:24:04 
	* @param feedbackDomain  
	*/ 
	public String createFeedBackByWs(FeedbackDTO feedbackDTO,CreateBoData4Json createBoData4Json);
	/** 
	* @Description: Bpm系统问题列表查询
	* @author R.Core  
	* @date 2015-3-3 上午11:12:30 
	* @param userCode
	* @return  
	*/ 
	public List<IssueQueryDTO> findIssueListByTbr(String userCode);
	/** 
	* @Description: 查询问题详情 
	* @author R.Core  
	* @date 2015-3-3 下午12:54:15 
	* @param processInstanceId
	* @return  
	*/ 
	public List<IssueDetailDTO> findIssueDetail(Integer processInstanceId);
	/** 
	* @Description: 问题追问
	* @author R.Core  
	* @date 2015-3-3 下午1:50:21 
	* @param issueQueryDTO
	* @return  
	*/ 
	public String addIssueAsking(IssueQueryDTO issueQueryDTO,IssueAppendDTO issueAppendDTO);
	/** 
	* @Description: 关闭问题
	* @author R.Core  
	* @date 2015-3-3 下午2:39:20 
	* @param issueQueryDTO
	* @return  
	*/ 
	public String update2CloseBpmProgress(IssueQueryDTO issueQueryDTO);
}
