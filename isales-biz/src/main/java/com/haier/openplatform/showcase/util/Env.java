package com.haier.openplatform.showcase.util;

import java.util.Properties;

/**
 * 读取env.properties配置文件中的配置项
 * @author WangXuzheng
 *
 */
public final class Env {
	public static final String KEY_STATIC_URL = "server.static";
	public static final String KEY_DYNAMIC_URL = "server.dynamic";
	public static final String KEY_SERVER_NAME = "server.name";
	public static final String APP_NAME = "app.name";
	public static final String APP_URL = "app.url";
	public static final String APP_EAMIL = "app.email";  
	public static final String SYS_ADMIN = "system.admin";  
	public static final String ENV_TYPE = "env.type";
	public static final String KEY_JQUERY_EASY_VERSION = "jquery.easyui.version";
	public static final String KEY_JQUERY_EASY_THEME = "jquery.easyui.theme";
	public static final String KEY_CAS_SERVER_URL_PREFIX = "cas.server.urlPrefix";
	public static final String KEY_CAS_SERVER_NAME = "cas.server.name";
	public static final String LDAP_HOST = "ldap.host";
	public static final String LDAP_SYSUSER_DN = "ldap.sysuser.dn";
	public static final String LDAP_SYSUSER_PASSWORD = "ldap.sysuser.password";
	/* 2015-5-20 曹瑞：	修改密码改为使用地址为96的接口，不再使用142.用户认证仍为142的接口
	 * 目前两个接口只是地址不一样，调用用户名和密码一样。但为了防止portal以后可能会更改，将用户名密码也一起拆分成两份
	 * 进行此改动时portal方面对接工程师为张小龙、寻之贺。
	 * 问题现象：i营销修改密码后，登录其他系统无效。此问题由自主经营体抛出。
	 * 问题原因 ：在portal里96为身份树、密码修改后会同步到142，并同步给其他系统，但是142为认证树、密码不会同步到96，也不会同步更新其他系统
	 */
	public static final String LDAP_HOST_FOR_UPDATEPASS = "ldap.hostforupdatepass";
	public static final String LDAP_SYSUSER_DN_FOR_UPDATEPASS = "ldap.sysuser.dnforupdatepass";
	public static final String LDAP_SYSUSER_PASSWORD_FOR_UPDATEPASS = "ldap.sysuser.passwordforupdatepass";
	
	public static final String EAI_ISSUE_SOLVER = "eai.issue.solver";
	
	// 增加样机系统接口地址配置
	public static final String YANGJI_ADDRESS = "yangji.address";
	
	private static Properties props;
	public static synchronized void init(Properties properties){
		props = properties;
	}
	/**
	 * 读取配置项
	 * @param key
	 * @return
	 */
	public static final String getProperty(String key){
		return props.getProperty(key);
	}
}
