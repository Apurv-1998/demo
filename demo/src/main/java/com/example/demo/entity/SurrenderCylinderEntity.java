package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="surrender_cylinder")
public class SurrenderCylinderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer surrenderId;
	@Column(name="surrender_date", nullable=false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate surrenderDate;
	
	@OneToOne(cascade=CascadeType.ALL)
	private CustomerEntity customer;
	
	@OneToOne(cascade=CascadeType.ALL)
	private CylinderEntity cylinder;

	public Integer getSurrenderId() {
		return surrenderId;
	}

	public void setSurrenderId(Integer surrenderId) {
		this.surrenderId = surrenderId;
	}

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
