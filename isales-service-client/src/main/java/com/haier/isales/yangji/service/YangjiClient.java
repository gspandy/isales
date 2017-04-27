package com.haier.isales.yangji.service;

import com.haier.isales.yangji.dto.YangjiDTO;

public interface YangjiClient {
	
	Object saveYangjiClient(YangjiDTO yangjiDTO);

	Object findMsgListByUserCode(String userCode);

	void updateMsgById(String id);

}
