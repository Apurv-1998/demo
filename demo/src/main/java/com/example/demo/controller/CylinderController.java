package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CylinderDTO;
import com.example.demo.entity.CylinderEntity;
import com.example.demo.service.ICylinderService;
import com.example.demo.utility.converters.CylinderConverter;
import com.example.demo.utility.helper.CylinderHelper;

@RestController
@RequestMapping("/cylinder")
public class CylinderController {
	
	@Autowired
	private ICylinderService cylinderService;
	
	@Autowired
	private CylinderHelper helper;
	
	
	@RequestMapping(value="/retrieve-all-cylinders", produces="application/json", method=RequestMethod.GET)
	public ResponseEntity<List<CylinderDTO>> getAllCylinders(){
		
		List<CylinderDTO> response = CylinderConverter.convertCylinderBEListToDTO(
				cylinderService.getAllCyilders());
		
		if(response.size()==0)
			return new ResponseEntity<List<CylinderDTO>>(response, HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<List<CylinderDTO>>(response, HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/add-new-cylinder", consumes="application/json", method=RequestMethod.POST)
	public ResponseEntity<String> insertCylinder(
			@RequestBody CylinderDTO cylinderDTO,
			@RequestParam(name="customer_id")Integer customerId,
			@RequestParam(name="surrender_cylinder_id",required=false)Integer surrenderCylinderId){
		
		CylinderEntity cylinderEntity = CylinderConverter.convertCylinderDTOToBE(cylinderDTO);
		helper.setCutomerAndSurrenderCylinderInCylinderBE(cylinderEntity, customerId, surrenderCylinderId);
		cylinderService.insertCylinder(cylinderEntity);
		
		return new ResponseEntity<String>(new String("Cylinder Added Successfully"), HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/{cylinder-id}/update-cylinder", consumes="application/json", produces="application/json", method=RequestMethod.PUT)
	public ResponseEntity<CylinderDTO> updateCylinder(
			@PathVariable("cylinder-id")Integer cylinderId,
			@RequestBody CylinderDTO cylinderDTO){
		
		
		CylinderEntity entity = cylinderService.findCylinderById(cylinderId);
		if(entity.getCylinderId()==null) {
			return new ResponseEntity<CylinderDTO>(new CylinderDTO(), HttpStatus.NO_CONTENT);
		}
		else {
			helper.setNewValuesFromDTOToBE(cylinderDTO,entity);
			return new ResponseEntity<CylinderDTO>(CylinderConverter.convertCylinderBEToDTO(cylinderService.updateCylinder(entity)), HttpStatus.OK);
		}
		
	}
	
	@RequestMapping(value="/get-cylinders-by-type",produces="application/json",method=RequestMethod.GET)
	public ResponseEntity<List<CylinderDTO>> getCylindersByType(
			@RequestParam(name="cylinder-type") String cylinderType){
		
		List<CylinderDTO> response = CylinderConverter.convertCylinderBEListToDTO(cylinderService.viewCylindersByType(cylinderType));
		
		if(response.size()==0)
			return new ResponseEntity<List<CylinderDTO>>(response, HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<List<CylinderDTO>>(response, HttpStatus.OK);
		
		
	}

}
