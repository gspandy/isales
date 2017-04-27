/**
 * @Company 青鸟软通   
 * @Title: DomainEntityUtil.java 
 * @Package com.jbinfo.common.util 
 * @author Liu Wenjie   
 * @date 2013-11-7 下午5:31:04 
 * @version V1.0   
 */
package com.haier.isales.retail.salestarget;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.retail.salestarget.domain.SalestargetDomain;
import com.haier.isales.retail.salestarget.dto.SalestargetDto;
import com.haier.isales.retail.salestarget.dto.SalestargetQueryDto;
import com.haier.isales.retail.salestarget.dto.SalestargetUpdateDto;


/**
 * @ClassName: SalestargetDomainDtoUtil
 * @Description: 业绩的个人销售目标  实体和对象相互转化的工具类
 * 
 */
public class SalestargetDomainDtoUtil {

	public static SalestargetDto cloneSalestargetDomain2DTO(SalestargetDomain domain) {
		//将个人销售目标的domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		SalestargetDto dto = ClonePojoUtil.copyClassFromTo(domain,
				SalestargetDto.class);
		return dto;
	}
	
	public static SalestargetDomain clonePrototypeDto2Domain(SalestargetDto dto) {
		//将个人销售目标的dto信息转化为domain信息
		if (dto == null) {
			return null;
		}
		SalestargetDomain domain = ClonePojoUtil.copyClassFromTo(dto,
				SalestargetDomain.class);
		return domain;
	}
	
	public static SalestargetDomain clonePrototypeQueryDto2Domain(SalestargetQueryDto dto) {
		//将个人销售目标的查询dto信息转化为domain信息
		if (dto == null) {
			return null;
		}
		SalestargetDomain domain = ClonePojoUtil.copyClassFromTo(dto,
				SalestargetDomain.class);
		return domain;
	}
	
	public static SalestargetDomain clonePrototypeUpdateDto2Domain(SalestargetUpdateDto dto) {
		//将个人销售目标的修改dto  转化为domain信息
		if (dto == null) {
			return null;
		}
		SalestargetDomain domain = ClonePojoUtil.copyClassFromTo(dto,
				SalestargetDomain.class);
		return domain;
	}

}