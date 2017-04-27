package org.bana.code.etl.hmms; 
import javax.annotation.Resource;

import org.bana.common.util.etl.SimpleTransform;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
@ContextConfiguration(locations = { 
		"classpath*:/spring/etl/spring-hmms.xml",
		"classpath*:/spring/spring-datasource.xml"
})
//@Ignore
public class TestPrototypeTransform extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private SimpleTransform prototypeTransform;
	/** 
	* @Description:样机信息
	* @author GuoYuchao
	* @date 2014-12-16 11:31:59
	* @throws Exception  
	*/ 
	@Test
	public void testTransform() throws Exception{
		prototypeTransform.execute();
	}
}
