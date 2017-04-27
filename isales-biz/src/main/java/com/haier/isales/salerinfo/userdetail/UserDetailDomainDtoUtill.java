/**
 * @Company 青鸟软通   
 * @Title: UserDetailDomainDtoUtill.java 
 * @Package com.haier.isales.salerinfo.userdetail 
 * @author Guo Yuchao   
 * @date 2014-11-21 下午10:14:17 
 * @version V1.0   
 */
package com.haier.isales.salerinfo.userdetail;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.salerinfo.userdetail.domain.UserDetailDomain;
import com.haier.isales.salerinfo.userdetail.dto.UserDetailSearchDTO;

/**
 * @ClassName: UserDetailDomainDtoUtill
 * @Description:
 * 
 */
public class UserDetailDomainDtoUtill {
	/**
	 * @Description: clone UserDetailDomain to UserDetailSearchDTO
	 * @author Guo Yuchao
	 * @date 2014-11-21 下午10:22:51
	 * @param userDetailDomain
	 * @return
	 */
	public static UserDetailSearchDTO cloneUserDetailDomain2Dto(UserDetailDomain userDetailDomain) {
		if (userDetailDomain == null) {
			return null;
		}
		UserDetailSearchDTO userDetailSearchDTO = ClonePojoUtil.copyClassFromTo(userDetailDomain,
				UserDetailSearchDTO.class);
		return userDetailSearchDTO;
	}

	/**
	 * @Description: clone UserDetailSearchDTO to UserDetailDomain
	 * @author John.zhao
	 * @date 2014-11-22 下午3:19:14
	 * @param dto
	 * @return
	 */
	public static UserDetailDomain cloneUserDetailDto2Domain(UserDetailSearchDTO dto) {
		if (dto == null) {
			return null;
		}
		UserDetailDomain domain = ClonePojoUtil.copyClassFromTo(dto, UserDetailDomain.class);
		return domain;
	}

}
