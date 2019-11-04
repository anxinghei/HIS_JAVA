package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 患者用户表
 * 
 * @author Autumn
 * @email 
 * @date 2019-11-03 21:27:15
 */
@Table(name = "dzm_patient")
public class DzmPatient implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //主键
    @Id
    private Integer patientId;
	
	    //
    @Column(name = "name")
    private String name;
	
	    //患者电话
    @Column(name = "mobile")
    private String mobile;
	
	    //修改时间
    @Column(name = "update_time")
    private Integer updateTime;
	
	    //患者性别1男2女
    @Column(name = "sex")
    private Integer sex;
	
	    //
    @Column(name = "birthday")
    private String birthday;
	
	    //
    @Column(name = "id_card")
    private String idCard;
	
	    //
    @Column(name = "mi_card")
    private String miCard;
	
	    //地址信息
    @Column(name = "address")
    private String address;
	
	    //注册时间
    @Column(name = "create_time")
    private Integer createTime;
	
	    //过敏信息
    @Column(name = "allergy_info")
    private String allergyInfo;
	
	    //是否移除 0：正常 1：删除
    @Column(name = "is_del")
    private Integer isDel;
	

	/**
	 * 设置：主键
	 */
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	/**
	 * 获取：主键
	 */
	public Integer getPatientId() {
		return patientId;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：患者电话
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：患者电话
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Integer getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：患者性别1男2女
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	/**
	 * 获取：患者性别1男2女
	 */
	public Integer getSex() {
		return sex;
	}
	/**
	 * 设置：
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * 获取：
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * 设置：
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	/**
	 * 获取：
	 */
	public String getIdCard() {
		return idCard;
	}
	/**
	 * 设置：
	 */
	public void setMiCard(String miCard) {
		this.miCard = miCard;
	}
	/**
	 * 获取：
	 */
	public String getMiCard() {
		return miCard;
	}
	/**
	 * 设置：地址信息
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：地址信息
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：注册时间
	 */
	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：注册时间
	 */
	public Integer getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：过敏信息
	 */
	public void setAllergyInfo(String allergyInfo) {
		this.allergyInfo = allergyInfo;
	}
	/**
	 * 获取：过敏信息
	 */
	public String getAllergyInfo() {
		return allergyInfo;
	}
	/**
	 * 设置：是否移除 0：正常 1：删除
	 */
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	/**
	 * 获取：是否移除 0：正常 1：删除
	 */
	public Integer getIsDel() {
		return isDel;
	}
}
