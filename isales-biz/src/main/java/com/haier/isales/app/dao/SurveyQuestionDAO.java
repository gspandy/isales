/**
* @Company 青鸟软通   
* @Title: SysUserDAO.java
* @Package com.haier.isales.app.dao
* @author lizhenwei
* @date 2016-3-24下午7:14:11
* @version V1.0   
*/ 
package com.haier.isales.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.app.domain.SurveyQuestionDomain;
import com.haier.isales.app.dto.SurveyQuestionDTO;
import com.haier.isales.common.dao.CommonDAO;

/** 
 * @ClassName: SysUserDAO
 * @Description: SysUser的DAO接口定义类
 *  
 */
public interface SurveyQuestionDAO extends CommonDAO<SurveyQuestionDomain, Long> {
	/**
	 * 
	* @Title: findSurveyList
	* @Description: 获取用户调查问卷列表
	* @param 
	* @return  
	* @throws
	 */
	List<SurveyQuestionDomain> findSurveyQuestionList(@Param("queryDTO") SurveyQuestionDTO queryDTO);
	
}
