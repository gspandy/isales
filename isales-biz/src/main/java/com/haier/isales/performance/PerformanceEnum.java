/**
* @Company 青鸟软通   
* @Title: PerformanceEnum.java 
* @Package com.haier.isales.system 
* @author Guo Yuchao   
* @date 2014-12-10 下午7:36:13 
* @version V1.0   
*/ 
package com.haier.isales.performance;

/** 
 * @ClassName: PerformanceEnum 
 * @Description: 业绩相关枚举
 *  
 */
public class PerformanceEnum {
	
	/** 
	* @ClassName: IsAscendEnum 
	* @Description: 增长状态
	*  
	*/ 
	public enum IsAscendEnum{
		
		  上升("","101")
		, 下降("","102")
		, 平稳("","103");
		  
		private String key;
		private String value;
		
		/** 
		* <p>Description: </p> 
		* @author Guo Yuchao   
		* @date 2014-11-25 上午10:51:54  
		*/ 
		private IsAscendEnum(String key,String value) {
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
