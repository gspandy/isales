/**
* @Company 青鸟软通   
* @Title: DictionaryServiceImpl.java 
* @Package com.haier.isales.system.dictionary.service.impl 
* @author Guo Yuchao   
* @date 2014-11-12 下午5:18:50 
* @version V1.0   
*/ 
package com.haier.isales.system.dictionary.service.impl;

import java.util.List;

import org.bana.common.util.basic.StringUtils;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.system.dictionary.dao.DictionaryDAO;
import com.haier.isales.system.dictionary.dao.DictionaryTypeDAO;
import com.haier.isales.system.dictionary.service.DictionaryService;


/** 
 * @ClassName: DictionaryServiceImpl 
 * @Description: 数据字典业务实现
 *  
 */
public class DictionaryServiceImpl implements DictionaryService {
	private DictionaryDAO dictionaryDao;
	private DictionaryTypeDAO dictionaryTypeDao;
	/**
	* <p>Description: 根据【字典组编号】查询所有【有效状态的】字典项编号  </p> 
	* @author Guo Yuchao   
	* @date 2014-11-19 下午10:05:33 
	* @param businTypeId
	* @return 
	* @see com.haier.isales.system.dictionary.service.DictionaryService#findBusinIdsByBusinTypeId(java.lang.String) 
	*/ 
	@Override
	public List<String> findBusinIdsByBusinTypeId(String businTypeId) {
		if(StringUtils.isEmpty(businTypeId)){
			throw new BusinessException(BusinessExceptionCode.param_error,"传入字典组编号为空");
		}
		List<String> businIds = dictionaryDao.findBusinIdsByBusinTypeId(businTypeId);
		return businIds;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*=========  getters  and   setters  ==========*/
	/**
	 * @Description: 属性 dictionaryDao 的get方法 
	 * @return dictionaryDao
	 */
	public DictionaryDAO getDictionaryDao() {
		return dictionaryDao;
	}
	/**
	 * @Description: 属性 dictionaryDao 的set方法 
	 * @param dictionaryDao 
	 */
	public void setDictionaryDao(DictionaryDAO dictionaryDao) {
		this.dictionaryDao = dictionaryDao;
	}
	/**
	 * @Description: 属性 dictionaryTypeDao 的get方法 
	 * @return dictionaryTypeDao
	 */
	public DictionaryTypeDAO getDictionaryTypeDao() {
		return dictionaryTypeDao;
	}
	/**
	 * @Description: 属性 dictionaryTypeDao 的set方法 
	 * @param dictionaryTypeDao 
	 */
	public void setDictionaryTypeDao(DictionaryTypeDAO dictionaryTypeDao) {
		this.dictionaryTypeDao = dictionaryTypeDao;
	}

}
