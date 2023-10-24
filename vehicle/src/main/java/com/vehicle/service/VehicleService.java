package com.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dao.VehicleDao;
import com.vehicle.entity.Vehicle;
@Service
public class VehicleService {
	@Autowired
	VehicleDao vd;

	public String setData(Vehicle v) {
		
		return vd.setData(v);
	}

	public String setallData(List<Vehicle> v) {
		
		return vd.setallData(v);
	}

	public List<Vehicle> getallvalue() {
		
		return vd.getallvalue();
	}

	public Vehicle findbyids(int a) {
		return vd.findbyids(a);
	}

	public String deletebyid(int a) {
		
		return vd.deletebyid(a);
	}

	public String update(Vehicle v) {
		
		return vd.update(v);
	}

	public List<Vehicle> getbybrand(String x) {
		
		return vd.getbybrand(x);
	}

	public List<Vehicle> getmax() {
		
		return vd.getmax();
	}

	public List<Vehicle> getMin() {
		
		return vd.getMin();
	}

	

}
