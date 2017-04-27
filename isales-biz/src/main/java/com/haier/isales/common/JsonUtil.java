/**
 * @Company 青鸟软通   
 * @Title: JsonUtil.java 
 * @Package org.bana.common.util.basic 
 * @author Liu Wenjie   
 * @date 2014-11-21 上午11:53:43 
 * @version V1.0   
 */
package com.haier.isales.common;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;
import net.sf.json.util.PropertyFilter;

import org.bana.common.util.basic.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: JsonUtil
 * @Description: 提供部分Json转换的工具类
 * 
 */
public class JsonUtil {

	private static Logger logger = LoggerFactory.getLogger(JsonUtil.class);

	/**
	 * @Description: 创建一个JsonConfig，对制定的类型，进行属性过滤，只包含指定的属性
	 * @author Liu Wenjie
	 * @date 2014-11-21 上午11:52:10
	 * @param cls
	 * @param properties
	 * @return
	 */
	public static JsonConfig getFilterPropertyJsonConfig(final Class<? extends Object> cls, String... properties) {
		JsonConfig jsonConfig = new JsonConfig();
		final List<String> asList = Arrays.asList(properties);
		jsonConfig.setJsonPropertyFilter(new PropertyFilter() {
			public boolean apply(Object source/* 属性的拥有者 */, String name /* 属性名字 */, Object value/* 属性值 */) {
				// return true to skip name
				if (source.getClass().equals(cls)) {
//					if (asList.contains(name)) {
//						return false;
//					} else {
//						return true;
//					}
					return !asList.contains(name);
				}
				return false;
			}
		});
		return jsonConfig;
	}

	/**
	 * @Description: 从json串中取相应key的value
	 * @author John.zhao
	 * @date 2015-1-16 下午12:19:29
	 * @param jsonStr josn字符串
	 * @param element josn字符串的key
	 * @return josn字符串的key对应的value
	 */
	public static String getjsonVal(String jsonStr, String element) {
		String returnStr = "";
		if (StringUtil.isEmpty(jsonStr) || StringUtil.isEmpty(element)) {
			return "";
		}
		try {
			JSONObject objson = JSONObject.fromObject(jsonStr);
			// if (jsonStr.indexOf(element) != -1) {
			// returnStr = objson.getString(element);
			// }
			if (objson.has(element)) {
				returnStr = objson.getString(element);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return returnStr;
	}

	public static void main(String[] args) {
//		String jsonStr = "{\"book\": [\"2\",\"3\", \"4\" ]}";
//		JSONObject objson = JSONObject.fromObject(jsonStr);
//		JSONArray jsonarray = JSONArray.fromObject(objson.get("book"));
//		System.out.println(jsonarray.get(0) + "====" + jsonarray.get(1) + "====" + jsonarray.get(2) + "====");
//		
//		JSON json =  JSONSerializer.toJSON("{\"book\": [\"2\",\"3\", \"4\" ]}");
//		System.out.println(json);
	}
	
	public static class JsonDateValueProcessor implements JsonValueProcessor{

		private String dateFormat = "yyyy-MM-dd HH:mm:ss";
		
		/**
		* <p>Description: </p> 
		* @author Liu Wenjie   
		* @date 2015-3-11 下午1:49:47 
		* @param arg0
		* @param arg1
		* @return 
		* @see net.sf.json.processors.JsonValueProcessor#processArrayValue(java.lang.Object, net.sf.json.JsonConfig) 
		*/ 
		@Override
		public Object processArrayValue(Object value, JsonConfig jsonConfig) {
			return process(value);
		}

		/**
		* <p>Description: </p> 
		* @author Liu Wenjie   
		* @date 2015-3-11 下午1:49:47 
		* @param arg0
		* @param arg1
		* @param arg2
		* @return 
		* @see net.sf.json.processors.JsonValueProcessor#processObjectValue(java.lang.String, java.lang.Object, net.sf.json.JsonConfig) 
		*/ 
		@Override
		public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
			return process(value);
		}

		/** 
		* @Description: 转化时间格式
		* @author Liu Wenjie   
		* @date 2015-3-11 下午1:51:54 
		* @param value
		* @return  
		*/ 
		private Object process(Object value) {
			if(value instanceof Date){
				Date date = (Date)value;
				return DateUtil.toString(date, dateFormat);
			}
			return "";
		}

		/**
		 * @Description: 属性 dateFormat 的get方法 
		 * @return dateFormat
		 */
		public String getDateFormat() {
			return dateFormat;
		}

		/**
		 * @Description: 属性 dateFormat 的set方法 
		 * @param dateFormat 
		 */
		public void setDateFormat(String dateFormat) {
			this.dateFormat = dateFormat;
		}
		
	}
}
