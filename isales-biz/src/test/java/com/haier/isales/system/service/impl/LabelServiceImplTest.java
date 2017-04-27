package com.haier.isales.system.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.system.dto.LabelGroupDTO;
import com.haier.isales.system.label.domain.LabelDomain;
import com.haier.isales.system.label.service.LabelService;
@ContextConfiguration(locations={
		"classpath*:/spring/system/spring-label.xml"
})
public class LabelServiceImplTest extends BaseIsalesTestCase{
	@Resource
	private LabelService labelService;
	@Before
	public void init(){
		executeSqlScript("classpath:/com/haier/isales/system/LabelServiceImplTest.sql",true);
	}
	@Test
	public void testFindByParam() {
		LabelGroupDTO labelGroupDTO = new LabelGroupDTO();
		labelGroupDTO.setGroupId(-88888l);
		List<LabelDomain> lgList = labelService.findByGroupParam(labelGroupDTO);
		assertThat(lgList,notNullValue());
	}


}
