/**
 * @Company 青鸟软通   
 * @Title: ReportSalesServiceTest.java 
 * @Package com.haier.isales.retail.reportsales 
 * @author John Zhao   
 * @date 2014-11-11 下午8:00:06 
 * @version V1.0   
 */
package com.haier.isales.retail.reportsales;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.annotation.NotTransactional;

import com.haier.isales.common.ScoreResult;
import com.haier.isales.retail.reportsales.domain.ReportsalesDomain;
import com.haier.isales.retail.reportsales.dto.ReportSalesDTO;
import com.haier.isales.retail.reportsales.service.ReportsalesService;
import com.haier.isales.retail.reportsales.service.impl.ReportsalesServiceImpl;
import com.haier.isales.retail.searchsales.dto.SearchModelSalesDTO;
import com.haier.isales.score.dto.ScoreDTO;

/**
 * @ClassName: ReportSalesServiceTest
 * @Description:
 * 
 */
public class ReportSalesServiceTest extends BaseRetailTestCase {
    
    @Resource
    protected ReportsalesService reportsalesService;

	@Test
	@NotTransactional
	@Ignore
	public void testUpdateReportType() {
		String[] barCodes = new String[] { 
//				"CB0K4A00000PBD3D0686", 
				"CB0K4A00000PBD3D0686", 
				//"AA9XS306U00X3E7E1065",
				"BK0Y05M9800YHE73M7A6" 
				//"BK0Y05M9800YHE73M7A6"
				//"CE0JW900H00PCE4A0026"
				//"AA9DB700000A7D940032", 
				//"GA0RQC00800G6E5E0167", 
				};
		for (String barCode : barCodes) {
			reportsalesService.updateReportType(barCode);
		}
	}

	@Test
	public void testReportSalesByModel() {
		ReportsalesDomain reportsalesDomain = new ReportsalesDomain();
		String ygid = "Z0175868";
		String mdId = "12B01";
		String mdName = "福州中心";
		String gjtime = "2014-11-25";
		String cpzno = "DA";
		String cpzname = "波轮洗衣机";
		String producttype = "XQB65-Z828S 苏宁 (白)";
		String product = "CB0K30B0M";
		String counts = "1";
		String newprice = "2600";
		String isyj = "Y";
		String yhname = "易招娣";
		String yhphone = "13570901725";
		String shaddress = "广东省广州市白云区黄石东路江夏小学附近";
		reportsalesDomain.setOperatorId(1L);
		reportsalesDomain.setYgid(ygid);
		reportsalesDomain.setMdid(mdId);
		reportsalesDomain.setMdname(mdName);
		reportsalesDomain.setGjtime(gjtime);
		reportsalesDomain.setCpzno(cpzno);
		reportsalesDomain.setCpzname(cpzname);
		reportsalesDomain.setProducttype(producttype);
		reportsalesDomain.setProduct(product);
		reportsalesDomain.setCounts(counts);
		reportsalesDomain.setNewprice(newprice);
		reportsalesDomain.setIsyj(isyj);
		reportsalesDomain.setYhname(yhname);
		reportsalesDomain.setYhphone(yhphone);
		reportsalesDomain.setShaddress(shaddress);
		ScoreResult scoreResult = reportsalesService.saveReportSalesByModel(reportsalesDomain);
		System.out.println(scoreResult);
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
		reportsalesService.saveReportSalesByBarCode(reportsalesDomain);
	}

	@Test
	public void testSearchModelSales() {
		SearchModelSalesDTO searchModelSalesDTO = new SearchModelSalesDTO();
		searchModelSalesDTO.setYgId("Z0175868");
		searchModelSalesDTO.setStart(0);
		searchModelSalesDTO.setLimit(10);
		List<ReportSalesDTO> pr = (List<ReportSalesDTO>) reportsalesService.searchModelSales(searchModelSalesDTO);
		Assert.assertNotNull(pr);
	}
}
