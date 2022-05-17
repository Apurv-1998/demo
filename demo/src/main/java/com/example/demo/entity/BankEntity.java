package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bank")
public class BankEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer bankId;
	@Column(name="bank_name", nullable=false)
	private String bankName;
	@Column(name="address", nullable=false, columnDefinition = "text")
	private String address;
	
	@ManyToMany(mappedBy="bank")
	private List<CustomerEntity> customer;

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<CustomerEntity> getCustomer() {
		return customer;
	}

	public void setCustomer(List<CustomerEntity> customer) {
		this.customer = customer;
	}

	
	
	

}
