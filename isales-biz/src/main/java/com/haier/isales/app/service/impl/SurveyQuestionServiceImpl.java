/**
 * @Company 青鸟软通   
 * @Title: SurveyQuestionService.java 
 * @Package  com.haier.isales.app.service.impl
 * @author lizhenwei   
 * @date 2016年04月01日  09:56:17
 * @version V1.0   
 */
package com.haier.isales.app.service.impl;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.haier.isales.app.dao.SurveyQuestionDAO;
import com.haier.isales.app.dao.SurveyUserRefDAO;
import com.haier.isales.app.domain.SurveyQuestionDomain;
import com.haier.isales.app.domain.SurveyUserRefDomain;
import com.haier.isales.app.dto.SurveyQuestionDTO;
import com.haier.isales.app.service.SurveyQuestionService;
import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.common.exception.SystemException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: SurveyQuestionService
 * @Description: SurveyQuestion的Service接口定义类
 *  
 */
public class SurveyQuestionServiceImpl implements SurveyQuestionService{

	private static final Logger LOG = LoggerFactory.getLogger(SurveyQuestionServiceImpl.class);
	
	/** 
	* @Fields surveyQuestionDao : SurveyQuestionDao 工具依赖 
	*/
	private SurveyQuestionDAO surveyQuestionDao;
	private SurveyUserRefDAO surveyUserRefDao;
	
	
	/*===============业务方法=============*/
	/* 创建调查问卷
	 * @see com.haier.isales.app.service.SurveyQuestionService#createSurvey(com.haier.isales.app.dto.SurveyQuestionDTO)
	 */
	
	@Override
	public void createSurvey(SurveyQuestionDTO surveyQuestionDTO) {
		
		LOG.info("进入交互宝向本系统推送调查问卷信息   service方法");
		// 校验必需输入的字段 researchid/title/content/url/usernos
		CheckParamUtil.checkFieldIfNotBlank(surveyQuestionDTO, "researchid",
				"title", "content", "url", "usernos");
		
		SurveyQuestionDomain domain = ClonePojoUtil.copyClassFromTo(surveyQuestionDTO, SurveyQuestionDomain.class);
		surveyQuestionDao.save(domain);
		
		if (surveyQuestionDTO.getUsernos().contains(",")) {
			// 若工号串含有逗号，则说明含有多个工号
			String [] userNos = surveyQuestionDTO.getUsernos().split(",");
			
			for (int i = 0; i < userNos.length; i++) {
				SurveyUserRefDomain refDomain = new SurveyUserRefDomain();
				refDomain.setResearchId(surveyQuestionDTO.getResearchid());
				refDomain.setUserCode(userNos[i]);
				
				surveyUserRefDao.save(refDomain);
			}
		} else {
			// 说明只含有一个工号
			SurveyUserRefDomain refDomain = new SurveyUserRefDomain();
			refDomain.setResearchId(surveyQuestionDTO.getResearchid());
			refDomain.setUserCode(surveyQuestionDTO.getUsernos());
			
			surveyUserRefDao.save(refDomain);
			
		}
		LOG.info("交互宝向本系统推送调查问卷信息service方法结束");
		
	}

	/* 根据工号查询调查问卷列表信息
	 * @see com.haier.isales.app.service.SurveyQuestionService#findSurveyList(com.haier.isales.app.dto.SurveyQuestionDTO)
	 */
	@Override
	public List<SurveyQuestionDTO> findSurveyList(SurveyQuestionDTO queryDTO) {
		
		CheckParamUtil.checkFieldIfNotBlank(queryDTO, "userCode");
		
		List<SurveyQuestionDTO> dtoList = new ArrayList<SurveyQuestionDTO>();
		
		List<SurveyQuestionDomain> domainList = surveyQuestionDao.findSurveyQuestionList(queryDTO);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		for (SurveyQuestionDomain domain: domainList) {
			SurveyQuestionDTO dto = ClonePojoUtil.copyClassFromTo(domain, SurveyQuestionDTO.class);
			// 将Date类型的createTime转换为String类型的strCreateTime
			if (dto.getCreateTime() != null) {
				String strCreateTime = sdf.format(dto.getCreateTime());
				dto.setStrCreateTime(strCreateTime);
			}
			dtoList.add(dto);
		}
		
		return dtoList;
	}
	
	/* 根据条件更新调查问卷状态
	 * @see com.haier.isales.app.service.SurveyQuestionService#updateSurvey(com.haier.isales.app.dto.SurveyQuestionDTO)
	 */
	@Override
	public void updateSurvey(SurveyQuestionDTO surveyQuestionDTO) {
		LOG.info("进入更新调查问卷状态方法， surveyQuestionDTO = " + surveyQuestionDTO);
		CheckParamUtil.checkFieldIfNotBlank(surveyQuestionDTO, "userCode","researchid","strCreateTime");
		
		//  首先查询调查问卷是否存在
		
		Integer nExist = surveyUserRefDao.findSurveyUserList(surveyQuestionDTO);
		if (nExist == null) {
			throw new SystemException(BusinessExceptionCode.database_none_data,
					"该直销员不存在调查问卷");
		}
		surveyUserRefDao.updateSurveyRefStatus(surveyQuestionDTO);
		LOG.info("更新调查问卷状态结束");
	}
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性surveyQuestionDao 的set方法 
	 */
	public void setSurveyQuestionDao(SurveyQuestionDAO surveyQuestionDao){
		this.surveyQuestionDao = surveyQuestionDao;
	}

	/**
	 * @param surveyUserRefDao the surveyUserRefDao to set
	 */
	public void setSurveyUserRefDao(SurveyUserRefDAO surveyUserRefDao) {
		this.surveyUserRefDao = surveyUserRefDao;
	}

}
