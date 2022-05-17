package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CylinderDAO;
import com.example.demo.entity.CylinderEntity;
import com.example.demo.service.ICylinderService;

@Service
public class CylinderServcieImpl implements ICylinderService {
	
	@Autowired
	private CylinderDAO cylinderDAO;

	@Override
	public CylinderEntity insertCylinder(CylinderEntity cylinder) {
		// TODO Auto-generated method stub
		return cylinderDAO.insertCylinder(cylinder);
	}

	@Override
	public CylinderEntity updateCylinder(CylinderEntity cylinder) {
		// TODO Auto-generated method stub
		return cylinderDAO.updateCylinder(cylinder);
	}

	@Override
	public CylinderEntity deleteCylinder(int cylinderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CylinderEntity> viewCylindersByType(String type) {
		// TODO Auto-generated method stub
		return cylinderDAO.getAllCylindersByType(type);
	}

	@Override
	public List<CylinderEntity> getAllCyilders() {
		List<CylinderEntity> cylinderList = cylinderDAO.getAllCylinders();
		return cylinderList;
	}

	@Override
	public CylinderEntity findCylinderById(Integer cylinderId) {
		return cylinderDAO.getCylinderByCylinderId(cylinderId);
	}

}
