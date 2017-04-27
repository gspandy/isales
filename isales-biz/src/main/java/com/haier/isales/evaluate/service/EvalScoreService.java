/**
 * @Company 青鸟软通   
 * @Title: EvalScoreService.java 
 * @Package  com.haier.isales.evaluate.service
 * @author lizhenwei   
 * @date 2016年04月27日  10:21:52
 * @version V1.0   
 */
package com.haier.isales.evaluate.service;

import java.util.List;

import com.haier.isales.evaluate.domain.EvalContentDomain;
import com.haier.isales.evaluate.dto.EvalScoreDTO;

/** 
 * @ClassName: EvalScoreService
 * @Description: EvalScore的Service接口定义类
 *  
 */
public interface EvalScoreService {

	// 保存用户评价信息
	public void saveUserEvalInfo(EvalScoreDTO dto);
	
	// 查询直销员评价分数
	public List<EvalScoreDTO> findEvalScoreByUser(EvalScoreDTO dto);
	
	// 显示评价题目
	public List<EvalScoreDTO> findEvalContent(EvalScoreDTO dto);
}
