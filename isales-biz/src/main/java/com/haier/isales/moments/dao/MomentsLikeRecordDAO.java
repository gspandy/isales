/**
 * @Company 青鸟软通   
 * @Title: MomentsLikeRecordDAO.java 
 * @Package  com.haier.isales.moments.dao
 * @author Cao Rui   
 * @date 2014年11月19日  10:39:44
 * @version V1.0   
 */
package com.haier.isales.moments.dao;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.moments.domain.MomentsLikeRecordDomain;
import com.haier.isales.moments.dto.MomentsLikeRecordDTO;
/** 
 * @ClassName: MomentsLikeRecordDAO
 * @Description: MomentsLikeRecord的DAO接口定义类
 *  
 */
public interface MomentsLikeRecordDAO extends CommonDAO<MomentsLikeRecordDomain,Long>{
	
	/**
	 * 更新点赞记录
	* @Title: updateToDislike 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param entity
	* @return  
	* @throws
	 */
	public int updateToDislike(MomentsLikeRecordDTO entity);
	
}
