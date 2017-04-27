package com.haier.isales.system.account.dao;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.system.account.domain.AccountDomain;

public interface AppVersionIfNeedUpdateDAO extends CommonDAO<AccountDomain,Long>{
	
	String checkVersion(String version);

}
