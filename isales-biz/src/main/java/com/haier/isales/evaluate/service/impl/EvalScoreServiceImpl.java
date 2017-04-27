/**
 * @Company 青鸟软通   
 * @Title: EvalScoreService.java 
 * @Package  com.haier.isales.evaluate.service.impl
 * @author lizhenwei   
 * @date 2016年04月27日  10:21:52
 * @version V1.0   
 */
package com.haier.isales.evaluate.service.impl;


import java.util.ArrayList;
import java.util.List;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.evaluate.dao.EvalContentDAO;
import com.haier.isales.evaluate.dao.EvalScoreDAO;
import com.haier.isales.evaluate.domain.EvalContentDomain;
import com.haier.isales.evaluate.domain.EvalScoreDomain;
import com.haier.isales.evaluate.dto.EvalScoreDTO;
import com.haier.isales.evaluate.service.EvalScoreService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: EvalScoreService
 * @Description: EvalScore的Service接口定义类
 *  
 */
public class EvalScoreServiceImpl implements EvalScoreService{

	private static final Logger LOG = LoggerFactory.getLogger(EvalScoreServiceImpl.class);
	
	/** 
	* @Fields evalScoreDao : EvalScoreDao 工具依赖 
	*/
	private EvalScoreDAO evalScoreDao;
	
	private EvalContentDAO evalContentDao;
	
	/*===============业务方法=============*/

	/* 保存用户评价信息
	 * @see com.haier.isales.evaluate.service.EvalScoreService#saveUserEvalInfo(com.haier.isales.evaluate.dto.EvalScoreDTO)
	 */
	@Override
	public void saveUserEvalInfo(EvalScoreDTO dto) {
		LOG.info("进入保存用户评价信息Service方法, EvalScoreDTO：" + dto);
		
		CheckParamUtil.checkFieldIfNotBlank(dto, "uecSeq", "userCode", "score");
		
		EvalScoreDomain entity = ClonePojoUtil.copyClassFromTo(dto, EvalScoreDomain.class);
		
		evalScoreDao.save(entity);
		
	}

	/* 查询直销员评价分数
	 * @see com.haier.isales.evaluate.service.EvalScoreService#findEvalScoreByUser(com.haier.isales.evaluate.dto.EvalScoreDTO)
	 */
	@Override
	public List<EvalScoreDTO> findEvalScoreByUser(EvalScoreDTO dto) {

		LOG.info("进入 查询直销员评价分数Service方法, EvalScoreDTO：" + dto);
		
		CheckParamUtil.checkFieldIfNotBlank(dto, "userCode");
		
		List<EvalScoreDomain> domainList = evalScoreDao.findEvalScoreList(dto);
		
		List<EvalScoreDTO> dtoList = new ArrayList<EvalScoreDTO>();
		
		if (domainList != null) {
			
			for (EvalScoreDomain domain: domainList) {
				
				// 平均分数选择一位小数
				double dAvgSocre = domain.getAvgScore().doubleValue();
				Double avgScore = Double.valueOf(dAvgSocre);
				domain.setAvgScore(avgScore);
				
				EvalScoreDTO evalScore = 
						ClonePojoUtil.copyClassFromTo(domain, EvalScoreDTO.class);
				dtoList.add(evalScore);
			}
		}
		return dtoList;
	}
	

	/* 显示评价题目
	 * @see com.haier.isales.evaluate.service.EvalScoreService#findEvalContent(com.haier.isales.evaluate.dto.EvalScoreDTO)
	 */
	@Override
	public List<EvalScoreDTO> findEvalContent(EvalScoreDTO dto) {
		LOG.info("进入 查询直销员评价题目Service方法, EvalScoreDTO：" + dto);
		
		List<EvalContentDomain> domainList = evalContentDao.findEvalContentList(dto);
		
		List<EvalScoreDTO> dtoList = new ArrayList<EvalScoreDTO>();
		
		if (domainList != null) {
			for (EvalContentDomain domain: domainList) {
				
				EvalScoreDTO evalScore = ClonePojoUtil.copyClassFromTo(domain, EvalScoreDTO.class);
				dtoList.add(evalScore);
			}
		}
		
		return dtoList;
	}
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性evalScoreDao 的set方法 
	 */
	public void setEvalScoreDao(EvalScoreDAO evalScoreDao){
		this.evalScoreDao = evalScoreDao;
	}

	/**
	 * @param evalContentDao the evalContentDao to set
	 */
	public void setEvalContentDao(EvalContentDAO evalContentDao) {
		this.evalContentDao = evalContentDao;
	}

}
