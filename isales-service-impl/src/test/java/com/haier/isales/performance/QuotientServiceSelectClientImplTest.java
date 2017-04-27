/**
 * @Company 青鸟软通   
 * @Title: QuotientServiceSelectClientImplTest.java 
 * @Package com.haier.isales.performance 
 * @author John.zhao   
 * @date 2014-12-24 上午11:37:58 
 * @version V1.0   
 */
package com.haier.isales.performance;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.performance.quotient.dto.QuotientChartsDTO;
import com.haier.isales.performance.quotient.dto.QuotientDTO;
import com.haier.isales.performance.quotient.service.QuotientSelectClient;
import com.haier.isales.test.BaseIsalesClientTestCase;

/**
 * @ClassName: QuotientServiceSelectClientImplTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
@ContextConfiguration(locations = { "classpath*:/spring/performance/spring-quotient.xml",
		"classpath*:/spring_service/performance/spring-quotient-select-provider.xml" })
public class QuotientServiceSelectClientImplTest extends BaseIsalesClientTestCase {
	@Resource
	private QuotientSelectClient quotientSelectClient;

	@Test
	public void testgetQuotientCharts() {
		QuotientDTO t = new QuotientDTO();
		t.setCustNo("8799000745");
		t.setProductLineNo("103");
		t.setYear(2014);
		t.setMonth(12);
		QuotientChartsDTO qcdto = (QuotientChartsDTO) quotientSelectClient.getQuotientCharts(t);
		Assert.assertNotNull(qcdto);
	}
}
