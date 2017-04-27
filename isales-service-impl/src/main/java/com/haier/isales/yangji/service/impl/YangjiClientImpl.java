package com.haier.isales.yangji.service.impl;

import com.haier.isales.quartz.yangji.service.YangjiService;
import com.haier.isales.yangji.dto.YangjiDTO;
import com.haier.isales.yangji.service.YangjiClient;

/**
 * 
 * @author wangpeng
 * @desc  样机签收预警保存
 */
public class YangjiClientImpl implements YangjiClient{
	
	YangjiService yangjiService;

	@Override
	public Object saveYangjiClient(YangjiDTO yangjiDTO) {
		return yangjiService.saveYanfjiService(yangjiDTO);
	}
	
	@Override
	public Object findMsgListByUserCode(String userCode) {
		return yangjiService.findMsgListByUserCode(userCode);
	}
	
	@Override
	public void updateMsgById(String id) {
		yangjiService.updateMsgById(id);
	}
	

	public void setYangjiService(YangjiService yangjiService) {
		this.yangjiService = yangjiService;
	}

	public YangjiService getYangjiService() {
		return yangjiService;
	}
}
