/**
* @Company 青鸟软通   
* @Title: JavaToolsUtil.java 
* @Package com.haier.isales.common 
* @author Guo Yuchao   
* @date 2014-12-26 下午1:22:55 
* @version V1.0   
*/ 
package com.haier.isales.common;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bana.common.util.basic.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * @ClassName: JavaToolsUtil 
 * @Description: 
 *  
 */
public class JavaToolsUtil {
	private static final Logger LOG = LoggerFactory.getLogger(JavaToolsUtil.class);
	 /** 
	* @Description: 查找对象中指定属性名的值
	* @author Guo Yuchao   
	* @date 2014-12-29 上午10:01:48 
	* @param fieldName
	* @param obj
	* @return  
	*/ 
	private static Object getFieldValueByName(String fieldName, Object obj) {
		if(StringUtils.isEmpty(fieldName)){
			return null;
		}
		try {
			PropertyDescriptor pd = new PropertyDescriptor(fieldName, obj.getClass());
			Method getMethod = pd.getReadMethod();
			Object fieldValue = getMethod.invoke(obj);
			return fieldValue;
		} catch (Exception e) {
			LOG.info("getFieldValueByName Exception:"+e.getMessage());
			return null;
		}
	 }

	 /**
	  * 获取【引用实例】 对应的类中所有【属性名称】数组
	  * */
	 public static List<String> getFieldName(Object obj) {
		 /**
		  * getFields()获得某个类的所有的公共（public）的字段，包括父类。 
		  * getDeclaredFields()获得某个类的所有声明的字段，即包括public、private和proteced
		  */
		 Field[] fields = obj.getClass().getDeclaredFields();
		 List<String> fieldNames = new ArrayList<String>();
		 for (int i = 0; i < fields.length; i++) {
			 fieldNames.add(fields[i].getName());
		 }
		 return fieldNames;
	 }


	/** 
	* @Description: 获取属性类型(type)，属性名(name)，属性值(value)的map组成的  Map<fieldName,Map<String,Object>>
	* @author Guo Yuchao   
	* @date 2014-12-27 下午1:32:37 
	* @param destObj
	* @return  
	*/ 
	public static Map<String,Map<String,Object>> getFiledsInfo(Object destObj) {
		 Field[] fields = destObj.getClass().getDeclaredFields();
		 Map<String,Map<String,Object>> fieldInfoMap = new HashMap<String, Map<String,Object>>();
		 for (Field field : fields) {
			 if(field == null){
				 continue;
			 }
			 Map<String, Object> eachMap = new HashMap<String, Object>();
			 eachMap.put("type", field.getType().getName());//获取【field属性】对应的【数据类型】
			 eachMap.put("name", field.getName());//获取【field属性】对应的【属性名称】
			 eachMap.put("value", getFieldValueByName(field.getName(), destObj));//获取【field属性】对应的【值】
			 //这里没有判断属性名称是否存在，如果属性名不存在此处不会报错，调用处请酌情考虑
			 fieldInfoMap.put(field.getName(),eachMap);
		 }
		 return fieldInfoMap;
	 }


	/** 
	* @Description: 获取对象的所有属性值，返回一个对象数组  Map<fieldName,fieldValue>
	* @author Guo Yuchao   
	* @date 2014-12-27 下午1:32:16 
	* @param destObj
	* @return  
	*/ 
	public static Map<String,Object> getFieldValues(Object destObj) {
		 List<String> fieldNames = getFieldName(destObj);
		 Map<String, Object> eachMap = new HashMap<String, Object>();
		 for (String fieldName : fieldNames) {
			 if(StringUtils.isEmpty(fieldName)){
				 continue;
			 }
			 eachMap.put(fieldName, getFieldValueByName(fieldName, destObj));//获取【field属性】对应的【值】
		 }
		 return eachMap;
	 }
	/** 
	* @Description:  获取对象的【非空】属性值，返回一个对象数组  Map<fieldName,fieldValue> fieldName 为大写
	* @author Guo Yuchao   
	* @date 2015-1-30 上午10:48:36 
	* @param destObj
	* @return  
	*/ 
	public static Map<String,Object> getUpperFieldTrueValues(Object destObj) {
		List<String> fieldNames = getFieldName(destObj);
		Map<String, Object> eachMap = new HashMap<String, Object>();
		for (String fieldName : fieldNames) {
			if(StringUtils.isEmpty(fieldName)){
				continue;
			}
			Object fieldValue = getFieldValueByName(fieldName, destObj);
			if(fieldValue instanceof String){
				if(!StringUtils.isEmpty((String) fieldValue)){
					eachMap.put(fieldName.toUpperCase(), fieldValue);//获取【field字符串属性】对应的【值】
				}
				continue;
			}else{
				if(fieldValue != null){
					eachMap.put(fieldName.toUpperCase(), fieldValue);//获取【field引用类型属性】对应的【值】
				}
			}
		}
		return eachMap;
	}
	/** 
	 * @Description:  获取对象的【非空】属性值，返回一个对象数组  Map<fieldName,fieldValue> fieldName与定义声明时的相同
	 * @author Guo Yuchao   
	 * @date 2015-1-30 上午10:48:36 
	 * @param destObj
	 * @return  
	 */ 
	public static Map<String,Object> getFieldTrueValues(Object destObj) {
		List<String> fieldNames = getFieldName(destObj);
		Map<String, Object> eachMap = new HashMap<String, Object>();
		for (String fieldName : fieldNames) {
			if(StringUtils.isEmpty(fieldName)){
				continue;
			}
			Object fieldValue = getFieldValueByName(fieldName, destObj);
			if(fieldValue instanceof String){
				if(!StringUtils.isEmpty((String) fieldValue)){
					eachMap.put(fieldName, fieldValue);//获取【field字符串属性】对应的【值】
				}
				continue;
			}else{
				if(fieldValue != null){
					eachMap.put(fieldName, fieldValue);//获取【field引用类型属性】对应的【值】
				}
			}
		}
		return eachMap;
	}
		 
	 public static void main(String[] args) throws Exception {
//		MenuSearchDTO menuSearchDTO = new MenuSearchDTO();
//		menuSearchDTO.setMenuType("102");
//		menuSearchDTO.setMenuLevel(1l);
//		menuSearchDTO.setParentsId(0l);
//		LOG.info("查询属性："+getFiledValues(menuSearchDTO));
//		LOG.info("查询属性："+menuSearchDTO.getClass().getDeclaredField("serialVersionUID").getType().toString());
//		Hashtable map = new Hashtable(); 
//		CreateBoData4Json createBoData4Json = new CreateBoData4Json();
//	    createBoData4Json.setGm("123");
//	    createBoData4Json.setTbr("小郭");//	提报人	文本	单行	20
//	    createBoData4Json.setTbsj(DateUtil.getNowString("yyyy-MM-dd HH:mm:ss"))	;//提报时间	日期	日期时间	0
//	    createBoData4Json.setWtdlmc("产品");//	需求大类名称	文本	单行	50
//	    createBoData4Json.setWtxlmc("能效标识");//	需求小类名称	文本	单行	50
//	    createBoData4Json.setWtbt("直销员APP项目，问题反馈")	;//需求标题	文本	单行	100
//	    createBoData4Json.setWtsm("直销员APP项目，问题说明")	;//需求内容	文本	多行	2000
//	    createBoData4Json.setCpz("12312");
//	    createBoData4Json.setBu("WGG大");
//	    createBoData4Json.setJc("1")	;//级次	数值	数值	2
//	    createBoData4Json.setTbrbh("A0003142");//提报人编号	文本	单行	10
//	    createBoData4Json.setXsqd("苏宁");//	渠道	文本	列表	20	
//	    createBoData4Json.setHtype("任务协同");//	平台类型	文本	单行	50	
//	    createBoData4Json.setCldz("问题提问");//	平台类型	文本	单行	50	字符，字节和编码
//	    createBoData4Json.setMd("sd");//	门店	文本	单行	200	
//		Map<String,Object> map = new HashMap<String, Object>();
//	
//		map = getUpperFieldTrueValues(createBoData4Json);
//		JSONObject fromObject = JSONObject.fromObject(map);
//		LOG.info("test"+fromObject);
	 }
}
