/**
* @Company 青鸟软通   
* @Title: BaseMomentsTestCase.java 
* @Package com.haier.isales.moments.service 
* @author Liu Wenjie   
* @date 2014-11-22 下午3:55:50 
* @version V1.0   
*/ 
package com.haier.isales.moments.service;

import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;

/** 
 * @ClassName: BaseMomentsTestCase 
 * @Description: 基础测试方法
 *  
 */
@ContextConfiguration(locations={
	"classpath*:/spring/moments/spring-*.xml",
	"classpath*:/spring/system/spring-*.xml"
})
public class BaseMomentsTestCase extends BaseIsalesTestCase{
	
}
