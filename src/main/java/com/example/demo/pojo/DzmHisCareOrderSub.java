package com.example.demo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;


/**
 * 开诊用药明细
 * 
 * @author Autumn
 * @email 
 * @date 2019-11-04 15:27:32
 */
@Table(name = "dzm_his_care_order_sub")
public class DzmHisCareOrderSub implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //
    @Column(name = "pkg_id")
    private Integer pkgId;
	
	    //所属开诊id
    @Column(name = "fid")
    private Integer fid;
	
	    //分类：0药，1附加费，2检查项目
    @Column(name = "type_id")
    private Integer typeId;
	
	    //商品id，药品id
    @Column(name = "goods_id")
    private Integer goodsId;
	
	    //药品名
    @Column(name = "goods_name")
    private String goodsName;
	
	    //单剂量
    @Column(name = "single")
    private BigDecimal single;
	
	    //单位
    @Column(name = "unit")
    private String unit;
	
	    //单价
    @Column(name = "price")
    private BigDecimal price;
	
	    //用量
    @Column(name = "num")
    private BigDecimal num;
	
	    //金额
    @Column(name = "amount")
    private BigDecimal amount;
	
	    //特殊要求，备注
    @Column(name = "tips")
    private String tips;
	

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
	public void setPkgId(Integer pkgId) {
		this.pkgId = pkgId;
	}
	/**
	 * 获取：
	 */
	public Integer getPkgId() {
		return pkgId;
	}
	/**
	 * 设置：所属开诊id
	 */
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	/**
	 * 获取：所属开诊id
	 */
	public Integer getFid() {
		return fid;
	}
	/**
	 * 设置：分类：0药，1附加费，2检查项目
	 */
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	/**
	 * 获取：分类：0药，1附加费，2检查项目
	 */
	public Integer getTypeId() {
		return typeId;
	}
	/**
	 * 设置：商品id，药品id
	 */
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * 获取：商品id，药品id
	 */
	public Integer getGoodsId() {
		return goodsId;
	}
	/**
	 * 设置：药品名
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * 获取：药品名
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * 设置：单剂量
	 */
	public void setSingle(BigDecimal single) {
		this.single = single;
	}
	/**
	 * 获取：单剂量
	 */
	public BigDecimal getSingle() {
		return single;
	}
	/**
	 * 设置：单位
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * 获取：单位
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * 设置：单价
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * 获取：单价
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * 设置：用量
	 */
	public void setNum(BigDecimal num) {
		this.num = num;
	}
	/**
	 * 获取：用量
	 */
	public BigDecimal getNum() {
		return num;
	}
	/**
	 * 设置：金额
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/**
	 * 获取：金额
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * 设置：特殊要求，备注
	 */
	public void setTips(String tips) {
		this.tips = tips;
	}
	/**
	 * 获取：特殊要求，备注
	 */
	public String getTips() {
		return tips;
	}
}
