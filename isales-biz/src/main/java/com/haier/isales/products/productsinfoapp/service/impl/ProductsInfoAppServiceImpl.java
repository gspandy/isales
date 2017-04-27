/**
 * @Company 青鸟软通   
 * @Title: ProductsInfoAppService.java 
 * @Package  com.haier.isales.products.productsinfoapp.service.impl
 * @author John.Zhao   
 * @date 2015年01月28日  14:32:51
 * @version V1.0   
 */
package com.haier.isales.products.productsinfoapp.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.StringUtil;
import com.haier.isales.products.dto.ProductsInfoSearchDTO;
import com.haier.isales.products.productsinfoapp.dao.ProductsInfoAppDAO;
import com.haier.isales.products.productsinfoapp.domain.ProductLineDomain;
import com.haier.isales.products.productsinfoapp.domain.ProductsInfoAppDomain;
import com.haier.isales.products.productsinfoapp.service.ProductsInfoAppService;

/** 
 * @ClassName: ProductsInfoAppService
 * @Description: ProductsInfoApp的Service接口定义类
 *  
 */
public class ProductsInfoAppServiceImpl implements ProductsInfoAppService{

	private static final Logger LOG = LoggerFactory.getLogger(ProductsInfoAppServiceImpl.class);
	
	/** 
	* @Fields productsInfoAppDao : ProductsInfoAppDao 工具依赖 
	*/
	private ProductsInfoAppDAO productsInfoAppDao;
	
	
	/*===============业务方法=============*/
	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-1-30 上午9:51:18 
	* @return 
	* @see com.haier.isales.products.productsinfoapp.service.ProductsInfoAppService#searchProductLineList() 
	*/ 
	@Override
	public List<ProductLineDomain> searchProductLineList(String userCode) {
		return productsInfoAppDao.searchProductLineList(userCode);
	}


	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-1-28 下午4:07:04 
	* @param productsInfoSearchDTO
	* @param pageCond
	* @return 
	* @see com.haier.isales.products.productsinfoapp.service.ProductsInfoAppService#searchProductsInfoList(com.haier.isales.products.dto.ProductsInfoSearchDTO, org.bana.common.util.page.PageCond) 
	*/ 
	@Override
	public PageResult<ProductsInfoAppDomain> searchProductsInfoList(ProductsInfoSearchDTO productsInfoSearchDTO,PageCond pageCond) {
		LOG.info("查询产品百科列表,传入参数为："+productsInfoSearchDTO);
		PageCond pageCond2 = PageCondUtil.check(pageCond);
		List<String> productsModelNoNameList = new ArrayList<String>();
		if (productsInfoSearchDTO.getModelNoName() == null || "".equals(productsInfoSearchDTO.getModelNoName().trim())) {
			productsModelNoNameList = null;
		} else {
			productsModelNoNameList = StringUtil.getLikeParamStrList(productsInfoSearchDTO.getModelNoName(), "\\s");
		}
		List<ProductsInfoAppDomain> infoList = productsInfoAppDao.searchProductsInfoList(productsInfoSearchDTO,productsModelNoNameList,pageCond2);
		return new PageResult<ProductsInfoAppDomain>(infoList, pageCond2);
	}
	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性productsInfoAppDao 的set方法 
	 */
	public void setProductsInfoAppDao(ProductsInfoAppDAO productsInfoAppDao){
		this.productsInfoAppDao = productsInfoAppDao;
	}

	

}
