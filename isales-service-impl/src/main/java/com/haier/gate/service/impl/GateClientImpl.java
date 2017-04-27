package com.haier.gate.service.impl;

import com.haier.gate.dto.UserBehaviourByHandDTO;
import com.haier.gate.service.GateClient;
import com.haier.gate.service.GateService;


public class GateClientImpl implements GateClient{
    
    GateService gateService;

    @Override
    public Object isGateService(UserBehaviourByHandDTO userBehaviourByHandDTO) {
        return gateService.isGateLocationService(userBehaviourByHandDTO);
    }

    public GateService getGateService() {
        return gateService;
    }

    public void setGateService(GateService gateService) {
        this.gateService = gateService;
    }

    
    
}
