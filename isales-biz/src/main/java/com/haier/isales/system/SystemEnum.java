/**
* @Company 青鸟软通   
* @Title: SystemEnum.java 
* @Package com.haier.isales.system 
* @author Guo Yuchao   
* @date 2014-12-10 下午7:36:13 
* @version V1.0   
*/ 
package com.haier.isales.system;

/** 
 * @ClassName: SystemEnum 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class SystemEnum {
	
	/** 
	* @ClassName: LabelStatusEnum 
	* @Description: 标签状态
	*  
	*/ 
	public enum LabelStatusEnum{
		
		  有效("label_status","101")
		, 无效("label_status","102");
		  
		private String key;
		private String value;
		
		/** 
		* <p>Description: </p> 
		* @author Guo Yuchao   
		* @date 2014-11-25 上午10:51:54  
		*/ 
		private LabelStatusEnum(String key,String value) {
			this.key = key;
			this.value = value;
		}

		/**
		 * @Description: 属性 value 的get方法 
		 * @return value
		 */
		public String getValue() {
			return value;
		}

		/**
		 * @Description: 属性 key 的get方法 
		 * @return key
		 */
		public String getKey() {
			return key;
		}

	}
	
	/** 
	 * @ClassName: LabelGroupStatusEnum 
	 * @Description: 标签组状态
	 *  
	 */ 
	public enum LabelGroupStatusEnum{
		
		有效("label_group_status","101")
		, 无效("label_group_status","102");
		
		private String key;
		private String value;
		
		/** 
		 * <p>Description: </p> 
		 * @author Guo Yuchao   
		 * @date 2014-11-25 上午10:51:54  
		 */ 
		private LabelGroupStatusEnum(String key,String value) {
			this.key = key;
			this.value = value;
		}
		
		/**
		 * @Description: 属性 value 的get方法 
		 * @return value
		 */
		public String getValue() {
			return value;
		}
		
		/**
		 * @Description: 属性 key 的get方法 
		 * @return key
		 */
		public String getKey() {
			return key;
		}
		
	}
	
	
	
}
