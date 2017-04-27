/**
* @Company 青鸟软通   
* @Title: PotentialCustomerClientImpl.java 
* @Package com.haier.isales.customer.impl 
* @author Cao Rui   
* @date 2014-11-12 下午2:16:45 
* @version V1.0   
*/ 
package com.haier.isales.retail.personalmodel.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.retail.personalmodel.PersonalModelDomainDtoUtil;
import com.haier.isales.retail.personalmodel.domain.PersonalmodelDomain;
import com.haier.isales.retail.personalmodel.dto.PersonalModelAddDto;
import com.haier.isales.retail.personalmodel.dto.PersonalModelDto;
import com.haier.isales.retail.personalmodel.dto.PersonalModelQueryDto;
import com.haier.isales.retail.personalmodel.service.PersonalModelSelectClient;
import com.haier.isales.retail.personalmodel.service.PersonalModelUpdateClient;
import com.haier.isales.retail.personalmodel.service.PersonalmodelService;

/** 
 * @ClassName: PersonalModelClientImpl 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class PersonalModelClientImpl implements PersonalModelSelectClient,PersonalModelUpdateClient{
	
	private static Logger logger = Logger.getLogger(PersonalModelClientImpl.class);
	private PersonalmodelService personalmodelService;
	
	/**
	 * 
	* @Title: getPersonalmodelList 
	* @Description: 查询常用型号列表
	* @param queryDto
	* @param currentPage
	* @param pageSize
	* @return  
	* @throws
	 */
	@Override
	public PageResult<PersonalModelDto> getPersonalmodelList(PersonalModelQueryDto queryDto,Integer currentPage,Integer pageSize){
		
		logger.info("查询常用型号列表的dubbo方法");
		//如果分页条件为空，则赋默认值，不允许查询数据库的全部结果
		Integer pageNo = currentPage;
		Integer numPerPage = pageSize;
		if(pageNo == null){
			pageNo = 1;
		}
		if(numPerPage == null){
			numPerPage = 10;
		}
		
		PageResult<PersonalmodelDomain> pageResult = personalmodelService.getPersonalmodelList(queryDto, new PageCond(pageNo,numPerPage));
		//将PageResult中的信息 由domain转为
		List<PersonalModelDto> dtoList = new ArrayList<PersonalModelDto>();
		for (PersonalmodelDomain domain : pageResult.getResultList()) {
			PersonalModelDto dto = PersonalModelDomainDtoUtil.clonePersonalmodelDomain2DTO(domain);
			dtoList.add(dto);
		}
		return new PageResult<PersonalModelDto>(dtoList, pageResult.getPageCond());
	}
	
	/**
	 * 
	* @Title: savePersonalModel 
	* @Description: 直销员添加常用型号
	* @param addDto
	* @return  
	* @throws
	 */
	@Override
	public Object savePersonalModel(PersonalModelAddDto addDto){
		logger.info("直销员添加常用型号的dubbo方法");
		personalmodelService.savePersonalModel(addDto);
		return null;
	}
	/**
	 * 
	* @Title: deletePersonalModel 
	* @Description:  直销员删除常用型号
	* @param deleteDto
	* @return  
	* @throws
	 */
	@Override
	public Object deletePersonalModel(PersonalModelQueryDto deleteDto){
		logger.info("直销员删除常用型号的dubbo方法");
		personalmodelService.deletePersonalModel(deleteDto);
		return null;
	}
	

	/*==================getter/setter=================================*/

	/**
	 * @Description: 属性 personalmodelService 的set方法 
	 * @param personalmodelService 
	 */
	public void setPersonalmodelService(PersonalmodelService personalmodelService) {
		this.personalmodelService = personalmodelService;
	}
	

}
