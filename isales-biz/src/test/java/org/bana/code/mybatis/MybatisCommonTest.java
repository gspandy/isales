/**
* @Company 青鸟软通   
* @Title: MybatisCommonTest.java 
* @Package org.bana.code.mybatis 
* @author Liu Wenjie   
* @date 2014-11-3 上午11:42:36 
* @version V1.0   
*/ 
package org.bana.code.mybatis;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.transaction.annotation.Transactional;

import com.haier.isales.system.role.dao.RoleDAO;
import com.haier.isales.system.role.domain.RoleDomain;

/** 
 * @ClassName: MybatisCommonTest 
 * @Description: 测试commonDao的生成效果 
 *  
 */
@ContextConfiguration(locations = { 
		"classpath*:/spring/spring-common.xml",
		"classpath*:/spring/spring-datasource.xml",
		"classpath*:/spring/spring-transaction.xml",
		"classpath*:/spring/system/spring-role.xml"
})
@Transactional
public class MybatisCommonTest extends AbstractTransactionalJUnit4SpringContextTests{
	@Resource
	private RoleDAO roleDao;
	
	@Before
	public void init(){
		executeSqlScript("classpath:/org/bana/code/mybatis/mybatisCommonTest.sql", true);
	}
	
	@Test
	public void testFindById(){
		RoleDomain role = roleDao.findById("test_code");
		Assert.assertNotNull(role);
		System.out.println(role);
	}
	
	@Test
	public void testCount(){
		Long count = roleDao.count();
		System.out.println(count);
	}
	
	@Test 
	public void testSave(){
		RoleDomain role = new RoleDomain();
		role.setRoleCode("test_role");
		role.setOperatorId(1L);
		role.setRoleName("nihao");
		role.setCreateTime(new Date());
		role.setStatus("101");
		roleDao.save(role);
		RoleDomain findById = roleDao.findById("test_role");
		Assert.assertNotNull(findById);
		System.out.println(findById);
	}
	
	@Test
	public void testUpdate(){
		RoleDomain role = roleDao.findById("test_code");
		role.setRoleName("testUpdateCode");
		int update = roleDao.update(role);
		System.out.println(update);
		RoleDomain findById = roleDao.findById("test_code");
		Assert.assertNotNull(findById);
		Assert.assertEquals("testUpdateCode", findById.getRoleName());
		System.out.println(findById);
	}
	
	@Test
	public void testDelete(){
		int delete = roleDao.delete("test_code");
		System.out.println(delete);
		RoleDomain findById = roleDao.findById("test_code");
		Assert.assertNull(findById);
	}
	
	@Test
	public void testFindByParams(){
		RoleDomain entity = new RoleDomain();
		entity.setRoleCode("t");
		//entity.setOperatorId(1L);
		//entity.setRoleName("nihao");
		//entity.setCreateTime(new Date());
		entity.setStatus("101");
		PageCond pageCond = new PageCond();
		PageCondUtil.calculateX(pageCond);
		List<RoleDomain> findByParams = roleDao.findByParams(entity, pageCond);
		int params = roleDao.findCountByParams(entity);
		Assert.assertEquals(params, findByParams.size());
		for (RoleDomain roleDomain : findByParams) {
			Assert.assertEquals("101", roleDomain.getStatus());
			Assert.assertTrue(roleDomain.getRoleCode().contains("t"));
			System.out.println(roleDomain);
		}
	}
	
	@Test
	public void testExtendsMethod(){
//		RoleDomain entity = new RoleDomain();
//		entity.setRoleCode("t");
//		//entity.setOperatorId(1L);
//		//entity.setRoleName("nihao");
//		//entity.setCreateTime(new Date());
//		entity.setStatus("101");
//		PageCond pageCond = new PageCond();
//		PageCondUtil.calculateX(pageCond);
//		roleDao.findByParamsExt(entity, pageCond);
//		List<RoleDomain> findByParams = roleDao.findByParamsExt(entity, pageCond);
//		int params = roleDao.findCountByParams(entity, pageCond);
//		Assert.assertEquals(params, findByParams.size());
//		for (RoleDomain roleDomain : findByParams) {
//			Assert.assertEquals("101", roleDomain.getStatus());
//			Assert.assertTrue(roleDomain.getRoleCode().contains("t"));
//			System.out.println(roleDomain);
//		}
	}
}
