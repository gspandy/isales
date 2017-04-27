/**
* @Company 青鸟软通   
* @Title: PersonalSalaryServiceImplTest.java 
* @Package com.haier.isales.salerinfo 
* @author John.zhao   
* @date 2015-2-26 上午11:40:04 
* @version V1.0   
*/ 
package com.haier.isales.salerinfo;

import java.util.Calendar;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.salerinfo.personalsalary.dto.PersonalSalarySearchDTO;
import com.haier.isales.salerinfo.personalsalary.service.PersonalSalaryService;
import com.haier.isales.ws.zzjyt.client.btbappzxygzimpl.BtbAppZxyGzInfo;

/** 
 * @ClassName: PersonalSalaryServiceImplTest 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
@ContextConfiguration(locations = { 
"classpath*:/spring/salerinfo/spring-personalSalary.xml",
"classpath*:/spring_ws/zzjyt/spring-BtbAppZxyGzImpl.xml"
})
public class PersonalSalaryServiceImplTest extends BaseSalerInfoTestCase {
	@Resource
	private PersonalSalaryService personalSalaryService;
	
	@Test
	public void testSearchPersonalSalary(){
		PersonalSalarySearchDTO personalSalarySearchDTO = new PersonalSalarySearchDTO();
		Calendar ca = Calendar.getInstance();
		int month = ca.get(Calendar.MONTH);
		int year = ca.get(Calendar.YEAR);
		String months = "";
		if (month < 10) {
			months = year + "-0" + month;
		} else {
			months = year + "-" + month;
		}
		String ygid = "Z0189116";
		personalSalarySearchDTO.setMonths(months);
		personalSalarySearchDTO.setYgid(ygid);
		BtbAppZxyGzInfo btbAppZxyGzInfo = personalSalaryService.searchPersonalSalary(personalSalarySearchDTO);
		Assert.assertEquals("Y", btbAppZxyGzInfo.getStatus());
	}
}
