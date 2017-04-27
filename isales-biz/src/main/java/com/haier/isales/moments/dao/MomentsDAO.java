/**
 * @Company 青鸟软通   
 * @Title: MomentsDAO.java 
 * @Package  com.haier.isales.moments.dao
 * @author Cao Rui   
 * @date 2014年11月19日  12:09:03
 * @version V1.0   
 */
package com.haier.isales.moments.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bana.common.util.page.PageCond;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.moments.domain.MomentsDomain;
import com.haier.isales.moments.dto.MomentsDTO;
import com.haier.isales.moments.dto.MomentsQueryDTO;
/** 
 * @ClassName: MomentsDAO
 * @Description: Moments的DAO接口定义类
 *  
 */
public interface MomentsDAO extends CommonDAO<MomentsDomain,Long>{
	
	/**
	 * 
	* @Title: findDtoListByParams 
	* @Description: TODO 获取entity条件下的朋友圈内容，按照分页
	* @param queryDto
	* @return  
	* @throws
	 */
	public List<MomentsDTO> findDtoListByParams(@Param("queryDto")MomentsQueryDTO queryDto,@Param("pageCond")PageCond pageCond);
	
	/**
	 * 获取该查询条件下的总条数
	* @Title: findDtoCountByParams 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDto
	* @return  
	* @throws
	 */
	public int findDtoCountByParams(@Param("queryDto")MomentsQueryDTO queryDto);
	
	/**
	 * 
	* @Title: findTable 
	* @Description: 查询表是否存在
	* @param queryDto
	* @return  
	* @throws
	 */
	public String findTable(@Param("queryDto")MomentsQueryDTO queryDto);
	/**
	 * 
	* @Title: updateLikeCount 
	* @Description: 朋友圈点赞，更新操作（该方法支持取消赞）
	* @param entity
	* @return  
	* @throws
	 */
	public int updateLikeCount(MomentsDomain entity);
	
	
	/** 
	* @Description: 
	* @author Liu Wenjie   
	* @date 2014-11-25 下午5:17:19 
	* @param suffer
	* @param id
	* @return  
	*/ 
	public MomentsDomain findByIdWithSuffix(@Param("suffix")String suffer,@Param("id")Long id);

	/** 
	* @Description: 
	* @author Liu Wenjie   
	* @date 2014-11-25 下午7:47:05 
	* @param index
	* @param momentsDomain  
	*/ 
	public void updateWithSuffix(@Param("suffix")String suffer, @Param("update")MomentsDomain momentsDomain);
	
}
