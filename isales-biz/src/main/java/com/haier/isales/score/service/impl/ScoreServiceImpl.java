/**
 * @Company 青鸟软通   
 * @Title: ScoreService.java 
 * @Package  com.haier.isales.score.service.impl
 * @author Liu Wenjie   
 * @date 2014年11月22日  23:35:53
 * @version V1.0   
 */
package com.haier.isales.score.service.impl;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;

import org.bana.common.util.basic.DateUtil;
import org.bana.common.util.basic.MapRunable;
import org.bana.common.util.basic.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wltea.expression.ExpressionEvaluator;
import org.wltea.expression.datameta.Variable;

import com.haier.isales.common.DictionaryCache;
import com.haier.isales.common.IsalesConstants.DictionaryType;
import com.haier.isales.salerinfo.userdetail.dao.UserDetailDAO;
import com.haier.isales.salerinfo.userdetail.domain.UserDetailDomain;
import com.haier.isales.score.dao.DivisorDAO;
import com.haier.isales.score.dao.LevelRuleDAO;
import com.haier.isales.score.dao.LevelupDetailDAO;
import com.haier.isales.score.dao.ScoreDetailDAO;
import com.haier.isales.score.dao.ScoreRuleDAO;
import com.haier.isales.score.domain.DivisorDomain;
import com.haier.isales.score.domain.LevelRuleDomain;
import com.haier.isales.score.domain.LevelupDetailDomain;
import com.haier.isales.score.domain.ScoreDetailDomain;
import com.haier.isales.score.domain.ScoreRuleDomain;
import com.haier.isales.score.dto.ScoreDTO;
import com.haier.isales.score.module.ScoreConstants;
import com.haier.isales.score.module.ScoreConstants.Divisor;
import com.haier.isales.score.module.ScoreConstants.ScoreType;
import com.haier.isales.score.module.ScoreModule;
import com.haier.isales.score.service.ScoreService;

/** 
 * @ClassName: ScoreService
 * @Description: Score的Service接口定义类
 *  
 */
public class ScoreServiceImpl implements ScoreService{

	private static final Logger LOG = LoggerFactory.getLogger(ScoreServiceImpl.class);
	// 创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。
	private ExecutorService pool = Executors.newCachedThreadPool();
	
	/** 
	* @Fields scoreDao : ScoreDao 工具依赖 
	*/
	private DivisorDAO divisorDao;
	private ScoreDetailDAO scoreDetailDao;
	private LevelRuleDAO levelRuleDao;
	private ScoreRuleDAO scoreRuleDao;
	private UserDetailDAO userDetailDao;
	private LevelupDetailDAO levelupDetailDao;
	
	private DictionaryCache dictionaryCache = DictionaryCache.getInstance();
	
	/*===============业务方法=============*/
	
	/** 
	* @Description: 根据class名称获取对应的需要获取积分的规则集合
	* @author Liu Wenjie   
	* @date 2014-11-22 下午11:57:59 
	* @param className
	* @return  
	*/ 
	public List<ScoreRuleDomain> findScoreRuleByClass(String dicTypeId){
		String scoreRules = dictionaryCache.getValueByTypeAndId(DictionaryType.class_ref_score_rule.getTypeId(), dicTypeId);
		if(StringUtils.isNotBlank(scoreRules)){
			if(scoreRules.matches("^([0-9\\s]+,)*[0-9\\s]+$")){
				return scoreRuleDao.findByIds(scoreRules);
			}else{
				LOG.warn("指定的规则主键序列字符串 " + scoreRules + " 不符合查询要求，没有获得积分内容");
			}
		}else{
			LOG.warn("针对类型" + dicTypeId + "没有指定对应的积分规则");
		}
		return null;
	}
	
	
	/** 
	* @Description: 根据当前用户和对应的业务逻辑，来决定产生多少积分
	* @author Liu Wenjie   
	* @date 2014-11-23 上午12:28:51 
	* @param className
	* @param operatorId
	* @return  
	*/ 
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public List<ScoreDTO> addScoreUseScoreRule(ScoreModule scoreModule){
		
		// 2014-11-27 将积分操作改为另起线程，以减少前端的接口调用时间
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("scoreModule", scoreModule);
		pool.execute(new MapRunable(map) {
			@Override
			public void run() {
				ScoreModule scoreModule = (ScoreModule) map.get("scoreModule");
				if (checkAddScoreParam(scoreModule)) {
					// 获取对应的class类型的积分规则
					List<ScoreRuleDomain> scoreRuleList = findScoreRuleByClass(scoreModule
							.getScoreType().getDicId());
					if (scoreRuleList != null && !scoreRuleList.isEmpty()) {

						// 获取用户的所有积分因子
						List<DivisorDomain> divisorList = divisorDao
								.findByOperatorId(scoreModule.getOperatorId());
						divisorList = doRequiredThing4divisor(scoreModule,
								divisorList);
						List<Variable> variables = new ArrayList<Variable>();
						if (divisorList != null) {
							for (DivisorDomain divisorDomain : divisorList) {
								variables.add(Variable.createVariable(
										divisorDomain.getDivisorName(), Integer
												.valueOf(divisorDomain
														.getDivisorValue())));
							}
						}
						// 增加自定义的积分银子
						Map<String, Object> extendVariable = scoreModule
								.getExtendVariable();
						if (extendVariable != null) {
							for (Entry<String, Object> entry : extendVariable
									.entrySet()) {
								variables.add(Variable.createVariable(
										entry.getKey(), entry.getValue()));
							}
						}
						// 找到计算公式，计算结果，如果结果大于0，则加入到获得的积分列表中。
						// 并构造增加的积分明细表
						List<ScoreDetailDomain> scoreDetailList = new ArrayList<ScoreDetailDomain>();
						List<ScoreDTO> scoreDtoList = new ArrayList<ScoreDTO>();
						for (ScoreRuleDomain scoreRuleDomain : scoreRuleList) {
							Integer result = (Integer) ExpressionEvaluator
									.evaluate(scoreRuleDomain
											.getScoreExpression(), variables);
							if (result > 0) {
								ScoreDTO scoreDto = new ScoreDTO();
								scoreDto.setScoreValue(result);
								String evaluate = (String) ExpressionEvaluator
										.evaluate(scoreRuleDomain
												.getContentExpression(),
												variables);
								scoreDto.setSocoreDiscription(evaluate);
								scoreDtoList.add(scoreDto);
								// 保存一条积分明细记录
								ScoreDetailDomain scoreDetailDomain = new ScoreDetailDomain();
								// 变量参数
								Map<String, Object> params = new HashMap<String, Object>();
								for (Variable variable : variables) {
									params.put(variable.getVariableName(),
											variable.getDataValue());
								}
								JSON json = JSONSerializer.toJSON(params);
								scoreDetailDomain.setDivisorParams(json
										.toString());
								// 其他固定参数
								scoreDetailDomain.setOperatorId(scoreModule
										.getOperatorId());
								scoreDetailDomain
										.setScoreExpression(scoreRuleDomain
												.getScoreExpression());
								scoreDetailDomain.setScoreValue(Long
										.parseLong(String.valueOf(result)));
								scoreDetailDomain
										.setScoreRuleId(scoreRuleDomain.getId());
								JSON json2 = JSONSerializer.toJSON(scoreModule
										.getTargetId());
								scoreDetailDomain.setScoreSourceIds(json2
										.toString());
								scoreDetailList.add(scoreDetailDomain);
							}
						}
						addUserScoreAndDetail(scoreModule, scoreDetailList);
					}
				}
			}
		});
		
		return new ArrayList<ScoreDTO>();
	}
	
	/** 
	* @Description: 增加用户的积分明细和修改对应的总分内容和等级
	* @author Liu Wenjie   
	* @date 2014-11-24 下午6:08:58 
	* @param scoreModule
	* @param scoreDetailList  
	*/ 
	private void addUserScoreAndDetail(ScoreModule scoreModule,
			List<ScoreDetailDomain> scoreDetailList) {
		//记录用户的增加积分明细
		if(scoreDetailList == null || scoreDetailList.isEmpty()){
			return;
		}
		int score = 0;
		for (ScoreDetailDomain scoreDetailDomain : scoreDetailList) {
			score += scoreDetailDomain.getScoreValue();
			scoreDetailDao.save(scoreDetailDomain);
		}
		if(score == 0){
			return;
		}
		//修改用户对应的积分内容
		UserDetailDomain findById = userDetailDao.findById(scoreModule.getOperatorId());
		if(findById == null){
			LOG.error("按照用户id " + scoreModule.getOperatorId() + " 没有找到用户对应的UserDetail 信息");
			return;
		}
		//可用积分
		Integer availablePoint = findById.getAvailablePoint();
		if(availablePoint == null){
			availablePoint = 0;
		}
		//当前等级累计的积分
		Integer currentLevelPoint = findById.getCurrentLevelPoint();
		if(currentLevelPoint == null){
			currentLevelPoint = 0;
		}
		//积分总额
		Integer point = findById.getPoint();
		if(point == null){
			point = 0;
		}
		//当前等级
		Integer pointLevel = findById.getPointLevel();
		if(pointLevel == null || pointLevel <= 0){
			pointLevel = 1;
		}
		
		LevelRuleDomain levelRule = levelRuleDao.findByCurrentLevel(pointLevel);
		
		if(levelRule == null || StringUtils.isBlank(levelRule.getLevelExpression())){
			LOG.error("当前等级 " + pointLevel + " 没有找到对应的规则 ");
			return ;
		}
		
		String levelExpression = levelRule.getLevelExpression();
		
		//可用积分要增加当前积分
		point += score;
		availablePoint+= score;
		currentLevelPoint += score;
		do{
			List<Variable> variables = new ArrayList<Variable>();
			variables.add(Variable.createVariable("n",pointLevel));
			Integer evaluate = (Integer)ExpressionEvaluator.evaluate(levelExpression,variables);
			if(evaluate <= currentLevelPoint){
				//当前积分可以升级了,同时保存等级升级记录
				LevelupDetailDomain levelupDetailDomain= new LevelupDetailDomain();
				levelupDetailDomain.setOperatorId(scoreModule.getOperatorId());
				levelupDetailDomain.setLevelBefore(pointLevel);
				levelupDetailDomain.setLevelAfter(pointLevel + 1);
				levelupDetailDomain.setOperateTime(new Date());
				levelupDetailDomain.setRemark("用户获得积分，等级升级");
				levelupDetailDao.save(levelupDetailDomain);
				pointLevel++;
				currentLevelPoint = currentLevelPoint - evaluate;
			}else{
				break;
			}
		}while(true);
		findById.setAvailablePoint(availablePoint);
		findById.setPoint(point);
		findById.setPointLevel(pointLevel);
		findById.setCurrentLevelPoint(currentLevelPoint);
		userDetailDao.update(findById);
		
	}


	/** 
	* @Description: 对积分银子做必要的检查，当对应的类型应该有的积分银子不存在时，需要进行对应的增加
	* @author Liu Wenjie   
	 * @param scoreModule 
	 * @param divisorList 
	* @date 2014-11-24 下午12:59:45 
	* @return  
	*/ 
	private List<DivisorDomain> doRequiredThing4divisor(ScoreModule scoreModule, List<DivisorDomain> divisorList) {
		//验证当前类型对应的积分因子是否存在 
		ScoreType scoreType = scoreModule.getScoreType();
		Divisor[] publicDivisors = scoreType.getPublicDivisors();
		if(publicDivisors == null || publicDivisors.length == 0){
			return divisorList;
		}
		if(divisorList == null){
			divisorList = new ArrayList<DivisorDomain>();
		}
		for (Divisor divisor : publicDivisors) {
			DivisorDomain containsDivisor = containsDivisor(divisorList,divisor.getValue());
			//没有找到就新增，找到了就修改
			if(containsDivisor == null){//没有找到，新增
				DivisorDomain divisorNew = new DivisorDomain();
				divisorNew.setOperatorId(scoreModule.getOperatorId());
				divisorNew.setDivisorName(divisor.getValue());
				divisorNew.setDivisorValue("1");
				divisorNew.setUpdateTime(new Date());
				divisorDao.save(divisorNew);
				divisorList.add(divisorNew);
			}else{//找到了，修改
				//连续的类型
				if(ScoreConstants.DIVISOR_TYPE_SERIAL.equals(divisor.getType())){
					if(DateUtil.isYesterday(containsDivisor.getUpdateTime())){
						containsDivisor.setDivisorValue(String.valueOf(Integer.valueOf(containsDivisor.getDivisorValue())+1));
					}else if(DateUtil.isToday(containsDivisor.getUpdateTime())){
						//doNothing
					}else{
						containsDivisor.setDivisorValue("1");
					}
				//每天的类型
				}else if (ScoreConstants.DIVISOR_TYPE_SUM.equals(divisor.getType())){
					containsDivisor.setDivisorValue(String.valueOf(Integer.valueOf(containsDivisor.getDivisorValue())+1));
				}else{
					if(DateUtil.isToday(containsDivisor.getUpdateTime())){
						containsDivisor.setDivisorValue(String.valueOf(Integer.valueOf(containsDivisor.getDivisorValue())+1));
					}else{
						containsDivisor.setDivisorValue("1");
					}
				}
				containsDivisor.setUpdateTime(new Date());
				divisorDao.update(containsDivisor);
			}
		}
		return divisorList;
	}
	/** 
	* @Description: 获取当前等级所需的分数
	* @author Guo Yuchao   
	* @date 2014-11-25 下午8:29:50 
	* @param pointLevel
	* @return  
	*/ 
	@Override
	public Integer getCurrentLevelScore(Integer pointLevel){
		List<Variable> variables = new ArrayList<Variable>();
		variables.add(Variable.createVariable("n",pointLevel));
		LevelRuleDomain levelRule = levelRuleDao.findByCurrentLevel(pointLevel);
		Integer evaluate = (Integer)ExpressionEvaluator.evaluate(levelRule.getLevelExpression(),variables);
		return evaluate;
	}

	/** 
	* @Description: 判断是否包含指定名称的积分因子名称
	* @author Liu Wenjie   
	* @date 2014-11-24 下午3:53:03 
	* @param divisorList
	* @param divisorName
	* @return  
	*/ 
	private DivisorDomain containsDivisor(List<DivisorDomain> divisorList,
			String divisorName) {
		if(divisorList == null || divisorList.isEmpty()){
			return null;
		}
		for (DivisorDomain divisorDomain : divisorList) {
			if(divisorName.equals(divisorDomain.getDivisorName())){
				return divisorDomain;
			}
		}
		return null;
	}


	/** 
	* @Description: 检查进行积分添加的参数是否符合要求
	* @author Liu Wenjie   
	 * @param scoreModule 
	* @date 2014-11-24 下午12:50:04 
	* @return  
	*/ 
	private boolean checkAddScoreParam(ScoreModule scoreModule) {
		if(scoreModule == null){
			LOG.warn("生成积分的参数 scoreModule is null,不产生积分");
		}else if(scoreModule.getOperatorId() == null){
			LOG.warn("生成积分的参数 getOperatorId is null,不产生积分");
			return false;
		}else if(scoreModule.getScoreType() == null){
			LOG.warn("生成积分的参数 getScoreType is null,不产生积分");
			return false;
		}
		return true;
	}


	public static void main(String[] args) {
		List<Variable> variables = new ArrayList<Variable>();
		variables.add(Variable.createVariable("当日登陆次数", Double.valueOf("1.0")));
		Object evaluate = ExpressionEvaluator.evaluate("\"今日首次登陆奖励颗海星星\"");
		LOG.info(evaluate.getClass().toString());
	}
	

	/*====================getter and setter =================*/
	/**
	 * @Description: 属性 scoreDetailDao 的set方法 
	 * @param scoreDetailDao 
	 */
	public void setScoreDetailDao(ScoreDetailDAO scoreDetailDao) {
		this.scoreDetailDao = scoreDetailDao;
	}
	/**
	 * @Description: 属性 divisorDao 的set方法 
	 * @param divisorDao 
	 */
	public void setDivisorDao(DivisorDAO divisorDao) {
		this.divisorDao = divisorDao;
	}
	/**
	 * @Description: 属性 scoreRuleDao 的set方法 
	 * @param scoreRuleDao 
	 */
	public void setScoreRuleDao(ScoreRuleDAO scoreRuleDao) {
		this.scoreRuleDao = scoreRuleDao;
	}
	/**
	 * @Description: 属性 levelRuleDao 的set方法 
	 * @param levelRuleDao 
	 */
	public void setLevelRuleDao(LevelRuleDAO levelRuleDao) {
		this.levelRuleDao = levelRuleDao;
	}


	/**
	 * @Description: 属性 userDetailDao 的set方法 
	 * @param userDetailDao 
	 */
	public void setUserDetailDao(UserDetailDAO userDetailDao) {
		this.userDetailDao = userDetailDao;
	}


	/**
	 * @Description: 属性 levelupDetailDao 的set方法 
	 * @param levelupDetailDao 
	 */
	public void setLevelupDetailDao(LevelupDetailDAO levelupDetailDao) {
		this.levelupDetailDao = levelupDetailDao;
	}
	
	
}
