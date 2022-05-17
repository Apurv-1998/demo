package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.lang.Nullable;

@Entity
@Table(name="cylinder")
public class CylinderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer cylinderId;
	@Column(name="type", nullable=false)
	private String type;
	@Column(name="wight", nullable=false)
	private float weight;
	@Column(name="strap_color")
	private String strapColor;
	@Column(name="price", nullable=false)
	private float price;
	
	@OneToOne(cascade=CascadeType.ALL)
	private CustomerEntity customer;
	
	@OneToOne(mappedBy="cylinder")
	@Nullable
	private SurrenderCylinderEntity surrenderCylinder;
	
	

	public Integer getCylinderId() {
		return cylinderId;
	}

	public void setCylinderId(Integer cylinderId) {
		this.cylinderId = cylinderId;
	}

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
