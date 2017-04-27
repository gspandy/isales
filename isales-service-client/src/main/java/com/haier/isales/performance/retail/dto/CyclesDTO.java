package com.haier.isales.performance.retail.dto;

import java.io.Serializable;

public class CyclesDTO implements Serializable{

	/**
	 * 周期实体类
	 */
	private static final long serialVersionUID = 1L;
	
	private Long ID;
	/*
	 * 周期类型
	 */
	private String cycles;
	/*
	 * 开始日期
	 */
	private int cycle_start;
	/*
	 * 结束日期
	 */
	private int cycle_end;
	/*
	 * 判断结果(保留字)
	 */
	private Boolean result;
	
	public String getCycles() {
		return cycles;
	}
	public void setCycles(String cycles) {
		this.cycles = cycles;
	}
	public int getCycle_start() {
		return cycle_start;
	}
	public void setCycle_start(int cycle_start) {
		this.cycle_start = cycle_start;
	}
	public int getCycle_end() {
		return cycle_end;
	}
	public void setCycle_end(int cycle_end) {
		this.cycle_end = cycle_end;
	}
	
	public Boolean getResult() {
        return result;
    }
    public void setResult(Boolean result) {
        this.result = result;
    }
    public Long getID() {
		return ID;
	}
	
	@Override
	public String toString() {
		return "CyclesDTO [ID=" + ID + ", cycles=" + cycles + ", cycle_start=" + cycle_start + ", cycle_end="
				+ cycle_end + ", result=" + result + "]";
	}

}
