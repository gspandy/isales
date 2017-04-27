/**
* @Company 青鸟软通   
* @Title: TestGoodBaseEtl.java 
* @Package org.bana.code.quartz 
* @author Liu Wenjie   
* @date 2014-11-10 下午10:38:20 
* @version V1.0   
*/ 
package org.bana.code.etl;

import javax.annotation.Resource;

import org.bana.common.util.etl.SimpleTransform;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;


/** 
 * @ClassName: TestGoodBaseEtl 
 * @Description: 
 *  
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring/etl/spring-etl.xml",
		"classpath*:/spring/spring-datasource.xml"
})
@Ignore
public class TestGoodBaseTransform extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private SimpleTransform goodBaseTransform;
	/** 
	* @Description: 测试转换
	* @author Liu Wenjie   
	 * @throws Exception 
	* @date 2014-11-10 下午10:39:08   
	*/ 
	@Test
	public void testTransform() throws Exception{
		goodBaseTransform.execute();
	}
}
