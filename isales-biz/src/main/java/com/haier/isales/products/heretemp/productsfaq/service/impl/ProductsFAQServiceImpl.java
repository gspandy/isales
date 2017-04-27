/**
 * @Company 青鸟软通   
 * @Title: ProductsFAQService.java 
 * @Package  com.haier.isales.products.productsfaq.service.impl
 * @author John.Zhao   
 * @date 2015年01月22日  15:16:47
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsfaq.service.impl;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import org.bana.common.util.exception.ThrowableUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.products.hereinterface.HaierHereProductsInterface;
import com.haier.isales.products.heretemp.productsclassify.dao.ProductsClassifyDAO;
import com.haier.isales.products.heretemp.productsclassify.domain.ProductsClassifyDomain;
import com.haier.isales.products.heretemp.productsfaq.dao.ProductsFAQDAO;
import com.haier.isales.products.heretemp.productsfaq.domain.ProductsFAQDomain;
import com.haier.isales.products.heretemp.productsfaq.service.ProductsFAQService;

/**
 * @ClassName: ProductsFAQService
 * @Description: ProductsFAQ的Service接口定义类
 * 
 */
public class ProductsFAQServiceImpl implements ProductsFAQService {

	private static final Logger LOG = LoggerFactory.getLogger(ProductsFAQServiceImpl.class);

	/**
	 * @Fields productsFAQDao : ProductsFAQDao 工具依赖
	 */
	private ProductsFAQDAO productsFAQDao;

	private ProductsClassifyDAO productsClassifyDao;

	/* ===============业务方法============= */

	/**
	 * <p>
	 * Description:保存常见问题FAQ数据
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2015-1-22 下午3:06:00
	 * @see com.haier.isales.products.productsparams.service.ProductsParamsService#saveProductsFAQ()
	 */
	@Override
	public void saveProductsFAQ() {
		//先删除数据
		productsFAQDao.deleteAllProductsFAQ();
		// 查询视图
		List<ProductsClassifyDomain> allProductInfoList = productsClassifyDao.getAllProductInfo();
		for (ProductsClassifyDomain productsClassifyDomain : allProductInfoList) {
			try {
				String searchColumn = HaierHereProductsInterface.getSearchColumn(productsClassifyDomain.getViewname(),
						"常见问题");
				// 通过查询字段和视图名，调用接口取数据
				String allViewData = HaierHereProductsInterface.getAllViewData(searchColumn,
						productsClassifyDomain.getViewname());
				if ("".equals(allViewData)) {
					LOG.info(productsClassifyDomain.getViewname() + "对应的FAQ字段" + allViewData + "无数据!");
				} else {
					try {
						JSONObject productInfoObj = JSONObject.fromObject(allViewData);
						if (!"200-请求服务成功".equals(productInfoObj.getString("resultMsg"))) {
							LOG.info("请求服务失败，" + productInfoObj.getString("resultMsg"));
							return;
						} else {
							// 详细数据(字段-对应的数据)
							JSONArray jsonArray = JSONObject.fromObject(productInfoObj.get("providerData"))
									.getJSONArray("products");
							int arraySize = jsonArray.size();
							for (int j = (arraySize - 1); j > -1; j--) {
								JSONObject object = jsonArray.getJSONObject(j);
								JSONArray faqArray = object.getJSONArray("faq");
								if (faqArray.size() == 0) {
									LOG.info(object.getLong("metadataid")+"该型号无无常见问题！");
								} else {
									List<ProductsFAQDomain> productsFAQList = new ArrayList<ProductsFAQDomain>();
									for (int i = faqArray.size()-1; i > -1; i--) {
										ProductsFAQDomain productsFAQDomain = new ProductsFAQDomain();
										productsFAQDomain.setMetadataid(object.getLong("metadataid"));
										productsFAQDomain.setFaqmetadataid(faqArray.getJSONObject(i).getLong(
												"faqmetadataid"));
										productsFAQDomain.setFname(faqArray.getJSONObject(i).getString("fname"));
										productsFAQDomain
												.setFfilename(faqArray.getJSONObject(i).getString("ffilename"));
										productsFAQList.add(productsFAQDomain);
									}
									productsFAQDao.saveAllProductsFAQ(productsFAQList);
								}
							}
						}
					} catch (JSONException e) {
						LOG.info("没有查询到相关的属性信息！");
					}
				}
			} catch (Exception e) {
				throw new BusinessException(BusinessExceptionCode.ws_result_error, ThrowableUtil.getStackTrace(e));
			}

		}
	}

	/* ====================getter and setter ================= */

	/**
	 * @Description: 属性productsFAQDao 的set方法
	 */
	public void setProductsFAQDao(ProductsFAQDAO productsFAQDao) {
		this.productsFAQDao = productsFAQDao;
	}

	/**
	 * @Description: 属性 productsClassifyDao 的set方法
	 * @param productsClassifyDao
	 */
	public void setProductsClassifyDao(ProductsClassifyDAO productsClassifyDao) {
		this.productsClassifyDao = productsClassifyDao;
	}

}
