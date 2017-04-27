/**
* @Company 青鸟软通   
* @Title: DictionaryService.java 
* @Package com.haier.isales.system.dictionary.service.impl 
* @author Guo Yuchao   
* @date 2014-11-12 下午4:43:58 
* @version V1.0   
*/ 
package com.haier.isales.system.dictionary.service;

import java.util.List;


/** 
 * @ClassName: DictionaryService 
 * @Description:数据字典业务
 * @author Richard Core
 *  
 */
public interface DictionaryService {
	/** 
	* @Description: 根据【字典组编号】查询所有【有效状态的】字典项编号  
	* @author Guo Yuchao   
	* @date 2014-11-19 下午10:01:50 
	* @param businTypeId
	* @return  
	*/ 
	List<String> findBusinIdsByBusinTypeId(String businTypeId);
}
