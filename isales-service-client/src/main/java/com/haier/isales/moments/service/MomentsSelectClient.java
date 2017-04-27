/**
* @Company 青鸟软通   
* @Title: MomentsClient.java 
* @Package com.haier.isales.moments.service 
* @author Liu Wenjie   
* @date 2014-11-20 下午8:57:45 
* @version V1.0   
*/ 
package com.haier.isales.moments.service;

import com.haier.isales.moments.dto.MomentsQueryDTO;

/** 
 * @ClassName: MomentsClient 
 * @Description: 分享对应的Dubbo接口定义
 *  
 */
public interface MomentsSelectClient {

	/**
	 *  
	* @Title: getMomentsList 
	* @Description: 根据条件，获取朋友圈内容
	* @param queryDto
	* @param currentPage
	* @param pageSize
	* @return  
	* @throws
	 */
	public Object getMomentsList(MomentsQueryDTO queryDto,Integer currentPage,Integer pageSize);
	

	/** 
	* @Description: 根据分享的id获取分享内容详情的方法
	* @author Liu Wenjie   
	* @date 2015-3-11 下午2:25:34 
	* @param id
	* @return  
	*/ 
	public Object getMomentsById(Long id);
}
