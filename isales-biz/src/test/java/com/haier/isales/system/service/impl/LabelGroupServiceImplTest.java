package com.haier.isales.system.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import javax.annotation.Resource;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageResult;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.system.dto.LabelGroupDTO;
import com.haier.isales.system.labelgroup.domain.LabelGroupDomain;
import com.haier.isales.system.labelgroup.service.LabelGroupService;
@ContextConfiguration(locations = {
		"classpath*:/spring/system/spring-*.xml"
		})
public class LabelGroupServiceImplTest extends BaseIsalesTestCase{
	@Resource
	protected LabelGroupService labelGroupService;
	@Test
	public void testFindByParam() {
		LabelGroupDTO labelGroupDTO = new LabelGroupDTO();
		labelGroupDTO.setGroupId(1l);
		labelGroupDTO.setIsShared(true);
		PageResult<LabelGroupDomain> lgList = labelGroupService.findByParam(labelGroupDTO, new PageCond(1,Integer.MAX_VALUE));
		assertThat(lgList,notNullValue());
	}


}
