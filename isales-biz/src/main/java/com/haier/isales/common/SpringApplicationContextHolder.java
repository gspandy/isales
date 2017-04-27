/**
* @Company 青鸟软通   
* @Title: SpringApplicationContextHolder.java 
* @Package com.jbinfo.ecms.util 
* @author Liu Wenjie   
* @date 2013-12-16 下午6:43:21 
* @version V1.0   
*/ 
package com.haier.isales.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/** 
 * @ClassName: SpringApplicationContextHolder 
 * @Description: bean 配置文件的管理方法
 *  
 */
public class SpringApplicationContextHolder implements ApplicationContextAware {
	private static ApplicationContext applicationContext;
	
	/**
	 * 获取bean实例
	 * @param beanId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String beanId){
		checkApplicationContext();
		return (T)applicationContext.getBean(beanId);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clazz) {  
		checkApplicationContext();
		return (T) applicationContext.getBeansOfType(clazz);  
	}
	
	private static void checkApplicationContext() {  
		if (applicationContext == null) {  
			throw new IllegalStateException("applicaitonContext未注入,请在applicationContext.xml中定义SpringContextHolder");  
		}  
	}  

	/**
	 * @Description: 属性 applicationContext 的get方法 
	 * @return applicationContext
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * @Description: 属性 applicationContext 的set方法 
	 * @param applicationContext 
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringApplicationContextHolder.applicationContext = applicationContext;
	}
	
}
