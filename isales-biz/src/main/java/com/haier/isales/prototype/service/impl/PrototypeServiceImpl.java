/**
 * @Company 青鸟软通   
 * @Title: PrototypeService.java 
 * @Package  com.haier.isales.prototype.service.impl
 * @author Guo Yuchao   
 * @date 2014年12月25日  14:05:35
 * @version V1.0   
 */
package com.haier.isales.prototype.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bana.common.util.basic.StringUtils;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.basicinfo.promodel.domain.ProModelDomain;
import com.haier.isales.basicinfo.promodel.service.ProModelService;
import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.StringUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.products.ProductsDomainDTOUtil;
import com.haier.isales.products.dto.ProductsImageDTO;
import com.haier.isales.products.productsimg.dao.ProductsImgAppDAO;
import com.haier.isales.products.productsimg.domain.ProductsImgDomain;
import com.haier.isales.products.productsinfoapp.dao.ProductsInfoAppDAO;
import com.haier.isales.products.productsinfoapp.domain.ProductsInfoAppDomain;
import com.haier.isales.prototype.PrototypeEnum.PrototypeStatusEnum;
import com.haier.isales.prototype.dao.PrototypeAttachmentDAO;
import com.haier.isales.prototype.dao.PrototypeDAO;
import com.haier.isales.prototype.domain.PrototypeAttachmentDomain;
import com.haier.isales.prototype.domain.PrototypeDomain;
import com.haier.isales.prototype.dto.PrototypeDTO;
import com.haier.isales.prototype.dto.PrototypeListParamDTO;
import com.haier.isales.prototype.service.PrototypeService;
import com.haier.isales.ws.hmms.client.samplewebservice.SampleWebService;

/**
 * @ClassName: PrototypeService
 * @Description: Prototype的Service接口定义类
 * 
 */
public class PrototypeServiceImpl implements PrototypeService {

	private static final Logger LOG = LoggerFactory.getLogger(PrototypeServiceImpl.class);
	public static final int BAR_CODE_LENGTH = 20;
	public static final String ATTACHMENT_ID_SEPARATOR = ",";//上传图片id分隔符
	public static final String PROLINE_SEPARATOR = ",";//产业线分隔符
	public static final String WS_RETURN_SUCCESS = "Y";//ws接口返回成功
	/**
	 * @Fields prototypeDao : PrototypeDao 工具依赖
	 */
	private PrototypeDAO prototypeDao;
	private SampleWebService sampleWebService;
	private ProModelService proModelService;
	private PrototypeAttachmentDAO prototypeAttachmentDAO;
	private ProductsInfoAppDAO productsInfoAppDao;
	private ProductsImgAppDAO productsImgDao;

	/* ===============业务方法============= */
	/**
	 * <p>
	 * Description:直销员移动应用向HMMS系统传递【样机出(上)样】信息
	 * </p>
	 * tradeOgNo 必填 提报样机对应工贸编号(12A01) productSortNo 必填 提报样机对应产品线编号(AA) custNo 必填
	 * 提报样机对应的门店编号（87,88码） barcode 必填 提报样机的条码 creater_eid 必填 提报人员工编号
	 * isDownReason 下市必填 下市可出样的样机必须写下市原因
	 * 
	 * @author Guo Yuchao
	 * @date 2014-12-24 下午4:59:33
	 * @param wsPrototypeDTO
	 * @return
	 * @throws BusinessException
	 * @see com.haier.isales.prototype.prototype.service.PrototypeService#savePrototypePurchase(com.haier.isales.prototype.dto.WsPrototypeDTO)
	 */
	@Override
	public String savePrototypePurchase(PrototypeDTO prototypeDTO) throws BusinessException {
//		CheckParamUtil.checkFieldIfNotBlank(prototypeDTO, "tradeOrgCode", "shopId", "barcode", "userCode");//去除上传图片校验
		CheckParamUtil.checkFieldIfNotBlank(prototypeDTO, "tradeOrgCode", "shopId", "barcode", "userCode","shareImages");
		// 验证条码
		prototypeDTO.setBarcode(prototypeDTO.getBarcode().trim().toUpperCase());//条码默认转为大写字母
		if (BAR_CODE_LENGTH != prototypeDTO.getBarcode().length()) {
			throw new BusinessException(BusinessExceptionCode.param_error, "条码长度不对");
		}
		// 条码和产品线匹配
		ProModelDomain modelInfo = proModelService.findProModelInfoByBarCode(prototypeDTO.getBarcode().trim());
		//判断上样样机的产业线 和上样员工的产业线是否一致
		PrototypeDomain proLineInfo = prototypeDao.findProLineBySortCode(modelInfo.getCategoryE());
		if(StringUtils.isEmpty(prototypeDTO.getProductLine())
				|| proLineInfo == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"没有找到您的产业线信息，匹配上样样机产业失败");
		}
		List<String> proLineList = Arrays.asList(prototypeDTO.getProductLine().replaceAll("\\s", "").split(PROLINE_SEPARATOR));
		if(!proLineList.contains(proLineInfo.getProductLine().trim())){
			throw new BusinessException(BusinessExceptionCode.param_error,"您的产业线与上样样机产业不匹配");
		}
		if (modelInfo == null || StringUtils.isEmpty(modelInfo.getCategoryE())) {
			throw new BusinessException(BusinessExceptionCode.database_none_data, "上样失败，没有找到指定的产品线");
		}
		List<String> resultList;
		try {
			resultList = sampleWebService.saveSampleOut(
					prototypeDTO.getTradeOrgCode(), modelInfo.getCategoryE(),
					prototypeDTO.getShopId(), prototypeDTO.getBarcode().trim(),
					prototypeDTO.getUserCode(), prototypeDTO.getIsDownReason());
		} catch (Exception e) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"样机上样失败",e);
		}
		LOG.info("【样机出(上)样】结果：" + resultList);
		if (resultList == null || resultList.isEmpty()) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error, "样机上样失败，请检查网络是否可用");
		}
		if (!WS_RETURN_SUCCESS.equals(resultList.get(0))) {
			//流程成功返回Y  失败返回F
			if (!StringUtils.isEmpty(resultList.get(1))) {
				throw new BusinessException(BusinessExceptionCode.ws_result_error, resultList.get(1));
			} else {
				throw new BusinessException(BusinessExceptionCode.ws_result_error, "样机上样失败，请稍后重试");
			}
		}
		//  保存上传的图片
		if(!StringUtils.isEmpty(prototypeDTO.getShareImages())){
			List<String> shareImages = Arrays.asList(prototypeDTO.getShareImages().replaceAll("\\s", "").split(ATTACHMENT_ID_SEPARATOR));
			for (String shareImageId : shareImages) {
				PrototypeAttachmentDomain prototypeAttachmentDomain = new PrototypeAttachmentDomain();
				prototypeAttachmentDomain.setBarcode(prototypeDTO.getBarcode());
				prototypeAttachmentDomain.setAttachmentId(Long.valueOf(shareImageId));
				//查询是否已存在关联
				List<PrototypeAttachmentDomain> dbDomainList = prototypeAttachmentDAO.findByParams(prototypeAttachmentDomain);
				if(dbDomainList != null && !dbDomainList.isEmpty()){
					continue;
				}
				prototypeAttachmentDAO.save(prototypeAttachmentDomain);
			}
		}
		// 记录日志 存入prototype表中
		//2015-1-9 15:59:12 上样成功在本系统不保存
//		prototypeDTO.setProductModelCode(modelInfo.getProdcode());
//		prototypeDTO.setProductModelName(modelInfo.getPrdn());
//		prototypeDTO.setProductSortNo(modelInfo.getCategoryE());
//		prototypeDTO.setStatus(PrototypeStatusEnum.已出样.getValue());
//		prototypeDTO.setRemark("下市原因:"+prototypeDTO.getIsDownReason());
//		PrototypeDomain toSavePrototypeDomain = PrototypeDomainDTOUtil.clonePrototypeDTO2Domain(prototypeDTO);
//		if(proLineInfo != null){
//			//保存产品线101码 和图片id
//			toSavePrototypeDomain.setProductLine(proLineInfo.getProductLine());
//			toSavePrototypeDomain.setProductLineName(proLineInfo.getProductLineName());
//			toSavePrototypeDomain.setImgId(proLineInfo.getImgId());
//		}
//		prototypeDao.save(toSavePrototypeDomain);
		
//		return resultList.get(1);//2015-1-9 16:00:11 修改本系统上样成功提示
		return "样机出样成功，数据已经提报至终端门店系统。 由于数据同步延迟，您可在明天使用手机查看该样机信息。";
	}

	/**
	 * <p>
	 * Description:直销员移动应用向HMMS系统传递【样机核销】信息
	 * </p>
	 * 
	 * @author Guo Yuchao
	 * @date 2014-12-24 下午5:12:16
	 * @param wsPrototypeDTO
	 * @return
	 * @throws BusinessException
	 * @see com.haier.isales.prototype.prototype.service.PrototypeService#savePrototypeAuditOut(com.haier.isales.prototype.dto.WsPrototypeDTO)
	 */
	@Override
	public String savePrototypeAuditOut(PrototypeDTO prototypeDTO) throws BusinessException {
//		CheckParamUtil.checkFieldIfNotBlank(prototypeDTO, "id", "salePrice", "userCode");
//		PrototypeDomain dbPrototype = prototypeDao.findById(prototypeDTO.getId());
	    CheckParamUtil.checkFieldIfNotBlank(prototypeDTO,"salePrice", "userCode","barcode");
	    PrototypeDomain dbPrototype = prototypeDao.findByBarCode(prototypeDTO.getBarcode());
		CheckParamUtil.checkFieldIfNotBlank(dbPrototype, "productSortNo", "tradeOrgCode",
				"shopId", "barcode", "productModelCode", "productModelName");
		// 验证条码
		if (BAR_CODE_LENGTH != dbPrototype.getBarcode().length()) {
			throw new BusinessException(BusinessExceptionCode.param_error, "条码长度不对");
		}
		//判断上样样机的产业线 和上样员工的产业线是否一致
		if(StringUtils.isEmpty(prototypeDTO.getProductLine())){
			throw new BusinessException(BusinessExceptionCode.param_error,"没有找到您的产业线信息，匹配上样样机产业失败");
		}
		List<String> proLineList = Arrays.asList(prototypeDTO.getProductLine().replaceAll("\\s", "").split(PROLINE_SEPARATOR));
		if(!proLineList.contains(dbPrototype.getProductLine().trim())){
			throw new BusinessException(BusinessExceptionCode.param_error,"您的产业线与上样样机产业不匹配");
		}
		List<String> resultList;
		try {
			resultList = sampleWebService.sampleOutCheck(dbPrototype.getProductSortNo(),
					dbPrototype.getTradeOrgCode(), dbPrototype.getStationName(), dbPrototype.getShopId(),
					dbPrototype.getBarcode().trim(), dbPrototype.getProductModelCode(), dbPrototype.getProductModelName(),
					prototypeDTO.getSalePrice(), prototypeDTO.getUserCode().trim());
		} catch (Exception e) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"样机核销失败",e);
		}
		LOG.info("【样机核销】结果：" + resultList);
		if (resultList == null || resultList.isEmpty()) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error, "样机核销失败，请检查网络是否可用");
		}
		if (!WS_RETURN_SUCCESS.equals(resultList.get(0))) {
			//流程成功返回Y  失败返回F
			if (!StringUtils.isEmpty(resultList.get(1))) {
				throw new BusinessException(BusinessExceptionCode.ws_result_error, resultList.get(1));
			} else {
				throw new BusinessException(BusinessExceptionCode.ws_result_error, "样机上样失败，请稍后重试");
			}
		}
		// 记录核销信息
		dbPrototype.setStatus(PrototypeStatusEnum.已核销.getValue());
		dbPrototype.setRemark("成交价："+prototypeDTO.getSalePrice().toString());
		prototypeDao.update(dbPrototype);
		return resultList.get(1);
	}
	/**
	* <p>Description: 根据条件查询样机条码和分享图片的关联</p> 
	* @author Guo Yuchao   
	* @date 2015-1-13 下午5:08:25 
	* @param prototypeAttachmentDomain
	* @return 
	* @see com.haier.isales.prototype.service.PrototypeService#findPrototypeAttachmentByParams(com.haier.isales.prototype.domain.PrototypeAttachmentDomain) 
	*/ 
	@Override
	public List<PrototypeAttachmentDomain> findPrototypeAttachmentByParams(
			PrototypeAttachmentDomain prototypeAttachmentDomain) {
		return prototypeAttachmentDAO.findByParams(prototypeAttachmentDomain);
	}
	/**
	 * <p>
	 * Description:根据id查询样机
	 * </p>
	 * 
	 * @author Guo Yuchao
	 * @date 2014-12-26 下午4:28:15
	 * @param id
	 * @return
	 * @see com.haier.isales.prototype.service.PrototypeService#findById(java.lang.Long)
	 */
	@Override
	public PrototypeDomain findById(Long id) {
		return prototypeDao.findById(id);
	}

	/**
	 * <p>
	 * Description: 查询样机列表
	 * </p>
	 * 
	 * @author John.zhao
	 * @date 2014-12-25 下午7:20:19
	 * @param prototypeListDTO
	 * @param pageCond
	 * @return
	 * @see com.haier.isales.prototype.service.PrototypeService#searchPrototypePagerLikeList(com.haier.isales.prototype.dto.PrototypeListParamDTO,
	 *      org.bana.common.util.page.PageCond)
	 */
	@Override
	public PageResult<PrototypeDomain> searchPrototypePagerLikeList(PrototypeListParamDTO prototypeListDTO,
			PageCond pageCond) {
		
		PageCond pageCondQeury = pageCond;
		pageCondQeury = PageCondUtil.check(pageCondQeury);
		if (prototypeListDTO == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "查询条件为空");
		}
		CheckParamUtil.checkFieldIfNotBlank(prototypeListDTO, "shopId");
		List<String> productModelNameList;
		if (prototypeListDTO.getProductModelName() == null || "".equals(prototypeListDTO.getProductModelName().trim())) {
			productModelNameList = null;
		} else {
			productModelNameList = StringUtil.getLikeParamStrList(prototypeListDTO.getProductModelName(), "\\s");
		}
		List<PrototypeDomain> modelList = prototypeDao.findPrototypePagerLike(prototypeListDTO, productModelNameList,
				pageCondQeury);
		// if (modelList == null || modelList.isEmpty()) {
		// throw new BusinessException(
		// BusinessExceptionCode.database_none_data, "样机查询列表为空");
		// }
		return new PageResult<PrototypeDomain>(modelList, pageCondQeury);
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
    public PageResult<PrototypeDomain> searchPrototypePagerLikeListByDataPeriod(
            PrototypeListParamDTO prototypeListParamDTO, String startDate,String endDate,PageCond pageCond) {
        PageCond pageCondQuery=pageCond;
        pageCondQuery=PageCondUtil.check(pageCondQuery);
        if(prototypeListParamDTO==null){
            throw new BusinessException(BusinessExceptionCode.param_error, "查询条件为空");
        }
        /*if(startDate==null || startDate.length()<=0){//开始日期为空
            throw new BusinessException(BusinessExceptionCode.param_error, "请选择开始日期");
        }
        if(endDate==null || endDate.length()<=0){//结束日期为空
            throw new BusinessException(BusinessExceptionCode.param_error, "请选择结束日期");
        }*/
        if((startDate==null || startDate.length()<=0) && (endDate==null || endDate.length()<=0)){
            startDate=null;
            endDate=null;
                    
        }
        CheckParamUtil.checkFieldIfNotBlank(prototypeListParamDTO, "shopId");
        List<String> productModelNameList;
        if (prototypeListParamDTO.getProductModelName() == null || "".equals(prototypeListParamDTO.getProductModelName().trim())) {
            productModelNameList = null;
        } else {
            productModelNameList = StringUtil.getLikeParamStrList(prototypeListParamDTO.getProductModelName(), "\\s");
        }
        String modeCode=prototypeListParamDTO.getProductModelCode();
        if(modeCode == null || modeCode==""){
            //查询总条数
            Integer totleCount=prototypeDao.findListByDataPeriodCount(prototypeListParamDTO,productModelNameList, startDate,endDate);
            pageCondQuery.setTotalCount(totleCount);
        }
        //查询数据
        List<PrototypeDomain> modelList = prototypeDao.findPrototypePagerLikeListByDataPeriod(prototypeListParamDTO,productModelNameList, startDate,endDate,
                pageCond);
        return new PageResult<PrototypeDomain>(modelList, pageCondQuery);
    }
	
	/**
	* <p>Description: 根据样机id获取产品百科的图片集合 </p> 
	* @author Liu Wenjie   
	* @date 2015-3-11 下午4:29:51 
	* @param id
	* @return 
	* @see com.haier.isales.prototype.service.PrototypeService#searchProductsImgList(java.lang.Long) 
	*/ 
	@Override
	public List<ProductsImageDTO> searchProductsImgList(Long id) {
		// TODO Auto-generated method stub
		if (id == null || id == 0) {
			throw new BusinessException(BusinessExceptionCode.param_error, "样机主键不能为空或0");
		}
		//获取型号编码
		PrototypeDomain findById = prototypeDao.findById(id);
		if(findById == null){
			return null;
		}
		String productModelCode = findById.getProductModelCode();
		if(StringUtils.isBlank(productModelCode)){
			return null;
		}
		//获取产品百科对应数据的id 
		ProductsInfoAppDomain productsInfo = productsInfoAppDao.searchProductsInfoByModuleCode(productModelCode);
		if(productsInfo == null){
			return null;
		}
		
		//根据产品百科的id获取图片集合
		List<ProductsImageDTO> imgDtoList = new ArrayList<ProductsImageDTO>();
		List<ProductsImgDomain> searchProductsImages = productsImgDao.searchProductsImages(productsInfo.getMetadataid());
		if(searchProductsImages != null){
			for (ProductsImgDomain productsImgDomain : searchProductsImages) {
				imgDtoList.add(ProductsDomainDTOUtil.cloneProductsImageDomain2DTO(productsImgDomain));
			}
		}
		
		return imgDtoList;
	}

	/* ====================getter and setter ================= */

	/**
	 * @Description: 属性prototypeDao 的set方法
	 */
	public void setPrototypeDao(PrototypeDAO prototypeDao) {
		this.prototypeDao = prototypeDao;
	}

	/**
	 * @Description: 属性 sampleWebService 的set方法
	 * @param sampleWebService
	 */
	public void setSampleWebService(SampleWebService sampleWebService) {
		this.sampleWebService = sampleWebService;
	}

	/**
	 * @Description: 属性 proModelService 的get方法
	 * @return proModelService
	 */
	public ProModelService getProModelService() {
		return proModelService;
	}

	/**
	 * @Description: 属性 proModelService 的set方法
	 * @param proModelService
	 */
	public void setProModelService(ProModelService proModelService) {
		this.proModelService = proModelService;
	}

	public void setPrototypeAttachmentDAO(
			PrototypeAttachmentDAO prototypeAttachmentDAO) {
		this.prototypeAttachmentDAO = prototypeAttachmentDAO;
	}

	/**
	 * @Description: 属性 productsInfoAppDao 的set方法 
	 * @param productsInfoAppDao 
	 */
	public void setProductsInfoAppDao(ProductsInfoAppDAO productsInfoAppDao) {
		this.productsInfoAppDao = productsInfoAppDao;
	}

	/**
	 * @Description: 属性 productsImgDao 的set方法 
	 * @param productsImgDao 
	 */
	public void setProductsImgDao(ProductsImgAppDAO productsImgDao) {
		this.productsImgDao = productsImgDao;
	}

}
