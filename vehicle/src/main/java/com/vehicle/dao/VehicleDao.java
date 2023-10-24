package com.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicle.entity.Vehicle;
import com.vehicle.repository.VehicleRepository;
@Repository
public class VehicleDao {
	@Autowired
	VehicleRepository vr;

	public String setData(Vehicle v) {
		
		vr.save(v);
		
		return "posted Successfully";
	}

	public String setallData(List<Vehicle> v) {
		vr.saveAll(v);
		return "posted all Successfully";
	}

	public List<Vehicle> getallvalue() {
		
		return vr.findAll();
	}

	public Vehicle findbyids(int a) {
		return vr.findById(a).get();
	}

	public String deletebyid(int a) {
		
		vr.deleteById(a);
		
		return "Delete by id" ;
	}

	public String update(Vehicle v) {
		
		vr.save(v);
		
		return "update Successfully";
	}

	public List<Vehicle> getbybrand(String x) {
		
		return vr.getbybrand(x);
	}

	public List<Vehicle> getmax() {
		
		return vr.getmax();
	}

	public List<Vehicle> getMin() {
		return vr.getMin();
	}

	

}
