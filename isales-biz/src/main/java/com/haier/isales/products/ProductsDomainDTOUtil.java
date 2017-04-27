/**
* @Company 青鸟软通   
* @Title: ProductsDomainDTOUtil.java 
* @Package com.haier.isales.products 
* @author John.zhao   
* @date 2015-1-27 上午10:52:38 
* @version V1.0   
*/ 
package com.haier.isales.products;

import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.products.dto.ProductLineDTO;
import com.haier.isales.products.dto.ProductsBookDTO;
import com.haier.isales.products.dto.ProductsDetailDTO;
import com.haier.isales.products.dto.ProductsFAQAppDTO;
import com.haier.isales.products.dto.ProductsImageDTO;
import com.haier.isales.products.dto.ProductsInfoAppDTO;
import com.haier.isales.products.dto.ProductsParamDTO;
import com.haier.isales.products.productsbookapp.domain.ProductsBookAppDomain;
import com.haier.isales.products.productsdetailapp.domain.ProductsDetailAppDomain;
import com.haier.isales.products.productsfaqapp.domain.ProductsFAQAppDomain;
import com.haier.isales.products.productsimg.domain.ProductsImgDomain;
import com.haier.isales.products.productsinfoapp.domain.ProductLineDomain;
import com.haier.isales.products.productsinfoapp.domain.ProductsInfoAppDomain;
import com.haier.isales.products.productsparamapp.domain.ProductsParamAppDomain;

/** 
 * @ClassName: ProductsDomainDTOUtil 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class ProductsDomainDTOUtil {
	
	/** 
	* @Description: 套图
	* @author John.zhao   
	* @date 2015-1-27 下午2:13:05 
	* @param domain
	* @return  
	*/ 
	public static ProductsImageDTO cloneProductsImageDomain2DTO(ProductsImgDomain domain) {
		//将套图domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		ProductsImageDTO dto = ClonePojoUtil.copyClassFromTo(domain,ProductsImageDTO.class);
		return dto;
	}

	/** 
	* @Description: 产品详情
	* @author John.zhao   
	* @date 2015-1-27 下午2:13:03 
	* @param domain
	* @return  
	*/ 
	public static ProductsDetailDTO cloneProductsDetailAppDomain2DTO(ProductsDetailAppDomain domain) {
		//将产品详情domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		ProductsDetailDTO dto = ClonePojoUtil.copyClassFromTo(domain,ProductsDetailDTO.class);
		return dto;
	}
	
	
	/** 
	* @Description: 规格参数
	* @author John.zhao   
	* @date 2015-1-27 下午4:25:11 
	* @param domain
	* @return  
	*/ 
	public static ProductsParamDTO cloneProductsParamAppDomain2DTO(ProductsParamAppDomain domain) {
		//将规格参数domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		ProductsParamDTO dto = ClonePojoUtil.copyClassFromTo(domain,ProductsParamDTO.class);
		return dto;
	}
	
	/** 
	* @Description: 产品说明书
	* @author John.zhao   
	* @date 2015-1-27 下午4:26:19 
	* @param domain
	* @return  
	*/ 
	public static ProductsBookDTO cloneProductsBookAppDomain2DTO(ProductsBookAppDomain domain) {
		//将产品说明书domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		ProductsBookDTO dto = ClonePojoUtil.copyClassFromTo(domain,ProductsBookDTO.class);
		return dto;
	}
	
	/** 
	* @Description: 常见问题
	* @author John.zhao   
	* @date 2015-1-28 上午10:24:30 
	* @param domain
	* @return  
	*/ 
	public static ProductsFAQAppDTO cloneProductsFAQAppDomain2DTO(ProductsFAQAppDomain domain) {
		//将常见问题domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		ProductsFAQAppDTO dto = ClonePojoUtil.copyClassFromTo(domain,ProductsFAQAppDTO.class);
		return dto;
	}
	
	/** 
	* @Description: 列表
	* @author John.zhao   
	* @date 2015-1-28 下午4:40:22 
	* @param domain
	* @return  
	*/ 
	public static ProductsInfoAppDTO cloneProductsInfoAppDomain2DTO(ProductsInfoAppDomain domain) {
		//将列表domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		ProductsInfoAppDTO dto = ClonePojoUtil.copyClassFromTo(domain,ProductsInfoAppDTO.class);
		return dto;
	}
	
	/** 
	* @Description: 产业线
	* @author John.zhao   
	* @date 2015-1-30 上午10:08:54 
	* @param domain
	* @return  
	*/ 
	public static ProductLineDTO cloneProductLineDomain2DTO(ProductLineDomain domain) {
		//将列表domain信息转化为dto信息
		if (domain == null) {
			return null;
		}
		ProductLineDTO dto = ClonePojoUtil.copyClassFromTo(domain,ProductLineDTO.class);
		return dto;
	}
	
}
