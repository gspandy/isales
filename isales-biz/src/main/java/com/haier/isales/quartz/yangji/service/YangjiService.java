package com.haier.isales.quartz.yangji.service;

import com.haier.isales.yangji.dto.YangjiDTO;


public interface YangjiService {
	
	Long saveYanfjiService(YangjiDTO yangjiDTO);

	Object findMsgListByUserCode(String userCode);

	void updateMsgById(String id);

}
