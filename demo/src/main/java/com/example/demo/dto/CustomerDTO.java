package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.CylinderEntity;
import com.example.demo.entity.GasBookingEntity;
import com.example.demo.entity.SurrenderCylinderEntity;
import com.example.demo.utility.enums.ConnectionStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value= {"bookingList","cylinder","surrenderCylider"})
public class CustomerDTO {
	
	
	private String customerName;
	private String mobileNumber;
	private String email;
	private String aadharCard;
	private String address;
	private String city;
	private ConnectionStatus connectionStatus;
	private List<GasBookingEntity> bookingList;
	private CylinderEntity cylinder;
	private SurrenderCylinderEntity surrenderCylider;
	
	
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
	
	
	

}
