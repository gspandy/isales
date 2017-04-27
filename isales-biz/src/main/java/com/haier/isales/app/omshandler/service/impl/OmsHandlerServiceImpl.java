/**
 * @Company 青鸟软通   
 * @Title: OmsHandlerService.java 
 * @Package  com.haier.isales.app.omshandler.service.impl
 * @author Guo Yuchao   
 * @date 2015年02月05日  19:27:17
 * @version V1.0   
 */
package com.haier.isales.app.omshandler.service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bana.common.util.basic.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.app.domain.BpmIssueTypeConstant.BpmDefaultIssueHandlerEnum;
import com.haier.isales.app.dto.BpmIssueSearchDTO;
import com.haier.isales.app.dto.OmsHandlerDTO;
import com.haier.isales.app.omshandler.dao.OmsHandlerDAO;
import com.haier.isales.app.omshandler.domain.IssueHandlerDomainDtoUtil;
import com.haier.isales.app.omshandler.domain.OmsHandlerDomain;
import com.haier.isales.app.omshandler.service.OmsHandlerService;
import com.haier.isales.common.DictionaryCache;
import com.haier.isales.common.JavaToolsUtil;
import com.haier.isales.common.IsalesConstants.DictionaryType;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.ws.eai.client.issuesolver.InType;
import com.haier.isales.ws.eai.client.issuesolver.IssueSolver;
import com.haier.isales.ws.eai.client.issuesolver.dto.RowInfo;
import com.haier.openplatform.showcase.util.Env;

/** 
 * @ClassName: OmsHandlerService
 * @Description: OmsHandler的Service接口定义类
 *  
 */
public class OmsHandlerServiceImpl implements OmsHandlerService{

	private static final Logger LOG = LoggerFactory.getLogger(OmsHandlerServiceImpl.class);
	private static final String EAI_ISSUE_SOLVER = Env.getProperty(Env.EAI_ISSUE_SOLVER);
	/** 
	* @Fields omsHandlerDao : OmsHandlerDao 工具依赖 
	*/
	private OmsHandlerDAO omsHandlerDao;
	private IssueSolver issueSolver;
	
	
	/*===============业务方法=============*/
	/** 
	* @Description: 查询OMS系统视图的参数封装
	* @author Guo Yuchao   
	* @date 2015-2-5 下午8:42:00 
	* @param tradeCode
	* @return  
	*/ 
	public InType createBpmIssueHandlerParam(String tradeCode){
		InType in = new InType();
		StringBuffer strBuf = new StringBuffer();
		strBuf.append(" where TRADECODE='").append(tradeCode).append("' and CODE12!='-' and rownum=1 ");
		in.setConditionSql(strBuf.toString());
		in.setCurrentPage("1");
		in.setDataSource("jdbc/AWS_AWS_eaiuser_DB");
		in.setDepartment("BPM");
		in.setTableName("aws5_user.BO_OMS_EXE_SYNC");
		return in;
	}
	
	/**
	* <p>Description: 根据中心编号查询OMS系统问题处理人</p> 
	* @author Guo Yuchao   
	* @date 2015-2-5 下午8:48:11 
	* @param tradeCode
	* @return 
	* @see com.haier.isales.app.omshandler.service.OmsHandlerService#findOmsHandlerInBpm(java.lang.String) 
	*/ 
	@Override
	public List<OmsHandlerDomain> findOmsHandlerInBpm(String tradeCode) {
		InType queryParam = createBpmIssueHandlerParam(tradeCode);
		String bpmIssueHandle;
		try {
			bpmIssueHandle = issueSolver.getBpmIssueHandle(EAI_ISSUE_SOLVER, queryParam);
		} catch (Exception e) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"调用BPM系统查询OMS一级问题处理人接口出错",e);
		}
		if(StringUtils.isEmpty(bpmIssueHandle)){
			LOG.error(tradeCode+"中心在OMS系统没有找到一级处理人");
			return null;
		}
		Document doc;
		try {
			doc = DocumentHelper.parseText(bpmIssueHandle);
		} catch (DocumentException e) {
			LOG.error(tradeCode+"中心在OMS系统查询一级问题处理人返回信息解析出错："+bpmIssueHandle);
			return null;
		}
		Element rootElement = doc.getRootElement();
		List<Element> selectNodes = rootElement.selectNodes("ROWSET/row");
		List<OmsHandlerDomain> omsHandlerList = new ArrayList<OmsHandlerDomain>();
		for (Element element : selectNodes) {
			Map<String,String> rowMap = new HashMap<String, String>();
			List<String> fieldNames = JavaToolsUtil.getFieldName(new RowInfo());
			for (String fieldName : fieldNames) {
				Node singleNode = element.selectSingleNode(fieldName.toUpperCase());
				if(singleNode == null){
					continue;
				}
				rowMap.put(fieldName.toUpperCase(), singleNode.getText());
			}
			//通过rowMap封装Oms问题处理人list
			List<OmsHandlerDomain> omsHandlerRowList = getOmsHandlerDomainListByRowMap(rowMap);
			omsHandlerList.addAll(omsHandlerRowList);
		}
		return omsHandlerList;
	}
	
	
	
	
	/** 
	* @Description: 通过rowMap封装Oms问题处理人list
	* @author Guo Yuchao   
	* @date 2015-2-5 下午9:06:45 
	* @param rowMap  
	*/ 
	private List<OmsHandlerDomain> getOmsHandlerDomainListByRowMap(Map<String, String> rowMap) {
		List<OmsHandlerDomain> omsHandlerList = new ArrayList<OmsHandlerDomain>();
		OmsHandlerDomain omsHandlerDomain = new OmsHandlerDomain();
		omsHandlerDomain.setRn(rowMap.get("RN"));
		omsHandlerDomain.setRowId(rowMap.get("ID"));
		omsHandlerDomain.setOrgNo(rowMap.get("ORGNO"));
		omsHandlerDomain.setBindId(rowMap.get("BINDID"));
		omsHandlerDomain.setCreateDate(rowMap.get("CREATEDATE"));
		
		omsHandlerDomain.setCreateUser(rowMap.get("CREATEUSER"));
		omsHandlerDomain.setUpdateDate(rowMap.get("UPDATEDATE"));
		omsHandlerDomain.setUpdateUser(rowMap.get("UPDATEUSER"));
		omsHandlerDomain.setWorkFlowId(rowMap.get("WORKFLOWID"));
		omsHandlerDomain.setWorkFlowStepId(rowMap.get("WORKFLOWSTEPID"));
		
		omsHandlerDomain.setIsEnd(rowMap.get("ISEND"));
		omsHandlerDomain.setTradeCode(rowMap.get("TRADECODE"));
		omsHandlerDomain.setTradeName(rowMap.get("TRADENAME"));
		omsHandlerDomain.setBuCode(rowMap.get("BUCODE"));
		omsHandlerDomain.setBuName(rowMap.get("BUNAME"));
		
		omsHandlerDomain.setLineCode(rowMap.get("LINECODE"));
		omsHandlerDomain.setLineName(rowMap.get("LINENAME"));
		
		for(int i=1;i<=20;i++){
			if(StringUtils.isEmpty(rowMap.get("CODE"+i).replaceAll("\\s", ""))
					|| "-".equals(rowMap.get("CODE"+i).replaceAll("\\s", ""))
					){
				continue;
			}
			omsHandlerDomain.setUserCode(rowMap.get("CODE"+i));
			omsHandlerDomain.setUserName(rowMap.get("NAME"+i));
			omsHandlerDomain.setRemark("CODE"+i);
			//保存到本系统 
			omsHandlerDao.save(omsHandlerDomain);
			omsHandlerList.add(omsHandlerDomain);
		}
		return omsHandlerList;
	}
	/**
	* <p>Description:保存OMS系统问题处理人信息到本系统中 </p> 
	* @author Guo Yuchao   
	* @date 2015-2-5 下午9:31:12  
	* @see com.haier.isales.app.omshandler.service.OmsHandlerService#saveOmsHandlerTemp() 
	*/ 
	@Override
	public void saveOmsHandlerTemp() {
		omsHandlerDao.deleteAllRows();
		List<String> tradeCodeList = omsHandlerDao.findTradeCodeList();
		List<OmsHandlerDomain> omsHandlerList = new ArrayList<OmsHandlerDomain>();
		for (String tradeCode : tradeCodeList) {
			List<OmsHandlerDomain> omsHandlerSinList = findOmsHandlerInBpm(tradeCode);
			if(omsHandlerSinList == null){
				continue;
			}
			omsHandlerList.addAll(omsHandlerSinList);
		}
		
//		omsHandlerDao.saveAfterDeleteOmsHandlerTemp(omsHandlerList);
	}
	/**
	* <p>Description:查询一级处理人 </p> 
	* @author Guo Yuchao   
	* @date 2015-2-5 下午10:53:09 
	* @param orgCode
	* @return 
	* @see com.haier.isales.app.omshandler.service.OmsHandlerService#findBpmIssueHandlerLocal(java.lang.String) 
	*/ 
	@Override
	public List<OmsHandlerDTO> findBpmIssueHandlerLocal(BpmIssueSearchDTO bpmIssueSearchDTO) {
		List<OmsHandlerDTO> dtoList = new ArrayList<OmsHandlerDTO>();
		if(StringUtils.isEmpty(bpmIssueSearchDTO.getOrgCode())&&StringUtils.isEmpty(bpmIssueSearchDTO.getShopCode())){
			String userCode = getDefaultHandler();
			OmsHandlerDTO issueHandlerDTO = new OmsHandlerDTO();
			issueHandlerDTO.setUserCode(userCode);
			issueHandlerDTO.setUserName("i营销系统管理员");
			dtoList.add(issueHandlerDTO);
			return dtoList;
		}
		List<OmsHandlerDomain> domainList = new ArrayList<OmsHandlerDomain>();
		if(!StringUtils.isEmpty(bpmIssueSearchDTO.getShopCode())){
			BpmIssueSearchDTO shopSearchModel = new BpmIssueSearchDTO();
			shopSearchModel.setShopCode(bpmIssueSearchDTO.getShopCode());
			domainList = omsHandlerDao.findByTradeCode(shopSearchModel);
			if(domainList == null || domainList.isEmpty()){
				bpmIssueSearchDTO.setShopCode(null);
				domainList = omsHandlerDao.findByTradeCode(bpmIssueSearchDTO);
			}
		}else{
			domainList = omsHandlerDao.findByTradeCode(bpmIssueSearchDTO);
		}
		for (OmsHandlerDomain omsHandlerDomain : domainList) {
			OmsHandlerDTO issueHandlerDTO = IssueHandlerDomainDtoUtil.cloneIssueHandlerDomain2DTO(omsHandlerDomain);
			dtoList.add(issueHandlerDTO);
		}
		return dtoList;
	}
	
	
	/** 
	* @Description:查询默认处理人
	* @author Guo Yuchao   
	* @date 2015-2-6 上午9:13:30 
	* @return  
	*/ 
	private String getDefaultHandler() {
		//暂时取数据字典 处理人默认为A0008379
		String firstHandler = DictionaryCache.getInstance().getValueByTypeAndId(
				DictionaryType.bpm_default_issue_handler.getTypeId(), 
				BpmDefaultIssueHandlerEnum.本系统默认处理人.getBusinId());
		if(StringUtils.isEmpty(firstHandler)){
			firstHandler = DictionaryCache.getInstance().getValueByTypeAndId(
					DictionaryType.bpm_default_issue_handler.getTypeId(), 
					BpmDefaultIssueHandlerEnum.找不到处理人.getBusinId());
		}
		if(StringUtils.isEmpty(firstHandler)){
			firstHandler = BpmDefaultIssueHandlerEnum.找不到处理人.getBusinName();
		}
		return firstHandler;
	}
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性omsHandlerDao 的set方法 
	 */
	public void setOmsHandlerDao(OmsHandlerDAO omsHandlerDao){
		this.omsHandlerDao = omsHandlerDao;
	}



	public void setIssueSolver(IssueSolver issueSolver) {
		this.issueSolver = issueSolver;
	}






	
}
