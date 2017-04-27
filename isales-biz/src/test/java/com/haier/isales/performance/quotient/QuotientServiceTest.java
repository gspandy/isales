/**
* @Company 青鸟软通   
* @Title: QuotientServiceTest.java 
* @Package com.haier.isales.performance.quotient 
* @author John.zhao   
* @date 2014-12-18 下午7:39:43 
* @version V1.0   
*/ 
package com.haier.isales.performance.quotient;

import java.util.List;

import org.junit.Test;
import org.springframework.util.Assert;

import com.haier.isales.performance.BasePerformanceTestCase;
import com.haier.isales.performance.quotient.domain.QuotientDomain;

/** 
 * @ClassName: QuotientServiceTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class QuotientServiceTest extends BasePerformanceTestCase {

	@Test
	public void testSearchQuotientAccomplish(){
		QuotientDomain t = new QuotientDomain();
		t.setCustNo("8799000745");
		t.setProductLineNo("103");
		t.setYear(2014);
		t.setMonth(12);
		QuotientDomain qd = this.quotientService.searchQuotientAccomplish(t);
		Assert.notNull(qd);
	}
	
	@Test
	public void testSearchQuotientCharts(){
		QuotientDomain t = new QuotientDomain();
		t.setCustNo("8799000745");
		t.setProductLineNo("103");
		t.setYear(2014);
		t.setMonth(12);
		List<QuotientDomain> searchQuotientCharts = quotientService.searchQuotientCharts(t);
		Assert.notNull(searchQuotientCharts);
	}
}
