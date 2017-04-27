/**
* @Company 青鸟软通   
* @Title: DailyOffdutyDomainDtoUtil.java 
* @Package com.haier.isales.dailymgt 
* @author Huang nana   
* @date 2015-1-27 下午6:22:05 
* @version V1.0   
*/ 
package com.haier.isales.app.omshandler.domain;

import com.haier.isales.app.dto.OmsHandlerDTO;
import com.haier.isales.common.ClonePojoUtil;

/** 
 * @ClassName: DailyOffdutyDomainDtoUtil 
 *  
 *  
 */
public class IssueHandlerDomainDtoUtil {
	
	public static OmsHandlerDTO cloneIssueHandlerDomain2DTO(OmsHandlerDomain domain) {
		if (domain == null) {
			return null;
		}
		OmsHandlerDTO dto = ClonePojoUtil.copyClassFromTo(domain,OmsHandlerDTO.class);
		return dto;
	}
}
