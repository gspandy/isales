/**
 * @Company 青鸟软通   
 * @Title: AreaDAO.java 
 * @Package  com.haier.isales.basicinfo.pubarea.dao
 * @author lizhenwei 
 * @date 2015年12月08日  22:33:43
 * @version V1.0   
 */
package com.haier.isales.basicinfo.pubarea.dao;

import java.util.List;

import com.haier.isales.basicinfo.pubarea.domain.AreaDomain;
import com.haier.isales.basicinfo.pubarea.dto.AreaDTO;
import com.haier.isales.common.dao.CommonDAO;
/** 
 * @ClassName: AreaDAO
 * @Description: Area的DAO接口定义类
 *  
 */
public interface AreaDAO extends CommonDAO<AreaDomain,String>{
	
	/** 
	* @Description: 根据市的行政区划编码查询区信息
	* @author lizhenwei
	* @date 2015-12-08 下午11:22:49 
	* @param paPCode
	* @return  domain
	*/ 
	List<AreaDomain> findAreaByPaPCode(AreaDomain entity);
	
}
