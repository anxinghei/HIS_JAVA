package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 科室表
 * 
 * @author Autumn
 * @email 
 * @date 2019-10-21 23:06:35
 */
@Table(name = "dzm_his_department")
public class DzmHisDepartment implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //科室id
    @Id
    private Long did;
	
	    //创建时间
    @Column(name = "create_time")
    private Integer createTime;
	
	    //编辑时间
    @Column(name = "update_time")
    private Integer updateTime;
	
	    //科室名称
    @Column(name = "department_name")
    private String departmentName;
	
	    //科室编号
    @Column(name = "department_number")
    private String departmentNumber;
	
	    //医院id
    @Column(name = "hid")
    private Integer hid;
	

	/**
	 * 设置：科室id
	 */
	public void setDid(Long did) {
		this.did = did;
	}
	/**
	 * 获取：科室id
	 */
	public Long getDid() {
		return did;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Integer getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：编辑时间
	 */
	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：编辑时间
	 */
	public Integer getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：科室名称
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * 获取：科室名称
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * 设置：科室编号
	 */
	public void setDepartmentNumber(String departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	/**
	 * 获取：科室编号
	 */
	public String getDepartmentNumber() {
		return departmentNumber;
	}
	/**
	 * 设置：医院id
	 */
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	/**
	 * 获取：医院id
	 */
	public Integer getHid() {
		return hid;
	}
}
