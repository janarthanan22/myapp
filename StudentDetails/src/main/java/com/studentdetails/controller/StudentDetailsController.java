package com.studentdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentdetails.customexception.AgeNotValidException;
import com.studentdetails.entity.StudentDetails;
import com.studentdetails.service.StudentDetailsService;

@RestController
public class StudentDetailsController {
	@Autowired 
	StudentDetailsService ss;
	
	
	@PostMapping(path="/setone")
	public String setone(@RequestBody StudentDetails s)throws AgeNotValidException {
		return ss.setone(s);
		
	}
	
	@PostMapping(path="/setall")
	public String setAll(@RequestBody List<StudentDetails> s)throws AgeNotValidException{
		return ss.setAll(s);
	}
	
	@GetMapping("/getall")
	public List<StudentDetails> getAll() {
		return ss.getAll();
	}
	
	@GetMapping("/getpercentage/{a}")
	public int getPercentage(@PathVariable int a) {
		return ss.getPercentage(a);
	}
	
	
	
	
	@GetMapping("/getbyid/{a}")
	public StudentDetails getById(@PathVariable int a) {
		return ss.getById(a);
	}
	
	@DeleteMapping("/deletebyid/{a}")
	public String delById(@PathVariable int a) {
		return ss.delById(a);
	}

}
