/**
* @Company 青鸟软通   
* @Title: AccountConstants.java 
* @Package com.haier.isales.system.account.domain 
* @author Guo Yuchao   
* @date 2014-11-25 上午10:43:31 
* @version V1.0   
*/ 
package com.haier.isales.system.account.domain;


/** 
 * @ClassName: AccountConstants 
 * TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class AccountConstants {
	public enum UserAccountStatusEnum{
		  账号可用("account_status","101")
		, 账号禁用("account_status","102");
		  private String key;
		private String value;
		
		/** 
		* <p>Description: </p> 
		* @author Guo Yuchao   
		* @date 2014-11-25 上午10:51:54  
		*/ 
		private UserAccountStatusEnum(String key,String value) {
			this.key = key;
			this.value = value;
		}

		/**
		 * 属性 value 的get方法 
		 * @return value
		 */
		public String getValue() {
			return value;
		}

		/**
		 * 属性 key 的get方法 
		 * @return key
		 */
		public String getKey() {
			return key;
		}

	}
	/** 
	* @ClassName: UserStatusEnum 
	* t_qn_user表status状态  在数据字典中的key  user_status对应的value
	*  
	*/ 
	public enum UserStatusEnum{
		用户有效("user_status","101")
		, 用户注销("user_status","102");
		private String key;
		private String value;
		
		/** 
		 * <p>Description: </p> 
		 * @author Guo Yuchao   
		 * @date 2014-11-25 上午10:51:54  
		 */ 
		private UserStatusEnum(String key,String value) {
			this.key = key;
			this.value = value;
		}

		/**
		 * 属性 status 的get方法 
		 * @return status
		 */
		public String getValue() {
			return value;
		}
		
		/**
		 * 属性 key 的get方法 
		 * @return key
		 */
		public String getKey() {
			return key;
		}
		
	}
	/** 
	 * @ClassName: UserGrantStatusEnum 
	 * t_qn_user表audit_status状态  在数据字典中的key  user_audit_status对应的value
	 *  
	 */ 
	public enum UserGrantStatusEnum{
		已授权("user_audit_status","102")
		, 无权限("user_audit_status","101");
		private String key;
		private String value;
		
		/** 
		 * <p>Description: </p> 
		 * @author Guo Yuchao   
		 * @date 2014-11-25 上午10:51:54  
		 */ 
		private UserGrantStatusEnum(String key,String value) {
			this.key = key;
			this.value = value;
		}
		
		/**
		 * 属性 status 的get方法 
		 * @return status
		 */
		public String getValue() {
			return value;
		}
		
		/**
		 * 属性 key 的get方法 
		 * @return key
		 */
		public String getKey() {
			return key;
		}
		
	}
	/** 
	 * @ClassName: UserTypeEnum 
	 * t_qn_user表audit_status状态  在数据字典中的key  user_audit_status对应的value
	 *  
	 */ 
	public enum UserTypeEnum{
		后台用户("user_type","102")
		, APP用户("user_type","101");
		private String key;
		private String value;
		
		/** 
		 * <p>Description: </p> 
		 * @author Guo Yuchao   
		 * @date 2014-11-25 上午10:51:54  
		 */ 
		private UserTypeEnum(String key,String value) {
			this.key = key;
			this.value = value;
		}
		
		/**
		 * 属性 status 的get方法 
		 * @return status
		 */
		public String getValue() {
			return value;
		}
		
		/**
		 * 属性 key 的get方法 
		 * @return key
		 */
		public String getKey() {
			return key;
		}
		
	}
}
