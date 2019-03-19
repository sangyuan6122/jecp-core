package com.jecp.shop.order.model;
// Generated 2018-11-2 10:08:46 by Hibernate Tools 5.1.6.Final

import java.util.Date;

import com.jecp.shop.order.enums.ShopOrderStatusEnum;

/**
 * ShopOrderHis generated by hbm2java
 */
public class ShopOrderHis implements java.io.Serializable {

	private String orderHisId;
	private String orderId;
	private Long gtid;
	private String status;
	private Date createTime;

	public ShopOrderHis() {
	}

	public ShopOrderHis(String orderHisId, String orderId) {
		this.orderHisId = orderHisId;
		this.orderId = orderId;
	}

	public ShopOrderHis(String orderHisId, String orderId, Long gtid, String status, Date createTime) {
		this.orderHisId = orderHisId;
		this.orderId = orderId;
		this.gtid = gtid;
		this.status = status;
		this.createTime = createTime;
	}

	public String getOrderHisId() {
		return this.orderHisId;
	}

	public void setOrderHisId(String orderHisId) {
		this.orderHisId = orderHisId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getGtid() {
		return this.gtid;
	}

	public void setGtid(Long gtid) {
		this.gtid = gtid;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 草稿
	 */
	public void draft() {		
		this.status = ShopOrderStatusEnum.DRAFT.name();
		this.createTime = new Date();
	}

	/**
	 * 待付款
	 */
	public void unPaid() {
		this.status = ShopOrderStatusEnum.UN_PAID.name();
	}

	/**
	 * 已完成
	 */
	public void completed() {
		this.status = ShopOrderStatusEnum.COMPLETED.name();
	}
}
