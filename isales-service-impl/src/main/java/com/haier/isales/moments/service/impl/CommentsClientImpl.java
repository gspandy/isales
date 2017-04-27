/**
* @Company 青鸟软通   
* @Title: CommentsClientImpl.java 
* @Package com.haier.isales.moments 
* @author Cao Rui   
* @date 2014-11-19 下午10:23:31 
* @version V1.0   
*/ 
package com.haier.isales.moments.service.impl;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.moments.dto.CommentsAddDto;
import com.haier.isales.moments.dto.CommentsDTO;
import com.haier.isales.moments.dto.CommentsQueryDTO;
import com.haier.isales.moments.service.CommentsSelectClient;
import com.haier.isales.moments.service.CommentsService;
import com.haier.isales.moments.service.CommentsUpdateClient;

/** 
 * @ClassName: CommentsClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class CommentsClientImpl implements CommentsSelectClient,CommentsUpdateClient{

	private static Logger logger = LoggerFactory.getLogger(CommentsClientImpl.class);
	private CommentsService commentsService;

	
	/*=============调用service业务===============*/
	/**
	 *  
	* @Title: getCommentsList 
	* @Description: 根据条件，获取朋友圈评论列表
	* @param queryDto
	* @param currentPage
	* @param pageSize
	* @return  
	* @throws
	 */
	public PageResult<CommentsDTO> getCommentsList(CommentsQueryDTO queryDto,Integer currentPage,Integer pageSize){
		logger.info("获取朋友圈评论列表 dubbo方法");
		//如果分页条件为空，则赋默认值，不允许查询数据库的全部结果
		Integer pageNo = currentPage;
		Integer numPerPage = pageSize;
		if(pageNo == null){
			pageNo = 1;
		}
		if(numPerPage == null){
			numPerPage = 10;
		}
		
		PageResult<CommentsDTO> pageResult = commentsService.getCommentsList(queryDto, new PageCond(pageNo,numPerPage));
		return pageResult;
	}
	
	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-22 下午4:35:38 
	* @param addDto
	* @return 
	* @see com.haier.isales.moments.service.CommentsUpdateClient#addNewComments(com.haier.isales.moments.dto.CommentsAddDto) 
	*/ 
	@Override
	public Object addNewComments(CommentsAddDto addDto) {
		commentsService.addNewComments(addDto);
		return null;
	}
	
	
	
	/*=============spring bean的set方法===============*/
	/**
	 * @Description: 属性 commentsService 的set方法 
	 * @param commentsService 
	 */
	public void setCommentsService(CommentsService commentsService) {
		this.commentsService = commentsService;
	}

	
	
	
}
