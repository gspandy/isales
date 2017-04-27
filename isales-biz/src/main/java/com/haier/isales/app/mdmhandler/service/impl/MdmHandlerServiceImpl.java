/**
 * @Company 青鸟软通   
 * @Title: MdmHandlerService.java 
 * @Package  com.haier.isales.app.mdmhandler.service.impl
 * @author Guo Yuchao   
 * @date 2015年02月06日  11:20:08
 * @version V1.0   
 */
package com.haier.isales.app.mdmhandler.service.impl;


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

import com.haier.isales.app.mdmhandler.dao.MdmHandlerDAO;
import com.haier.isales.app.mdmhandler.domain.MdmHandlerDomain;
import com.haier.isales.app.mdmhandler.service.MdmHandlerService;
import com.haier.isales.common.JavaToolsUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.ws.eai.client.issuesolver.InType;
import com.haier.isales.ws.eai.client.issuesolver.IssueSolver;
import com.haier.isales.ws.eai.client.issuesolver.dto.MdmRowInfo;
import com.haier.openplatform.showcase.util.Env;

/** 
 * @ClassName: MdmHandlerService
 * @Description: MdmHandler的Service接口定义类
 *  
 */
public class MdmHandlerServiceImpl implements MdmHandlerService{
	private static final Logger LOG = LoggerFactory.getLogger(MdmHandlerServiceImpl.class);
	private static final String EAI_ISSUE_SOLVER = Env.getProperty(Env.EAI_ISSUE_SOLVER);
	
	/** 
	* @Fields mdmHandlerDao : MdmHandlerDao 工具依赖 
	*/
	private MdmHandlerDAO mdmHandlerDao;
	private IssueSolver issueSolver;
	
	/*===============业务方法=============*/
	
	/** 
	* @Description: 查询MDM系统视图的参数封装
	* @author Guo Yuchao   
	* @date 2015-2-6 上午11:11:35 
	* @param tradeCode
	* @param shopId
	* @return  
	*/ 
	public InType createBpmMdmIssueHandlerParam(String tradeCode,String shopId){
		InType in = new InType();
		StringBuffer strBuf = new StringBuffer();
		strBuf.append(" where CUSTOMER_NUMBER_SH='").append(shopId).append("' and TRADE_CODE='").append(tradeCode).append("' and rownum=1 ");
		in.setConditionSql(strBuf.toString());
		in.setCurrentPage("1");
		in.setDataSource("jdbc/AWS_AWS_eaiuser_DB");
		in.setDepartment("BPM");
		in.setTableName("aws5_user.VIEW_MDM_BTB");
		return in;
	}
	/**
	* <p>Description: 查询Mdm处理人</p> 
	* @author Guo Yuchao   
	* @date 2015-2-6 上午11:22:36 
	* @param tradeCode
	* @param shopId
	* @return 
	* @see com.haier.isales.app.mdmhandler.service.MdmHandlerService#findMdmHandlerInBpm(java.lang.String, java.lang.String) 
	*/ 
	@Override
	public List<MdmHandlerDomain> findMdmHandlerInBpm(String tradeCode,
			String shopId) {
		InType queryParam = createBpmMdmIssueHandlerParam(tradeCode,shopId);
		String bpmIssueHandle;
		try {
			bpmIssueHandle = issueSolver.getBpmIssueHandle(EAI_ISSUE_SOLVER, queryParam);
		} catch (Exception e) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"调用BPM系统查询MDM一级问题处理人接口出错",e);
		}
		if(StringUtils.isEmpty(bpmIssueHandle)){
			LOG.error(shopId+"门店，"+tradeCode+"中心在MDM系统没有找到一级处理人");
			return null;
		}
		Document doc;
		try {
			doc = DocumentHelper.parseText(bpmIssueHandle);
		} catch (DocumentException e) {
			LOG.error(shopId+"门店，"+tradeCode+"中心在MDM系统查询一级问题处理人返回信息解析出错："+bpmIssueHandle);
			return null;
		}
		Element rootElement = doc.getRootElement();
		List<Element> selectNodes = rootElement.selectNodes("ROWSET/row");
		List<MdmHandlerDomain> mdmHandlerList = new ArrayList<MdmHandlerDomain>();
		for (Element element : selectNodes) {
			Map<String,String> rowMap = new HashMap<String, String>();
			List<String> fieldNames = JavaToolsUtil.getFieldName(new MdmRowInfo());
			for (String fieldName : fieldNames) {
				Node singleNode = element.selectSingleNode(fieldName.toUpperCase());
				if(singleNode == null){
					continue;
				}
				rowMap.put(fieldName.toUpperCase(), singleNode.getText());
			}
			//通过rowMap封装Oms问题处理人list
			List<MdmHandlerDomain> mdmHandlerRowList = getMdmHandlerDomainListByRowMap(rowMap);
			mdmHandlerList.addAll(mdmHandlerRowList);
		}
		return mdmHandlerList;
	}
	@Override
	public void saveMdmHandlerTemp() {
		mdmHandlerDao.deleteAll();
		List<MdmHandlerDomain> tradeCodeList = mdmHandlerDao.findShopTradeCode();
		List<MdmHandlerDomain> mdmHandlerList = new ArrayList<MdmHandlerDomain>();
		for (MdmHandlerDomain mdmHandlerDomain : tradeCodeList) {
			if(mdmHandlerDomain==null ||StringUtils.isEmpty(mdmHandlerDomain.getTradeCode(),mdmHandlerDomain.getCustomerCode())){
				continue;
			}
			List<MdmHandlerDomain> mdmHandlerSinList = findMdmHandlerInBpm(mdmHandlerDomain.getTradeCode(),mdmHandlerDomain.getCustomerCode());
			if(mdmHandlerSinList == null){
				continue;
			}
			mdmHandlerList.addAll(mdmHandlerSinList);
		}
//		mdmHandlerDao.saveAfterDeleteMdmHandlerTemp(mdmHandlerList);
	}
	
	/*====================getter and setter =================*/
	
	/** 
	* @Description: 
	* @author Guo Yuchao   
	* @date 2015-2-6 上午11:35:33 
	* @param rowMap
	* @return  
	*/ 
	private List<MdmHandlerDomain> getMdmHandlerDomainListByRowMap(
			Map<String, String> rowMap) {
		List<MdmHandlerDomain> mdmHandlerList = new ArrayList<MdmHandlerDomain>();
		MdmHandlerDomain mdmHandlerDomain = new MdmHandlerDomain();
		mdmHandlerDomain.setRn(rowMap.get("RN"));
		mdmHandlerDomain.setRowId(rowMap.get("ID"));
		mdmHandlerDomain.setOrgNo(rowMap.get("ORGNO"));
		mdmHandlerDomain.setBindId(rowMap.get("BINDID"));
		mdmHandlerDomain.setCreateDate(rowMap.get("CREATEDATE"));
		
		mdmHandlerDomain.setCreateUser(rowMap.get("CREATEUSER"));
		mdmHandlerDomain.setUpdateDate(rowMap.get("UPDATEDATE"));
		mdmHandlerDomain.setUpdateUser(rowMap.get("UPDATEUSER"));
		mdmHandlerDomain.setWorkFlowId(rowMap.get("WORKFLOWID"));
		mdmHandlerDomain.setWorkFlowStepId(rowMap.get("WORKFLOWSTEPID"));
		
		mdmHandlerDomain.setIsEnd(rowMap.get("ISEND"));
		mdmHandlerDomain.setTradeCode(rowMap.get("TRADE_CODE"));
		mdmHandlerDomain.setTradeName(rowMap.get("TRADE_NAME"));
		mdmHandlerDomain.setCustRowId(rowMap.get("CUST_ROW_ID"));
		mdmHandlerDomain.setCustomerCode(rowMap.get("CUSTOMER_NUMBER"));
		mdmHandlerDomain.setCustomerName1(rowMap.get("CUSTOMER_NAME1"));
		mdmHandlerDomain.setCustomerCategory(rowMap.get("CUSTOMER_CATEGORY"));
		mdmHandlerDomain.setIndustryClass(rowMap.get("INDUSTRY_CLASS"));
		mdmHandlerDomain.setCustomerNumberSh(rowMap.get("CUSTOMER_NUMBER_SH"));
		mdmHandlerDomain.setSubCustomerName1(rowMap.get("SUB_CUSTOMER_NAME1"));
		mdmHandlerDomain.setBranchCompanyCode(rowMap.get("BRANCH_COMPANY_CODE"));
		mdmHandlerDomain.setBranchCompanyName(rowMap.get("BRANCH_COMPANY_NAME"));
		mdmHandlerDomain.setBranchCode(rowMap.get("BRANCH_CODE"));
		mdmHandlerDomain.setFirstAreaCode(rowMap.get("FIRST_AREA_CODE"));
		mdmHandlerDomain.setFirstAreaName(rowMap.get("FIRST_AREA_NAME"));
		mdmHandlerDomain.setSmbManager(rowMap.get("SMB_MANAGER"));
		mdmHandlerDomain.setSmbManagerName(rowMap.get("SMB_MANAGER_NAME"));
		mdmHandlerDomain.setLastUpd(rowMap.get("LAST_UPD"));
		//保存到本系统 
		mdmHandlerDao.save(mdmHandlerDomain);
		mdmHandlerList.add(mdmHandlerDomain);
		return mdmHandlerList;
	}
	/**
	 * @Description: 属性mdmHandlerDao 的set方法 
	 */
	public void setMdmHandlerDao(MdmHandlerDAO mdmHandlerDao){
		this.mdmHandlerDao = mdmHandlerDao;
	}
	public void setIssueSolver(IssueSolver issueSolver) {
		this.issueSolver = issueSolver;
	}




	
}
