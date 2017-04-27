/**
 * @Company 青鸟软通   
 * @Title: PositionDistanceUtil.java 
 * @Package com.haier.isales.common 
 * @author John.zhao   
 * @date 2015-3-2 下午2:51:13 
 * @version V1.0   
 */
package com.haier.isales.common;

/**
 * @ClassName: PositionDistanceUtil
 * @Description: TODO(这里用一句话描述这个类的作用)
 * 
 */
public class PositionDistanceUtil {
	private static final double EARTH_RADIUS = 6378137;

	private static double rad(double d) {
		return d * Math.PI / 180.0;
	}

	/**
	 * 根据两点间经纬度坐标（double值），计算两点间距离，单位为米
	 * 
	 * @param lng1  经度
	 * @param lat1维度
	 * @param lng2  经度
	 * @param lat2 维度
	 * @return
	 */
	public static double getDistance(double lng1, double lat1, double lng2,double lat2) {
		double radLat1 = rad(lat1);
		double radLat2 = rad(lat2);
		double a = radLat1 - radLat2;
		double b = rad(lng1) - rad(lng2);
		double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
				+ Math.cos(radLat1) * Math.cos(radLat2)
				* Math.pow(Math.sin(b / 2), 2)));
		s = s * EARTH_RADIUS;
		s = Math.round(s * 10000.0) / 10000.0;
		return s;
	}
	
	public static void main(String[] args) {
//		double distance = getDistance(121.491999,31.233234,121.411994,31.206134);
//		System.out.println("Distance is:"+distance);
	}
}
