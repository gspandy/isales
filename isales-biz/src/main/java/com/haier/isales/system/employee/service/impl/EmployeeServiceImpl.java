/**
* @Company 青鸟软通   
* @Title: EmployeeServiceImpl.java 
* @Package com.haier.isales.system.employee.service.impl 
* @author Guo Yuchao   
* @date 2014-10-31 上午10:22:30 
* @version V1.0   
*/ 
package com.haier.isales.system.employee.service.impl;

import java.util.List;

import org.bana.common.util.basic.StringUtils;
import org.bana.common.util.page.PageCond;
import org.bana.common.util.page.PageCondUtil;
import org.bana.common.util.page.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.DomainDtoUtil;
import com.haier.isales.common.ReturnResult;
import com.haier.isales.system.employee.dao.EmployeeDao;
import com.haier.isales.system.employee.domain.Employee;
import com.haier.isales.system.employee.model.EmployeeSearchModel;
import com.haier.isales.system.employee.service.EmployeeService;
import com.haier.isales.system.user.dao.UserDao;
import com.haier.isales.system.user.domain.User;
import com.haier.isales.system.user.model.UserSearchModel;
import com.haier.isales.system.user.service.UserService;

/** 
 * @ClassName: EmployeeServiceImpl 
 * @Description: 员工管理实现
 *  
 */
public class EmployeeServiceImpl implements EmployeeService {
	
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	public static final String EMP_SN_STR_SEPARATOR = ",";
	private EmployeeDao employeeDao;
	private UserDao userDao;
	
	private UserService userService;
	
	

	/**
	 * @Description: 属性 employeeDao 的get方法 
	 * @return employeeDao
	 */
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	/**
	 * @Description: 属性 employeeDao 的set方法 
	 * @param employeeDao 
	 */
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	/**
	 * @Description: 属性 userService 的get方法 
	 * @return userService
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * @Description: 属性 userService 的set方法 
	 * @param userService 
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * @Description: 属性 userDao 的get方法 
	 * @return userDao
	 */
	public UserDao getUserDao() {
		return userDao;
	}
	/**
	 * @Description: 属性 userDao 的set方法 
	 * @param userDao 
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	/**
	 * <p>Description: 根据条件返回员工信息</p> 
	 * @author Guo Yuchao   
	 * @date 2014-10-31 上午10:22:30 
	 * @param employeeSearchModel
	 * @param pageCond
	 * @return 
	 * @see com.haier.isales.system.employee.service.EmployeeService#getEmployeeByParam(com.haier.isales.system.employee.model.EmployeeSearchModel, org.bana.common.util.page.PageCond) 
	 */
	@Override
	public PageResult<Employee> getEmployeeByParam(
			EmployeeSearchModel employeeSearchModel, PageCond pageCond) {
		
		PageCond pageCondQuery = pageCond;
		pageCondQuery = PageCondUtil.check(pageCondQuery);
		pageCondQuery.setFirstResult(PageCondUtil.calculateX(pageCondQuery));//计算分页数据 第一条数据
		
		List<Employee> employeeList = employeeDao.getEmployeeByParam(employeeSearchModel, pageCondQuery);
		Long totalCount = employeeDao.getCountEmployeeByParam(employeeSearchModel);
		
		pageCondQuery.setTotalCount(Integer.valueOf(totalCount.toString()));//总条数
		pageCondQuery.setPageCount(PageCondUtil.calculatePageCount(pageCondQuery));//总页数
		return new PageResult<Employee>(employeeList, pageCondQuery);
	}
	/**
	 * <p>Description:根据条件返回员工信息，包括是否授权 </p> 
	 * @author Guo Yuchao   
	 * @date 2014-10-31 上午10:22:30 
	 * @param employeeSearchModel
	 * @param pageCond
	 * @return 
	 * @see com.haier.isales.system.employee.service.EmployeeService#getEmployeeByParam(com.haier.isales.system.employee.model.EmployeeSearchModel, org.bana.common.util.page.PageCond) 
	 */
	@Override
	public PageResult<Employee> getEmployeeGrantByParam(
			EmployeeSearchModel employeeSearchModel, PageCond pageCond) {
		
		PageCond pageCondQuery = pageCond;
		pageCondQuery = PageCondUtil.check(pageCondQuery);
		pageCondQuery.setFirstResult(PageCondUtil.calculateX(pageCondQuery));//计算分页数据 第一条数据
		
		List<Employee> employeeList = employeeDao.getEmployeeGrantByParam(employeeSearchModel, pageCondQuery);
		Long totalCount = employeeDao.getCountEmployeeGrantByParam(employeeSearchModel);
		
		pageCondQuery.setTotalCount(Integer.valueOf(totalCount.toString()));//总条数
		pageCondQuery.setPageCount(PageCondUtil.calculatePageCount(pageCondQuery));//总页数
		return new PageResult<Employee>(employeeList, pageCondQuery);
	}

	/**
	 * <p>Description: </p> 
	 * @author Guo Yuchao   
	 * @date 2014-10-31 上午10:22:30 
	 * @param employee 
	 * @see com.haier.isales.system.employee.service.EmployeeService#saveEmployee(com.haier.isales.system.employee.domain.Employee) 
	 */
	@Override
	public void saveEmployee(Employee employee) {

	}

	/**
	 * <p>Description: </p> 
	 * @author Guo Yuchao   
	 * @date 2014-10-31 上午10:22:30 
	 * @param employee 
	 * @see com.haier.isales.system.employee.service.EmployeeService#updateEmployee(com.haier.isales.system.employee.domain.Employee) 
	 */
	@Override
	public void updateEmployee(Employee employee) {

	}

	/**
	* <p>Description:给指定工号的员工授权登录app </p> 
	* @author Guo Yuchao   
	* @date 2014-10-31 下午3:17:39 
	* @param employeeSn
	* @return 
	* @see com.haier.isales.system.employee.service.EmployeeService#saveEmployeeAndGrantToUser(java.lang.String) 
	*/ 
	@Override
	public ReturnResult saveEmployeeAndGrantToUser(String employeeSn) {
		ReturnResult returnResult = new ReturnResult();
		returnResult.setResult(ReturnResult.RETURN_RESULT_SUCCESS);
		StringBuffer successMessage = new StringBuffer();//将授权成功和失败的提示分开
		StringBuffer failedMessage = new StringBuffer();
		try{
		
			if(StringUtils.isEmpty(employeeSn)){
				returnResult.setResult(ReturnResult.RETURN_RESULT_FAILURE);
				failedMessage.append("获取员工号为空！");
			}else{	
				String[] empSns = employeeSn.split(EMP_SN_STR_SEPARATOR);
				for (String empSnStr : empSns) {
					if(StringUtils.isEmpty(empSnStr)){
						continue;
					}
					//根据员工号检查员工是否已授权
					EmployeeSearchModel employeeSearchModel = new EmployeeSearchModel();
					employeeSearchModel.setEmployeeSn(empSnStr.trim());
					PageCond pageCond = new PageCond(1,Integer.MAX_VALUE);
					pageCond = PageCondUtil.check(pageCond);
					PageCondUtil.calculateX(pageCond);		
	//				List<Employee> employeeList = employeeDao.getEmployeeGrantByParam(employeeSearchModel,pageCond);
					List<Employee> employeeList = employeeDao.getEmployeeByParam(employeeSearchModel,pageCond);
					if (employeeList == null || employeeList.isEmpty()) {//z找不到员工
						returnResult.setResult(ReturnResult.RETURN_RESULT_FAILURE);
						failedMessage.append("没有找到工号为： ").append(empSnStr).append("的员工!");
					}else{
						for (Employee employee : employeeList) {
							if(employee.getOperatorId() != null && Employee.GRANT_STATUS_GRANTED.equals(employee.getGrantStatus())){
								//关联登录用户表已经加好权限
								returnResult.setResult(ReturnResult.RETURN_RESULT_FAILURE);
								failedMessage.append("工号为： ").append(empSnStr).append("的员工已经拥有APP登录权限!");
							}else if(employee.getOperatorId() != null && Employee.GRANT_STATUS_UNGRANT.equals(employee.getGrantStatus())){
								//用户以前有权限，只是登录账号被封，修改状态
								UserSearchModel userSearchModel = new UserSearchModel();
								userSearchModel.setOperatorId(employee.getOperatorId());
								successMessage.append(userService.saveUserAuditStatus(userSearchModel));
	//							List<User> userList = userDao.getUserByParam(userSearchModel);
	//							if(userList == null || userList.size() != 1){
	//								returnResult.setResult(ReturnResult.RETURN_RESULT_FAILURE);
	//								failedMessage.append("工号为： ").append(empSnStr).append("的员工修改登录权限状态失败!");
	//							}else{
	//								for (User user : userList) {
	//									user.setAuditStatus(User.USER_GRANT_STATUS_PASS);
	//									userDao.updateUser(user);
	//								}
	//								returnResult.setResult(ReturnResult.RETURN_RESULT_SUCCESS);
	//								successMessage.append("工号为： ").append(empSnStr).append("的员工APP登录权限添加成功!");
	//							}
							}else{
								//用户为空，需要从Employee表中同步
								User user = DomainDtoUtil.cloneEmployeetoUser(employee);
								userDao.save(user);
								returnResult.setResult(ReturnResult.RETURN_RESULT_SUCCESS);
								successMessage.append("工号为： ").append(empSnStr).append("的员工APP登录权限添加成功!");
							}
						}
					}
				}
			}
			returnResult.setMessage(failedMessage.append(successMessage.toString()).toString());
		
		}catch (Exception e) {
//			e.printStackTrace();
			LOG.info(e.getMessage());
		}
		return returnResult;
	}

	/**
	* <p>Description: 将指定员工的登录app权限收回s</p> 
	* @author Guo Yuchao   
	* @date 2014-11-3 下午7:10:19 
	* @param employeeSns
	* @return 
	* @see com.haier.isales.system.employee.service.EmployeeService#saveDisableGrantUser(java.lang.String) 
	*/ 
	@Override
	public ReturnResult saveDisableGrantUser(String employeeSns) {
		ReturnResult returnResult = new ReturnResult();
		StringBuffer message = new StringBuffer();	
		//判断传入参数是否为空
		if(StringUtils.isEmpty(employeeSns)){
			returnResult.setResult(ReturnResult.RETURN_RESULT_FAILURE);
			returnResult.setMessage("未获取到指定员工号");
			return returnResult;
		}
		//传入字符串数组处理
		String[] employeeSnAry = employeeSns.split(EMP_SN_STR_SEPARATOR);
		for (String empSn : employeeSnAry) {
			if(StringUtils.isEmpty(empSn)){
				continue;
			}
			EmployeeSearchModel employeeSearchModel = new EmployeeSearchModel();
			employeeSearchModel.setEmployeeSn(empSn.trim());
			message.append(saveUndoGrantedEmployee(employeeSearchModel));
		}
		returnResult.setResult(ReturnResult.RETURN_RESULT_SUCCESS);
		returnResult.setMessage(message.toString());
		return returnResult;
	}

	/** 
	* @Description: 单个用户收回权限方法
	* @author Guo Yuchao   
	* @date 2014-11-3 下午7:23:05 
	* @param employeeSearchModel
	* @return  
	*/ 
	public String saveUndoGrantedEmployee(
			EmployeeSearchModel employeeSearchModel) {
		StringBuffer message = new StringBuffer();
		PageCond pageCond = new PageCond(1,Integer.MAX_VALUE);
		PageCondUtil.calculateX(pageCond);
//		List<Employee> empList = employeeDao.getEmployeeGrantByParam(employeeSearchModel, pageCond);
		List<Employee> empList = employeeDao.getEmployeeByParam(employeeSearchModel, pageCond);
		if(empList == null || empList.isEmpty()){
			return message.append("未找到用户").append(employeeSearchModel.getEmployeeSn()).toString();
		}
		for (Employee employee : empList) {
			if(employee == null){
				message.append("未找到用户").append(employeeSearchModel.getEmployeeSn());
				continue;
			}
			if(employee.getOperatorId()== null || Employee.GRANT_STATUS_UNGRANT.equals(employee.getGrantStatus())){
				message.append("工号为：").append(employeeSearchModel.getEmployeeSn()).append("的用户没有权限，不能执行收回操作！");
			}else{
				UserSearchModel userSearchModel = new UserSearchModel();
				userSearchModel.setOperatorId(employee.getOperatorId());
				 //收回用户登录app权限
				message.append(userService.saveUserDisauditStatus(userSearchModel));
			}
		}
		return message.toString();
	}
	

}
