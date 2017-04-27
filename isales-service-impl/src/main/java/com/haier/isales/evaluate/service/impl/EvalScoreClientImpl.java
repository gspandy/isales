/**
* @Company 青鸟软通   
* @Title: UserTokenClientImpl.java 
* @Package com.haier.isales.app.service.impl 
* @author lizhenwei
* @date 2015-12-29 下午5:05:45 
* @version V1.0   
*/ 
package com.haier.isales.evaluate.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.haier.isales.common.StringUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.evaluate.dto.EvalScoreDTO;
import com.haier.isales.evaluate.service.EvalScoreClient;
import com.haier.isales.evaluate.service.EvalScoreService;

/** 
 * @ClassName: SysUserCollectClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class EvalScoreClientImpl implements EvalScoreClient {
	
	private static Logger logger = Logger.getLogger(EvalScoreClientImpl.class);
	
	private EvalScoreService evalScoreService;
	
	/* 查询直销员评价题目
	 * @see com.haier.isales.evaluate.service.EvalScoreClient#findUserEvalScore(com.haier.isales.evaluate.dto.EvalScoreDTO)
	 */
	@Override
	public Object findUserEvalContent(EvalScoreDTO evalScoreDTO) {
		logger.info("查找直销员评价题目方法， EvalScoreDTO:" + evalScoreDTO);
		
		List<EvalScoreDTO> dtoList = evalScoreService.findEvalContent(evalScoreDTO);
		// 保存登陆直销员工号
		dtoList.add(evalScoreDTO);
		
		return dtoList;
	}
	
	/* 查询直销员评价分数
	 * @see com.haier.isales.evaluate.service.EvalScoreClient#findUserEvalScore(com.haier.isales.evaluate.dto.EvalScoreDTO)
	 */
	@Override
	public Object findUserEvalScore(EvalScoreDTO evalScoreDTO) {
		logger.info("查找直销员评价分数方法， EvalScoreDTO:" + evalScoreDTO);
		
		if(evalScoreDTO.getUserCode() == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"直销员工号不能为空！");
		}
		List<EvalScoreDTO> dtoList = evalScoreService.findEvalScoreByUser(evalScoreDTO);
		
		return dtoList;
	}

	/* 添加直销员评价分数
	 * @see com.haier.isales.evaluate.service.EvalScoreClient#saveEvalScore(com.haier.isales.evaluate.dto.EvalScoreDTO)
	 */
	@Override
	public Object saveEvalScore(String userCode, String[] uecSeqs, String[] scores) {
		logger.info("添加直销员评价分数方法，userCode : " + userCode + 
				", uecSeqs:" + uecSeqs + ", scores" + scores);
		
		if(StringUtil.isEmpty(userCode)){
			throw new BusinessException(BusinessExceptionCode.param_error,"直销员工号不能为空！");
		}
		if (uecSeqs.length == 0) {
			throw new BusinessException(BusinessExceptionCode.param_error,"评价题目不能为空！");
		}
		if (scores.length == 0) {
			throw new BusinessException(BusinessExceptionCode.param_error,"评价分数不能为空！");
		}
		
		for (int i=0; i < uecSeqs.length; i++) {
			
			EvalScoreDTO dto = new EvalScoreDTO();
			dto.setUserCode(userCode);
			dto.setUecSeq(Integer.valueOf(uecSeqs[i]));
			dto.setScore(Integer.valueOf(scores[i]));
			
			if (uecSeqs[i] != null && scores[i] != null) {
				evalScoreService.saveUserEvalInfo(dto);
			}
		}
		
		return null;
	}
	
	/**
	 * @param evalScoreService the evalScoreService to set
	 */
	public void setEvalScoreService(EvalScoreService evalScoreService) {
		this.evalScoreService = evalScoreService;
	}

}
