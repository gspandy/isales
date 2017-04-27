package com.haier.gate.service.impl;

import com.haier.gate.dto.UserBehaviourByHandDTO;
import com.haier.gate.service.GateService;
import com.haier.isales.behaviour.userbehaviourcom.dao.UserBehaviourComByHandDAO;
import com.haier.isales.behaviour.userbehaviourcom.domain.UserBehaviourByHandDomain;
import com.haier.isales.common.ClonePojoUtil;


public class GateServiceImpl  implements GateService{
	
	UserBehaviourComByHandDAO userBehaviourComByHandDAO;
	
	@Override
	public UserBehaviourByHandDTO isGateLocationService(UserBehaviourByHandDTO userBehaviourByHandDTO) {
		UserBehaviourByHandDomain domain=new UserBehaviourByHandDomain();
		domain.setType(userBehaviourByHandDTO.getType());
		UserBehaviourByHandDomain userBehaviourByHandDomain =userBehaviourComByHandDAO.isRecordingByServiceDao(domain);
//		AppDomainDtoUtil
		UserBehaviourByHandDTO dto = new UserBehaviourByHandDTO();
		if(null != userBehaviourByHandDomain){
			dto = ClonePojoUtil.copyClassFromTo(userBehaviourByHandDomain, UserBehaviourByHandDTO.class);
		}
		return dto;
	}

	public void setUserBehaviourComByHandDAO(UserBehaviourComByHandDAO userBehaviourComByHandDAO) {
		this.userBehaviourComByHandDAO = userBehaviourComByHandDAO;
	}

}
