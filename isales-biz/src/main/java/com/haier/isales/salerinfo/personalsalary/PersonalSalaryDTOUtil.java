/**
 * @Company 青鸟软通   
 * @Title: PersonalSalaryDTOUtil.java 
 * @Package com.haier.isales.salerinfo.personalsalary 
 * @author John.zhao   
 * @date 2015-2-26 上午11:17:18 
 * @version V1.0   
 */
package com.haier.isales.salerinfo.personalsalary;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.salerinfo.personalsalary.dto.PersonalSalaryDTO;
import com.haier.isales.ws.zzjyt.client.btbappzxygzimpl.BtbAppZxyGzInfo;

/**
 * @ClassName: PersonalSalaryDTOUtil
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class PersonalSalaryDTOUtil {

	/**
	 * @Description: 吧webservice返回的工资信息转化为dto
	 * @author John.zhao
	 * @date 2015-2-26 上午11:19:52
	 * @param btbAppZxyGzInfo
	 * @return
	 */
	public static PersonalSalaryDTO clonePersonalSalary2DTO(BtbAppZxyGzInfo btbAppZxyGzInfo) {
		// 吧webservice返回的工资信息转化为dto
		if (btbAppZxyGzInfo == null) {
			return null;
		}
		PersonalSalaryDTO dto = ClonePojoUtil.copyClassFromTo(btbAppZxyGzInfo,PersonalSalaryDTO.class);
		return dto;
	}

}
