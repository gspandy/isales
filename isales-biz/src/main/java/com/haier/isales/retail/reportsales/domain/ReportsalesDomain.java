/**
 * @Company 青鸟软通   
 * @Title: ReportsalesDomain.java 
 * @Package com.haier.isales.retail.reportsales.domain 
 * @author John.zhao   
 * @date 2014年11月25日  19:37:44 
 * @version V1.0   
 */
package com.haier.isales.retail.reportsales.domain;

import java.io.Serializable;

/**
 * @ClassName: ReportsalesDomain
 * @Description: t_isales_sales_diary 自动生成的对应的实体对象
 * 2
 */
public class ReportsalesDomain implements Serializable {
	private static final long serialVersionUID = -1416915464967L;

	/**
	 * @Fields REPORTTYPE_BARCODE : 按条码提报
	 */
	public static final String REPORTTYPE_BARCODE = "101";

	/**
	 * @Fields REPORTTYPE_MODEL : 按型号提报
	 */
	public static final String REPORTTYPE_MODEL = "102";
	
	public static final String SHARE_TYPE_NEVER = "101"; //未分享 
	
	public static final String SHARE_TYPE_HAS = "102"; //已分享
	
	/** 
	* @Fields isAllowedToReportSales : 该员工是否允许提报销量
	*/ 
	private boolean ifAllowedToReportSales;
	/**
	 * @Fields id : id
	 */
	private Long id;
	/**
	 * @Fields ygid : 员工号
	 */
	private String ygid;
	/**
	 * @Fields gjtime : 购机日期（格式：2013-07-24）
	 */
	private String gjtime;
	/**
	 * @Fields fpnum : 发票号
	 */
	private String fpnum;
	/**
	 * @Fields cpzno : 产品组编号,按型号报销量时需要填值，按条码报销量不需要
	 */
	private String cpzno;
	/**
	 * @Fields cpzname : 产品组名称,按型号报销量时需要填值，按条码报销量不需要
	 */
	private String cpzname;
	/**
	 * @Fields producttype : 产品型号,按型号报销量时需要填值，按条码报销量不需要
	 */
	private String producttype;
	/**
	 * @Fields product : 产品型号编码,按型号报销量时需要填值，按条码报销量不需要
	 */
	private String product;
	/**
	 * @Fields counts : 产品数量,按型号报销量时需要填值，按条码报销量不需要
	 */
	private String counts;
	/**
	 * @Fields barcode : 按条码报销量时需要填值，按型号报销量不需要
	 */
	private String barcode;
	/**
	 * @Fields price : 按条码报销量时需要填值，按型号报销量不需要
	 */
	private String price;
	/**
	 * @Fields newprice : 销售价格
	 */
	private String newprice;
	/**
	 * @Fields present : 礼品
	 */
	private String present;
	/**
	 * @Fields presentnum : 礼品数
	 */
	private String presentnum;
	/**
	 * @Fields isyj : 是否样机 Y:是 N：否
	 */
	private String isyj;
	/**
	 * @Fields yhname : 用户姓名
	 */
	private String yhname;
	/**
	 * @Fields yhphone : 电话
	 */
	private String yhphone;
	/**
	 * @Fields shaddress : 送货地址
	 */
	private String shaddress;
	/**
	 * @Fields hishfresult : 回访结果
	 */
	private String hishfresult;
	/**
	 * @Fields padbj : PAD标记
	 */
	private String padbj;
	/**
	 * @Fields padimg : PAD图片
	 */
	private String padimg;
	/**
	 * @Fields haiermail : 海尔邮件
	 */
	private String haiermail;
	/**
	 * @Fields qykid : 权益卡号
	 */
	private String qykid;
	/**
	 * @Fields hyzc : 会员信息 HY_2：同意注册会员 HY_1：是会员 HY_3：不同意注册会员 0：不是会员
	 */
	private String hyzc;
	/**
	 * @Fields mdid : 门店编码
	 */
	private String mdid;
	/**
	 * @Fields mdname : 门店名称
	 */
	private String mdname;
	/**
	 * @Fields telephone : 固话
	 */
	private String telephone;
	/**
	 * @Fields lrfs : 调用ws传值的录入方式,（固定值 移动端为编号4）
	 */
	private String lrfs;
	/**
	 * @Fields reportType : 录入方式,按条码录入为101，按型号录入为102
	 */
	private String reportType;
	/**
	 * @Fields synchronousState : 同步状态，101未同步、102同步成功、103同步失败
	 */
	private String synchronousState;
	/**
	 * @Fields updateTime : 修改时间
	 */
	private java.util.Date updateTime;
	/**
	 * @Fields createTime : 添加时间
	 */
	private java.util.Date createTime;
	/**
	 * @Fields customerIdno :
	 */
	private String customerIdno;
	/**
	 * @Fields customerBirthday :
	 */
	private String customerBirthday;
	/**
	 * @Fields customerFeatures :
	 */
	private String customerFeatures;
	/**
	 * @Fields remark : 备注
	 */
	private String remark;
	/**
	 * @Fields synchronousResult : 同步结果，主要用在同步失败时存储错误信息
	 */
	private String synchronousResult;
	/**
	 * @Fields operatorId : 操作用户id,当前登录用户的id
	 */
	private Long operatorId;
	/**
	 * @Fields shareType : 分享状态，101：未分享；102：已分享
	 */
	private String shareType;
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
	
	/** 
	* @Fields status : 状态 , 101 正常 ,102 为注销
	*/ 
	private String status;

	/** 
	* @Fields ehubDataId : ehub返回的唯一主键 
	*/ 
	private String ehubDataId;
	
	private String prdn; //产品型号名称 
    private String categoryE;//产品组编码
    private String categoryEName;// 产品组名称
	/* =========================getter and setter =================== */

	public String getPrdn() {
        return prdn;
    }

    public void setPrdn(String prdn) {
        this.prdn = prdn;
    }

    public String getCategoryE() {
        return categoryE;
    }

    public void setCategoryE(String categoryE) {
        this.categoryE = categoryE;
    }

    public String getCategoryEName() {
        return categoryEName;
    }

    public void setCategoryEName(String categoryEName) {
        this.categoryEName = categoryEName;
    }

    /**
	 * @Description: 属性 id 的get方法
	 * @return id
	 */
	public Long getId() {
		return this.id;
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
	 * @return id
	 */
	public String getYgid() {
		return this.ygid;
	}

	/**
	 * @Description: 属性 ygid 的set方法
	 * @param id
	 */
	public void setYgid(String ygid) {
		this.ygid = ygid;
	}

	/**
	 * @Description: 属性 gjtime 的get方法
	 * @return id
	 */
	public String getGjtime() {
		return this.gjtime;
	}

	/**
	 * @Description: 属性 gjtime 的set方法
	 * @param id
	 */
	public void setGjtime(String gjtime) {
		this.gjtime = gjtime;
	}

	/**
	 * @Description: 属性 fpnum 的get方法
	 * @return id
	 */
	public String getFpnum() {
		return this.fpnum;
	}

	/**
	 * @Description: 属性 fpnum 的set方法
	 * @param id
	 */
	public void setFpnum(String fpnum) {
		this.fpnum = fpnum;
	}

	/**
	 * @Description: 属性 cpzno 的get方法
	 * @return id
	 */
	public String getCpzno() {
		return this.cpzno;
	}

	/**
	 * @Description: 属性 cpzno 的set方法
	 * @param id
	 */
	public void setCpzno(String cpzno) {
		this.cpzno = cpzno;
	}

	/**
	 * @Description: 属性 cpzname 的get方法
	 * @return id
	 */
	public String getCpzname() {
		return this.cpzname;
	}

	/**
	 * @Description: 属性 cpzname 的set方法
	 * @param id
	 */
	public void setCpzname(String cpzname) {
		this.cpzname = cpzname;
	}

	/**
	 * @Description: 属性 producttype 的get方法
	 * @return id
	 */
	public String getProducttype() {
		return this.producttype;
	}

	/**
	 * @Description: 属性 producttype 的set方法
	 * @param id
	 */
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	/**
	 * @Description: 属性 product 的get方法
	 * @return id
	 */
	public String getProduct() {
		return this.product;
	}

	/**
	 * @Description: 属性 product 的set方法
	 * @param id
	 */
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * @Description: 属性 counts 的get方法
	 * @return id
	 */
	public String getCounts() {
		return this.counts;
	}

	/**
	 * @Description: 属性 counts 的set方法
	 * @param id
	 */
	public void setCounts(String counts) {
		this.counts = counts;
	}

	/**
	 * @Description: 属性 barcode 的get方法
	 * @return id
	 */
	public String getBarcode() {
		return this.barcode;
	}

	/**
	 * @Description: 属性 barcode 的set方法
	 * @param id
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	/**
	 * @Description: 属性 price 的get方法
	 * @return id
	 */
	public String getPrice() {
		return this.price;
	}

	/**
	 * @Description: 属性 price 的set方法
	 * @param id
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @Description: 属性 newprice 的get方法
	 * @return id
	 */
	public String getNewprice() {
		return this.newprice;
	}

	/**
	 * @Description: 属性 newprice 的set方法
	 * @param id
	 */
	public void setNewprice(String newprice) {
		this.newprice = newprice;
	}

	/**
	 * @Description: 属性 present 的get方法
	 * @return id
	 */
	public String getPresent() {
		return this.present;
	}

	/**
	 * @Description: 属性 present 的set方法
	 * @param id
	 */
	public void setPresent(String present) {
		this.present = present;
	}

	/**
	 * @Description: 属性 presentnum 的get方法
	 * @return id
	 */
	public String getPresentnum() {
		return this.presentnum;
	}

	/**
	 * @Description: 属性 presentnum 的set方法
	 * @param id
	 */
	public void setPresentnum(String presentnum) {
		this.presentnum = presentnum;
	}

	/**
	 * @Description: 属性 isyj 的get方法
	 * @return id
	 */
	public String getIsyj() {
		return this.isyj;
	}

	/**
	 * @Description: 属性 isyj 的set方法
	 * @param id
	 */
	public void setIsyj(String isyj) {
		this.isyj = isyj;
	}

	/**
	 * @Description: 属性 yhname 的get方法
	 * @return id
	 */
	public String getYhname() {
		return this.yhname;
	}

	/**
	 * @Description: 属性 yhname 的set方法
	 * @param id
	 */
	public void setYhname(String yhname) {
		this.yhname = yhname;
	}

	/**
	 * @Description: 属性 yhphone 的get方法
	 * @return id
	 */
	public String getYhphone() {
		return this.yhphone;
	}

	/**
	 * @Description: 属性 yhphone 的set方法
	 * @param id
	 */
	public void setYhphone(String yhphone) {
		this.yhphone = yhphone;
	}

	/**
	 * @Description: 属性 shaddress 的get方法
	 * @return id
	 */
	public String getShaddress() {
		return this.shaddress;
	}

	/**
	 * @Description: 属性 shaddress 的set方法
	 * @param id
	 */
	public void setShaddress(String shaddress) {
		this.shaddress = shaddress;
	}

	/**
	 * @Description: 属性 hishfresult 的get方法
	 * @return id
	 */
	public String getHishfresult() {
		return this.hishfresult;
	}

	/**
	 * @Description: 属性 hishfresult 的set方法
	 * @param id
	 */
	public void setHishfresult(String hishfresult) {
		this.hishfresult = hishfresult;
	}

	/**
	 * @Description: 属性 padbj 的get方法
	 * @return id
	 */
	public String getPadbj() {
		return this.padbj;
	}

	/**
	 * @Description: 属性 padbj 的set方法
	 * @param id
	 */
	public void setPadbj(String padbj) {
		this.padbj = padbj;
	}

	/**
	 * @Description: 属性 padimg 的get方法
	 * @return id
	 */
	public String getPadimg() {
		return this.padimg;
	}

	/**
	 * @Description: 属性 padimg 的set方法
	 * @param id
	 */
	public void setPadimg(String padimg) {
		this.padimg = padimg;
	}

	/**
	 * @Description: 属性 haiermail 的get方法
	 * @return id
	 */
	public String getHaiermail() {
		return this.haiermail;
	}

	/**
	 * @Description: 属性 haiermail 的set方法
	 * @param id
	 */
	public void setHaiermail(String haiermail) {
		this.haiermail = haiermail;
	}

	/**
	 * @Description: 属性 qykid 的get方法
	 * @return id
	 */
	public String getQykid() {
		return this.qykid;
	}

	/**
	 * @Description: 属性 qykid 的set方法
	 * @param id
	 */
	public void setQykid(String qykid) {
		this.qykid = qykid;
	}

	/**
	 * @Description: 属性 hyzc 的get方法
	 * @return id
	 */
	public String getHyzc() {
		return this.hyzc;
	}

	/**
	 * @Description: 属性 hyzc 的set方法
	 * @param id
	 */
	public void setHyzc(String hyzc) {
		this.hyzc = hyzc;
	}

	/**
	 * @Description: 属性 mdid 的get方法
	 * @return id
	 */
	public String getMdid() {
		return this.mdid;
	}

	/**
	 * @Description: 属性 mdid 的set方法
	 * @param id
	 */
	public void setMdid(String mdid) {
		this.mdid = mdid;
	}

	/**
	 * @Description: 属性 mdname 的get方法
	 * @return id
	 */
	public String getMdname() {
		return this.mdname;
	}

	/**
	 * @Description: 属性 mdname 的set方法
	 * @param id
	 */
	public void setMdname(String mdname) {
		this.mdname = mdname;
	}

	/**
	 * @Description: 属性 telephone 的get方法
	 * @return id
	 */
	public String getTelephone() {
		return this.telephone;
	}

	/**
	 * @Description: 属性 telephone 的set方法
	 * @param id
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @Description: 属性 lrfs 的get方法
	 * @return id
	 */
	public String getLrfs() {
		return this.lrfs;
	}

	/**
	 * @Description: 属性 lrfs 的set方法
	 * @param id
	 */
	public void setLrfs(String lrfs) {
		this.lrfs = lrfs;
	}

	/**
	 * @Description: 属性 reportType 的get方法
	 * @return id
	 */
	public String getReportType() {
		return this.reportType;
	}

	/**
	 * @Description: 属性 reportType 的set方法
	 * @param id
	 */
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	/**
	 * @Description: 属性 synchronousState 的get方法
	 * @return id
	 */
	public String getSynchronousState() {
		return this.synchronousState;
	}

	/**
	 * @Description: 属性 synchronousState 的set方法
	 * @param id
	 */
	public void setSynchronousState(String synchronousState) {
		this.synchronousState = synchronousState;
	}

	/**
	 * @Description: 属性 updateTime 的get方法
	 * @return id
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}

	/**
	 * @Description: 属性 updateTime 的set方法
	 * @param id
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @Description: 属性 createTime 的get方法
	 * @return id
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}

	/**
	 * @Description: 属性 createTime 的set方法
	 * @param id
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @Description: 属性 customerIdno 的get方法
	 * @return id
	 */
	public String getCustomerIdno() {
		return this.customerIdno;
	}

	/**
	 * @Description: 属性 customerIdno 的set方法
	 * @param id
	 */
	public void setCustomerIdno(String customerIdno) {
		this.customerIdno = customerIdno;
	}

	/**
	 * @Description: 属性 customerBirthday 的get方法
	 * @return id
	 */
	public String getCustomerBirthday() {
		return this.customerBirthday;
	}

	/**
	 * @Description: 属性 customerBirthday 的set方法
	 * @param id
	 */
	public void setCustomerBirthday(String customerBirthday) {
		this.customerBirthday = customerBirthday;
	}

	/**
	 * @Description: 属性 customerFeatures 的get方法
	 * @return id
	 */
	public String getCustomerFeatures() {
		return this.customerFeatures;
	}
	public void setCustomerFeatures(String customerFeatures) {
		this.customerFeatures = customerFeatures;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSynchronousResult() {
		return this.synchronousResult;
	}

	public void setSynchronousResult(String synchronousResult) {
		this.synchronousResult = synchronousResult;
	}
	public Long getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	public String getShareType() {
		return this.shareType;
	}
	public void setShareType(String shareType) {
		this.shareType = shareType;
	}
	public boolean isIfAllowedToReportSales() {
		return ifAllowedToReportSales;
	}
	public void setIfAllowedToReportSales(boolean ifAllowedToReportSales) {
		this.ifAllowedToReportSales = ifAllowedToReportSales;
	}

	/**
	 * @Description: 属性 status 的get方法 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @Description: 属性 status 的set方法 
	 * @param status 
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @Description: 属性 ehubDataId 的get方法 
	 * @return ehubDataId
	 */
	public String getEhubDataId() {
		return ehubDataId;
	}

	/**
	 * @Description: 属性 ehubDataId 的set方法 
	 * @param ehubDataId 
	 */
	public void setEhubDataId(String ehubDataId) {
		this.ehubDataId = ehubDataId;
	}
	
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReportsalesDomain [ifAllowedToReportSales="
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
				+ synchronousState + ", updateTime=" + updateTime
				+ ", createTime=" + createTime + ", customerIdno="
				+ customerIdno + ", customerBirthday=" + customerBirthday
				+ ", customerFeatures=" + customerFeatures + ", remark="
				+ remark + ", synchronousResult=" + synchronousResult
				+ ", operatorId=" + operatorId + ", shareType=" + shareType
				+ ", istc=" + istc + ", tcfqr=" + tcfqr + ", province="
				+ province + ", provinceCode=" + provinceCode + ", city="
				+ city + ", cityCode=" + cityCode + ", area=" + area
				+ ", areaCode=" + areaCode + ", status=" + status
				+ ", ehubDataId=" + ehubDataId + "]";
	}
	
}
