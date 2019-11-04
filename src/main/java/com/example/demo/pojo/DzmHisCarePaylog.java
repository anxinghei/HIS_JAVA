package com.example.demo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;


/**
 * 支付收费记录
 * 
 * @author Autumn
 * @email 
 * @date 2019-11-04 15:27:32
 */
@Table(name = "dzm_his_care_paylog")
public class DzmHisCarePaylog implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //care_pkg.id
    @Column(name = "pkg_id")
    private Integer pkgId;
	
	    //支付平台交易单号
    @Column(name = "platform_code")
    private String platformCode;
	
	    //支付方式：0现金，1微信，2支付宝，3，4，5....
    @Column(name = "payment_platform")
    private Integer paymentPlatform;
	
	    //支付金额
    @Column(name = "pay_amount")
    private BigDecimal payAmount;
	
	    //状态，0未支付，1已支付
    @Column(name = "status")
    private Integer status;
	
	    //添加时间
    @Column(name = "addtime")
    private Integer addtime;
	

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
	 * 设置：care_pkg.id
	 */
	public void setPkgId(Integer pkgId) {
		this.pkgId = pkgId;
	}
	/**
	 * 获取：care_pkg.id
	 */
	public Integer getPkgId() {
		return pkgId;
	}
	/**
	 * 设置：支付平台交易单号
	 */
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}
	/**
	 * 获取：支付平台交易单号
	 */
	public String getPlatformCode() {
		return platformCode;
	}
	/**
	 * 设置：支付方式：0现金，1微信，2支付宝，3，4，5....
	 */
	public void setPaymentPlatform(Integer paymentPlatform) {
		this.paymentPlatform = paymentPlatform;
	}
	/**
	 * 获取：支付方式：0现金，1微信，2支付宝，3，4，5....
	 */
	public Integer getPaymentPlatform() {
		return paymentPlatform;
	}
	/**
	 * 设置：支付金额
	 */
	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}
	/**
	 * 获取：支付金额
	 */
	public BigDecimal getPayAmount() {
		return payAmount;
	}
	/**
	 * 设置：状态，0未支付，1已支付
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态，0未支付，1已支付
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：添加时间
	 */
	public void setAddtime(Integer addtime) {
		this.addtime = addtime;
	}
	/**
	 * 获取：添加时间
	 */
	public Integer getAddtime() {
		return addtime;
	}
}
