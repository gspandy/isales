package org.bana.code.etl.isales; 
import javax.annotation.Resource;

import org.bana.common.util.etl.SimpleTransform;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
@ContextConfiguration(locations = { 
		"classpath*:/spring/etl/spring-isales.xml",
		"classpath*:/spring/spring-datasource.xml"
})
@Ignore
public class TestUserBehaviourTransform extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private SimpleTransform userBehaviourTransform;
	
	@Resource
	private SimpleTransform loginBehaviourTransform;
	
	@Test
	public void testTransform() throws Exception{
		userBehaviourTransform.execute();
	}
	@Test
	public void testloginTransform() throws Exception{
		loginBehaviourTransform.execute();
	}
	
	public static void main(String[] args) {
		System.out.println(Boolean.valueOf("0"));
	}
}
