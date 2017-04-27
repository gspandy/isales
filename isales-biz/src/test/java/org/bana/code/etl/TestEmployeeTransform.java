package org.bana.code.etl; 
import javax.annotation.Resource;

import org.bana.common.util.etl.SimpleTransform;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
@ContextConfiguration(locations = { 
		"classpath*:/spring/etl/spring-etl.xml",
		"classpath*:/spring/spring-datasource.xml"
})
@Ignore
public class TestEmployeeTransform extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private SimpleTransform employeeTransform;
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John Zhao   
	* @date 2014-11-19 下午8:48:20 
	* @throws Exception  
	*/ 
	@Test
	public void testTransform() throws Exception{
		employeeTransform.execute();
	}
}
