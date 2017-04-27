/**
 * 
 */
package com.haier.isales.salerinfo.personalsalary.service;

import com.haier.isales.salerinfo.personalsalary.dto.PersonalSalarySearchDTO;
import com.haier.isales.ws.zzjyt.client.btbappzxygzimpl.BtbAppZxyGzInfo;

/**
 * @author John.zhao
 *
 */
public interface PersonalSalaryService {
	
	public BtbAppZxyGzInfo searchPersonalSalary(PersonalSalarySearchDTO personalSalarySearchDTO);

}
