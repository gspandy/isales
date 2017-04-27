/**
* @Company 青鸟软通   
* @Title: Comments2ServiceImpl.java 
* @Package com.haier.isales.moments.service.impl 
* @author Liu Wenjie   
* @date 2014-11-22 下午2:17:26 
* @version V1.0   
*/ 
package com.haier.isales.moments.service.impl;


import java.util.Date;
import java.util.List;

import com.haier.isales.common.BusinessUtil;
import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.moments.domain.CommentsDomain;
import com.haier.isales.moments.domain.MomentsDomain;
import com.haier.isales.moments.dto.CommentsAddDto;
import com.haier.isales.moments.service.MomentsService;

/** 
 * @ClassName: Comments2ServiceImpl 
 * @Description: 
 *  
 */
public class Comments2ServiceImpl extends CommentsServiceImpl {
	
	private MomentsService momentsService;

	/**
	* <p>Description: 添加一条新评论内容</p> 
	* @author Liu Wenjie   
	* @date 2014-11-22 下午2:33:58 
	* @param addDto 
	* @see com.haier.isales.moments.service.CommentsService#addNewComments(com.haier.isales.moments.dto.CommentsAddDto) 
	*/ 
	@Override
	public void addNewComments(CommentsAddDto addDto) {
		//验证参数合法性
		checkAddParams(addDto);
		//验证参数合理性
		MomentsDomain findById = momentsService.findById(addDto.getReplyTargetId());
		if(findById == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"保存评论内容时，没有找到对应的分享内容 " + addDto.getReplyTargetId());
		}
		
		Long replyParentId = addDto.getReplyParentId();
		CommentsDomain findById2 = null;
		if(replyParentId != null){
			findById2 = findById(replyParentId);
		}
		
		//构造一条默认的评论记录
		CommentsDomain comments = getDefaultCommentsDomain(addDto,findById2);
		//设置其他参数内容
		comments.setSourceId(findById.getId());
		comments.setSourceUsercode(findById.getCreateUsercode());
		comments.setSourceUserid(findById.getCreateId());
		comments.setSourceUsername(findById.getCreateName());
		//保存评论
		commentsDao.save(comments);
		
		//增加分享内容的评论次数
		Integer commentsCount = findById.getCommentsCount();
		if(commentsCount == null){
			findById.setCommentsCount(1);
		}else{
			findById.setCommentsCount(commentsCount + 1);
		}
		momentsService.update(findById);
		
		//TODO 去获取用户本次操作的积分数
		
	}

	/** 
	* @Description: 
	* @author Liu Wenjie   
	* @date 2014-11-22 下午2:54:01 
	* @param addDto
	* @param findById2
	* @return  
	*/ 
	private CommentsDomain getDefaultCommentsDomain(CommentsAddDto addDto,
			CommentsDomain commentsParent) {
		CommentsDomain commentsNew = new CommentsDomain();
		//评论内容
		commentsNew.setContent(addDto.getContent());
		//创建人信息
		commentsNew.setCreateId(addDto.getCurrentUser().getOperatorId());
		commentsNew.setCreateName(addDto.getCurrentUser().getOperatorName());
		commentsNew.setCreateUsercode(addDto.getCurrentUser().getUserCode());
		commentsNew.setCreateTime(new Date());
		commentsNew.setUpdateId(addDto.getCurrentUser().getOperatorId());
		commentsNew.setUpdateName(addDto.getCurrentUser().getOperatorName());
		commentsNew.setUpdateTime(new Date());
		commentsNew.setUpdateUsercode(addDto.getCurrentUser().getUserCode());
		//当前用户的圈子范围
		List<String> userLabelGroups = addDto.getUserLabelGroups();
		if(userLabelGroups != null && !userLabelGroups.isEmpty()){
			commentsNew.setLabelGroups(BusinessUtil.getLabelGroupString(userLabelGroups));
		}
		//用户的当前位置
		commentsNew.setLocation(addDto.getLocation());
		//父级评论的信息内容
		if(commentsParent != null){
			commentsNew.setParentId(commentsParent.getId());
			commentsNew.setParentUsercode(commentsParent.getCreateUsercode());
			commentsNew.setParentUserid(commentsParent.getCreateId());
			commentsNew.setParentUsername(commentsParent.getCreateName());
		}
		//评论的默认状态
		commentsNew.setStatus(CommentsDomain.STATUS_ENABLE);
		
		return commentsNew;
	}

	/** 
	* @Description: 
	* @author Liu Wenjie   
	* @date 2014-11-22 下午2:34:59 
	* @param addDto  
	*/ 
	private void checkAddParams(CommentsAddDto addDto) {
		CheckParamUtil.checkFieldIfNotBlank(addDto ,"replyTargetId","content","currentUser");
		
	}

	
	
	/*=============getter and setter ================*/
	/**
	 * @Description: 属性 momentsService 的set方法 
	 * @param momentsService 
	 */
	public void setMomentsService(MomentsService momentsService) {
		this.momentsService = momentsService;
	}
	

}
