package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 我的排班
 * 
 * @author Autumn
 * @email 
 * @date 2019-10-08 16:57:43
 */
@Table(name = "dzm_his_scheduling")
public class DzmHisScheduling implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Long schedulingId;
	
	    //医生ID
    @Column(name = "physicianid")
    private Integer physicianid;
	
	    //科室ID
    @Column(name = "department_id")
    private Integer departmentId;
	
	    //诊所ID
    @Column(name = "company_id")
    private Integer companyId;
	
	    //本周开始时间
    @Column(name = "start_time_this_week")
    private String startTimeThisWeek;
	
	    //本周结束时间
    @Column(name = "end_time_this_week")
    private String endTimeThisWeek;
	
	    //创建时间
    @Column(name = "create_time")
    private Integer createTime;
	
	    //更新时间
    @Column(name = "update_time")
    private Integer updateTime;
	

	/**
	 * 设置：
	 */
	public void setSchedulingId(Long schedulingId) {
		this.schedulingId = schedulingId;
	}
	/**
	 * 获取：
	 */
	public Long getSchedulingId() {
		return schedulingId;
	}
	/**
	 * 设置：医生ID
	 */
	public void setPhysicianid(Integer physicianid) {
		this.physicianid = physicianid;
	}
	/**
	 * 获取：医生ID
	 */
	public Integer getPhysicianid() {
		return physicianid;
	}
	/**
	 * 设置：科室ID
	 */
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * 获取：科室ID
	 */
	public Integer getDepartmentId() {
		return departmentId;
	}
	/**
	 * 设置：诊所ID
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	/**
	 * 获取：诊所ID
	 */
	public Integer getCompanyId() {
		return companyId;
	}
	/**
	 * 设置：本周开始时间
	 */
	public void setStartTimeThisWeek(String startTimeThisWeek) {
		this.startTimeThisWeek = startTimeThisWeek;
	}
	/**
	 * 获取：本周开始时间
	 */
	public String getStartTimeThisWeek() {
		return startTimeThisWeek;
	}
	/**
	 * 设置：本周结束时间
	 */
	public void setEndTimeThisWeek(String endTimeThisWeek) {
		this.endTimeThisWeek = endTimeThisWeek;
	}
	/**
	 * 获取：本周结束时间
	 */
	public String getEndTimeThisWeek() {
		return endTimeThisWeek;
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
}
