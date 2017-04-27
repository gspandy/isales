/**
* @Company 青鸟软通   
* @Title: SysUserDAO.java
* @Package com.haier.isales.app.dao
* @author lizhenwei
* @date 2016-3-24下午7:14:11
* @version V1.0   
*/ 
package com.haier.isales.app.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.app.domain.SurveyUserRefDomain;
import com.haier.isales.app.dto.SurveyQuestionDTO;
import com.haier.isales.common.dao.CommonDAO;

/** 
 * @ClassName: SysUserDAO
 * @Description: SysUser的DAO接口定义类
 *  
 */
public interface SurveyUserRefDAO extends CommonDAO<SurveyUserRefDomain, Long> {
	/**
	 *  根据条件更新调查问卷状态
	* @Title: updateStatus 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDTO
	* @return  
	* @throws
	 */
	public Integer updateSurveyRefStatus(@Param("queryDTO") SurveyQuestionDTO queryDTO);
	
	/**
	 *  根据条件查询调查问卷状态
	* @Title: findSurveyUserList 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @param queryDTO
	* @return  
	* @throws
	 */
	public Integer findSurveyUserList(@Param("queryDTO") SurveyQuestionDTO queryDTO);
}
