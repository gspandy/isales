/**
* @Company 青鸟软通   
* @Title: BtBxlcxInfoToSearchDTOUtil.java 
* @Package com.haier.isales.retail.reportsales 
* @author John Zhao   
* @date 2014-11-17 下午3:21:41 
* @version V1.0   
*/ 
package com.haier.isales.retail.reportsales;
import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.retail.searchsales.dto.SearchModelSalesDTO;
import com.haier.isales.ws.zzjyt.reportsales.client.btbxlcxselectimpl.BtBxlcxInfo;

/** 
 * @ClassName: BtBxlcxInfoToSearchDTOUtil 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class BtBxlcxInfoToSearchDTOUtil {
	
	public static SearchModelSalesDTO cloneBtBxlcxInfo2DTO(BtBxlcxInfo btbxlcxInfo) {
		//将潜客的domain信息转化为dto信息
		if (btbxlcxInfo == null) {
			return null;
		}
		SearchModelSalesDTO dto = ClonePojoUtil.copyClassFromTo(btbxlcxInfo,
				SearchModelSalesDTO.class);
		return dto;
	}

}
