/**
 * @Company 青鸟软通   
 * @Title: FeedbackService.java 
 * @Package  com.haier.isales.app.service.impl
 * @author John Zhao   
 * @date 2014年12月12日  14:16:52
 * @version V1.0   
 */
package com.haier.isales.app.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.bana.common.util.basic.DateUtil;
import org.bana.common.util.basic.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.app.AppDomainDtoUtil;
import com.haier.isales.app.dao.FeedbackDAO;
import com.haier.isales.app.domain.FeedbackDomain;
import com.haier.isales.app.dto.CreateBoData4Json;
import com.haier.isales.app.dto.FeedbackDTO;
import com.haier.isales.app.dto.IssueAppendDTO;
import com.haier.isales.app.dto.IssueDetailDTO;
import com.haier.isales.app.dto.IssueQueryDTO;
import com.haier.isales.app.dto.IssueTemp;
import com.haier.isales.app.service.FeedbackService;
import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.IsalesDateUtil;
import com.haier.isales.common.IsalesDateUtil.DateFormatStrEnum;
import com.haier.isales.common.JavaToolsUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;
import com.haier.isales.ws.eai.client.boservice.BO;
import com.haier.isales.ws.eai.client.issuesolver.InType;
import com.haier.isales.ws.eai.client.issuesolver.IssueSolver;
import com.haier.isales.ws.eai.client.workflow.WSDKException;
import com.haier.isales.ws.eai.client.workflow.Workflow;
import com.haier.isales.ws.eai.client.workflowtask.WorkflowTask;

/**
 * @ClassName: FeedbackService
 * @Description: Feedback的Service接口定义类
 * 
 */
public class FeedbackServiceImpl implements FeedbackService {

	private static final Logger LOG = LoggerFactory
			.getLogger(FeedbackServiceImpl.class);
	private static final String TABLE_CREATE_ISSUE = "BO_PSI_HDPT";//问题提报
	private static final String TABLE_APPEND_ISSUE = "BO_PSI_HDPT_S";//问题追问表
	private static final String PROCESS_CODE = "009843233161bcdc0355b6a25d930afe";//创建流程号
	private static final String ADMIN_CREATE = "admin";//流程创建人，任务创建人，问题创建人，问题追问创建人，问题关闭人，都从问题提报人改为admin，防止因为直销员未同步到bpm系统导致无法提报
	
	/**
	 * @Fields feedbackDao : FeedbackDao 工具依赖
	 */
	private FeedbackDAO feedbackDao;
	private WorkflowTask workflowTaskService;
	private Workflow workflowService;
	private BO boService;
	private IssueSolver issueSolver;
	
	/* ===============业务方法============= */
	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2014-12-12 下午2:28:07
	 * @see com.haier.isales.app.service.FeedbackService#addFeedBack()
	 */
	@Override
	public void addFeedBack(FeedbackDomain feedbackDomain) {
		feedbackDomain.setFeedbackTime(new Date());
		feedbackDao.save(feedbackDomain);
	}

	/**
	 * <p>
	 * Description: 调用ws向BPM系统提报问题
	 * </p>
	 * 
	 * @author Guo Yuchao
	 * @date 2015-1-26 下午4:25:35
	 * @param feedbackDomain
	 * @see com.haier.isales.app.service.FeedbackService#createFeedBackByWs(com.haier.isales.app.domain.FeedbackDomain)
	 */
	@Override
	public String createFeedBackByWs(FeedbackDTO feedbackDTO,
			CreateBoData4Json createBoData4Json) {
		CheckParamUtil.checkFieldIfNotBlank(feedbackDTO, "handlerCode");
		
		FeedbackDomain feedbackDomain = AppDomainDtoUtil.cloneFeedbackDTO2FeedbackDomain(feedbackDTO);
		CheckParamUtil.checkFieldIfNotBlank(createBoData4Json, "wtxlmc","wtdlmc","wtsm","cpz","bu","xsqd","tbr","tbrbh", "gm","md");
		// 查询第一处理人
		IssueTemp issueTemp = getFirstHandlerFromBpm(feedbackDTO);
		//2015-05-28  修复代码违规：不允许给参数赋值：否则可能方法内部改变的值，不能传到方法外部 
		CreateBoData4Json createBoData4JsonQuery = createBoData4Json;
		createBoData4JsonQuery = initDefaultBoData2BPM(createBoData4Json);
		// 创建流程
		issueTemp = createBpmProgress(createBoData4JsonQuery,issueTemp);
		// 创建任务
		issueTemp = createBpmTask(createBoData4JsonQuery,issueTemp);
		//封装提报问题的数据
		Map<String, Object> map = JavaToolsUtil.getUpperFieldTrueValues(createBoData4JsonQuery);
		JSONObject fromObject = JSONObject.fromObject(map);
		// 创建问题
		issueTemp = createBoIssue(createBoData4JsonQuery,fromObject,issueTemp);
		// 保存到本系统中
		saveIssueInfo2Local(feedbackDomain, issueTemp, fromObject);
		return "问题提报成功";
	}

	/** 
	* @Description: 保存到本系统中
	* @author Guo Yuchao   
	* @date 2015-1-30 上午10:33:55 
	* @param feedbackDomain
	* @param issueTemp
	* @param fromObject  
	*/ 
	private void saveIssueInfo2Local(FeedbackDomain feedbackDomain,
			IssueTemp issueTemp, JSONObject fromObject) {
		StringBuffer remarkBuffer = new StringBuffer();
		remarkBuffer.append(feedbackDomain.getRemark()).append(" BPM流程号：【").append(issueTemp.getProcessInstanceId()).append("】，BPM任务号：【")
				.append(issueTemp.getTaskIdList()).append("】，BPM问题号:【").append(issueTemp.getIssueId()).append("】，处理人：【").append(issueTemp.getIssueHandler())
				.append("】;传递参数为：").append(fromObject.toString());
		feedbackDomain.setRemark(remarkBuffer.toString());
		addFeedBack(feedbackDomain);
	}


	/** 
	* @Description: 查询一级处理人
	* @author Guo Yuchao   
	* @date 2015-1-30 上午9:56:34 
	* @return  
	*/ 
	private IssueTemp getFirstHandlerFromBpm(FeedbackDTO feedbackDTO) {
		IssueTemp issueTemp = new IssueTemp();
		if(!StringUtils.isEmpty(feedbackDTO.getHandlerCode())){
			issueTemp.setIssueHandler(feedbackDTO.getHandlerCode());
		}
//		else{
//			//暂时取数据字典 处理人默认为A0008379
//			String firstHandler = DictionaryCache.getInstance().getValueByTypeAndId(
//					DictionaryType.bpm_default_issue_handler.getTypeId(), 
//					BpmDefaultIssueHandlerEnum.本系统默认处理人.getBusinId());
//			if(StringUtils.isEmpty(firstHandler)){
//				firstHandler = DictionaryCache.getInstance().getValueByTypeAndId(
//						DictionaryType.bpm_default_issue_handler.getTypeId(), 
//						BpmDefaultIssueHandlerEnum.找不到处理人.getBusinId());
//			}
//			if(StringUtils.isEmpty(firstHandler)){
//				firstHandler = BpmDefaultIssueHandlerEnum.找不到处理人.getBusinName();
//			}
//			issueTemp.setIssueHandler(firstHandler);
//		}
		return issueTemp;
	}

	/** 
	* @Description: 调用ws向BPM  BO系统创建问题 
	* @author Guo Yuchao   
	* @date 2015-1-27 下午5:38:50 
	* @param boData2BPM getTbrbh() 提报人编号   
	* @param processInstanceId 流程号
	* @param fromObject
	* @return  
	*/ 
	private IssueTemp createBoIssue(CreateBoData4Json createBoData4Json,JSONObject fromObject,IssueTemp issueTemp) {
		
		// 修改违规：“定义了形式参数，却没有用，检查一下逻辑是否有问题”
		LOG.info("输入参数：" + createBoData4Json.toString());
		
		int issueId = 0;
		try {//BO_HDPT_PSI_E
			issueId = boService.createBOData(TABLE_CREATE_ISSUE,fromObject.toString(), issueTemp.getProcessInstanceId(), ADMIN_CREATE);
			LOG.info("创建问题：" + issueId);
		} catch (com.haier.isales.ws.eai.client.boservice.WSDKException wSDKException) {
			throw new SystemException(BusinessExceptionCode.ws_result_error,"BPM系统提报问题失败,请联系管理员", wSDKException);
		} catch (Exception e) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"BPM系统提报问题失败，请稍后重试!", e);
		}
		if(issueId == 0){
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"BPM系统提报问题失败");
		}
		issueTemp.setIssueId(issueId);
		return issueTemp;
	}
	
	/** 
	* @Description:  调用ws向BPM系统创建任务
	* @author Guo Yuchao   
	* @date 2015-1-27 下午5:37:11 
	* @param boData2BPM  getTbrbh() 提报人编号    getWtbt 问题标题
	* @param processInstanceId  流程号
	* @return  
	*/ 
	private IssueTemp createBpmTask(CreateBoData4Json createBoData4Json,IssueTemp issueTemp) {
		List<Integer> taskIdList ;
		try {
			taskIdList = workflowTaskService.createProcessTaskInstance1(ADMIN_CREATE, issueTemp.getProcessInstanceId(), 0, 0, 1,issueTemp.getIssueHandler(),createBoData4Json.getWtbt(), false, 0);
		} catch (com.haier.isales.ws.eai.client.workflowtask.WSDKException wSDKException) {
			throw new SystemException(BusinessExceptionCode.ws_result_error,"BPM系统创建任务失败,请联系管理员", wSDKException);
		} catch (Exception e) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"BPM系统创建任务失败，请稍后重试!", e);
		}
		if(taskIdList == null ||taskIdList.isEmpty()){
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"BPM系统创建任务失败");
		}
//		LOG.info("taskId:" + taskIdList);
		issueTemp.setTaskIdList(taskIdList);
		return issueTemp;
	}

	/** 
	* @Description: bpm系统创建流程
	* @author Guo Yuchao   
	* @date 2015-1-27 下午5:34:54 
	* @param boData2BPM  getTbrbh() 提报人编号    getWtbt 问题标题
	* @return  
	*/ 
	private IssueTemp createBpmProgress(CreateBoData4Json createBoData4Json,IssueTemp issueTemp) {
		int processInstanceId = 0;
		try {//00fc8643f24b236072b3db248380a2ea"
			processInstanceId = workflowService.createProcessInstance1( PROCESS_CODE, ADMIN_CREATE,createBoData4Json.getWtbt());
		} catch (WSDKException wSDKException) {
			throw new SystemException(BusinessExceptionCode.ws_result_error,"BPM系统创建流程失败,请联系管理员", wSDKException);
		} catch (Exception e) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"BPM系统创建流程失败，请检查填写信息或稍后重试!", e);
		}
		if(processInstanceId == 0){
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"BPM系统创建流程失败");
		}
		issueTemp.setProcessInstanceId(processInstanceId);
		return issueTemp;
	}

	/** 
	* @Description: 初始化创建问题接口 默认参数
	* @author Guo Yuchao   
	* @date 2015-1-28 下午5:48:19 
	* @param createBoData4Json
	* @return  
	*/ 
	public CreateBoData4Json initDefaultBoData2BPM(CreateBoData4Json createBoData4Json) {
		CreateBoData4Json createBoData4JsonQuery;
		if(createBoData4Json == null){
			createBoData4JsonQuery = new CreateBoData4Json();
		}else{
			createBoData4JsonQuery = createBoData4Json;
		}
		createBoData4JsonQuery.setTbsj(DateUtil.getNowString("yyyy-MM-dd HH:mm:ss"))	;
		createBoData4JsonQuery.setWtbt("直销员问题反馈")	;//需求标题  在portal待办上显示标题 ，后续可以让用户填写
		createBoData4JsonQuery.setJc("1")	;//级次
		createBoData4JsonQuery.setHtype("任务协同");//	平台类型	文本	单行	50	
		createBoData4JsonQuery.setCldz("问题提问");//	处理动作
		createBoData4JsonQuery.setWtly("APP");// 问题来源 2015-3-13 15:22:32 R.Core
		return createBoData4JsonQuery;
	}
	/**
	* <p>Description:  Bpm系统问题列表查询</p> 
	* @author R.Core 
	* @date 2015-3-3 上午11:13:02 
	* @param userCode
	* @return 
	* @see com.haier.isales.app.service.FeedbackService#findIssueListByTbr(java.lang.String) 
	*/ 
	@Override
	public List<IssueQueryDTO> findIssueListByTbr(String userCode) {
		if(StringUtils.isEmpty(userCode)){
			throw new BusinessException(BusinessExceptionCode.param_error,"没有找到您的工号信息，请重新登录后重试");
		}
		InType queryParam = createIssueListParam(userCode);
		String outResult = issueSolver.getBpmIssueHandle("函数内统一设定该参数", queryParam);
		if(StringUtils.isEmpty(outResult)){
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"BPM系统没有找到您的问题列表");
		}
		List<IssueQueryDTO> issueList = queryIssueListByOutResult(outResult);
		return issueList;
	}
	/** 
	* @Description: 将ws接口返回值封装成问题列表
	* @author R.Core  
	* @date 2015-3-3 上午11:29:12 
	* @param outResult
	* @return  
	*/ 
	private List<IssueQueryDTO> queryIssueListByOutResult(String outResult) {
		List<Map<String, String>> resultMapList = queryWsOutResult(outResult,new IssueQueryDTO());
		List<IssueQueryDTO> issueList = new ArrayList<IssueQueryDTO>();
		for (Map<String, String> rowMap : resultMapList) {
			IssueQueryDTO issueQuery = addIssueRowMapToDomain(rowMap);
			issueList.add(issueQuery);
		}
		return issueList;
	}

	/** 
	* @Description: 将返回值封装的map填到对象中
	* @author R.Core  
	* @date 2015-3-3 上午11:45:43 
	* @param rowMap
	* @return  
	*/ 
	private IssueQueryDTO addIssueRowMapToDomain(Map<String, String> rowMap) {
		IssueQueryDTO issueQueryDTO = new IssueQueryDTO();
		// make sure of the fields something like bindId taskId  ,ok now 2015-3-17 09:50:03
		issueQueryDTO.setRn(rowMap.get("RN"));
		issueQueryDTO.setBindId(rowMap.get("BINDID"));
		issueQueryDTO.setTaskId(rowMap.get("TASKID"));
		issueQueryDTO.setTbrbh(rowMap.get("TBRBH"));
		issueQueryDTO.setTbr(rowMap.get("TBR"));
		
		String tbsj = rowMap.get("TBSJ");
		if(!StringUtils.isEmpty(tbsj)){
			tbsj = IsalesDateUtil.toFormatString(IsalesDateUtil.formateToDate(tbsj.replaceAll("T", " "),DateFormatStrEnum.y_M_d_H_m_s.getFormatStr()),DateFormatStrEnum.y_M_d_divisor.getFormatStr());
		}
		issueQueryDTO.setTbsj(tbsj);
		issueQueryDTO.setWtbt(rowMap.get("WTBT"));
		issueQueryDTO.setWtsm(rowMap.get("WTSM"));
		issueQueryDTO.setTarget(rowMap.get("TARGET"));
		issueQueryDTO.setUserName(rowMap.get("USERNAME"));
		
		issueQueryDTO.setIsEnd(rowMap.get("ISEND"));//	ISEND	是否结束
		issueQueryDTO.setGm(rowMap.get("GM"));//GM	工贸
		issueQueryDTO.setMd(rowMap.get("MD"));//	MD	门店
		issueQueryDTO.setCpz(rowMap.get("CPZ"));//CPZ	产品组
		issueQueryDTO.setXsqd(rowMap.get("XSQD"));//XSQD               	渠道
		
		issueQueryDTO.setBeginTime(rowMap.get("BEGINTIME"));//	BEGINTIME	处理开始时间
		issueQueryDTO.setEndTime(rowMap.get("ENDTIME"));//ENDTIME	处理结束时间
		return issueQueryDTO;
	}

	
	/** 
	* @Description: 封装查询问题列表查询数据 
	* @author R.Core  
	* @date 2015-3-3 下午5:47:06 
	* @param userCode
	* @return  
	*/ 
	public InType createIssueListParam(String userCode){
		InType in = new InType();
		StringBuffer strBuf = new StringBuffer();
		//isEnd value of ISEND is not sure  ,ok now 2015-3-17 09:51:20
		strBuf.append(" where TBRBH = '").append(userCode).append("' order by ISEND ASC, TBSJ DESC ");
		in.setConditionSql(strBuf.toString());
		in.setCurrentPage("1");
		in.setDataSource("jdbc/AWS_AWS_eaiuser_DB");
		in.setDepartment("BPM");
		in.setTableName("aws5_user.VIEW_ZXYAPP_ALL");
		return in;
	}
	/**
	* <p>Description:查询问题详情 </p> 
	* @author R.Core 
	* @date 2015-3-3 下午12:52:14 
	* @param userCode
	* @return 
	* @see com.haier.isales.app.service.FeedbackService#findIssueDetail(java.lang.String) 
	*/ 
	@Override
	public List<IssueDetailDTO> findIssueDetail(Integer processInstanceId) {
		if(processInstanceId == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"没有获取到问题所属流程信息");
		}
		InType queryParam = createIssueDetailParam(processInstanceId);
		String outResult = issueSolver.getBpmIssueHandle("函数内统一设定该参数", queryParam);
		if(StringUtils.isEmpty(outResult)){
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"BPM系统没有找到您的问题信息");
		}
		List<Map<String, String>> outResultMapList = queryWsOutResult(outResult,new IssueDetailDTO());
		List<IssueDetailDTO> detailList = new ArrayList<IssueDetailDTO>();
		for (Map<String, String> map : outResultMapList) {
			IssueDetailDTO issueDetailDTO  = getIssueDetailFromMap(map);
			detailList.add(issueDetailDTO);
		}
		return detailList;
	}
	/** 
	* @Description: 封装返回的问题详细信息 
	* @author R.Core  
	* @date 2015-3-13 下午4:46:05 
	* @param rowMap
	* @return  
	*/ 
	private IssueDetailDTO getIssueDetailFromMap(Map<String, String> rowMap) {
		IssueDetailDTO issueDetailDTO = new IssueDetailDTO();
		issueDetailDTO.setRn(rowMap.get("RN"));
		issueDetailDTO.setBindId(rowMap.get("BINDID"));
		issueDetailDTO.setTaskId(rowMap.get("TASKID"));
		issueDetailDTO.setTbrbh(rowMap.get("TBRBH"));
		issueDetailDTO.setTbr(rowMap.get("TBR"));
		
		issueDetailDTO.setTbsj(rowMap.get("TBSJ"));
		issueDetailDTO.setWtbt(rowMap.get("WTBT"));
		issueDetailDTO.setWtsm(rowMap.get("WTSM"));
		issueDetailDTO.setTarget(rowMap.get("TARGET"));
		issueDetailDTO.setJc(rowMap.get("JC"));
		
		issueDetailDTO.setGm(rowMap.get("GM"));//GM	工贸
		issueDetailDTO.setCldz(rowMap.get("CLDZ"));
		issueDetailDTO.setWtdlmc(rowMap.get("WTDLMC"));
		issueDetailDTO.setJdnr(rowMap.get("JDNR"));
		issueDetailDTO.setClsj(rowMap.get("CLSJ"));
		issueDetailDTO.setClr(rowMap.get("CLR"));
		return issueDetailDTO;
	}

	/** 
	* @Description: 查询问题回复追问信息接口参数
	* @author R.Core  
	* @date 2015-3-13 下午4:19:39 
	* @param userCode
	* @return  
	*/ 
	public InType createIssueDetailParam(int processInstanceId){
		InType in = new InType();
		StringBuffer strBuf = new StringBuffer();
		//answer and appendAsk belonging
		strBuf.append(" where BINDID = '").append(processInstanceId).append("' order by CLSJ DESC ");
		in.setConditionSql(strBuf.toString());
		in.setCurrentPage("1");
		in.setDataSource("jdbc/AWS_AWS_eaiuser_DB");
		in.setDepartment("BPM");
		in.setTableName("aws5_user.VIEW_ZXYAPP_HD");
		return in;
	}
	/** 
	* @Description: 解析eai commonInterface 接口返回参数到map里 
	* @author R.Core  
	* @date 2015-3-13 下午4:20:45 
	* @param outResult
	* @return  
	*/ 
	private List<Map<String,String>> queryWsOutResult(String outResult,Object obj) {
		Document doc;
		try {
			doc = DocumentHelper.parseText(outResult);
		} catch (DocumentException e) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"BPM系统没有返回指定信息",e);
		}
		Element rootElement = doc.getRootElement();
		List<Element> selectNodes = rootElement.selectNodes("ROWSET/row");
		List<Map<String,String>> mapList = new ArrayList<Map<String,String>>();
		for (Element element : selectNodes) {
			Map<String,String> rowMap = new HashMap<String, String>();
			List<String> fieldNames = JavaToolsUtil.getFieldName(obj);
			for (String fieldName : fieldNames) {
				Node singleNode;
				try {
					singleNode = element.selectSingleNode(fieldName.toUpperCase());
				} catch (Exception e) {
					continue;
				}
				if(singleNode == null){
					continue;
				}
				rowMap.put(fieldName.toUpperCase(), singleNode.getText());
			}
			mapList.add(rowMap);
		}
		return mapList;
	}
	
	/**
	* <p>Description: 问题追问</p> 
	* @author R.Core 
	* @date 2015-3-3 下午1:50:47 
	* @param issueQueryDTO
	* @return 
	* @see com.haier.isales.app.service.FeedbackService#addIssueAsking(com.haier.isales.app.dto.IssueQueryDTO) 
	*/ 
	@Override
	public String addIssueAsking(IssueQueryDTO issueQueryDTO,IssueAppendDTO issueAppendDTO) {
		CheckParamUtil.checkFieldIfNotBlank(issueAppendDTO, "clr","clrbh","jdnr");
		CheckParamUtil.checkFieldIfNotBlank(issueQueryDTO, "tbrbh","bindId");
		issueAppendDTO.setCldz("追问");//固定值 
		issueAppendDTO.setClsj(IsalesDateUtil.toFormatString(new Date(), DateFormatStrEnum.y_M_d.getFormatStr()));
		//封装提报问题的数据
		Map<String, Object> map = JavaToolsUtil.getUpperFieldTrueValues(issueAppendDTO);
		JSONObject fromObject = JSONObject.fromObject(map);
		//调用ws接口添加追问
		IssueQueryDTO issue = updateBoIssueAppending(fromObject,issueQueryDTO);
		return issue.getRn();
	}
	/** 
	 * @Description:调用ws接口添加追问
	 * @author R.Core  
	 * @date 2015-3-3 下午5:35:50 
	 * @param fromObject
	 * @param issueQueryDTO
	 * @return  
	 */ 
	private IssueQueryDTO updateBoIssueAppending(JSONObject fromObject,IssueQueryDTO issueQueryDTO) {
		int issueId = 0;
		try {
			issueId = boService.createBOData(TABLE_APPEND_ISSUE,fromObject.toString(), (int)Math.abs(Double.valueOf(issueQueryDTO.getBindId())), ADMIN_CREATE);
		} catch (com.haier.isales.ws.eai.client.boservice.WSDKException wSDKException) {
			throw new SystemException(BusinessExceptionCode.ws_result_error,"BPM系统提交追问失败,请联系管理员", wSDKException);
		} catch (Exception e) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"BPM系统提交追问失败，请稍后重试!", e);
		}
		if(issueId == 0){
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"BPM系统提交追问失败");
		}
		issueQueryDTO.setRn(issueId+"");//暂存问题号
		return issueQueryDTO;
	}
	/** 
	* @Description: 关闭流程
	* @author R.Core  
	* @date 2015-3-3 下午2:38:16 
	* @param issueQueryDTO
	* @return  
	*/ 
	@Override
	public String update2CloseBpmProgress(IssueQueryDTO issueQueryDTO) {
		CheckParamUtil.checkFieldIfNotBlank(issueQueryDTO, "tbrbh","bindId","taskId");
		try {
			workflowService.closeProcessInstance(ADMIN_CREATE, (int)Math.abs(Double.valueOf(issueQueryDTO.getBindId().trim())), (int)Math.abs(Double.valueOf(issueQueryDTO.getTaskId().trim())));
		} catch (WSDKException wSDKException) {
			throw new SystemException(BusinessExceptionCode.ws_result_error,"BPM系统关闭流程失败,请联系管理员", wSDKException);
		} catch (Exception e) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"BPM系统关闭流程失败，请检查填写信息或稍后重试!", e);
		}
		return "关闭问题成功";
	}
	
	
	/* ====================getter and setter ================= */

	/**
	 * @Description: 属性feedbackDao 的set方法
	 */
	public void setFeedbackDao(FeedbackDAO feedbackDao) {
		this.feedbackDao = feedbackDao;
	}

	public void setWorkflowTaskService(WorkflowTask workflowTaskService) {
		this.workflowTaskService = workflowTaskService;
	}

	public void setWorkflowService(Workflow workflowService) {
		this.workflowService = workflowService;
	}

	public void setBoService(BO boService) {
		this.boService = boService;
	}

	/**
	 * @Description: 属性 issueSolver 的set方法 
	 * @param issueSolver 
	 */
	public void setIssueSolver(IssueSolver issueSolver) {
		this.issueSolver = issueSolver;
	}




	
}
