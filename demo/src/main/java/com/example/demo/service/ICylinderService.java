package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CylinderEntity;

public interface ICylinderService {
	
	CylinderEntity insertCylinder(CylinderEntity cylinder);
	CylinderEntity updateCylinder(CylinderEntity cylinder);
	CylinderEntity deleteCylinder(int cylinderId);
	List<CylinderEntity> viewCylindersByType(String type);
	List<CylinderEntity> getAllCyilders();
	CylinderEntity findCylinderById(Integer cylinderId);

}
