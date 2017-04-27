/**
* @Company 青鸟软通   
* @Title: MomentsClient.java 
* @Package com.haier.isales.moments.service 
* @author Liu Wenjie   
* @date 2014-11-20 下午8:57:45 
* @version V1.0   
*/ 
package com.haier.isales.moments.service;

import com.haier.isales.moments.dto.MomentsAddDTO;

/** 
 * @ClassName: MomentsClient 
 * @Description: 分享对应的Dubbo接口定义
 *  
 */
public interface MomentsUpdateClient {

	/** 
	* @Description: 按照类型分享本人的内容，如果不是本人发布的，则无法执行，除非是转发类型的内容
	* @author Liu Wenjie   
	* @date 2014-11-20 下午10:45:39 
	* @param addDto
	* @return  
	*/ 
	public Object addMomentsUseType(MomentsAddDTO addDto);
	
	/**
	 * 用户点赞
	* @Title: updateLike 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param momentsId  被赞内容的id
	* @param operatorId 点赞的用户id
	* @throws
	 */
	public Object updateLike(Long momentsId,Long operatorId);
	
	/**
	 * 用户取消点赞
	* @Title: updateDisLike 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param momentsId  取消赞内容的id
	* @param operatorId 取消赞的用户id
	* @throws
	 */
	public Object updateDisLike(Long momentsId,Long operatorId);
}
