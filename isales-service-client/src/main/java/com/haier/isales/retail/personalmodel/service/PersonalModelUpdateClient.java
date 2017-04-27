/**
 * @Company 青鸟软通   
 * @Title: AttachmentServiceClient.java 
 * @Package com.haier.isales.attachment.service 
 * @author John Zhao   
 * @date 2014-11-14 下午1:20:32 
 * @version V1.0   
 */
package com.haier.isales.retail.personalmodel.service;
import com.haier.isales.retail.personalmodel.dto.PersonalModelAddDto;
import com.haier.isales.retail.personalmodel.dto.PersonalModelQueryDto;

/**
 * @ClassName: PersonalModelUpdateClient
 * @Description: 直销员常用型号 维护的接口
 * 
 */
public interface PersonalModelUpdateClient {
	
	/**
	 * 
	* @Title: savePersonalModel 
	* @Description: 直销员添加常用型号
	* @param addDto
	* @return  
	* @throws
	 */
	public Object savePersonalModel(PersonalModelAddDto addDto);
	/**
	 * 
	* @Title: deletePersonalModel 
	* @Description:  直销员删除常用型号
	* @param deleteDto
	* @return  
	* @throws
	 */
	public Object deletePersonalModel(PersonalModelQueryDto deleteDto);


}
