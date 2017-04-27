/**
 * @Company 青鸟软通   
 * @Title: SearchRetailService.java 
 * @Package  com.haier.isales.retail.searchretail.service
 * @author John.zhao   
 * @date 2015年03月09日  09:42:35
 * @version V1.0   
 */
package com.haier.isales.retail.searchretail.service;

import java.util.List;

import com.haier.isales.retail.searchsales.dto.SearchRetailDTO;
import com.haier.isales.retail.searchsales.dto.SearchRetailMembersDiffDTO;
import com.haier.isales.ws.zzjyt.client.btbappxlcxselectimpl.BtbapPxlcxInfo;
import com.haier.isales.ws.zzjyt.client.tmappselectimpl.TmAPPSelectInfo;

/** 
 * @ClassName: SearchRetailService
 * @Description: SearchRetail的Service接口定义类
 *  
 */
public interface SearchRetailService {

	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2015-3-9 上午10:19:55 
	* @param searchRetailDTO
	* @return  
	*/ 
	List<BtbapPxlcxInfo> searchRetailModel(SearchRetailDTO searchRetailDTO);

	/** 
	* @Description: TODO (这里用一句话描述这个类的作用)
	* @author John.zhao   
	* @date 2015-3-9 上午10:31:12 
	* @param searchRetailDTO
	* @return  
	*/ 
	List<TmAPPSelectInfo> searchRetailBarCode(SearchRetailDTO searchRetailDTO);
	/**
	* <p>Description: 查询差异会员明细</p> 
	* @author Cao Rui  
	* @date 2015-7-22 下午10:34:56 
	* @param searchRetailDTO
	* @return 
	* @see com.haier.isales.retail.searchretail.service.SearchRetailService#searchRetailMembersDiff(com.haier.isales.retail.searchsales.dto.SearchRetailDTO) 
	*/ 
	public List<SearchRetailMembersDiffDTO> searchRetailMembersDiff(SearchRetailDTO searchRetailDTO);

}
