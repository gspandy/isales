/**
 * @Company 青鸟软通   
 * @Title: MomentsService.java 
 * @Package  com.haier.isales.moments.service.impl
 * @author Cao Rui   
 * @date 2014年11月19日  10:46:37
 * @version V1.0   
 */
package com.haier.isales.moments.service.impl;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;

import org.apache.commons.lang.StringUtils;
import org.bana.common.util.basic.BeanToMapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.BusinessUtil;
import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.JsonUtil;
import com.haier.isales.common.JsonUtil.JsonDateValueProcessor;
import com.haier.isales.common.ScoreResult;
import com.haier.isales.common.StringUtil;
import com.haier.isales.common.dao.CommonDAOUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;
import com.haier.isales.moments.constants.MomentsType;
import com.haier.isales.moments.dao.MomentsDAO;
import com.haier.isales.moments.domain.MomentsDomain;
import com.haier.isales.moments.dto.MomentsAddDTO;
import com.haier.isales.moments.service.MomentsService;
import com.haier.isales.prototype.dao.PrototypeAttachmentDAO;
import com.haier.isales.prototype.dao.PrototypeDAO;
import com.haier.isales.prototype.domain.PrototypeDomain;
import com.haier.isales.retail.reportsales.dao.ReportsalesDAO;
import com.haier.isales.retail.reportsales.domain.ReportsalesDomain;
import com.haier.isales.salerinfo.personalshare.dao.PersonalShareDAO;
import com.haier.isales.salerinfo.personalshare.domain.PersonalShareDomain;
import com.haier.isales.score.dto.ScoreDTO;
import com.haier.isales.score.module.ScoreConstants.MomentsDivisor;
import com.haier.isales.score.module.ScoreConstants.ScoreType;
import com.haier.isales.score.module.ScoreModule;
import com.haier.isales.score.service.ScoreService;
import com.haier.isales.system.dto.UserDTO;

/** 
 * @ClassName: MomentsService
 * @Description: Moments的Service接口定义类
 *  
 */
public abstract class MomentsServiceImpl implements MomentsService{

	private static final Logger LOG = LoggerFactory.getLogger(MomentsServiceImpl.class);
	
	/** 
	* @Fields momentsDao : MomentsDao 工具依赖 
	*/
	protected MomentsDAO momentsDao;
	protected PersonalShareDAO personalShareDAO;
	protected CommonDAOUtil commonDAOUtil;
	protected ReportsalesDAO reportSalesDao;
	protected ScoreService scoreService;
	protected PrototypeDAO prototypeDao;
	protected PrototypeAttachmentDAO prototypeAttachementDao;
	
	
	/*===============业务方法=============*/
	
	//查询朋友圈列表，只加载内容，不需要加载评论列表，查询可以按照圈子、按照类型、按照热度
	//需要关联一下用户，将用户姓名、头像id返回
	
	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-20 下午10:47:10 
	* @param addDto 
	* @see com.haier.isales.moments.service.MomentsService#addMomentsUseType(com.haier.isales.moments.dto.MomentsAddDTO) 
	*/ 
	@Override
	public ScoreResult addMomentsUseType(MomentsAddDTO addDto) {
		//参数合法性校验
		checkAddParams(addDto);
		//参数合理性校验
		//分类生成快照内容
		MomentsType instance = MomentsType.getInstance(addDto.getTypeCode());
		MomentsDomain moments = new MomentsDomain();
		switch (instance) {
		case 经验:
			moments = doRequriedThingsForType101(addDto);
			break;
		case 销售日志:
			moments = doRequriedThingsForType102(addDto);
			break;
		case 转发:
			moments = doRequriedThingsForType103(addDto);
			break;
		case 心情:
			moments = doRequriedThingsForType104(addDto);
			break;
		case 公共频道:
			moments = doRequriedThingsForType105(addDto);
			break;
		case 样机分享://分享到工作圈
			moments = doRequriedThingsForType106(addDto);
			break;
		case 微信分享://分享到微信平台，目前只支持样机的微信分享
			moments = doRequriedThingsForType107(addDto);
			break;
		case QQ空间://QQ空间的分享，同样是只支持样机的分享
			moments = doRequriedThingsForType108(addDto);
			break;
		default:
			throw new SystemException(BusinessExceptionCode.param_error,"还不支持的分享类型" + addDto.getTypeCode());
		}
		//保存分享内容
		momentsDao.save(moments);
		//TODO 保存分享关联的内容,为分享中包含附件或文件预留的内容
		//保存本次分享应该获得的积分
		ScoreModule scoreModule = new ScoreModule();
		scoreModule.setOperatorId(addDto.getCurrentUser().getOperatorId());
		scoreModule.setScoreType(ScoreType.分享);
		Map<String,Object> variables = new HashMap<String,Object>();
		String value = "";
		if(instance.equals(MomentsType.转发)){
			value += "转发";
		}else{
			value += "分享" + instance.toString();
		}
		variables.put(MomentsDivisor.分享类型.getValue(), value);
		scoreModule.setExtendVariable(variables);
		
		
		List<ScoreDTO> scoreList = scoreService.addScoreUseScoreRule(scoreModule);
		ScoreResult scoreResult = new ScoreResult();
		scoreResult.setScoreList(scoreList);
		scoreResult.setResult(moments.getId());
		return scoreResult;
	}
	
	/** 
	* @Description: 对于QQ空间分享来说，除了类型编号不同以外，其余都是想通的，所以调用微信的实现方法
	* @author Liu Wenjie   
	* @date 2015-3-11 下午2:20:16 
	* @param addDto
	* @return  
	*/ 
	private MomentsDomain doRequriedThingsForType108(MomentsAddDTO addDto) {
		//目前QQ空间的分享与微信分享一样，只是记录而已，所以调用相同的分享接口
		return doRequriedThingsForType107(addDto);
	}

	/** 
	* @Description: 分享到微信的方法，记录分享内容，并汇集展示分享内容的信息
	* @author Liu Wenjie   
	* @date 2015-3-11 上午11:28:44 
	* @param addDto
	* @return  
	*/ 
	private MomentsDomain doRequriedThingsForType107(MomentsAddDTO addDto) {
		MomentsType instance = MomentsType.getInstance(addDto.getTypeCode());
		String subTypeCode = instance.getSubTypeCode();
		MomentsType subInstance = MomentsType.getInstance(subTypeCode);
		MomentsDomain moments = null;
		//目前只支持样机分享
		switch(subInstance){
		case 样机分享:
			moments = doRequriedThingsForType106(addDto);
			break;
			default:
				throw new SystemException(BusinessExceptionCode.param_error,"微信或QQ空间分享还不支持的分享类型  " + subInstance.toString());
		}
		return moments;
	}

	/** 
	* @Description: 把样机分享到工作圈时，构造样机分享的内容的方法
	* @author Liu Wenjie   
	* @date 2015-3-11 上午10:31:41 
	* @param addDto
	* @return  
	*/ 
	private MomentsDomain doRequriedThingsForType106(MomentsAddDTO addDto) {
		MomentsDomain moments = getDefaultMomentsDomain(addDto);
		String[] targetIds = addDto.getTargetIds();
		//样机分享只能分享一条 
		String targetId = targetIds[0];
		try {
			long parseLong = Long.parseLong(targetId);
			PrototypeDomain findById = prototypeDao.findById(parseLong);
			if(findById == null){
				throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到分享的样机内容 id " + targetId);
			}
			
			//样机上样的图片暂时不支持默认放到分享中 
			//List<PrototypeAttachmentDomain> attacheList = prototypeAttachementDao.findByBarcode(findById.getBarcode());
			//构造快照内容的Map对象
			Map<String, Object> convertBean = BeanToMapUtil.convertBean(findById);
			convertBean.put("attachementIds", addDto.getAttechementId());
			convertBean.put("imgUrl", addDto.getImgUrl());
			//设置快照内容
			JsonConfig jsonConfig = new JsonConfig();
			JsonDateValueProcessor dateProcessor = new JsonDateValueProcessor();
			jsonConfig.registerJsonValueProcessor(Date.class,dateProcessor);
			JSON json = JSONSerializer.toJSON(convertBean,jsonConfig);
			moments.setSnapshot(json.toString());
			
		} catch (NumberFormatException e) {
			LOG.error("不合理的分享内容主键 " + targetId + ", 期望的是Long类型的内容",e);
			throw new SystemException(BusinessExceptionCode.parse_format_error,"不合理的分享内容主键 " + targetId + ", 期望的是Long类型的内容",e);
		}
		return moments;
	}

	/** 
	* @Description: 公共频道类型的分享内容 
	* @author Liu Wenjie   
	* @date 2014-11-21 下午2:11:06 
	* @param addDto
	* @return  
	*/ 
	private MomentsDomain doRequriedThingsForType105(MomentsAddDTO addDto) {
		// 2015-6-14  使用一下addDto，以便解决代码违规：“定义了形式参数，却没有用，检查一下逻辑是否有问题”
		LOG.info(addDto.toString());
		throw new UnsupportedOperationException("还未开放，敬请期待 ");
	}

	/** 
	* @Description: 转发分享内容时的独立方法
	* @author Liu Wenjie   
	* @date 2014-11-21 上午10:27:24 
	* @param addDto
	* @return  
	*/ 
	private MomentsDomain doRequriedThingsForType103(MomentsAddDTO addDto) {
		MomentsDomain moments = getDefaultMomentsDomain(addDto);
		String[] targetIds = addDto.getTargetIds();
		Long operatorId = addDto.getCurrentUser().getOperatorId();
		String userLabelGroups = BusinessUtil.getLabelGroupString(addDto.getUserLabelGroups());
		List<MomentsDomain> targetDomains = new ArrayList<MomentsDomain>();
		//转发只能单一转发
		String targetId = targetIds[0];
		try {
			long parseLong = Long.parseLong(targetId);
			MomentsDomain findById = findById(parseLong);
			if(findById == null){
				throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到分享内容的 id " + targetId);
			}
			//判断当前是否有权限转发，有共同的圈子或者被转发的内容是公共频道，就可以转发 
			if(!MomentsType.公共频道.getTypeCode().equals(findById.getType())){
				String labelGroups = findById.getLabelGroups();
				if(StringUtils.isNotBlank(labelGroups) && !labelGroups.replaceAll(userLabelGroups, "@Test@").contains("@Test@")){
					throw new BusinessException(BusinessExceptionCode.no_auth,"当前用户" + operatorId + " 没有权限转发制定的分享内容 " + targetId);
				}
			}
			//内容暂时不进行合并
			//moments.setContent(moments.getContent() + "//" + findById.getCreateName() + ":"+ findById.getContent());
			targetDomains.add(findById);
			//修改被转发的数据的次数问题
			Integer postCount = findById.getPostCount();
			if(postCount == null){
				findById.setPostCount(1);
			}else{
				findById.setPostCount(postCount + 1);
			}
			//设置快照版本 
			if(StringUtils.isBlank(findById.getSnapshot())){
				JsonConfig jsonConfig = JsonUtil.getFilterPropertyJsonConfig(MomentsDomain.class,"id","content");
				JSON json = JSONSerializer.toJSON(findById,jsonConfig);
				moments.setSnapshot(json.toString());
			}else{
				moments.setSnapshot(findById.getSnapshot());
			}
			//设置类型是被转发内容的类型
			moments.setType(findById.getType());
			update(findById);
			
		} catch (NumberFormatException e) {
			LOG.error("不合理的分享内容主键 " + targetId + ", 期望的是Long类型的内容",e);
			throw new SystemException(BusinessExceptionCode.parse_format_error,"不合理的分享内容主键 " + targetId + ", 期望的是Long类型的内容",e);
		}
		
		//返回对应的实体内容
		return moments;
	}

	/** 
	* @Description: 分享销售日志时的独立方法
	* @author Liu Wenjie   
	* @date 2014-11-21 上午10:27:21 
	* @param addDto
	* @return  
	*/ 
	private MomentsDomain doRequriedThingsForType102(MomentsAddDTO addDto) {
		//throw new UnsupportedOperationException("销售日志分享逻辑无法确定，暂不支持此分享方法");
		MomentsDomain moments = getDefaultMomentsDomain(addDto);
		String[] targetIds = addDto.getTargetIds();
		Long operatorId = addDto.getCurrentUser().getOperatorId();
		//构造快照内容的map对象
		List<ReportsalesDomain> targetDomains = new ArrayList<ReportsalesDomain>();
//		//验证销售日志记录是否存在，并且是否是自己可分享的内容
		for (String targetId : targetIds) {
			try {
				long parseLong = Long.parseLong(targetId);
				ReportsalesDomain findById = reportSalesDao.findById(parseLong);
				if(findById == null){
					throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到分享内容的 id " + targetId);
				}else if(!operatorId.equals(findById.getOperatorId())){
					throw new BusinessException(BusinessExceptionCode.no_auth,"分享销售记录时，不能分享其他人的分享内容");
				}
				//增加一条库按照中包含的内容
				targetDomains.add(findById);
				//设置当前的分享状态 
				findById.setShareType(ReportsalesDomain.SHARE_TYPE_HAS);
				reportSalesDao.update(findById);
			} catch (NumberFormatException e) {
				LOG.error("不合理的分享内容主键 " + targetId + ", 期望的是Long类型的内容",e);
				throw new SystemException(BusinessExceptionCode.parse_format_error,"不合理的分享内容主键 " + targetId + ", 期望的是Long类型的内容",e);
			}
		}
		
		//设置快照内容 
		JsonConfig jsonConfig = JsonUtil.getFilterPropertyJsonConfig(ReportsalesDomain.class, "id","newprice","counts","gjtime","producttype");
		JSON json = JSONSerializer.toJSON(targetDomains,jsonConfig);
		moments.setSnapshot(json.toString());
		
		//返回结果值 
		return moments;
	}
	

	/** 
	* @Description: 分享经验时的独立处理方法
	* @author Liu Wenjie   
	* @date 2014-11-21 上午10:27:17 
	* @param addDto
	* @return  
	*/ 
	private MomentsDomain doRequriedThingsForType101(MomentsAddDTO addDto) {
		MomentsDomain moments = getDefaultMomentsDomain(addDto);
		//验证目标内容是否存在，并且是否是自己可分享的内容
		String[] targetIds = addDto.getTargetIds();
		Long operatorId = addDto.getCurrentUser().getOperatorId();
		List<PersonalShareDomain> targetDomains = new ArrayList<PersonalShareDomain>();
		for (String targetId : targetIds) {
			try {
				long parseLong = Long.parseLong(targetId);
				PersonalShareDomain findById = personalShareDAO.findById(parseLong);
				if(findById == null){
					throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到分享内容的 id " + targetId);
				}else if(!operatorId.equals(findById.getUserId())){
					throw new BusinessException(BusinessExceptionCode.no_auth,"分享心情时，不能分享其他人的分享内容");
				}else if(!PersonalShareDomain.SAVE_TYPE_EXPERIENCE.equals(findById.getType())){
					throw new BusinessException(BusinessExceptionCode.no_auth,"分享心情时，指定的id " + targetId + " 内容类型应该为 " + PersonalShareDomain.SAVE_TYPE_EXPERIENCE +", 实际值为 " + findById.getType());
				}
				targetDomains.add(findById);
				//当状态不是分享时，设置状态为分享 
				if(!PersonalShareDomain.SHARE_TYPE_TO_EVERYONE.equals(findById.getShareType())){
					findById.setShareType(PersonalShareDomain.SHARE_TYPE_TO_EVERYONE);
				}
				//增加原记录的转发次数
				Integer postCount = findById.getPostCount();
				if(postCount == null){
					findById.setPostCount(1);
				}else{
					findById.setPostCount(postCount + 1);
				}
				personalShareDAO.update(findById);
			} catch (NumberFormatException e) {
				LOG.error("不合理的分享内容主键 " + targetId + ", 期望的是Long类型的内容",e);
				throw new SystemException(BusinessExceptionCode.parse_format_error,"不合理的分享内容主键 " + targetId + ", 期望的是Long类型的内容",e);
			}
		}
		
		//构造目标内容的快照
		JsonConfig jsonConfig = JsonUtil.getFilterPropertyJsonConfig(PersonalShareDomain.class, "id","content");
		JSON json = JSONSerializer.toJSON(targetDomains,jsonConfig);
		moments.setSnapshot(json.toString());
		
		//返回对应的实体内容
		return moments;
	}
	
	
	/** 
	* @Description: 分享心情的独立方法
	* @author Liu Wenjie   
	* @date 2014-11-20 下午10:16:34 
	* @param currentOperatorId
	* @param targetIds
	* @return  
	*/ 
	private MomentsDomain doRequriedThingsForType104(MomentsAddDTO addDto){
		//分享心情时，是没有快照版本
		MomentsDomain moments = getDefaultMomentsDomain(addDto);
		return moments;
	}
	
	/** 
	* @Description: 获取MomentsDomain的默认对象
	* @author Liu Wenjie   
	* @date 2014-11-20 下午10:26:40 
	* @return  
	*/ 
	private MomentsDomain getDefaultMomentsDomain(MomentsAddDTO addDto){
		MomentsDomain domain = new MomentsDomain();
		//状态
		domain.setStatus(MomentsDomain.STATUS_ENABLE);
		//设置分享类型
		domain.setType(addDto.getTypeCode());
		//分享内容
		domain.setContent(addDto.getContents());
		//位置信息
		domain.setLocation(addDto.getLocation());
		//创建人信息
		domain.setCreateId(addDto.getCurrentUser().getOperatorId());
		domain.setCreateName(addDto.getCurrentUser().getOperatorName());
		domain.setCreateTime(new Date());
		domain.setUpdateId(addDto.getCurrentUser().getOperatorId());
		domain.setUpdateName(addDto.getCurrentUser().getOperatorName());
		domain.setUpdateTime(new Date());
		//分享的群组信息
		List<String> targetLabelGroups = addDto.getTargetLabelGroups();
		if(targetLabelGroups != null && !targetLabelGroups.isEmpty()){
			String labelGroups = BusinessUtil.getLabelGroupString(targetLabelGroups);
			domain.setLabelGroups(labelGroups);
		}
		
		//各种查询和浏览次数
		domain.setBrowseCount(0);
		domain.setCommentsCount(0);
		domain.setLikeCount(0);
		domain.setDislikeCount(0);
		domain.setPostCount(0);
		return domain;
	}
	
	/** 
	* @Description: 验证添加分享时的
	* @author Liu Wenjie   
	* @date 2014-11-20 下午9:37:02 
	* @param currentOperatorId
	* @param typeCode
	* @param targetIds  
	*/ 
	private void checkAddParams(MomentsAddDTO addDto) {
		CheckParamUtil.checkFieldIfNotBlank(addDto,"typeCode","currentUser");
		
		MomentsType type = MomentsType.getInstance(addDto.getTypeCode());
		if(type == null || type.equals(MomentsType.不支持)){
			throw new BusinessException(BusinessExceptionCode.param_error,"不支持的分享类型:  " + addDto.getTypeCode());
		}
		
		String[] targetIds = addDto.getTargetIds();
		if(!MomentsType.心情.equals(type)){//心情类的是不需要有分享的目标id的
			if(targetIds == null || targetIds.length == 0){
				throw new BusinessException(BusinessExceptionCode.param_error,"没有指定分享内容的 关联 内容");
			}
		}else{
			String contents = addDto.getContents();
			if(StringUtils.isBlank(contents)){
				throw new BusinessException(BusinessExceptionCode.param_error,"分享心情时，内容不能为空");
			}
		}
		
		//判断目标数组的长度 ,非销售日志类型的内容，不能进行多条分享 
		if(!MomentsType.销售日志.equals(type)){
			if(targetIds != null && targetIds.length > 1){
				throw new BusinessException(BusinessExceptionCode.param_error,"分享 " + type.toString() + " 内容，暂不支持多条分享");
			}
		}
		
		//当前用户要分享的标签群信息不能超过已有的标签群信息
		List<String> userLabelGroups = addDto.getUserLabelGroups();
		List<String> targetLabelGroups = addDto.getTargetLabelGroups();
		if(userLabelGroups != null && targetLabelGroups != null && !userLabelGroups.containsAll(targetLabelGroups)){
			throw new SystemException(BusinessExceptionCode.no_auth,"没有权限分享到指定的群" + Arrays.toString(targetLabelGroups.toArray()));
		}
		
		UserDTO currentUser = addDto.getCurrentUser();
		CheckParamUtil.checkFieldIfNotBlank(currentUser,"operatorId");
		
	}
	//删除内容--删除在朋友圈发表的内容，逻辑删除。
	/** 
	* @Description:  根据id获取一个实体对象的方法，是对DAO的业务封装，去多个
	* @author Liu Wenjie   
	* @date 2014-11-25 下午4:52:06 
	* @param id
	* @return  
	*/ 
	public MomentsDomain findById(Long id){
		if(id == null){
			return null;
		}
		String index = "";
		do{
			//判断表是否存在
			if(!commonDAOUtil.tableIsExist("isales_app", "t_isales_moments" + index)){
				//要查的表已经不存在,
				return null;
			}
			// 获取查询结果列表
			MomentsDomain domain = momentsDao.findByIdWithSuffix(index, id);
			if(domain != null){
				return domain;
			}
			// 获取该条件下全部结果的条数
			if(StringUtil.isEmpty(index)){
				index = "1";
			}else{
				index = String.valueOf(Integer.valueOf(index) + 1);
			}
		}while(true);
	}
	
	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-25 下午7:41:19 
	* @param id
	* @return 
	* @see com.haier.isales.moments.service.MomentsService#findById(java.lang.Long) 
	*/ 
	public void update(MomentsDomain momentsDomain){
		if(momentsDomain == null || momentsDomain.getId() == null){
			return;
		}
	    Long id = momentsDomain.getId();
		String index = "";
		do{
			//判断表是否存在
			if(!commonDAOUtil.tableIsExist("isales_app", "t_isales_moments" + index)){
				//要查的表已经不存在,
				return;
			}
			// 获取查询结果列表
			MomentsDomain domain = momentsDao.findByIdWithSuffix(index, id);
			if(domain != null){
				momentsDao.updateWithSuffix(index,momentsDomain);
			}
			// 获取该条件下全部结果的条数
			if(StringUtil.isEmpty(index)){
				index = "1";
			}else{
				index = String.valueOf(Integer.valueOf(index) + 1);
			}
		}while(true);
	}
	
	/*====================getter and setter =================*/
	

	/**
	 * @Description: 属性momentsDao 的set方法 
	 */
	public void setMomentsDao(MomentsDAO momentsDao){
		this.momentsDao = momentsDao;
	}

	/**
	 * @Description: 属性 personalShareDAO 的set方法 
	 * @param personalShareDAO 
	 */
	public void setPersonalShareDAO(PersonalShareDAO personalShareDAO) {
		this.personalShareDAO = personalShareDAO;
	}

	/**
	 * @Description: 属性 commonDAOUtil 的set方法 
	 * @param commonDAOUtil 
	 */
	public void setCommonDAOUtil(CommonDAOUtil commonDAOUtil) {
		this.commonDAOUtil = commonDAOUtil;
	}

	/**
	 * @Description: 属性 reportSalesDao 的set方法 
	 * @param reportSalesDao 
	 */
	public void setReportSalesDao(ReportsalesDAO reportSalesDao) {
		this.reportSalesDao = reportSalesDao;
	}
	
	/**
	 * @Description: 属性 scoreService 的set方法 
	 * @param scoreService 
	 */
	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}

	/**
	 * @Description: 属性 prototypeDao 的set方法 
	 * @param prototypeDao 
	 */
	public void setPrototypeDao(PrototypeDAO prototypeDao) {
		this.prototypeDao = prototypeDao;
	}

	/**
	 * @Description: 属性 prototypeAttachementDao 的set方法 
	 * @param prototypeAttachementDao 
	 */
	public void setPrototypeAttachementDao(PrototypeAttachmentDAO prototypeAttachementDao) {
		this.prototypeAttachementDao = prototypeAttachementDao;
	}
	
}
