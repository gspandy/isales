package com.haier.isales.performance.retail.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.common.dao.CommonDAO;
import com.haier.isales.performance.retail.dto.CyclesDTO;

public interface CyclesDAO extends CommonDAO<CyclesDTO, Long> {
	
	/**
	 * @Description:根据选择的周期获取这个周期的时间段
	 * @return CyclesDTO
	 */
	CyclesDTO findCyclesByChoose(@Param("cyclesDTO")CyclesDTO cyclesDTO);

}
