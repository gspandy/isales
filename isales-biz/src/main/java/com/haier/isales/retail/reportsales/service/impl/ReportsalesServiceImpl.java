/**
 * @Company 青鸟软通   
 * @Title: ReportsalesService.java 
 * @Package  com.haier.isales.retail.reportsales.service.impl
 * @author John Zhao   
 * @date 2014年11月11日  17:37:36
 * @version V1.0   
 */
package com.haier.isales.retail.reportsales.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.bana.common.util.basic.DateUtil;
import org.bana.common.util.basic.StringUtils;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.basicinfo.promodel.domain.ProModelDomain;
import com.haier.isales.basicinfo.promodel.service.ProModelService;
import com.haier.isales.basicinfo.pubarea.domain.AreaDomain;
import com.haier.isales.basicinfo.pubarea.domain.CityDomain;
import com.haier.isales.basicinfo.pubarea.domain.ProvinceDomain;
import com.haier.isales.basicinfo.pubarea.service.PubAreaService;
import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.DictionaryCache;
import com.haier.isales.common.DomainDtoUtil;
import com.haier.isales.common.IsalesConstants.DictionaryType;
import com.haier.isales.common.ScoreResult;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.retail.personalmodel.service.PersonalmodelService;
import com.haier.isales.retail.reportsales.dao.ReportsalesDAO;
import com.haier.isales.retail.reportsales.domain.ReportsalesDomain;
import com.haier.isales.retail.reportsales.dto.ReportSalesDTO;
import com.haier.isales.retail.reportsales.service.ReportsalesService;
import com.haier.isales.retail.reportsave.service.SaveEmployeeRefSalesService;
import com.haier.isales.retail.searchsales.dto.SearchModelSalesDTO;
import com.haier.isales.retail.shopemployeeref.domain.ShopEmployeeRefDomain;
import com.haier.isales.retail.shopemployeeref.service.ShopEmployeeRefService;
import com.haier.isales.score.dto.ScoreDTO;
import com.haier.isales.score.module.ScoreConstants.SalesCountDivisor;
import com.haier.isales.score.module.ScoreConstants.ScoreType;
import com.haier.isales.score.module.ScoreModule;
import com.haier.isales.score.service.ScoreService;
import com.haier.isales.ws.zzjyt.client.btbappxltbsaveimpl.BTBAPPxltbSaveImpl;
import com.haier.isales.ws.zzjyt.client.btbappxltbsaveimpl.BtbapPxltbInfo;
import com.haier.isales.ws.zzjyt.client.tmappsaveimpl.TmAPPSaveImpl;
import com.haier.isales.ws.zzjyt.client.tmappsaveimpl.TmAPPSaveInfo;
import com.haier.isales.ws.zzjyt.reportsales.client.qykresult.QYKyanzhengIMPL;
import com.haier.isales.ws.zzjyt.reportsales.client.qykresult.QyKyanzheng;
import com.haier.isales.ws.zzjyt.reportsales.client.reportsalesbybarcode.TmSaveImpl;

/**
 * @ClassName: ReportsalesService
 * @Description: Reportsales的Service接口定义类
 * @author John.zhao
 */
public class ReportsalesServiceImpl implements ReportsalesService {

	private static final Logger LOG = LoggerFactory.getLogger(ReportsalesServiceImpl.class);

	// 创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。
	private ExecutorService pool = Executors.newCachedThreadPool();

	/**
	 * @Fields REPORT_SALES_EXPIRY_DATE :维护字典表中购机时间基准的类型
	 */
	public static final String REPORT_SALES_EXPIRY_DATE = "1";
	
	/** 
	* @Fields REPORT_STATUS_DISABLE : 提包销量中被删除后的状态值 
	*/ 
	public static final String REPORT_STATUS_DISABLE = "102";
	/**
	 * @Fields reportsalesDao : ReportsalesDao 工具依赖
	 */
	private ReportsalesDAO reportsalesDao;
	/**
	 * @Fields reportSalesByBarCode : 按条码提报销量接口
	 */
	private TmSaveImpl reportSalesByBarCode;
	/**
	 * @Fields proModelService : 根据产品型号编码获取产品的信息
	 */
	private ProModelService proModelService;
	/**
	 * @Fields scoreService : 积分service
	 */
	private ScoreService scoreService;
	/**
	 * @Fields personalmodelService : 维护常用型号接口
	 */
	private PersonalmodelService personalmodelService;
	/** 
	* @Fields qykResult : 权益卡验证接口 
	*/ 
	private QYKyanzhengIMPL qykResult;
	/** 
	* @Fields btbAPPxltbSaveImpl : 新版型号提报销量接口
	*/ 
	private BTBAPPxltbSaveImpl btbAPPxltbSaveImpl;
	/** 
	* @Fields tmAPPSaveImpl : 新版条码提报接口(返回自主经营体的主键)
	*/ 
	private TmAPPSaveImpl tmAPPSaveImpl;
	/**
	 * @Fields shopEmployeeRefService : 查询直销员所在门店
	 */
	private ShopEmployeeRefService shopEmployeeRefService;
	
	// 查询省市区名称
	private PubAreaService pubAreaService;
	
	/**
     * @Fields saveEmployeeRefSalesService 本地保存销量
     */
    private SaveEmployeeRefSalesService saveEmployeeRefSalesService;
	
	/* ===============业务方法============= */

	/**
	 * <p>
	 * Description: 按照型号提报销量，同步给自主经营体系统
	 * </p>
	 * 
	 * @author John Zhao
	 * @date 2014-11-11 下午5:45:27
	 * @param reportsalesDomain
	 * @see com.haier.isales.retail.reportsales.service.ReportsalesService#reportSalesByModel(com.haier.isales.retail.reportsales.domain.ReportsalesDomain)
	 */
    @SuppressWarnings("finally")
    @Override
	public ScoreResult saveReportSalesByModel(ReportsalesDomain reportsalesDomain) {
		LOG.info("调用按型号提报销量开始,传入的参数为：" + reportsalesDomain);
		if (reportsalesDomain == null) {
			// 输入的参数为空
			throw new BusinessException(BusinessExceptionCode.param_error, "按型号提报销量传入参数为空");
		}
		// 验证直销员是否允许报销量，根据个人信息和门店信息来校验门店：闭店不能录销量，客户属性只有为（3：客户/门店，2门店）可以录销量
		boolean allow = reportsalesDomain.isIfAllowedToReportSales();
		if (!allow) {
			throw new BusinessException(BusinessExceptionCode.not_allow_report_sales);
		}
		// 校验必需输入的字段
		CheckParamUtil.checkFieldIfNotBlank(reportsalesDomain, "ygid", "gjtime", "product", "counts", "newprice",
				"isyj", "yhname", "shaddress","fpnum","price","istc");
		LOG.info("校验必需输入的字段");
		//2015-7-1 曹瑞：当用户选择套餐为否时，需要清除页面上已选择的套餐发起人。但是前端实习生无法实现此功能，暂从后台进行该逻辑的处理，以保证工期
		if ("N".equals(reportsalesDomain.getIstc())) {
			reportsalesDomain.setIstc("0");
			reportsalesDomain.setTcfqr("");
		}
		if ("Y".equals(reportsalesDomain.getIstc())) {
			reportsalesDomain.setIstc("1");
		}
		
		// 销售日期校验
		if (!checkReportGjtime(reportsalesDomain.getGjtime())) {
			throw new BusinessException(BusinessExceptionCode.parse_date_error, "购机时间不符合要求");
		}
		
		//处理时间格式，按员工号和月份查询门店信息==add by 2015年4月3日 16:18:37
		reportsalesDomain = getShopInfo(reportsalesDomain);
		// 校验手机号码是否全是数字
		if (reportsalesDomain.getYhphone() != null) {
			if (!CheckParamUtil.isMobileNO(reportsalesDomain.getYhphone())) {
				throw new BusinessException(BusinessExceptionCode.param_error, "手机号码格式不正确！");
			}
		}
		// 根据产品型号编码获取产品信息
		ProModelDomain pmd = proModelService.findById(reportsalesDomain.getProduct());
		if (pmd == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "产品型号不存在");
		}
		//证权益卡是否正确,当权益卡号不是null并且不是空和一堆空格时，才会去调用ws校验
		if(reportsalesDomain.getQykid() != null &&!"".equals(reportsalesDomain.getQykid().trim())){
			checkQYKid(reportsalesDomain.getMdid(),reportsalesDomain.getQykid(),reportsalesDomain.getYgid());
		}
		//发票号不能大于20位
		if(reportsalesDomain.getFpnum().length()>20){
			throw new BusinessException(BusinessExceptionCode.param_error, "发票号不能大于20位！");
		}
		/*BtBxltbInfo btBxltbInfo = new BtBxltbInfo();
		try {
			// 调用webservice向自主经营体提报
			btBxltbInfo = reportSalesByModel.xltbSave(reportsalesDomain.getYgid(), reportsalesDomain.getGjtime(), reportsalesDomain.getFpnum(),
					pmd.getCategoryE(), pmd.getCategoryEName(), pmd.getPrdn(), reportsalesDomain.getProduct()
							.toUpperCase(), "HY_1", reportsalesDomain.getMdid(), reportsalesDomain.getMdname(),
					reportsalesDomain.getCounts(), reportsalesDomain.getNewprice(), reportsalesDomain.getIsyj(),
					reportsalesDomain.getYhname(), reportsalesDomain.getYhphone(), reportsalesDomain.getShaddress(),
					reportsalesDomain.getHishfresult(), "", reportsalesDomain.getQykid(), "4");
		} catch (Exception e) {
			LOG.info("调用webservice出现异常！", e);
			throw new BusinessException(BusinessExceptionCode.ws_result_error, "连接超时,请稍候重试！");
		}*/
		reportsalesDomain.setReportType(ReportsalesDomain.REPORTTYPE_MODEL);
		reportsalesDomain.setCreateTime(new Date());
//		reportsalesDomain.setFpnum("0");
		reportsalesDomain.setCpzno(pmd.getCategoryE());
		reportsalesDomain.setCpzname(pmd.getCategoryEName());
		reportsalesDomain.setProducttype(pmd.getPrdn());
		reportsalesDomain.setHyzc("HY_1");
		reportsalesDomain.setLrfs("4");
		//手动插入状态位101有效
		reportsalesDomain.setStatus("101");
//		reportsalesDao.save(reportsalesDomain);
		
		// 前端传入省市区Code,需要将省市区编码转化为名称
		if (reportsalesDomain.getProvinceCode() != null &&
				!reportsalesDomain.getProvinceCode().equals("")) {

			ProvinceDomain provinceEntity = new ProvinceDomain();
			provinceEntity.setPaCode(reportsalesDomain.getProvinceCode());
			
			List<ProvinceDomain> provinceList = pubAreaService.getProvinceList(provinceEntity);
			// 添加查询结果判断
			if (provinceList.size() > 0) {
				ProvinceDomain provinceDomain = provinceList.get(0);
				reportsalesDomain.setProvince(provinceDomain.getPaName());
			}
		}
		
		if (reportsalesDomain.getCityCode() != null && 
				!reportsalesDomain.getCityCode().equals("")) {
			
			CityDomain cityEntity = new CityDomain();
			cityEntity.setPaCode(reportsalesDomain.getCityCode());
			
			List<CityDomain> cityList = pubAreaService.getCityByPaPCode(cityEntity);
			
			// 添加查询结果判断
			if (cityList.size() > 0) {
				CityDomain cityDomain = cityList.get(0);
				// 判断查询出来的省编码（上级行政区划代码）是否与传入的省编码一致 added by lizhenwei 2016-01-08
				if (!cityDomain.getPaPCode().equals(reportsalesDomain.getProvinceCode())) {
					throw new BusinessException(BusinessExceptionCode.param_error, "该城市不在选择的省份下！");
				}
				reportsalesDomain.setCity(cityDomain.getPaName());
			}
		}
		
		if (reportsalesDomain.getAreaCode() != null &&
				!reportsalesDomain.getAreaCode().equals("")) {
			
			AreaDomain areaEntity = new AreaDomain();
			areaEntity.setPaCode(reportsalesDomain.getAreaCode());
			
			List<AreaDomain> areaList = pubAreaService.getAreaByPaPCode(areaEntity);
			
			// 添加查询结果判断
			if (areaList.size() > 0) {
				AreaDomain areaDomain = areaList.get(0);
				// 判断查询出来的市编码（上级行政区划代码）是否与传入的市编码一致 added by lizhenwei 2016-01-08
				if (!areaDomain.getPaPCode().equals(reportsalesDomain.getCityCode())) {
					throw new BusinessException(BusinessExceptionCode.param_error, "该区不在选择的城市下！");
				}
				reportsalesDomain.setArea(areaDomain.getPaName());
			}
		}
		
		BtbapPxltbInfo btbapPxltbInfo = new BtbapPxltbInfo();
		try {
			// 调用webservice向自主经营体提报
			btbapPxltbInfo = btbAPPxltbSaveImpl.xltbAPPSave(reportsalesDomain.getYgid(), 
				reportsalesDomain.getGjtime(),
				reportsalesDomain.getFpnum(),
				pmd.getCategoryE(),
				pmd.getCategoryEName(),
				pmd.getPrdn(), 
				reportsalesDomain.getProduct().toUpperCase(),
				"HY_1", 
				reportsalesDomain.getMdid(), 
				reportsalesDomain.getMdname(),
				reportsalesDomain.getCounts(), 
				reportsalesDomain.getNewprice(), 
				reportsalesDomain.getIsyj(),
				reportsalesDomain.getYhname(), 
				reportsalesDomain.getYhphone(), 
				reportsalesDomain.getShaddress(),
				reportsalesDomain.getHishfresult(),
				"",
				reportsalesDomain.getQykid(), 
				"4",
				reportsalesDomain.getPrice(),
				reportsalesDomain.getTcfqr(),
				reportsalesDomain.getIstc(),
				reportsalesDomain.getProvince(),
				reportsalesDomain.getCity(),
				reportsalesDomain.getArea());
		} catch (Exception e) {
			LOG.info("调用webservice出现异常！", e);
			throw new BusinessException(BusinessExceptionCode.ws_result_error, "连接超时,请稍候重试！");
		}
		// 如果同步成功，则保存在数据库中
		if ("Y".equals(btbapPxltbInfo.getStatus())) {
			LOG.info("按型号提报销量成功!");
			//更新自主经营体的主键
			//reportsalesDao.updateEhubDataId(btbapPxltbInfo.getMes(), reportsalesDomain.getId());
			// 维护常用型号接口
			/*Map<String, Object> map = new HashMap<String, Object>();
			map.put("operatorId", reportsalesDomain.getOperatorId());
			map.put("product", reportsalesDomain.getProduct().toUpperCase());
			pool.execute(new MapRunable(map) {
				@Override
				public void run() {
					personalmodelService = SpringApplicationContextHolder.getBean("personalmodelService");
					PersonalModelAddDto pmad = new PersonalModelAddDto();
					pmad.setModelCode(map.get("product").toString());
					pmad.setOperatorId(Long.valueOf(map.get("operatorId").toString()));
					personalmodelService.savePersonalModel(pmad);
				}
			});*/
			//插入数据库表isales_app.t_isales_sales_diary
            try {
                saveEmployeeRefSalesService.saveSaleInfo(reportsalesDomain,pmd.getCategoryE(),pmd.getCategoryEName(),pmd.getPrdn());
            } catch (Exception e) {
                LOG.info("按型号（本地保存）报销销量失败", e);
            }finally{
                List<ScoreDTO> list = addReportSalesScore(reportsalesDomain.getGjtime(), reportsalesDomain.getOperatorId());
                ScoreResult scoreResult = new ScoreResult();
                scoreResult.setScoreList(list);
                scoreResult.setResult(reportsalesDomain.getId());
                return scoreResult;
            }
		} else {
			// 如果同步失败，不保存,直接返回同步失败
			LOG.info("按型号提报销量失败!失败消息为：" + btbapPxltbInfo.getMes());
			throw new BusinessException(BusinessExceptionCode.ws_result_error, btbapPxltbInfo.getMes());
		}
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author John Zhao
	 * @date 2014-11-11 下午5:45:27
	 * @param reportsalesDomain
	 * @see com.haier.isales.retail.reportsales.service.ReportsalesService#reportSalesByBarCode(com.haier.isales.retail.reportsales.domain.ReportsalesDomain)
	 */
	@SuppressWarnings("finally")
    @Override
	public ScoreResult saveReportSalesByBarCode(ReportsalesDomain reportsalesDomain) {
		LOG.info("调用按条形码提报销量开始,传入的参数为：" + reportsalesDomain);
		if (reportsalesDomain == null) {
			// 输入的参数为空
			throw new BusinessException(BusinessExceptionCode.param_error, "条码提报销量输入为空！");
		}
		// 验证直销员是否允许报销量，根据个人信息和门店信息来校验门店：闭店不能录销量，客户属性只有为（3：客户/门店，2门店）可以录销量
		boolean allow = reportsalesDomain.isIfAllowedToReportSales();
		if (!allow) {
			throw new BusinessException(BusinessExceptionCode.not_allow_report_sales);
		}
		// 校验必需输入的字段
		CheckParamUtil.checkFieldIfNotBlank(reportsalesDomain, "gjtime", "barcode", "price", "newprice", "isyj",
				"yhname", "shaddress","fpnum","istc");
		
		//2015-7-1 曹瑞：当用户选择套餐为否时，需要清除页面上已选择的套餐发起人。但是前端实习生无法实现此功能，暂从后台进行该逻辑的处理，以保证工期
		if("N".equals(reportsalesDomain.getIstc())){
			reportsalesDomain.setIstc("0");
			reportsalesDomain.setTcfqr("");
		}
		if("Y".equals(reportsalesDomain.getIstc())){
			reportsalesDomain.setIstc("1");
		}
		
		reportsalesDomain.setBarcode(reportsalesDomain.getBarcode().toUpperCase());
		// 销售日期校验
		if (!checkReportGjtime(reportsalesDomain.getGjtime())) {
			throw new BusinessException(BusinessExceptionCode.parse_date_error, "购机时间不符合要求");
		}
		// 校验手机号码是否全是数字
		if (reportsalesDomain.getYhphone() != null) {
			if (!CheckParamUtil.isMobileNO(reportsalesDomain.getYhphone())) {
				throw new BusinessException(BusinessExceptionCode.param_error, "手机号码格式不正确！");
			}
		}
		// 根据产品型号编码获取产品信息
		ProModelDomain pmd = proModelService.findProModelInfoByBarCode(reportsalesDomain.getBarcode());
		if (pmd != null) {
			reportsalesDomain.setProduct(pmd.getProdcode());
			reportsalesDomain.setProducttype(pmd.getPrdn());
			reportsalesDomain.setCpzno(pmd.getCategoryE());
			reportsalesDomain.setCpzname(pmd.getCategoryEName());
		}
		
		//验证权益卡是否正确,当权益卡号不是null并且不是空和一堆空格时，才会去调用ws校验
		if(reportsalesDomain.getQykid() != null &&!"".equals(reportsalesDomain.getQykid().trim())){
			checkQYKid(reportsalesDomain.getMdid(),reportsalesDomain.getQykid(),reportsalesDomain.getYgid());
		}
		
		//发票号不能大于20位
		if(reportsalesDomain.getFpnum().length()>20){
			throw new BusinessException(BusinessExceptionCode.param_error, "发票号不能大于20位！");
		}
		// 设置数量为1
		reportsalesDomain.setCounts("1");
//		reportsalesDomain.setFpnum("0");
		reportsalesDomain.setReportType(ReportsalesDomain.REPORTTYPE_BARCODE);
		reportsalesDomain.setCreateTime(new Date());
		reportsalesDomain.setHyzc("HY_1");
		//标记为4
		reportsalesDomain.setPadbj("4");
		//手动插入状态位101，有效
		reportsalesDomain.setStatus("101");
//		reportsalesDao.save(reportsalesDomain);
		
		// 前端传入省市区Code,需要将省市区编码转化为名称
		if (reportsalesDomain.getProvinceCode() != null &&
				!reportsalesDomain.getProvinceCode().equals("")) {
			
			ProvinceDomain provinceEntity = new ProvinceDomain();
			provinceEntity.setPaCode(reportsalesDomain.getProvinceCode());
			
			List<ProvinceDomain> provinceList = pubAreaService.getProvinceList(provinceEntity);
			// 添加查询结果判断
			if (provinceList.size() > 0) {
				ProvinceDomain provinceDomain = provinceList.get(0);
				reportsalesDomain.setProvince(provinceDomain.getPaName());
			}
			
		}
		
		if (reportsalesDomain.getCityCode() != null && 
				!reportsalesDomain.getCityCode().equals("")) {
			
			CityDomain cityEntity = new CityDomain();
			cityEntity.setPaCode(reportsalesDomain.getCityCode());
			
			List<CityDomain> cityList = pubAreaService.getCityByPaPCode(cityEntity);
			// 添加查询结果判断
			if (cityList.size() > 0) {

				CityDomain cityDomain = cityList.get(0);
				reportsalesDomain.setCity(cityDomain.getPaName());
			}
		}
		
		if (reportsalesDomain.getAreaCode() != null &&
				!reportsalesDomain.getAreaCode().equals("")) {
			
			AreaDomain areaEntity = new AreaDomain();
			areaEntity.setPaCode(reportsalesDomain.getAreaCode());
			
			List<AreaDomain> areaList = pubAreaService.getAreaByPaPCode(areaEntity);
			// 添加查询结果判断
			if (areaList.size() > 0) {
				
				AreaDomain areaDomain = areaList.get(0);
				reportsalesDomain.setArea(areaDomain.getPaName());
			}
			
		}
				
		TmAPPSaveInfo tmAPPSaveInfo = new TmAPPSaveInfo();
		/*try {
			// 调用webservice向自主经营体提报
			tmSaveInfo = reportSalesByBarCode.doSave(reportsalesDomain.getYgid(), reportsalesDomain.getGjtime(), reportsalesDomain.getFpnum(),
					reportsalesDomain.getBarcode(), reportsalesDomain.getPrice(),
					reportsalesDomain.getNewprice(), "", "0", reportsalesDomain.getIsyj(),
					reportsalesDomain.getYhname(), reportsalesDomain.getYhphone(), reportsalesDomain.getShaddress(),
					reportsalesDomain.getHishfresult(), "4", "", "", reportsalesDomain.getQykid(), "HY_1");
		} catch (Exception e) {
			LOG.info("调用webservice出现异常！", e);
			throw new BusinessException(BusinessExceptionCode.ws_result_error, "连接超时,请稍候重试！");
		}*/
		try {
			// 调用webservice向自主经营体提报
			tmAPPSaveInfo = tmAPPSaveImpl.doSave(reportsalesDomain.getYgid(), reportsalesDomain.getGjtime(), reportsalesDomain.getFpnum(),
					reportsalesDomain.getBarcode(), reportsalesDomain.getPrice(),
					reportsalesDomain.getNewprice(), "","0", reportsalesDomain.getIsyj(),
					reportsalesDomain.getYhname(), reportsalesDomain.getYhphone(), reportsalesDomain.getShaddress(),
					reportsalesDomain.getHishfresult(), "4", "", "", reportsalesDomain.getQykid(), "HY_1",
					reportsalesDomain.getTcfqr(),
					reportsalesDomain.getIstc(),
					reportsalesDomain.getProvince(),
					reportsalesDomain.getCity(),
					reportsalesDomain.getArea());
		} catch (Exception e) {
			LOG.info("调用webservice出现异常！", e);
			throw new BusinessException(BusinessExceptionCode.ws_result_error, "连接超时,请稍候重试！");
		}
		if ("Y".equals(tmAPPSaveInfo.getStatus())) {
			LOG.info("按条码提报销量成功!");
			//更新自主经营体的主键
			//reportsalesDao.updateEhubDataId(tmAPPSaveInfo.getMes(), reportsalesDomain.getId());
			try{
//                saveEmployeeRefSalesService.saveSaleInfo(reportsalesDomain,"","","");
                saveEmployeeRefSalesService.saveSaleInfo(reportsalesDomain,reportsalesDomain.getCpzno(),reportsalesDomain.getCategoryEName(),reportsalesDomain.getProducttype());
            }catch (Exception e) {
                LOG.info("按条码提报销量失败!");
            }finally{
                //reportsalesDao.updateEhubDataId(tmAPPSaveInfo.getMes(), reportsalesDomain.getId());
                List<ScoreDTO> list = addReportSalesScore(reportsalesDomain.getGjtime(), reportsalesDomain.getOperatorId());
                ScoreResult scoreResult = new ScoreResult();
                scoreResult.setScoreList(list);
                scoreResult.setResult(reportsalesDomain.getId());
                return scoreResult;
            }
		} else {
			LOG.info("按条码提报销量失败!失败消息为：" + tmAPPSaveInfo.getMes());
			/*if(StringUtils.isBlank(tmAPPSaveInfo.getMes())){
				tmAPPSaveInfo.setMes("连接超时,请稍候重试！");
			}*/
			throw new BusinessException(BusinessExceptionCode.ws_result_error, tmAPPSaveInfo.getMes());
		}

	}

	/**
	 * <p>
	 * Description:20141121废弃了计算总数和金额的需求
	 * </p>
	 * 
	 * @author John Zhao
	 * @date 2014-11-17 下午3:08:01
	 * @param searchModelSalesDTO
	 * @see com.haier.isales.retail.reportsales.service.ReportsalesService#searchModelSales(com.haier.isales.retail.searchsales.dto.SearchModelSalesDTO)
	 */
	/*
	 * @Override public PageResult<SearchModelSalesDTO>
	 * searchModelSales(SearchModelSalesDTO searchModelSalesDTO) { if
	 * (searchModelSalesDTO == null) { throw new
	 * BusinessException(BusinessExceptionCode.param_error, "按型号提报销量查询传入参数为空");
	 * } // 校验必需输入的字段 CheckParamUtil.checkFieldIfNotBlank(searchModelSalesDTO,
	 * "ygId"); List<BtBxlcxInfo> btblist =
	 * bTBxlcxSelectImpl.getXLCX(searchModelSalesDTO.getYgId(),
	 * searchModelSalesDTO.getStartTime(), searchModelSalesDTO.getEndTime(),
	 * searchModelSalesDTO.getCpzNO(), searchModelSalesDTO.getProduct(),
	 * searchModelSalesDTO.getSflr(), searchModelSalesDTO.getStart(),
	 * searchModelSalesDTO.getLimit()); if (btblist == null || btblist.size() ==
	 * 0) { throw new BusinessException(BusinessExceptionCode.ws_result_error,
	 * "查询结果为空"); } List<SearchModelSalesDTO> searchList = new
	 * ArrayList<SearchModelSalesDTO>(); BigDecimal sumCount = new
	 * BigDecimal("0"); BigDecimal sumPrices = new BigDecimal("0"); for
	 * (BtBxlcxInfo b : btblist) { if (b != null) { SearchModelSalesDTO dto =
	 * BtBxlcxInfoToSearchDTOUtil.cloneBtBxlcxInfo2DTO(b); searchList.add(dto);
	 * if (dto.getCounts() != null && dto.getNewprice() != null) { sumCount =
	 * sumCount.add(new BigDecimal(dto.getCounts())); sumPrices = sumPrices
	 * .add(new BigDecimal(dto.getCounts()).multiply(new
	 * BigDecimal(dto.getNewprice()))); } } else { throw new
	 * BusinessException(BusinessExceptionCode.ws_result_error, "查询结果为空"); } }
	 * PageCond pageCond = new PageCond(); pageCond.getSumMap().put("count",
	 * sumCount); pageCond.getSumMap().put("price", sumPrices);
	 * PageResult<SearchModelSalesDTO> pageResult = new
	 * PageResult<SearchModelSalesDTO>(searchList, pageCond); return pageResult;
	 * }
	 */

	/**
	 * <p>
	 * Description:只提供list，不再计算金额和数量
	 * </p>
	 * 
	 * @author John Zhao
	 * @date 2014-11-21 下午8:08:41
	 * @param searchModelSalesDTO
	 * @return
	 * @see
	 */
	// @Override
	// public List<SearchModelSalesDTO> searchModelSales(SearchModelSalesDTO
	// searchModelSalesDTO) {
	// if (searchModelSalesDTO == null) {
	// throw new BusinessException(BusinessExceptionCode.param_error,
	// "按型号提报销量查询传入参数为空");
	// }
	// // 校验必需输入的字段
	// CheckParamUtil.checkFieldIfNotBlank(searchModelSalesDTO, "ygId");
	// List<BtBxlcxInfo> btblist =
	// bTBxlcxSelectImpl.getXLCX(searchModelSalesDTO.getYgId(),
	// searchModelSalesDTO.getStartTime(), searchModelSalesDTO.getEndTime(),
	// searchModelSalesDTO.getCpzNO(),
	// searchModelSalesDTO.getProduct(), searchModelSalesDTO.getSflr(),
	// searchModelSalesDTO.getStart(),
	// searchModelSalesDTO.getLimit());
	// if (btblist == null || btblist.size() == 0) {
	// throw new BusinessException(BusinessExceptionCode.ws_result_error,
	// "查询结果为空");
	// }
	// List<SearchModelSalesDTO> searchList = new
	// ArrayList<SearchModelSalesDTO>();
	// for (BtBxlcxInfo b : btblist) {
	// if (b != null) {
	// SearchModelSalesDTO dto =
	// BtBxlcxInfoToSearchDTOUtil.cloneBtBxlcxInfo2DTO(b);
	// searchList.add(dto);
	// } else {
	// throw new BusinessException(BusinessExceptionCode.ws_result_error,
	// "查询结果为空");
	// }
	// }
	// return searchList;
	// }
	@Override
	public List<ReportSalesDTO> searchModelSales(SearchModelSalesDTO searchModelSalesDTO) {
		if (searchModelSalesDTO == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "按型号提报销量查询传入参数为空");
		}
		// 校验必需输入的字段
		// CheckParamUtil.checkFieldIfNotBlank(searchModelSalesDTO, "ygId");
		if (searchModelSalesDTO.getYgId() == null) {
			throw new BusinessException(BusinessExceptionCode.param_error, "员工号不能为空");
		}
		ReportsalesDomain domain = new ReportsalesDomain();
		domain.setYgid(searchModelSalesDTO.getYgId());
		PageCond pageCond = new PageCond();
		// start代表currentPage
		pageCond.setCurrentPage(searchModelSalesDTO.getStart());
		pageCond.setPageSize(searchModelSalesDTO.getLimit());
		pageCond = PageCondUtil.check(pageCond);
		List<ReportsalesDomain> reportList = reportsalesDao.findByParams(domain, pageCond);
		List<ReportSalesDTO> searchList = new ArrayList<ReportSalesDTO>();
		if (reportList == null) {
			throw new BusinessException(BusinessExceptionCode.ws_result_error, "查询结果为空");
		} else {
			for (ReportsalesDomain redomain : reportList) {
				ReportSalesDTO reDto = DomainDtoUtil.cloneReportSalesDomain2ReportSalesDTO(redomain);
				searchList.add(reDto);
			}
		}
		return searchList;
	}

	/**
	 * @Description: 购机时间校验
	 * @author John.zhao
	 * @date 2014-11-24 下午5:02:42
	 * @param gjtime
	 * @return
	 */
	public boolean checkReportGjtime(String gjTime) {
		// 格式化日期
		String gjtime = DateUtil.toString(DateUtil.formateToDate(gjTime, "yyyy-MM-dd"), "yyyy-MM-dd");
		// 购机月份
		int gjMonth = Integer.valueOf(gjtime.substring(5, 7));
		// 购机日
		int gjDay = Integer.valueOf(gjtime.substring(8));
		Calendar ca = Calendar.getInstance();
		// 当天日
		int today = ca.get(Calendar.DAY_OF_MONTH);
		// 当前月
		int month = ca.get(Calendar.MONTH) + 1;
		ca.add(Calendar.MONTH, -1);
		int lastMonth = ca.get(Calendar.MONTH)+1;
		// 时间基准
		Integer dayLine = 3;
		String dictionaryDate = DictionaryCache.getInstance().getValueByTypeAndId(
				DictionaryType.report_sales_expiry_date.getTypeId(), REPORT_SALES_EXPIRY_DATE);
		if (dictionaryDate != null) {
			dayLine = Integer.valueOf(dictionaryDate);
		}
		if (gjMonth == month && gjDay <= today) {
			return true;
		} else if (gjMonth == lastMonth && today <= dayLine ) {
			return true;
		}
		return false;
	}

	/**
	 * @Description: 提报销量获取积分
	 * @author John.zhao
	 * @date 2014-11-24 下午5:43:34
	 */
	public List<ScoreDTO> addReportSalesScore(String gjTime, Long operatorId) {
		// 格式化日期
		String gjtime = DateUtil.toString(DateUtil.formateToDate(gjTime, "yyyy-MM-dd"), "yyyy-MM-dd");
		// 购机月份
		int gjMonth = Integer.valueOf(gjtime.substring(5, 7));
		// 购机日
		int gjDay = Integer.valueOf(gjtime.substring(8));
		Calendar ca = Calendar.getInstance();
		// 当天日
		int today = ca.get(Calendar.DAY_OF_MONTH);
		// 当前月
		int month = ca.get(Calendar.MONTH) + 1;
		boolean ifTodaySale = false;
		if (gjDay == today && gjMonth == month) {
			ifTodaySale = true;
		}
		Map<String, Object> variableMap = new HashMap<String, Object>();
		variableMap.put(SalesCountDivisor.是否当天销量.getValue(), ifTodaySale);
		ScoreModule scoreModule = new ScoreModule();
		scoreModule.setExtendVariable(variableMap);
		scoreModule.setOperatorId(operatorId);
		scoreModule.setScoreType(ScoreType.销量);
		List<ScoreDTO> list = scoreService.addScoreUseScoreRule(scoreModule);
		return list;
	}
	
	/**
	* <p>Description: </p> 
	* @author Liu Wenjie   
	* @date 2015-1-5 下午6:06:28 
	* @param barCode
	* @param remark 
	* @see com.haier.isales.retail.reportsales.service.ReportsalesService#deleteReportSalesByModule(java.lang.String, java.lang.String) 
	*/ 
	@Override
	public ReportsalesDomain deleteReportSalesByModule(String barCode, String remark) {
		if(StringUtils.isBlank(barCode)){
			LOG.warn("制定要删除的条码为空白，不会有对应对应的销量数据删除");
			return null;
		}
		PageCond pageCond = PageCondUtil.check(null);
		ReportsalesDomain domain = new ReportsalesDomain();
		domain.setBarcode(barCode);
		List<ReportsalesDomain> reportList = reportsalesDao.findByParams(domain, pageCond);
		//找到一条唯一的销量数据可以执行注销
		if(reportList != null && reportList.size() == 1){
			ReportsalesDomain reportsalesDomain = reportList.get(0);
			reportsalesDomain.setStatus(REPORT_STATUS_DISABLE);
			reportsalesDomain.setRemark(reportsalesDomain.getRemark() + "==" + remark);
			reportsalesDao.update(reportsalesDomain);
			return reportsalesDomain;
		}else{
			LOG.warn("按照barcode " + barCode + " 查到了多条销量纪录，不进行删除");
			return null;
		}
	}
	
	/** 
	* @Description: 把 按照条码录入销量的条目，修改为按照型号进行录入
	* @author Liu Wenjie   
	* @date 2015-1-5 下午6:34:47 
	* @return  
	*/ 
	public void updateReportType(String barCode){
		StringBuffer sb = new StringBuffer();
		sb.append("因录入方式错误，通过人工干预将此按照条码 ").append(barCode).append("录入的内容改为按照型号录入");
		//注销对应的记录 
		ReportsalesDomain reportSales = deleteReportSalesByModule(barCode, sb.toString());
		//新增一条按照销量录入的记录
		if(reportSales != null){
			reportSales.setId(null);
			//设置型号数据
			String targetBarCode = reportSales.getBarcode();
			if(StringUtils.isBlank(targetBarCode) || targetBarCode.length() < 9){
				throw new BusinessException(BusinessExceptionCode.parse_date_error,"数据库中的条码信息不对"+targetBarCode);
			}
			//设置型号信息
			reportSales.setProduct(targetBarCode.substring(0, 9));
			reportSales.setIfAllowedToReportSales(true);
			ScoreResult saveReport = saveReportSalesByModel(reportSales);
			LOG.info("编码" + barCode + "修改成功");
		}else{
			LOG.error("编码" + barCode + "修改失败");
		}
	}
	
	/** 
	* @Description: 权益卡号验证方法
	* @author John.zhao   
	* @date 2015-1-6 下午4:40:10 
	* @param mdId	门店编码
	* @param qykId  支持多个权益卡验证，中间用,分割
	* @param ygId   员工编码
	*/
	public void checkQYKid(String mdId,String qykId,String ygId){
		String[] arrayQYKid =  qykId.split(",");
		if(arrayQYKid.length>39){
			throw new BusinessException(BusinessExceptionCode.param_error,"权益卡号不能多于39个!");
		}
		// 修改为不加验证  modified by lizhenwei  2016-01-18
//		for(int i =0 ; i<arrayQYKid.length;i++){
			//权益卡必须是1~14位的数字
			
//			if(!arrayQYKid[i].matches("[\\d]{1,14}")){
//				throw new BusinessException(BusinessExceptionCode.param_error,"权益卡号格式不合法!");
//			}
//		}
		QyKyanzheng yanzheng = new QyKyanzheng();
		try {
			yanzheng = qykResult.getYanzheng(mdId, qykId, ygId);
		}catch(Exception e){
			LOG.info("调用webservice出现异常！", e);
			throw new BusinessException(BusinessExceptionCode.ws_result_error, "连接超时,请稍候重试！");
		}
		//只要返回结果不是Y(结果有可能是N或者调用失败为空等),全部校验不成功，抛出异常
		if(!"Y".equalsIgnoreCase(yanzheng.getStatus())){
			throw new BusinessException(BusinessExceptionCode.ws_result_error,yanzheng.getMes());
		}
	}

	/** 
	* @Description: 获取直销员每个月份所在的门店的信息
	* @author John.zhao   
	* @date 2015年4月3日 16:17:05
	* @param reportsalesDomain	
	* @return ReportsalesDomain
	*/
	public ReportsalesDomain getShopInfo(ReportsalesDomain reportsalesDomain){
		ShopEmployeeRefDomain domain = new ShopEmployeeRefDomain();
		domain.setMonth(reportsalesDomain.getGjtime());
		domain.setUserCode(reportsalesDomain.getYgid().toUpperCase());
		ShopEmployeeRefDomain resultDomain = shopEmployeeRefService.findByCodeAndDate(domain);
		reportsalesDomain.setMdid(resultDomain.getShopCode());
		reportsalesDomain.setMdname(resultDomain.getShopName());
		return reportsalesDomain;
	}
	
	/* ====================getter and setter ================= */

	/**
	 * @Description: 属性reportsalesDao 的set方法
	 */
	public void setReportsalesDao(ReportsalesDAO reportsalesDao) {
		this.reportsalesDao = reportsalesDao;
	}

	/**
	 * @Description: 属性 reportSalesByBarCode 的set方法
	 * @param reportSalesByBarCode
	 */
	public void setReportSalesByBarCode(TmSaveImpl reportSalesByBarCode) {
		this.reportSalesByBarCode = reportSalesByBarCode;
	}


	/**
	 * @Description: 属性 proModelService 的set方法
	 * @param proModelService
	 */
	public void setProModelService(ProModelService proModelService) {
		this.proModelService = proModelService;
	}

	/**
	 * @Description: 属性 scoreService 的set方法
	 * @param scoreService
	 */
	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}

	/**
	 * @Description: 属性 personalmodelService 的set方法 
	 * @param personalmodelService 
	 */
	public void setPersonalmodelService(PersonalmodelService personalmodelService) {
		this.personalmodelService = personalmodelService;
	}

	/**
	 * @Description: 属性 qykResult 的set方法 
	 * @param qykResult 
	 */
	public void setQykResult(QYKyanzhengIMPL qykResult) {
		this.qykResult = qykResult;
	}

	/**
	 * @Description: 属性 btbAPPxltbSaveImpl 的set方法 
	 * @param btbAPPxltbSaveImpl 
	 */
	public void setBtbAPPxltbSaveImpl(BTBAPPxltbSaveImpl btbAPPxltbSaveImpl) {
		this.btbAPPxltbSaveImpl = btbAPPxltbSaveImpl;
	}

	/**
	 * @Description: 属性 tmAPPSaveImpl 的set方法 
	 * @param tmAPPSaveImpl 
	 */
	public void setTmAPPSaveImpl(TmAPPSaveImpl tmAPPSaveImpl) {
		this.tmAPPSaveImpl = tmAPPSaveImpl;
	}

	public void setShopEmployeeRefService(
			ShopEmployeeRefService shopEmployeeRefService) {
		this.shopEmployeeRefService = shopEmployeeRefService;
	}

	/**
	 * @param pubAreaService the pubAreaService to set
	 */
	public void setPubAreaService(PubAreaService pubAreaService) {
		this.pubAreaService = pubAreaService;
	}

    public void setSaveEmployeeRefSalesService(
            SaveEmployeeRefSalesService saveEmployeeRefSalesService) {
        this.saveEmployeeRefSalesService = saveEmployeeRefSalesService;
    }
	
	

}
