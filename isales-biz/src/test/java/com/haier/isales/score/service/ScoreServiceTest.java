/**
* @Company 青鸟软通   
* @Title: ScoreServiceTest.java 
* @Package com.haier.isales.score.service 
* @author Liu Wenjie   
* @date 2014-11-23 下午2:46:16 
* @version V1.0   
*/ 
package com.haier.isales.score.service;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.haier.isales.score.dto.ScoreDTO;
import com.haier.isales.score.module.ScoreConstants.SalesCountDivisor;
import com.haier.isales.score.module.ScoreConstants.ScoreType;
import com.haier.isales.score.module.ScoreModule;

/** 
 * @ClassName: ScoreServiceTest 
 * @Description: 积分服务的service方法
 *  
 */

public class ScoreServiceTest extends BaseScoreTestCase{
	
	@Resource
	private ScoreService scoreService;

	/**
	 * Test method for {@link com.haier.isales.score.service.ScoreService#addScoreUseScoreRule(java.lang.String, java.lang.Long)}.
	 */
	@Test
    public void testAddScoreUseScoreRule() {
		ScoreModule scoreModule = new ScoreModule();
		scoreModule.setOperatorId(1L);
		scoreModule.setScoreType(ScoreType.登录);
		List<ScoreDTO> scoreList = scoreService.addScoreUseScoreRule(scoreModule);
//		System.out.println(scoreList);
		assertNotNull(scoreList);
	}
	
	
	@Test
	//@NotTransactional
	public void testAddScoreUseScoreRule2(){
		ScoreModule scoreModule = new ScoreModule();
		scoreModule.setOperatorId(1L);
		scoreModule.setScoreType(ScoreType.销量);
		Map<String,Object> variableMap = new HashMap<String,Object>();
		variableMap.put(SalesCountDivisor.是否当天销量.getValue(), true);
		scoreModule.setExtendVariable(variableMap);
		List<ScoreDTO> scoreList = scoreService.addScoreUseScoreRule(scoreModule);
//		System.out.println(scoreList);
		assertNotNull(scoreList);
	}

}
