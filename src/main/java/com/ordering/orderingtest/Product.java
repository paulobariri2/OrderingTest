package com.ordering.orderingtest;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(ProductId.class)
public class Product {
	@Id
	private Integer id;
	@Id
	private Integer version;
	private String type;
	private String state;
	private Integer orderActionId;
	private HashMap<String, String> attributes;
	
	public Product() {
		super();
	}

	public Product(Integer id, Integer version, String type, String state, Integer orderActionId, HashMap<String, String> attributes) {
		super();
		this.id = id;
		this.version = version;
		this.type = type;
		this.state = state;
		this.orderActionId = orderActionId;
		this.attributes = attributes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getOrderActionId() {
		return orderActionId;
	}

	public void setOrderActionId(Integer orderActionId) {
		this.orderActionId = orderActionId;
	}

	public HashMap<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(HashMap<String, String> attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", type=" + type + ", state=" + state + ", orderActionId=" + orderActionId
				+ ", attributes=" + attributes + "]";
	}
	
}
