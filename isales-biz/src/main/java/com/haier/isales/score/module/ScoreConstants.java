/**
* @Company 青鸟软通   
* @Title: ScoreConstants.java 
* @Package com.haier.isales.score.module 
* @author Liu Wenjie   
* @date 2014-11-24 上午11:59:51 
* @version V1.0   
*/ 
package com.haier.isales.score.module;

import java.util.ArrayList;

/** 
 * @ClassName: ScoreConstants 
 * @Description: 积分用到的几个常量定义类
 *  
 */
public class ScoreConstants {
	
	/** 
	* @Fields DIVISOR_TYPE_SERIAL : 连续计算的因子类型，例如连续登录几天的公共因子，在修改公共因子时使用 
	*/ 
	public static final String DIVISOR_TYPE_SERIAL = "serial";
	
	/** 
	* @Fields DIVISOR_TYPE_DAILY : 当天的公共因子类型，比如，当天评论数，等等
	*/ 
	public static final String DIVISOR_TYPE_DAILY = "daily";
	
	/** 
	* @Fields DIVISOR_TYPE_DAILY : 
	*/ 
	public static final String DIVISOR_TYPE_SUM = "sum";
	
	
	/** 
	* @ClassName: LoginDivisor 
	* @Description: 登陆因子的enmu类
	*  
	*/ 
	
	public interface Divisor{
		/** 
		* @Description: 获取值对象
		* @author Liu Wenjie   
		* @date 2014-11-24 下午4:45:03 
		* @return  
		*/ 
		public String getValue();
		
		/** 
		* @Description: 获取类型
		* @author Liu Wenjie   
		* @date 2014-11-24 下午4:46:25 
		* @return  
		*/ 
		public String getType();
	}
	public enum LoginDivisor implements Divisor{
		当日登录次数(true,DIVISOR_TYPE_DAILY),连续登录次数(true,DIVISOR_TYPE_SERIAL);
		
		private boolean isPublic = false;
		private String type;
		
		private LoginDivisor(boolean isPublic,String type){
			this.isPublic = isPublic;
			this.type = type;
		}
		public String getValue(){
			return this.toString();
		}
		@Override
		public String getType() {
			return this.type;
		}
		public static LoginDivisor[] getPublicValues(){
			ArrayList<LoginDivisor> strList = new ArrayList<LoginDivisor>();
			for (LoginDivisor divisor : values()) {
				if(divisor.isPublic){
					strList.add(divisor);
				}
			}
			return strList.toArray(new LoginDivisor[strList.size()]);
		}
	}
	
	/** 
	* @ClassName: CommentsDivisor 
	* @Description: 
	*  
	*/ 
	public enum CommentsDivisor implements Divisor{
		当天评论数(true,DIVISOR_TYPE_DAILY);
		
		private boolean isPublic;
		private String type;
		private CommentsDivisor(boolean isPublic,String type){
			this.isPublic = isPublic;
			this.type = type;
		}
		public String getValue(){
			return this.toString();
		}
		public static CommentsDivisor[] getPublicValues(){
			ArrayList<CommentsDivisor> strList = new ArrayList<CommentsDivisor>();
			for (CommentsDivisor divisor : values()) {
				if(divisor.isPublic){
					strList.add(divisor);
				}
			}
			return strList.toArray(new CommentsDivisor[strList.size()]);
		}
		/**
		* <p>Description: </p> 
		* @author Liu Wenjie   
		* @date 2014-11-24 下午7:07:39 
		* @return 
		* @see com.haier.isales.score.module.ScoreConstants.Divisor#getType() 
		*/ 
		@Override
		public String getType() {
			return this.type;
		}
	}
	
	public enum SalesCountDivisor implements Divisor{
		当天录入销量(true,DIVISOR_TYPE_DAILY),是否当天销量(false,"");

		private boolean isPublic;
		private String type;
		private SalesCountDivisor(boolean isPublic,String type){
			this.isPublic = isPublic;
			this.type = type;
		}
		
		public static SalesCountDivisor[] getPublicValues(){
			ArrayList<SalesCountDivisor> strList = new ArrayList<SalesCountDivisor>();
			for (SalesCountDivisor divisor : values()) {
				if(divisor.isPublic){
					strList.add(divisor);
				}
			}
			return strList.toArray(new SalesCountDivisor[strList.size()]);
		}

		/**
		* <p>Description: </p> 
		* @author Liu Wenjie   
		* @date 2014-11-24 下午7:22:47 
		* @return 
		* @see com.haier.isales.score.module.ScoreConstants.Divisor#getValue() 
		*/ 
		@Override
		public String getValue() {
			return this.toString();
		}

		/**
		* <p>Description: </p> 
		* @author Liu Wenjie   
		* @date 2014-11-24 下午7:22:47 
		* @return 
		* @see com.haier.isales.score.module.ScoreConstants.Divisor#getType() 
		*/ 
		@Override
		public String getType() {
			return this.type;
		}
		
	}
	
	//潜客
	public enum CustomerDivisor implements Divisor{
		当天录入潜客(true,DIVISOR_TYPE_DAILY),录入潜客总数(true,DIVISOR_TYPE_SUM);

		private boolean isPublic;
		private String type;
		private CustomerDivisor(boolean isPublic,String type){
			this.isPublic = isPublic;
			this.type = type;
		}
		
		public static CustomerDivisor[] getPublicValues(){
			ArrayList<CustomerDivisor> strList = new ArrayList<CustomerDivisor>();
			for (CustomerDivisor divisor : values()) {
				if(divisor.isPublic){
					strList.add(divisor);
				}
			}
			return strList.toArray(new CustomerDivisor[strList.size()]);
		}

		/**
		* <p>Description: </p> 
		* @author Liu Wenjie   
		* @date 2014-11-24 下午7:22:47 
		* @return 
		* @see com.haier.isales.score.module.ScoreConstants.Divisor#getValue() 
		*/ 
		@Override
		public String getValue() {
			return this.toString();
		}

		/**
		* <p>Description: </p> 
		* @author Liu Wenjie   
		* @date 2014-11-24 下午7:22:47 
		* @return 
		* @see com.haier.isales.score.module.ScoreConstants.Divisor#getType() 
		*/ 
		@Override
		public String getType() {
			return this.type;
		}
		
	}
	
	//朋友圈获得赞
	public enum MomentsLikeDivisor implements Divisor{
		当天获得赞(true,DIVISOR_TYPE_DAILY),单条分享获得赞数(false,"");

		private boolean isPublic;
		private String type;
		private MomentsLikeDivisor(boolean isPublic,String type){
			this.isPublic = isPublic;
			this.type = type;
		}
		
		public static MomentsLikeDivisor[] getPublicValues(){
			ArrayList<MomentsLikeDivisor> strList = new ArrayList<MomentsLikeDivisor>();
			for (MomentsLikeDivisor divisor : values()) {
				if(divisor.isPublic){
					strList.add(divisor);
				}
			}
			return strList.toArray(new MomentsLikeDivisor[strList.size()]);
		}

		/**
		* <p>Description: </p> 
		* @author Liu Wenjie   
		* @date 2014-11-24 下午7:22:47 
		* @return 
		* @see com.haier.isales.score.module.ScoreConstants.Divisor#getValue() 
		*/ 
		@Override
		public String getValue() {
			return this.toString();
		}

		/**
		* <p>Description: </p> 
		* @author Liu Wenjie   
		* @date 2014-11-24 下午7:22:47 
		* @return 
		* @see com.haier.isales.score.module.ScoreConstants.Divisor#getType() 
		*/ 
		@Override
		public String getType() {
			return this.type;
		}
		
	}
	
	
	public enum MomentsDivisor implements Divisor{
		分享类型(false,DIVISOR_TYPE_DAILY),当天分享次数(true,DIVISOR_TYPE_DAILY);

		private boolean isPublic;
		private String type;
		private MomentsDivisor(boolean isPublic,String type){
			this.isPublic = isPublic;
			this.type = type;
		}
		
		public static MomentsDivisor[] getPublicValues(){
			ArrayList<MomentsDivisor> strList = new ArrayList<MomentsDivisor>();
			for (MomentsDivisor divisor : values()) {
				if(divisor.isPublic){
					strList.add(divisor);
				}
			}
			return strList.toArray(new MomentsDivisor[strList.size()]);
		}

		/**
		* <p>Description: </p> 
		* @author Liu Wenjie   
		* @date 2014-11-24 下午7:22:47 
		* @return 
		* @see com.haier.isales.score.module.ScoreConstants.Divisor#getValue() 
		*/ 
		@Override
		public String getValue() {
			return this.toString();
		}

		/**
		* <p>Description: </p> 
		* @author Liu Wenjie   
		* @date 2014-11-24 下午7:22:47 
		* @return 
		* @see com.haier.isales.score.module.ScoreConstants.Divisor#getType() 
		*/ 
		@Override
		public String getType() {
			return this.type;
		}
		
	}
	/** 
	* @ClassName: ScoreType 
	* @Description: 积分规则的分类
	*  
	*/ 
	public enum ScoreType{
		登录("login",LoginDivisor.getPublicValues()),
		分享("moments",MomentsDivisor.getPublicValues()),
		评论("comments",CommentsDivisor.getPublicValues()),
		潜客("customer",CustomerDivisor.getPublicValues()),
		销量("salesCount",SalesCountDivisor.getPublicValues()),
		点赞("moments_like",MomentsLikeDivisor.getPublicValues());
		
		private String dicId;
		private Divisor[] divisors;
		
		private ScoreType(String dicId,Divisor... divisors){
			this.dicId = dicId;
			this.divisors = divisors;
		}

		/**
		 * @Description: 属性 dicId 的get方法 
		 * @return dicId
		 */
		public String getDicId() {
			return dicId;
		}

		/**
		 * @Description: 属性 divisors 的get方法 
		 * @return divisors
		 */
		public Divisor[] getPublicDivisors() {
			return divisors;
		}
		
	}
}
