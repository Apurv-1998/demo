package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="gas_booking")
public class GasBookingEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer gasBookingId;
	@Column(name="booking_date", nullable=false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate bookingDate;
	@Column(name="status", nullable=false)
	private Boolean status=false;
	@Column(nullable=false)
	private float bill;
	
	@ManyToOne
	@JoinColumn(name = "cutomer_id", nullable=false)
	private CustomerEntity customer;
	
	
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = bill;
	}
	public Integer getGasBookingId() {
		return gasBookingId;
	}
	public void setGasBookingId(Integer gasBookingId) {
		this.gasBookingId = gasBookingId;
	}
	public CustomerEntity getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}
	
	
	
	
	

}
