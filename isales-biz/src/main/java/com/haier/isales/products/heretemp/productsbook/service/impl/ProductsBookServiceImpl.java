/**
 * @Company 青鸟软通   
 * @Title: ProductsBookService.java 
 * @Package  com.haier.isales.products.productsbook.service.impl
 * @author John.Zhao   
 * @date 2015年01月22日  16:45:30
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsbook.service.impl;

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
import com.haier.isales.products.heretemp.productsbook.dao.ProductsBookDAO;
import com.haier.isales.products.heretemp.productsbook.domain.ProductsBookDomain;
import com.haier.isales.products.heretemp.productsbook.service.ProductsBookService;
import com.haier.isales.products.heretemp.productsclassify.dao.ProductsClassifyDAO;
import com.haier.isales.products.heretemp.productsclassify.domain.ProductsClassifyDomain;

/**
 * @ClassName: ProductsBookService
 * @Description: ProductsBook的Service接口定义类
 * 
 */
public class ProductsBookServiceImpl implements ProductsBookService {

	private static final Logger LOG = LoggerFactory.getLogger(ProductsBookServiceImpl.class);

	/**
	 * @Fields productsBookDao : ProductsBookDao 工具依赖
	 */
	private ProductsBookDAO productsBookDao;
	
	private ProductsClassifyDAO productsClassifyDao;

	/* ===============业务方法============= */
	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2015-1-22 下午4:48:19
	 * @see com.haier.isales.products.ProductsBookTempService.service.ProductsBookService#saveAllProductsBook()
	 */
	@Override
	public void saveAllProductsBook() {
		//先删除数据
		productsBookDao.deleteAllProductsBook();
		// 查询视图
		List<ProductsClassifyDomain> allProductInfoList = productsClassifyDao.getAllProductInfo();
		for (ProductsClassifyDomain productsClassifyDomain : allProductInfoList) {
			try {
				String searchColumn = HaierHereProductsInterface.getSearchColumn(productsClassifyDomain.getViewname(),
						"说明书");
				// 通过查询字段和视图名，调用接口取数据
				String allViewData = HaierHereProductsInterface.getAllViewData(searchColumn,
						productsClassifyDomain.getViewname());
				if ("".equals(allViewData)) {
					LOG.info(productsClassifyDomain.getViewname() + "对应的说明书字段" + allViewData + "无数据!");
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
								JSONArray bookArray = object.getJSONArray("book");
								if (bookArray.size() == 0) {
									LOG.info(object.getLong("metadataid") + "该型号无说明书！");
								} else {
									List<ProductsBookDomain> productsBookList = new ArrayList<ProductsBookDomain>();
									for (int i = bookArray.size() - 1; i > -1; i--) {
										ProductsBookDomain productsBookDomain = new ProductsBookDomain();
										productsBookDomain.setMetadataid(object.getLong("metadataid"));
										productsBookDomain.setBookmetadataid(bookArray.getJSONObject(i).getLong("bookmetadataid"));
										productsBookDomain.setDfilepath(bookArray.getJSONObject(i).getString("dfilepath"));
										productsBookDomain.setGname(bookArray.getJSONObject(i).getString("gname"));
										productsBookDomain.setGfile(bookArray.getJSONObject(i).getString("gfile"));
										productsBookList.add(productsBookDomain);
									}
									productsBookDao.saveAllProductsBook(productsBookList);
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
	 * @Description: 属性productsBookDao 的set方法
	 */
	public void setProductsBookDao(ProductsBookDAO productsBookDao) {
		this.productsBookDao = productsBookDao;
	}
	/**
	 * @Description: 属性 productsClassifyDao 的set方法
	 * @param productsClassifyDao
	 */
	public void setProductsClassifyDao(ProductsClassifyDAO productsClassifyDao) {
		this.productsClassifyDao = productsClassifyDao;
	}
}
