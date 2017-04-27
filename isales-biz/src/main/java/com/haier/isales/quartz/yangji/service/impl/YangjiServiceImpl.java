package com.haier.isales.quartz.yangji.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.haier.isales.common.CheckParamUtil;
import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.quartz.yangji.dao.YangjiDAO;
import com.haier.isales.quartz.yangji.dao.YangjiListDAO;
import com.haier.isales.quartz.yangji.domain.FindListYangjiDomain;
import com.haier.isales.quartz.yangji.domain.YangjiDomain;
import com.haier.isales.quartz.yangji.service.YangjiService;
import com.haier.isales.yangji.dto.FindListYangjiDTO;
import com.haier.isales.yangji.dto.YangjiDTO;

public class YangjiServiceImpl implements YangjiService{
	
	YangjiDAO yangjiDao;
	
	YangjiListDAO yangjiListDAO;

	@Override
	public Long saveYanfjiService(YangjiDTO yangjiDTO) {
		if(yangjiDTO == null){
			throw new BusinessException(BusinessExceptionCode.param_error,"参数为空！");
		}
		CheckParamUtil.checkFieldIfNotBlank(yangjiDTO,"storeCode","storeName","modelCode","industryCode","industryName","operStatus","operDate");
		YangjiDomain yangjiDomain=ClonePojoUtil.copyClassFromTo(yangjiDTO, YangjiDomain.class);
		Long id=yangjiDao.saveYangjiDao(yangjiDomain);
		return id;
	}
	
	@Override
	public List<FindListYangjiDTO> findMsgListByUserCode(String userCode) {
		if(userCode==null || "".equals(userCode)){
			throw new BusinessException(BusinessExceptionCode.param_error,"请重新登录，获取用户工号信息");
		}
		List<FindListYangjiDomain> listDomain=yangjiListDAO.findMsgListByUserCode(userCode);
		List<FindListYangjiDTO> listDto=new ArrayList<FindListYangjiDTO>();
		for (FindListYangjiDomain findListYangjiDomain : listDomain) {
			FindListYangjiDTO yangjiDto=ClonePojoUtil.copyClassFromTo(findListYangjiDomain, FindListYangjiDTO.class);
			listDto.add(yangjiDto);
		}
		return listDto;
	}
	
	@Override
	public void updateMsgById(String id) {
		try {
			int idInt=Integer.parseInt(id);
			yangjiListDAO.updateMsgById(idInt);
		} catch (Exception e) {
			throw new BusinessException(BusinessExceptionCode.param_error,"参数不是标准的数字");
		}
		
	}

	public void setYangjiDao(YangjiDAO yangjiDao) {
		this.yangjiDao = yangjiDao;
	}

	public void setYangjiListDAO(YangjiListDAO yangjiListDAO) {
		this.yangjiListDAO = yangjiListDAO;
	}

	
}
