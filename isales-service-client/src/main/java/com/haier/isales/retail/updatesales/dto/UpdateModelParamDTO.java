/**
 * @Company 青鸟软通   
 * @Title: UpdateModelParamDTO.java 
 * @Package com.haier.isales.retail.updatesales.dto 
 * @author John.zhao   
 * @date 2015-3-13 上午9:44:00 
 * @version V1.0   
 */
package com.haier.isales.retail.updatesales.dto;

import java.io.Serializable;


/**
 * @ClassName: UpdateModelParamDTO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class UpdateModelParamDTO implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 7079702072565030621L;
	
	private String sjcjlsid;
	private String ygid;
	private String gjtime;
	private String fpnum;
	private String product;
	private String price;
	private String newprice;
	private String counts;
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
	
	// province 省
	private String province;
	private String provinceCode;
	// city 市
	private String city;
	private String cityCode;
	// area 区
	private String area;
	private String areaCode;
	
	public String getIstc() {
		return istc;
	}
	public void setIstc(String istc) {
		this.istc = istc;
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
	public String getTcfqr() {
		return tcfqr;
	}
	public void setTcfqr(String tcfqr) {
		this.tcfqr = tcfqr;
	}
	/**
>>>>>>> .merge-right.r6324
	 * @Description: 属性 sjcjlsid 的get方法 
	 * @return sjcjlsid
	 */
	public String getSjcjlsid() {
		return sjcjlsid;
	}
	/**
	 * @Description: 属性 sjcjlsid 的set方法 
	 * @param sjcjlsid 
	 */
	public void setSjcjlsid(String sjcjlsid) {
		this.sjcjlsid = sjcjlsid;
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
	 * @Description: 属性 fpnum 的get方法 
	 * @return fpnum
	 */
	public String getFpnum() {
		return fpnum;
	}
	/**
	 * @Description: 属性 fpnum 的set方法 
	 * @param fpnum 
	 */
	public void setFpnum(String fpnum) {
		this.fpnum = fpnum;
	}
	/**
	 * @Description: 属性 product 的get方法 
	 * @return product
	 */
	public String getProduct() {
		return product;
	}
	/**
	 * @Description: 属性 product 的set方法 
	 * @param product 
	 */
	public void setProduct(String product) {
		this.product = product;
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
	 * @Description: 属性 counts 的get方法 
	 * @return counts
	 */
	public String getCounts() {
		return counts;
	}
	/**
	 * @Description: 属性 counts 的set方法 
	 * @param counts 
	 */
	public void setCounts(String counts) {
		this.counts = counts;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UpdateModelParamDTO [sjcjlsid=" + sjcjlsid + ", ygid=" + ygid
				+ ", gjtime=" + gjtime + ", fpnum=" + fpnum + ", product="
				+ product + ", price=" + price + ", newprice=" + newprice
				+ ", counts=" + counts + ", isyj=" + isyj + ", qykid=" + qykid
				+ ", yhname=" + yhname + ", yhphone=" + yhphone
				+ ", shaddress=" + shaddress + ", istc=" + istc + ", tcfqr="
				+ tcfqr + ", province=" + province + ", provinceCode="
				+ provinceCode + ", city=" + city + ", cityCode=" + cityCode
				+ ", area=" + area + ", areaCode=" + areaCode + "]";
	}
}
