/**
 * @Company 青鸟软通   
 * @Title: PrototypeAttachmentDAO.java 
 * @Package  com.haier.isales.prototype.dao
 * @author Guo Yuchao   
 * @date 2015-1-13 16:11:48
 * @version V1.0   
 */
package com.haier.isales.prototype.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.prototype.domain.PrototypeAttachmentDomain;
/** 
 * @ClassName: PrototypeAttachmentDAO
 * @Description: PrototypeAttachment 的DAO接口定义类
 *  
 */
public interface PrototypeAttachmentDAO {
	
	/** 
	* @Description: 根据条码查询条码和样机分享图片关联
	* @author Guo Yuchao   
	* @date 2015-1-13 下午4:16:19 
	* @param barcode
	* @return  
	*/ 
	List<PrototypeAttachmentDomain> findByBarcode(@Param("barcode")String barcode);
	
	
	/** 
	* @Description: 根据条件查询样机条码和分享图片的关联 
	* @author Guo Yuchao   
	* @date 2015-1-13 下午4:16:57 
	* @param prototypeAttachmentDomain
	* @return  
	*/ 
	List<PrototypeAttachmentDomain> findByParams(@Param("domain")PrototypeAttachmentDomain prototypeAttachmentDomain);
	
	
	/** 
	* @Description: 保存样机条码和分享图片的关联 
	* @author Guo Yuchao   
	* @date 2015-1-13 下午5:07:52 
	* @param prototypeAttachmentDomain  
	*/ 
	void save(@Param("domain")PrototypeAttachmentDomain prototypeAttachmentDomain);
	
}
