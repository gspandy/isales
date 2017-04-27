/**
 * @Company 青鸟软通   
 * @Title: UserTokenClient.java 
 * @Package com.haier.isales.app.service 
 * @author lizhenwei
 * @date 2015-12-29 下午4:59:32 
 * @version V1.0   
 */
package com.haier.isales.app.service;

import com.haier.isales.app.dto.SurveyQuestionDTO;

import io.terminus.pampas.client.Export;

/**
 * @ClassName: SurveyQuestionClient
 * @Description: 获取调查问卷接口
 * 
 */
public interface SurveyQuestionClient {

	/**
	 * 
	* @Title: saveSurveyQuestion
	* @Description: 交互宝推送调查问卷接口
	* @return  
	* @throws
	 */
	@Export(paramNames = {"surveyDTO"})
	public Object saveSurveyQuestion(SurveyQuestionDTO surveyDTO);
	
	/**
	 * 
	* @Title: findSurveyQuestion
	* @Description: 通过工号查询用户调查问卷列表
	* @return  
	* @throws
	 */
	@Export(paramNames = {"surveyDTO"})
	public Object findSurveyQuestion(SurveyQuestionDTO surveyDTO);
	
	/**
	 * 
	* @Title: updateSurveyQuestion
	* @Description: 交互宝更新调查问卷状态
	* @return  
	* @throws
	 */
	@Export(paramNames = {"surveyDTO"})
	public Object updateSurveyQuestion(SurveyQuestionDTO surveyDTO);
	
}
