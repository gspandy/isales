package com.haier.gate.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.gate.dto.UserBehaviourByHandDTO;
import com.haier.gate.service.GateClient;
import com.haier.isales.common.DubboResult;
import com.haier.isales.test.BaseIsalesClientTestCase;
@ContextConfiguration(locations = {
		"classpath*:/spring/behaviour/spring-behaviourCommon.xml",
		"classpath*:/spring/gate/spring-gate.xml",
		"classpath*:/spring_service/gate/spring-gate-provider.xml"
		})
public class GateLocationClientImplTest extends BaseIsalesClientTestCase{
	
	@Resource
	GateClient gateClient;
	
	@Test
	public void isGateLocationServiceTest(){
		UserBehaviourByHandDTO userBehaviourByHandDTO=new UserBehaviourByHandDTO();
		userBehaviourByHandDTO.setType("locationService");
		DubboResult isGate=(DubboResult) gateClient.isGateService(userBehaviourByHandDTO);
		UserBehaviourByHandDTO dto=(UserBehaviourByHandDTO)isGate.getResultBean();
		System.out.println(dto.toString());
	}

}
