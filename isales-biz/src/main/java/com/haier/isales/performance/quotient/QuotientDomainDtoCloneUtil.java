/**
 * @Company 青鸟软通   
 * @Title: DomainDtoCloneUtil.java 
 * @Package com.haier.isales.performance.quotient 
 * @author John.zhao   
 * @date 2014-12-19 上午9:54:21 
 * @version V1.0   
 */
package com.haier.isales.performance.quotient;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.performance.quotient.domain.QuotientDomain;
import com.haier.isales.performance.quotient.dto.QuotientDTO;

/**
 * @ClassName: DomainDtoCloneUtil
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class QuotientDomainDtoCloneUtil {

	public static QuotientDomain cloneQuotientDTO2Domain(QuotientDTO quotientDTO) {
		if (quotientDTO == null) {
			return null;
		}
		QuotientDomain domain = ClonePojoUtil.copyClassFromTo(quotientDTO, QuotientDomain.class);
		return domain;
	}

	public static QuotientDTO cloneQuotientDomain2DTO(QuotientDomain domain) {
		if (domain == null) {
			return null;
		}
		QuotientDTO dto = ClonePojoUtil.copyClassFromTo(domain, QuotientDTO.class);
		return dto;
	}
}
