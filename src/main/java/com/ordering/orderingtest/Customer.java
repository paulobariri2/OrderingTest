package com.ordering.orderingtest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	private String documentType;
	private String documentNumber;
	private String addressId;
	private String customerType;

	public Customer() {
		super();
	}

	public Customer(String name, String documentType, String documentNumber, String addressId,
			String customerType) {
		super();
		this.name = name;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
		this.addressId = addressId;
		this.customerType = customerType;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDocumentType() {
		return documentType;
	}
	
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	
	public String getDocumentNumber() {
		return documentNumber;
	}
	
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	
	public String getAddressId() {
		return addressId;
	}
	
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	
	public String getCustomerType() {
		return customerType;
	}
	
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", documentType=" + documentType + ", documentNumber="
				+ documentNumber + ", addressId=" + addressId + ", customerType=" + customerType + "]";
	}


}
