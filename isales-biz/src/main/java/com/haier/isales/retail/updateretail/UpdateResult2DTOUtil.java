/**
* @Company 青鸟软通   
* @Title: UpdateResult2DTOUtil.java 
* @Package com.haier.isales.retail.updateretail 
* @author John.zhao   
* @date 2015-3-13 上午10:00:10 
* @version V1.0   
*/ 
package com.haier.isales.retail.updateretail;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.retail.updatesales.dto.UpdateResultDTO;
import com.haier.isales.ws.zzjyt.client.btbappxlgxupdateimpl.BtbapPxlgxInfo;
import com.haier.isales.ws.zzjyt.client.tmappupdateimpl.TmAPPUpdateInfo;

/** 
 * @ClassName: UpdateResult2DTOUtil 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class UpdateResult2DTOUtil {

	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2015-3-13 上午10:06:28 
	* @param result
	* @return  
	*/ 
	public static UpdateResultDTO cloneUpdateModelResult2DTO(BtbapPxlgxInfo result){
		if(result == null){
			return null;
		}
		UpdateResultDTO dto = ClonePojoUtil.copyClassFromTo(result, UpdateResultDTO.class);
		return dto;
	}
	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2015-3-13 上午10:06:31 
	* @param result
	* @return  
	*/ 
	public static UpdateResultDTO cloneUpdateBarCodeResult2DTO(TmAPPUpdateInfo result){
		if(result == null){
			return null;
		}
		UpdateResultDTO dto = ClonePojoUtil.copyClassFromTo(result, UpdateResultDTO.class);
		return dto;
	}
}
