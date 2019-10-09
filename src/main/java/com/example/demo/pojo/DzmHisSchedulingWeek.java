package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 排班星期表
 * 
 * @author Autumn
 * @email 
 * @date 2019-10-08 16:57:43
 */
@Table(name = "dzm_his_scheduling_week")
public class DzmHisSchedulingWeek implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer schedulingWeekId;
	
	    //时间
    @Column(name = "date")
    private String date;
	
	    //星期一：1；星期二：2；星期三：3；星期四：4；星期五：5；星期六：6；星期日：0
    @Column(name = "week")
    private Integer week;
	
	    //挂号费用ID
    @Column(name = "registeredfee_id")
    private Integer registeredfeeId;
	
	    //排班分段ID
    @Column(name = "scheduling_subsection_id")
    private Integer schedulingSubsectionId;
	

	/**
	 * 设置：
	 */
	public void setSchedulingWeekId(Integer schedulingWeekId) {
		this.schedulingWeekId = schedulingWeekId;
	}
	/**
	 * 获取：
	 */
	public Integer getSchedulingWeekId() {
		return schedulingWeekId;
	}
	/**
	 * 设置：时间
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * 获取：时间
	 */
	public String getDate() {
		return date;
	}
	/**
	 * 设置：星期一：1；星期二：2；星期三：3；星期四：4；星期五：5；星期六：6；星期日：0
	 */
	public void setWeek(Integer week) {
		this.week = week;
	}
	/**
	 * 获取：星期一：1；星期二：2；星期三：3；星期四：4；星期五：5；星期六：6；星期日：0
	 */
	public Integer getWeek() {
		return week;
	}
	/**
	 * 设置：挂号费用ID
	 */
	public void setRegisteredfeeId(Integer registeredfeeId) {
		this.registeredfeeId = registeredfeeId;
	}
	/**
	 * 获取：挂号费用ID
	 */
	public Integer getRegisteredfeeId() {
		return registeredfeeId;
	}
	/**
	 * 设置：排班分段ID
	 */
	public void setSchedulingSubsectionId(Integer schedulingSubsectionId) {
		this.schedulingSubsectionId = schedulingSubsectionId;
	}
	/**
	 * 获取：排班分段ID
	 */
	public Integer getSchedulingSubsectionId() {
		return schedulingSubsectionId;
	}
}
