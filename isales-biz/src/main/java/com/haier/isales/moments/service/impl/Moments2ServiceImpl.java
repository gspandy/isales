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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.BusinessUtil;
import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.StringUtil;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;
import com.haier.isales.moments.MomentsDomainDtoUtil;
import com.haier.isales.moments.dao.MomentsLikeRecordDAO;
import com.haier.isales.moments.domain.MomentsDomain;
import com.haier.isales.moments.domain.MomentsLikeRecordDomain;
import com.haier.isales.moments.dto.MomentsDTO;
import com.haier.isales.moments.dto.MomentsLikeRecordDTO;
import com.haier.isales.moments.dto.MomentsQueryDTO;
import com.haier.isales.salerinfo.userdetail.dao.UserDetailDAO;
import com.haier.isales.salerinfo.userdetail.domain.UserDetailDomain;
import com.haier.isales.score.module.ScoreConstants.MomentsLikeDivisor;
import com.haier.isales.score.module.ScoreConstants.ScoreType;
import com.haier.isales.score.module.ScoreModule;
import com.haier.isales.system.user.dao.UserFullInfoDAO;
import com.haier.isales.system.user.domain.UserFullInfoDomain;

/** 
 * @ClassName: MomentsService
 * @Description: Moments的Service接口定义类
 *  
 */
public class Moments2ServiceImpl extends MomentsServiceImpl{

	private static final Logger LOG = LoggerFactory.getLogger(Moments2ServiceImpl.class);
	private static final String QUERY_ALL_CURRENT_GROUPS = "all";
	private static final String TYPE_LIKE = "101";
	private static final String TYPE_DISLIKE = "102";
	private static final String LIKE_RECORD_ENABLE = "101";
//	private static String LIKE_RECORD_DISABLE = "102";
	
	/** 
	* @Fields momentsDao : MomentsDao 工具依赖 
	*/
	private UserFullInfoDAO userFullInfoDAO;//用户完整（主要是业务上使用的员工、门店、中心）信息dao
	private MomentsLikeRecordDAO momentsLikeRecordDao;
	private UserDetailDAO userDetailDao;
	
	
	/*===============业务方法=============*/
	
	//查询朋友圈列表，只加载内容，不需要加载评论列表，
	//需要关联一下用户，将用户姓名、头像id、中心返回
	/**
	 * 
	* @Title: getMomentsList 
	* @Description: 获取当前登录用户 可以查看的全部朋友圈内容
	* @param queryDto
	* @param pageCond
	* @return  
	* @throws
	 */
	@Override
	public PageResult<MomentsDTO> getMomentsList(MomentsQueryDTO queryDto,
			PageCond pageCond) {
		
		// 参数非空校验
		CheckParamUtil.checkFieldIfNotBlank(queryDto, "currentUserId");
		LOG.info("查询朋友圈列表，入参中登录用户为：" + queryDto.getCurrentUserId());
		
//		//获取当前用户 关联的所有圈子（标签组）
//		List<LabelGroupDomain> lableGroupList = labelGroupDao.findGroupsByUser(queryDto.getUserId());
//		if(lableGroupList.isEmpty()){
//			//无法获取用户标签组 或者用户没有关联任何标签组
//			return null;
//		}
//		//将用户圈子组合成正则形式的查询条件，以便下面的操作能够加快查询速度。正则格式举例：#1#|#3#|#123#
//		String queryLabelGroups = BusinessUtil.getLabelGroupByDomainList(lableGroupList);

		
		//2015-1-6 加入判断，如果用户标签组为最高权限，则要查询所有的工作圈分享
		List<String> currentUserLabelGroups = queryDto.getCurrentUserLabelGroups();
		if(null != currentUserLabelGroups && currentUserLabelGroups.contains("1")){
			//当前用户标签组中包含最高的标签组,忽略所有条件，查询全部
			queryDto.setLabelGroups("#");
		}else{
		
			//圈子改为从页面传入，用户选择需要查看的圈子。此处验证传入的数值是否为当前登录用户有的圈子。
			List<String> selectLabelGroups = queryDto.getSelectLabelGroups();
			if(null != selectLabelGroups && selectLabelGroups.contains(QUERY_ALL_CURRENT_GROUPS)){
				selectLabelGroups = queryDto.getCurrentUserLabelGroups();
			}
			//2015-1-7 将id为1的圈子设为查询的默认条件---发布到该圈子的内容，全国可见
			selectLabelGroups.add("1");
			String queryLabelGroups = BusinessUtil.getLabelGroupString(selectLabelGroups);
			queryDto.setLabelGroups(queryLabelGroups);
		}
		
		//开始查询用户可见的朋友圈分享
		PageCond pageCondQuery = pageCond;
		pageCondQuery = PageCondUtil.check(pageCondQuery);
		pageCondQuery.setFirstResult(PageCondUtil.calculateX(pageCondQuery));// 计算分页数据 第一条数据
//		queryDto.setLabelGroups(queryLabelGroups);
		queryDto.setStatus(MomentsDomain.STATUS_ENABLE);// 增加默认条件 有效的
		
		Integer totalCount = 0;
		List<MomentsDTO> resultList = new ArrayList<MomentsDTO>();
		String index = "";
		do{
			//设置表名后缀，从哪个表取值
			queryDto.setTableNameSuffix(index);
			//判断表是否存在
			String findTable = momentsDao.findTable(queryDto);
			if(null == findTable){
				//要查的表已经不存在,
				break;
			}
			// 获取查询结果列表
			List<MomentsDTO> momentsDtoList = momentsDao.findDtoListByParams(queryDto, pageCondQuery);
			// 获取该条件下全部结果的条数
//			Integer count = momentsDao.findDtoCountByParams(queryDto);
			totalCount += momentsDtoList.size();
			if(null != momentsDtoList){
				resultList.addAll(momentsDtoList);
			}
			
			if(StringUtil.isEmpty(index)){
				index = "1";
			}else{
				index = String.valueOf(Integer.valueOf(index) + 1);
			}
		}while(totalCount<pageCondQuery.getPageSize());
		
		if(!resultList.isEmpty()){
			for(MomentsDTO dto : resultList){
				extendsMomentsDto(dto);
			}
		}

//		pageCond.setTotalCount(totalCount);// 总条数
//		pageCond.setPageCount(PageCondUtil.calculatePageCount(pageCond));// 总页数

		return new PageResult<MomentsDTO>(resultList, pageCond);

	}
	
	
	/** 
	* @Description: 为momentsDto 扩展属性
	* @author Liu Wenjie   
	* @date 2015-3-11 下午2:54:46 
	* @param dto  
	*/ 
	private void extendsMomentsDto(MomentsDTO dto) {
		//循环每一条，将对应的用户信息写入，包括用户id、头像id、姓名、所属中心名称
		Long thisUserId = dto.getCreateId();
		UserFullInfoDomain userFullInfo = userFullInfoDAO.findById(thisUserId);
		UserDetailDomain detailDomain = userDetailDao.findById(thisUserId);
		if(null != userFullInfo){
			dto.setUserName(userFullInfo.getUserName());//用户姓名
			dto.setOrgName(userFullInfo.getOrgName());//用户所属的中心名称
		}
		if(null != detailDomain){
			dto.setHeadPortraitId(detailDomain.getHeadPortraitId());//用户头像id
		}
	}
	
	/**
	* <p>Description: 查询单调momentDto 对象</p> 
	* @author Liu Wenjie   
	* @date 2015-3-11 下午2:57:28 
	* @param id
	* @return 
	* @see com.haier.isales.moments.service.MomentsService#findDtoById(java.lang.Long) 
	*/ 
	@Override
	public MomentsDTO findDtoById(Long id) {
		MomentsDomain findById = findById(id);
		MomentsDTO dto = MomentsDomainDtoUtil.cloneMomentsDomain2DTO(findById);
		if(dto != null){
			extendsMomentsDto(dto);
		}
		return dto;
	}
	
	


	//点赞
		/**
		 * 用户点赞
		* @Title: updateLike 
		* @Description: TODO (这里用一句话描述这个类的作用)
		* @param bean  
		* @throws
		 */
		@Override
		public void updateLike(MomentsLikeRecordDTO bean){
			LOG.info("朋友圈点赞， service方法");
			//校验参数 是否为空
			CheckParamUtil.checkFieldIfNotBlank(bean, "momentsId","operatorId");
			
			Long momentsId = bean.getMomentsId();
			//验证要赞的内容，在数据库中是否存在;用户id是根据当前登录用户由后台获取而非接口调用端传入，不必要再验证用户有效性			
			MomentsDomain momentsDomain = momentsDao.findById(momentsId);
			if(null == momentsDomain || null == momentsDomain.getStatus() || !MomentsDomain.STATUS_ENABLE.equals(momentsDomain.getStatus())){
				throw new SystemException(BusinessExceptionCode.database_none_data,
						"要赞的内容不存在");
			}
			Integer likeCount = momentsDomain.getLikeCount() + 1;
			
			//查询用户是否已经对这条内容点过赞
			MomentsLikeRecordDomain queryBean = new MomentsLikeRecordDomain();
			queryBean.setMomentsId(momentsId);
			queryBean.setOperatorId(bean.getOperatorId());
			queryBean.setStatus(LIKE_RECORD_ENABLE);
			queryBean.setType(TYPE_LIKE);
			int countLike = momentsLikeRecordDao.findCountByParams(queryBean);
			
			queryBean.setType(TYPE_DISLIKE);
			int countDisLike = momentsLikeRecordDao.findCountByParams(queryBean);
			
			//如果已经点过赞，则返回提示信息；若没有，则继续执行下面的业务操作
			if(countLike > countDisLike){
				throw new SystemException(BusinessExceptionCode.database_duplicate_data,
						"不允许重复点赞");
			}
			
			//保存点赞的记录
			MomentsLikeRecordDomain domain = new MomentsLikeRecordDomain();
			domain.setMomentsId(momentsId);
			domain.setOperatorId(bean.getOperatorId());
			domain.setCreateTime(new Date());
			momentsLikeRecordDao.save(domain);
			
			//将原始数据的点赞数+1
			MomentsDomain momentsForCount = new MomentsDomain();
			momentsForCount.setId(momentsId);
			momentsForCount.setLikeCount(1);
			momentsDao.updateLikeCount(momentsForCount);
			
			//查询本条内容获得了多少赞，以及发表的用户，以便给发表的用户计算积分
			ScoreModule scoreModule = new ScoreModule();
			scoreModule.setOperatorId(momentsDomain.getCreateId());
			scoreModule.setScoreType(ScoreType.点赞);
			Map<String,Object> variableMap = new HashMap<String,Object>();
			variableMap.put(MomentsLikeDivisor.单条分享获得赞数.getValue(), likeCount);
			scoreModule.setExtendVariable(variableMap);
			//只增加积分即可，该结果不需要返回值。
			scoreService.addScoreUseScoreRule(scoreModule);
			
//			List<ScoreDTO> scoreList = scoreService.addScoreUseScoreRule(scoreModule);
			//修改返回值，将积分信息返回
//			ScoreResult scoreResult = new ScoreResult();
//			scoreResult.setScoreList(scoreList);
//			return scoreResult;
		}
		
		//取消点赞
		/**
		 * 用户取消点赞
		* @Title: updateDisLike 
		* @Description: TODO (这里用一句话描述这个类的作用)
		* @param bean  
		* @throws
		 */
		@Override
		public void updateDisLike(MomentsLikeRecordDTO bean){
			LOG.info("朋友圈取消点赞， service方法");
			//校验参数 是否为空
			CheckParamUtil.checkFieldIfNotBlank(bean, "momentsId","operatorId");
			
			Long momentsId = bean.getMomentsId();
			//验证要取消点赞的内容，在数据库中是否存在;用户id是根据当前登录用户由后台获取而非接口调用端传入，不必要再验证用户有效性
			MomentsDomain momentsDomain = new MomentsDomain();
			momentsDomain.setId(bean.getMomentsId());
			momentsDomain.setStatus(MomentsDomain.STATUS_ENABLE);
			int momentsCount = momentsDao.findCountByParams(momentsDomain);
			if(momentsCount == 0){
				throw new SystemException(BusinessExceptionCode.database_none_data,
						"要取消点赞的内容不存在");
			}
			
			//查询用户是否已经对这条内容点过赞
			MomentsLikeRecordDomain queryBean = new MomentsLikeRecordDomain();
			queryBean.setMomentsId(momentsId);
			queryBean.setOperatorId(bean.getOperatorId());
			queryBean.setStatus(LIKE_RECORD_ENABLE);
			queryBean.setType(TYPE_LIKE);
			int countLike = momentsLikeRecordDao.findCountByParams(queryBean);
			
			queryBean.setType(TYPE_DISLIKE);
			int countDisLike = momentsLikeRecordDao.findCountByParams(queryBean);
			
			//如果没有点过赞，则返回提示信息；若没有，则继续执行下面的业务操作
			if(countLike <= countDisLike){
				throw new SystemException(BusinessExceptionCode.database_duplicate_data,
						"尚未赞过该内容");
			}
			
			//保存取消点赞的记录
			MomentsLikeRecordDomain domain = new MomentsLikeRecordDomain();
			domain.setMomentsId(momentsId);
			domain.setOperatorId(bean.getOperatorId());
			domain.setType(TYPE_DISLIKE);
			domain.setCreateTime(new Date());
			momentsLikeRecordDao.save(domain);
			
			//将原始数据的点赞数-1
			MomentsDomain momentsForCount = new MomentsDomain();
			momentsForCount.setId(momentsId);
			momentsForCount.setLikeCount(-1);
			momentsDao.updateLikeCount(momentsForCount);
		
		}
		
	
	/*====================getter and setter =================*/

	/**
	 * @Description: 属性 userFullInfoDAO 的set方法 
	 * @param userFullInfoDAO 
	 */
	public void setUserFullInfoDAO(UserFullInfoDAO userFullInfoDAO) {
		this.userFullInfoDAO = userFullInfoDAO;
	}
	
	/**
	 * @Description: 属性 momentsLikeRecordDAO 的set方法 
	 * @param momentsLikeRecordDAO 
	 */
	public void setMomentsLikeRecordDao(MomentsLikeRecordDAO momentsLikeRecordDao) {
		this.momentsLikeRecordDao = momentsLikeRecordDao;
	}


	/**
	 * @Description: 属性 userDetailDao 的set方法 
	 * @param userDetailDao 
	 */
	public void setUserDetailDao(UserDetailDAO userDetailDao) {
		this.userDetailDao = userDetailDao;
	}



}
