/**
 * @Company 青鸟软通   
 * @Title: PersonalSalaryClientImplTest.java 
 * @Package com.haier.isales.salerinfo.personalsalary 
 * @author John.zhao   
 * @date 2015-2-26 下午12:34:49 
 * @version V1.0   
 */
package com.haier.isales.salerinfo.personalsalary;

import java.util.Calendar;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.common.DubboResult;
import com.haier.isales.salerinfo.personalsalary.dto.PersonalSalaryDTO;
import com.haier.isales.salerinfo.personalsalary.dto.PersonalSalarySearchDTO;
import com.haier.isales.salerinfo.personalsalary.service.PersonalSalaryClient;
import com.haier.isales.test.BaseIsalesClientTestCase;

/**
 * @ClassName: PersonalSalaryClientImplTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
@ContextConfiguration(locations = {
		"classpath*:/spring/salerinfo/spring-personalSalary.xml",
		"classpath*:/spring_ws/zzjyt/spring-BtbAppZxyGzImpl.xml",
		"classpath*:/spring_service/salerinfo/spring-personalSalary-provider.xml"
})
public class PersonalSalaryClientImplTest extends BaseIsalesClientTestCase {
	@Resource
	private PersonalSalaryClient personalSalaryClient;
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
		DubboResult dubboresult = (DubboResult) personalSalaryClient.searchPersonalSalary(personalSalarySearchDTO);
		PersonalSalaryDTO personalSalaryDTO = dubboresult.getResultBean();
		Assert.assertEquals("Y", personalSalaryDTO.getStatus());
	}
	
}
