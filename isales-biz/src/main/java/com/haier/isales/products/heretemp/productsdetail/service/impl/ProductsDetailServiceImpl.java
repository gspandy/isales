/**
 * @Company 青鸟软通   
 * @Title: ProductsDetailService.java 
 * @Package  com.haier.isales.products.productsdetail.service.impl
 * @author John.Zhao   
 * @date 2015年01月22日  17:49:35
 * @version V1.0   
 */
package com.haier.isales.products.heretemp.productsdetail.service.impl;

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
import com.haier.isales.products.heretemp.productsdetail.dao.ProductsDetailDAO;
import com.haier.isales.products.heretemp.productsdetail.domain.ProductsDetailDomain;
import com.haier.isales.products.heretemp.productsdetail.service.ProductsDetailService;
import com.haier.isales.products.heretemp.productsimg.dao.ProductsImgDAO;
import com.haier.isales.products.heretemp.productsimg.domain.ProductsImgDomain;

/**
 * @ClassName: ProductsDetailService
 * @Description: ProductsDetail的Service接口定义类
 * 
 */
public class ProductsDetailServiceImpl implements ProductsDetailService {

	private static final Logger LOG = LoggerFactory.getLogger(ProductsDetailServiceImpl.class);

	/**
	 * @Fields productsDetailDao : ProductsDetailDao 工具依赖
	 */
	private ProductsDetailDAO productsDetailDao;

	private ProductsImgDAO productsImgDao;

	private ProductsClassifyDAO productsClassifyDao;

	/* ===============业务方法============= */
	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2015-1-23 上午9:48:08
	 * @see com.haier.isales.products.productsdetail.service.ProductsDetailService#saveAllProductsDetailAndImage()
	 */
	@Override
	public void saveAllProductsDetailAndImage() {
		//先删除数据
		productsDetailDao.deleteAllProductsDetail();
		productsImgDao.deleteAllProductsImages();
		// 查询视图
		List<ProductsClassifyDomain> allProductInfoList = productsClassifyDao.getAllProductInfo();
		for (ProductsClassifyDomain productsClassifyDomain : allProductInfoList) {
			try {
				String searchColumn = HaierHereProductsInterface.getSearchColumn(productsClassifyDomain.getViewname(),"产品特性");
				// 通过查询字段和视图名，调用接口取数据
				String allViewData = HaierHereProductsInterface.getAllViewData(searchColumn,
						productsClassifyDomain.getViewname());
				if ("".equals(allViewData)) {
					LOG.info(productsClassifyDomain.getViewname() + "对应的产品详情字段" + allViewData + "无数据!");
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
								//获取产品详情
								JSONArray specialArray = object.getJSONArray("special");
								if (specialArray.size() == 0) {
									LOG.info(object.getLong("metadataid") + "该型号无产品详情！");
								} else {
									List<ProductsDetailDomain> productsDetailList = new ArrayList<ProductsDetailDomain>();
									for (int i = specialArray.size() - 1; i > -1; i--) {
										ProductsDetailDomain productsDetailDomain = new ProductsDetailDomain();
										productsDetailDomain.setMetadataid(object.getLong("metadataid"));
										productsDetailDomain.setViewname(object.getString("viewname"));
										productsDetailDomain.setModelno(specialArray.getJSONObject(i).getString("remarks"));
										productsDetailDomain.setChnlpath(object.getString("chnlpath"));
										productsDetailDomain.setDocpuburl(object.getString("docpuburl"));
										String pic = "";
										//如果pic_210_200节点不为空，则取pic_210_200节点的值
										if(!"".equals(specialArray.getJSONObject(i).getString("pic_210_200"))){
											pic=specialArray.getJSONObject(i).getString("pic_210_200");
										//如果pic_210_200为空，则取pic_900_600节点的值，如果为空，则为空	
										}else if (!"".equals(specialArray.getJSONObject(i).getString("pic_900_600"))){
											pic=specialArray.getJSONObject(i).getString("pic_900_600");
										}
										productsDetailDomain.setPic(pic);
										productsDetailDomain.setTitle(specialArray.getJSONObject(i).getString("title1"));
										productsDetailDomain.setSubtitle(specialArray.getJSONObject(i).getString("subtitle1"));
										productsDetailDomain.setContent(specialArray.getJSONObject(i).getString("content1"));
										productsDetailDomain.setRemark(specialArray.getJSONObject(i).getString("specialmetadataid"));
										productsDetailList.add(productsDetailDomain);
									}
									productsDetailDao.saveAllProductsDetail(productsDetailList);
								}
								
								//获取套图
								JSONArray taotuArray = object.getJSONArray("taotu");
								if (specialArray.size() == 0) {
									LOG.info(object.getLong("metadataid") + "该型号无套图！");
								} else {
									List<ProductsImgDomain> productsImgList = new ArrayList<ProductsImgDomain>();
									for (int i = taotuArray.size() - 1; i > -1; i--) {
										ProductsImgDomain productsImgDomain = new ProductsImgDomain();
										productsImgDomain.setMetadataid(object.getLong("metadataid"));
										productsImgDomain.setViewname(object.getString("viewname"));
										productsImgDomain.setFileext(taotuArray.getJSONObject(i).getString("fileext"));
										productsImgDomain.setAppfile(taotuArray.getJSONObject(i).getString("appfile"));
										productsImgDomain.setAppendixid(taotuArray.getJSONObject(i).getLong("appendixid"));
										productsImgDomain.setAppdesc(taotuArray.getJSONObject(i).getString("appdesc"));
										productsImgList.add(productsImgDomain);
									}
									productsImgDao.saveAllProductsImages(productsImgList);
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
	 * @Description: 属性productsDetailDao 的set方法
	 */
	public void setProductsDetailDao(ProductsDetailDAO productsDetailDao) {
		this.productsDetailDao = productsDetailDao;
	}

	/**
	 * @Description: 属性 productsImgDao 的set方法
	 * @param productsImgDao
	 */
	public void setProductsImgDao(ProductsImgDAO productsImgDao) {
		this.productsImgDao = productsImgDao;
	}

	/**
	 * @Description: 属性 productsClassifyDao 的set方法 
	 * @param productsClassifyDao 
	 */
	public void setProductsClassifyDao(ProductsClassifyDAO productsClassifyDao) {
		this.productsClassifyDao = productsClassifyDao;
	}
}
