/**
 * @Company 青鸟软通   
 * @Title: MomentsService.java 
 * @Package  com.haier.isales.moments.service
 * @author Cao Rui   
 * @date 2014年11月19日  10:46:37
 * @version V1.0   
 */
package com.haier.isales.moments.service;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.common.ScoreResult;
import com.haier.isales.moments.domain.MomentsDomain;
import com.haier.isales.moments.dto.MomentsAddDTO;
import com.haier.isales.moments.dto.MomentsDTO;
import com.haier.isales.moments.dto.MomentsLikeRecordDTO;
import com.haier.isales.moments.dto.MomentsQueryDTO;

/** 
 * @ClassName: MomentsService
 * @Description: Moments的Service接口定义类
 *  
 */
public interface MomentsService {

	/**
	 * 
	* @Title: getMomentsList 
	* @Description: 获取当前登录用户 可以查看的全部朋友圈内容
	* @param queryDto
	* @param pageCond
	* @return  
	* @throws
	 */
	public PageResult<MomentsDTO> getMomentsList(MomentsQueryDTO queryDto,PageCond pageCond);

	/** 
	* @Description: 按照类型分享本人的内容，如果不是本人发布的，则无法执行，除非是转发类型的分享
	* @author Liu Wenjie   
	* @date 2014-11-20 下午10:46:35 
	* @param addDto  
	*/ 
	ScoreResult addMomentsUseType(MomentsAddDTO addDto);

	
	/**
	 * 用户点赞
	* @Title: updateLike 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param bean  
	* @throws
	 */
	public void updateLike(MomentsLikeRecordDTO bean);
	
	/**
	 * 用户取消点赞
	* @Title: updateDisLike 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param bean  
	* @throws
	 */
	public void updateDisLike(MomentsLikeRecordDTO bean);
	
	
	/** 
	* @Description: 按照id查询实体的循环实现，多表循环查询 
	* @author Liu Wenjie   
	* @date 2014-11-25 下午5:31:13 
	* @param id
	* @return  
	*/ 
	public MomentsDomain findById(Long id);
	
	/** 
	* @Description: 去多个表中进行循环处理
	* @author Liu Wenjie   
	* @date 2014-11-25 下午7:57:53 
	* @param domain  
	*/ 
	public void update(MomentsDomain domain);

	/** 
	* @Description: 查询DTO对象
	* @author Liu Wenjie   
	* @date 2015-3-11 下午2:56:36 
	* @param id
	* @return  
	*/ 
	public MomentsDTO findDtoById(Long id);
	
}
