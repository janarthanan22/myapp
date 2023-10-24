package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.entity.Vehicle;
import com.vehicle.service.VehicleService;

@RestController
public class VehicleController {
	@Autowired
	VehicleService vs;

	@PostMapping(path = "/setvalue")

	public String setData(@RequestBody Vehicle v) {
		return vs.setData(v);
	}

	@PostMapping(path = "/setallvalue")

	public String setallData(@RequestBody List<Vehicle> v) {
		return vs.setallData(v);
	}

	@GetMapping(path = "/getallvalue")

	public List<Vehicle> getallvalue() {
		return vs.getallvalue();
	}

	@GetMapping(path = "/getbybrand/{x}")

	public List<Vehicle> getbybrand(@PathVariable String x) {
		return vs.getbybrand(x);
	}
	
	@GetMapping(path = "/getmax")

	public List<Vehicle> getmax() {
		return vs.getmax();
	}
	
	@GetMapping(path = "/getmin")

	public List<Vehicle> getMin() {
		return vs.getMin();
	}
	
	
	
	
	
	

	@GetMapping(path = "/findbyid/{a}")

	public Vehicle findbyids(@PathVariable int a) {
		return vs.findbyids(a);
	}

	@DeleteMapping(path = "/deletebyid/{a}")

	public String deletebyid(@PathVariable int a) {
		return vs.deletebyid(a);
	}

	@PutMapping(path = "/update")

	public String update(@RequestBody Vehicle v) {
		return vs.update(v);
	}

}
