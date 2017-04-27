/**
* @Company 青鸟软通   
* @Title: CommentsSelectClient.java 
* @Package com.haier.isales.moments.service 
* @author Cao Rui   
* @date 2014-11-22 下午11:27:24 
* @version V1.0   
*/ 
package com.haier.isales.moments.service;

import com.haier.isales.moments.dto.CommentsQueryDTO;

/** 
 * @ClassName: CommentsSelectClient 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public interface CommentsSelectClient {

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
	public Object getCommentsList(CommentsQueryDTO queryDto,Integer currentPage,Integer pageSize);
	
}
