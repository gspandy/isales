package com.haier.isales.behaviour.userbehaviourcom.dao;

import org.apache.ibatis.annotations.Param;

import com.haier.isales.behaviour.userbehaviourcom.domain.UserBehaviourByHandDomain;
import com.haier.isales.common.dao.CommonDAO;

public interface UserBehaviourComByHandDAO extends CommonDAO<UserBehaviourByHandDomain,Long>{
	
	/**
	 * 日常行为的闸口
	 * @return
	 */
	public String isRecordingByHandbeHaveDao();
	
	/**
     * 份额闸口
     * @return
     */
    public String retailFeneDao();
	
	/**
	 * 各种闸口
	 * @return
	 */
	public UserBehaviourByHandDomain isRecordingByServiceDao(@Param("entity") UserBehaviourByHandDomain userBehaviourByHandDomain);

}
