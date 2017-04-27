/**
* @Company 青鸟软通   
* @Title: CommentsUpdateClient.java 
* @Package com.haier.isales.moments.service 
* @author Liu Wenjie   
* @date 2014-11-22 下午4:33:30 
* @version V1.0   
*/ 
package com.haier.isales.moments.service;

import com.haier.isales.moments.dto.CommentsAddDto;

/** 
 * @ClassName: CommentsUpdateClient 
 * @Description: 评论相关的修改内容对应的Dubbo接口定义类
 *  
 */
public interface CommentsUpdateClient {
	
	/** 
	* @Description: 增加一条评论的方法
	* @author Liu Wenjie   
	* @date 2014-11-22 下午4:34:37 
	* @param addDto
	* @return  
	*/ 
	public Object addNewComments(CommentsAddDto addDto);
	
	
}
