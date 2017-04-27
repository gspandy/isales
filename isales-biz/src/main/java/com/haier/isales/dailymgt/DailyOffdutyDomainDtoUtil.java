/**
* @Company 青鸟软通   
* @Title: DailyOffdutyDomainDtoUtil.java 
* @Package com.haier.isales.dailymgt 
* @author Huang nana   
* @date 2015-1-27 下午6:22:05 
* @version V1.0   
*/ 
package com.haier.isales.dailymgt;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.dailymgt.domain.DailyOffdutyDomain;
import com.haier.isales.dailymgt.dto.DailyOffdutyDTO;

/** 
 * @ClassName: DailyOffdutyDomainDtoUtil 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class DailyOffdutyDomainDtoUtil {
	/** 
	* @Description: 日控考勤 domain2dto
	* @author Huang nana   
	* @date 2015-1-28 上午9:40:18 
	* @param domain
	* @return  
	*/ 
	public static DailyOffdutyDTO cloneDailyOffdutyDoamin2DTO(DailyOffdutyDomain domain) {
		//将直销员的domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		DailyOffdutyDTO dto = ClonePojoUtil.copyClassFromTo(domain,	DailyOffdutyDTO.class);
		return dto;
	}
}
