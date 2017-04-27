package com.haier.gate.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.gate.dto.UserBehaviourByHandDTO;
import com.haier.gate.service.GateService;
import com.haier.isales.BaseIsalesTestCase;

@ContextConfiguration(locations = {
		"classpath*:/spring/behaviour/spring-behaviourCommon.xml",
		"classpath*:/spring/gate/spring-gate.xml",})
public class GateLocationServiceImplTest extends BaseIsalesTestCase{
	
	@Resource
	GateService gateService;
	
	@Test
	public void isRecordingByHandLocationDaoTest(){
		UserBehaviourByHandDTO userBehaviourByHandDTO =new UserBehaviourByHandDTO();
		userBehaviourByHandDTO.setType("locationService");
		UserBehaviourByHandDTO res=gateService.isGateLocationService(userBehaviourByHandDTO);
		System.out.println(res);
	}
}
