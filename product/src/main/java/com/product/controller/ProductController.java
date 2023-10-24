package com.product.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.customexception.NameNotValidException;
import com.product.entity.Product;
import com.product.service.ProductService;


@RestController
public class ProductController {
	static Logger log=Logger.getLogger(ProductController.class);
	@Autowired
	ProductService ps;
	
	@PostMapping(path = "/setallvalue")

	public String setData(@RequestBody List<Product> a)throws NameNotValidException  {
		
		return ps.setData(a);
	}
	
	
	@PostMapping(path = "/setontvalue")

	public String setOneData(@RequestBody Product a) throws NameNotValidException {
		PropertyConfigurator.configure("log4j.properties");
		log.info(ps.setOneData(a));
		
		return ps.setOneData(a);
	}


	
	@GetMapping(path="/getall")
	public List<Product> getall() {
		
		PropertyConfigurator.configure("log4j.properties");
		log.info(ps.getall());
		return ps.getall();
	}
	
	
	
	
	@GetMapping(path="getproductbyname/{x}")
	public List<Product> getproducts(@PathVariable String x){
		
		return ps.getproducts(x);
		
	}
	
	@GetMapping(path="getproductbyrange/{x}/{y}")
	public List<Product> getproductsByRange(@PathVariable int x,@PathVariable int y){
		
		return ps.getproductsByRange(x,y);
		
	}
	
	@GetMapping(path="getname")
	public String getname() {
		return "Hello World";
		}
	
	
	@GetMapping(path="getnumber/{x}/{y}")
	public int getname(@PathVariable int x,@PathVariable int y) {
		return x+y;
		}
	
	
	
	
	
	
	


}
