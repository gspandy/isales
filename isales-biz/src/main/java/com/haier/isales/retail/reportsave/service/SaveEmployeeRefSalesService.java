package com.haier.isales.retail.reportsave.service;

import com.haier.isales.retail.reportsales.domain.ReportsalesDomain;

public interface SaveEmployeeRefSalesService {
	
	void saveSaleInfo(ReportsalesDomain reportsalesDomain,String CategoryE,String CategoryEName,String Prdn);

}
