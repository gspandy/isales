package com.haier.isales.performance;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.haier.isales.common.DubboResult;
import com.haier.isales.performance.retail.dto.CyclesDTO;
import com.haier.isales.performance.retail.service.CyclesClient;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		/*基础部分*/
		"classpath*:/spring/spring-datasource.xml",
		"classpath*:/spring/spring-common.xml",
		"classpath*:/spring/spring-transaction.xml",
		"classpath*:/spring_service/spring-dubbo.xml",
		"classpath*:/spring_service/spring-monitorAOP.xml",
		/*引入部分*/
		"classpath*:/spring/performance/spring-retail.xml",
		"classpath*:/spring_service/performance/spring-retail-cycles-provider.xml"
		})
@Transactional
public class CyclesClientImplTest{

	@Resource
	private CyclesClient cyclesClient;
	
	@Test
	public void findCyclesByChooseTest(){
		CyclesDTO cyclesDTO=new CyclesDTO();
		cyclesDTO.setCycles("2");
//		CyclesDTO dto=(CyclesDTO) cyclesClient.findCyclesByChoose(cyclesDTO);
		DubboResult dubboResult=(DubboResult) cyclesClient.findCyclesByChoose(cyclesDTO);
		CyclesDTO dto=dubboResult.getResultBean();
		System.out.println(dto.getCycle_start()+"--"+dto.getCycle_end());
	}
}
