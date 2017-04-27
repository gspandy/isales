/**
 * @Company 青鸟软通   
 * @Title: ProductsParamsService.java 
 * @Package  com.haier.isales.products.productsparams.service.impl
 * @author John.Zhao   
 * @date 2015年01月20日  17:06:13
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsparams.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.haier.isales.products.heretemp.productsparams.dao.ProductsParamsDAO;
import com.haier.isales.products.heretemp.productsparams.domain.ProductsParamsDomain;
import com.haier.isales.products.heretemp.productsparams.service.ProductsParamsService;

/**
 * @ClassName: ProductsParamsService
 * @Description: ProductsParams的Service接口定义类
 * 
 */
public class ProductsParamsServiceImpl implements ProductsParamsService {

	private static final Logger LOG = LoggerFactory.getLogger(ProductsParamsServiceImpl.class);
	/**
	 * @Fields productsParamsDao : ProductsParamsDao 工具依赖
	 */
	private ProductsParamsDAO productsParamsDao;

	private ProductsClassifyDAO productsClassifyDao;

	private ProductsClassifyParamsDAO productsClassifyParamsDao;

	/* ===============业务方法============= */
	/**
	 * <p>
	 * Description: 保存规格参数的数据
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2015-1-21 上午9:21:05
	 * @see com.haier.isales.products.productsparams.service.ProductsParamsService#saveProductsParams()
	 */
	@Override
	public void saveProductsParams() {
		//先删除数据
		productsParamsDao.deleteAllProductParamsValue();
		//查询视图
		List<ProductsClassifyDomain> allProductInfoList = productsClassifyDao.getAllProductInfo();
		for (ProductsClassifyDomain domain : allProductInfoList) {
			String viewProperties = "";
			StringBuffer viewPropertiesBuffer = new StringBuffer("");
			// 字段对应的json
			// ViewProperties = HaierHereProductsInterface.getAllViewProperties(domain.getViewname(),"规格参数");
			//根据视图名查询字段
			List<ProductsClassifyParamsDomain> findParemsCodeByViewName = productsClassifyParamsDao
					.findParemsCodeByViewName(domain.getViewname());
			//map封装需要替换的枚举字段
			Map<String,String> enmValueMap=new HashMap<String, String>();
			for (ProductsClassifyParamsDomain productsClassifyParamsDomain : findParemsCodeByViewName) {
				//向map中添加需要替换的枚举值
				 if(!"".equals(productsClassifyParamsDomain.getParamsEnum())&&productsClassifyParamsDomain.getParamsEnum().indexOf("`")>-1){
                     enmValueMap.put(productsClassifyParamsDomain.getViewname()+"-"+productsClassifyParamsDomain.getParamsCode().toLowerCase(),productsClassifyParamsDomain.getParamsEnum());
                  }
				viewPropertiesBuffer.append(productsClassifyParamsDomain.getParamsCode()).append(",");
			}
			if(viewPropertiesBuffer.length()<1){
				viewProperties="";
			}else{
				viewProperties = viewPropertiesBuffer.toString().substring(0,viewPropertiesBuffer.length()-1);
			}
			if ("".equals(viewProperties)) {
				LOG.info(domain.getViewname() + "该视图无参数!");
			} else {
				// 通过拼接起来的字段和视图名，调用接口取数据
				String allViewData = HaierHereProductsInterface.getAllViewData(viewProperties, domain.getViewname());
				if ("".equals(allViewData)) {
					LOG.info(domain.getViewname() + "对应的规格参数字段" + viewProperties + "无数据!");
				} else {
					try {
						JSONObject productInfoObj = JSONObject.fromObject(allViewData);
						if (!"200-请求服务成功".equals(productInfoObj.getString("resultMsg"))) {
							LOG.info("请求服务失败，" + productInfoObj.getString("resultMsg"));
							return;
						} else {
							// 详细数据(字段-对应的数据)
							JSONArray jsonArray = JSONObject.fromObject(productInfoObj.get("providerData")).getJSONArray("products");
							int arraySize = jsonArray.size();
							for(int j=(arraySize-1);j>-1;j--){
								JSONObject object = jsonArray.getJSONObject(j);
								List<ProductsParamsDomain> productsParamsList = new ArrayList<ProductsParamsDomain>();
								for (ProductsClassifyParamsDomain productsClassifyParamsDomain : findParemsCodeByViewName) {
									ProductsParamsDomain productsParamsDomain = new ProductsParamsDomain();
									//视图名
									productsParamsDomain.setViewname(domain.getViewname());
									//主键
									productsParamsDomain.setMetadataid(object.getLong("metadataid"));
									//产品型号
									productsParamsDomain.setModelno(object.getString("modelno"));
									productsParamsDomain.setParamsCode(productsClassifyParamsDomain.getParamsCode());
									if(enmValueMap.get(domain.getViewname()+"-"+productsClassifyParamsDomain.getParamsCode())!=null){//字段值需要替换为显示值，比如 SUDONGGONGNENG 有`1~无`0  获取的值1需要替换为有 获取的值0需要替换为无
		                                String enmValue=enmValueMap.get(domain.getViewname()+"-"+productsClassifyParamsDomain.getParamsCode());
		                                LOG.info("字段名为："+productsClassifyParamsDomain.getParamsCode()+" 原字段值为："+object.getString(productsClassifyParamsDomain.getParamsCode()));
		                                LOG.info("字段："+productsClassifyParamsDomain.getParamsCode()+"的值需需要替换为枚举值，枚举规则为："+enmValue);

		                                //根据原字段值查找显示值
		                                String disFieldValue="";
		                                String[] enmValueArr=enmValue.split("~");//enmValueArr:["有`1","无`0"]
		                                //System.out.println("enmValueArr:"+JSONUtil.objectToJson(enmValueArr));
		                                for(int k=0;k<enmValueArr.length;k++){
		                                    String enmValueArrEach=enmValueArr[k];
		                                    String[] enmValueArrEachArr=enmValueArrEach.split("`");
		                                    if(enmValueArrEachArr.length>1){
		                                    	if(enmValueArrEachArr[1].equalsIgnoreCase(object.getString(productsClassifyParamsDomain.getParamsCode()))){//比如1与字段值一致，将替换为有
		                                    		disFieldValue=enmValueArrEachArr[0];
		                                    	}
		                                    }else{
		                                    	disFieldValue=enmValueArrEach;
		                                    }
		                                }
		                                LOG.info("字段名为："+productsClassifyParamsDomain.getParamsCode()+" 新字段值为："+disFieldValue);
		                                productsParamsDomain.setParamsValue(disFieldValue);
		                            }else{
		                            	productsParamsDomain.setParamsValue(object.getString(productsClassifyParamsDomain.getParamsCode()));
		                            }
									
									productsParamsList.add(productsParamsDomain);
								}
								productsParamsDao.saveAllProductParamsValue(productsParamsList);
							}
							//
//							showInfoObj.element("分页信息",JSONObject.fromObject(productInfoObj.get("providerData")).get("paged"));
//							showInfoObj.element("数据类型",JSONObject.fromObject(productInfoObj.get("providerData")).get("datatype"));
						}
					} catch (Exception e) {
						throw new BusinessException(BusinessExceptionCode.ws_result_error, ThrowableUtil.getStackTrace(e));
					}
				}
			}
		}

	}
	
	
	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2015-1-21 下午2:50:40
	 * @see com.haier.isales.products.productsparams.service.ProductsParamsService#getSingleData()
	 */
	@Override
	public void getSingleData(String viewName, String fieldGroups) {
		try {
			String viewPropertiesResult = HaierHereProductsInterface.getAllViewProperties(viewName, fieldGroups);

			HaierHereProductsInterface.getAllViewData(viewPropertiesResult, viewName);

		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
			LOG.info("ex", e);
		}

	}

	/* ====================getter and setter ================= */

	/**
	 * @Description: 属性productsParamsDao 的set方法
	 */
	public void setProductsParamsDao(ProductsParamsDAO productsParamsDao) {
		this.productsParamsDao = productsParamsDao;
	}

	/**
	 * @Description: 属性 productsClassifyDao 的set方法
	 * @param productsClassifyDao
	 */
	public void setProductsClassifyDao(ProductsClassifyDAO productsClassifyDao) {
		this.productsClassifyDao = productsClassifyDao;
	}

	/**
	 * @Description: 属性 productsClassifyParamsDao 的set方法
	 * @param productsClassifyParamsDao
	 */
	public void setProductsClassifyParamsDao(ProductsClassifyParamsDAO productsClassifyParamsDao) {
		this.productsClassifyParamsDao = productsClassifyParamsDao;
	}
	
}
