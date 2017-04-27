/**
* @Company 青鸟软通   
* @Title: MomentsDomainDtoUtil.java 
* @Package com.haier.isales.moments 
* @author Liu Wenjie   
* @date 2015-3-11 下午2:48:19 
* @version V1.0   
*/ 
package com.haier.isales.moments;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.moments.domain.MomentsDomain;
import com.haier.isales.moments.dto.MomentsDTO;

/** 
 * @ClassName: MomentsDomainDtoUtil 
 * @Description: moments模块中 实体和对象相互转化的工具类
 *  
 */
public class MomentsDomainDtoUtil {
	public static MomentsDTO cloneMomentsDomain2DTO(MomentsDomain domain) {
		//将潜客的domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		MomentsDTO dto = ClonePojoUtil.copyClassFromTo(domain,
				MomentsDTO.class);
		//额外处理domain和dto中不同的时间，domain中为Date类型，dto中为string类型，格式为YYYY-MM-DD
		return dto;
	}
}
