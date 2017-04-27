/**
* @Company 青鸟软通   
* @Title: PrototypeEnum.java 
* @Package com.haier.isales.prototype 
* @author Guo Yuchao   
* @date 2014-12-26 下午7:36:13 
* @version V1.0   
*/ 
package com.haier.isales.prototype;

/** 
 * @ClassName: PrototypeEnum 
 * @Description: 样机相关枚举
 *  
 */
public class PrototypeEnum {
	
	/** 
	* @ClassName: PrototypeStatus 
	* @Description: 样机核销状态
	*  
	*/ 
	public enum PrototypeStatusEnum{
		
		已出样("","101")
		, 已核销("","102");
		  
		private String key;
		private String value;
		
		/** 
		* <p>Description: </p> 
		* @author Guo Yuchao   
		* @date 2014-11-25 上午10:51:54  
		*/ 
		private PrototypeStatusEnum(String key,String value) {
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
