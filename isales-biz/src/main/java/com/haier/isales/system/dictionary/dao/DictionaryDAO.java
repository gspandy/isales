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
import com.haier.isales.system.dto.Dictionary;
import com.haier.isales.system.dto.DictionaryPK;

/** 
 * @ClassName: DictionaryDAO 
 * @Description: 业务字典类的DAO实现
 *  
 */
public interface DictionaryDAO extends CommonDAO<Dictionary, DictionaryPK>{

	
	/** 
	* @Description: 根据类型id查找所有的dictionary对象
	* @author Liu Wenjie   
	* @date 2013-11-19 上午10:50:49 
	* @param dicTypeId
	* @return  
	*/ 
	List<Dictionary> findByBusinTypeId(@Param("businTypeId")String businTypeId);
	
	
	
	/**
	* @Description: 根据字典类型id和字典项对应的名称，查询字典实体对象
	* @author Liu Wenjie   
	* @date 2013-11-27 下午7:54:18 
	* @param dicTypeId
	* @param busiName
	* @return
	 */
	Dictionary findDictionaryByTypeIdBusinName(@Param("businTypeId")String businTypeId,@Param("businName")String businName);
	
	/** 
	* @Description: 根据字典类型id和字典项id，查询字典实体对象
	* @author Zhao Junfeng    
	* @date 2014-1-22 下午7:25:48 
	* @param dicTypeId
	* @param busiId
	* @return  
	*/ 
	public Dictionary findDictionaryByTypeIdBusinId(@Param("businTypeId")String businTypeId,@Param("businId")String businId);
	
	/** 
	* @Description: 根据字典组编号查询所有字典项编号
	* @author Guo Yuchao   
	* @date 2014-11-19 下午10:01:50 
	* @param businTypeId
	* @return  
	*/ 
	List<String> findBusinIdsByBusinTypeId(@Param("businTypeId")String businTypeId);
}
