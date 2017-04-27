/**
* @Company 青鸟软通   
* @Title: SearchRetailWs2DTOUtil.java 
* @Package com.haier.isales.retail.searchretail 
* @author John.zhao   
* @date 2015-3-12 上午10:30:17 
* @version V1.0   
*/ 
package com.haier.isales.retail.searchretail;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.retail.searchsales.dto.SearchRetailBarCodeResultDTO;
import com.haier.isales.retail.searchsales.dto.SearchRetailMembersDiffDTO;
import com.haier.isales.retail.searchsales.dto.SearchRetailModelResultDTO;
import com.haier.isales.ws.zzjyt.client.btbappxlcxselectimpl.BtbapPxlcxInfo;
import com.haier.isales.ws.zzjyt.client.tmappselectimpl.TmAPPSelectInfo;

/** 
 * @ClassName: SearchRetailWs2DTOUtil 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class SearchRetailWs2DTOUtil {

	/** 
	* @Description: 联网查询，返回的接口数据复制给dto
	* @author John.zhao   
	* @date 2015-3-12 上午10:34:56 
	* @param wsInfo
	* @return  
	*/ 
	public static SearchRetailModelResultDTO cloneBtbapPxlcxInfo2ModelDTO(BtbapPxlcxInfo wsInfo){
		if (wsInfo == null) {
			return null;
		}
		SearchRetailModelResultDTO dto = ClonePojoUtil.copyClassFromTo(wsInfo,
				SearchRetailModelResultDTO.class);
		return dto;
		
	}
	
	/** 
	* @Description: 条码查询，返回的接口数据复制给dto
	* @author John.zhao   
	* @date 2015-3-12 上午10:34:59 
	* @param wsInfo
	* @return  
	*/ 
	public static SearchRetailBarCodeResultDTO cloneTmAPPSelectInfo2ModelDTO(TmAPPSelectInfo wsInfo){
		if (wsInfo == null) {
			return null;
		}
		SearchRetailBarCodeResultDTO dto = ClonePojoUtil.copyClassFromTo(wsInfo,
				SearchRetailBarCodeResultDTO.class);
		return dto;
	}

	/** 
	* @Description: 联网查询，返回的接口数据复制给会员差异明细的dto
	* @author Cao Rui  
	* @date 2015-7-22 下午10:34:56 
	* @param wsInfo
	* @return  
	*/ 
	public static SearchRetailMembersDiffDTO cloneBtbapPxlcxInfo2MembersDTO(BtbapPxlcxInfo wsInfo){
		if (wsInfo == null) {
			return null;
		}
		SearchRetailMembersDiffDTO dto = ClonePojoUtil.copyClassFromTo(wsInfo,
				SearchRetailMembersDiffDTO.class);
		return dto;
		
	}
	
	/** 
	* @Description: 条码查询，返回的接口数据复制给会员差异明细的dto
	* @author Cao Rui  
	* @date 2015-7-22 下午10:34:56 
	* @param wsInfo
	* @return  
	*/ 
	public static SearchRetailMembersDiffDTO cloneTmAPPSelectInfo2MembersDTO(TmAPPSelectInfo wsInfo){
		if (wsInfo == null) {
			return null;
		}
		SearchRetailMembersDiffDTO dto = ClonePojoUtil.copyClassFromTo(wsInfo,
				SearchRetailMembersDiffDTO.class);
		return dto;
	}
}
