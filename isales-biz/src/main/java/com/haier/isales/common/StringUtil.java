package com.haier.isales.common;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.bana.common.util.basic.StringUtils;

public class StringUtil {

	private static Logger log = Logger.getLogger(StringUtil.class);
	// 转化16进制时需要的字符串
	private static final char[] HEXCHAR = { '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	
	/** 
	* @Description: 获取一个属性对应的get方法名称  【停用】
	* @author Liu Wenjie   
	* @date 2014-1-7 下午4:25:50 
	* @param fieldName
	* @return  
	*/ 
	public static String findFieldGetMethod(String fieldName){
    	return "get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
    }
	
	/**
	 * 格式化数字为千分位显示；【未使用】
	 * @param 要格式化的数字；
	 * @return
	 */
	public static String fmtMicrometer(String text)
	{
		DecimalFormat df = null;
		if(text.indexOf('.') > 0)
		{
			if(text.length() - text.indexOf('.')-1 == 0)
			{
				df = new DecimalFormat("###,##0.");
			}else if(text.length() - text.indexOf('.')-1 == 1)
			{
				df = new DecimalFormat("###,##0.0");
			}else
			{
				df = new DecimalFormat("###,##0.00");
			}
		}else 
		{
			df = new DecimalFormat("###,##0");
		}
		double number = 0.0;
		try {
			 number = Double.parseDouble(text);
		} catch (Exception e) {
			number = 0.0;
		}
		return df.format(number);
	}
	
	/**
	 * 左填充字符串
	 * 
	 * @param 被填充的字符串
	 * @param 被填充长度
	 * @param 填充的字符
	 * @return
	 */
	public static String leftPad(String value, int length, char c) {
		if (value.length() >= length) {
			return value;
		}
		StringBuffer pad = new StringBuffer();
		for (int i = 0; i < length - value.length() ; i++) {
			pad.append(c);
		}
		return pad.append(value).toString();
	}

	/**
	 * 判断字符串是否为null或""值或全空格字符串 可以同时判断多个，如果其中一个是，则返回true
	 * 
	 * @param str
	 *            被判断的字符串，可以输入多个
	 * @return
	 */
	public static boolean isEmpty(String... str) {
		if (str == null || str.length == 0) {
			return true;
		}
		for (int i = 0; i < str.length; i++) {
			String string = str[i];
			if (string == null || "".equals(string.trim())) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 将byte数组转化为16进制数组成的字符串【未使用】
	 * 
	 * @param b
	 *            byte数组
	 * @return 16进制的字符串
	 */
	public static String toHexString(byte[] b) {
		StringBuilder sb = new StringBuilder(b.length * 2);
		for (int i = 0; i < b.length; i++) {
			sb.append(HEXCHAR[(b[i] & 0xf0) >>> 4]);
			sb.append(HEXCHAR[b[i] & 0x0f]);
		}
		return sb.toString();
	}

	/**
	 * 将16进制字符串转化为byte数组
	 * 【未使用】
	 * @param s
	 *            16进制数字组成的字符串
	 * @return
	 */
	public static final byte[] toBytes(String s) {
		byte[] bytes;
		bytes = new byte[s.length() / 2];
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) Integer.parseInt(s.substring(2 * i, 2 * i + 2),
					16);
		}
		return bytes;
	}

	/**
	 * @Title: addAsBigDecimal【未使用】
	 * @Description: 将所有字符串转化为BigDecimal，并将其加和
	 * @param numStrings
	 * @return
	 */
	public static String addAsBigDecimal(String... numStrings) {
		BigDecimal sum = new BigDecimal("0.00");
		for (String string : numStrings) {
			if (StringUtil.isEmpty(string)) {
				continue;
			}
			sum = sum.add(new BigDecimal(string));
		}
		return sum.toString();
	}

	/**
	 * 验证给定字符串是否为UUID格式的字符串
	 * 
	 * @param string
	 * @return
	 */
	public static boolean isUUIDStr(String string) {
		try {
			UUID.fromString(string);
		} catch (RuntimeException e) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// System.out.println(toBytes("hello"));
		log.info(UUID.randomUUID().toString());
//		log.info(isUUIDStr("48742147-ebe0-4141-a0d4-4b54d6879a01"));
//		log.info("trimAll " + trimAll(" 散    户 ").equals("散户"));
//		log.info("trimAll " + " 散    户 ".trim().equals("散户"));
	}
	public static String fmtMicrometer(String text,int unitValue){
		double doubleValue = Double.parseDouble(text);
		return fmtMicrometer(doubleValue/unitValue + "");
	}
	
	/**
	* @Description: 将字符串中的所有空格都删除掉
	* @author Liu Wenjie   
	* @date 2013-11-27 下午8:31:29 
	* @param source
	* @return
	 */
	public static String  trimAll(String source){
		if(source == null){
			return null;
		}
		if("".equals(source.trim())){
			return "";
		}
		return source.replaceAll("\\s+", "");
	}
	
	/** 
	* @Description: 模糊查询   抽取参数
	* @author Guo Yuchao   
	* @date 2014-11-26 下午5:32:53 
	* @param prdn
	* @param regex
	* @return  
	*/ 
	public static List<String> getLikeParamStrList(String prdn,String regex) {
		String[] prdns = prdn.trim().split(regex);
		List<String> prdnList = new ArrayList<String>();
		for (String string : prdns) {
			if(!StringUtils.isBlank(string)){
				prdnList.add(string.trim().toUpperCase());
			}
		}
		return prdnList;
	}

}
