package com.studentresults.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.studentresults.entity.Results;
import com.studentresults.repository.ResultsRepository;
import com.studentresults.service.ResultsService;



@RestController
public class ResultsController {
	@Autowired 
	ResultsService rs;
	
	@Autowired
	RestTemplate rt;
	
	@Autowired
	ResultsRepository rr;
	
	@GetMapping("/latest")
	public List<Results> getProduct1(){
		
		String s1="http://localhost:8080/getmarkone/";
		String s2="http://localhost:8080/getmarktwo/";
		String s4="http://localhost:8082/getall";
		String s5="http://localhost:8082/getpercentage/";
		
		ResponseEntity<List<Results>> m1=rt.exchange(s4, HttpMethod.GET,null, new ParameterizedTypeReference<List<Results>>() {});
		
		List<Results> xx=m1.getBody();
		
		
		
		xx.forEach(x->{
			Integer roll=x.getRollNumber();
			
			ResponseEntity<Integer> m2=rt.exchange(s1+roll, HttpMethod.GET,null, Integer.class);
			ResponseEntity<Integer> m4=rt.exchange(s2+roll, HttpMethod.GET,null, Integer.class);
			ResponseEntity<Integer> m5=rt.exchange(s5+roll, HttpMethod.GET,null, Integer.class);
			
			
			
			Integer t1=m2.getBody();
			Integer t2=m4.getBody();
			Integer t7=m5.getBody();
			
			Integer t4=(t1+t2)/2;
			
			if(t7>60 && t4<95) {
				x.setTotalMarks(t4+5);
			}
			else {
				x.setTotalMarks(t4);
			}
			
			x.setPercentage(t4*100/100);
			
			
		});
		
		
		
	
		
	return	rr.saveAll(xx);
		
		
		
	}
	
	
	
	
	
	
	@PostMapping(path="/setone")
	public String setone(@RequestBody Results s) {
		return rs.setone(s);
		
	}
	
	@GetMapping(path="topper")
	public Results getTopper() {
		return rs.getTopper();
		
	}
	
	
	
	
	
	@PostMapping(path="/setall")
	public String setAll(@RequestBody List<Results> s){
		return rs.setAll(s);
	}
	
	@GetMapping("/getall")
	public List<Results> getAll() {
		return rs.getAll();
	}
	
	@GetMapping("/getbyid/{a}")
	public Results getById(@PathVariable int a) {
		return rs.getById(a);
	}
	
	@DeleteMapping("/deletebyid/{a}")
	public String delById(@PathVariable int a) {
		return rs.delById(a);
	}

}
