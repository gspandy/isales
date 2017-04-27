package com.haier.isales.retail.reportsave.service.impl;

import com.haier.isales.retail.reportsave.dao.SaveEmployeeRefSalesDao;
import com.haier.isales.retail.reportsave.service.SaveEmployeeRefSalesService;
import com.haier.isales.retail.reportsales.domain.ReportsalesDomain;

public class SaveEmployeeRefSalesServiceImpl
  implements SaveEmployeeRefSalesService
{
  SaveEmployeeRefSalesDao saveEmployeeRefSalesDao;

  public void saveSaleInfo(ReportsalesDomain reportsalesDomain, String CategoryE, String CategoryEName, String Prdn)
  {
    this.saveEmployeeRefSalesDao.saveSaleInfo(reportsalesDomain, CategoryE, CategoryEName, Prdn);
  }

  public void setSaveEmployeeRefSalesDao(SaveEmployeeRefSalesDao saveEmployeeRefSalesDao) {
    this.saveEmployeeRefSalesDao = saveEmployeeRefSalesDao;
  }
}