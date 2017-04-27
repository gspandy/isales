/**
 * @Company 青鸟软通   
 * @Title: UpdateBarCodeParamDTO.java 
 * @Package com.haier.isales.retail.updatesales.dto 
 * @author John.zhao   
 * @date 2015-3-13 上午9:44:46 
 * @version V1.0   
 */
package com.haier.isales.retail.updatesales.dto;

import java.io.Serializable;

/**
 * @ClassName: UpdateBarCodeParamDTO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class UpdateBarCodeParamDTO implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1379379380033142738L;

	private String sjcjid;
	private String ygid;
	private String gjtime;
	private String price;
	private String newprice;
	private String isyj;
	private String qykid;
	private String yhname;
	private String yhphone;
	private String shaddress;
	/**
	 * @Fields istc : 是否套餐，1是  0不是
	 */
	private String istc;
	/**
	 * @Fields tcfqr : 套餐发起人，如果istc为是，则发起人需要填值
	 */
	private String tcfqr;
	// 添加省市区属性  added by lizhenwei 2015-12-09
	// 省 province
	private String province;
	private String provinceCode;
	
	// 市 city
	private String city;
	private String cityCode;
	
	// 区
	private String area;
	private String areaCode;
	
	public String getIstc() {
		return istc;
	}
	public void setIstc(String istc) {
		this.istc = istc;
	}
	public String getTcfqr() {
		return tcfqr;
	}
	public void setTcfqr(String tcfqr) {
		this.tcfqr = tcfqr;
	}
	/**
>>>>>>> .merge-right.r6324
	 * @Description: 属性 sjcjid 的get方法 
	 * @return sjcjid
	 */
	public String getSjcjid() {
		return sjcjid;
	}
	/**
	 * @Description: 属性 sjcjid 的set方法 
	 * @param sjcjid 
	 */
	public void setSjcjid(String sjcjid) {
		this.sjcjid = sjcjid;
	}
	/**
	 * @Description: 属性 ygid 的get方法 
	 * @return ygid
	 */
	public String getYgid() {
		return ygid;
	}
	/**
	 * @Description: 属性 ygid 的set方法 
	 * @param ygid 
	 */
	public void setYgid(String ygid) {
		this.ygid = ygid;
	}
	/**
	 * @Description: 属性 gjtime 的get方法 
	 * @return gjtime
	 */
	public String getGjtime() {
		return gjtime;
	}
	/**
	 * @Description: 属性 gjtime 的set方法 
	 * @param gjtime 
	 */
	public void setGjtime(String gjtime) {
		this.gjtime = gjtime;
	}
	/**
	 * @Description: 属性 price 的get方法 
	 * @return price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @Description: 属性 price 的set方法 
	 * @param price 
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @Description: 属性 newprice 的get方法 
	 * @return newprice
	 */
	public String getNewprice() {
		return newprice;
	}
	/**
	 * @Description: 属性 newprice 的set方法 
	 * @param newprice 
	 */
	public void setNewprice(String newprice) {
		this.newprice = newprice;
	}
	/**
	 * @Description: 属性 isyj 的get方法 
	 * @return isyj
	 */
	public String getIsyj() {
		return isyj;
	}
	/**
	 * @Description: 属性 isyj 的set方法 
	 * @param isyj 
	 */
	public void setIsyj(String isyj) {
		this.isyj = isyj;
	}
	/**
	 * @Description: 属性 qykid 的get方法 
	 * @return qykid
	 */
	public String getQykid() {
		return qykid;
	}
	/**
	 * @Description: 属性 qykid 的set方法 
	 * @param qykid 
	 */
	public void setQykid(String qykid) {
		this.qykid = qykid;
	}
	/**
	 * @Description: 属性 yhname 的get方法 
	 * @return yhname
	 */
	public String getYhname() {
		return yhname;
	}
	/**
	 * @Description: 属性 yhname 的set方法 
	 * @param yhname 
	 */
	public void setYhname(String yhname) {
		this.yhname = yhname;
	}
	/**
	 * @Description: 属性 yhphone 的get方法 
	 * @return yhphone
	 */
	public String getYhphone() {
		return yhphone;
	}
	/**
	 * @Description: 属性 yhphone 的set方法 
	 * @param yhphone 
	 */
	public void setYhphone(String yhphone) {
		this.yhphone = yhphone;
	}
	/**
	 * @Description: 属性 shaddress 的get方法 
	 * @return shaddress
	 */
	public String getShaddress() {
		return shaddress;
	}
	/**
	 * @Description: 属性 shaddress 的set方法 
	 * @param shaddress 
	 */
	public void setShaddress(String shaddress) {
		this.shaddress = shaddress;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return the provinceCode
	 */
	public String getProvinceCode() {
		return provinceCode;
	}
	/**
	 * @param provinceCode the provinceCode to set
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	/**
	 * @return the cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/**
	 * @return the areaCode
	 */
	public String getAreaCode() {
		return areaCode;
	}
	/**
	 * @param areaCode the areaCode to set
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UpdateBarCodeParamDTO [sjcjid=" + sjcjid + ", ygid=" + ygid
				+ ", gjtime=" + gjtime + ", price=" + price + ", newprice="
				+ newprice + ", isyj=" + isyj + ", qykid=" + qykid
				+ ", yhname=" + yhname + ", yhphone=" + yhphone
				+ ", shaddress=" + shaddress + ", istc=" + istc + ", tcfqr="
				+ tcfqr + ", province=" + province + ", provinceCode="
				+ provinceCode + ", city=" + city + ", cityCode=" + cityCode
				+ ", area=" + area + ", areaCode=" + areaCode + "]";
	}

}
