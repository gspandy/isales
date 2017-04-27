/**
 * @Company 青鸟软通   
 * @Title: LabelDAO.java 
 * @Package  com.haier.isales.system.label.dao
 * @author Guo Yuchao   
 * @date 2014年11月11日  15:35:06
 * @version V1.0   
 */
package com.haier.isales.system.label.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.system.dto.LabelGroupDTO;
import com.haier.isales.system.label.domain.LabelDomain;
/** 
 * @ClassName: LabelDAO
 * @Description: Label的DAO接口定义类
 *  
 */
public interface LabelDAO extends CommonDAO<LabelDomain,Long>{

	/** 
	* @Description: 根据标签组参数查找标签 
	* @author Guo Yuchao   
	* @date 2014-11-11 下午5:08:48 
	* @param labelGroupDTO
	* @return  
	*/ 
	List<LabelDomain> findByGroupParam(@Param("model")LabelGroupDTO labelGroupDTO);
	
	
	/** 
	* @Description: 使用标签住的主键集合获取包含的标签方法
	* @author Liu Wenjie   
	* @date 2014-11-15 下午2:20:44 
	* @param groupIdList
	* @return  
	*/ 
	List<LabelDomain> findByGroupList(@Param("groupIdList")List<String> groupIdList);
}
