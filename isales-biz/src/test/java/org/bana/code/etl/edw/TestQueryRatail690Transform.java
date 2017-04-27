/**
* @Company 青鸟软通   
* @Title: TestQueryRatailTransform.java 
* @Package org.bana.code.etl.edw 
* @author John.zhao   
* @date 2014-12-15 下午4:56:57 
* @version V1.0   
*/ 
package org.bana.code.etl.edw;

import javax.annotation.Resource;

import org.bana.common.util.etl.SimpleTransform;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/** 
 * @ClassName: TestQueryRatailTransform 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring/etl/spring-edw.xml",
		"classpath*:/spring/spring-datasource.xml"
})
@Ignore
public class TestQueryRatail690Transform extends AbstractJUnit4SpringContextTests{
	@Resource
	private SimpleTransform queryRatail690Transform;
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John Zhao   
	* @date 2014-11-19 下午8:48:20 
	* @throws Exception  
	*/ 
	@Test
	public void testTransform() throws Exception{
		queryRatail690Transform.execute();
	}
}
