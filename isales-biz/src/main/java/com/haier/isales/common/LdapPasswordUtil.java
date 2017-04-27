package com.haier.isales.common;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import novell.ldapUserManager;


import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;
import com.haier.openplatform.showcase.util.Env;
import com.novell.ldap.LDAPAttribute;
import com.novell.ldap.LDAPConnection;
import com.novell.ldap.LDAPEntry;
import com.novell.ldap.LDAPException;
import com.novell.ldap.LDAPModification;
import com.novell.ldap.LDAPSearchResults;

public class LdapPasswordUtil {
	private static final Logger LOGGER = LoggerFactory.getLogger(LdapPasswordUtil.class);
	private static int ldapPort = LDAPConnection.DEFAULT_PORT;
	private static int ldapVersion = LDAPConnection.LDAP_V3;
	private static String sysLdapHost = Env.getProperty(Env.LDAP_HOST);// 测试 10.135.7.92     生产 10.135.7.96   10.135.7.142
	private static String sysDN = Env.getProperty(Env.LDAP_SYSUSER_DN);//"cn=690YD,o=services";// "cn=690YDUser,ou=user,o=services";[3] "cn=testuser,ou=user,o=services";//
	private static String sysPassword = Env.getProperty(Env.LDAP_SYSUSER_PASSWORD); // 测试 "690YD" 生产 haier,123  "690YDUser@20141128";//[3]"testuser";//
//	private static String sysLdapHost = "10.135.7.142";//Env.getProperty(Env.LDAP_HOST);// 测试 10.135.7.92     生产 10.135.7.96   10.135.7.142
//	private static String sysDN ="cn=690YDUser,ou=user,o=services";// Env.getProperty(Env.LDAP_SYSUSER_DN);//"cn=690YD,o=services";// "cn=690YDUser,ou=user,o=services";[3] "cn=testuser,ou=user,o=services";//
//	private static String sysPassword = "690YDUser@20141128";//Env.getProperty(Env.LDAP_SYSUSER_PASSWORD); // 测试 "690YD" 生产 haier,123  "690YDUser@20141128";//[3]"testuser";//
	private static final String[] PASSWORD_ARY = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//	private LDAPConnection ldapConnection;
//
//	public LDAPConnection getInstance(){
//		if(ldapConnection == null){
//			ldapConnection = getLDAPConnection(sysLdapHost,sysDN,sysPassword);
//		}
//		return ldapConnection;
//	}
    /**
     * 获得ldap链接
     * @return
     */
    private LDAPConnection  getLDAPConnection(String ldapHost,String loginDN,String password){
    	LDAPConnection ldapConnection = new LDAPConnection();
    	try {
    		ldapConnection.connect( ldapHost, ldapPort );
    		ldapConnection.bind( ldapVersion, loginDN, password.getBytes("UTF8") );
			return ldapConnection;
		} catch (LDAPException e) {
			throw new SystemException(BusinessExceptionCode.portal_validate_login,"无法创建与portal系统的连接，请稍后重试",e);
		} catch (UnsupportedEncodingException e) {
			throw new SystemException(BusinessExceptionCode.portal_validate_login,e);
		}
    }
    /**
     * 释放ldap链接
     * @param lc
     */
    private void releaseLDAPConnection(LDAPConnection ldapConnection){
    	try {
    		if(ldapConnection != null){
    			ldapConnection.disconnect();
    		}
		} catch (LDAPException e) {
			throw new SystemException(BusinessExceptionCode.portal_validate_login,"无法关闭portal登录连接",e);
		}
    }
   
	    
    /**
     * 获得dn
     * @param lc
     * @param condition : 工号cn or 邮箱mail or 手机号 mobile
     * @return
     */
    private String getDN(LDAPConnection lc,String condition){
    	 try { 
    		 if(StringUtils.isEmpty(condition)){
 	   			throw new SystemException(BusinessExceptionCode.login_invalid_username);
 	   		 }
    		 int searchScope = LDAPConnection.SCOPE_SUB; 
    		 //o=haier,ou=SupplierUser
//    		 String searchBase = "ou=SupplierUser,o=haier"; 
//	    	 String searchFilter = "(&(|(cn="+condition+")(mail="+condition+")(mobile="+condition+"))(objectClass=user))";
//             LDAPSearchResults searchResults = lc.search(searchBase,searchScope, searchFilter.toString(), null, false); 
//             while (searchResults.hasMore()) { 
//                 LDAPEntry nextEntry = null; 
//                 nextEntry = searchResults.next(); 
//                 String str = nextEntry.getDN(); 
//                 return str;
//             }
    		 //haier 下面只查cn
    		 String searchBase = "o=haier"; 
    		 String searchFilter = "(&(cn="+condition+")(objectClass=user))";
    		 LDAPSearchResults searchResults = lc.search(searchBase,searchScope, searchFilter, null, false); 
             while (searchResults.hasMore()) { 
                 LDAPEntry nextEntry = null; 
                 nextEntry = searchResults.next(); 
                 String str = nextEntry.getDN(); 
                 return str;
             }
             return null;
         } catch (LDAPException e) { 
         	throw new SystemException(BusinessExceptionCode.portal_validate_login,"portal中没有找到用户账号信息",e);
         }
    }
    /**
     * 验证密码是否正确
     * @param loginLdapHost  链接ip
     * @param loginDN        链接用户dn
     * @param loginPassword  链接用户密码
     * @param condition : 工号cn or 邮箱mail or 手机号 mobile
     * @return
     */
    public boolean verify(String condition,String password){
    	if(StringUtils.isEmpty(condition)){
    		return false;
    	}
    	//获取连接
    	LDAPConnection ldapConnection;
    	try {
			ldapConnection = getLDAPConnection(sysLdapHost,sysDN,sysPassword);
		} catch (Exception e1) {
			return false;
		}
    	//获取用户在portal账号信息 condition为用户账号（这里为工号）
    	String dn = getDN(ldapConnection,condition);
    	if(StringUtils.isEmpty(dn)){
    		return false;
    	}
    	LDAPAttribute attr = new LDAPAttribute("userPassword", password );
    	try {
    		boolean result = ldapConnection.compare( dn, attr );
			return  result; 
		} catch (Exception e) {
			return false;
		} finally{
			releaseLDAPConnection(ldapConnection);
		}
    }
	/** 
	* @Description: 修改密码
	* @author Guo Yuchao   
	* @date 2015-1-15 上午8:56:04 
	* @param lc
	* @param userDN 用户节点 形如："cn=A0003142,ou=ExternalUser,o=haier"
	* @param newPwd 新密码 
	*/ 
	public boolean setPassword(LDAPConnection lc,String userDN,String newPwd){
		LDAPAttribute attributePassword = new LDAPAttribute("userPassword",newPwd);
	 	try {
			lc.modify(userDN, new LDAPModification(LDAPModification.REPLACE, attributePassword));
			return true;
		} catch (LDAPException e) {
//			e.printStackTrace();
			return false;
		}
	}
	
	/** 
	* @Description: 验证用户名对应的密码
	* @author Guo Yuchao   
	* @date 2015-1-15 上午11:20:33 
	* @param lc
	* @param userDN
	* @param oldPwd
	* @return  
	*/ 
	public boolean checkUserPassword(LDAPConnection lc,String userDN,String password){
		//验证原用户名密码
    	LDAPAttribute attr = new LDAPAttribute("userPassword",password);
		boolean result;
		try {
			result = lc.compare(userDN,attr);
			return result;
		} catch (Exception e) {
			return false;
		}
	}
	/** 
	* @Description: 修改密码
	* @author Guo Yuchao   
	* @date 2015-1-15 上午9:21:29 
	* @param userCode 工号
	* @param oldPwd 旧密码
	* @param newPwd 新密码
	*/ 
	public void modifyPassword(String userCode,String oldPwd,String newPwd){
		LDAPConnection ldapConnection = getLDAPConnection(sysLdapHost,sysDN,sysPassword);
    	try {
			//获取用户在portal账号信息   Param:condition为用户账号（这里为工号）
			//返回值形如："cn=A0003142,ou=ExternalUser,o=haier"
	    	String userDN = getDN(ldapConnection,userCode);
	    	if(StringUtils.isEmpty(userDN)){
	    		throw new BusinessException(BusinessExceptionCode.portal_set_password,"用户名输入有误");
	    	}
	    	//验证原用户名密码
    		boolean checkOldPwdResult = checkUserPassword(ldapConnection,userDN,oldPwd);
			if(!checkOldPwdResult){
				throw new BusinessException(BusinessExceptionCode.portal_set_password,"原密码输入有误");
			} 
			//设置新密码
			boolean setNewPwdResult = setPassword(ldapConnection,userDN,newPwd);
			if(!setNewPwdResult){
				throw new BusinessException(BusinessExceptionCode.portal_set_password,"新密码设置失败，请稍后重试");
			}
//			LOGGER.info("修改密码成功 ，新密码："+newPwd);
		} catch (Exception e) { 
         	throw new SystemException(BusinessExceptionCode.portal_set_password,"修改密码失败",e);
		} finally {
			releaseLDAPConnection(ldapConnection);
		}
	}
	/** 
	* @Description: 获取portal系统中用户的身份证号，手机号和邮箱 封装Map key分别为  HaierIdCardNumber ，mobile ，mail
	*  实例：{mail=***@gmail.com, HaierUserMail=, HaierIdCardNumber=37028319900601****, mobile=1385420****}
	* @author Guo Yuchao   
	* @date 2015-1-15 上午10:50:32 
	* @param userCode
	* @return  
	*/ 
	public Map<String,String> getUserInfoFromPortal(String userCode){
		ldapUserManager lm = new ldapUserManager();
		//创建用户属性集合
		List<String> properties = new ArrayList<String>();
		properties.add("HaierIdCardNumber"); //身份证
		properties.add("mail");  //内网邮箱
		properties.add("mobile");			 //手机号码
		//properties.add("HaierUserWWWMail");  //外网邮箱 2012.06.04
		properties.add("HaierUserMail"); //外网邮箱字段变更（LDAP）  2012.09.20 
		//获取用户属性名称及值的键值对集合
		Map<String,String> userInfoMap = lm.readProperties(properties, userCode);
		return userInfoMap;
	}     
	
	/** 
	* @Description: 重置密码
	* @author Guo Yuchao   
	* @date 2015-1-15 下午4:45:37 
	* @param userCode
	* @param idCardNo
	* @return  
	*/ 
	public String resetPassword(String userCode,String idCardNo){
		//验证用户名和身份证号码
		checkUserCodeIdCard(userCode,idCardNo);
		//生成新密码
		String newPwd = getRandomPassword();
		LDAPConnection ldapConnection = getLDAPConnection(sysLdapHost,sysDN,sysPassword);
		try {
			//创建连接
//			ldapConnection =  getInstance();
			//获取用户在portal账号信息   Param:condition为用户账号（这里为工号）
			//返回值形如："cn=A0003142,ou=ExternalUser,o=haier"
	    	String userDN = getDN(ldapConnection,userCode);
	    	if(StringUtils.isEmpty(userDN)){
	    		throw new BusinessException(BusinessExceptionCode.portal_set_password,"用户名输入有误");
	    	}
			//设置新密码
			boolean setNewPwdResult = setPassword(ldapConnection,userDN,newPwd);
			if(!setNewPwdResult){
				throw new BusinessException(BusinessExceptionCode.portal_set_password,"密码重置失败，请稍后重试");
			}
			return newPwd;
		} catch (Exception e) { 
         	throw new SystemException(BusinessExceptionCode.portal_set_password,"重置密码失败",e);	
		} finally {
			releaseLDAPConnection(ldapConnection);
		}
	}    
	/** 
	* @Description: 验证用户名和身份证号码
	* @author Guo Yuchao   
	* @date 2015-1-15 下午4:47:33 
	* @param userCode
	* @param idCardNo
	* @return  
	*/ 
	public void checkUserCodeIdCard(String userCode,String idCardNo){
		Map<String, String> userInfoFromPortal = getUserInfoFromPortal(userCode);
		if(userInfoFromPortal == null){
			throw new BusinessException(BusinessExceptionCode.portal_set_password,"用户名输入有误");
		}
		//判断用户输入的信息是否正确
		if (StringUtils.isEmpty(userInfoFromPortal.get("HaierIdCardNumber"))
				|| !userInfoFromPortal.get("HaierIdCardNumber").equalsIgnoreCase(idCardNo) ){
			//输入的验证信息不正确 
			throw new BusinessException(BusinessExceptionCode.portal_set_password,"身份证号码与HR系统信息不匹配");
		}
	}    
	/** 
	* @Description: 验证原密码
	* @author Guo Yuchao   
	* @date 2015-1-15 下午2:03:49 
	* @param userCode
	* @param oldPwd  
	*/ 
	public void checkOldPassword(String userCode ,String oldPwd){
		LDAPConnection ldapConnection = getLDAPConnection(sysLdapHost,sysDN,sysPassword);
		try {
			//创建连接
//			ldapConnection =  getInstance();
			//获取用户在portal账号信息   Param:condition为用户账号（这里为工号）
			//userDN返回值形如："cn=A0003142,ou=ExternalUser,o=haier"
	    	String userDN = getDN(ldapConnection,userCode);
	    	if(StringUtils.isEmpty(userDN)){
	    		throw new BusinessException(BusinessExceptionCode.portal_set_password,"用户名输入有误");
	    	}
	    	//验证原用户名密码
    		boolean checkOldPwdResult = checkUserPassword(ldapConnection,userDN,oldPwd);
			if(!checkOldPwdResult){
				throw new BusinessException(BusinessExceptionCode.portal_set_password,"原密码输入有误");
			} 
		} catch (Exception e) { 
         	throw new SystemException(BusinessExceptionCode.portal_set_password," 验证密码失败",e);		
		} finally {
			releaseLDAPConnection(ldapConnection);
		}
	}    

   /** 
	* @Description: 生成 重置密码 逻辑8位 中间6位数字，首位两位字母
	* @author Guo Yuchao   
	* @date 2015-1-15 下午12:32:45 
	* @return  
	*/ 
	private String getRandomPassword() {
//		if(idCardNo.length() == 15){
//			return idCardNo.substring(9);
//		}else if(idCardNo.length() == 18){
//			return idCardNo.substring(12);
//		}else{
//			throw new BusinessException(BusinessExceptionCode.param_error,"身份证号码位数不正确");
//		}
		double index = (Math.random()*1000000);
		int num = (int)index;
		int firstIndex = (int) (num%26);
		StringBuffer newPwd = new StringBuffer();
		newPwd.append(PASSWORD_ARY[firstIndex]).append(StringUtil.leftPad(num+"", 6, '0'));
		index = (Math.random()*1000000);
		int lastIndex = (int) (((int)index)%26);
		newPwd.append(PASSWORD_ARY[lastIndex]);
		return newPwd.toString();
		
	}

	public static void main(String[] args) {
	   LdapPasswordUtil ldapPasswordUtil = new LdapPasswordUtil();
//       String condition = "A0001984";
//       String testPassword = "Jbinfo1009";//"690YD";
//       String condition = "A0003183";
//       String testPassword = "haier,123";//"690YD";
//	   String userCode = "A0000600";
//       String oldPwd = "sS111111";
//       String newPwd = "aA111111";
       String userCode = "A0003142";
       String oldPwd = "y374042a";
       String newPwd = "aA111111";
       boolean correct = ldapPasswordUtil.verify(userCode,newPwd);
       LOGGER.info( correct ? "The password is correct.":
                                     "The password is incorrect.\n");
       ldapPasswordUtil.modifyPassword(userCode,oldPwd,newPwd);
//       Map<String, String> userInfoFromPortal = ldapPasswordUtil.getUserInfoFromPortal(userCode);
//       LOGGER.info(userInfoFromPortal.toString());
//       LOGGER.info(ldapPasswordUtil.getRandomPassword("123456789012345678"));
   }

	    

}
