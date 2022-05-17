package com.example.demo.utility.converters;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.CylinderDTO;
import com.example.demo.entity.CylinderEntity;

public class CylinderConverter {

	
	public static List<CylinderDTO> convertCylinderBEListToDTO(List<CylinderEntity> cylinders) {
		
		List<CylinderDTO> response = new ArrayList<>();
		
		for(CylinderEntity cylinder:cylinders) {
			CylinderDTO dto = new CylinderDTO();
			dto.setCustomer(cylinder.getCustomer());
			dto.setPrice(cylinder.getPrice());
			dto.setStrapColor(cylinder.getStrapColor());
			dto.setSurrenderCylinder(cylinder.getSurrenderCylinder());
			dto.setType(cylinder.getType());
			dto.setWeight(cylinder.getWeight());
			response.add(dto);
		}
		
		return response;
	}

	public static CylinderDTO convertCylinderBEToDTO(CylinderEntity cylinder) {
		CylinderDTO dto = new CylinderDTO();
		dto.setCustomer(cylinder.getCustomer());
		dto.setPrice(cylinder.getPrice());
		dto.setStrapColor(cylinder.getStrapColor());
		dto.setSurrenderCylinder(cylinder.getSurrenderCylinder());
		dto.setType(cylinder.getType());
		dto.setWeight(cylinder.getWeight());
		return dto;
	}

	public static CylinderEntity convertCylinderDTOToBE(CylinderDTO cylinderDTO) {
		CylinderEntity entity = new CylinderEntity();
		if(cylinderDTO.getType()!=null)
			entity.setType(cylinderDTO.getType());
		if(cylinderDTO.getPrice()!=0.0f)
			entity.setPrice(cylinderDTO.getPrice());
		if(cylinderDTO.getStrapColor()!=null)
			entity.setStrapColor(cylinderDTO.getStrapColor());
		if(cylinderDTO.getWeight()!=0.0f)
			entity.setWeight(cylinderDTO.getWeight());
		return entity;
		
	}
}
