/**
* @Company 青鸟软通   
* @Title: BaseScoreTestCase.java 
* @Package com.haier.isales.score.service 
* @author Liu Wenjie   
* @date 2014-11-23 下午2:47:19 
* @version V1.0   
*/ 
package com.haier.isales.score.service;

import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;

/** 
 * @ClassName: BaseScoreTestCase 
 * @Description: 
 *  
 */
@ContextConfiguration(locations={
		"classpath*:/spring/system/spring-dictionary.xml",
		"classpath*:/spring/salerinfo/spring-userDetail.xml",
		"classpath*:/spring/score/spring-*.xml"
})
public class BaseScoreTestCase extends BaseIsalesTestCase {

}
