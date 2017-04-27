package com.haier.isales.performance.retail.service;

import io.terminus.pampas.client.Export;

import com.haier.isales.performance.retail.dto.CyclesDTO;

public interface CyclesClient {
	
	/**
	 * 查询周期的时间范围
	 * @param cyclesDTO
	 * @return
	 */
	@Export(paramNames={"cyclesDTO"})
	Object findCyclesByChoose(CyclesDTO cyclesDTO);

}
