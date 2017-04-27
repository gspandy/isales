/**
* @Company 青鸟软通   
* @Title: EcmsConstants.java 
* @Package com.jbinfo.ecms.util 
* @author Liu Wenjie   
* @date 2013-11-19 下午12:37:35 
* @version V1.0   
*/ 
package com.haier.isales.common;

import java.io.Serializable;

/** 
 * @ClassName: EcmsConstants 
 * @Description: 规定系统中的常量数据
 *  
 */
public class IsalesConstants {
//	private static Logger logger = Logger.getLogger(IsalesConstants.class);
	/**
	* @ClassName: DictionaryType 
	* @Description: 业务字典的类型
	*
	 */
	public enum DictionaryType{
		// system status
		  user_status("user_status")
		, user_type("user_type")
		, user_audit_status("user_audit_status")
		, equip_buy_for("equip_buy_for")
		, share_save_type("share_save_type")
		, menu_type("menu_type")
		, shared_type("shared_type")
		, account_status("account_status")
		, login_behaviour_user_device("login_behaviour_user_device")
		, login_behaviour_logout_type("login_behaviour_logout_type")
		, comments_status("comments_status")
		, moments_status("moments_status")
		, reminder_send_status("reminder_send_status")
		, shop_del_flag("shop_del_flag")
		, shop_post_code("shop_post_code")
		, class_ref_score_rule("class_ref_score_rule")
		, super_password("super_password")
		, constants("constants")
		, resource_function_type("resource_function_type")
		, label_status("label_status")
		, label_group_status("label_group_status")
		, prototype_status("prototype_status")
		, prototype_feedback_type("prototype_feedback_type")
		, bpm_default_issue_handler("bpm_default_issue_handler")
		, report_sales_expiry_date("report_sales_expiry_date")
		, shop_position_distance("shop_position_distance");
		
		private String typeId;
		private DictionaryType(String typeId) {
			this.typeId = typeId;
		}
		/**
		 * @Description: 属性 typeId 的get方法 
		 * @return typeId
		 */
		public String getTypeId() {
			return typeId;
		}
	}
	
	/**
	 * 
	* @ClassName: Constans 
	* @Description: 系统中的一些常量字符串 
	*
	 */
	public interface Constans{
		public static final String CANCELL_USER_STATUS = "102";
		public static final String UPLOAD_DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
		String ROOT_ORG_CODE = "0";
		
	}
	
	
		
	
		
	/**
	* @ClassName: Constant 
	* @Description: 常量对象
	*
	 */
	public static class Constant implements Serializable{
		/** 
		* @Fields serialVersionUID : 
		*/ 
		private static final long serialVersionUID = 8023944984999068071L;
		private String key;
		private String value;
		/**
		 * @Description: 属性 key 的get方法 
		 * @return key
		 */
		public String getKey() {
			return key;
		}
		/**
		 * @Description: 属性 key 的set方法 
		 * @param key 
		 */
		public void setKey(String key) {
			this.key = key;
		}
		/**
		 * @Description: 属性 value 的get方法 
		 * @return value
		 */
		public String getValue() {
			return value;
		}
		/**
		 * @Description: 属性 value 的set方法 
		 * @param value 
		 */
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	
	
	
	
	
}
