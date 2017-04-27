package com.haier.isales.common;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bana.common.util.basic.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.exception.BusinessException;
import com.haier.isales.common.exception.ExceptionConstants.BusinessExceptionCode;
import com.haier.isales.common.exception.SystemException;

/**
 * 两个类的同名复制（属性名相同的属性值被复制，注意如果类型不同，避免使用相同的属性名）
 * 
 * @author liuwenjie
 */
public class CheckParamUtil {
	private static final Logger LOG = LoggerFactory.getLogger(CheckParamUtil.class);

	/**
	 * @Description: 判断指定对象的指定属性是否为空 都不为空返回true 任一个为空返回false
	 * @author Guo Yuchao
	 * @date 2014-11-12 上午11:48:32
	 * @param obj
	 * @param fieldNames
	 * @return
	 */
	public static void checkFieldIfNotBlank(Object obj, String... fieldNames) {
		if (StringUtils.isBlank(fieldNames)) {// 判断参数名是否为空
			throw new SystemException(BusinessExceptionCode.param_error,
					"需要判断参数名为空");
		}
		// 判断obj参数是否为null
		if(obj == null){
			throw new BusinessException(BusinessExceptionCode.param_error, "查询参数为空");
		}
		for (String fieldName : fieldNames) {
				//判断是否存在指定的属性，如果不存在抛出systemException
				try {
					Field field = obj.getClass().getDeclaredField(fieldName);
					PropertyDescriptor pd = new PropertyDescriptor(field.getName(), obj.getClass());
					Method getMethod = pd.getReadMethod();
					Object fieldValue = getMethod.invoke(obj);
					if (fieldValue == null) {
						throw new BusinessException(
								BusinessExceptionCode.param_error, fieldName
										+ " 参数为空");
					}else if (fieldValue instanceof String) {// 判断字符串类型
						if (StringUtils.isBlank((String) fieldValue)) {
							throw new BusinessException(
									BusinessExceptionCode.param_error, fieldName
											+ " 参数为空");
						}
					}
				} catch (Exception e) {
					throw new SystemException(BusinessExceptionCode.param_error,
							"找不到指定的属性",e);
				}
//			
		}
	}
	/** 
	* @Description: 检验手机号码是否正确
	* @author John.zhao   
	* @date 2014-11-22 下午10:05:43 
	* @param mobile
	* @return  
	*/ 
	public static boolean isMobileNO(String mobile) {
		Pattern p = Pattern.compile("^\\d{11}$");
		Matcher m = p.matcher(mobile);
		return m.matches();
	}
	/** 
	* @Description: 数值字符串 转化为  Long值 支持千分位
	* @author Guo Yuchao   
	* @date 2014-11-29 下午3:08:17 
	* @param longStr
	* @return  
	*/ 
	public static Long parseStrToLong(String longStr){
		String longStr1 = RegexUtil.getDigitalStr(longStr);
		String longStr2  = longStr1.replaceAll("\\.[\\d]+", "");
		return Long.valueOf(longStr2);
	} 
	/** 
	* @Description: 数值字符串转化为Integer 支持千分位
	* @author Guo Yuchao   
	* @date 2014-11-29 下午3:15:23 
	* @param intStr
	* @return  
	*/ 
	public static Integer parseStrToInt(String intStr){
		String intStr1 = RegexUtil.getDigitalStr(intStr);
		String intStr2 = intStr1.replaceAll("\\.[\\d]+", "");
		return Integer.valueOf(intStr2);
	} 
	/** 
	* @Description: 将数值字符串转化成 double  支持千分位
	* @author Guo Yuchao   
	* @date 2014-11-29 下午3:16:37 
	* @param doubleStr
	* @return  
	*/ 
	public static Double parseStrToDouble(String doubleStr){
		String doubleStr1 = RegexUtil.getDigitalStr(doubleStr);
		return Double.valueOf(doubleStr1);
	} 
	
	/** 
	* @Description: 对数值字符串使用BigDecimal 进行精确加法  支持千分位
	* @author Guo Yuchao   
	* @date 2014-11-29 下午3:56:48 
	* @param digitalStrs
	* @return  
	*/ 
	public static BigDecimal digitalStrSumWithBigDecimal(String... digitalStrs){
		RegexUtil.validateDigitalStrings(digitalStrs);
		BigDecimal sum = BigDecimal.ZERO;
		for (String digitalStr : digitalStrs) {	
			Double data = parseStrToDouble(digitalStr);
			sum = sum.add(BigDecimal.valueOf(data));
		}
		return sum;
	}
	/** 
	* @Description: 对数值字符串使用BigDecimal 进行精确乘法  支持千分位
	* @author Guo Yuchao   
	* @date 2014-11-29 下午3:58:45 
	* @param digitalStrs
	* @return  
	*/ 
	public static BigDecimal digitalStrMultiplyWithBigDecimal(String... digitalStrs){
		RegexUtil.validateDigitalStrings(digitalStrs);
		BigDecimal product = BigDecimal.ONE;
		for (String digitalStr : digitalStrs) {			
			product = product.multiply(BigDecimal.valueOf(parseStrToDouble(digitalStr)));
		}
		return product;
	}
	/** 
	* @Description: 对数值字符串使用BigDecimal 进行精确减法  支持千分位
	* @author Guo Yuchao   
	* @date 2014-11-29 下午4:25:45 
	* @param minuendStr
	* @param subtrahendStr
	* @return  
	*/ 
	public static BigDecimal digitalStrSubtractWithBigDecimal(String minuendStr,String subtrahendStr){
		RegexUtil.validateDigitalStrings(minuendStr,subtrahendStr);
		BigDecimal minuend = BigDecimal.valueOf(parseStrToDouble(minuendStr));
		BigDecimal subtrahend = BigDecimal.valueOf(parseStrToDouble(subtrahendStr));
		minuend = minuend.subtract(subtrahend);
		return minuend;
	}
	/** 
	* @Description: 对数值字符串使用BigDecimal 进行精确除法  支持千分位
	* @author Guo Yuchao   
	* @date 2014-11-29 下午4:26:20 
	* @param dividendStr
	* @param divisorStr
	* @return  
	*/ 
	public static BigDecimal digitalStrDevideWithBigDecimal(String dividendStr ,String divisorStr,int scale,int roundingMode){
		RegexUtil.validateDigitalStrings(dividendStr,divisorStr);
		BigDecimal dividend = BigDecimal.valueOf(parseStrToDouble(dividendStr));
		BigDecimal divisor = BigDecimal.valueOf(parseStrToDouble(divisorStr));
		dividend = dividend.divide(divisor,scale,roundingMode);
		return dividend;
	}

	

	
	public static void main(String[] args){
		LOG.info("test");
//		DictionaryPK dictionaryPK = new DictionaryPK();
//		dictionaryPK.setBusinId("123");
//		dictionaryPK.setBusinTypeId("345");
//		// List objs = checkParamUtil.getFiledsInfo(dictionaryPK);
//		checkFieldIfNotBlank(dictionaryPK, "businTypeId", "businId");
//		LOG.info("判断成功");
		
//		LOG.info("结果"+isMobileNO("123456789011"));
		
		
//		LOG.info("数值转化：==="+parseStrToInt("123,123.123")+"=====");
//		LOG.info("数值转化：==="+parseStrToLong("123,123.123")+"=====");
//		LOG.info("数值转化：==="+parseStrToDouble("123,123.123")+"=====");
//		LOG.info("数值加法：==="+digitalStrSumWithBigDecimal("1,111.111","1,111.111","1,111.111")+"=====");
//		LOG.info("数值乘法：==="+digitalStrMultiplyWithBigDecimal("1.1","1.1")+"=====");
//		LOG.info("数值减法：==="+digitalStrSubtractWithBigDecimal("123,123.123","111,111.111")+"=====");
//		LOG.info("数值除法：==="+digitalStrDevideWithBigDecimal("123,123.123","2",4,BigDecimal.ROUND_HALF_UP)+"=====");
		
	}
}
