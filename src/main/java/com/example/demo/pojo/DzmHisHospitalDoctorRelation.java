package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 医生与医院关联表
 * 
 * @author Autumn
 * @email 
 * @date 2019-10-08 16:57:43
 */
@Table(name = "dzm_his_hospital_doctor_relation")
public class DzmHisHospitalDoctorRelation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //id
    @Id
    private Long rid;
	
	    //创建时间
    @Column(name = "create_time")
    private Integer createTime;
	
	    //更新时间
    @Column(name = "update_time")
    private Integer updateTime;
	
	    //医院id
    @Column(name = "hospital_id")
    private Integer hospitalId;
	
	    //科室id
    @Column(name = "department_id")
    private Integer departmentId;
	
	    //医生id
    @Column(name = "physicianid")
    private Integer physicianid;
	
	    //权限
    @Column(name = "right_list")
    private String rightList;
	
	    //职称
    @Column(name = "title_level")
    private Integer titleLevel;
	

	/**
	 * 设置：id
	 */
	public void setRid(Long rid) {
		this.rid = rid;
	}
	/**
	 * 获取：id
	 */
	public Long getRid() {
		return rid;
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
	 * 设置：更新时间
	 */
	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Integer getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：医院id
	 */
	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}
	/**
	 * 获取：医院id
	 */
	public Integer getHospitalId() {
		return hospitalId;
	}
	/**
	 * 设置：科室id
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * 获取：科室id
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}
	/**
	 * 设置：医生id
	 */
	public void setPhysicianid(Integer physicianid) {
		this.physicianid = physicianid;
	}
	/**
	 * 获取：医生id
	 */
	public Integer getPhysicianid() {
		return physicianid;
	}
	/**
	 * 设置：权限
	 */
	public void setRightList(String rightList) {
		this.rightList = rightList;
	}
	/**
	 * 获取：权限
	 */
	public String getRightList() {
		return rightList;
	}
	/**
	 * 设置：职称
	 */
	public void setTitleLevel(Integer titleLevel) {
		this.titleLevel = titleLevel;
	}
	/**
	 * 获取：职称
	 */
	public Integer getTitleLevel() {
		return titleLevel;
	}
}
