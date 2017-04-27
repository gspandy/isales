/**
* @Company 青鸟软通   
* @Title: SpringApplicationContextHolder.java 
* @Package com.haier.isales.monitor.service.impl 
* @author Cao Rui   
* @date 2014-10-29 下午7:50:54 
* @version V1.0   
*/ 
package com.haier.isales.monitor.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/** 
 * @ClassName: SpringApplicationContextHolder 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class SpringApplicationContextHolder implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        SpringApplicationContextHolder.context = context;
    }

   
    public static Object getSpringBean(String beanName) {
//        notEmpty(beanName, "bean name is required");
        return context==null?null:context.getBean(beanName);
    }

    public static String[] getBeanDefinitionNames() {
        return context.getBeanDefinitionNames();
    }
}
