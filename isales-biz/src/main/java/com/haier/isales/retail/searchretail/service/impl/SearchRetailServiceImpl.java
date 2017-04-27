/**
 * @Company 青鸟软通   
 * @Title: SearchRetailService.java 
 * @Package  com.haier.isales.retail.searchretail.service.impl
 * @author John.zhao   
 * @date 2015年03月09日  09:42:35
 * @version V1.0   
 */
package com.haier.isales.retail.searchretail.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.retail.searchretail.SearchRetailWs2DTOUtil;
import com.haier.isales.retail.searchretail.service.SearchRetailService;
import com.haier.isales.retail.searchsales.dto.SearchRetailDTO;
import com.haier.isales.retail.searchsales.dto.SearchRetailMembersDiffDTO;
import com.haier.isales.ws.zzjyt.client.btbappxlcxselectimpl.BTBAPPxlcxSelectImpl;
import com.haier.isales.ws.zzjyt.client.btbappxlcxselectimpl.BtbapPxlcxInfo;
import com.haier.isales.ws.zzjyt.client.tmappselectimpl.TmAPPSelectImpl;
import com.haier.isales.ws.zzjyt.client.tmappselectimpl.TmAPPSelectInfo;

/**
 * @ClassName: SearchRetailService
 * @Description: SearchRetail的Service接口定义类
 * 
 */
public class SearchRetailServiceImpl implements SearchRetailService {

	private static final Logger LOG = LoggerFactory.getLogger(SearchRetailServiceImpl.class);
	/**
	 * @Fields btbAPPxlcxSelectImpl : TODO(用一句话描述这个变量表示什么)
	 */
	private BTBAPPxlcxSelectImpl btbAPPxlcxSelectImpl;
	/**
	 * @Fields tmAPPSelectImpl : TODO(用一句话描述这个变量表示什么)
	 */
	private TmAPPSelectImpl tmAPPSelectImpl;

	/* ===============业务方法============= */
	/**
	* <p>Description: 按型号查询(自主经营体联网数据)</p> 
	* @author John.zhao   
	* @date 2015-3-9 上午10:36:49 
	* @param searchRetailDTO
	* @return 
	* @see com.haier.isales.retail.searchretail.service.SearchRetailService#searchRetailModel(com.haier.isales.retail.searchsales.dto.SearchRetailDTO) 
	*/ 
	@Override
	public List<BtbapPxlcxInfo> searchRetailModel(SearchRetailDTO searchRetailDTO) {
		CheckParamUtil.checkFieldIfNotBlank(searchRetailDTO, "ygid","kssj","jssj");
		if(searchRetailDTO.getPageNo() == 0){
			searchRetailDTO.setPageNo(1);
	    }
        if(searchRetailDTO.getPageSize() == 0){
        	searchRetailDTO.setPageSize(10);
        }
        LOG.info("info");
		List<BtbapPxlcxInfo> list;
		try {
			list = btbAPPxlcxSelectImpl.getLw(searchRetailDTO.getYgid(),
					searchRetailDTO.getKssj(),
					searchRetailDTO.getJssj(),
					searchRetailDTO.getCpx(),
					searchRetailDTO.getProduct(),
					searchRetailDTO.getSflr(),
					searchRetailDTO.getIsmember(),
					searchRetailDTO.getPageNo(),
					searchRetailDTO.getPageSize());
		} catch (Exception e) {
			LOG.info("ex", e);
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"连接超时，请稍候重试!");
		}
		return list;
	}

	/**
	* <p>Description: 按条码查询(自主经营体条码数据)</p> 
	* @author John.zhao   
	* @date 2015-3-9 上午10:36:53 
	* @param searchRetailDTO
	* @return 
	* @see com.haier.isales.retail.searchretail.service.SearchRetailService#searchRetailBarCode(com.haier.isales.retail.searchsales.dto.SearchRetailDTO) 
	*/ 
	@Override
	public List<TmAPPSelectInfo> searchRetailBarCode(SearchRetailDTO searchRetailDTO) {
		CheckParamUtil.checkFieldIfNotBlank(searchRetailDTO, "ygid","kssj","jssj");
		if(searchRetailDTO.getPageNo() == 0){
			searchRetailDTO.setPageNo(1);
	    }
        if(searchRetailDTO.getPageSize() == 0){
        	searchRetailDTO.setPageSize(10);
        }
		List<TmAPPSelectInfo> list;
		try {
			list = tmAPPSelectImpl.getTm(searchRetailDTO.getYgid(),
					searchRetailDTO.getKssj(),
					searchRetailDTO.getJssj(),
					searchRetailDTO.getCpx(),
					searchRetailDTO.getIsmember(),
					searchRetailDTO.getPageNo(),
					searchRetailDTO.getPageSize());
		} catch (Exception e) {
			LOG.info("ex", e);
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"连接超时，请稍候重试!");
		}
		return list;
	}
	
	
	/**
	* <p>Description: 查询差异会员明细</p> 
	* @author Cao Rui  
	* @date 2015-7-22 下午10:34:56 
	* @param searchRetailDTO
	* @return 
	* @see com.haier.isales.retail.searchretail.service.SearchRetailService#searchRetailMembersDiff(com.haier.isales.retail.searchsales.dto.SearchRetailDTO) 
	*/ 
	@Override
	public List<SearchRetailMembersDiffDTO> searchRetailMembersDiff(SearchRetailDTO searchRetailDTO) {
		CheckParamUtil.checkFieldIfNotBlank(searchRetailDTO, "ygid");
//		查询条件的开始时间、结束时间限定为本月1号到当前日期
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal_1=Calendar.getInstance();
//		cal_1.add(Calendar.MONTH, -1);
		//设置为1号,当前日期既为本月第一天 
		cal_1.set(Calendar.DAY_OF_MONTH,1);
		String kssj = formatter.format(cal_1.getTime());
		
		Date currentTime = new Date();
		String jssj = formatter.format(currentTime);
		
		searchRetailDTO.setKssj(kssj);
		searchRetailDTO.setJssj(jssj);
//		查询条件 是否会员     需要查询不是会员的数据,数值逻辑：0未注册1老会员2新会员
		searchRetailDTO.setIsmember("0");
		
		if(searchRetailDTO.getPageNo() == 0){
			searchRetailDTO.setPageNo(1);
	    }
		//页面没做翻页处理，所以这个值取大一点，暂定100
        if(searchRetailDTO.getPageSize() == 0){
        	searchRetailDTO.setPageSize(100);
        }
        // 先按型号查询，如果没数据再按条码查询
        List<SearchRetailMembersDiffDTO> list = new ArrayList<SearchRetailMembersDiffDTO>();
        List<BtbapPxlcxInfo> modelList;
		try {
			modelList = btbAPPxlcxSelectImpl.getLw(searchRetailDTO.getYgid(),
					searchRetailDTO.getKssj(),
					searchRetailDTO.getJssj(),
					searchRetailDTO.getCpx(),
					searchRetailDTO.getProduct(),
					searchRetailDTO.getSflr(),
					searchRetailDTO.getIsmember(),
					searchRetailDTO.getPageNo(),
					searchRetailDTO.getPageSize());
		} catch (Exception e) {
			LOG.info("ex", e);
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"连接超时，请稍候重试!");
		}
		if(!modelList.isEmpty()){
			for(BtbapPxlcxInfo info : modelList){
				SearchRetailMembersDiffDTO dto = SearchRetailWs2DTOUtil.cloneBtbapPxlcxInfo2MembersDTO(info);
				list.add(dto);
			}
		}
//		如果按型号查询有数据，则返回结果，如没有，继续按条码再查询一次
		if(!list.isEmpty()){
			return list;
		}
		
		
		List<TmAPPSelectInfo> barCodeList;
		try {
			barCodeList = tmAPPSelectImpl.getTm(searchRetailDTO.getYgid(),
					searchRetailDTO.getKssj(),
					searchRetailDTO.getJssj(),
					searchRetailDTO.getCpx(),
					searchRetailDTO.getIsmember(),
					searchRetailDTO.getPageNo(),
					searchRetailDTO.getPageSize());
		} catch (Exception e) {
			LOG.info("ex", e);
			throw new BusinessException(BusinessExceptionCode.ws_result_error,"连接超时，请稍候重试!");
		}
		if(!barCodeList.isEmpty()){
			for(TmAPPSelectInfo info : barCodeList){
				SearchRetailMembersDiffDTO dto = SearchRetailWs2DTOUtil.cloneTmAPPSelectInfo2MembersDTO(info);
				list.add(dto);
			}
		}
		return list;
		
	}
	
	/* ====================getter and setter ================= */
	/**
	 * @Description: 属性 btbAPPxlcxSelectImpl 的set方法
	 * @param btbAPPxlcxSelectImpl
	 */
	public void setBtbAPPxlcxSelectImpl(BTBAPPxlcxSelectImpl btbAPPxlcxSelectImpl) {
		this.btbAPPxlcxSelectImpl = btbAPPxlcxSelectImpl;
	}

	/**
	 * @Description: 属性 tmAPPSelectImpl 的set方法
	 * @param tmAPPSelectImpl
	 */
	public void setTmAPPSelectImpl(TmAPPSelectImpl tmAPPSelectImpl) {
		this.tmAPPSelectImpl = tmAPPSelectImpl;
	}
}
