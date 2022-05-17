package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CylinderEntity;

@Repository
public interface CylinderRepository extends JpaRepository<CylinderEntity, Integer> {
	
	@Query(value = "SELECT * FROM cylinder c WHERE c.type=?1", nativeQuery = true)
	List<CylinderEntity> findAllCylindersByType(String type);

}
