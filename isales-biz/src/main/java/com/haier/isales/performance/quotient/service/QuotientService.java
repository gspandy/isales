/**
 * @Company 青鸟软通   
 * @Title: QuotientService.java 
 * @Package  com.haier.isales.performance.quotient.service
 * @author John Zhao   
 * @date 2014年12月18日  14:20:57
 * @version V1.0   
 */
package com.haier.isales.performance.quotient.service;

import java.util.List;

import com.haier.isales.performance.quotient.domain.QuotientDomain;

/** 
 * @ClassName: QuotientService
 * @Description: Quotient的Service接口定义类
 *  
 */
public interface QuotientService {
	
	public QuotientDomain searchQuotientAccomplish(QuotientDomain t); 
	
	public List<QuotientDomain> searchQuotientCharts(QuotientDomain t);
}
