package com.haier.isales.performance.service.impl;

import com.haier.isales.performance.retail.dto.CyclesDTO;
import com.haier.isales.performance.retail.service.CyclesClient;
import com.haier.isales.performance.retail.service.CyclesService;

public class CyclesClientImpl implements CyclesClient{
	
	private CyclesService CyclesService;

	@Override
	public Object findCyclesByChoose(CyclesDTO cyclesDTO) {
		CyclesDTO dto =CyclesService.findCyclesByChoose(cyclesDTO);
		return dto;
	}

	public void setCyclesService(CyclesService cyclesService) {
		CyclesService = cyclesService;
	}
}
