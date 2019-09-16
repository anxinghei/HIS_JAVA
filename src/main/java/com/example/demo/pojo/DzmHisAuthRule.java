package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 用户权限表
 * 
 * @author Autumn
 * @email 
 * @date 2019-09-16 21:20:20
 */
@Table(name = "dzm_his_auth_rule")
public class DzmHisAuthRule implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //图标
    @Column(name = "icon")
    private String icon;
	
	    //规则唯一标识Controller/action
    @Column(name = "menu_name")
    private String menuName;
	
	    //菜单名称
    @Column(name = "title")
    private String title;
	
	    //菜单ID 
    @Column(name = "pid")
    private Integer pid;
	
	    //1:是主菜单 2 否
    @Column(name = "is_menu")
    private Integer isMenu;
	
	    //1:是 2:不是
    @Column(name = "is_race_menu")
    private Integer isRaceMenu;
	
	    //
    @Column(name = "type")
    private Integer type;
	
	    //
    @Column(name = "status")
    private Integer status;
	
	
	    //排序字段
    @Column(name = "order_list")
    private Integer orderList;
	

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：图标
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * 获取：图标
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * 设置：规则唯一标识Controller/action
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	/**
	 * 获取：规则唯一标识Controller/action
	 */
	public String getMenuName() {
		return menuName;
	}
	/**
	 * 设置：菜单名称
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：菜单名称
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：菜单ID 
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	/**
	 * 获取：菜单ID 
	 */
	public Integer getPid() {
		return pid;
	}
	/**
	 * 设置：1:是主菜单 2 否
	 */
	public void setIsMenu(Integer isMenu) {
		this.isMenu = isMenu;
	}
	/**
	 * 获取：1:是主菜单 2 否
	 */
	public Integer getIsMenu() {
		return isMenu;
	}
	/**
	 * 设置：1:是 2:不是
	 */
	public void setIsRaceMenu(Integer isRaceMenu) {
		this.isRaceMenu = isRaceMenu;
	}
	/**
	 * 获取：1:是 2:不是
	 */
	public Integer getIsRaceMenu() {
		return isRaceMenu;
	}
	/**
	 * 设置：
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * 设置：
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置：排序字段
	 */
	public void setOrderList(Integer orderList) {
		this.orderList = orderList;
	}
	/**
	 * 获取：排序字段
	 */
	public Integer getOrderList() {
		return orderList;
	}
}
