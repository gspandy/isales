/**
 * @Company 青鸟软通   
 * @Title: RegexUtil.java 
 * @Package com.haier.isales.common 
 * @author Guo Yuchao   
 * @date 2014-11-28 下午4:21:52 
 * @version V1.0   
 */
package com.haier.isales.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bana.common.util.basic.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;

/**
 * @ClassName: RegexUtil
 * @Description: 字符串验证工具类
 * 
 */
public class RegexUtil {
	private static final Logger LOGGER = LoggerFactory.getLogger(RegexUtil.class);
	/** 
	* @ClassName: RegexTypeEnum 
	* @Description:  
	*  
	*/ 
	public enum RegexTypeEnum {

		  reg_sensitive_word("(我擦)|(我日)|(贱人)|(fuck)", "剔除敏感字符")
		, reg_ip_address("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}", "ip验证规则，例如：10.135.2.117")
		, reg_host_port("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\s*:\\s*\\d+", "ip和端口验证规则，例如：10.135.2.117:8080")
		, reg_email("[\\S]+@[\\w\\._-]+\\.[\\w]+", "邮箱验证规则，例如：isales@haier.com")
		, reg_identity_card("([\\d]{14}[X\\d])|([\\d]{17}[X\\d])", "身份证验证规则，例如：isales@haier.com")
		, reg_digital_pattern("[+-]?(((\\d{1,3})(,(\\d{3}))*)|(\\d+))(\\.\\d+)?", "验证数值格式 支持千分位")
		, reg_money_pattern("[\\$\\￥]?[+-]?(((\\d{1,3})(,(\\d{3}))*)|(\\d+))(\\.\\d+)?", "验证货币格式 支持RMB￥和美元$，千分位");

		private String regexKey;
		private String description;

		private RegexTypeEnum(String regexKey, String description) {
			this.regexKey = regexKey;
			this.description = description;
		}

		/**
		 * @Description:
		 * @author Guo Yuchao
		 * @date 2014-11-28 下午5:18:12
		 * @return
		 */
		public String getRegexKey() {
			return regexKey;
		}

		/**
		 * @Description: 属性 description 的get方法
		 * @return description
		 */
		public String getDescription() {
			return description;
		}
	}

	/**
	 * @Description: 正则表达式编译 并验证字符串共用函数
	 * @author Guo Yuchao
	 * @date 2014-11-28 下午5:37:06
	 * @param target
	 * @param reg
	 * @return
	 */
	public static boolean validateStringUseRegex(String target, String reg) {
		// ①构造一个模式.
		Pattern pattern = Pattern.compile(reg);
		// ②建造一个匹配器
		Matcher m = pattern.matcher(target);
		// ③进行判断，得到结果
		boolean result = m.matches();
		return result;
	}
	/** 
	* @Description: 验证target 字符串中是否含有 reg字符串
	* @author Guo Yuchao   
	* @date 2014-11-28 下午7:38:25 
	* @param target
	* @param reg
	* @return  
	*/ 
	public static boolean findIfStringContainsReg(String target, String reg) {
		// ①构造一个模式.
		Pattern pattern = Pattern.compile(reg);
		// ②建造一个匹配器
		Matcher m = pattern.matcher(target);
		// ③进行判断，得到结果
		boolean result = m.find();
		return result;
	}

	/** 
	* @Description: 验证ip
	* @author Guo Yuchao   
	* @date 2014-11-28 下午7:20:17 
	* @param ipStr  
	*/ 
	public static void validateIpHost(String ipStr){
		if(StringUtils.isEmpty(ipStr)){
			throw new BusinessException(BusinessExceptionCode.param_error,"ip不能为空");
		}
		boolean result = validateStringUseRegex(ipStr, RegexTypeEnum.reg_ip_address.getRegexKey());
		if(!result){
			throw new BusinessException(BusinessExceptionCode.param_error,"ip输入格式错误");
		}
	}
	
	/** 
	* @Description:ip和端口    
	* @author Guo Yuchao   
	* @date 2014-11-28 下午7:24:11 
	* @param hostStr  
	*/ 
	public static void validateHostWithPort(String hostStr){
		if(StringUtils.isEmpty(hostStr)){
			throw new BusinessException(BusinessExceptionCode.param_error,"ip不能为空");
		}
		boolean result = validateStringUseRegex(hostStr, RegexTypeEnum.reg_host_port.getRegexKey());
		if(!result){
			throw new BusinessException(BusinessExceptionCode.param_error,"ip输入格式错误");
		}
	}
	/** 
	* @Description: 验证货币格式 支持RMB￥和美元$
	* @author Guo Yuchao   
	* @date 2014-11-28 下午8:10:45 
	* @param moneyPattern  
	*/ 
	public static void validateMoneyPattern(String moneyPattern){
		if(StringUtils.isEmpty(moneyPattern)){
			throw new BusinessException(BusinessExceptionCode.param_error,"金额不能为空");
		}
		boolean result = validateStringUseRegex(moneyPattern, RegexTypeEnum.reg_money_pattern.getRegexKey());
		if(!result){
			throw new BusinessException(BusinessExceptionCode.param_error,"金额格式错误");
		}
	}
	/** 
	* @Description: 验证数值格式 支持千分位
	* @author Guo Yuchao   
	* @date 2014-11-29 下午3:03:32 
	* @param digitalPattern  
	*/ 
	public static void validateDigitalPattern(String digitalPattern){
		if(StringUtils.isEmpty(digitalPattern)){
			throw new BusinessException(BusinessExceptionCode.param_error,"数值不能为空");
		}
		boolean result = validateStringUseRegex(digitalPattern, RegexTypeEnum.reg_digital_pattern.getRegexKey());
		if(!result){
			throw new BusinessException(BusinessExceptionCode.param_error,digitalPattern+"不是可用数值格式");
		}
	}
	/** 
	* @Description:  验证数值格式 支持千分位
	* @author Guo Yuchao   
	* @date 2014-11-29 下午3:42:31 
	* @param digitalStrs  
	*/ 
	public static void validateDigitalStrings(String... digitalStrs){
		for (String digitalPattern : digitalStrs) {
			validateDigitalPattern(digitalPattern);
		}
	}
	
	/** 
	* @Description: 验证邮箱格式
	* @author Guo Yuchao   
	* @date 2014-11-29 下午12:23:48 
	* @param email  
	*/ 
	public static void validateEmail(String email){
		if(StringUtils.isEmpty(email)){
			throw new BusinessException(BusinessExceptionCode.param_error,"邮箱不能为空");
		}
		boolean result = validateStringUseRegex(email, RegexTypeEnum.reg_email.getRegexKey());
		if(!result){
			throw new BusinessException(BusinessExceptionCode.param_error,"邮箱格式错误");
		}
	}
	
	/** 
	* @Description: 从数字字符串中截取数字  支持￥$货币 支持千分位    可获取数值字符串用于格式转换计算方法
	* @author Guo Yuchao   
	* @date 2014-11-29 下午12:20:41 
	* @param moneyStr
	* @return  
	*/ 
	public static String getMoneyStr(String moneyStr){
		String moneyStr2 = moneyStr;
		validateMoneyPattern(moneyStr2);
		//判断是否含有货币符号
		if(findIfStringContainsReg(moneyStr2, "[\\$\\￥]")){
			moneyStr2 = moneyStr2.trim().replaceAll("[\\$\\￥]", "");	
		}
		//处理千分位
		if(findIfStringContainsReg(moneyStr2, ",")){
			moneyStr2 = moneyStr2.trim().replaceAll(",", "");	
		}
		return moneyStr2;
	}
	/** 
	* @Description:获取数值字符串  支持千分位
	* @author Guo Yuchao   
	* @date 2014-11-29 下午3:11:34 
	* @param digitalStr
	* @return  
	*/ 
	public static String getDigitalStr(String digitalStr){
		String digitalStr2 = digitalStr;
		validateDigitalPattern(digitalStr2);
		//处理千分位
		if(findIfStringContainsReg(digitalStr2, ",")){
			digitalStr2 = digitalStr2.trim().replaceAll(",", "");	
		}
		return digitalStr2;
	}
	/** 
	* @Description: 剔除敏感字符
	* @author Guo Yuchao   
	* @date 2014-11-29 下午11:28:59 
	* @param words
	* @return  
	*/ 
	public static String replaceSensitiveWord(String words){
		String words2 = words;
		if(findIfStringContainsReg(words2, RegexTypeEnum.reg_sensitive_word.getRegexKey())){
			words2 = words2.trim().replaceAll(RegexTypeEnum.reg_sensitive_word.getRegexKey(), "**");	
		}
		return words2;
	}
	
	
	public static void main(String[] args) {
		LOGGER.info("test");
		//验证ip regex 
//		validateIpHost("192.168.1.112");
//		validateHostWithPort("10.135.12.133  :8080");
//		System.out.println("验证成功");
		
		
		//验证 数值
//		String[] digitalStr = "$123.11".split("\\$");
//		int i =1;
//		for (String string : digitalStr) {			
//			LOGGER.info("===="+i+"===" + string+"====");
//		}
//		LOGGER.info(findIfStringContainsReg("asd..sss", ",")+"");
//		validateDigitalPattern("123423.123");
//		validateDigitalPattern("1,123,423.123");
//		validateDigitalPattern("123,423.123");
//		validateDigitalPattern("123423");
//		LOGGER.info("success");
		
		
		//验证货币格式
//		validateMoneyPattern("$-2,111,111.523");
//		validateMoneyPattern("$1,232,111,111");
//		validateMoneyPattern("$-1,232.523");
//		validateMoneyPattern("1,232,111,111.523");
//		validateMoneyPattern("111.523");
//		validateMoneyPattern("1232");
//		validateMoneyPattern("￥-1,232,111,111.523");
//		validateMoneyPattern("￥1,232,111,111");
//		validateMoneyPattern("￥1,232.523");
//		validateMoneyPattern("￥1232");
//		LOGGER.info("success");
		
		
		//截取数字方法
//		LOGGER.info("testDigitals:==="+getMoneyStr("$3,123,123,345.12")+"====");
//		LOGGER.info("testDigitals:==="+getMoneyStr("￥123,123,123,345.12")+"====");
//		LOGGER.info("testDigitals:==="+getMoneyStr("$12345.12")+"====");
//		LOGGER.info("testDigitals:==="+getMoneyStr("12345.12")+"====");
//		LOGGER.info("testDigitals:==="+getMoneyStr("$123345")+"====");
		
		
		//验证邮箱
//		LOGGER.info("testEmail:====");
//		validateEmail("guoyc9006@gmail.com");
//		validateEmail("guoyc9006@gmail.org.cn");
//		validateEmail("g@!%u-o_y.c9006@gmail.org.cn");
//		validateEmail("g/!%u-o_y.c9006@gmail.com");
//		validateEmail("kh@gmail.com");
//		
//		LOGGER.info("testEmail:==success==");
//		LOGGER.info("testEmail:===="+Long.valueOf("123")+"==");
//		LOGGER.info("testEmail:===="+Long.valueOf("+123")+"==");
		
		
//		BigDecimal bigDecimal = new BigDecimal("123.123");
		
//		LOGGER.info("testSensitive:===="+replaceSensitiveWord("我擦赵洪阳这个贱人")+"==");
		
		
	}
}
