package com.example.demo.utility.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.dao.SurrenderCylinderDAO;
import com.example.demo.dto.CylinderDTO;
import com.example.demo.entity.CustomerEntity;
import com.example.demo.entity.CylinderEntity;
import com.example.demo.entity.SurrenderCylinderEntity;

@Component
public class CylinderHelper {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private SurrenderCylinderDAO suurenderCylinderDAO;

	public void setCutomerAndSurrenderCylinderInCylinderBE(CylinderEntity cylinderEntity, Integer customerId, Integer surrenderCylinderId) {
		// TODO Auto-generated method stub
		CustomerEntity customer = customerDAO.findCustomerByCustomerId(customerId);
		cylinderEntity.setCustomer(customer);
		
		SurrenderCylinderEntity surrender = null;
		if(surrenderCylinderId!=null) {
			surrender = suurenderCylinderDAO.findSurrenderCylinderBySurrenderCylinderId(surrenderCylinderId);
		}
		
		cylinderEntity.setSurrenderCylinder(surrender);
	}

	public void setNewValuesFromDTOToBE(CylinderDTO cylinderDTO, CylinderEntity entity) {
		if(cylinderDTO.getType()!=null)
			entity.setType(cylinderDTO.getType());
		if(cylinderDTO.getPrice()!=0.0f)
			entity.setPrice(cylinderDTO.getPrice());
		if(cylinderDTO.getStrapColor()!=null)
			entity.setStrapColor(cylinderDTO.getStrapColor());
		if(cylinderDTO.getWeight()!=0.0f)
			entity.setWeight(cylinderDTO.getWeight());
		
	}

}
