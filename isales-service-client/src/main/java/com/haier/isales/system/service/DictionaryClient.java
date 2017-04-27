/**
* @Company 青鸟软通   
* @Title: DictionaryClient.java 
* @Package com.haier.isales.system.service 
* @author Guo Yuchao   
* @date 2014-11-12 下午5:42:50 
* @version V1.0   
*/ 
package com.haier.isales.system.service;

import io.terminus.pampas.client.Export;

/** 
 * @ClassName: DictionaryClient 
 * @Description: 数据字典对外发布的dubbo接口
 *  
 */
public interface DictionaryClient {
	/** 
	* @Description: 根据字典组编号返回本类字典子项
	* @author Guo Yuchao   
	* @date 2014-11-12 下午5:10:33 
	* @param dicTypeId
	* @return  
	*/ 
	@Export(paramNames = {"dicTypeId"})
	Object findDictionaryListByTypeId(String dicTypeId);
	/** 
	* @Description: 返回所有数据字典
	* @author Guo Yuchao   
	* @date 2014-11-22 下午2:19:05 
	* @return  
	*/ 
	@Export(paramNames = {})
	Object findAllDictionary();
	/** 
	* @Description: 刷新数据字典缓存的方法
	* @author Guo Yuchao   
	* @date 2014-11-24 上午11:55:45 
	* @return  
	*/ 
	@Export(paramNames = {})
	Object refreshDictionaryCache();
	/** 
	* @Description:根据类型和key值获取对应的值
	* @author Guo Yuchao   
	* @date 2014-11-24 下午12:04:28 
	* @param dicTypeId
	* @param businId
	* @return  
	*/ 
	@Export(paramNames = {"dicTypeId","businId"})
	Object getValueByTypeAndId(String dicTypeId,String businId);
	
	
	
}
