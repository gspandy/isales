package com.haier.isales.performance.retail.service.impl;

import java.util.Calendar;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.performance.retail.dao.CyclesDAO;
import com.haier.isales.performance.retail.dto.CyclesDTO;
import com.haier.isales.performance.retail.service.CyclesService;

public class CyclesServiceImpl implements CyclesService{
	
	private CyclesDAO  cyclesDAO;

	@Override
	public CyclesDTO findCyclesByChoose(CyclesDTO cyclesDTO) {
		if(cyclesDTO.getCycles()==null || "".equals(cyclesDTO.getCycles().trim())){
			throw new BusinessException(BusinessExceptionCode.param_error,"参数不能为空");
		}
		CyclesDTO dto=cyclesDAO.findCyclesByChoose(cyclesDTO);
		//获得今天的日期
		int todayDay=Calendar.getInstance().get(Calendar.DATE);
        if(todayDay>=dto.getCycle_start() && todayDay<=dto.getCycle_end()){
            dto.setResult(true);
        }else{
            dto.setResult(false);
        }
		return dto;
	}

	public void setCyclesDAO(CyclesDAO cyclesDAO) {
		this.cyclesDAO = cyclesDAO;
	}
}
