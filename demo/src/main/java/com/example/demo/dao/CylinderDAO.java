package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CylinderEntity;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.CylinderRepository;
import com.example.demo.repository.SurrenderCylinderRepository;

@Repository
public class CylinderDAO {
	
	@Autowired
	private CylinderRepository cylinderRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private SurrenderCylinderRepository surrenderCylinderRepository;

	public List<CylinderEntity> getAllCylinders() {
		return cylinderRepository.findAll();
	}

	public CylinderEntity insertCylinder(CylinderEntity cylinder) {
		return cylinderRepository.save(cylinder);
	}

	public CylinderEntity getCylinderByCylinderId(Integer cylinderId) {
		return cylinderRepository.findById(cylinderId).get();
	}

	public CylinderEntity updateCylinder(CylinderEntity cylinder) {
		// TODO Auto-generated method stub
		return cylinderRepository.save(cylinder);
	}

	public List<CylinderEntity> getAllCylindersByType(String type) {
		// TODO Auto-generated method stub
		return cylinderRepository.findAllCylindersByType(type);
	}
	
	
	

}
