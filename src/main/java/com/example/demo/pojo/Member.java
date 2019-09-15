package com.example.demo.pojo;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 

public class Member {
 
    private int id;
    private String uesr_name;
    private String password;
    private String create_time;
// 是否允许用户登录：1、允许   2、禁止
    private int status;
// 医院id
    private int p_id;
// 权限身份
    private int type;
// 科室
    private int department_id;
// 医生级别
    private int rank;
    private String update_time;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUesr_name() {
		return uesr_name;
	}
	public void setUesr_name(String uesr_name) {
		this.uesr_name = uesr_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", 用户=" + uesr_name + ", 密码 =" + password + ", 登录状态=" + status
				+ ", 医院=" + p_id + ", 权限=" + type + ", 科室=" + department_id + ", 等级=" + rank + "]";
	}
    
	
    
     
}