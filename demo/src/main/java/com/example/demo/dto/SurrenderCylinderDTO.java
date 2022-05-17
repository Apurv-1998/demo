package com.example.demo.dto;

import java.time.LocalDate;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.entity.CylinderEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value= {"customer","cylinder"})
public class SurrenderCylinderDTO {
	
	private LocalDate surrenderDate;
	private CustomerEntity customer;
	private CylinderEntity cylinder;
	
	public LocalDate getSurrenderDate() {
		return surrenderDate;
	}
	public void setSurrenderDate(LocalDate surrenderDate) {
		this.surrenderDate = surrenderDate;
	}
	public CustomerEntity getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}
	public CylinderEntity getCylinder() {
		return cylinder;
	}
	public void setCylinder(CylinderEntity cylinder) {
		this.cylinder = cylinder;
	}
	
	
	

}
