package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mm")
public class WebController {
	
	@GetMapping(path="/msg")
	public String getName() {
		return "Hello World";
	}
	
	@GetMapping(path="/jana")
	public String getName1() {
		return "Janarthanan";
	}
	
	@GetMapping(path="/add/{name}")
	public String addName(@PathVariable String name) {
		return "HI  "+name.toUpperCase();
	}
	
	@GetMapping(path="/add1/{a}/{b}")
	public int addNumber(@PathVariable int a,@PathVariable int b) {
		return a+b;
	}
	
	
	@GetMapping(path="/voter/{a}")
	public String voter(@PathVariable int a) {
		if(a>18){
			return "Eligible";
		}
		else {
			return "Not Eligible";
		}
	}
	
	@GetMapping(path="/authentication/{a}/{b}")
	public String voter(@PathVariable String a,@PathVariable String b) {
		if(a.equals(b)){
			return "Authorized user";
		}
		else {
			return "Not Authorized";
		}
	}
	
	
	@GetMapping(path="/getobj")
	public Car getCar(@RequestBody Car c) {
		return c;
	}
	
	@GetMapping(path="/getobj1")
	public List<Car> getCar1(@RequestBody List<Car> c) {
		return c;
	}
	
	
	@GetMapping("/user")
	public String checkUser(@RequestParam ("username") String name,@RequestParam ("pass")  int pass) {
		if(name.equals("jana")  && pass==1255) {
			return "you have Loggedin";
		}
		else {
			return "failed";
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}

