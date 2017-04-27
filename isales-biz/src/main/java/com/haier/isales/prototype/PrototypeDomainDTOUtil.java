/**
* @Company 青鸟软通   
* @Title: PrototypeDomainDTOUtil.java 
* @Package com.haier.isales.prototype 
* @author John.zhao   
* @date 2014-12-25 下午6:33:41 
* @version V1.0   
*/ 
package com.haier.isales.prototype;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.bana.common.util.basic.StringUtils;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.common.IsalesDateUtil;
import com.haier.isales.prototype.domain.PrototypeDomain;
import com.haier.isales.prototype.dto.PrototypeDTO;

/** 
 * @ClassName: PrototypeDomainDTOUtil 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class PrototypeDomainDTOUtil {
	
	/** 
	* @Description: dto 封装domain
	* @author Guo Yuchao   
	* @date 2014-12-29 下午12:48:16 
	* @param prototypeDTO
	* @return  
	*/ 
	public static PrototypeDomain clonePrototypeDTO2Domain(PrototypeDTO prototypeDTO) {
		if (prototypeDTO == null) {
			return null;
		}
		PrototypeDomain prototypeDomain = ClonePojoUtil.copyClassFromTo(prototypeDTO,
				PrototypeDomain.class);
		//额外处理domain和dto中不同的时间，domain中为Date类型，dto中为string类型，格式为YYYY-MM-DD
		if(!StringUtils.isEmpty(prototypeDTO.getSampleOutDate())){
			Date outDate = IsalesDateUtil.formateToDate(prototypeDTO.getSampleOutDate(), "yyyy-MM-dd");
			prototypeDomain.setOutDate(outDate);
		}
		prototypeDomain.setRemark(prototypeDTO.getRemark());
		return prototypeDomain;
	}
	public static PrototypeDTO clonePrototypeDomain2DTO(PrototypeDomain domain) {
		//将样机的domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		PrototypeDTO dto = ClonePojoUtil.copyClassFromTo(domain,
				PrototypeDTO.class);
		//额外处理domain和dto中不同的时间，domain中为Date类型，dto中为string类型，格式为YYYY-MM-DD
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
		Date prototypeOutDate = domain.getOutDate();
		if(null != prototypeOutDate){
			String prototypeOutDateShow = sdf.format(prototypeOutDate);
			dto.setSampleOutDate(prototypeOutDateShow);
		}
		return dto;
	}

}
