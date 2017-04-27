/**
 * @Company 青鸟软通   
 * @Title: CommentsService.java 
 * @Package  com.haier.isales.moments.service
 * @author Cao Rui   
 * @date 2014年11月19日  10:49:13
 * @version V1.0   
 */
package com.haier.isales.moments.service;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.moments.domain.CommentsDomain;
import com.haier.isales.moments.dto.CommentsAddDto;
import com.haier.isales.moments.dto.CommentsDTO;
import com.haier.isales.moments.dto.CommentsQueryDTO;

/** 
 * @ClassName: CommentsService
 * @Description: Comments的Service接口定义类
 *  
 */
public interface CommentsService {
	
	/**
	* @Title: getCommentsList 
	* @Description: 获取当前登录用户 可以查看的朋友圈查询评论列表
	* @param queryDto
	* @param pageCond
	* @return  
	* @throws
	 */
	public PageResult<CommentsDTO> getCommentsList(CommentsQueryDTO queryDto,
			PageCond pageCond);
	
	
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author Liu Wenjie   
	* @date 2014-11-22 下午2:18:36 
	* @param addDto  
	*/ 
	public void addNewComments(CommentsAddDto addDto);
	
	
	/** 
	* @Description: 根据id获取一个实体对象的方法，是对DAO的业务封装，去多个表中进行循环处理
	* @author Liu Wenjie   
	* @date 2014-11-25 下午7:32:21 
	* @param id
	* @return  
	*/ 
	public CommentsDomain findById(Long id);
	
	
	/** 
	* @Description: 去多个表中进行循环处理
	* @author Liu Wenjie   
	* @date 2014-11-25 下午7:57:53 
	* @param domain  
	*/ 
	public void update(CommentsDomain domain);
		
}
