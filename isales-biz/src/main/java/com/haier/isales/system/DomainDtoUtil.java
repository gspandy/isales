/**
 * @Company 青鸟软通   
 * @Title: DomainEntityUtil.java 
 * @Package com.jbinfo.common.util 
 * @author Liu Wenjie   
 * @date 2013-11-7 下午5:31:04 
 * @version V1.0   
 */
package com.haier.isales.system;

import java.util.Date;

import com.haier.isales.behaviour.dto.LoginBehaviourDTO;
import com.haier.isales.behaviour.dto.UserBehaviourDTO;
import com.haier.isales.behaviour.login.domain.LoginDomain;
import com.haier.isales.behaviour.userBehaviour.domain.UserBehaviourDomain;
import com.haier.isales.common.ClonePojoUtil;
import com.haier.isales.retail.reportsales.domain.ReportsalesDomain;
import com.haier.isales.retail.reportsales.dto.ReportSalesDTO;
import com.haier.isales.system.account.domain.AccountConstants.UserGrantStatusEnum;
import com.haier.isales.system.account.domain.AccountConstants.UserStatusEnum;
import com.haier.isales.system.account.domain.AccountConstants.UserTypeEnum;
import com.haier.isales.system.dto.EmployeeDTO;
import com.haier.isales.system.dto.EmployeeSearchDTO;
import com.haier.isales.system.dto.LabelGroupDTO;
import com.haier.isales.system.dto.MenuDTO;
import com.haier.isales.system.dto.ResourceDTO;
import com.haier.isales.system.dto.UserDTO;
import com.haier.isales.system.dto.UserSearchDTO;
import com.haier.isales.system.employee.domain.Employee;
import com.haier.isales.system.employee.model.EmployeeSearchModel;
import com.haier.isales.system.labelgroup.domain.LabelGroupDomain;
import com.haier.isales.system.menu.domain.MenuDomain;
import com.haier.isales.system.resource.domain.ResourceDomain;
import com.haier.isales.system.user.domain.User;
import com.haier.isales.system.user.model.UserSearchModel;

/**
 * @ClassName: DomainEntityUtil
 * @Description: 实体和对象相互转化的工具类
 * 
 */
public class DomainDtoUtil {

	/* ==================Guo Yuchao cloneDomainToDTO begin=================== */

	/**
	 * @Description: 封装接口使用的user
	 * @author Guo Yuchao
	 * @date 2014-10-28 下午3:31:48
	 * @param user
	 * @return
	 */
	public static UserDTO cloneUserToUserDTO(User user) {
		if (user == null) {
			return null;
		}
		UserDTO userDTO = ClonePojoUtil.copyClassFromTo(user, UserDTO.class);

		return userDTO;
	}

	/**
	 * @Description: 接收接口DTO中的查询条件
	 * @author Guo Yuchao
	 * @date 2014-10-28 下午3:37:57
	 * @param userSearchDTO
	 * @return
	 */
	public static UserSearchModel cloneUserSearchDtoToUserSearchModel(UserSearchDTO userSearchDTO) {
		if (userSearchDTO == null) {
			return null;
		}
		UserSearchModel userSearchModel = ClonePojoUtil.copyClassFromTo(userSearchDTO, UserSearchModel.class);

		return userSearchModel;
	}

	/**
	 * @Description: EmployeeSearchDTO 转化为 EmployeeSearchModel
	 * @author Guo Yuchao
	 * @date 2014-10-31 下午2:09:55
	 * @param employeeSearchDTO
	 * @return
	 */
	public static EmployeeSearchModel cloneEmpSearchDtoToEmpSearchModel(EmployeeSearchDTO employeeSearchDTO) {
		if (employeeSearchDTO == null) {
			return null;
		}
		EmployeeSearchModel employeeSearchModel = ClonePojoUtil.copyClassFromTo(employeeSearchDTO,
				EmployeeSearchModel.class);

		return employeeSearchModel;
	}

	/**
	 * @Description: 将Employee 实体 转化为EmployeeDTO
	 * @author Guo Yuchao
	 * @date 2014-10-31 下午2:11:47
	 * @param employee
	 * @return
	 */
	public static EmployeeDTO cloneEmployeeToEmployeeDto(Employee employee) {
		if (employee == null) {
			return null;
		}
		EmployeeDTO employeeDTO = ClonePojoUtil.copyClassFromTo(employee, EmployeeDTO.class);

		return employeeDTO;
	}

	/**
	 * @Description: clone employee entity to User
	 * @author Guo Yuchao
	 * @date 2014-11-11 下午4:15:28
	 * @param employee
	 * @return
	 */
	public static User cloneEmployeetoUser(Employee employee) {
		if (employee == null) {
			return null;
		}
		User user = new User();
		user.setLoginName(employee.getEmployeeSn());
		user.setOperatorName(employee.getEmployeeName());
		user.setMobile(employee.getMobileNo());
		user.setStatus(UserStatusEnum.用户有效.getValue());
		user.setUserType(UserTypeEnum.APP用户.getValue());
		user.setAuditStatus(UserGrantStatusEnum.已授权.getValue());
		user.setPassword(User.PASSWORD);
		user.setCreateTime(new Date());
		return user;
	}

	/**
	 * @Description: clone MenuDomain entity to MenuDTO
	 * @author Guo Yuchao
	 * @date 2014-11-11 下午4:15:58
	 * @param menuDomain
	 * @return
	 */
	public static MenuDTO cloneMenu2MenuDTO(MenuDomain menuDomain) {
		if (menuDomain == null) {
			return null;
		}
		MenuDTO menuDTO = ClonePojoUtil.copyClassFromTo(menuDomain, MenuDTO.class);
		return menuDTO;
	}

	/**
	 * @Description: clone LabelGroupDomain entity to LabelGroupDTO
	 * @author Guo Yuchao
	 * @date 2014-11-11 下午4:18:02
	 * @param labelGroupDomain
	 * @return
	 */
	public static LabelGroupDTO cloneLabelGroupDomain2DTO(LabelGroupDomain labelGroupDomain) {
		if (labelGroupDomain == null) {
			return null;
		}
		LabelGroupDTO labelGroupDTO = ClonePojoUtil.copyClassFromTo(labelGroupDomain, LabelGroupDTO.class);
		return labelGroupDTO;
	}

	/**
	 * @Description: clone LabelGroupDTO entity to LabelGroupDomain
	 * @author Guo Yuchao
	 * @date 2014-11-11 下午4:18:02
	 * @param labelGroupDomain
	 * @return
	 */
	public static LabelGroupDomain cloneLabelGroupDto2Domain(LabelGroupDTO labelGroupDTO) {
		if (labelGroupDTO == null) {
			return null;
		}
		LabelGroupDomain labelGroupDomain = ClonePojoUtil.copyClassFromTo(labelGroupDTO, LabelGroupDomain.class);
		return labelGroupDomain;
	}

	/* ==================Guo Yuchao cloneEntityToDomain end=================== */

	/* ==================John Zhao cloneEntityToDomain start=================== */
	/** 
	* @Description: clone LoginBehaviourDTO entity to LoginDomainLoginDomain
	* @author John Zhao   
	* @date 2014-11-11 下午10:58:05 
	* @param loginBehaviourDTO
	* @return  
	*/ 
	public static LoginDomain cloneLoginBehaviourDTO2LoginDomain(LoginBehaviourDTO loginBehaviourDTO) {
		if (loginBehaviourDTO == null) {
			return null;
		}
		LoginDomain loginDomain = ClonePojoUtil.copyClassFromTo(loginBehaviourDTO, LoginDomain.class);
		return loginDomain;
	}

	/** 
	* @Description: clone UserBehaviourDTO to UserBehaviourDomain
	* @author John Zhao   
	* @date 2014-11-11 下午10:58:02 
	* @param userBehaviourDTO
	* @return  
	*/ 
	public static UserBehaviourDomain cloneUserBehaviourDTO2UserBehaviourDomain(UserBehaviourDTO userBehaviourDTO) {
		if (userBehaviourDTO == null) {
			return null;
		}
		UserBehaviourDomain userBehaviourDomain = ClonePojoUtil.copyClassFromTo(userBehaviourDTO,
				UserBehaviourDomain.class);
		return userBehaviourDomain;
	}

	/** 
	* @Description: 提报销量dto转化domain
	* @author John Zhao   
	* @date 2014-11-11 下午10:57:58 
	* @param reportSalesDTO
	* @return  
	*/ 
	public static ReportsalesDomain cloneReportSalesDTO2ReportSalesDomain(ReportSalesDTO reportSalesDTO) {
		if (reportSalesDTO == null) {
			return null;
		}
		ReportsalesDomain reportsalesDomain = ClonePojoUtil.copyClassFromTo(reportSalesDTO, ReportsalesDomain.class);
		return reportsalesDomain;
	}
	/* ==================John Zhao cloneEntityToDomain end=================== */
	
	/* ==================liuwenjie cloneEntityToDomain begin=================== */
	/** 
	* @Description: 将资源信息从domain转化为DTO
	* @author Liu Wenjie   
	* @date 2014-11-13 上午11:07:13 
	* @param domain
	* @return  
	*/ 
	public static ResourceDTO cloneResourceDomain2ResourceDTO(ResourceDomain domain){
		if (domain == null) {
			return null;
		}
		ResourceDTO dto = ClonePojoUtil.copyClassFromTo(domain, ResourceDTO.class);
		return dto;
	}
	
	
}
