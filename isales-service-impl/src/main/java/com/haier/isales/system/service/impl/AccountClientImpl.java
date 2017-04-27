/**
* @Company 青鸟软通   
* @Title: AccountClientImpl.java 
* @Package com.haier.isales.system.service.impl 
* @author Guo Yuchao   
* @date 2014-11-6 下午5:29:33 
* @version V1.0   
*/ 
package com.haier.isales.system.service.impl;

import com.haier.isales.common.ScoreResult;
import com.haier.isales.system.account.service.AccountService;
import com.haier.isales.system.service.AccountClient;

/** 
 * @ClassName: AccountClientImpl 
 * @Description: 账户信息业务对外接口实现
 *  
 */
public class AccountClientImpl implements AccountClient {
//	private static final Logger LOGGER = LoggerFactory.getLogger(AccountClientImpl.class);
	
	private AccountService accountService;
	/**
	 * @Description: 属性 accountService 的get方法 
	 * @return accountService
	 */
	public AccountService getAccountService() {
		return accountService;
	}
	/**
	 * @Description: 属性 accountService 的set方法 
	 * @param accountService 
	 */
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	/**
	 * <p>Description: 根据用户名和密码做登录验证</p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-6 下午5:29:33 
	 * @param accountName
	 * @param password
	 * @return 
	 * @see com.haier.isales.system.service.AccountClient#checkLoginByNamePwd(java.lang.String, java.lang.String) 
	 */
	@Override
	public ScoreResult checkLoginByNamePwd(String accountName, String password,String version) {
		return accountService.checkLoginByNamePwd(accountName, password,version);
	}
	/**
	* <p>Description:验证用户名和密码 </p> 
	* @author Guo Yuchao   
	* @date 2015-1-15 下午1:36:56 
	* @param username
	* @param password
	* @return 
	* @see com.haier.isales.system.service.AccountClient#validateUserPassword(java.lang.String, java.lang.String) 
	*/ 
	@Override
	public String validateUserPassword(String username, String password) {		
		return accountService.checkUserPassword(username, password);
	}
	/**
	* <p>Description:修改密码 </p> 
	* @author Guo Yuchao   
	* @date 2015-1-15 下午1:54:45 
	* @param userCode
	* @param oldPwd
	* @param newPwd
	* @return 
	* @see com.haier.isales.system.service.AccountClient#updatePassword(java.lang.String, java.lang.String, java.lang.String) 
	*/ 
	@Override
	public Object updatePassword(String userCode, String oldPwd, String newPwd) {
		return accountService.updatePassword(userCode, oldPwd, newPwd);
	}
	/**
	* <p>Description:重置密码 </p> 
	* @author Guo Yuchao   
	* @date 2015-1-15 下午1:54:45 
	* @param userCode
	* @param idCardNo
	* @return 
	* @see com.haier.isales.system.service.AccountClient#resertPassword(java.lang.String, java.lang.String) 
	*/ 
	@Override
	public Object resertPassword(String userCode, String idCardNo) {
		return accountService.saveResetPassword(userCode, idCardNo);
	}
	/**
	* <p>Description:验证用户名和身份证号码 </p> 
	* @author Guo Yuchao   
	* @date 2015-1-15 下午4:23:10 
	* @param userCode
	* @param idCardNo
	* @return 
	* @see com.haier.isales.system.service.AccountClient#checkUserCodeIdCard(java.lang.String, java.lang.String) 
	*/ 
	@Override
	public String checkUserCodeIdCard(String userCode, String idCardNo) {
		
		return accountService.checkUserCodeIdCard(userCode, idCardNo);
	}

}
