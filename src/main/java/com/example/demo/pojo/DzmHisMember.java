package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * HIS用户表
 * 
 * @author Autumn
 * @email 
 * @date 2019-09-16 12:06:33
 */
@Table(name = "dzm_his_member")
public class DzmHisMember implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //用户id
    @Id
    private Integer uid;
	
	    //登录名
    @Column(name = "user_name")
    private String userName;
	
	    //登录密码
    @Column(name = "password")
    private String password;
	
	    //注册时间
    @Column(name = "create_time")
    private Integer createTime;
	
	    //是否允许用户登录( 1 是  2否) 3 删除
    @Column(name = "status")
    private Integer status;
	
	    //医院id，用于区分用户类型及其医生所属诊所
    @Column(name = "p_id")
    private Integer pId;
	
	    //1,管理员，2，医生，3.护士，4，挂号员，5，收费员6，发药员，7，财务8，其他人员
    @Column(name = "type")
    private Integer type;

	
	    //修改时间
    @Column(name = "update_time")
    private Integer updateTime;
	

	/**
	 * 设置：用户id
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	/**
	 * 获取：用户id
	 */
	public Integer getUid() {
		return uid;
	}
	/**
	 * 设置：登录名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：登录名
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置：登录密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：登录密码
	 */
	public String getPassword() {
		return password;
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
	 * 设置：是否允许用户登录( 1 是  2否) 3 删除
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：是否允许用户登录( 1 是  2否) 3 删除
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：医院id，用于区分用户类型及其医生所属诊所
	 */
	public void setPId(Integer pId) {
		this.pId = pId;
	}
	/**
	 * 获取：医院id，用于区分用户类型及其医生所属诊所
	 */
	public Integer getPId() {
		return pId;
	}
	/**
	 * 设置：1,管理员，2，医生，3.护士，4，挂号员，5，收费员6，发药员，7，财务8，其他人员
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：1,管理员，2，医生，3.护士，4，挂号员，5，收费员6，发药员，7，财务8，其他人员
	 */
	public Integer getType() {
		return type;
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

}
