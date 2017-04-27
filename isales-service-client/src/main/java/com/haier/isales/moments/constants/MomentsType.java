/**
* @Company 青鸟软通   
* @Title: MomentsType.java 
* @Package com.haier.isales.moments.constants 
* @author Liu Wenjie   
* @date 2014-11-20 下午7:47:09 
* @version V1.0   
*/ 
package com.haier.isales.moments.constants;

import org.bana.common.util.basic.StringUtils;

/** 
 * @ClassName: MomentsType 
 * @Description: 统一的分享类型
 *  
 */
public enum MomentsType {
	经验("101"),销售日志("102"),转发("103"),心情("104"),公共频道("105"),样机分享("106"),微信分享("107"),QQ空间("108"),不支持("...");
	
	private String typeCode;
	private String subTypeCode;
	
	private MomentsType(String typeCode){
		this.typeCode = typeCode;
	}
	
	private MomentsType(String typeCode,String subTypeCode){
		this.typeCode = typeCode;
		this.subTypeCode = subTypeCode;
	}
	
	/** 
	* @Description: 根据类型对应的值获取他的类型
	* @author Liu Wenjie   
	* @date 2014-11-20 下午7:49:44 
	* @param value
	* @return  
	*/ 
	public static MomentsType getInstance(String typeCode){
		if(StringUtils.isBlank(typeCode)){
			return 不支持;
		}
		MomentsType[] values = MomentsType.values();
		for (MomentsType momentsType : values) {
			if(momentsType.getTypeCode().equals(typeCode)){
				return momentsType;
			}else{
				String[] split = typeCode.split("_");
				if(split != null && split.length > 1){
					if(momentsType.getTypeCode().equals(split[0])){
						momentsType.subTypeCode = split[1];
						return momentsType;
					}
				}
			}
		}
		return 不支持;
	}

	/**
	 * @Description: 属性 typeCode 的get方法 
	 * @return typeCode
	 */
	public String getTypeCode() {
		return typeCode;
	}

	/**
	 * @Description: 属性 subTypeCode 的get方法 
	 * @return subTypeCode
	 */
	public String getSubTypeCode() {
		return subTypeCode;
	}

	
}
