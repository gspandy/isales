package com.haier.isales.quartz.yangji.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.quartz.yangji.domain.YangjiDomain;

public interface YangjiDAO{
	
	Long saveYangjiDao(@Param("entity") YangjiDomain yangjiDomain);

}
