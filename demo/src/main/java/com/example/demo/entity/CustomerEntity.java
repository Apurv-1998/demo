package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.utility.enums.ConnectionStatus;

@Entity
@Table(name="customer")
public class CustomerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer customerId;
	
	@Column(name="name", nullable=false, length=30)
	private String customerName;
	@Column(name="mobile", nullable=false, length=10)
	private String mobileNumber;
	@Column(name="email")
	private String email;
	@Column(name="aadhar_card", nullable=false, length=12)
	private String aadharCard;
	@Column(name="address", nullable=false, columnDefinition = "text")
	private String address;
	@Column(name="city", nullable=false, length=20)
	private String city;
	@Column(name="connection_status", nullable=false)
	@Enumerated(EnumType.STRING)
	private ConnectionStatus connectionStatus;
	
	@OneToMany(mappedBy="customer")
	private List<GasBookingEntity> bookingList;
	
	@OneToOne(mappedBy="customer")
	private CylinderEntity cylinder;
	
	@OneToOne(mappedBy="customer")
	private SurrenderCylinderEntity surrenderCylider;
	
	@ManyToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="cutomer_bank", 
			   joinColumns = @JoinColumn(name="customer_id"),
			   inverseJoinColumns = @JoinColumn(name="bank_id"))
	private List<BankEntity> bank;
	
	
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public ConnectionStatus getConnectionStatus() {
		return connectionStatus;
	}
	public void setConnectionStatus(ConnectionStatus connectionStatus) {
		this.connectionStatus = connectionStatus;
	}
	public List<GasBookingEntity> getBookingList() {
		return bookingList;
	}
	public void setBookingList(List<GasBookingEntity> bookingList) {
		this.bookingList = bookingList;
	}
	public CylinderEntity getCylinder() {
		return cylinder;
	}
	public void setCylinder(CylinderEntity cylinder) {
		this.cylinder = cylinder;
	}
	public SurrenderCylinderEntity getSurrenderCylider() {
		return surrenderCylider;
	}
	public void setSurrenderCylider(SurrenderCylinderEntity surrenderCylider) {
		this.surrenderCylider = surrenderCylider;
	}
	public List<BankEntity> getBank() {
		return bank;
	}
	public void setBank(List<BankEntity> bank) {
		this.bank = bank;
	}
	
	
	
	
	

}
