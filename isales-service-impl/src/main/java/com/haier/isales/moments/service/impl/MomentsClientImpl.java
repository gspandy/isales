/**
* @Company 青鸟软通   
* @Title: MomentsClientImpl.java 
* @Package com.haier.isales.moments.service.impl 
* @author Liu Wenjie   
* @date 2014-11-20 下午9:24:12 
* @version V1.0   
*/ 
package com.haier.isales.moments.service.impl;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.moments.dto.MomentsAddDTO;
import com.haier.isales.moments.dto.MomentsDTO;
import com.haier.isales.moments.dto.MomentsLikeRecordDTO;
import com.haier.isales.moments.dto.MomentsQueryDTO;
import com.haier.isales.moments.service.MomentsSelectClient;
import com.haier.isales.moments.service.MomentsService;
import com.haier.isales.moments.service.MomentsUpdateClient;

/** 
 * @ClassName: MomentsClientImpl 
 * @Description: 分享Dubbo接口的实现类
 *  
 */
public class MomentsClientImpl implements MomentsUpdateClient,MomentsSelectClient {

	private static Logger logger = LoggerFactory.getLogger(MomentsClientImpl.class);
	
	private MomentsService momentsService;
	@Override
	public Object addMomentsUseType(MomentsAddDTO addDto) {
		return momentsService.addMomentsUseType(addDto);
	}
	
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
	@Override
	public PageResult<MomentsDTO> getMomentsList(MomentsQueryDTO queryDto,Integer currentPage,Integer pageSize) {
		//如果分页条件为空，则赋默认值，不允许查询数据库的全部结果
		Integer pageNo = currentPage;
		Integer numPerPage = pageSize;
		if(pageNo == null){
			pageNo = 1;
		}
		if(numPerPage == null){
			numPerPage = 10;
		}
		
		PageResult<MomentsDTO> pageResult = momentsService.getMomentsList(queryDto, new PageCond(pageNo,numPerPage));
		return pageResult;
	}
	
	
	/**
	 * 用户点赞
	* @Title: updateLike 
	* @Description: 
	* @param momentsId  被赞内容的id
	* @param operatorId 点赞的用户id
	* @throws
	 */
	@Override
	public Object updateLike(Long momentsId,Long operatorId){
		logger.info("进入用户点赞的dubbo方法");
		MomentsLikeRecordDTO queryBean = new MomentsLikeRecordDTO();
		queryBean.setMomentsId(momentsId);
		queryBean.setOperatorId(operatorId);
		momentsService.updateLike(queryBean);
		return null;
	}
	
	
	/**
	 * 用户取消点赞
	* @Title: updateDisLike 
	* @Description: 
	* @param momentsId  取消赞内容的id
	* @param operatorId 取消赞的用户id
	* @throws
	 */
	@Override
	public Object updateDisLike(Long momentsId,Long operatorId){
		logger.info("进入用户取消点赞的dubbo方法");
		MomentsLikeRecordDTO queryBean = new MomentsLikeRecordDTO();
		queryBean.setMomentsId(momentsId);
		queryBean.setOperatorId(operatorId);
		momentsService.updateDisLike(queryBean);
		return null;
	}
	/**
	* <p>Description: 查询一条分享内容</p> 
	* @author Liu Wenjie   
	* @date 2015-3-11 下午2:26:25 
	* @param id
	* @return 
	* @see com.haier.isales.moments.service.MomentsSelectClient#getMomentsById(java.lang.Long) 
	*/ 
	@Override
	public Object getMomentsById(Long id) {
		MomentsDTO findById = momentsService.findDtoById(id);
		return findById;
	}

	
	
	/*=====================getter and setter =====================*/
	/**
	 * @Description: 属性 momentsService 的set方法 
	 * @param momentsService 
	 */
	public void setMomentsService(MomentsService momentsService) {
		this.momentsService = momentsService;
	}

	
	
	
}
