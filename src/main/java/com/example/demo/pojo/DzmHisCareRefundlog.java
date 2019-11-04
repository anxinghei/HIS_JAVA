package com.example.demo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;


/**
 * 退款记录
 * 
 * @author Autumn
 * @email 
 * @date 2019-11-04 15:27:32
 */
@Table(name = "dzm_his_care_refundlog")
public class DzmHisCareRefundlog implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //care_pkg.id
    @Column(name = "pkg_id")
    private Integer pkgId;
	
	    //his_care_order.id
    @Column(name = "order_id")
    private Integer orderId;
	
	    //支付平台交易单号
    @Column(name = "platform_code")
    private String platformCode;
	
	    //支付方式：0现金，1微信，2支付宝，3，4，5....
    @Column(name = "payment_platform")
    private Integer paymentPlatform;
	
	    //支付金额
    @Column(name = "refund_amount")
    private BigDecimal refundAmount;
	
	    //状态，0失败，1成功
    @Column(name = "status")
    private Integer status;
	
	    //添加时间
    @Column(name = "addtime")
    private Date addtime;
	
	    //处理人id
    @Column(name = "adm_uid")
    private Integer admUid;
	
	    //处理人ip
    @Column(name = "adm_ip")
    private String admIp;
	
	    //备注
    @Column(name = "adm_memo")
    private String admMemo;
	

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
	 * 设置：his_care_order.id
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：his_care_order.id
	 */
	public Integer getOrderId() {
		return orderId;
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
	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}
	/**
	 * 获取：支付金额
	 */
	public BigDecimal getRefundAmount() {
		return refundAmount;
	}
	/**
	 * 设置：状态，0失败，1成功
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态，0失败，1成功
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：添加时间
	 */
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	/**
	 * 获取：添加时间
	 */
	public Date getAddtime() {
		return addtime;
	}
	/**
	 * 设置：处理人id
	 */
	public void setAdmUid(Integer admUid) {
		this.admUid = admUid;
	}
	/**
	 * 获取：处理人id
	 */
	public Integer getAdmUid() {
		return admUid;
	}
	/**
	 * 设置：处理人ip
	 */
	public void setAdmIp(String admIp) {
		this.admIp = admIp;
	}
	/**
	 * 获取：处理人ip
	 */
	public String getAdmIp() {
		return admIp;
	}
	/**
	 * 设置：备注
	 */
	public void setAdmMemo(String admMemo) {
		this.admMemo = admMemo;
	}
	/**
	 * 获取：备注
	 */
	public String getAdmMemo() {
		return admMemo;
	}
}
