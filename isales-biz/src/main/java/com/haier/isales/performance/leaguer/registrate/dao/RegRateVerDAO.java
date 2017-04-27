/**
 * @Company 青鸟软通   
 * @Title: RegRateVerDAO.java 
 * @Package  com.haier.isales.performance.leaguer.registrate.dao
 * @author Guo Yuchao   
 * @date 2014年12月18日  10:12:17
 * @version V1.0   
 */
package com.haier.isales.performance.leaguer.registrate.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.performance.leaguer.dto.RegistDTO;
import com.haier.isales.performance.leaguer.registrate.domain.RegRateVerDomain;
/** 
 * @ClassName: RegRateVerDAO
 * @Description: RegRateVer的DAO接口定义类
 *  
 */
public interface RegRateVerDAO extends CommonDAO<RegRateVerDomain,Long>{

	/** 
	* @Description: 根据     门店id、月份 、产品线   条件查询注册率
	* @author Guo Yuchao   
	* @date 2014-12-18 下午2:04:09 
	* @param registDTO
	* @param productLineList
	* @return  
	*/ 
	RegistDTO findRegistInfoByParam(@Param("model")RegistDTO registDTO,
			@Param("productLineList")List<String> productLineList);
	
	
	/** 
	* @Description: 返回从现在往前12月的注册率信息
	* @author Guo Yuchao   
	* @date 2014-12-19 下午2:13:04 
	* @param registDTO
	* @param productLineList
	* @return  
	*/ 
	List<RegistDTO> findRegistChartByParam(@Param("model")RegistDTO registDTO,
			@Param("productLineList")List<String> productLineList);
	
}
