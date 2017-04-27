/**
* @Company 青鸟软通   
* @Title: FeedbackServiceClientImpl.java 
* @Package com.haier.isales.app.service.impl 
* @author John.zhao   
* @date 2014-12-12 下午2:21:04 
* @version V1.0   
*/ 
package com.haier.isales.app.service.impl;

import java.util.List;

import com.haier.isales.app.AppDomainDtoUtil;
import com.haier.isales.app.bpmissuetype.domain.BpmIssueTypeDomain;
import com.haier.isales.app.bpmissuetype.service.BpmIssueTypeService;
import com.haier.isales.app.domain.FeedbackDomain;
import com.haier.isales.app.dto.BpmIssueSearchDTO;
import com.haier.isales.app.dto.BpmIssueTypeDTO;
import com.haier.isales.app.dto.CreateBoData4Json;
import com.haier.isales.app.dto.FeedbackDTO;
import com.haier.isales.app.dto.IssueAppendDTO;
import com.haier.isales.app.dto.IssueQueryDTO;
import com.haier.isales.app.dto.OmsHandlerDTO;
import com.haier.isales.app.omshandler.service.OmsHandlerService;
import com.haier.isales.app.service.FeedbackSearchClient;
import com.haier.isales.app.service.FeedbackService;
import com.haier.isales.app.service.FeedbackServiceClient;

/** 
 * @ClassName: FeedbackServiceClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class FeedbackServiceClientImpl implements FeedbackServiceClient ,FeedbackSearchClient{
	
	private FeedbackService feedbackService;
	private BpmIssueTypeService bpmIssueTypeService;
	private OmsHandlerService omsHandlerService;

	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2014-12-12 下午2:23:45 
	* @param feedbackDTO
	* @return 
	* @see com.haier.isales.app.service.FeedbackServiceClient#addFeedback(com.haier.isales.app.dto.FeedbackDTO) 
	*/ 
	@Override
	public Object addFeedback(FeedbackDTO feedbackDTO) {
		FeedbackDomain feedbackDomain = AppDomainDtoUtil.cloneFeedbackDTO2FeedbackDomain(feedbackDTO);
		feedbackService.addFeedBack(feedbackDomain);
		return  null;
	}
	/**
	* <p>Description:调用ws向BPM系统提报问题 </p> 
	* @author Guo Yuchao   
	* @date 2015-1-26 下午5:04:39 
	* @param feedbackDTO
	* @return 
	* @see com.haier.isales.app.service.FeedbackServiceClient#createFeedBackByWs(com.haier.isales.app.dto.FeedbackDTO) 
	*/ 
	@Override
	public String createFeedBackByWs(FeedbackDTO feedbackDTO,CreateBoData4Json createBoData4Json) {
		
		
		return  feedbackService.createFeedBackByWs(feedbackDTO,createBoData4Json);
	}

	/**
	 * @Description: 属性 feedbackService 的set方法 
	 * @param feedbackService 
	 */
	public void setFeedbackService(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2015-1-28 下午10:31:45 
	* @param bpmIssueTypeDTO
	* @return 
	* @see com.haier.isales.app.service.FeedbackServiceClient#findBpmIssueType(com.haier.isales.app.dto.BpmIssueTypeDTO) 
	*/ 
	@Override
	public List<String> findBpmIssueType(BpmIssueTypeDTO bpmIssueTypeDTO) {
		BpmIssueTypeDomain domain = AppDomainDtoUtil.cloneBpmIssueTypeDTO2Domain(bpmIssueTypeDTO);
		return bpmIssueTypeService.findBpmIssueType(domain);
	}
	/**
	* <p>Description: 查询一级处理人</p> 
	* @author Guo Yuchao   
	* @date 2015-2-5 下午10:49:40 
	* @param orgCode
	* @return 
	* @see com.haier.isales.app.service.FeedbackSearchClient#findBpmIssueHandlerLocal(java.lang.String) 
	*/ 
	@Override
	public List<OmsHandlerDTO> findBpmIssueHandlerLocal(BpmIssueSearchDTO bpmIssueSearchDTO) {
		
		return omsHandlerService.findBpmIssueHandlerLocal(bpmIssueSearchDTO);
	}
	/**
	 * @Description: 属性 bpmIssueTypeService 的set方法 
	 * @param bpmIssueTypeService 
	 */
	public void setBpmIssueTypeService(BpmIssueTypeService bpmIssueTypeService) {
		this.bpmIssueTypeService = bpmIssueTypeService;
	}
	public void setOmsHandlerService(OmsHandlerService omsHandlerService) {
		this.omsHandlerService = omsHandlerService;
	}
	/**
	* <p>Description:Bpm系统问题列表查询 </p> 
	* @author R.Core 
	* @date 2015-3-3 下午5:56:27 
	* @param userCode
	* @return 
	* @see com.haier.isales.app.service.FeedbackSearchClient#findIssueListByTbr(java.lang.String) 
	*/ 
	@Override
	public Object findIssueListByTbr(String userCode) {
		List<IssueQueryDTO> issueList = feedbackService.findIssueListByTbr(userCode);
		return issueList;
	}
	/**
	* <p>Description: 查询问题详情 </p> 
	* @author R.Core 
	* @date 2015-3-3 下午5:56:27 
	* @param processInstanceId
	* @return 
	* @see com.haier.isales.app.service.FeedbackSearchClient#findIssueDetail(int) 
	*/ 
	@Override
	public Object findIssueDetail(int processInstanceId) {
		return feedbackService.findIssueDetail(processInstanceId);
	}
	/**
	* <p>Description:问题追问 </p> 
	* @author R.Core 
	* @date 2015-3-3 下午5:56:27 
	* @param issueQueryDTO
	* @param issueAppendDTO
	* @return 
	* @see com.haier.isales.app.service.FeedbackServiceClient#addIssueAsking(com.haier.isales.app.dto.IssueQueryDTO, com.haier.isales.app.dto.IssueAppendDTO) 
	*/ 
	@Override
	public Object addIssueAsking(IssueQueryDTO issueQueryDTO,
			IssueAppendDTO issueAppendDTO) {
		String askingResult = feedbackService.addIssueAsking(issueQueryDTO, issueAppendDTO);
		return askingResult;
	}
	/**
	* <p>Description: 关闭问题</p> 
	* @author R.Core 
	* @date 2015-3-3 下午5:56:27 
	* @param issueQueryDTO
	* @return 
	* @see com.haier.isales.app.service.FeedbackServiceClient#update2CloseBpmProgress(com.haier.isales.app.dto.IssueQueryDTO) 
	*/ 
	@Override
	public Object update2CloseBpmProgress(IssueQueryDTO issueQueryDTO) {
		String closeResult = feedbackService.update2CloseBpmProgress(issueQueryDTO);
		return closeResult;
	}
	

}
