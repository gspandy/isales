/**
 * @Company 青鸟软通   
 * @Title: CommentsDAO.java 
 * @Package  com.haier.isales.moments.dao
 * @author Cao Rui   
 * @date 2014年11月20日  16:56:37
 * @version V1.0   
 */
package com.haier.isales.moments.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bana.common.util.page.PageCond;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.moments.domain.CommentsDomain;
import com.haier.isales.moments.dto.CommentsDTO;
import com.haier.isales.moments.dto.CommentsQueryDTO;
/** 
 * @ClassName: CommentsDAO
 * @Description: Comments的DAO接口定义类
 *  
 */
public interface CommentsDAO extends CommonDAO<CommentsDomain,Long>{
	
	/**
	 * 
	* @Title: findDtoListByParams 
	* @Description: TODO 获取entity条件下的朋友圈内容，按照分页
	* @param queryDto
	* @return  
	* @throws
	 */
	public List<CommentsDTO> findDtoListByParams(@Param("queryDto")CommentsQueryDTO queryDto,@Param("pageCond")PageCond pageCond);
	
	/**
	 * 获取该查询条件下的总条数
	* @Title: findDtoCountByParams 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDto
	* @return  
	* @throws
	 */
	public int findDtoCountByParams(@Param("queryDto")CommentsQueryDTO queryDto);
	
	
	/**
	 * 
	* @Title: findTable 
	* @Description: 查询表是否存在
	* @param queryDto
	* @return  
	* @throws
	 */
	public String findTable(@Param("queryDto")CommentsQueryDTO queryDto);
	
	
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author Liu Wenjie   
	* @date 2014-11-25 下午7:29:43 
	* @param suffer
	* @param id
	* @return  
	*/ 
	public CommentsDomain findByIdWithSuffix(@Param("suffix")String suffix,@Param("id")Long id);
	
	
	/** 
	* @Description: 
	* @author Liu Wenjie   
	* @date 2014-11-25 下午7:47:05 
	* @param index
	* @param momentsDomain  
	*/ 
	public void updateWithSuffix(@Param("suffix")String suffix, @Param("update")CommentsDomain entity);
	
}
