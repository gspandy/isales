/**
 * @Company 青鸟软通   
 * @Title: PrototypeSelectClientImpl.java 
 * @Package com.haier.isales.prototype.service.impl 
 * @author John.zhao   
 * @date 2014-12-25 下午5:24:02 
 * @version V1.0   
 */
package com.haier.isales.prototype.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.products.dto.ProductsImageDTO;
import com.haier.isales.prototype.PrototypeDomainDTOUtil;
import com.haier.isales.prototype.domain.PrototypeDomain;
import com.haier.isales.prototype.dto.PrototypeDTO;
import com.haier.isales.prototype.dto.PrototypeListParamDTO;
import com.haier.isales.prototype.service.PrototypeSelectClient;
import com.haier.isales.prototype.service.PrototypeService;

/**
 * @ClassName: PrototypeSelectClientImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class PrototypeSelectClientImpl implements PrototypeSelectClient {

	private PrototypeService prototypeService;

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2014-12-25 下午5:24:02
	 * @param prototypeListDTO
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @see com.haier.isales.prototype.service.PrototypeSelectClient#getPrototypePagerListLike(com.haier.isales.prototype.dto.PrototypeListParamDTO,
	 *      java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public Object getPrototypePagerListLike(PrototypeListParamDTO prototypeListDTO, Integer currentPage, Integer pageSize) {
		Integer pageNo = currentPage;
		Integer numPerPage = pageSize;
		if(pageNo == null){
			pageNo = 1;
		}
		if(numPerPage == null){
			numPerPage = 10;
		}
		
		PageResult<PrototypeDomain> pageResult = prototypeService.searchPrototypePagerLikeList(prototypeListDTO,
				new PageCond(pageNo, numPerPage));
		if (pageResult.getResultList() == null || pageResult.getResultList().isEmpty()) {
			return new PageResult<PrototypeDTO>(null, pageResult.getPageCond());
		}
		List<PrototypeDTO> dtoList = new ArrayList<PrototypeDTO>();
		for (PrototypeDomain prototypeDomain : pageResult.getResultList()) {
			if (prototypeDomain != null) {
				PrototypeDTO prototypeDTO = PrototypeDomainDTOUtil.clonePrototypeDomain2DTO(prototypeDomain);
				dtoList.add(prototypeDTO);
			}
		}
		return new PageResult<PrototypeDTO>(dtoList, pageResult.getPageCond());
	}
	
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
    @Override
    public Object getPrototypePagerListByDataPeriod(PrototypeListParamDTO prototypeListParamDTO, String startDate, String endDate, Integer currentPage, Integer pageSize) {
        Integer pageNo = currentPage;
        Integer numPerPage = pageSize;
        if(pageNo == null){
            pageNo = 1;
        }
        if(numPerPage == null){
            numPerPage = 10;
        }
        PageResult<PrototypeDomain> pageResult = prototypeService.searchPrototypePagerLikeListByDataPeriod(prototypeListParamDTO,startDate,endDate,
                new PageCond(pageNo, numPerPage));
        if (pageResult.getResultList() == null || pageResult.getResultList().isEmpty()) {
            return new PageResult<PrototypeDTO>(null, pageResult.getPageCond());
        }
        List<PrototypeDTO> dtoList = new ArrayList<PrototypeDTO>();
        for (PrototypeDomain prototypeDomain : pageResult.getResultList()) {
            if (prototypeDomain != null) {
                PrototypeDTO prototypeDTO = PrototypeDomainDTOUtil.clonePrototypeDomain2DTO(prototypeDomain);
                dtoList.add(prototypeDTO);
            }
        }
        return new PageResult<PrototypeDTO>(dtoList, pageResult.getPageCond());
    }
	
	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2015-3-11 下午4:27:13 
	* @param id
	* @return 
	* @see com.haier.isales.prototype.service.PrototypeSelectClient#searchProductsImgList(java.lang.Long) 
	*/ 
	@Override
	public List<ProductsImageDTO> searchProductsImgList(Long id) {
		 List<ProductsImageDTO> imgDtoList = prototypeService.searchProductsImgList(id);
		return imgDtoList;
	}

	/**
	 * @Description: 属性 prototypeService 的set方法
	 * @param prototypeService
	 */
	public void setPrototypeService(PrototypeService prototypeService) {
		this.prototypeService = prototypeService;
	}

   

}
