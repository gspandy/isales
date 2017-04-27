/**
* @Company 青鸟软通   
* @Title: ProductsServiceClientImpl.java 
* @Package com.haier.isales.products 
* @author John.zhao   
* @date 2015-1-27 上午10:38:40 
* @version V1.0   
*/ 
package com.haier.isales.products.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;

import com.haier.isales.products.ProductsDomainDTOUtil;
import com.haier.isales.products.dto.ProductLineDTO;
import com.haier.isales.products.dto.ProductsBookDTO;
import com.haier.isales.products.dto.ProductsDetailDTO;
import com.haier.isales.products.dto.ProductsFAQAppDTO;
import com.haier.isales.products.dto.ProductsImageDTO;
import com.haier.isales.products.dto.ProductsInfoAppDTO;
import com.haier.isales.products.dto.ProductsInfoSearchDTO;
import com.haier.isales.products.dto.ProductsParamDTO;
import com.haier.isales.products.productsbookapp.domain.ProductsBookAppDomain;
import com.haier.isales.products.productsbookapp.service.ProductsBookAppService;
import com.haier.isales.products.productsdetailapp.domain.ProductsDetailAppDomain;
import com.haier.isales.products.productsdetailapp.service.ProductsDetailAppService;
import com.haier.isales.products.productsfaqapp.domain.ProductsFAQAppDomain;
import com.haier.isales.products.productsfaqapp.service.ProductsFAQAppService;
import com.haier.isales.products.productsimg.domain.ProductsImgDomain;
import com.haier.isales.products.productsimg.service.ProductsImgAppService;
import com.haier.isales.products.productsinfoapp.domain.ProductLineDomain;
import com.haier.isales.products.productsinfoapp.domain.ProductsInfoAppDomain;
import com.haier.isales.products.productsinfoapp.service.ProductsInfoAppService;
import com.haier.isales.products.productsparamapp.domain.ProductsParamAppDomain;
import com.haier.isales.products.productsparamapp.service.ProductsParamAppService;
import com.haier.isales.products.service.ProductsSelectServiceClient;

/** 
 * @ClassName: ProductsServiceClientImpl 
 * @Description: 产品百科service 
 *  
 */
public class ProductsServiceClientImpl implements ProductsSelectServiceClient {
	
	private ProductsImgAppService productsImgAppService;
	
	private ProductsDetailAppService productsDetailAppService;

	private ProductsParamAppService productsParamAppService;
	
	private ProductsBookAppService productsBookAppService;
	
	private ProductsFAQAppService productsFAQAppService;
	
	private ProductsInfoAppService productsInfoAppService;
	//================================业务方法============================================
	
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-1-30 上午10:06:33 
	* @return 
	* @see com.haier.isales.products.service.ProductsSelectServiceClient#searchProductLineList() 
	*/ 
	@Override
	public Object searchProductLineList(String userCode) {
		List<ProductLineDomain> domainList = productsInfoAppService.searchProductLineList(userCode);
		List<ProductLineDTO> dtoList = new ArrayList<ProductLineDTO>();
		if(domainList == null){
			return null;
		}
		for(ProductLineDomain domain : domainList){
			ProductLineDTO dto = ProductsDomainDTOUtil.cloneProductLineDomain2DTO(domain);
			dtoList.add(dto);
		}
		return dtoList;
	}
	
	/**
	* <p>Description: 查询产品百科列表</p> 
	* @author John.zhao   
	* @date 2015-1-28 下午4:30:13 
	* @param productsInfoSearchDTO
	* @param currentPage
	* @param pageSize
	* @return 
	* @see com.haier.isales.products.service.ProductsSelectServiceClient#getProductsPagerListLike(com.haier.isales.products.dto.ProductsInfoSearchDTO, java.lang.Integer, java.lang.Integer) 
	*/ 
	@Override
	public Object getProductsPagerListLike(ProductsInfoSearchDTO productsInfoSearchDTO, Integer currentPage,
			Integer pageSize) {
		Integer pageNo = currentPage;
		Integer numPerPage = pageSize;
		if(pageNo == null){
			pageNo = 1;
		}
		if(numPerPage == null){
			numPerPage = 10;
		}
		
		PageResult<ProductsInfoAppDomain> pageResult = productsInfoAppService.searchProductsInfoList(productsInfoSearchDTO,
				new PageCond(pageNo, numPerPage));
		if (pageResult.getResultList() == null || pageResult.getResultList().isEmpty()) {
			return new PageResult<ProductsInfoAppDTO>(null, pageResult.getPageCond());
		}
		List<ProductsInfoAppDTO> dtoList = new ArrayList<ProductsInfoAppDTO>();
		for (ProductsInfoAppDomain productsInfoAppDomain : pageResult.getResultList()) {
			if (productsInfoAppDomain != null) {
				ProductsInfoAppDTO productsInfoAppDTO = ProductsDomainDTOUtil.cloneProductsInfoAppDomain2DTO(productsInfoAppDomain);
				dtoList.add(productsInfoAppDTO);
			}
		}
		return new PageResult<ProductsInfoAppDTO>(dtoList, pageResult.getPageCond());
	}
	
	
	/**
	* <p>Description: 查询套图</p> 
	* @author John.zhao   
	* @date 2015-1-27 上午10:39:30 
	* @param metaDataId
	* @return 
	* @see com.haier.isales.products.service.ProductsSelectServiceClient#saerchProductsImages(java.lang.Long) 
	*/ 
	@Override
	public Object searchProductsImages(Long metaDataId) {
		List<ProductsImgDomain> domainList = productsImgAppService.searchProductsImages(metaDataId);
		List<ProductsImageDTO> dtoList = new ArrayList<ProductsImageDTO>();
		if(domainList == null){
			return null;
		}
		for(ProductsImgDomain domain : domainList){
			ProductsImageDTO dto = ProductsDomainDTOUtil.cloneProductsImageDomain2DTO(domain);
			dtoList.add(dto);
		}
		return dtoList;
	}

	/**
	* <p>Description: 查询产品详情</p> 
	* @author John.zhao   
	* @date 2015-1-27 下午2:07:58 
	* @param metaDataId
	* @return 
	* @see com.haier.isales.products.service.ProductsSelectServiceClient#searchProductsDetail(java.lang.Long) 
	*/ 
	@Override
	public Object searchProductsDetail(Long metaDataId) {
		List<ProductsDetailAppDomain> domainList = productsDetailAppService.searchProductsDetail(metaDataId);
		List<ProductsDetailDTO> dtoList = new ArrayList<ProductsDetailDTO>();
		if(domainList == null){
			return null;
		}
		for(ProductsDetailAppDomain domain : domainList){
			ProductsDetailDTO dto = ProductsDomainDTOUtil.cloneProductsDetailAppDomain2DTO(domain);
			dtoList.add(dto);
		}
		return dtoList;
	}
	
	/**
	* <p>Description: 查询规格参数</p> 
	* @author John.zhao   
	* @date 2015-1-27 下午4:10:51 
	* @param metaDataId
	* @return 
	* @see com.haier.isales.products.service.ProductsSelectServiceClient#searchProductsParams(java.lang.Long) 
	*/ 
	@Override
	public Object searchProductsParams(Long metaDataId) {
		List<ProductsParamAppDomain> domainList = productsParamAppService.searchProductsParams(metaDataId);
		List<ProductsParamDTO> dtoList = new ArrayList<ProductsParamDTO>();
		if(domainList == null){
			return null;
		}
		for(ProductsParamAppDomain domain : domainList){
			ProductsParamDTO dto = ProductsDomainDTOUtil.cloneProductsParamAppDomain2DTO(domain);
			dtoList.add(dto);
		}
		return dtoList;
	}

	/**
	* <p>Description: 查询说明书</p> 
	* @author John.zhao   
	* @date 2015-1-27 下午4:10:51 
	* @param metaDataId
	* @return 
	* @see com.haier.isales.products.service.ProductsSelectServiceClient#searchProductsBooks(java.lang.Long) 
	*/ 
	@Override
	public Object searchProductsBooks(Long metaDataId) {
		ProductsBookAppDomain productsBookAppDomain = productsBookAppService.searchProductsBook(metaDataId);
		if(productsBookAppDomain == null){
			return null;
		}
		ProductsBookDTO dto = ProductsDomainDTOUtil.cloneProductsBookAppDomain2DTO(productsBookAppDomain);
		return dto;
	}
	
	/**
	* <p>Description: 查询常见问题</p> 
	* @author John.zhao   
	* @date 2015-1-28 上午10:17:09 
	* @param metaDataId
	* @return 
	* @see com.haier.isales.products.service.ProductsSelectServiceClient#searchProductsFAQs(java.lang.Long) 
	*/ 
	@Override
	public Object searchProductsFAQs(Long metaDataId){
		List<ProductsFAQAppDomain> domainList = productsFAQAppService.searchProductsFAQs(metaDataId);
		List<ProductsFAQAppDTO> dtoList = new ArrayList<ProductsFAQAppDTO>();
		if(domainList == null){
			return null;
		}
		for(ProductsFAQAppDomain domain : domainList){
			ProductsFAQAppDTO dto = ProductsDomainDTOUtil.cloneProductsFAQAppDomain2DTO(domain);
			dtoList.add(dto);
		}
		return dtoList;
	}
	
	
	//================================================================
	/**
	 * @Description: 属性 productsImgAppService 的set方法 
	 * @param productsImgAppService 
	 */
	public void setProductsImgAppService(ProductsImgAppService productsImgAppService) {
		this.productsImgAppService = productsImgAppService;
	}

	/**
	 * @Description: 属性 productsDetailAppService 的set方法 
	 * @param productsDetailAppService 
	 */
	public void setProductsDetailAppService(ProductsDetailAppService productsDetailAppService) {
		this.productsDetailAppService = productsDetailAppService;
	}

	/**
	 * @Description: 属性 productsParamAppService 的set方法 
	 * @param productsParamAppService 
	 */
	public void setProductsParamAppService(ProductsParamAppService productsParamAppService) {
		this.productsParamAppService = productsParamAppService;
	}

	/**
	 * @Description: 属性 productsBookAppService 的set方法 
	 * @param productsBookAppService 
	 */
	public void setProductsBookAppService(ProductsBookAppService productsBookAppService) {
		this.productsBookAppService = productsBookAppService;
	}

	/**
	 * @Description: 属性 productsFAQAppService 的set方法 
	 * @param productsFAQAppService 
	 */
	public void setProductsFAQAppService(ProductsFAQAppService productsFAQAppService) {
		this.productsFAQAppService = productsFAQAppService;
	}


	/**
	 * @Description: 属性 productsInfoAppService 的set方法 
	 * @param productsInfoAppService 
	 */
	public void setProductsInfoAppService(ProductsInfoAppService productsInfoAppService) {
		this.productsInfoAppService = productsInfoAppService;
	}
	
}
