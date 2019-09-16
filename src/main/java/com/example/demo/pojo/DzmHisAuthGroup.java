package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 用户组表
 * 
 * @author Autumn
 * @email 
 * @date 2019-09-16 20:44:15
 */
@Table(name = "dzm_his_auth_group")
public class DzmHisAuthGroup implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //组别名称
    @Column(name = "title")
    private String title;
	
	    //是否显示：1为显示，2不显示
    @Column(name = "status")
    private Integer status;
	
	    //1需要验证权限 2 不需要验证权限.
    @Column(name = "is_manage")
    private Integer isManage;
	
	    //用户组拥有的规则id， 多个规则
    @Column(name = "rules")
    private String rules;
	

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
	 * 设置：组别名称
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：组别名称
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：是否显示：1为显示，2不显示
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：是否显示：1为显示，2不显示
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：1需要验证权限 2 不需要验证权限.
	 */
	public void setIsManage(Integer isManage) {
		this.isManage = isManage;
	}
	/**
	 * 获取：1需要验证权限 2 不需要验证权限.
	 */
	public Integer getIsManage() {
		return isManage;
	}
	/**
	 * 设置：用户组拥有的规则id， 多个规则
	 */
	public void setRules(String rules) {
		this.rules = rules;
	}
	/**
	 * 获取：用户组拥有的规则id， 多个规则
	 */
	public String getRules() {
		return rules;
	}
}
