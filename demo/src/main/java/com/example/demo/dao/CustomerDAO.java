package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.repository.CustomerRepository;

@Repository
public class CustomerDAO {
	
	@Autowired
	private CustomerRepository customerRepository;

	public CustomerEntity findCustomerByCustomerId(Integer customerId) {
		return customerRepository.findById(customerId).get();
	}

}
