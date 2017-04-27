/**
 * @Company 青鸟软通   
 * @Title: CityDAO.java 
 * @Package  com.haier.isales.basicinfo.pubarea.dao
 * @author lizhenwei   
 * @date 2015年12月08日  22:13:43
 * @version V1.0   
 */
package com.haier.isales.basicinfo.pubarea.dao;

import java.util.List;

import com.haier.isales.basicinfo.pubarea.domain.CityDomain;
import com.haier.isales.basicinfo.pubarea.dto.CityDTO;
import com.haier.isales.common.dao.CommonDAO;
/** 
 * @ClassName: CityDAO
 * @Description: City的DAO接口定义类
 *  
 */
public interface CityDAO extends CommonDAO<CityDomain,String>{
	
	/** 
	* @Description: 根据省的行政区划编码查询城市信息
	* @author lizhenwei
	* @date 2015-11-05 上午10:26:49 
	* @param paPCode
	* @return  domain
	*/ 
	List<CityDomain> findCityInfoByPaPCode(CityDomain queryEntity);
	
}
