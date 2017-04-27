/**
* @Company 青鸟软通   
* @Title: DictionaryDAO.java 
* @Package com.jbinfo.ecms.sys.dao 
* @author Liu Wenjie   
* @date 2013-11-19 上午10:34:07 
* @version V1.0   
*/ 
package com.haier.isales.system.dictionary.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.system.dto.DictionaryType;

/** 
 * @ClassName: DictionaryDAO 
 * @Description: 业务字典类的DAO实现
 *  
 */
public interface DictionaryTypeDAO extends CommonDAO<DictionaryType, String>{

	/** 
	* @Description:根据指定字典类型名称查找字典组
	* @author Guo Yuchao   
	* @date 2014-10-30 下午6:21:54 
	* @param busintypeName
	* @return  
	*/ 
	DictionaryType findByBusinTypeName(@Param("busintypeName")String busintypeName);
	
	
	/** 
	* @Description: 查询所有有效字典组
	* @author Guo Yuchao   
	* @date 2014-10-30 下午7:02:44 
	* @return  
	*/ 
	List<DictionaryType> findAllBusinType();
}
