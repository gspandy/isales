/**
 * @Company 青鸟软通   
 * @Title: SurveyQuestionService.java 
 * @Package  com.haier.isales.app.service
 * @author lizhenwei   
 * @date 2016年04月01日  09:56:17
 * @version V1.0   
 */
package com.haier.isales.app.service;

import java.util.List;

import com.haier.isales.app.dto.SurveyQuestionDTO;

/** 
 * @ClassName: SurveyQuestionService
 * @Description: SurveyQuestion的Service接口定义类
 *  
 */
public interface SurveyQuestionService {

	// 添加调查问卷接口
	public void createSurvey(SurveyQuestionDTO surveyQuestionDTO);
	
	// 根据工号查询调查问卷接口
	public List<SurveyQuestionDTO> findSurveyList(SurveyQuestionDTO surveyQuestionDTO);
	
	// 根据条件更新调查问卷状态
	public void updateSurvey(SurveyQuestionDTO surveyQuestionDTO);
}
