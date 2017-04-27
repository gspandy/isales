/**
 * @Company 青鸟软通   
 * @Title: DomainEntityUtil.java 
 * @Package com.jbinfo.common.util 
 * @author Liu Wenjie   
 * @date 2013-11-7 下午5:31:04 
 * @version V1.0   
 */
package com.haier.isales.customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.common.StringUtil;
import com.haier.isales.common.exception.SystemException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.customer.domain.PotentialCustomerDomain;
import com.haier.isales.customer.dto.PotentialCustomerDTO;
import com.haier.isales.customer.dto.PurchasedCustomerDTO;
import com.haier.isales.retail.reportsales.domain.ReportsalesDomain;


/**
 * @ClassName: CustomerDomainDtoUtil
 * @Description: customer模块中 实体和对象相互转化的工具类
 * 
 */
public class CustomerDomainDtoUtil {

	public static PotentialCustomerDTO clonePotentialCustomerDomain2DTO(PotentialCustomerDomain domain) {
		//将潜客的domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		PotentialCustomerDTO dto = ClonePojoUtil.copyClassFromTo(domain,
				PotentialCustomerDTO.class);
		//额外处理domain和dto中不同的时间，domain中为Date类型，dto中为string类型，格式为YYYY-MM-DD
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
		Date expectedBuyDate = domain.getExpectedBuyDate();
		if(null != expectedBuyDate){
			String expectedBuyDateShow = sdf.format(expectedBuyDate);
			dto.setExpectedBuyDateShow(expectedBuyDateShow);
		}
		Date remindTime = domain.getRemindTime();
		if(null != remindTime){
			String remindTimeShow = sdf.format(remindTime);
			dto.setRemindTimeShow(remindTimeShow);
		}

		return dto;
	}
	public static PotentialCustomerDomain clonePotentialCustomerDTO2Domain(PotentialCustomerDTO dto) {
		//将潜客的dto信息转化为domain信息
		if (dto == null) {
			return null;
		}
		PotentialCustomerDomain domain = ClonePojoUtil.copyClassFromTo(dto,
				PotentialCustomerDomain.class);
		//额外处理domain和dto中不同的时间，domain中为Date类型，dto中为string类型，格式为YYYY-MM-DD
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//

		try {
			String expectedBuyDateShow = dto.getExpectedBuyDateShow();
			if (!StringUtil.isEmpty(expectedBuyDateShow)) {
				Date expectedBuyDate = sdf.parse(expectedBuyDateShow);
				domain.setExpectedBuyDate(expectedBuyDate);

				String remindTimeShow = dto.getRemindTimeShow();
				if (!StringUtil.isEmpty(remindTimeShow)) {
					Date remindTime = sdf.parse(remindTimeShow);
					domain.setRemindTime(remindTime);
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw new SystemException(BusinessExceptionCode.parse_format_error,
					"时间格式错误");
		}
		return domain;
	}
	
	
	public static PurchasedCustomerDTO clonePurchasedCustomerDomain2DTO(ReportsalesDomain domain) {
		//将顾客的domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		PurchasedCustomerDTO dto = new PurchasedCustomerDTO();

		dto.setId(domain.getId());
		dto.setUserCode(domain.getYgid());
		dto.setCustomerName(domain.getYhname());
		dto.setCustomerMobile(domain.getYhphone());
		dto.setCustomerAdd(domain.getShaddress());
		dto.setProductCode(domain.getProduct());
		dto.setProductName(domain.getProducttype());
		dto.setBarCode(domain.getBarcode());
		dto.setProductCount(domain.getCounts());
		dto.setNewPrice(domain.getNewprice());
		dto.setBuyTime(domain.getGjtime());
		dto.setIsProto(domain.getIsyj());
		dto.setReportType(domain.getReportType());
		
		return dto;
	}
	public static ReportsalesDomain clonePurchasedCustomerDTO2Domain(PurchasedCustomerDTO dto) {
		//将顾客的dto信息转化为domain信息
		if (dto == null) {
			return null;
		}
		ReportsalesDomain domain = new ReportsalesDomain();
		
		domain.setId(dto.getId());
		domain.setYgid(dto.getUserCode());
		domain.setYhname(dto.getCustomerName());
		domain.setYhphone(dto.getCustomerMobile());
		domain.setShaddress(dto.getCustomerAdd());
		domain.setProduct(dto.getProductCode());
		domain.setProducttype(dto.getProductName());
		domain.setBarcode(dto.getBarCode());
		domain.setCounts(dto.getProductCount());
		domain.setNewprice(dto.getNewPrice());
		domain.setGjtime(dto.getBuyTime());
		domain.setIsyj(dto.getIsProto());
		domain.setReportType(dto.getReportType());
		
		return domain;
	}

}