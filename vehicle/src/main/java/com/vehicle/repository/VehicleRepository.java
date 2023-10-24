package com.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vehicle.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
	
	
@Query(value="select * from vehicle where name = ?",nativeQuery = true)
	public List<Vehicle> getbybrand(String x);

@Query(value="select * from vehicle_db.vehicle where total_price=(select max(total_price) from vehicle_db.vehicle)",nativeQuery = true)
public List<Vehicle> getmax();

@Query(value="select * from vehicle_db.vehicle where total_price=(select min(total_price) from vehicle_db.vehicle)",nativeQuery = true)
public List<Vehicle> getMin();




	
}
