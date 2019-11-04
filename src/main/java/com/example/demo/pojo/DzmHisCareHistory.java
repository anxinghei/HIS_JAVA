package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 历史病历
 * 
 * @author Autumn
 * @email 
 * @date 2019-11-04 15:27:32
 */
@Table(name = "dzm_his_care_history")
public class DzmHisCareHistory implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //医院id
    @Column(name = "hospital_id")
    private Integer hospitalId;
	
	    //医生id
    @Column(name = "doctor_id")
    private Integer doctorId;
	
	    //患者id
    @Column(name = "patient_id")
    private Integer patientId;
	
	    //科室id
    @Column(name = "department_id")
    private Integer departmentId;
	
	    //接诊类型：0初诊，1复诊，2急诊
    @Column(name = "type_id")
    private Integer typeId;
	
	    //是否传染，0否，1是
    @Column(name = "is_contagious")
    private Integer isContagious;
	
	    //发病日期
    @Column(name = "case_date")
    private Date caseDate;
	
	    //插入时间，php时间戳
    @Column(name = "addtime")
    private Integer addtime;
	
	    //诊断编号
    @Column(name = "case_code")
    private String caseCode;
	
	    //主诉
    @Column(name = "case_title")
    private String caseTitle;
	
	    //诊断信息
    @Column(name = "case_result")
    private String caseResult;
	
	    //医生建议
    @Column(name = "doctor_tips")
    private String doctorTips;
	
	    //备注
    @Column(name = "memo")
    private String memo;
	

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
	 * 设置：医生id
	 */
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	/**
	 * 获取：医生id
	 */
	public Integer getDoctorId() {
		return doctorId;
	}
	/**
	 * 设置：患者id
	 */
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	/**
	 * 获取：患者id
	 */
	public Integer getPatientId() {
		return patientId;
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
	 * 设置：接诊类型：0初诊，1复诊，2急诊
	 */
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	/**
	 * 获取：接诊类型：0初诊，1复诊，2急诊
	 */
	public Integer getTypeId() {
		return typeId;
	}
	/**
	 * 设置：是否传染，0否，1是
	 */
	public void setIsContagious(Integer isContagious) {
		this.isContagious = isContagious;
	}
	/**
	 * 获取：是否传染，0否，1是
	 */
	public Integer getIsContagious() {
		return isContagious;
	}
	/**
	 * 设置：发病日期
	 */
	public void setCaseDate(Date caseDate) {
		this.caseDate = caseDate;
	}
	/**
	 * 获取：发病日期
	 */
	public Date getCaseDate() {
		return caseDate;
	}
	/**
	 * 设置：插入时间，php时间戳
	 */
	public void setAddtime(Integer addtime) {
		this.addtime = addtime;
	}
	/**
	 * 获取：插入时间，php时间戳
	 */
	public Integer getAddtime() {
		return addtime;
	}
	/**
	 * 设置：诊断编号
	 */
	public void setCaseCode(String caseCode) {
		this.caseCode = caseCode;
	}
	/**
	 * 获取：诊断编号
	 */
	public String getCaseCode() {
		return caseCode;
	}
	/**
	 * 设置：主诉
	 */
	public void setCaseTitle(String caseTitle) {
		this.caseTitle = caseTitle;
	}
	/**
	 * 获取：主诉
	 */
	public String getCaseTitle() {
		return caseTitle;
	}
	/**
	 * 设置：诊断信息
	 */
	public void setCaseResult(String caseResult) {
		this.caseResult = caseResult;
	}
	/**
	 * 获取：诊断信息
	 */
	public String getCaseResult() {
		return caseResult;
	}
	/**
	 * 设置：医生建议
	 */
	public void setDoctorTips(String doctorTips) {
		this.doctorTips = doctorTips;
	}
	/**
	 * 获取：医生建议
	 */
	public String getDoctorTips() {
		return doctorTips;
	}
	/**
	 * 设置：备注
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
	/**
	 * 获取：备注
	 */
	public String getMemo() {
		return memo;
	}
}
