/**
 * @Company 青鸟软通   
 * @Title: ProductsClassifyParamsService.java 
 * @Package  com.haier.isales.products.productsclassifyparams.service.impl
 * @author John.Zhao   
 * @date 2015年01月22日  09:42:22
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsclassifyparams.service.impl;


import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.bana.common.util.exception.ThrowableUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.products.hereinterface.HaierHereProductsInterface;
import com.haier.isales.products.heretemp.productsclassify.dao.ProductsClassifyDAO;
import com.haier.isales.products.heretemp.productsclassify.domain.ProductsClassifyDomain;
import com.haier.isales.products.heretemp.productsclassifyparams.dao.ProductsClassifyParamsDAO;
import com.haier.isales.products.heretemp.productsclassifyparams.domain.ProductsClassifyParamsDomain;
import com.haier.isales.products.heretemp.productsclassifyparams.service.ProductsClassifyParamsService;

/** 
 * @ClassName: ProductsClassifyParamsService
 * @Description: ProductsClassifyParams的Service接口定义类
 *  
 */
public class ProductsClassifyParamsServiceImpl implements ProductsClassifyParamsService{

	private static final Logger LOG = LoggerFactory.getLogger(ProductsClassifyParamsServiceImpl.class);
	
	/** 
	* @Fields productsClassifyParamsDao : ProductsClassifyParamsDao 工具依赖 
	*/
	private ProductsClassifyParamsDAO productsClassifyParamsDao;
	
	/** 
	* @Fields productsClassifyDao : 视图表对应的dao
	*/ 
	private ProductsClassifyDAO productsClassifyDao;
	/*===============业务方法=============*/
	/**
	* <p>Description: 保存规格参数的字段-中文解释</p> 
	* @author John.zhao   
	* @date 2015-1-22 上午9:43:23  
	* @see com.haier.isales.products.productsclassifyparams.service.ProductsClassifyParamsService#saveProductsClassifyParams() 
	*/ 
	@Override
	public void saveProductsClassifyParams() {
		//先删除数据
		productsClassifyParamsDao.deleteAll();
		//调用查询视图，查到所有的视图，再循环调用接口，拿到返回的数据
		List<ProductsClassifyDomain> allProductInfoList = productsClassifyDao.getAllProductInfo();
		for (ProductsClassifyDomain domain : allProductInfoList) {
			String viewProperties = "";
			List<ProductsClassifyParamsDomain> list = new ArrayList<ProductsClassifyParamsDomain>();
			try {
				viewProperties = HaierHereProductsInterface.getAllViewProperties(domain.getViewname(), "规格参数");
				if ("".equals(viewProperties)) {
					LOG.info(domain.getViewname()+"该视图无参数!");
				} else {
					JSONArray jsonArray = JSONArray.fromObject(viewProperties);
					int proNums = jsonArray.size();
					for (int j = (proNums - 1); j > -1; j--) {
						ProductsClassifyParamsDomain productsClassifyParamsDomain = new ProductsClassifyParamsDomain();
						JSONObject jsonobject = jsonArray.getJSONObject(j);
						productsClassifyParamsDomain.setViewname(domain.getViewname());
						productsClassifyParamsDomain.setParamsCode(jsonobject.getString("物理名称"));
						productsClassifyParamsDomain.setParamsName(jsonobject.getString("中文名称"));
						productsClassifyParamsDomain.setParamsEnum(jsonobject.getString("枚举值"));
						LOG.info(jsonobject.getString("枚举值"));
						list.add(productsClassifyParamsDomain);
					}
					productsClassifyParamsDao.saveAllProductsClassifyParams(list);
				}
				
			} catch (Exception e) {
				throw new BusinessException(BusinessExceptionCode.ws_result_error, ThrowableUtil.getStackTrace(e));
			}

		}
		
	}


	/**
	* <p>Description: </p> 
	* @author John.zhao   
	* @date 2015-1-22 上午9:43:23 
	* @param viewName
	* @param fieldGroups 
	* @see com.haier.isales.products.productsclassifyparams.service.ProductsClassifyParamsService#getSingleData(java.lang.String, java.lang.String) 
	*/ 
	@Override
	public void getSingleData(String viewName, String fieldGroups) {
		
	}
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性productsClassifyParamsDao 的set方法 
	 */
	public void setProductsClassifyParamsDao(ProductsClassifyParamsDAO productsClassifyParamsDao){
		this.productsClassifyParamsDao = productsClassifyParamsDao;
	}
	/**
	 * @Description: 属性 productsClassifyDao 的set方法
	 * @param productsClassifyDao
	 */
	public void setProductsClassifyDao(ProductsClassifyDAO productsClassifyDao) {
		this.productsClassifyDao = productsClassifyDao;
	}

	
}
