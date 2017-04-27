/**
 * @Company 青鸟软通   
 * @Title: DomainEntityUtil.java 
 * @Package com.jbinfo.common.util 
 * @author Liu Wenjie   
 * @date 2013-11-7 下午5:31:04 
 * @version V1.0   
 */
package com.haier.isales.retail.personalmodel;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.retail.personalmodel.domain.PersonalmodelDomain;
import com.haier.isales.retail.personalmodel.dto.PersonalModelAddDto;
import com.haier.isales.retail.personalmodel.dto.PersonalModelDto;
import com.haier.isales.retail.personalmodel.dto.PersonalModelQueryDto;


/**
 * @ClassName: PersonalModelDomainDtoUtil
 * @Description: 直销员常用型号 模块中 实体和对象相互转化的工具类
 * 
 */
public class PersonalModelDomainDtoUtil {

	public static PersonalModelDto clonePersonalmodelDomain2DTO(PersonalmodelDomain domain) {
		//将domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		PersonalModelDto dto = ClonePojoUtil.copyClassFromTo(domain,
				PersonalModelDto.class);
		return dto;
	}
	public static PersonalmodelDomain clonePersonalModelQueryDTO2Domain(PersonalModelQueryDto dto) {
		//将查询的dto信息转化为domain信息
		if (dto == null) {
			return null;
		}
		PersonalmodelDomain domain = ClonePojoUtil.copyClassFromTo(dto,
				PersonalmodelDomain.class);
		return domain;
	}
	
	public static PersonalmodelDomain clonePersonalModelAddDTO2Domain(PersonalModelAddDto dto) {
		//将添加的dto信息转化为domain信息
		if (dto == null) {
			return null;
		}
		PersonalmodelDomain domain = ClonePojoUtil.copyClassFromTo(dto,
				PersonalmodelDomain.class);
		return domain;
	}
	
	
}