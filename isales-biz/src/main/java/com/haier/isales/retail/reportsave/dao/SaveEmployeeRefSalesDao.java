package com.haier.isales.retail.reportsave.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.retail.reportsales.domain.ReportsalesDomain;

public interface SaveEmployeeRefSalesDao {
	
	void saveSaleInfo(@Param("model")ReportsalesDomain reportsalesDomain,@Param("categoryE")String categoryE,@Param("categoryEName")String categoryEName,@Param("prdn")String prdn);

}
