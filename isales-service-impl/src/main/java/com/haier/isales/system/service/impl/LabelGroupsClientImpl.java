/**
* @Company 青鸟软通   
* @Title: LabelGroupsClientImpl.java 
* @Package com.haier.isales.system.service.impl 
* @author Liu Wenjie   
* @date 2014-11-21 下午10:08:51 
* @version V1.0   
*/ 
package com.haier.isales.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.haier.isales.system.DomainDtoUtil;
import com.haier.isales.system.dto.LabelGroupDTO;
import com.haier.isales.system.labelgroup.domain.LabelGroupDomain;
import com.haier.isales.system.labelgroup.service.LabelGroupService;
import com.haier.isales.system.service.LabelGroupsSelectClient;

/** 
 * @ClassName: LabelGroupsClientImpl 
 * @Description: 标签组的产讯
 *  
 */
public class LabelGroupsClientImpl implements LabelGroupsSelectClient{
	
	private LabelGroupService labelGroupService;

	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2014-11-21 下午10:10:13 
	* @param operatorId
	* @return 
	* @see com.haier.isales.system.service.LabelGroupsSelectClient#findGroupsByUser(java.lang.Long) 
	*/ 
	@Override
	public List<LabelGroupDTO> findGroupsByUser(Long operatorId) {
		List<LabelGroupDomain> labelGroups = labelGroupService.findGroupsByUser(operatorId);
		List<LabelGroupDTO> labelDtoList = new ArrayList<LabelGroupDTO>();
		if(labelGroups != null && !labelGroups.isEmpty()){
			for (LabelGroupDomain labelGroupDomain : labelGroups) {
				LabelGroupDTO labelGroupDTO = DomainDtoUtil.cloneLabelGroupDomain2DTO(labelGroupDomain);
				labelDtoList.add(labelGroupDTO);
			}
		}
		return labelDtoList;
	}

	
	/*==================getter and setter =======================*/
	/**
	 * @Description: 属性 labelGroupService 的set方法 
	 * @param labelGroupService 
	 */
	public void setLabelGroupService(LabelGroupService labelGroupService) {
		this.labelGroupService = labelGroupService;
	}

	
}
