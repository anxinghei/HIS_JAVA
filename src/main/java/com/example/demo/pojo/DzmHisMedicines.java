package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 药品信息表
 * 
 * @author Autumn
 * @email 
 * @date 2019-11-01 11:12:32
 */
@Table(name = "dzm_his_medicines")
public class DzmHisMedicines implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer medicinesId;
	
	    //药品编号
    @Column(name = "medicines_number")
    private String medicinesNumber;
	
	    //药品名称
    @Column(name = "medicines_name")
    private String medicinesName;
	
	    //药品分类 
    @Column(name = "medicines_class")
    private String medicinesClass;
	
	    //处方类型
    @Column(name = "prescription_type")
    private String prescriptionType;
	
	    //单位（g/条）
    @Column(name = "unit")
    private String unit;
	
	    //换算量
    @Column(name = "conversion")
    private Integer conversion;
	
	    //
    @Column(name = "specs")
    private String specs;
	
	    //关键字
    @Column(name = "keywords")
    private String keywords;
	
	    //创建时间
    @Column(name = "create_time")
    private Integer createTime;
	
	    //修改时间
    @Column(name = "update_time")
    private Integer updateTime;
	
	    //生产厂家
    @Column(name = "producter")
    private String producter;
	

	/**
	 * 设置：
	 */
	public void setMedicinesId(Integer medicinesId) {
		this.medicinesId = medicinesId;
	}
	/**
	 * 获取：
	 */
	public Integer getMedicinesId() {
		return medicinesId;
	}
	/**
	 * 设置：药品编号
	 */
	public void setMedicinesNumber(String medicinesNumber) {
		this.medicinesNumber = medicinesNumber;
	}
	/**
	 * 获取：药品编号
	 */
	public String getMedicinesNumber() {
		return medicinesNumber;
	}
	/**
	 * 设置：药品名称
	 */
	public void setMedicinesName(String medicinesName) {
		this.medicinesName = medicinesName;
	}
	/**
	 * 获取：药品名称
	 */
	public String getMedicinesName() {
		return medicinesName;
	}
	/**
	 * 设置：药品分类 
	 */
	public void setMedicinesClass(String medicinesClass) {
		this.medicinesClass = medicinesClass;
	}
	/**
	 * 获取：药品分类 
	 */
	public String getMedicinesClass() {
		return medicinesClass;
	}
	/**
	 * 设置：处方类型
	 */
	public void setPrescriptionType(String prescriptionType) {
		this.prescriptionType = prescriptionType;
	}
	/**
	 * 获取：处方类型
	 */
	public String getPrescriptionType() {
		return prescriptionType;
	}
	/**
	 * 设置：单位（g/条）
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * 获取：单位（g/条）
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * 设置：换算量
	 */
	public void setConversion(Integer conversion) {
		this.conversion = conversion;
	}
	/**
	 * 获取：换算量
	 */
	public Integer getConversion() {
		return conversion;
	}
	/**
	 * 设置：
	 */
	public void setSpecs(String specs) {
		this.specs = specs;
	}
	/**
	 * 获取：
	 */
	public String getSpecs() {
		return specs;
	}
	/**
	 * 设置：关键字
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/**
	 * 获取：关键字
	 */
	public String getKeywords() {
		return keywords;
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
	 * 设置：生产厂家
	 */
	public void setProducter(String producter) {
		this.producter = producter;
	}
	/**
	 * 获取：生产厂家
	 */
	public String getProducter() {
		return producter;
	}
}
