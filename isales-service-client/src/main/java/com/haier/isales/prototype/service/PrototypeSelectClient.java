/**
* @Company 青鸟软通   
* @Title: PrototypeListDTO.java 
* @Package com.haier.isales.prototype.dto 
* @author John.zhao   
* @date 2014-12-25 下午4:35:45 
* @version V1.0   
*/ 
package com.haier.isales.prototype.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.prototype.dto.PrototypeListParamDTO;

/** 
 * @ClassName: PrototypeSelectClient 
 * @Description: 样机列表相关
 *  
 */
public interface PrototypeSelectClient {
	
	/** 
	* @Description: 模糊查询产品型号名称，分页
	* @author John.zhao   
	* @date 2014-12-25 下午5:19:50 
	* @param prototypeListDTO
	* @param currentPage
	* @param pageSize
	* @return  
	*/ 
	@Export(paramNames={"prototypeListDTO","currentPage","pageSize"})
	public Object getPrototypePagerListLike(PrototypeListParamDTO prototypeListDTO ,Integer currentPage,Integer pageSize);

	
	/** 
	* @Description: 根据样机Id 获取对应的产品百科图片集合
	* @author Liu Wenjie   
	* @date 2015-3-11 下午4:26:31 
	* @param id
	* @return  
	*/ 
	public Object searchProductsImgList(Long id);
	
	
	/**
     * 
     * @Description: 根据时间段进行样机列表查询
     * @author wangp
     * @date 2016-08-11 
     * @param client
     * @param prototypeListParamDTO
     * @param startDate
     * @param endDate
     * @param currentPage
     * @param pageSize
     * @param session
     * @return
     */
    @Export(paramNames={"prototypeListParamDTO","startDate","endDate","currentPage","pageSize"})
    public Object getPrototypePagerListByDataPeriod(PrototypeListParamDTO prototypeListParamDTO,String startDate,String endDate,Integer currentPage,
            Integer pageSize);
}
