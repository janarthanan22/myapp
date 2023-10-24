package com.endproduct.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endproduct.entity.EndPoint;

public interface EndPointRepository extends JpaRepository<EndPoint, Integer> {

	

}
