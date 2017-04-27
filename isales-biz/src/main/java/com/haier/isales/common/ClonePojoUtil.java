package com.haier.isales.common;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;


/**
 * 两个类的同名复制（属性名相同的属性值被复制，注意如果类型不同，避免使用相同的属性名）
 * @author liuwenjie
 */
public class ClonePojoUtil {
	private static final Logger LOGGER = Logger.getLogger(ClonePojoUtil.class);
	
	
    /** 
    * @Description: 将前一个类中的对象，按照名字相同，类型相同进行复制
    * @author Liu Wenjie   
    * @date 2013-11-13 下午3:19:30 
    * @param from
    * @param toClass
    * @return  
    */ 
    public static <T>T copyClassFromTo(Object from,Class<T> toClass){
        if(from == null || toClass == null){
        	LOGGER.warn("参数对象有null，转化失败... ...");
            return null;
        }
        Field[] eFields = toClass.getDeclaredFields();
        
        T entity = null;
		try {
			entity = toClass.newInstance();
		} catch (Exception e) {
			LOGGER.error("实体转换时实例化被转化的对象失败",e);
			throw new RuntimeException("实体转换时实例化被转化的对象失败",e);
		}
		LOGGER.debug("要转化成的目标类定义中有 " + eFields.length + " 个属性");
        if (arrayIsEmpty(eFields)) {
        	LOGGER.error("转化失败... ...");
            throw new IllegalArgumentException("domain和entity类中存在没有定义的类，或者没有属性的类，无转化的意义，此方法暂时不兼容此种解析");
        }
        for (Field ef : eFields) {
            String eFieldName = ef.getName();
            if("serialVersionUID".equalsIgnoreCase(eFieldName)){
            	LOGGER.debug("序列化的属性serialVersionUID不进行赋值...执行下一步...");
                continue;
            }
            Field df;
			try {
				df = from.getClass().getDeclaredField(eFieldName);
			} catch (Exception e) {
				String info = "原始对象中不包含没有对应的属性" + eFieldName;
				try {
					df = from.getClass().getSuperclass().getDeclaredField(eFieldName);
					LOGGER.debug(info + "，但是原始对象的父类中包含此属性");
				} catch (Exception e1) {
					LOGGER.debug(info + "，原始对象的父类中也不包含没有对应的属性");
					continue;
				}
			}
			df.setAccessible(true);
            ef.setAccessible(true);
            try {
            	Object object = df.get(from);
            	if(object == null){
            		try {
            			PropertyDescriptor pd = new PropertyDescriptor(df.getName(), from.getClass());
        				Method getMethod = pd.getReadMethod();
        				object = getMethod.invoke(from);
					} catch (Exception e) {
						LOGGER.warn("没有找到" + df.getName() + "值 对象对应的get方法",e);
					}
            	}
            	if(ef.getType().equals(String.class)){
            		if(object != null){
            			ef.set(entity, object.toString());
            		}
				}else{
					ef.set(entity, object);
				}
            }  catch (IllegalAccessException ex) {
            	LOGGER.error("反射错误",ex);
            }
            
            df.setAccessible(false);
            ef.setAccessible(false);
        }
        LOGGER.debug("转化成功... ...");
        return entity;
    }
    
    private static boolean arrayIsEmpty(Object[] objs) {
        return objs == null || objs.length == 0;
    }
    
    public static String findFieldGetMethod(String fieldName){
    	return "get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
    }
    
}
