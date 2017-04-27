/**
 * @Company 青鸟软通   
 * @Title: ReportSalesDTO.java 
 * @Package com.haier.isales.retail.reportsales.dto 
 * @author John Zhao   
 * @date 2014-11-11 下午10:47:16 
 * @version V1.0   
 */
package com.haier.isales.retail.reportsales.dto;

import java.io.Serializable;

/**
 * @ClassName: ReportSalesDTO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class ReportSalesDTO implements Serializable {

	private static final long serialVersionUID = -8288296653367867537L;

	private boolean ifAllowedToReportSales;	//该员工是否允许提报销量
	
	private String ifAllowedToReportSalesMsg;	//该员工是否允许提报销量 具体的信息

	private Long id;	//主键

	private String ygid;	//员工号

	private String gjtime;	//购机日期（格式：2013-07-24）

	private String fpnum;	//发票号

	private String cpzno;	//产品组编号,按型号报销量时需要填值，按条码报销量不需要

	private String cpzname;	//产品组名称,按型号报销量时需要填值，按条码报销量不需要

	private String producttype;	//产品型号,按型号报销量时需要填值，按条码报销量不需要

	private String product;	//产品型号编码,按型号报销量时需要填值，按条码报销量不需要

	private String counts;	//产品数量,按型号报销量时需要填值，按条码报销量不需要

	private String barcode;	//按条码报销量时需要填值，按型号报销量不需要

	private String price;	//按条码报销量时需要填值，按型号报销量不需要

	private String newprice;	//销售价格

	private String present;	//礼品

	private String presentnum;	//礼品数

	private String isyj;	//是否样机 Y:是 N：否

	private String yhname;	//用户姓名

	private String yhphone;	//电话

	private String shaddress;	//送货地址

	private String hishfresult;	//回访结果

	private String padbj;	//PAD标记

	private String padimg;	//PAD图片

	private String haiermail;	//海尔邮件

	private String qykid;	//权益卡号

	private String hyzc;	//会员信息 HY_2：同意注册会员 HY_1：是会员 HY_3：不同意注册会员 0：不是会员

	private String mdid;	//门店编码

	private String mdname;	//门店名称

	private String telephone;	// 固话

	private String lrfs;	//调用ws传值的录入方式,（固定值 移动端为编号4）

	private String reportType;	//录入方式,按条码录入为101，按型号录入为102

	private String synchronousState;	//同步状态，101未同步、102同步成功、103同步失败

	private java.util.Date updateTime;	//修改时间

	private java.util.Date createTime;	//添加时间

	private String customerIdno;	//客户身份证号

	private String customerBirthday;	//客户生日

	private String customerFeatures;	//客户特征

	private String remark;	//备注

	private String synchronousResult;	//同步结果，主要用在同步失败时存储错误信息

	private Long operatorId;	//操作用户id,当前登录用户的id

	private String shareType;	//分享状态，101：未分享；102：已分享

	private String istc;	//是否套餐，1是  0不是

	private String tcfqr;	//套餐发起人，如果istc为是，则发起人需要填值
	
	// 添加省市区属性
	// 省 province
	private String province;
	private String provinceCode;
	
	// 市 city
	private String city;
	private String cityCode;
	// 区
	private String area;
	private String areaCode;
	
	/*===============getters & setters================*/
	
	/**
	 * @Description: 属性 ifAllowedToReportSales 的get方法 
	 * @return ifAllowedToReportSales
	 */
	public boolean isIfAllowedToReportSales() {
		return ifAllowedToReportSales;
	}
	/**
	 * @Description: 属性 ifAllowedToReportSales 的set方法 
	 * @param ifAllowedToReportSales 
	 */
	public void setIfAllowedToReportSales(boolean ifAllowedToReportSales) {
		this.ifAllowedToReportSales = ifAllowedToReportSales;
	}
	/**
	 * @Description: 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @Description: 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @Description: 属性 cpzno 的get方法 
	 * @return cpzno
	 */
	public String getCpzno() {
		return cpzno;
	}
	/**
	 * @Description: 属性 cpzno 的set方法 
	 * @param cpzno 
	 */
	public void setCpzno(String cpzno) {
		this.cpzno = cpzno;
	}
	/**
	 * @Description: 属性 cpzname 的get方法 
	 * @return cpzname
	 */
	public String getCpzname() {
		return cpzname;
	}
	/**
	 * @Description: 属性 cpzname 的set方法 
	 * @param cpzname 
	 */
	public void setCpzname(String cpzname) {
		this.cpzname = cpzname;
	}
	/**
	 * @Description: 属性 producttype 的get方法 
	 * @return producttype
	 */
	public String getProducttype() {
		return producttype;
	}
	/**
	 * @Description: 属性 producttype 的set方法 
	 * @param producttype 
	 */
	public void setProducttype(String producttype) {
		this.producttype = producttype;
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
	 * @Description: 属性 barcode 的get方法 
	 * @return barcode
	 */
	public String getBarcode() {
		return barcode;
	}
	/**
	 * @Description: 属性 barcode 的set方法 
	 * @param barcode 
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
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
	 * @Description: 属性 present 的get方法 
	 * @return present
	 */
	public String getPresent() {
		return present;
	}
	/**
	 * @Description: 属性 present 的set方法 
	 * @param present 
	 */
	public void setPresent(String present) {
		this.present = present;
	}
	/**
	 * @Description: 属性 presentnum 的get方法 
	 * @return presentnum
	 */
	public String getPresentnum() {
		return presentnum;
	}
	/**
	 * @Description: 属性 presentnum 的set方法 
	 * @param presentnum 
	 */
	public void setPresentnum(String presentnum) {
		this.presentnum = presentnum;
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
	/**
	 * @Description: 属性 hishfresult 的get方法 
	 * @return hishfresult
	 */
	public String getHishfresult() {
		return hishfresult;
	}
	/**
	 * @Description: 属性 hishfresult 的set方法 
	 * @param hishfresult 
	 */
	public void setHishfresult(String hishfresult) {
		this.hishfresult = hishfresult;
	}
	/**
	 * @Description: 属性 padbj 的get方法 
	 * @return padbj
	 */
	public String getPadbj() {
		return padbj;
	}
	/**
	 * @Description: 属性 padbj 的set方法 
	 * @param padbj 
	 */
	public void setPadbj(String padbj) {
		this.padbj = padbj;
	}
	/**
	 * @Description: 属性 padimg 的get方法 
	 * @return padimg
	 */
	public String getPadimg() {
		return padimg;
	}
	/**
	 * @Description: 属性 padimg 的set方法 
	 * @param padimg 
	 */
	public void setPadimg(String padimg) {
		this.padimg = padimg;
	}
	/**
	 * @Description: 属性 haiermail 的get方法 
	 * @return haiermail
	 */
	public String getHaiermail() {		return haiermail;	}
	/**
	 * @Description: 属性 haiermail 的set方法 
	 * @param haiermail 
	 */
	public void setHaiermail(String haiermail) {		this.haiermail = haiermail;	}
	/**
	 * @Description: 属性 qykid 的get方法 
	 * @return qykid
	 */
	public String getQykid() {		return qykid;	}
	/**
	 * @Description: 属性 qykid 的set方法 
	 * @param qykid 
	 */
	public void setQykid(String qykid) {		this.qykid = qykid;	}
	/**
	 * @Description: 属性 hyzc 的get方法 
	 * @return hyzc
	 */
	public String getHyzc() {		return hyzc;	}
	/**
	 * @Description: 属性 hyzc 的set方法 
	 * @param hyzc 
	 */
	public void setHyzc(String hyzc) {		this.hyzc = hyzc;	}
	/**
	 * @Description: 属性 mdid 的get方法 
	 * @return mdid
	 */
	public String getMdid() {		return mdid;	}
	/**
	 * @Description: 属性 mdid 的set方法 
	 * @param mdid 
	 */
	public void setMdid(String mdid) {		this.mdid = mdid;	}
	/**
	 * @Description: 属性 mdname 的get方法 
	 * @return mdname
	 */
	public String getMdname() {		return mdname;	}
	/**
	 * @Description: 属性 mdname 的set方法 
	 * @param mdname 
	 */
	public void setMdname(String mdname) {		this.mdname = mdname;	}
	/**
	 * @Description: 属性 telephone 的get方法 
	 * @return telephone
	 */
	public String getTelephone() {		return telephone;	}
	/**
	 * @Description: 属性 telephone 的set方法 
	 * @param telephone 
	 */
	public void setTelephone(String telephone) {		this.telephone = telephone;	}
	/**
	 * @Description: 属性 lrfs 的get方法 
	 * @return lrfs
	 */
	public String getLrfs() {		return lrfs;	}
	/**
	 * @Description: 属性 lrfs 的set方法 
	 * @param lrfs 
	 */
	public void setLrfs(String lrfs) {		this.lrfs = lrfs;	}
	/**
	 * @Description: 属性 reportType 的get方法 
	 * @return reportType
	 */
	public String getReportType() {		return reportType;	}
	/**
	 * @Description: 属性 reportType 的set方法 
	 * @param reportType 
	 */
	public void setReportType(String reportType) {		this.reportType = reportType;	}
	/**
	 * @Description: 属性 synchronousState 的get方法 
	 * @return synchronousState
	 */
	public String getSynchronousState() {		return synchronousState;	}
	/**
	 * @Description: 属性 synchronousState 的set方法 
	 * @param synchronousState 
	 */
	public void setSynchronousState(String synchronousState) {		this.synchronousState = synchronousState;	}
	/**
	 * @Description: 属性 updateTime 的get方法 
	 * @return updateTime
	 */
	public java.util.Date getUpdateTime() {		return updateTime;	}
	/**
	 * @Description: 属性 updateTime 的set方法 
	 * @param updateTime 
	 */
	public void setUpdateTime(java.util.Date updateTime) {		this.updateTime = updateTime;	}
	/**
	 * @Description: 属性 createTime 的get方法 
	 * @return createTime
	 */
	public java.util.Date getCreateTime() {		return createTime;	}
	/**
	 * @Description: 属性 createTime 的set方法 
	 * @param createTime 
	 */
	public void setCreateTime(java.util.Date createTime) {		this.createTime = createTime;	}
	/**
	 * @Description: 属性 customerIdno 的get方法 
	 * @return customerIdno
	 */
	public String getCustomerIdno() {		return customerIdno;	}
	/**
	 * @Description: 属性 customerIdno 的set方法 
	 * @param customerIdno 
	 */
	public void setCustomerIdno(String customerIdno) {		this.customerIdno = customerIdno;	}
	/**
	 * @Description: 属性 customerBirthday 的get方法 
	 * @return customerBirthday
	 */
	public String getCustomerBirthday() {		return customerBirthday;	}
	/**
	 * @Description: 属性 customerBirthday 的set方法 
	 * @param customerBirthday 
	 */
	public void setCustomerBirthday(String customerBirthday) {		this.customerBirthday = customerBirthday;	}
	/**
	 * @Description: 属性 customerFeatures 的get方法 
	 * @return customerFeatures
	 */
	public String getCustomerFeatures() {		return customerFeatures;	}
	/**
	 * @Description: 属性 customerFeatures 的set方法 
	 * @param customerFeatures 
	 */
	public void setCustomerFeatures(String customerFeatures) {		this.customerFeatures = customerFeatures;	}
	/**
	 * @Description: 属性 remark 的get方法 
	 * @return remark
	 */
	public String getRemark() {		return remark;	}
	/**
	 * @Description: 属性 remark 的set方法 
	 * @param remark 
	 */
	public void setRemark(String remark) {		this.remark = remark;	}
	/**
	 * @Description: 属性 synchronousResult 的get方法 
	 * @return synchronousResult
	 */
	public String getSynchronousResult() {		return synchronousResult;	}
	/**
	 * @Description: 属性 synchronousResult 的set方法 
	 * @param synchronousResult 
	 */
	public void setSynchronousResult(String synchronousResult) {		this.synchronousResult = synchronousResult;	}
	/**
	 * @Description: 属性 operatorId 的get方法 
	 * @return operatorId
	 */
	public Long getOperatorId() {		return operatorId;	}
	/**
	 * @Description: 属性 operatorId 的set方法 
	 * @param operatorId 
	 */
	public void setOperatorId(Long operatorId) {		this.operatorId = operatorId;	}
	/**
	 * @Description: 属性 shareType 的get方法 
	 * @return shareType
	 */
	public String getShareType() {		return shareType;	}
	/**
	 * @Description: 属性 shareType 的set方法 
	 * @param shareType 
	 */
	public void setShareType(String shareType) {		this.shareType = shareType;	}
		
	/**
	 * @Description: 属性 ifAllowedToReportSalesMsg 的get方法 
	 * @return ifAllowedToReportSalesMsg
	 */
	public String getIfAllowedToReportSalesMsg() {		return ifAllowedToReportSalesMsg;	}
	/**
	 * @Description: 属性 ifAllowedToReportSalesMsg 的set方法 
	 * @param ifAllowedToReportSalesMsg 
	 */
	public void setIfAllowedToReportSalesMsg(String ifAllowedToReportSalesMsg) {		this.ifAllowedToReportSalesMsg = ifAllowedToReportSalesMsg;	}
	
	
	public String getIstc() {		return istc;	}
	public void setIstc(String istc) {		this.istc = istc;	}
	
	public String getTcfqr() {		return tcfqr;	}
	public void setTcfqr(String tcfqr) {		this.tcfqr = tcfqr;}
	
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

	/*======================toString======================*/
	
	/**
	* <p>Description: ReportSalesDTO自动生成的toString方法</p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:10:02 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "ReportSalesDTO [ifAllowedToReportSales="
				+ ifAllowedToReportSales + ", id=" + id + ", ygid=" + ygid
				+ ", gjtime=" + gjtime + ", fpnum=" + fpnum + ", cpzno="
				+ cpzno + ", cpzname=" + cpzname + ", producttype="
				+ producttype + ", product=" + product + ", counts=" + counts
				+ ", barcode=" + barcode + ", price=" + price + ", newprice="
				+ newprice + ", present=" + present + ", presentnum="
				+ presentnum + ", isyj=" + isyj + ", yhname=" + yhname
				+ ", yhphone=" + yhphone + ", shaddress=" + shaddress
				+ ", hishfresult=" + hishfresult + ", padbj=" + padbj
				+ ", padimg=" + padimg + ", haiermail=" + haiermail
				+ ", qykid=" + qykid + ", hyzc=" + hyzc + ", mdid=" + mdid
				+ ", mdname=" + mdname + ", telephone=" + telephone + ", lrfs="
				+ lrfs + ", reportType=" + reportType + ", synchronousState="
				+ synchronousState + ", customerIdno="
				+ customerIdno + ", customerBirthday=" + customerBirthday
				+ ", customerFeatures=" + customerFeatures + ", remark="
				+ remark + ", synchronousResult=" + synchronousResult
				+ ", operatorId=" + operatorId + ", shareType=" + shareType
				+ ", istc= " + istc + ",tcfqr= " + tcfqr + ", provinceCode="
				+ provinceCode + ", cityCode=" + cityCode + ", areaCode=" + areaCode + "]";
	}
}
