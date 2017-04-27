/**
 * @Company 青鸟软通   
 * @Title: CommentsService.java 
 * @Package  com.haier.isales.moments.service.impl
 * @author Cao Rui   
 * @date 2014年11月19日  10:49:13
 * @version V1.0   
 */
package com.haier.isales.moments.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.BusinessUtil;
import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.StringUtil;
import com.haier.isales.common.dao.CommonDAOUtil;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;
import com.haier.isales.moments.dao.CommentsDAO;
import com.haier.isales.moments.dao.MomentsDAO;
import com.haier.isales.moments.domain.CommentsDomain;
import com.haier.isales.moments.domain.MomentsDomain;
import com.haier.isales.moments.dto.CommentsDTO;
import com.haier.isales.moments.dto.CommentsQueryDTO;
import com.haier.isales.moments.service.CommentsService;

/** 
 * @ClassName: CommentsService
 * @Description: Comments的Service接口定义类，管理评论、赞、踩
 *  
 */
public abstract class CommentsServiceImpl implements CommentsService{

	private static final Logger LOG = LoggerFactory.getLogger(CommentsServiceImpl.class);

	
	/** 
	* @Fields commentsDao : CommentsDao 工具依赖 
	*/
	protected CommentsDAO commentsDao;
	protected MomentsDAO momentsDao;
	protected CommonDAOUtil commonDAOUtil;
//	
//	
//	/*===============业务方法=============*/
//	//查询评论列表
	/**
	 * 
	* @Title: getCommentsList 
	* @Description: 获取当前登录用户 可以查看的朋友圈查询评论列表
	* @param queryDto
	* @param pageCond
	* @return  
	* @throws
	 */
	@Override
	public PageResult<CommentsDTO> getCommentsList(CommentsQueryDTO queryDto,
			PageCond pageCond) {
		
		// 参数非空校验
		CheckParamUtil.checkFieldIfNotBlank(queryDto, "currentUserId","sourceId");
		
		LOG.info("查询朋友圈列表，入参中登录用户为：" + queryDto.getCurrentUserId());
		
		Long momentsId = queryDto.getSourceId();
		//验证评论的原文，在数据库中是否存在;
		MomentsDomain momentsDomain = momentsDao.findById(momentsId);
		if(null == momentsDomain || null == momentsDomain.getStatus() || !MomentsDomain.STATUS_ENABLE.equals(momentsDomain.getStatus())){
			throw new SystemException(BusinessExceptionCode.database_none_data,
					"评论原文不存在或已删除");
		}
//		MomentsDomain momentsDomain = new MomentsDomain();
//		momentsDomain.setId(momentsId);
//		momentsDomain.setStatus(MomentsDomain.STATUS_ENABLE);
//		int momentsCount = momentsDao.findCountByParams(momentsDomain);
//		if(momentsCount == 0){
//			
//		}
		
		//验证要回复的评论，在数据库中是否存在;
		
		
		//获取当前用户所在的圈子（拥有的标签组）
		List<String> userLabelGroups = queryDto.getCurrentUserLabelGroups();
		if(null != userLabelGroups && userLabelGroups.contains("1")){
			//当前用户标签组中包含最高的标签组,忽略所有条件，查询全部
			queryDto.setLabelGroups("#");
		}else{
			//2015-1-7 将id为1的圈子设为查询的默认条件---发布到该圈子的内容，全国可见
			userLabelGroups.add("1");
			String queryLabelGroups = BusinessUtil.getLabelGroupString(userLabelGroups);
			queryDto.setLabelGroups(queryLabelGroups);
		}
		
		
		//开始查询用户可见的朋友圈评论
		PageCond pageCondQuery = pageCond;
		pageCondQuery = PageCondUtil.check(pageCondQuery);
		pageCondQuery.setFirstResult(PageCondUtil.calculateX(pageCondQuery));// 计算分页数据 第一条数据
//		queryDto.setLabelGroups(queryLabelGroups);
		queryDto.setStatus(MomentsDomain.STATUS_ENABLE);// 增加默认条件 有效的
		
		Integer totalCount = 0;
		List<CommentsDTO> resultList = new ArrayList<CommentsDTO>();
		String index = "";
		do{
			//设置表名后缀，从哪个表取值
			queryDto.setTableNameSuffix(index);
			//判断表是否存在
			String findTable = commentsDao.findTable(queryDto);
			if(null == findTable){
				//要查的表已经不存在,
				break;
			}
			// 获取查询结果列表
			List<CommentsDTO> commentsDtoList = commentsDao.findDtoListByParams(queryDto, pageCondQuery);
			// 获取该条件下全部结果的条数
//			Integer count = momentsDao.findDtoCountByParams(queryDto);
			totalCount += commentsDtoList.size();
			if(null != commentsDtoList){
				resultList.addAll(commentsDtoList);
			}
			
			if(StringUtil.isEmpty(index)){
				index = "1";
			}else{
				index = String.valueOf(Integer.valueOf(index) + 1);
			}
		}while(totalCount<pageCondQuery.getPageSize() );

		return new PageResult<CommentsDTO>(resultList, pageCondQuery);

	}
	
	
	/** 
	* @Description: 根据id获取一个实体对象的方法，是对DAO的业务封装，去多个表中进行循环处理
	* @author Liu Wenjie   
	* @date 2014-11-25 下午7:32:21 
	* @param id
	* @return  
	*/ 
	public CommentsDomain findById(Long id){
		if(id == null){
			return null;
		}
		String index = "";
		do{
			//判断表是否存在
			if(!commonDAOUtil.tableIsExist("isales_app", "t_isales_comments" + index)){
				//要查的表已经不存在,
				return null;
			}
			// 获取查询结果列表
			CommentsDomain domain = commentsDao.findByIdWithSuffix(index, id);
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
	public void update(CommentsDomain domain){
		if(domain == null || domain.getId() == null){
			return;
		}
	    Long id = domain.getId();
		String index = "";
		do{
			//判断表是否存在
			if(!commonDAOUtil.tableIsExist("isales_app", "t_isales_comments" + index)){
				//要查的表已经不存在,
				return;
			}
			// 获取查询结果列表
			CommentsDomain findById = commentsDao.findByIdWithSuffix(index, id);
			if(findById != null){
				commentsDao.updateWithSuffix(index, domain);
			}
			// 获取该条件下全部结果的条数
			if(StringUtil.isEmpty(index)){
				index = "1";
			}else{
				index = String.valueOf(Integer.valueOf(index) + 1);
			}
		}while(true);
	}
//	
//	/*====================getter and setter =================*/
//	
	/**
	 * @Description: 属性commentsDao 的set方法 
	 */
	public void setCommentsDao(CommentsDAO commentsDao){
		this.commentsDao = commentsDao;
	}

	

	/**
	 * @Description: 属性 momentsDao 的set方法 
	 * @param momentsDao 
	 */
	public void setMomentsDao(MomentsDAO momentsDao) {
		this.momentsDao = momentsDao;
	}


	/**
	 * @Description: 属性 commonDAOUtil 的set方法 
	 * @param commonDAOUtil 
	 */
	public void setCommonDAOUtil(CommonDAOUtil commonDAOUtil) {
		this.commonDAOUtil = commonDAOUtil;
	}
	
	
}
