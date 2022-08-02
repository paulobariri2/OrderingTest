package com.ordering.orderingtest;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Date startDate;
	private Date endDate;
	private String status;
	private Integer customerId;
	
	public OrderInfo() {
		super();
	}

	public OrderInfo(Date startDate, Date endDate, String status, Integer customerId) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.customerId = customerId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status
				+ ", customerId=" + customerId + "]";
	}

}
