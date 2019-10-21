package com.example.demo.vo;

public class member_doctorVO {
	
	// DzmHisDoctor
	private Integer did;
	private String trueName;
	private Integer sex;
	private Integer age;
	private String phone;
	private Integer createTime;
	// DzmHisMember
	private Integer departmentId;
	// DzmHisAuthGroup
	private String title;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "member_doctorVO [did=" + did + ", trueName=" + trueName + ", sex=" + sex + ", age=" + age + ", phone="
				+ phone + ", createTime=" + createTime + ", departmentId=" + departmentId + ", title=" + title + "]";
	}
	
}
