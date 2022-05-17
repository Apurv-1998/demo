package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SurrenderCylinderEntity;
import com.example.demo.repository.SurrenderCylinderRepository;

@Repository
public class SurrenderCylinderDAO {
	
	
	@Autowired
	private SurrenderCylinderRepository surrenderCylinderRepository;

	public SurrenderCylinderEntity findSurrenderCylinderBySurrenderCylinderId(Integer surrenderCylinderId) {
		return surrenderCylinderRepository.findById(surrenderCylinderId).get();
	}
}
