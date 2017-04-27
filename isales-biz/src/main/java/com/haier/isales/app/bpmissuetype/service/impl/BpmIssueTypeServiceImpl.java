/**
 * @Company 青鸟软通   
 * @Title: BpmIssueTypeService.java 
 * @Package  com.haier.isales.app.bpmissuetype.service.impl
 * @author Guo Yuchao   
 * @date 2015年01月28日  21:30:01
 * @version V1.0   
 */
package com.haier.isales.app.bpmissuetype.service.impl;


import java.util.List;

import com.haier.isales.app.bpmissuetype.dao.BpmIssueTypeDAO;
import com.haier.isales.app.bpmissuetype.domain.BpmIssueTypeDomain;
import com.haier.isales.app.bpmissuetype.domain.BpmIssueTypeEnum;
import com.haier.isales.app.bpmissuetype.service.BpmIssueTypeService;
import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;

/** 
 * @ClassName: BpmIssueTypeService
 * @Description: BpmIssueType的Service接口定义类
 *  
 */
public class BpmIssueTypeServiceImpl implements BpmIssueTypeService{

//	private static final Logger LOG = LoggerFactory.getLogger(BpmIssueTypeServiceImpl.class);
	
	/** 
	* @Fields bpmIssueTypeDao : BpmIssueTypeDao 工具依赖 
	*/
	private BpmIssueTypeDAO bpmIssueTypeDao;
	
	
	/*===============业务方法=============*/
	/**
	 * <p>Description: 根据参数查询BPM问题类型列表  参数  
	*  highClass:问题大类        
	*  smallClass : 问题小类
	*  proLine : 产品组
	*  buCode : BU</p> 
	 * @author Guo Yuchao   
	 * @date 2015-1-28 下午10:10:48 
	 * @param bpmIssueTypeDomain
	 * @return 
	 * @see com.haier.isales.app.bpmissuetype.service.BpmIssueTypeService#findBpmIssueType(com.haier.isales.app.bpmissuetype.domain.BpmIssueTypeDomain) 
	 */ 
	@Override
	public List<String> findBpmIssueType(BpmIssueTypeDomain bpmIssueTypeDomain) {
		CheckParamUtil.checkFieldIfNotBlank(bpmIssueTypeDomain, "issueTypeKey");
		switch (BpmIssueTypeEnum.getByTypeKey(bpmIssueTypeDomain.getIssueTypeKey())) {
		case 问题大类:
			break;
		case 问题小类:
			CheckParamUtil.checkFieldIfNotBlank(bpmIssueTypeDomain, "highClass");
			break;
		case 产品组:
			CheckParamUtil.checkFieldIfNotBlank(bpmIssueTypeDomain, "highClass","smallClass");
			break;
		case bu:
			CheckParamUtil.checkFieldIfNotBlank(bpmIssueTypeDomain, "highClass","smallClass","proLine");
			break;
		case 渠道:
			CheckParamUtil.checkFieldIfNotBlank(bpmIssueTypeDomain, "highClass","smallClass","proLine","buCode");
			break;
		default: 
			throw new BusinessException(BusinessExceptionCode.param_error,"没有找到指定的问题查询类型");
		}
		List<String> targetTypeList = bpmIssueTypeDao.findBpmIssueType(bpmIssueTypeDomain);
		if(targetTypeList == null || targetTypeList.isEmpty()){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到指定的问题类型"+BpmIssueTypeEnum.getByTypeKey(bpmIssueTypeDomain.getIssueTypeKey()).name());
		}
		return targetTypeList;
	}
	
	
	
	
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性bpmIssueTypeDao 的set方法 
	 */
	public void setBpmIssueTypeDao(BpmIssueTypeDAO bpmIssueTypeDao){
		this.bpmIssueTypeDao = bpmIssueTypeDao;
	}


	
}
