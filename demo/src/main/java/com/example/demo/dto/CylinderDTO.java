package com.example.demo.dto;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.entity.SurrenderCylinderEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value= {"customer","surrenderCylinder"})
public class CylinderDTO {
	
	
	private String type;
	private float weight;
	private String strapColor;
	private float price;
	private CustomerEntity customer;
	private SurrenderCylinderEntity surrenderCylinder;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getStrapColor() {
		return strapColor;
	}
	public void setStrapColor(String strapColor) {
		this.strapColor = strapColor;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public CustomerEntity getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}
	public SurrenderCylinderEntity getSurrenderCylinder() {
		return surrenderCylinder;
	}
	public void setSurrenderCylinder(SurrenderCylinderEntity surrenderCylinder) {
		this.surrenderCylinder = surrenderCylinder;
	}
	
	

}
