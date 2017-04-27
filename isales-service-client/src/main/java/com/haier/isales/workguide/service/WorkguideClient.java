package com.haier.isales.workguide.service;

import com.haier.isales.salerinfo.personalinfo.dto.PersonalFullInfoDTO;

import io.terminus.pampas.client.Export;

public interface WorkguideClient {
	/** 
	* @Description: TODO 查找所有workguide对象
	* @author Shao Jingkai   
	* @date 2015-6-11 下午2:57:09 
	* @return  
	*/ 
	@Export(paramNames = {"fullInfo"})
	Object findAllWorkguide(PersonalFullInfoDTO fullInfo);
}
