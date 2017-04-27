package com.haier.gate.service;

import com.haier.gate.dto.UserBehaviourByHandDTO;


public interface GateClient {
    
    /**
     * @Title:isGateLocationService
     * @Description:是否开启地理位置检测
     * @return
     */
    public Object isGateService(UserBehaviourByHandDTO userBehaviourByHandDTO);

}
