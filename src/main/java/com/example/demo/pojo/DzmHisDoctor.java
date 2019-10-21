package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 医生基本信息表
 * 
 * @author Autumn
 * @email
 * @date 2019-10-08 16:57:43
 */
@Table(name = "dzm_his_doctor")
public class DzmHisDoctor implements Serializable {
	private static final long serialVersionUID = 1L;

	// 用户id
	@Id
	private Integer id;

	// 用户个人资料真实姓名
	@Column(name = "true_name")
	private String trueName;

	// 年龄
	@Column(name = "age")
	private Integer age;

	// 头像
	@Column(name = "picture")
	private String picture;

	// 性别 0,空1:男 2:女
	@Column(name = "sex")
	private Integer sex;

	// 学历 1：专科 2：本科 3：研究生 4：博士 5：博士后
	@Column(name = "background")
	private Integer background;

	// 手机号
	@Column(name = "phone")
	private String phone;

	// 邮箱
	@Column(name = "mailbox")
	private String mailbox;

	// 擅长
	@Column(name = "strong")
	private String strong;

	// 荣誉
	@Column(name = "honor")
	private String honor;

	// 简介
	@Column(name = "introduction")
	private String introduction;

	// 注册时间
	@Column(name = "create_time")
	private Integer createTime;

	// 修改时间
	@Column(name = "update_time")
	private Integer updateTime;

	// 用户表userid
	@Column(name = "uid")
	private Integer uid;

	// 科室id
	@Column(name = "department_id")
	private Integer departmentId;

	// 医生级别 0:其他 1:主治医师 2:副主任医师 3:主任医师 4:医士 5:医师 6:助理医师 7:实习医师 8:主管护师 9:护师 10:护士
	// 11:医师助理 12:研究生 13:随访员
	@Column(name = "rank")
	private Integer rank;

	/**
	 * 设置：医生级别 0:其他 1:主治医师 2:副主任医师 3:主任医师 4:医士 5:医师 6:助理医师 7:实习医师 8:主管护师 9:护师 10:护士
	 * 11:医师助理 12:研究生 13:随访员
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}

	/**
	 * 获取：医生级别 0:其他 1:主治医师 2:副主任医师 3:主任医师 4:医士 5:医师 6:助理医师 7:实习医师 8:主管护师 9:护师 10:护士
	 * 11:医师助理 12:研究生 13:随访员
	 */
	public Integer getRank() {
		return rank;
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
	 * 设置：用户id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取：用户id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置：用户个人资料真实姓名
	 */
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	/**
	 * 获取：用户个人资料真实姓名
	 */
	public String getTrueName() {
		return trueName;
	}

	/**
	 * 设置：年龄
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * 获取：年龄
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * 设置：头像
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * 获取：头像
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * 设置：性别 0,空1:男 2:女
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * 获取：性别 0,空1:男 2:女
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * 设置：学历 1：专科 2：本科 3：研究生 4：博士 5：博士后
	 */
	public void setBackground(Integer background) {
		this.background = background;
	}

	/**
	 * 获取：学历 1：专科 2：本科 3：研究生 4：博士 5：博士后
	 */
	public Integer getBackground() {
		return background;
	}

	/**
	 * 设置：手机号
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 获取：手机号
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置：邮箱
	 */
	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	/**
	 * 获取：邮箱
	 */
	public String getMailbox() {
		return mailbox;
	}

	/**
	 * 设置：擅长
	 */
	public void setStrong(String strong) {
		this.strong = strong;
	}

	/**
	 * 获取：擅长
	 */
	public String getStrong() {
		return strong;
	}

	/**
	 * 设置：荣誉
	 */
	public void setHonor(String honor) {
		this.honor = honor;
	}

	/**
	 * 获取：荣誉
	 */
	public String getHonor() {
		return honor;
	}

	/**
	 * 设置：简介
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	/**
	 * 获取：简介
	 */
	public String getIntroduction() {
		return introduction;
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
	 * 设置：用户表userid
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}

	/**
	 * 获取：用户表userid
	 */
	public Integer getUid() {
		return uid;
	}
}
