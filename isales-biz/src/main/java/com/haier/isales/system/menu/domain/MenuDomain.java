/**
* @Company 青鸟软通   
* @Title: MenuDomain.java 
* @Package com.haier.isales.system.menu.domain 
* @author Guo Yuchao   
* @date 2014年11月20日  17:03:00 
* @version V1.0   
*/ 
package com.haier.isales.system.menu.domain;

import java.io.Serializable;
import java.util.List;

/** 
 * @ClassName: MenuDomain 
 * t_qn_menu 自动生成的对应的实体对象   
 *  
 */
public class MenuDomain implements Serializable{
	private static final long serialVersionUID = -1416474180135L;
	public static final Long ROOT_MENU_ID_PC = 33L;//菜单根目录  33 是pc端根目录，3028是app端根目录
	public static final Long ROOT_MENU_ID_APP = 3028L;
	public static final String MENU_TYPE_PC = "101"; //"pc";//获取菜单的种类，分App手机端菜单，和pc端的菜单
	public static final String MENU_TYPE_APP = "102"; //"app";

	private Long menuId;	//主键

	private String menuName;	//菜单名称

	private String menuAction;	//菜单访问的Url

	private String isLeaf;	//是否是叶子节点（Y,N)

	private Long menuLevel;	//菜单当前所处的层级（根节点从1开始）

	private Long rootId;	//根节点id

	private Long parentsId;	//父节点id

	private Long displayOrder;	//在当前父节点下的顺序

	private String menuSeq;	//从根目录到当前的主键顺序字符串，以.进行间隔

	private String menuIcon;	//菜单图标

	private String menuUrl;	//菜单 地址

	private String menuIconSmall;	//菜单小图标,isales项目改为存储菜单对应图片上传到mogodb后的id值

	private String menuDesc;	//菜单描述

	private String menuType;	//菜单类型,101：PC端菜单，102：手机端菜单

	private String remark;	//备注

	private String jumpType;	//跳转方式

	private String menuBgcolor;	//手机图标背景色
	
	private List<MenuDomain> childrenList;	//该菜单下级子菜单 
	/*=========================getter and setter ===================*/
	
	/**
	 * 属性 menuId 的get方法 
	 * @return id
	 */
	public Long getMenuId() {
		return this.menuId;
	}
	/**
	 * 属性 menuId 的set方法 
	 * @param id 
	 */
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	/**
	 * 属性 menuName 的get方法 
	 * @return id
	 */
	public String getMenuName() {
		return this.menuName;
	}
	/**
	 * 属性 menuName 的set方法 
	 * @param id 
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	/**
	 * 属性 menuAction 的get方法 
	 * @return id
	 */
	public String getMenuAction() {
		return this.menuAction;
	}
	/**
	 * 属性 menuAction 的set方法 
	 * @param id 
	 */
	public void setMenuAction(String menuAction) {
		this.menuAction = menuAction;
	}
	/**
	 * 属性 isLeaf 的get方法 
	 * @return id
	 */
	public String getIsLeaf() {
		return this.isLeaf;
	}
	/**
	 * 属性 isLeaf 的set方法 
	 * @param id 
	 */
	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}
	/**
	 * 属性 menuLevel 的get方法 
	 * @return id
	 */
	public Long getMenuLevel() {
		return this.menuLevel;
	}
	/**
	 * 属性 menuLevel 的set方法 
	 * @param id 
	 */
	public void setMenuLevel(Long menuLevel) {
		this.menuLevel = menuLevel;
	}
	/**
	 * 属性 rootId 的get方法 
	 * @return id
	 */
	public Long getRootId() {
		return this.rootId;
	}
	/**
	 * 属性 rootId 的set方法 
	 * @param id 
	 */
	public void setRootId(Long rootId) {
		this.rootId = rootId;
	}
	/**
	 * 属性 parentsId 的get方法 
	 * @return id
	 */
	public Long getParentsId() {
		return this.parentsId;
	}
	/**
	 * 属性 parentsId 的set方法 
	 * @param id 
	 */
	public void setParentsId(Long parentsId) {
		this.parentsId = parentsId;
	}
	/**
	 * 属性 displayOrder 的get方法 
	 * @return id
	 */
	public Long getDisplayOrder() {
		return this.displayOrder;
	}
	/**
	 * 属性 displayOrder 的set方法 
	 * @param id 
	 */
	public void setDisplayOrder(Long displayOrder) {
		this.displayOrder = displayOrder;
	}
	/**
	 * 属性 menuSeq 的get方法 
	 * @return id
	 */
	public String getMenuSeq() {
		return this.menuSeq;
	}
	/**
	 * 属性 menuSeq 的set方法 
	 * @param id 
	 */
	public void setMenuSeq(String menuSeq) {
		this.menuSeq = menuSeq;
	}
	/**
	 * 属性 menuIcon 的get方法 
	 * @return id
	 */
	public String getMenuIcon() {
		return this.menuIcon;
	}
	/**
	 * 属性 menuIcon 的set方法 
	 * @param id 
	 */
	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}
	/**
	 * 属性 menuUrl 的get方法 
	 * @return id
	 */
	public String getMenuUrl() {
		return this.menuUrl;
	}
	/**
	 * 属性 menuUrl 的set方法 
	 * @param id 
	 */
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	/**
	 * 属性 menuIconSmall 的get方法 
	 * @return id
	 */
	public String getMenuIconSmall() {
		return this.menuIconSmall;
	}
	/**
	 * 属性 menuIconSmall 的set方法 
	 * @param id 
	 */
	public void setMenuIconSmall(String menuIconSmall) {
		this.menuIconSmall = menuIconSmall;
	}
	/**
	 * 属性 menuDesc 的get方法 
	 * @return id
	 */
	public String getMenuDesc() {
		return this.menuDesc;
	}
	/**
	 * 属性 menuDesc 的set方法 
	 * @param id 
	 */
	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}
	/**
	 * 属性 menuType 的get方法 
	 * @return id
	 */
	public String getMenuType() {
		return this.menuType;
	}
	/**
	 * 属性 menuType 的set方法 
	 * @param id 
	 */
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	/**
	 * 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 属性 jumpType 的get方法 
	 * @return id
	 */
	public String getJumpType() {
		return this.jumpType;
	}
	/**
	 * 属性 jumpType 的set方法 
	 * @param id 
	 */
	public void setJumpType(String jumpType) {
		this.jumpType = jumpType;
	}
	/**
	 * 属性 menuBgcolor 的get方法 
	 * @return id
	 */
	public String getMenuBgcolor() {
		return this.menuBgcolor;
	}
	/**
	 * 属性 menuBgcolor 的set方法 
	 * @param id 
	 */
	public void setMenuBgcolor(String menuBgcolor) {
		this.menuBgcolor = menuBgcolor;
	}
		
	
		
	

/**
	 * 属性 childrenList 的get方法 
	 * @return childrenList
	 */
	public List<MenuDomain> getChildrenList() {
		return childrenList;
	}
	/**
	 * 属性 childrenList 的set方法 
	 * @param childrenList 
	 */
	public void setChildrenList(List<MenuDomain> childrenList) {
		this.childrenList = childrenList;
	}
/*====================hashCode and equals ====================*/
/**
	* <p>Description: MenuDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2014年11月20日  17:03:00
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((menuId == null) ? 0 : menuId.hashCode());
		return result;
	}
	/**
	* <p>Description:MenuDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月20日  17:03:00
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		MenuDomain other =(MenuDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (menuId == null) {if (other.menuId != null){ return false;} else if (!menuId.equals(other.menuId)){ return false;}}
		*/
		if (menuId == null) {
			if (other.menuId != null){ 
				return false;
			}
		}else if (!menuId.equals(other.menuId)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:MenuDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年11月20日  17:03:00 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "MenuDomain [" +
					"menuId=" + menuId + "," + 
					"menuName=" + menuName + "," + 
					"menuAction=" + menuAction + "," + 
					"isLeaf=" + isLeaf + "," + 
					"menuLevel=" + menuLevel + "," + 
					"rootId=" + rootId + "," + 
					"parentsId=" + parentsId + "," + 
					"displayOrder=" + displayOrder + "," + 
					"menuSeq=" + menuSeq + "," + 
					"menuIcon=" + menuIcon + "," + 
					"menuUrl=" + menuUrl + "," + 
					"menuIconSmall=" + menuIconSmall + "," + 
					"menuDesc=" + menuDesc + "," + 
					"menuType=" + menuType + "," + 
					"remark=" + remark + "," + 
					"jumpType=" + jumpType + "," + 
					"menuBgcolor=" + menuBgcolor + "," + 
				"]";
	}
	
	
}
