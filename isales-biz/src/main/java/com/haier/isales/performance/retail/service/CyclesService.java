package com.haier.isales.performance.retail.service;

import com.haier.isales.performance.retail.dto.CyclesDTO;

public interface CyclesService {
	
	/**
	 * 
	 * @param cyclesDTO
	 * @return
	 */
	CyclesDTO findCyclesByChoose(CyclesDTO cyclesDTO);

}
