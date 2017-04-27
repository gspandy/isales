/**
 * @Company 青鸟软通   
 * @Title: CardSetRateDAO.java 
 * @Package  com.haier.isales.performance.leaguer.cardsetrate.dao
 * @author Guo Yuchao   
 * @date 2014年12月22日  13:48:26
 * @version V1.0   
 */
package com.haier.isales.performance.leaguer.cardsetrate.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.performance.leaguer.cardsetrate.domain.CardSetRateDomain;
import com.haier.isales.performance.leaguer.dto.RegistDTO;
/** 
 * @ClassName: CardSetRateDAO
 * @Description: CardSetRate的DAO接口定义类
 *  
 */
public interface CardSetRateDAO extends CommonDAO<CardSetRateDomain,Long>{
	
	/** 
	* @Description: 查询套购率信息   根据     门店id、月份 （开始结束时间字符串yyyy-MM）、产品线   条件
	* @author Guo Yuchao   
	* @date 2014-12-22 下午4:38:53 
	* @param registDTO
	* @param productLineList
	* @return  
	*/ 
	List<RegistDTO> findCardSetRateByParam(@Param("model")RegistDTO registDTO,
			@Param("productLineList")List<String> productLineList);
}
