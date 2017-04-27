package com.haier.isales.workguide.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.haier.isales.salerinfo.personalinfo.dto.PersonalFullInfoDTO;
import com.haier.isales.system.user.domain.UserFullInfoDomain;
import com.haier.isales.workguide.domain.WorkguideDomain;
import com.haier.isales.workguide.dto.WorkguideDTO;
import com.haier.isales.workguide.service.WorkguideClient;
import com.haier.isales.workguide.service.WorkguideService;

public class WorkguideClientImpl implements WorkguideClient{
	private WorkguideService workguideService;
	/**
	* <p>Description: 查找所有workguide对象</p> 
	* @author Shao Jingkai   
	* @date 2015-6-11 下午2:59:54 
	* @return 
	* @see com.haier.isales.workguide.service.WorkguideClient#findAllWorkguide() 
	*/ 
	@Override
	public Object findAllWorkguide(PersonalFullInfoDTO fullInfo) {
		UserFullInfoDomain fullInfoDomain = new UserFullInfoDomain();
		BeanUtils.copyProperties(fullInfo, fullInfoDomain);
		List<WorkguideDomain> domainList = workguideService.findAll(fullInfoDomain);
		List<WorkguideDTO> dtoList = new ArrayList<WorkguideDTO>();
		for (WorkguideDomain domain : domainList) {
			WorkguideDTO dto = new WorkguideDTO();
			BeanUtils.copyProperties(domain, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}
	
	//============getters&setters===============
	/**
	 * @Description: 属性 workguideService 的get方法 
	 * @return workguideService
	 */
	public WorkguideService getWorkguideService() {
		return workguideService;
	}
	/**
	 * @Description: 属性 workguideService 的set方法 
	 * @param workguideService 
	 */
	public void setWorkguideService(WorkguideService workguideService) {
		this.workguideService = workguideService;
	}

}
