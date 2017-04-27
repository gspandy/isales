/**
 * @Company 青鸟软通   
 * @Title: PersonalmodelService.java 
 * @Package  com.haier.isales.retail.personalmodel.service
 * @author Cao Rui   
 * @date 2014年12月03日  10:56:44
 * @version V1.0   
 */
package com.haier.isales.retail.personalmodel.service;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.retail.personalmodel.domain.PersonalmodelDomain;
import com.haier.isales.retail.personalmodel.dto.PersonalModelAddDto;
import com.haier.isales.retail.personalmodel.dto.PersonalModelQueryDto;

/** 
 * @ClassName: PersonalmodelService
 * @Description: Personalmodel的Service接口定义类
 *  
 */
public interface PersonalmodelService {

	/**
	 * 
	* @Title: getPersonalmodelList 
	* @Description: 查询指定直销员常用的型号
	* @param queryDto
	* @param pageCond
	* @return  
	* @throws
	 */
	public PageResult<PersonalmodelDomain> getPersonalmodelList(PersonalModelQueryDto queryDto,PageCond pageCond) ;
	
	
	/**
	 * 
	* @Title: savePersonalModel 
	* @Description: 直销员添加常用型号
	* @param addDto  
	* @throws
	 */
	public void savePersonalModel(PersonalModelAddDto addDto);

	/**
	 * 
	* @Title: deletePersonalModel 
	* @Description: 直销员删除常用型号 
	* @param deleteDto  
	* @throws
	 */
	public void deletePersonalModel(PersonalModelQueryDto deleteDto);
	
		
}
