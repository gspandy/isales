package com.haier.ihaier.util;

import java.util.ArrayList;
import java.util.List;

public class PersonDataDTO {
	private String eid;
	private int type;
	private List<String> array = new ArrayList<String>();

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<String> getArray() {
		return array;
	}

	public void setArray(List<String> array) {
		this.array = array;
	}

}
