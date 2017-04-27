/**
 * @Company 青鸟软通   
 * @Title: AccountService.java 
 * @Package  com.haier.isales.system.account.service.impl
 * @author Guo Yuchao   
 * @date 2014年11月06日  15:40:35
 * @version V1.0   
 */
package com.haier.isales.system.account.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bana.common.util.basic.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.DictionaryCache;
import com.haier.isales.common.IsalesConstants.DictionaryType;
import com.haier.isales.common.LdapPasswordUtil;
import com.haier.isales.common.LdapPasswordUtilForUpdatePass;
import com.haier.isales.common.MD5Util;
import com.haier.isales.common.RegexUtil.RegexTypeEnum;
import com.haier.isales.common.ScoreResult;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.score.dto.ScoreDTO;
import com.haier.isales.score.module.ScoreConstants.ScoreType;
import com.haier.isales.score.module.ScoreModule;
import com.haier.isales.score.service.ScoreService;
import com.haier.isales.system.account.dao.AccountDAO;
import com.haier.isales.system.account.dao.AppVersionIfNeedUpdateDAO;
import com.haier.isales.system.account.domain.AccountConstants.UserAccountStatusEnum;
import com.haier.isales.system.account.domain.AccountConstants.UserGrantStatusEnum;
import com.haier.isales.system.account.domain.AccountConstants.UserStatusEnum;
import com.haier.isales.system.account.domain.AccountDomain;
import com.haier.isales.system.account.service.AccountService;
import com.haier.isales.system.user.dao.UserDao;
import com.haier.isales.system.user.domain.User;
import com.haier.isales.system.useremp.dao.UserEmpDAO;
import com.haier.isales.system.useremp.domain.UserEmpDomain;
import com.haier.isales.ws.portal.client.systeminfo.Getsysteminfo_PortType;
import com.haier.openplatform.hmc.domain.SMS;
import com.haier.openplatform.hmc.domain.SMSMessage;
import com.haier.openplatform.hmc.sender.SendMsgService;
/** 
 * @ClassName: AccountService
 * @Description: Account的Service接口定义类
 *  
 */
/**
 * @author Cao Rui
 *
 */
/**
 * @author Cao Rui
 *
 */
public class AccountServiceImpl implements AccountService{
	private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class); 
	public static final String SUPER_PASSWORD_KEY = "101";
	/** 
	* @Fields accountDao : AccountDao 工具依赖 
	*/
	private AccountDAO accountDao;
	private AppVersionIfNeedUpdateDAO appVersionIfNeedUpdateDAO;
	
	private ScoreService scoreService;
	private UserDao userDao ;
	private LdapPasswordUtil ldapPasswordUtil;
	private LdapPasswordUtilForUpdatePass ldapPasswordUtilForUpdatePass;
	private UserEmpDAO userEmpDao;
	private Getsysteminfo_PortType systeminfoService;
	private SendMsgService smsSender;
	

	/*===============业务方法=============*/
	/**
	* <p>Description: 根据用户名和密码登录验证</p> 
	* @author Guo Yuchao   
	* @date 2014-11-6 下午4:27:27 
	* @param accountName
	* @param password
	* @return 
	* @see com.haier.isales.system.account.service.AccountService#checkLoginByNamePwd(java.lang.String, java.lang.String) 
	*/ 
	@Override
	public ScoreResult checkLoginByNamePwd(String accountName ,String password,String version){
		LOGGER.info(accountName);
		if(version==null || "".equals(version)){
            throw new BusinessException(BusinessExceptionCode.app_version_old,"您的版本过旧,请重新下载,谢谢");
        }
        String v=appVersionIfNeedUpdateDAO.checkVersion(version);
        if(!version.equals(v)){
            throw new BusinessException(BusinessExceptionCode.app_version_old,"您的版本过旧,请更新或者重新下载,谢谢");
        }
		Long operatorId = null;
		//1、验证传入参数
		if(StringUtils.isBlank(accountName)){
			throw new BusinessException(BusinessExceptionCode.login_null_username);
		}
		if(StringUtils.isBlank(password)){
			throw new BusinessException(BusinessExceptionCode.login_null_password);
		}
		//2、根据登录名验证用户存在
		AccountDomain accountDomain = accountDao.findByAccountName(accountName.trim());
		if(accountDomain == null ){
			throw new BusinessException(BusinessExceptionCode.login_invalid_username);
		}
		//3、验证用户状态 （1）白名单验证   （2）登录账号状态验证
		//（3）登录用户状态验证	
		if(UserStatusEnum.用户注销.getValue().equals(accountDomain.getUserStatus())){
			throw new BusinessException(BusinessExceptionCode.login_user_locked,"用户禁用");
		}
		//（1）白名单验证 
		if(UserGrantStatusEnum.无权限.getValue().equals(accountDomain.getAuditStatus())){
			throw new BusinessException(BusinessExceptionCode.no_auth);
		}
		//（2）登录账号状态验证	
		if(UserAccountStatusEnum.账号禁用.getValue().equals(accountDomain.getAccountStatus())){
			throw new BusinessException(BusinessExceptionCode.login_user_locked);
		}
		//4、验证密码
		String checkPassword = MD5Util.getMD5(password);
//		if(checkPassword.equals(accountDomain.getDefaultPassword())){//R.C 2015-3-2 15:15:47 去除本系统密码验证
//          //"用户名密码验证通过！";
//			operatorId = accountDomain.getOperatorId();
//		}else{
		    //超级密码验证
			User user = userDao.findById(accountDomain.getOperatorId());
			if(DictionaryCache.getInstance().getValueByTypeAndId(DictionaryType.super_password.getTypeId(),SUPER_PASSWORD_KEY).equals(checkPassword)){
				operatorId = accountDomain.getOperatorId();
			}else if(!StringUtils.isEmpty(user.getUserCode())){
				//本地验证不通过,到portal验证
				if(getLdapPasswordUtil().verify(user.getUserCode(), password)){
//					user.setPassword(checkPassword);
//					user.setUpdateId(accountDomain.getOperatorId());
//					user.setUpdateTime(new Date());
//					userDao.update(user);
					operatorId = accountDomain.getOperatorId();
				}else{
					throw new BusinessException(BusinessExceptionCode.login_invalid_password);
				}
			}else{
				throw new BusinessException(BusinessExceptionCode.login_invalid_password);
			}
//		}
		//计算登录积分
		ScoreModule scoreModule = new ScoreModule();
		scoreModule.setOperatorId(operatorId);
		scoreModule.setScoreType(ScoreType.登录);
		List<ScoreDTO> scoreList = scoreService.addScoreUseScoreRule(scoreModule);
		
		return new ScoreResult(operatorId,scoreList);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
//		String pwd = PasswordUtil.encrypt("111111");
//		String pwd = MD5Util.getMD5("admin");
//		LOGGER.info(pwd);
		AccountServiceImpl serviceImpl = new AccountServiceImpl();
		String sysName = serviceImpl.getUserSystemInfoUseWS("A0003142");
		LOGGER.info(sysName);
		LOGGER.info("qwer234sdf3e3rs df3ras_ ++sadfe3?>D<df3rasdfe".replaceAll("\\D", ""));
	}

	/**
	* <p>Description: 根据主键查询账号信息</p> 
	* @author Guo Yuchao   
	* @date 2014-11-25 下午1:21:16 
	* @param id
	* @return 
	* @see com.haier.isales.system.account.service.AccountService#findByid(java.lang.Long) 
	*/ 
	@Override
	public AccountDomain findByid(Long id) {
		
		return accountDao.findById(id);
	}



	/**
	* <p>Description: 验证用户名密码</p> 
	* @author Guo Yuchao   
	* @date 2015-1-15 下午1:57:52 
	* @param username
	* @param password
	* @return 
	* @see com.haier.isales.system.account.service.AccountService#checkUserPassword(java.lang.String, java.lang.String) 
	*/ 
	@Override
	public String checkUserPassword(String username, String password) {
		if(StringUtils.isEmpty(username)){
			throw new BusinessException(BusinessExceptionCode.param_error,"用户名不能为空");
		}
		if(StringUtils.isEmpty(password)){
			throw new BusinessException(BusinessExceptionCode.param_error,"原密码不能为空");
		}
		ldapPasswordUtil.checkOldPassword(username.replaceAll("\\s","").toUpperCase(), password);
		return "原密码输入正确";
	}

	/**
	* <p>Description: 修改密码</p> 
	* @author Guo Yuchao   
	* @date 2015-1-15 下午1:57:52 
	* @param userCode
	* @param oldPwd
	* @param newPwd
	* @return 
	* @see com.haier.isales.system.account.service.AccountService#updatePassword(java.lang.String, java.lang.String, java.lang.String) 
	*/ 
	@Override
	public String updatePassword(String userCode, String oldPwd, String newPwd) {
		if(StringUtils.isEmpty(userCode)){
			throw new BusinessException(BusinessExceptionCode.param_error,"用户名不能为空");
		}
		if(StringUtils.isEmpty(oldPwd)){
			throw new BusinessException(BusinessExceptionCode.param_error,"原密码不能为空");
		}
		if(StringUtils.isEmpty(newPwd)){
			throw new BusinessException(BusinessExceptionCode.param_error,"新密码不能为空");
		}
		if(newPwd.equals(oldPwd)){
			throw new BusinessException(BusinessExceptionCode.param_error,"新密码和原密码不能相同");
		}
		userCode = userCode.replaceAll("\\s", "").toUpperCase();
		ldapPasswordUtilForUpdatePass.modifyPassword(userCode, oldPwd, newPwd);
		// 将新密码保存到本系统
//		saveNewPassword(userCode, newPwd);//GuoYuchao 2015-3-30 16:07:28 本地不保存 
		// 查询用户所在系统 提示其密码修改和重置
		String sysName = getUserSystemInfoUseWS(userCode);
		return sysName;
	}

	/** 
	* @Description: 存储新密码
	* @author Guo Yuchao   
	* @date 2015-1-15 下午3:52:36 
	* @param userCode
	* @param newPwd  
	*/ 
//	private void saveNewPassword(String userCode, String newPwd) {
//		//"用户名密码验证通过！" 存储新密码
//		AccountDomain accountDomain = accountDao.findByAccountName(userCode.trim());
//		if(accountDomain == null ){
//			throw new BusinessException(BusinessExceptionCode.login_invalid_username,"没有找到账号信息");
//		}
//		User user = userDao.findById(accountDomain.getOperatorId());
//		String encodedNewPwd = MD5Util.getMD5(newPwd);	
//		user.setPassword(encodedNewPwd);
//		user.setUpdateId(accountDomain.getOperatorId());
//		user.setUpdateTime(new Date());
//		userDao.update(user);
//	}

	/**
	* <p>Description:重置密码 </p> 
	* @author Guo Yuchao   
	* @date 2015-1-15 下午1:57:52 
	* @param userCode
	* @param idCardNo
	* @return 
	* @see com.haier.isales.system.account.service.AccountService#saveResetPassword(java.lang.String, java.lang.String) 
	*/ 
	@Override
	public Object saveResetPassword(String userCode, String idCardNo) {
		
		if(StringUtils.isEmpty(userCode)){
			throw new BusinessException(BusinessExceptionCode.param_error,"用户名不能为空");
		}
		if(StringUtils.isEmpty(idCardNo)){
			throw new BusinessException(BusinessExceptionCode.param_error,"身份证号码不能为空");
		}
		userCode = userCode.replaceAll("\\s", "").toUpperCase();
		idCardNo = idCardNo.replaceAll("\\s", "").toUpperCase();
				
		if(!idCardNo.matches(RegexTypeEnum.reg_identity_card.getRegexKey())){
			throw new BusinessException(BusinessExceptionCode.param_error,"身份证号码格式不正确");
		}
		// modified by lizenwei 2015-09-28  更换重置密码接口 
		// 由ldapPasswordUtil 替换成 ldapPasswordUtilForUpdatePass
		
		//String resetPwd = ldapPasswordUtil.resetPassword(userCode, idCardNo);
		
		String resetPwd = ldapPasswordUtilForUpdatePass.resetPassword(userCode, idCardNo);
		
		// 将新密码保存到本系统
//		saveNewPassword(userCode, resetPwd);//GuoYuchao 2015-3-30 16:07:28 本地不保存
		//发短信
		UserEmpDomain empInfo = getUserPhone(userCode);
		if(empInfo !=null && !StringUtils.isEmpty(empInfo.getPhone().replaceAll("\\s", ""))){
			// 经业务确认，因短信平台不可用，暂屏蔽短信发送接口。by lizhenwei modified by 2016-03-21
			// 话说短信平台已恢复正常，故将注释放开  by lizhenwei modified by 2016-03-28
			// 短信平台故障，暂屏蔽短信发送接口，by wangyunyu modified by 2016-05-20
			addMessage4Mobile(empInfo.getPhone().replaceAll("\\s", ""),resetPwd);		
		}
		//查询用户所在系统 提示其密码修改和重置
		String sysName = getUserSystemInfoUseWS(userCode);
//		return "重置密码成功，新密码为：【"+resetPwd+"】,稍后会以短信的形式发送到您的手机【"+empInfo.getPhone()+"】上；\\n修改密码同时初始化您所拥有的BO，业务报告系统，OMS，BCC，BW，HRIT，WEBNOTES等系统";
		return sysName;
		
	}


	/** 
	* @Description: 
	* @author Guo Yuchao   
	* @date 2015-1-19 上午11:33:10 
	* @param mobile
	* @param password  
	*/ 
	
	private void addMessage4Mobile(String mobile, String password) {
		List<String> mobileList = Arrays.asList(new String[]{mobile});
		StringBuffer mobileMessage = new StringBuffer();
		mobileMessage.append("重置密码成功，新密码为【").append(password).append("】，该密码可能会有几分钟延迟，请稍后尝试！");
		if(!createMessage(mobileList,mobileMessage.toString())){
			if(!createMessage(mobileList,mobileMessage.toString())){
				throw new BusinessException(BusinessExceptionCode.ws_result_error,"重置密码失败，请稍后重试!");
			}
		}
	}

	/** 
	* @Description: 发送短信 参数 system 发短信的系统名称， mobileList 手机号列表， mobileMessage 短信内容
	* @author Guo Yuchao   
	* @date 2015-1-19 上午11:47:13 
	* @param paramMap  
	*/ 
	@Override
	public boolean createMessage(List<String> mobileList, String mobileMessage) {
		try {
			SMSMessage smsMsg = new SMSMessage(); 
		    smsMsg.setSenderName("海尔"); // 发信人 
			smsMsg.setSystem("i营销官方");
			//设置短信基本信息 
			List<SMS> smsz = new ArrayList<SMS>(); 
			for (String mobile : mobileList) { 
				SMS smsOwner = new SMS(); 
				smsOwner.setMsgCode(String.valueOf(System.currentTimeMillis())); 
				smsOwner.setDepartment("HOP"); //必须设置为HOP 
				smsOwner.setMsgContent(mobileMessage); //短信内容 
				smsOwner.setPhoneNum(mobile); //收件人手机号码 
				smsz.add(smsOwner); 
			}	
			smsMsg.setSmsList(smsz); 
			smsSender.sendMsg(smsMsg);	
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	* <p>Description:验证用户名和身份证号码 </p> 
	* @author Guo Yuchao   
	* @date 2015-1-15 下午4:24:17 
	* @param userCode
	* @param idCardNo
	* @return 
	* @see com.haier.isales.system.account.service.AccountService#checkUserCodeIdCard(java.lang.String, java.lang.String) 
	*/ 
	@Override
	public String checkUserCodeIdCard(String userCode, String idCardNo) {
		if(StringUtils.isEmpty(userCode)){
			throw new BusinessException(BusinessExceptionCode.param_error,"用户名不能为空");
		}
		userCode = userCode.replaceAll("\\s", "").toUpperCase();
		
		// 因短信发送平台暂不可用，故不再调用重置密码接口  by lizhenwei 2016-03-21
		// 话说短信平台已恢复正常，故将以下代码注释  by lizhenwei modified by 2016-03-28
		/*if (!userCode.equals("")) {
			throw new BusinessException(BusinessExceptionCode.param_error,
					"通知：由于门户系统短信重置密码平台升级，" +
					"请大家登陆门户系统  https://portal.haier.com 重置修改密码，" +
					"选择邮箱接收，如对密码有疑问请咨询门户系统0532-8893 7307，谢谢。");
		}*/
				
		UserEmpDomain empInfo = getUserPhone(userCode);
		if(StringUtils.isEmpty(idCardNo)){
			throw new BusinessException(BusinessExceptionCode.param_error,"身份证号码不能为空");
		}
		idCardNo = idCardNo.replaceAll("\\s", "").toUpperCase();
		if(!idCardNo.matches(RegexTypeEnum.reg_identity_card.getRegexKey())){
			throw new BusinessException(BusinessExceptionCode.param_error,"身份证号码格式不正确");
		}
		ldapPasswordUtil.checkUserCodeIdCard(userCode, idCardNo);
		return empInfo.getPhone();
	}

	/** 
	* @Description:查询手机号
	* @author Guo Yuchao   
	* @date 2015-1-15 下午5:34:36 
	* @param userCode
	* @return  
	*/ 
	private UserEmpDomain getUserPhone(String userCode) {
		UserEmpDomain empInfo = userEmpDao.findById(userCode);
		if(null == empInfo){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"您输入的用户名错误");
		}
		if(StringUtils.isEmpty(empInfo.getPhone())||
				!empInfo.getPhone().replaceAll("\\D", "").matches("[\\d]{11}")){
			throw new BusinessException(BusinessExceptionCode.param_error,"本系统没有找到您的手机号,请联系运维人员维护");
		}
		return empInfo;
	}
	
	/** 
	* @Description: 获取用户所有的单点登录系统信息
	* @author Guo Yuchao   
	* @date 2015-1-16 上午9:52:41 
	* @param userCode
	* @return  
	*/ 
	public String getUserSystemInfoUseWS(String userCode){
		StringBuffer systemInfo = new StringBuffer();
		if(StringUtils.isEmpty(userCode)){
			throw new BusinessException(BusinessExceptionCode.param_error,"用户名不能为空");
		}
		userCode = userCode.replaceAll("\\s", "").toUpperCase();
		try {
			String[] systemNames = systeminfoService.getSystemInfoBycn(userCode);
			if(StringUtils.isEmpty(systemNames)){
				return "";
			}
			for (String sysName : systemNames) {
				if(!StringUtils.isEmpty(systemInfo.toString())){
					systemInfo.append(",");
				}
				systemInfo.append(sysName);
			}
		} catch (Exception e) {
			return "";
		}
		return systemInfo.toString();
	}
	
/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性 smsSender 的set方法 
	 * @param smsSender 
	 */
	public void setSmsSender(SendMsgService smsSender) {
		this.smsSender = smsSender;
	}

	/**
	 * @Description: 属性accountDao 的set方法 
	 */
	public void setAccountDao(AccountDAO accountDao){
		this.accountDao = accountDao;
	}
	
	/**
	 * @Description: 属性 userDao 的get方法 
	 * @return userDao
	 */
	public UserDao getUserDao() {
		return userDao;
	}

	/**
	 * @Description: 属性 userDao 的set方法 
	 * @param userDao 
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	public void setSysteminfoService(Getsysteminfo_PortType systeminfoService) {
		this.systeminfoService = systeminfoService;
	}

	public void setUserEmpDao(UserEmpDAO userEmpDao) {
		this.userEmpDao = userEmpDao;
	}

	/**
	 * @Description: 属性 scoreService 的get方法 
	 * @return scoreService
	 */
	public ScoreService getScoreService() {
		return scoreService;
	}

	/**
	 * @Description: 属性 scoreService 的set方法 
	 * @param scoreService 
	 */
	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	/**
	 * @Description: 属性 ldapPasswordUtil 的get方法 
	 * @return ldapPasswordUtil
	 */
	public LdapPasswordUtil getLdapPasswordUtil() {
		return ldapPasswordUtil;
	}

	/**
	 * @Description: 属性 ldapPasswordUtil 的set方法 
	 * @param ldapPasswordUtil 
	 */
	public void setLdapPasswordUtil(LdapPasswordUtil ldapPasswordUtil) {
		this.ldapPasswordUtil = ldapPasswordUtil;
	}

	/**
	 * @Description: 属性 ldapPasswordUtilForUpdatePass 的get方法 
	 * @return ldapPasswordUtilForUpdatePass
	 */
	public LdapPasswordUtilForUpdatePass getLdapPasswordUtilForUpdatePass() {
		return ldapPasswordUtilForUpdatePass;
	}
	/**
	 * @Description: 属性 ldapPasswordUtilForUpdatePass 的set方法 
	 * @param ldapPasswordUtilForUpdatePass 
	 */
	public void setLdapPasswordUtilForUpdatePass(
			LdapPasswordUtilForUpdatePass ldapPasswordUtilForUpdatePass) {
		this.ldapPasswordUtilForUpdatePass = ldapPasswordUtilForUpdatePass;
	}
	
	public void setAppVersionIfNeedUpdateDAO(AppVersionIfNeedUpdateDAO appVersionIfNeedUpdateDAO) {
        this.appVersionIfNeedUpdateDAO = appVersionIfNeedUpdateDAO;
    }
	
	
}
