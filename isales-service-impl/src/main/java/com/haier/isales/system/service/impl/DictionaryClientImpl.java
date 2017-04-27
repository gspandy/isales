/**
* @Company 青鸟软通   
* @Title: DictionaryClientImpl.java 
* @Package com.haier.isales.system.service.impl 
* @author Guo Yuchao   
* @date 2014-11-12 下午6:10:21 
* @version V1.0   
*/ 
package com.haier.isales.system.service.impl;

import java.util.List;
import java.util.Map;

import com.haier.isales.common.DictionaryCache;
import com.haier.isales.system.dto.Dictionary;
import com.haier.isales.system.service.DictionaryClient;

/** 
 * @ClassName: DictionaryClientImpl 
 * @Description:数据字典对外接口实现
 *  
 */
public class DictionaryClientImpl implements DictionaryClient{
	/**
	* <p>Description:根据字典组编号返回本类字典子项 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-12 下午6:10:36 
	* @param dicTypeId
	* @return 
	* @see com.haier.isales.system.service.DictionaryClient#findDictionaryListByTypeId(java.lang.String) 
	*/ 
	@Override
	public List<Dictionary> findDictionaryListByTypeId(String dicTypeId) {
		return DictionaryCache.getInstance().findDictionaryListByTypeId(dicTypeId);
	}

	/**
	* <p>Description: </p> 
	* @author Guo Yuchao   
	* @date 2014-11-22 下午2:19:46 
	* @return 
	* @see com.haier.isales.system.service.DictionaryClient#findAllDictionary() 
	*/ 
	@Override
	public Map<String, List<Dictionary>> findAllDictionary() {
		
		return DictionaryCache.getInstance().findAllDictionary();
	}

	/**
	* <p>Description:刷新数据字典缓存的方法 </p> 
	* @author Guo Yuchao   
	* @date 2014-11-24 上午11:56:15 
	* @return 
	* @see com.haier.isales.system.service.DictionaryClient#refreshDictionaryCache() 
	*/ 
	@Override
	public String refreshDictionaryCache() {		
		DictionaryCache.getInstance().initialize();
		return "success";
	}

	/**
	* <p>Description: 根据类型和key值获取对应的值</p> 
	* @author Guo Yuchao   
	* @date 2014-11-24 下午12:04:52 
	* @param dicTypeId
	* @param businId
	* @return 
	* @see com.haier.isales.system.service.DictionaryClient#getValueByTypeAndId(java.lang.String, java.lang.String) 
	*/ 
	@Override
	public String getValueByTypeAndId(String dicTypeId, String businId) {
		return DictionaryCache.getInstance().getValueByTypeAndId(dicTypeId, businId);
	}
	

}
