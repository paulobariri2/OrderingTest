package com.ordering.orderingtest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderAction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String status;
	private Integer orderId;
	private String actionType;
	
	public OrderAction() {
		super();
	}

	public OrderAction(String status, Integer orderId, String actionType) {
		super();
		this.status = status;
		this.orderId = orderId;
		this.actionType = actionType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	@Override
	public String toString() {
		return "OrderAction [id=" + id + ", status=" + status + ", orderId=" + orderId + ", actionType=" + actionType
				+ "]";
	}

}
