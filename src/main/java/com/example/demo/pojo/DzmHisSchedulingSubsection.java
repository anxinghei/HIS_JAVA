package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 排班时段表
 * 
 * @author Autumn
 * @email 
 * @date 2019-10-08 16:57:43
 */
@Table(name = "dzm_his_scheduling_subsection")
public class DzmHisSchedulingSubsection implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer schedulingSubsectionId;
	
	    //每天的时段：上午：1；下午：2；晚上：3；
    @Column(name = "subsection_type")
    private Integer subsectionType;
	
	    //排班id
    @Column(name = "scheduling_id")
    private Integer schedulingId;
	

	/**
	 * 设置：
	 */
	public void setSchedulingSubsectionId(Integer schedulingSubsectionId) {
		this.schedulingSubsectionId = schedulingSubsectionId;
	}
	/**
	 * 获取：
	 */
	public Integer getSchedulingSubsectionId() {
		return schedulingSubsectionId;
	}
	/**
	 * 设置：每天的时段：上午：1；下午：2；晚上：3；
	 */
	public void setSubsectionType(Integer subsectionType) {
		this.subsectionType = subsectionType;
	}
	/**
	 * 获取：每天的时段：上午：1；下午：2；晚上：3；
	 */
	public Integer getSubsectionType() {
		return subsectionType;
	}
	/**
	 * 设置：排班id
	 */
	public void setSchedulingId(Integer schedulingId) {
		this.schedulingId = schedulingId;
	}
	/**
	 * 获取：排班id
	 */
	public Integer getSchedulingId() {
		return schedulingId;
	}
}
