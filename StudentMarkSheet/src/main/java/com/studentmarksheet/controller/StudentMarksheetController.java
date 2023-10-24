package com.studentmarksheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentmarksheet.entity.StudentMarksheet;
import com.studentmarksheet.service.StudentMarksheetService;

@RestController
public class StudentMarksheetController {
	@Autowired
	StudentMarksheetService ss;
	@PostMapping("/setone")
	public String setOne(@RequestBody StudentMarksheet ms) {
		return ss.setOne(ms);
	}
	
	
//	@PatchMapping("/one")
//	public String setPatch()
	
	@PostMapping("/setall")
	public String setAll(@RequestBody List<StudentMarksheet> ms) {
		return ss.setAll(ms);
	}
	
	@GetMapping("/getall")
	public List<StudentMarksheet> getAll() {
		return ss.getAll();
	}
	
	
	@GetMapping("/getmarkone/{a}")
	public int getMarkOne(@PathVariable int a) {
		return ss.getMarkOne(a);
	}
	
	@GetMapping("/getmarktwo/{a}")
	public int getMarkTwo(@PathVariable int a) {
		return ss.getMarkTwo(a);
	}
	
//	@GetMapping("/getpercentage/{a}")
//	public int getPercentage(@PathVariable int a) {
//		return ss.getPercentage(a);
//	}

}
