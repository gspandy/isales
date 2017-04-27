/**
 * @Company 青鸟软通   
 * @Title: ProModelService.java 
 * @Package  com.haier.isales.basicInfo.proModel.service.impl
 * @author Guo Yuchao   
 * @date 2014年11月15日  11:42:33
 * @version V1.0   
 */
package com.haier.isales.basicinfo.promodel.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.bana.common.util.basic.StringUtils;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.basicinfo.promodel.dao.ProModelDAO;
import com.haier.isales.basicinfo.promodel.domain.ProModelDomain;
import com.haier.isales.basicinfo.promodel.service.ProModelService;
import com.haier.isales.common.StringUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;

/** 
 * @ClassName: ProModelService
 * @Description: ProModel的Service接口定义类
 *  
 */
public class ProModelServiceImpl implements ProModelService{

	private static final Logger LOG = LoggerFactory.getLogger(ProModelServiceImpl.class);
	
	/** 
	* @Fields proModelDao : ProModelDao 工具依赖 
	*/
	private ProModelDAO proModelDao;
	
	
	/*===============业务方法=============*/
	
	/**
	 * <p>Description: 根据条形码查询产品型号信息 </p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-15 上午11:57:05 
	 * @param barCode
	 * @return 
	 * @see com.haier.isales.basicInfo.proModel.service.ProModelService#findProModelInfoByBarCode(java.lang.String) 
	 */ 
	@Override
	public ProModelDomain findProModelInfoByBarCode(String barCode) {
		if (StringUtils.isEmpty(barCode) ) {
			throw new SystemException(BusinessExceptionCode.param_error,"条形码不能为空");
		}
		if (barCode.length() < ProModelDomain.PRODCODE_LENGTH) {
			throw new SystemException(BusinessExceptionCode.param_error,"输入的编码长度不足");
		}
		String proCode="";
        if (barCode.length() == ProModelDomain.PRODCODE_NEW_BARCODE) {
            proCode = barCode.substring(0, ProModelDomain.PRODCODE_NEW_LENGTH).toUpperCase();//截取前11位
        }else{
            proCode = barCode.substring(0, ProModelDomain.PRODCODE_LENGTH).toUpperCase();//截取前9位
        }
        if("".equals(proCode)){
            throw new SystemException(BusinessExceptionCode.param_error,"输入的编码长度不足");
        }
		ProModelDomain proModelDomain = proModelDao.findById(proCode); 
		if(proModelDomain == null ){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到指定的型号信息");
		}
		return proModelDomain;
	}
	/**
	* <p>Description: 根据型号名称模糊查询型号信息列表</p> 
	* @author Guo Yuchao   
	* @date 2014-11-17 下午4:23:16 
	* @param prdn
	* @return 
	* @see com.haier.isales.basicInfo.proModel.service.ProModelService#findProModelLikePrdn(java.lang.String) 
	*/ 
	@Override
	public List<ProModelDomain> findProModelLikePrdn(String prdn) {
		if(StringUtils.isEmpty(prdn)){
			throw new BusinessException(BusinessExceptionCode.param_error,"产品型号名称不能为空");
		}
		List<String> prdnList = StringUtil.getLikeParamStrList(prdn, "\\s");
		List<ProModelDomain> proModelList = proModelDao.findProModelLikePrdn(prdnList);
		if(proModelList == null || proModelList.isEmpty()){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到指定的产品型号");
		}
		return proModelList;
	}
	
	
	
	/**
	 * <p>Description: </p> 
	 * @author Guo Yuchao   
	 * @date 2014-11-19 上午10:16:45 
	 * @param prdn
	 * @param pageCond
	 * @return 
	 * @see com.haier.isales.basicInfo.proModel.service.ProModelService#findModelPagerLikePrdn(java.lang.String, org.bana.common.util.page.PageCond) 
	 */ 
	@Override
	public PageResult<ProModelDomain> findModelPagerLikePrdn(String prdn,
			PageCond pageCond) {
		
		PageCond pageCondQuery = PageCondUtil.check(pageCond);
		if(StringUtils.isEmpty(prdn)){
			throw new BusinessException(BusinessExceptionCode.param_error,"产品型号名称不能为空");
		}
		List<String> prdnList = StringUtil.getLikeParamStrList(prdn,"\\s");
		List<ProModelDomain> modelList = proModelDao.findModelPagerLikePrdn(prdnList, pageCondQuery);
		if(modelList == null || modelList.isEmpty()){
			throw new BusinessException(BusinessExceptionCode.database_none_data,"没有找到指定的产品型号");
		}
		Integer totalCount = proModelDao.findCountModelPagerLikePrdn(prdnList);
		pageCondQuery.setTotalCount(totalCount);
		pageCondQuery.setPageCount(PageCondUtil.calculatePageCount(pageCondQuery));
		return new PageResult<ProModelDomain>(modelList,pageCondQuery);
	}

	
	/*====================getter and setter =================*/
	
	/**
	 * @Description: 属性proModelDao 的set方法 
	 */
	public void setProModelDao(ProModelDAO proModelDao){
		this.proModelDao = proModelDao;
	}

	public static void main(String[] args) {
//		String subTest = "1234567890".substring(0, 9);
//		LOG.info("结果 "+subTest);
		String[] strs = "asd. sdi   sldkjif".trim().split("\\s");
		List<String> prdnList = new ArrayList<String>();
		for (String string : strs) {
			if(!StringUtils.isBlank(string)){
				prdnList.add(string.trim().toUpperCase());
				LOG.info(string.trim().toUpperCase().length()+"");
			}
		}
	}
	/**
	* <p>Description: 根据型号名称模糊查询型号信息列表</p> 
	* @author Guo Yuchao   
	* @date 2014-11-20 下午6:49:47 
	* @param prodCode
	* @return 
	* @see com.haier.isales.basicinfo.promodel.service.ProModelService#findById(java.lang.String) 
	*/ 
	@Override
	public ProModelDomain findById(String prodCode) {
		if(StringUtils.isEmpty(prodCode)){
			throw new BusinessException(BusinessExceptionCode.param_error,"产品型号编码不能为空");
		}
		ProModelDomain proModel = proModelDao.findById(prodCode);
		return proModel;
	}




}
