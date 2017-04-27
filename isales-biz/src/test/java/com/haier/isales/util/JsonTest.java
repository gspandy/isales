/**
* @Company 青鸟软通   
* @Title: JsonTest.java 
* @Package org.bana.common.util.basic 
* @author Liu Wenjie   
* @date 2014-12-29 下午2:39:18 
* @version V1.0   
*/ 
package com.haier.isales.util;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;

import org.junit.Test;

/** 
 * @ClassName: JsonTest 
 * @Description: 测试Json字符串的方法
 *  
 */
public class JsonTest {
	
	@Test
	public void testJsonTransform(){
		JSON json = JSONSerializer.toJSON("testsds");
		System.out.println(json.toString());
	}
}
