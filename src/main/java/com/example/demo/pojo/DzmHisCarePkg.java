package com.example.demo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;


/**
 * 收费总表
 * 
 * @author Autumn
 * @email 
 * @date 2019-11-04 15:27:32
 */
@Table(name = "dzm_his_care_pkg")
public class DzmHisCarePkg implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //
    @Column(name = "hospital_id")
    private Integer hospitalId;
	
	    //
    @Column(name = "doctor_id")
    private Integer doctorId;
	
	    //
    @Column(name = "patient_id")
    private Integer patientId;
	
	    //
    @Column(name = "care_history_id")
    private Integer careHistoryId;
	
	    //挂号ID
    @Column(name = "registration_id")
    private Integer registrationId;
	
	    //商户订单号
    @Column(name = "order_code")
    private String orderCode;
	
	    //应付金额
    @Column(name = "amount")
    private BigDecimal amount;
	
	    //在线支付部分
    @Column(name = "ol_pay_part")
    private BigDecimal olPayPart;
	
	    //收费类型：0就诊处，1挂号处，2问答，3...
    @Column(name = "type_id")
    private Integer typeId;
	
	    //状态:0未支付，1已支付，2确认收款，3申请退款，4已退款,5部分支付,6完成交易（如：已发药），7部分退款
    @Column(name = "status")
    private Integer status;
	
	    //插入时间
    @Column(name = "addtime")
    private Integer addtime;
	
	    //操作地点：1售药，2查检项目，3附加费用，4挂号，，，，
    @Column(name = "op_place")
    private Integer opPlace;
	

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
	 * 设置：
	 */
	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}
	/**
	 * 获取：
	 */
	public Integer getHospitalId() {
		return hospitalId;
	}
	/**
	 * 设置：
	 */
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	/**
	 * 获取：
	 */
	public Integer getDoctorId() {
		return doctorId;
	}
	/**
	 * 设置：
	 */
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	/**
	 * 获取：
	 */
	public Integer getPatientId() {
		return patientId;
	}
	/**
	 * 设置：
	 */
	public void setCareHistoryId(Integer careHistoryId) {
		this.careHistoryId = careHistoryId;
	}
	/**
	 * 获取：
	 */
	public Integer getCareHistoryId() {
		return careHistoryId;
	}
	/**
	 * 设置：挂号ID
	 */
	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}
	/**
	 * 获取：挂号ID
	 */
	public Integer getRegistrationId() {
		return registrationId;
	}
	/**
	 * 设置：商户订单号
	 */
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	/**
	 * 获取：商户订单号
	 */
	public String getOrderCode() {
		return orderCode;
	}
	/**
	 * 设置：应付金额
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/**
	 * 获取：应付金额
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * 设置：在线支付部分
	 */
	public void setOlPayPart(BigDecimal olPayPart) {
		this.olPayPart = olPayPart;
	}
	/**
	 * 获取：在线支付部分
	 */
	public BigDecimal getOlPayPart() {
		return olPayPart;
	}
	/**
	 * 设置：收费类型：0就诊处，1挂号处，2问答，3...
	 */
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	/**
	 * 获取：收费类型：0就诊处，1挂号处，2问答，3...
	 */
	public Integer getTypeId() {
		return typeId;
	}
	/**
	 * 设置：状态:0未支付，1已支付，2确认收款，3申请退款，4已退款,5部分支付,6完成交易（如：已发药），7部分退款
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态:0未支付，1已支付，2确认收款，3申请退款，4已退款,5部分支付,6完成交易（如：已发药），7部分退款
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：插入时间
	 */
	public void setAddtime(Integer addtime) {
		this.addtime = addtime;
	}
	/**
	 * 获取：插入时间
	 */
	public Integer getAddtime() {
		return addtime;
	}
	/**
	 * 设置：操作地点：1售药，2查检项目，3附加费用，4挂号，，，，
	 */
	public void setOpPlace(Integer opPlace) {
		this.opPlace = opPlace;
	}
	/**
	 * 获取：操作地点：1售药，2查检项目，3附加费用，4挂号，，，，
	 */
	public Integer getOpPlace() {
		return opPlace;
	}
}
