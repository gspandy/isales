/**
 * @Company 青鸟软通   
 * @Title: ReportSalesServiceTest.java 
 * @Package com.haier.isales.retail.reportsales 
 * @author John Zhao   
 * @date 2014-11-11 下午8:00:06 
 * @version V1.0   
 */
package com.haier.isales.retail.reportsales;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.haier.isales.retail.reportsales.domain.ReportsalesDomain;
import com.haier.isales.retail.reportsave.service.SaveEmployeeRefSalesService;

/**
 * @ClassName: ReportSalesServiceTest
 * @Description:
 * 
 */
public class SaveSalesServiceTest extends BaseRetailTestCase {
	
	@Resource
	protected SaveEmployeeRefSalesService saveEmployeeRefSalesService;

	@Test
	@Rollback(false)
	public void testSaveSaleInfo() {
		ReportsalesDomain reportsalesDomain = new ReportsalesDomain();
//		String ygid = "Z0175868";
//		String mdId = "12B01";
//		String mdName = "福州中心";
//		String gjtime = "2014-11-25";
//		String cpzno = "DA";
//		String cpzname = "波轮洗衣机";
//		String producttype = "XQB65-Z828S 苏宁 (白)";
//		String product = "CB0K30B0M";
//		String counts = "1";
//		String newprice = "2600";
//		String isyj = "Y";
//		String yhname = "易招娣";
//		String yhphone = "13570901725";
//		String shaddress = "广东省广州市白云区黄石东路江夏小学附近";
//		
//		reportsalesDomain.setOperatorId(1L);
//		reportsalesDomain.setYgid(ygid);
//		reportsalesDomain.setMdid(mdId);
//		reportsalesDomain.setMdname(mdName);
//		reportsalesDomain.setGjtime(gjtime);
//		reportsalesDomain.setCpzno(cpzno);
//		reportsalesDomain.setCpzname(cpzname);
//		reportsalesDomain.setProducttype(producttype);
//		reportsalesDomain.setProduct(product);
//		reportsalesDomain.setCounts(counts);
//		reportsalesDomain.setNewprice(newprice);
//		reportsalesDomain.setIsyj(isyj);
//		reportsalesDomain.setYhname(yhname);
//		reportsalesDomain.setYhphone(yhphone);
//		reportsalesDomain.setShaddress(shaddress);
		saveEmployeeRefSalesService.saveSaleInfo(reportsalesDomain,"1","2","3");
	}

	@Test
	public void testReportSaleByBarCode() {
		ReportsalesDomain reportsalesDomain = new ReportsalesDomain();
		String ygid = "Z0175868";
		String gjtime = "2014-11-20";
		String barcode = "11111111";
		String hyzc = "HY_1";
		String newprice = "2600";
		String price = "3000";
		String isyj = "Y";
		String yhname = "易招娣";
		String yhphone = "13570901725";
		String shaddress = "广东省广州市白云区黄石东路江夏小学附近";
		String lrfs = "4";
		reportsalesDomain.setYgid(ygid);
		reportsalesDomain.setBarcode(barcode);
		reportsalesDomain.setGjtime(gjtime);
		reportsalesDomain.setHyzc(hyzc);
		reportsalesDomain.setPrice(price);
		reportsalesDomain.setNewprice(newprice);
		reportsalesDomain.setIsyj(isyj);
		reportsalesDomain.setYhname(yhname);
		reportsalesDomain.setYhphone(yhphone);
		reportsalesDomain.setShaddress(shaddress);
		reportsalesDomain.setLrfs(lrfs);
//		reportsalesService.saveReportSalesByBarCode(reportsalesDomain);
	}
}
