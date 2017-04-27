/**
 * @Company 青鸟软通   
 * @Title: AttachmentServiceClient.java 
 * @Package com.haier.isales.attachment.service 
 * @author John Zhao   
 * @date 2014-11-14 下午1:20:32 
 * @version V1.0   
 */
package com.haier.isales.retail.personalmodel.service;
import com.haier.isales.retail.personalmodel.dto.PersonalModelQueryDto;

/**
 * @ClassName: PersonalModelSelectClient
 * @Description: 直销员常用型号 查询的接口
 * 
 */
public interface PersonalModelSelectClient {

	/**
	 * 
	* @Title: getPersonalmodelList 
	* @Description: 查询常用型号列表
	* @param queryDto
	* @param currentPage
	* @param pageSize
	* @return  
	* @throws
	 */
	public Object getPersonalmodelList(PersonalModelQueryDto queryDto,Integer currentPage,Integer pageSize);
	

}
