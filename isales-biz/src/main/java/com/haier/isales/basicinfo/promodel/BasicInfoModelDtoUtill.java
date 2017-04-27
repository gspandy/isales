/**
* @Company 青鸟软通   
* @Title: BasicInfoModelDtoUtill.java 
* @Package com.haier.isales.basicInfo.proModel 
* @author Guo Yuchao   
* @date 2014-11-15 下午2:31:02 
* @version V1.0   
*/ 
package com.haier.isales.basicinfo.promodel;

import com.haier.isales.basicinfo.promodel.domain.ProModelDomain;
import com.haier.isales.basicinfo.promodel.dto.ProModelDTO;
import com.haier.isales.common.ClonePojoUtil;

/** 
 * @ClassName: BasicInfoModelDtoUtill 
 * @Description:  
 *  
 */
public class BasicInfoModelDtoUtill {
	

	/* ==================Guo Yuchao clone Domain Dto begin =================== */
	/** 
	* @Description: clone ProModelDTO 2  ProModelDomain
	* @author Guo Yuchao   
	* @date 2014-11-14 下午2:58:46 
	* @param personalShareDTO
	* @return  
	*/ 
	public static ProModelDomain cloneProModelDTO2Domain(ProModelDTO proModelDTO) {
		if (proModelDTO == null) {
			return null;
		}
		ProModelDomain proModelDomain = ClonePojoUtil.copyClassFromTo(proModelDTO,
				ProModelDomain.class);
		return proModelDomain;
	}
	/** 
	* @Description: clone ProModelDomain 2 ProModelDTO  
	* @author Guo Yuchao   
	* @date 2014-11-15 下午2:42:46 
	* @param proModelDomain
	* @return  
	*/ 
	public static ProModelDTO cloneProModelDomain2Dto(ProModelDomain proModelDomain) {
		if (proModelDomain == null) {
			return null;
		}
		ProModelDTO proModelDTO = ClonePojoUtil.copyClassFromTo(proModelDomain,
				ProModelDTO.class);
		return proModelDTO;
	}
	/* ==================Guo Yuchao clone Domain Dto end =================== */
}
