package com.example.demo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;


/**
 * 处方列表
 * 
 * @author Autumn
 * @email 
 * @date 2019-11-04 15:27:32
 */
@Table(name = "dzm_his_care_order")
public class DzmHisCareOrder implements Serializable {
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
	
	    //关联病历id
    @Column(name = "care_history_id")
    private Integer careHistoryId;
	
	    //收费总表care_pkg.id
    @Column(name = "pkg_id")
    private Integer pkgId;
	
	    //状态，0未支付，1已支付，2确认收款，3申请退款，4已退款
    @Column(name = "status")
    private Integer status;
	
	    //处方名
    @Column(name = "label")
    private String label;
	
	    //每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂
    @Column(name = "num_a")
    private Integer numA;
	
	    //每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂
    @Column(name = "num_b")
    private Integer numB;
	
	    //每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂
    @Column(name = "num_c")
    private Integer numC;
	
	    //每num_a天,num_b剂，服用num_c天，共num_d剂
    @Column(name = "num_d")
    private Integer numD;
	
	    //单处方金额
    @Column(name = "amount")
    private BigDecimal amount;
	
	    //处方全额
    @Column(name = "all_amount")
    private BigDecimal allAmount;
	
	    //插入时间，php时间戳
    @Column(name = "addtime")
    private Integer addtime;
	
	    //诊断编号
    @Column(name = "case_code")
    private String caseCode;
	
	    //服药要求
    @Column(name = "use_tips")
    private String useTips;
	
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
	 * 设置：关联病历id
	 */
	public void setCareHistoryId(Integer careHistoryId) {
		this.careHistoryId = careHistoryId;
	}
	/**
	 * 获取：关联病历id
	 */
	public Integer getCareHistoryId() {
		return careHistoryId;
	}
	/**
	 * 设置：收费总表care_pkg.id
	 */
	public void setPkgId(Integer pkgId) {
		this.pkgId = pkgId;
	}
	/**
	 * 获取：收费总表care_pkg.id
	 */
	public Integer getPkgId() {
		return pkgId;
	}
	/**
	 * 设置：状态，0未支付，1已支付，2确认收款，3申请退款，4已退款
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态，0未支付，1已支付，2确认收款，3申请退款，4已退款
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：处方名
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * 获取：处方名
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * 设置：每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂
	 */
	public void setNumA(Integer numA) {
		this.numA = numA;
	}
	/**
	 * 获取：每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂
	 */
	public Integer getNumA() {
		return numA;
	}
	/**
	 * 设置：每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂
	 */
	public void setNumB(Integer numB) {
		this.numB = numB;
	}
	/**
	 * 获取：每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂
	 */
	public Integer getNumB() {
		return numB;
	}
	/**
	 * 设置：每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂
	 */
	public void setNumC(Integer numC) {
		this.numC = numC;
	}
	/**
	 * 获取：每set_num_a天,set_num_b剂，服用set_num_c天，共set_num_d剂
	 */
	public Integer getNumC() {
		return numC;
	}
	/**
	 * 设置：每num_a天,num_b剂，服用num_c天，共num_d剂
	 */
	public void setNumD(Integer numD) {
		this.numD = numD;
	}
	/**
	 * 获取：每num_a天,num_b剂，服用num_c天，共num_d剂
	 */
	public Integer getNumD() {
		return numD;
	}
	/**
	 * 设置：单处方金额
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/**
	 * 获取：单处方金额
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * 设置：处方全额
	 */
	public void setAllAmount(BigDecimal allAmount) {
		this.allAmount = allAmount;
	}
	/**
	 * 获取：处方全额
	 */
	public BigDecimal getAllAmount() {
		return allAmount;
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
	 * 设置：服药要求
	 */
	public void setUseTips(String useTips) {
		this.useTips = useTips;
	}
	/**
	 * 获取：服药要求
	 */
	public String getUseTips() {
		return useTips;
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
