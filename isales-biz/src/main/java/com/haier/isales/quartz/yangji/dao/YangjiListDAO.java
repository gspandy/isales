package com.haier.isales.quartz.yangji.dao;

import java.util.List;

import com.haier.isales.quartz.yangji.domain.FindListYangjiDomain;

public interface YangjiListDAO {
	
	
	List<FindListYangjiDomain> findMsgListByUserCode(String userCode);

	void updateMsgById(int id);

}
