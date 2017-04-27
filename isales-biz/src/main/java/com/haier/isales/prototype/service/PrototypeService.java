/**
 * @Company 青鸟软通   
 * @Title: PrototypeService.java 
 * @Package  com.haier.isales.prototype.service
 * @author Guo Yuchao   
 * @date 2014年12月25日  14:05:35
 * @version V1.0   
 */
package com.haier.isales.prototype.service;

import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.products.dto.ProductsImageDTO;
import com.haier.isales.prototype.domain.PrototypeAttachmentDomain;
import com.haier.isales.prototype.domain.PrototypeDomain;
import com.haier.isales.prototype.dto.PrototypeDTO;
import com.haier.isales.prototype.dto.PrototypeListParamDTO;

/** 
 * @ClassName: PrototypeService
 * @Description: Prototype的Service接口定义类
 *  
 */
public interface PrototypeService {

	/** 
	* @Description:直销员移动应用向HMMS系统传递【样机出(上)样】信息
	* @author Guo Yuchao   
	* @date 2014-12-24 下午4:53:23 
	* @return
	* @throws BusinessException  
	*/ 
	String savePrototypePurchase(PrototypeDTO prototypeDTO) throws BusinessException;
	
	
	/** 
	* @Description: 直销员移动应用向HMMS系统传递【样机核销】信息
	* @author Guo Yuchao   
	* @date 2014-12-24 下午5:11:14 
	* @param wsPrototypeDTO
	* @return
	* @throws BusinessException  
	*/ 
	String savePrototypeAuditOut(PrototypeDTO prototypeDTO) throws BusinessException;

	/** 
	* @Description: 查询样机列表，支持样机型号名称模糊查询，实现分页
	* @author John.zhao   
	* @param pageCond 
	* @param prototypeListDTO 
	* @date 2014-12-25 下午6:41:54 
	* @return  
	*/ 
	public PageResult<PrototypeDomain> searchPrototypePagerLikeList(PrototypeListParamDTO prototypeListDTO, PageCond pageCond);

	/** 
	* @Description: 根据id查询样机信息
	* @author Guo Yuchao   
	* @date 2015-1-13 下午5:05:20 
	* @param id
	* @return  
	*/ 
	public PrototypeDomain findById(Long id);
	
	/** 
	* @Description: 根据条件查询样机条码和分享图片的关联 
	* @author Guo Yuchao   
	* @date 2015-1-13 下午5:07:37 
	* @param prototypeAttachmentDomain
	* @return  
	*/ 
	public List<PrototypeAttachmentDomain> findPrototypeAttachmentByParams(PrototypeAttachmentDomain prototypeAttachmentDomain);
	
	
	/** 
	* @Description: 根据样机Id 获取对应的产品百科的图片集合
	* @author Liu Wenjie   
	* @date 2015-3-11 下午4:28:45 
	* @param id
	* @return  
	*/ 
	List<ProductsImageDTO> searchProductsImgList(Long id);
	
	
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
    PageResult<PrototypeDomain> searchPrototypePagerLikeListByDataPeriod(PrototypeListParamDTO prototypeListParamDTO,String startDate,String endDate,
            PageCond pageCond);
	
}
