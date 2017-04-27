/**
* @Company 青鸟软通   
* @Title: UserTokenClientImpl.java 
* @Package com.haier.isales.app.service.impl 
* @author lizhenwei
* @date 2015-12-29 下午5:05:45 
* @version V1.0   
*/ 
package com.haier.isales.app.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.haier.isales.app.dto.SurveyQuestionDTO;
import com.haier.isales.app.service.SurveyQuestionClient;
import com.haier.isales.app.service.SurveyQuestionService;

/** 
 * @ClassName: SysUserClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class SurveyQuestionClientImpl implements SurveyQuestionClient {
	
	private static Logger logger = Logger.getLogger(SurveyQuestionClientImpl.class);
	
	private SurveyQuestionService surveyQuestionService;
	
	/* 查询用户通讯录信息
	 * @see com.haier.isales.app.service.SurveyQuestionClient#saveSurveyQuestion(com.haier.isales.app.dto.SurveyQuestionDTO)
	 */
	@Override
	public Object saveSurveyQuestion(SurveyQuestionDTO surveyDTO) {
		logger.info("录入调查问卷信息接口方法， surveyQuestionDTO:" + surveyDTO);
		
		surveyQuestionService.createSurvey(surveyDTO);
		
		logger.info("根据工号查询调查问卷方法结束");
		return null;
	}

	/* 根据工号查询用户调查问卷列表信息
	 * @see com.haier.isales.app.service.SurveyQuestionClient#findSurveyQuestion(com.haier.isales.app.dto.SurveyQuestionDTO)
	 */
	@Override
	public Object findSurveyQuestion(SurveyQuestionDTO surveyQuestionDTO) {
		logger.info("根据工号查询调查问卷接口方法， surveyQuestionDTO:" + surveyQuestionDTO);
		//SysUserDomain domain = ClonePojoUtil.copyClassFromTo(sysUserDTO, SysUserDomain.class);
		
		List<SurveyQuestionDTO> dtoList = surveyQuestionService.findSurveyList(surveyQuestionDTO);
		
		logger.info("根据工号查询调查问卷方法结束");
		return dtoList;
	}

	/* 根据工号、调查问卷ID、调查问卷创建时间更新用户调查问卷状态
	 * @see com.haier.isales.app.service.SurveyQuestionClient#updateSurveyQuestion(com.haier.isales.app.dto.SurveyQuestionDTO)
	 */
	@Override
	public Object updateSurveyQuestion(SurveyQuestionDTO surveyDTO) {
		logger.info("更新调查问卷状态接口方法， surveyDTO:" + surveyDTO);
		
		surveyQuestionService.updateSurvey(surveyDTO);
		
		logger.info("更新调查问卷状态方法结束");
		return null;
	}

	/**
	 * @param surveyQuestionService the surveyQuestionService to set
	 */
	public void setSurveyQuestionService(SurveyQuestionService surveyQuestionService) {
		this.surveyQuestionService = surveyQuestionService;
	}

}
