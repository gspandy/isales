/**
 * @Company 青鸟软通   
 * @Title: EvalScoreClient.java 
 * @Package com.haier.isales.evaluate.service 
 * @author lizhenwei
 * @date 2015-12-29 下午4:59:32 
 * @version V1.0   
 */
package com.haier.isales.evaluate.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.evaluate.dto.EvalScoreDTO;

/**
 * @ClassName: EvalScoreClient
 * @Description: 获取用户评价信息接口
 * 
 */
public interface EvalScoreClient {

	/**
	 * 
	* @Title: findUserEvalContent
	* @Description: 通过条件查询直销员评价题目
	* @return  
	* @throws
	 */
	@Export(paramNames = {"evalScoreDTO"})
	public Object findUserEvalContent(EvalScoreDTO evalScoreDTO);
	
	/**
	 * 
	* @Title: findUserEvalScore
	* @Description: 通过条件查询直销员评价分数
	* @return  
	* @throws
	 */
	@Export(paramNames = {"evalScoreDTO"})
	public Object findUserEvalScore(EvalScoreDTO evalScoreDTO);
	
	/**
	 * 
	* @Title: saveEvalScore
	* @Description: 添加直销员评价分数
	* @return  
	* @throws
	 */
	@Export(paramNames = {"userCode", "uecSeqs", "scores"})
	public Object saveEvalScore(String userCode, String[] uecSeqs, String[] scores);
	
}
