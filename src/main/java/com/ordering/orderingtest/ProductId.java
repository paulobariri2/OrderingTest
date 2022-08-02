package com.ordering.orderingtest;

import java.io.Serializable;

public class ProductId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer version;
	
	public ProductId() {
		super();
	}

	public ProductId(Integer id, Integer version) {
		this.id = id;
		this.version = version;
	}
	
	
	
}
