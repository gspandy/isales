package com.haier.isales.system.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import java.util.Arrays;

import javax.annotation.Resource;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.haier.isales.BaseIsalesTestCase;
import com.haier.isales.common.ScoreResult;
import com.haier.isales.system.account.domain.AccountDomain;
import com.haier.isales.system.account.service.AccountService;
@ContextConfiguration(locations={
		"classpath*:/hmc/hornetq/hmc-jms-hornetq.xml",
		"classpath*:/console/audit/console-audit.xml",
		"classpath*:/console/jms/console-jms-consumer.xml",
		"classpath*:/console/jms/console-jms-provider.xml",
		"classpath*:/spring/system/spring-*.xml",
		"classpath*:/spring/salerinfo/spring-*.xml",
		"classpath*:/spring_ws/portal/spring-systeminfo.xml",
		"classpath*:/spring/score/spring-*.xml"
})
public class AccountServiceImplTest extends BaseIsalesTestCase{
	@Resource
	protected AccountService accountService;
	@Before
	public void init(){
		executeSqlScript("classpath:/com/haier/isales/system/AccountServiceImplTest.sql", true);
	}
	@Test
	//@NotTransactional
	@Ignore
	public void testCheckLoginByNamePwd() {
		ScoreResult returnResult = accountService.checkLoginByNamePwd("AdmIn", "aA111111","2.5");
//		ScoreResult returnResult = accountService.checkLoginByNamePwd("A0003142", "aA111111");
//		ScoreResult returnResult = accountService.checkLoginByNamePwd("A0003183", "jbinfo1129");
		AccountDomain accountDomain = accountService.findByid(-999999999999L);
		assertThat(accountDomain,notNullValue());
		assertThat(returnResult,Matchers.nullValue());
	}
	@Test
	//@NotTransactional
	public void testSendMessage() {
		boolean createMessage = accountService.createMessage(Arrays.asList(new String[]{"13854203280","15224436786","15336396319"}), "测试短信asdfasdf ");
		assertThat(createMessage,notNullValue());
	}

//	@Test 
//	public void testBtbGoodBase() throws SQLException, UnsupportedEncodingException{
//		Connection conn = DbUtil.getConnection();
//		String sql = "select CATEGORY_E_NAME,  PRDN ,  CATEGORY_E ,  CATEGORY_E_NAME ," +
//				"  PRO_BRAND_NAME, MARK_DATE from isales_sys.btb_goodbase where PRODCODE = 'AA8T5W012'";
////		PreparedStatement pstm =  conn.prepareStatement(sql);
////		ResultSet result =  pstm.executeQuery(sql);
//		Statement st =  conn.createStatement();
//		ResultSet rs = st.executeQuery(sql);
//		if(rs.next()){			
//			String rsStr = rs.getString(1);
//			System.out.println("原字符："+rsStr);
//			System.out.println("修改后："+new String(rsStr.getBytes("iso-8859-1"), "gbk"));
//			
//		} 
//		DbUtil.closeConnection();
//	}

}
