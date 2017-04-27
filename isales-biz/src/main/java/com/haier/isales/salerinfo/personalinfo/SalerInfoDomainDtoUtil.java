/**
 * @Company 青鸟软通   
 * @Title: DomainEntityUtil.java 
 * @Package com.jbinfo.common.util 
 * @author Liu Wenjie   
 * @date 2013-11-7 下午5:31:04 
 * @version V1.0   
 */
package com.haier.isales.salerinfo.personalinfo;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.salerinfo.addressbook.dto.AddressBookDTO;
import com.haier.isales.salerinfo.personalinfo.domain.AddrBookDomain;
import com.haier.isales.salerinfo.personalinfo.domain.PersonalEmpInfoDomain;
import com.haier.isales.salerinfo.personalinfo.domain.PersonalInfoDomain;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalEmpInfoDTO;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalFullInfoDTO;
import com.haier.isales.salerinfo.personalinfo.dto.PersonalInfoDTO;
import com.haier.isales.salerinfo.personalshare.domain.PersonalShareDomain;
import com.haier.isales.salerinfo.personalshare.dto.PersonalShareDTO;

/**
 * @ClassName: SalerInfoDomainDtoUtil
 * @Description: 直销员个人信息模块中 实体和对象相互转化的工具类
 * 
 */
public class SalerInfoDomainDtoUtil {
	public enum SearchAddressBookParamEnum{
		
		  查询所有("999999","全部");
		  
		private String key;
		private String value;
		
		/** 
		* <p>Description: </p> 
		* @author Guo Yuchao   
		* @date 2014-11-25 上午10:51:54  
		*/ 
		private SearchAddressBookParamEnum(String key,String value) {
			this.key = key;
			this.value = value;
		}

		/**
		 * @Description: 属性 value 的get方法 
		 * @return value
		 */
		public String getValue() {
			return value;
		}

		/**
		 * @Description: 属性 key 的get方法 
		 * @return key
		 */
		public String getKey() {
			return key;
		}

	}
	public static PersonalInfoDTO clonePersonalDoamin2DTO(PersonalInfoDomain domain) {
		//将直销员的domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		PersonalInfoDTO dto = ClonePojoUtil.copyClassFromTo(domain,	PersonalInfoDTO.class);
		return dto;
	}

	/* ==================Guo Yuchao clone Domain Dto begin =================== */
	/** 
	* @Description: clone PersonalShareDTO 2  PersonalShareDomain
	* @author Guo Yuchao   
	* @date 2014-11-14 下午2:58:46 
	* @param personalShareDTO
	* @return  
	*/ 
	public static PersonalShareDomain clonePersonalShareDTO2Domain(PersonalShareDTO personalShareDTO) {
		if (personalShareDTO == null) {
			return null;
		}
		PersonalShareDomain personalShareDomain = ClonePojoUtil.copyClassFromTo(personalShareDTO,
				PersonalShareDomain.class);
		return personalShareDomain;
	}
	
	/** 
	* @Description: clone   PersonalShareDomain 2 PersonalShareDTO
	* @author Guo Yuchao   
	* @date 2014-11-14 下午3:01:26 
	* @param personalShareDomain
	* @return  
	*/ 
	public static PersonalShareDTO clonePersonalShareDomain2DTO(PersonalShareDomain personalShareDomain) {
		if (personalShareDomain == null) {
			return null;
		}
		PersonalShareDTO personalShareDTO = ClonePojoUtil.copyClassFromTo(personalShareDomain,
				PersonalShareDTO.class);
		return personalShareDTO;
	}

	/* ==================Guo Yuchao clone Domain Dto end =================== */
	
	/* ==================Cao Rui clone Domain Dto begin =================== */
	/** 
	* @Description: clone PersonalInfoForShowDTO 2  PersonalInfoFromViewDomain
	* @author Cao Rui 
	* @param dto
	* @return  
	*/ 
	public static PersonalEmpInfoDomain clonePersonalInfoForShowDTO2Domain(PersonalEmpInfoDTO dto) {
		if (dto == null) {
			return null;
		}
		PersonalEmpInfoDomain domain = ClonePojoUtil.copyClassFromTo(dto,
				PersonalEmpInfoDomain.class);
		return domain;
	}
	
	/** 
	* @Description: clone   PersonalInfoFromViewDomain 2 PersonalInfoForShowDTO
	* @author Cao Rui   
	* @param domain
	* @return  
	*/ 
	public static PersonalFullInfoDTO clonePersonalInfoFromViewDomain2DTO(PersonalEmpInfoDomain domain) {
		if (domain == null) {
			return null;
		}
		PersonalFullInfoDTO dto = ClonePojoUtil.copyClassFromTo(domain,
				PersonalFullInfoDTO.class);
		return dto;
	}

	/* ==================Cao Rui clone Domain Dto end =================== */
	
	/** 
	* @Description: clone AddrBookDomain 2  AddressBookDTO
	* @author Huang nana   
	* @date 2015-1-23 上午9:30:42 
	* @param domain
	* @return  
	*/ 
	public static AddressBookDTO cloneAddressBookFromViewDomain2DTO(AddrBookDomain domain) {
		if (domain == null) {
			return null;
		}
		AddressBookDTO dto = ClonePojoUtil.copyClassFromTo(domain,
				AddressBookDTO.class);
		return dto;
	}
	
}