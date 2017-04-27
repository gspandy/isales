/**
 * @Company 青鸟软通   
 * @Title: DictionaryCahe.java 
 * @Package com.jbinfo.ecms.util 
 * @author Liu Wenjie   
 * @date 2013-12-16 下午2:56:18 
 * @version V1.0   
 */
package com.haier.isales.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.bana.common.util.basic.StringUtils;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;
import com.haier.isales.system.dictionary.dao.DictionaryDAO;
import com.haier.isales.system.dictionary.dao.DictionaryTypeDAO;
import com.haier.isales.system.dto.Dictionary;
import com.haier.isales.system.dto.DictionaryType;

/**
 * @ClassName: DictionaryCahe
 * @Description: 字典缓存工具，预先存储业务字典的所有类型和对应的值，并提供获取方法
 * 
 */
public class DictionaryCache {

	private static Logger logger = Logger.getLogger(DictionaryCache.class);
	private static Map<String, List<Dictionary>> dictionary;
	private static Object locked = new Object();

	private DictionaryDAO dicDao;
	private DictionaryTypeDAO dicTypeDao;
	private static DictionaryCache dicCache;

	/**
	 * <p>
	 * 构造方法私有化
	 * </p>
	 * 
	 * @author Liu Wenjie
	 * @date 2013-12-16 下午6:47:40
	 */
	private DictionaryCache() {
		dicDao = SpringApplicationContextHolder.getBean("dictionaryDao");
		dicTypeDao = SpringApplicationContextHolder.getBean("dictionaryTypeDao");
		initialize();
	}

	// 初始化单利对象
	public void initialize() {
		logger.info("初始化业务字典缓存-------- Initializing bean " + getClass());
		dictionary = new HashMap<String, List<Dictionary>>();
		List<DictionaryType> allType = dicTypeDao.findAllBusinType();
		for (DictionaryType dictionaryType : allType) {
			List<Dictionary> dicList = dicDao.findByBusinTypeId(dictionaryType.getBusinTypeId());
			dictionary.put(dictionaryType.getBusinTypeId(), dicList);
		}
	}
	
	/**
	* @Description: 单利模式获取实例的方法
	* @author Liu Wenjie   
	* @date 2013-12-16 下午6:57:14 
	* @return
	 */
	public static DictionaryCache getInstance(){
		if(dicCache == null){
			synchronized (locked) {
				if(dicCache == null){
					dicCache = new DictionaryCache();
				}
			}
		}
		return dicCache;
	}

	/**
	 * @Description: 根据类型火炬对应的业务字典集合
	 * @author Liu Wenjie
	 * @date 2013-12-16 下午4:15:09
	 * @param dicTypeId
	 * @return
	 */
	public List<Dictionary> findDictionaryListByTypeId(String dicTypeId) {
		return dictionary.get(dicTypeId);
	}
	
	/**
	* @Description: 获取所有缓存的业务字典
	* @author Liu Wenjie   
	* @date 2013-12-17 下午1:12:42 
	* @return
	 */
	public Map<String, List<Dictionary>> findAllDictionary(){
		return dictionary;
	}
	
	/**
	* @Description: 根据类型和key值获取对应的值
	* @author Liu Wenjie   
	* @date 2013-12-17 下午6:26:58 
	* @param dicTypeId
	* @param businId
	* @return
	 */
	public String getValueByTypeAndId(String dicTypeId,String businId){
		List<Dictionary> list = dictionary.get(dicTypeId);
		if(list != null){
			for (Dictionary dictionaryDomain : list) {
				if(dictionaryDomain.getDictionaryPK().getBusinId().equalsIgnoreCase(businId)){
					return dictionaryDomain.getBusinName();
				}
			}
		}
		return "";
	}

	/**
	* @Description: 根据类型和对应的名称，获取key值
	* @author Liu Wenjie   
	* @date 2013-12-17 下午6:30:01 
	* @param dicTypeId
	* @param businId
	* @return
	 */
	public String getKeyByTypeAndName(String dicTypeId,String businName){
		List<Dictionary> list = dictionary.get(dicTypeId);
		for (Dictionary dictionaryDomain : list) {
			if(dictionaryDomain.getBusinName().equals(StringUtil.trimAll(businName))){
				return dictionaryDomain.getDictionaryPK().getBusinId();
			}
		}
		return "";
	}
	
	/** 
	* @Description: 根据【字典组编号】查询所有【有效状态的】字典项名称
	* @author Guo Yuchao   
	* @date 2014-11-19 下午10:36:56 
	* @param dicTypeId
	* @return  
	*/ 
	public List<String> getValueListByTypeId(String dicTypeId){
		List<Dictionary> list = dictionary.get(dicTypeId);
		List<String> valueList = new ArrayList<String>();
		for (Dictionary dictionaryDomain : list) {
			valueList.add(dictionaryDomain.getBusinName());
		}
		return valueList;
	}
	
	/** 
	* @Description:根据【字典组编号】查询所有【有效状态的】字典项编号  
	* @author Guo Yuchao   
	* @date 2014-11-19 下午10:42:31 
	* @param dicTypeId
	* @return  
	*/ 
	public List<String> getBusinIdsByTypeId(String dicTypeId){
		List<Dictionary> list = dictionary.get(dicTypeId);
		List<String> businIdList = new ArrayList<String>();
		for (Dictionary dictionaryDomain : list) {
			businIdList.add(dictionaryDomain.getDictionaryPK().getBusinId());
		}
		return businIdList;
	}
	/** 
	* @Description: 验证指定字典项是否在指定字典组中有效 
	* @author Guo Yuchao   
	* @date 2014-11-19 下午10:57:52 
	* @param dicTypeId
	* @param businId  
	*/ 
	public void validateBusinIdInUse(String dicTypeId,String businId){
		if(StringUtils.isEmpty(dicTypeId)){
			throw new SystemException(BusinessExceptionCode.param_error,"传入参数字典组编号为空");
		}
		if(StringUtils.isEmpty(businId)){
			throw new SystemException(BusinessExceptionCode.param_error,"传入参数字典项编号为空");
		}
		List<String> businIdList = getBusinIdsByTypeId(dicTypeId);
		if(businIdList == null || businIdList.isEmpty()){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到指定字典组");
		}
		if(!businIdList.contains(businId)){
			throw new SystemException(BusinessExceptionCode.param_error,dicTypeId+"字典中暂时不支持编号为"+businId+"的类型");
		}
	}
	
	/*======== getters and setters ==========*/
	/**
	 * @Description: 属性 dicDao 的get方法 
	 * @return dicDao
	 */
	public DictionaryDAO getDicDao() {
		return dicDao;
	}

	/**
	 * @Description: 属性 dicDao 的set方法 
	 * @param dicDao 
	 */
	public void setDicDao(DictionaryDAO dicDao) {
		this.dicDao = dicDao;
	}

	/**
	 * @Description: 属性 dicTypeDao 的get方法 
	 * @return dicTypeDao
	 */
	public DictionaryTypeDAO getDicTypeDao() {
		return dicTypeDao;
	}

	/**
	 * @Description: 属性 dicTypeDao 的set方法 
	 * @param dicTypeDao 
	 */
	public void setDicTypeDao(DictionaryTypeDAO dicTypeDao) {
		this.dicTypeDao = dicTypeDao;
	}
}

