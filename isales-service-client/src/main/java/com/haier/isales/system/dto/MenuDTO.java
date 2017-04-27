/**
* @Company 青鸟软通   
* @Title: MenuDomain.java 
* @Package com.haier.isales.system.menu.domain 
* @author Guo Yuchao   
* @date 2014年11月04日  09:55:36 
* @version V1.0   
*/ 
package com.haier.isales.system.dto;

import java.io.Serializable;
import java.util.List;

/** 
 * @ClassName: MenuDomain 
 * @Description: t_qn_menu 自动生成的对应的实体对象   
 *  
 */
public class MenuDTO implements Serializable{
	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -6942693477695011962L;
	/** 
	* @Fields menuId : 主键
	*/
	private Long menuId;
	/** 
	* @Fields menuName : 菜单名称
	*/
	private String menuName;
	/** 
	* @Fields menuAction : 菜单访问的Url
	*/
	private String menuAction;
	/** 
	* @Fields isLeaf : 是否是叶子节点（Y,N)
	*/
	private String isLeaf;
	/** 
	* @Fields menuLevel : 菜单当前所处的层级（根节点从1开始）
	*/
	private Long menuLevel;
	/** 
	* @Fields rootId : 根节点id
	*/
	private Long rootId;
	/** 
	* @Fields parentsId : 父节点id
	*/
	private Long parentsId;
	/** 
	* @Fields displayOrder : 在当前父节点下的顺序
	*/
	private Long displayOrder;
	/** 
	* @Fields menuSeq : 从根目录到当前的主键顺序字符串，以.进行间隔
	*/
	private String menuSeq;
	/** 
	* @Fields menuIcon : 
	*/
	private String menuIcon;
	/** 
	* @Fields menuUrl : 
	*/
	private String menuUrl;
	/** 
	* @Fields menuIconSmall : 菜单小图标,isales项目改为存储菜单对应图片上传到mogodb后的id值
	*/
	private String menuIconSmall;
	/** 
	* @Fields menuDesc : 菜单描述
	*/
	private String menuDesc;
	/** 
	* @Fields menuType : 菜单类型,101：PC端菜单，102：手机端菜单
	*/
	private String menuType;
	/** 
	* @Fields remark : 备注
	*/
	private String remark;
	/** 
	* @Fields jumpType : 
	*/
	private String jumpType;
	/** 
	* @Fields menuBgcolor : 手机图标背景色
	*/
	private String menuBgcolor;
	/** 
	* @Fields childenList :该菜单下级子菜单 
	*/ 
	private List<MenuDTO> childMenuList;	
	
	/*=========================getter and setter ===================*/
	/**
	 * @Description: 属性 menuId 的get方法 
	 * @return id
	 */
	public Long getMenuId() {
		return this.menuId;
	}
	/**
	 * @Description: 属性 menuId 的set方法 
	 * @param id 
	 */
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	/**
	 * @Description: 属性 menuName 的get方法 
	 * @return id
	 */
	public String getMenuName() {
		return this.menuName;
	}
	/**
	 * @Description: 属性 menuName 的set方法 
	 * @param id 
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	/**
	 * @Description: 属性 menuAction 的get方法 
	 * @return id
	 */
	public String getMenuAction() {
		return this.menuAction;
	}
	/**
	 * @Description: 属性 menuAction 的set方法 
	 * @param id 
	 */
	public void setMenuAction(String menuAction) {
		this.menuAction = menuAction;
	}
	/**
	 * @Description: 属性 isLeaf 的get方法 
	 * @return id
	 */
	public String getIsLeaf() {
		return this.isLeaf;
	}
	/**
	 * @Description: 属性 isLeaf 的set方法 
	 * @param id 
	 */
	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}
	/**
	 * @Description: 属性 menuLevel 的get方法 
	 * @return id
	 */
	public Long getMenuLevel() {
		return this.menuLevel;
	}
	/**
	 * @Description: 属性 menuLevel 的set方法 
	 * @param id 
	 */
	public void setMenuLevel(Long menuLevel) {
		this.menuLevel = menuLevel;
	}
	/**
	 * @Description: 属性 rootId 的get方法 
	 * @return id
	 */
	public Long getRootId() {
		return this.rootId;
	}
	/**
	 * @Description: 属性 rootId 的set方法 
	 * @param id 
	 */
	public void setRootId(Long rootId) {
		this.rootId = rootId;
	}
	/**
	 * @Description: 属性 parentsId 的get方法 
	 * @return id
	 */
	public Long getParentsId() {
		return this.parentsId;
	}
	/**
	 * @Description: 属性 parentsId 的set方法 
	 * @param id 
	 */
	public void setParentsId(Long parentsId) {
		this.parentsId = parentsId;
	}
	/**
	 * @Description: 属性 displayOrder 的get方法 
	 * @return id
	 */
	public Long getDisplayOrder() {
		return this.displayOrder;
	}
	/**
	 * @Description: 属性 displayOrder 的set方法 
	 * @param id 
	 */
	public void setDisplayOrder(Long displayOrder) {
		this.displayOrder = displayOrder;
	}
	/**
	 * @Description: 属性 menuSeq 的get方法 
	 * @return id
	 */
	public String getMenuSeq() {
		return this.menuSeq;
	}
	/**
	 * @Description: 属性 menuSeq 的set方法 
	 * @param id 
	 */
	public void setMenuSeq(String menuSeq) {
		this.menuSeq = menuSeq;
	}
	/**
	 * @Description: 属性 menuIcon 的get方法 
	 * @return id
	 */
	public String getMenuIcon() {
		return this.menuIcon;
	}
	/**
	 * @Description: 属性 menuIcon 的set方法 
	 * @param id 
	 */
	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}
	/**
	 * @Description: 属性 menuUrl 的get方法 
	 * @return id
	 */
	public String getMenuUrl() {
		return this.menuUrl;
	}
	/**
	 * @Description: 属性 menuUrl 的set方法 
	 * @param id 
	 */
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	/**
	 * @Description: 属性 menuIconSmall 的get方法 
	 * @return id
	 */
	public String getMenuIconSmall() {
		return this.menuIconSmall;
	}
	/**
	 * @Description: 属性 menuIconSmall 的set方法 
	 * @param id 
	 */
	public void setMenuIconSmall(String menuIconSmall) {
		this.menuIconSmall = menuIconSmall;
	}
	/**
	 * @Description: 属性 menuDesc 的get方法 
	 * @return menuDesc
	 */
	public String getMenuDesc() {
		return menuDesc;
	}
	/**
	 * @Description: 属性 menuDesc 的set方法 
	 * @param menuDesc 
	 */
	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}
	/**
	 * @Description: 属性 menuType 的get方法 
	 * @return menuType
	 */
	public String getMenuType() {
		return menuType;
	}
	/**
	 * @Description: 属性 menuType 的set方法 
	 * @param menuType 
	 */
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	/**
	 * @Description: 属性 remark 的get方法 
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @Description: 属性 remark 的set方法 
	 * @param remark 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @Description: 属性 childenList 的get方法 
	 * @return childenList
	 */
	public List<MenuDTO> getChildMenuList() {
		return childMenuList;
	}
	/**
	 * @Description: 属性 childenList 的set方法 
	 * @param childenList 
	 */
	public void setChildMenuList(List<MenuDTO> childMenuList) {
		this.childMenuList = childMenuList;
	}
/**
	 * @Description: 属性 jumpType 的get方法 
	 * @return jumpType
	 */
	public String getJumpType() {
		return jumpType;
	}
	/**
	 * @Description: 属性 jumpType 的set方法 
	 * @param jumpType 
	 */
	public void setJumpType(String jumpType) {
		this.jumpType = jumpType;
	}
	/**
	 * @Description: 属性 menuBgcolor 的get方法 
	 * @return menuBgcolor
	 */
	public String getMenuBgcolor() {
		return menuBgcolor;
	}
	/**
	 * @Description: 属性 menuBgcolor 的set方法 
	 * @param menuBgcolor 
	 */
	public void setMenuBgcolor(String menuBgcolor) {
		this.menuBgcolor = menuBgcolor;
	}
	
	/*======================toString======================*/
	/**
	* <p>Description: MenuDTO自动生成的toString方法</p> 
	* @author Cao Rui   
	* @date 2015-1-7 下午6:58:11 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "MenuDTO [menuId=" + menuId + ", menuName=" + menuName
				+ ", menuAction=" + menuAction + ", isLeaf=" + isLeaf
				+ ", menuLevel=" + menuLevel + ", rootId=" + rootId
				+ ", parentsId=" + parentsId + ", displayOrder=" + displayOrder
				+ ", menuSeq=" + menuSeq + ", menuIcon=" + menuIcon
				+ ", menuUrl=" + menuUrl + ", menuIconSmall=" + menuIconSmall
				+ ", menuDesc=" + menuDesc + ", menuType=" + menuType
				+ ", remark=" + remark + ", jumpType=" + jumpType
				+ ", menuBgcolor=" + menuBgcolor + ", childMenuList="
				+ childMenuList + "]";
	}
}
